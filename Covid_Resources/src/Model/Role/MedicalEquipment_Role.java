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
import UI.UserInterface.HCEquipStorage.HealthCareEquipmentWorkAreaJPanel;

/**
 *
 * @author srikanthchilaka
 */
public class MedicalEquipment_Role extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, EnterPrise enterprise, EcoSystem business,Network network) {
        return new HealthCareEquipmentWorkAreaJPanel(userProcessContainer, business, account,  organization,network);
    }


    @Override
    public String toString() {
        return "Medical Equipment Role";
    }
}
