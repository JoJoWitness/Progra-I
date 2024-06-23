#include <iostream>

using namespace std;


class MaquinaVirtual{
  private: 
    string hostname;
    string hostIp;
    string system;
    float menSizeInMB;
    float diskSizeInMB;

  public:
    MaquinaVirtual(string hostname, string hostIp, string system, float menSizeInMB, float diskSizeInMB){
      this->hostname = hostname;
      this->hostIp = hostIp;
      this->system = system;
      this->menSizeInMB = menSizeInMB;
      this->diskSizeInMB = diskSizeInMB;
    };

    string getHostname(){
      return hostname;
    }

    string getHostIp(){
      return hostIp;
    }

    string getSystem(){
      return system;
    }

    float getMenSizeInMB(){
      return menSizeInMB;
    }

    float getDiskSizeInMB(){
      return diskSizeInMB/1024;
    }

    virtual void mostrarVangrantConf() = 0;

};

class PlataformaLinux: public MaquinaVirtual{

    string distrib;
    string version;

    public:
    PlataformaLinux(string hostname, string hostIp, string system, float menSizeInMB, float diskSizeInMB, string distrib, string version)
    : MaquinaVirtual(hostname, hostIp, system, menSizeInMB,diskSizeInMB ), distrib(distrib), version(version) {
      this->distrib = distrib;
      this->version = version;
    
    };
  
  public:
    string getDistrib(){
      return distrib;
    }

    string getVersion(){
      return version;
    }


  void mostrarVangrantConf();

};

void PlataformaLinux::mostrarVangrantConf(){
  cout << "config.vm.define :"<<getHostname()<< " do |"<<getHostname()<<"|" << endl;
  cout << "   "<<getHostname()<<".vm.box = '"<< getHostname() << "'" << endl;
  cout << "   "<<getHostname()<<".vm.box_url = 'https://atlas.hashicorp.com/"<< getDistrib()<<"/"<<getVersion()<<"'"<< endl;
  cout << "   "<<getHostname()<<".vm.hostname = '"<< getHostname() << "'" << endl;
  cout << "   "<<getHostname()<<".vm.network 'private_network', ip:'"<< getHostIp() << "'" << endl;
  cout << "   "<<getHostname()<<".vm.provider:virtualbox do |vb|" << endl;
  cout << "       "<<"vb.customize ['modifyvm', :id, '--memory', '"<< getMenSizeInMB() <<"']" << endl;
  cout << "       "<<"vb.customize ['modifyvm', :id, '--cpu', '"<< "1" <<']' << endl;
  cout << "       "<<"vb.customize ['modifyhd', 'disk id', '--resize','"<< getDiskSizeInMB() <<"']" << endl;
  cout << "   "<<"end" << endl;
  cout << endl;
  cout << "   "<<getHostname()<<".vm.provision 'shell', inline =>"<< endl;
  cout << "       "<<"'sudo apg-get update -y && sudo apt-get-upgrade -y'"<< endl;
  cout << "end" << endl;
}

class PlataformaWindows: public MaquinaVirtual{
  string windowsVersion;

  public:
     PlataformaWindows(string hostname, string hostIp,string system,  double menSizeInMB, double diskSizeInMB, string windowsVersion)
    : MaquinaVirtual(hostname, hostIp, system, menSizeInMB, diskSizeInMB), windowsVersion(windowsVersion) {
      this->windowsVersion = windowsVersion;
    }

    string getWindowsVersion(){
      return windowsVersion;
    }
    void mostrarVangrantConf();
};

void PlataformaWindows::mostrarVangrantConf(){
  cout << "config.vm.define :"<<getHostname()<< " do |"<<getHostname()<<"|" << endl;
  cout << "   "<<getHostname()<<".vm.box = '"<< getHostname() << "'" << endl;
  cout << "   "<<getHostname()<<".vm.box_url = 'http://http://aka.ms/vagrant-"<< getWindowsVersion()<<"'"<< endl;
  cout << "   "<<getHostname()<<".vm.hostname = '"<< getHostname() << "'" << endl;
  cout << "   "<<getHostname()<<".vm.network 'private_network', ip:'"<< getHostIp() << "'" << endl;
  cout << "   "<<getHostname()<<".vm.provider:virtualbox do |vb|" << endl;
  cout << "       "<<"vmware.vmx ['mensize']='"<< getMenSizeInMB() <<"'" << endl;
  cout << "       "<<"vmware.vmx ['numvcpus']="<< "'1'"<< endl;
  cout << "       "<<"vdiskmanager = '/vmware-vdiskmanager'" << endl;
  cout << "       "<<"unless File.exists?( '.vagrant/1.vmdk' )"<< endl;
  cout << "           "<<"`#{vdiskmanager} -c -s #{" << getDiskSizeInMB()<< "}GB -a lsilogic -t 1 .vagrant/1.vmdk`"<< endl;
  cout << "   "<<"end" << endl;
  cout << "   "<<"vmware.vmx['scsi0:#{disk}.filename'] = '#{File.dirname(__FILE__)}/.vagrant/1.vmdk'"<<endl;
  cout << "   "<<"vmware.vmx['scsi0:#{disk}.present'] = true"<<endl;
  cout <<"    "<<"end"<<endl;
  cout << "end" << endl;
}


