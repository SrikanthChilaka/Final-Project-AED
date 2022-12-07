/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import javax.swing.JPanel;
import Model.EcoSystem;
import Model.UserAccount.UserAccount;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;


/**
 *
 * @author venkat
 */
public abstract class Role {
public enum RoleType{
        Admin("Admin"), 
        Doctor("Doctor"),
        Logistics("Logistics"), 
        Pharmacist("Pharmacist");
        
        private String value;
        private RoleType(String value){
            this.value = value;
            }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override 
        public String toString(){
            return value;
        }
    }
    
    public abstract JPanel createWorkArea (JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network);
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}

