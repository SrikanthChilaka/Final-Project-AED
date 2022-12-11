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
import Model.Organization.Organization_Doctor;
import UI.Doctor.Doctor_WorkArea;

/**
 *
 * @author srikanthchilaka
 */
public class Role_Doctor  extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, EnterPrise enterprise, EcoSystem business, Network network) {
        return new Doctor_WorkArea(userProcessContainer,account, (Organization_Doctor)organization,enterprise,business,network);
    }
    
    
    
    @Override
    public String toString() {
        return "Doctor Role";
    }
}
