/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Design;

import Model.Account;
import Model.EcoSystem;
import Model.Employee;
import Model.Role.Role_SystemAdmin;
//mport Code.UsrAcc.UsrAccnt;

/**
 *
 * @author harshinichandrika
 */
public class ConfigureASystem {


    public static EcoSystem configure() {

        EcoSystem eco = EcoSystem.getReferrence();
        Employee emp = eco.getEmpDir().AddEmployee("NEU");
        // UsrAccnt ua = eco.getUserAccDir().createUserAccount("sps","sps", emp, new Role_SystemAdmin());
        Account ac = eco.getUserAccDir().createUserAccount("sps", "sps", emp, new Role_SystemAdmin());

        return eco;

    }
    
}
