#ifndef DATOS_H
#define DATOS_H
#include <vector>
#include <iostream>
using namespace std;
class Datos {
    private:
	vector <string> maquinasInfo;
	vector <string> config;
   
    public:
        Datos(){
            maquinasInfo.push_back("tomcat;192.168.0.1;13115392;l;ubuntu;14.04_x64");
            maquinasInfo.push_back("postgres;192.168.0.10;20996096;w;win8");
            maquinasInfo.push_back("mysql;192.168.0.2;10502144;l;CentosOS;6.6_x64");
            maquinasInfo.push_back("sqlserver;192.168.0.4;7897088;w;win7");
            maquinasInfo.push_back("jboss;192.168.0.9;15732736;l;ubuntu;10_x64");
            maquinasInfo.push_back("glassfish;192.168.0.12;10518528;l;ubuntu;14.02_x86");                   
            
            config.push_back("tomcat-mysql-glassfish,all");
            config.push_back("postgres-jboss,Linux");
        } 
        
        char * devolver_maquina(int n){
            return (char *)maquinasInfo[n].c_str();
        } 
        int devolver_cantidad_maquinas(){ return maquinasInfo.size(); 
                                        }

        char * devolver_configuracion(int n){
            return (char *)config[n].c_str();
        } 
        int devolver_cantidad_configuraciones(){ return config.size(); 
                                               }                               
};


#endif


