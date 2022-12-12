/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author harshinichandrika
 */
public class Network {

   private EnterpriseRepo enterpriseRepo;
   private String Network_name;
    
  

public Network(){
  enterpriseRepo = new EnterpriseRepo();

}

    public String getNetwork_name() {
        return Network_name;
    }

    public void setNetwork_name(String Network_name) {
        this.Network_name = Network_name;
    }

    public EnterpriseRepo getEnterpriseRepo() {
        return enterpriseRepo;
    }

    public void setEnterpriseRepo(EnterpriseRepo enterpriseRepo) {
        this.enterpriseRepo = enterpriseRepo;
    }

  @Override 
 public String toString(){

 return Network_name;}

}
