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
public class WholesaleEnterPrise extends EnterPrise {
    
  public WholesaleEnterPrise(String name){

super(name,EnterPrise.EntType.Supplier);

}

//override
@Override
public ArrayList<Role> getRole(){

return null;

}



















}
