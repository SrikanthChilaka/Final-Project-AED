/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import javax.swing.JPanel;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.Organization;
import Model.Organization.PharmacyOrganization;
import Model.UserAccount.UserAccount;


/**
 *
 * @author venkat
 */
public class PharmacistRole extends Role {
    @Override
public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
return new PharmaWorkAreaJPanel(userProcessContainer, account, enterprise, (PharmacyOrganization)organization,network);
//return new PharmaManagementJPanel();
}

@Override
public String toString() {
    return "Pharnacist Role";
}
}

