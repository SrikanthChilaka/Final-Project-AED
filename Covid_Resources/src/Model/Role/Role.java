/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import Model.Account;
import Model.EcoSystem;
import Model.EnterPrise;
import Model.Network;
import Model.Organization.Organization;
import javax.swing.JPanel;

/**
 *
 * @author srikanthchilaka
 */
public abstract class Role {
    public enum RoleType{
        Admin("Admin"), 
        Doctor("Doctor"),
        Logistics("Logistics"), 
        Pharmacist("Pharmacist");
        
        private String v;

        private RoleType(String v){
            this.v = v;
            }

        public String getRoleValue() {
            return v;
        }

        public void setRoleValue(String v) {
            this.v = v;
        }
        
        @Override 
        public String toString(){
            return v;
        }
    }
    
    public abstract JPanel createWorkArea (JPanel userProcessContainer, Account account, Organization organization, EnterPrise enterprise, EcoSystem business, Network network);
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
