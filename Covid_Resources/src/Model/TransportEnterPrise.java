/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harshinichandrika
 */
public class TransportEnterPrise extends EnterPrise {
    
    public TransportEnterPrise(String Name){

super(Name, EnterPrise.EntType.Logistics);

}
//@Override get SupportedRole()
public ArrayList<Role> getRole(){


return null;

}






}
