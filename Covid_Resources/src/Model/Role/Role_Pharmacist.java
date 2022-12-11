/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import Model.Account;
import Model.EcoSystem;
import Model.EnterPrise;
import javax.swing.JPanel;
import Model.Network;
import Model.Organization.Organization;
import Model.Organization.Organization_Pharmacy;
import UI.Role_Pharmacy.WorkAreaPanel_Pharmacy;

/**
 *
 * @author srikanthchilaka
 */
public class Role_Pharmacist extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, EnterPrise enterprise, EcoSystem business,Network network) {
        return new WorkAreaPanel_Pharmacy(userProcessContainer, account, enterprise, (Organization_Pharmacy)organization,network);
        //return new PharmaManagementJPanel();
    }

    @Override
    public String toString() {
        return "Pharnacist Role";
    }
}
