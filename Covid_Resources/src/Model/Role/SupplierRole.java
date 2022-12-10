/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;


/**
 *
 * @author venkat
 */
public class SupplierRole extends Role {

  
    @Override
public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
return new SupplierWorkAreaJPanel(userProcessContainer,business,account,organization);
}

@Override
public String toString() {
    return "Support Role";
}
    
}
