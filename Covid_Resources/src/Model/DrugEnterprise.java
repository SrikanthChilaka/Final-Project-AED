/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Role.Role;
import Model.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author harshinichandrika
 */
public class DrugEnterprise extends EnterPrise {
    
private WorkQueue equiptaskqueue;

public DrugEnterprise(String name){

super(name,EnterPrise.EntType.Pharmacy);
equiptaskqueue = new WorkQueue();

}
// override 
@Override
public ArrayList<Role> getRole(){


return null;
}


















}
