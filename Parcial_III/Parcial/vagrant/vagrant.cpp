#include "../automatizacion/mv.h"
#include "../Datos.h"
#include <string.h>

class VagrantConfig {
   

  public:
    MaquinaVirtual * servidores[6];

    void cargarInfo(){
      Datos datos;
      
      int i;
      int mascaraMen, mascaraDisco;
      int cantidad_de_maquinas = datos.devolver_cantidad_maquinas();

      // mascaraMen = 4095;
      mascaraMen=65520;
      // mascaraDisco = 16320;
      mascaraDisco = 66846720;
      

      for(i = 0; i < cantidad_de_maquinas; i++){
        char* maquina_info = datos.devolver_maquina(i);
        char* token = strtok(maquina_info, ";");
        char* segmentos[6];
        int j =0;
        float men, disc;
      
        
      while(token != NULL){
            segmentos[j] = token;
            token = strtok(NULL, ";");
            j++;
        }

        men = atoi(segmentos[2]) & mascaraMen;
        disc = atoi(segmentos[2]) & mascaraDisco;

        string hostName(segmentos[0]);
        string hostIp(segmentos[1]);
        string system(segmentos[3]);


        if(strcmp(segmentos[3], "l") == 0) {
        
          string distrib(segmentos[4]);
          string version(segmentos[5]);
          servidores[i] = new PlataformaLinux(hostName,hostIp, system, men/16, disc/256,distrib,version);
        } else if (strcmp(segmentos[3], "w") == 0) {
          string version(segmentos[4]); 
          servidores[i] = new PlataformaWindows(hostName,hostIp, system,men/16, disc/256,version);
        }
      
    }
    }

    void imprimirConfiguracion(int index){
      Datos datos;
      int cantidadDeConfiguraciones = datos.devolver_cantidad_configuraciones();
     
      if(index <= cantidadDeConfiguraciones-1){

      
      char* config = datos.devolver_configuracion(index);
      char* token = strtok(config, ",");
      char* token2;
      char* segmentos[2];
     
      int j = 0;
  
      while(token != NULL){
            segmentos[j] = token;
            token = strtok(NULL, ",");
            j++;
        }

        token2 = strtok(segmentos[0], "-");

        if(strcmp(segmentos[1],"all")==0){
                 
          while(token2 != NULL){
            int k = 0;
            
            for(k =0; k < datos.devolver_cantidad_maquinas(); k++){
              if(token2 == servidores[k]->getHostname()){
                servidores[k]->mostrarVangrantConf();
                cout << endl;
              }
            }
            token2 = strtok(NULL, "-");
          }
        }
        else if(strcmp(segmentos[1],"Linux")==0){
          while(token2 != NULL){
            int k = 0;
          
            for(k =0; k < datos.devolver_cantidad_maquinas(); k++){
              if(token2 == servidores[k]->getHostname() && servidores[k]->getSystem() == "l"){
                servidores[k]->mostrarVangrantConf();
                cout << endl;
              }
            }
          
            token2 = strtok(NULL, "-");
          }
        }else if(strcmp(segmentos[1],"Windows")==0){
          while(token2 != NULL){
            int k = 0;
           
            for(k =0; k < datos.devolver_cantidad_maquinas(); k++){
              if(token2 == servidores[k]->getHostname() && servidores[k]->getSystem() == "w"){
                servidores[k]->mostrarVangrantConf();
                cout << endl;
              }
            }
            
            token2 = strtok(NULL, "-");
          }
        }
      }
      else{
        cout << "No existe la configuracion" << endl;
      }
    }

    void imprimirConfiguracionTodas(){
      Datos datos;
     
      int cantidadDeConfiguraciones = datos.devolver_cantidad_configuraciones();
      int i =0;
      for(i =0; i <cantidadDeConfiguraciones; i++){
        cout << "----" << "Configuracion " << i << "----"<< endl;
        cout << endl;
        imprimirConfiguracion(i);
        cout << endl;
        cout << "---------------------------------------" << endl;
        cout << endl;

      }

    }

    void mostrarServidores(){
      Datos datos;
      MaquinaVirtual* servidoresOrdenadosPorRam[6];
      for (int i = 0; i < 6; i++) {
        servidoresOrdenadosPorRam[i] = servidores[i];
      }
      MaquinaVirtual* temp;

       for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6 - i - 1; j++) {
            if (servidoresOrdenadosPorRam[j]->getMenSizeInMB() < servidoresOrdenadosPorRam[j + 1]->getMenSizeInMB() ) {
                temp = servidoresOrdenadosPorRam[j];
                servidoresOrdenadosPorRam[j] = servidoresOrdenadosPorRam[j + 1];
                servidoresOrdenadosPorRam[j + 1] = temp;
            }
        }
    }
    for (int i = 0; i < 6; i++) {
      cout<<endl;
      cout << "Nombre del host: " << servidoresOrdenadosPorRam[i]->getHostname() << endl;
      cout << "Ip: " << servidoresOrdenadosPorRam[i]->getHostIp() << endl;
      cout << "Memoria Ram: " << servidoresOrdenadosPorRam[i]->getMenSizeInMB() << "MB" << endl;
      cout << "Disco duro:" << servidoresOrdenadosPorRam[i]->getDiskSizeInMB() <<"GB"<< endl;
    }
    }

    void espacioTotalDeDisco(){
      Datos datos;
      int memoriaTotal=0;
      int i;
      
      for(i =0; i<datos.devolver_cantidad_maquinas(); i++){
        memoriaTotal += servidores[i]->getDiskSizeInMB();
      }

      cout << "Se requieren: " << memoriaTotal << "GB de memoria libre" << endl;
    }
};

int main(){
  
  VagrantConfig vagrantConfig;
  vagrantConfig.cargarInfo();
  bool bandera = true;


  cout << "       Bienvenido al programado de maquinas virtuales"<< endl;
  cout << endl;
  cout << "A continuacion se le dara una serie de opciones que podra realizar:" << endl;
  cout << "Aclaracion: las configuraciones se empiezan a contar en 0" << endl;
  cout << endl;
  cout << "----------------------------------------------------" << endl;
  cout << endl;
  while(bandera){
    cout << "1. Imprimir configuracion de una maquina" << endl;
    cout << "2. Imprimir todas las configuraciones" << endl;
    cout << "3. Mostrar servidores" << endl;
    cout << "4. Espacio total requerido" << endl;
    cout << "5. Salir" << endl;
    cout << endl;
    cout << "Ingrese una opcion: "<<endl;
    int opcion;
    cin >> opcion;
    switch(opcion){
      case 1:
        cout << "--------Escogio ver una configuracion--------" << endl;
        cout << "Ingrese el numero de la configuracion que desea ver: ";
        int numeroConfiguracion;
        cin >> numeroConfiguracion;
        cout << endl;
        vagrantConfig.imprimirConfiguracion(numeroConfiguracion);
        cout <<endl;
        break;
      case 2:
        cout << "----Escogio ver todas las configuraciones----" << endl;
        cout <<endl;
        vagrantConfig.imprimirConfiguracionTodas();
        cout <<endl;
        break;
      case 3:
      cout << "-------Escogio ver todos los servidores--------" << endl;
        vagrantConfig.mostrarServidores();
        cout <<endl;
        break;
      case 4:
        cout << "-----Escogio ver espacio total requerido-----" << endl;
        vagrantConfig.espacioTotalDeDisco();
        cout <<endl;
        break;
      case 5:
        bandera = false;
        break;
      default:
        cout << "Opcion no valida" << endl;
        break;
    }
  }
 

  return 0;
}