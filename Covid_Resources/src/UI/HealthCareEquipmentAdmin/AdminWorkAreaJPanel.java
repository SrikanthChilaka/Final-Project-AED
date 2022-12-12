/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HealthCareEquipmentAdmin;

import Model.EnterPrise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author srikanthchilaka
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
 JPanel uppercontainer;
 EnterPrise enter;
    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public AdminWorkAreaJPanel(JPanel uppercontainer, EnterPrise enter ) {
        initComponents();
this.uppercontainer = uppercontainer;
this.enter = enter;
jvaluelabel1.setText(enter.getOrgName());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Headerlabel1 = new javax.swing.JLabel();
        jenterpriselabel1 = new javax.swing.JLabel();
        jvaluelabel1 = new javax.swing.JLabel();
        OrgManageButton = new javax.swing.JButton();
        ManageEmployeeButton = new javax.swing.JButton();
        ManageUserButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        Headerlabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Headerlabel1.setForeground(new java.awt.Color(0, 51, 153));
        Headerlabel1.setText("MY Work Area - Administrative Role");

        jenterpriselabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jenterpriselabel1.setText("Enterprise : ");

        jvaluelabel1.setText("<Value>");

        OrgManageButton.setBackground(new java.awt.Color(0, 51, 153));
        OrgManageButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OrgManageButton.setForeground(new java.awt.Color(255, 255, 255));
        OrgManageButton.setText("Manage Organization");
        OrgManageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrgManageButtonActionPerformed(evt);
            }
        });

        ManageEmployeeButton.setBackground(new java.awt.Color(0, 51, 153));
        ManageEmployeeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ManageEmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageEmployeeButton.setText("Manage Employee");
        ManageEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageEmployeeButtonActionPerformed(evt);
            }
        });

        ManageUserButton.setBackground(new java.awt.Color(0, 51, 153));
        ManageUserButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ManageUserButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageUserButton.setText("Manage User");
        ManageUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(Headerlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ManageUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrgManageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jenterpriselabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jvaluelabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(Headerlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenterpriselabel1)
                    .addComponent(jvaluelabel1))
                .addGap(35, 35, 35)
                .addComponent(OrgManageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(ManageEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(ManageUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(463, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void OrgManageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrgManageButtonActionPerformed
        ManageOrganizationJPanel manageOrgJPanel = new ManageOrganizationJPanel(uppercontainer, enter.getOrgaDirectory());
        uppercontainer.add("manageOrgJPanel", manageOrgJPanel);
        CardLayout layout = (CardLayout) uppercontainer.getLayout();
        layout.next(uppercontainer);
    }//GEN-LAST:event_OrgManageButtonActionPerformed

    private void ManageEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageEmployeeButtonActionPerformed
        // TODO add your handling code here:
         ManageEmployeeJPanel manageemployeeJPanel = new ManageEmployeeJPanel(uppercontainer, enter.getOrgaDirectory());
         uppercontainer.add("manageemployeeJPanel",manageemployeeJPanel );
        CardLayout layout = (CardLayout) uppercontainer.getLayout();
        layout.next(uppercontainer);
    }//GEN-LAST:event_ManageEmployeeButtonActionPerformed

    private void ManageUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageUserButtonActionPerformed
        // TODO add your handling code here:
ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(uppercontainer, enter);
         uppercontainer.add("ManageUserAccountJPanel",muajp );
        CardLayout layout = (CardLayout) uppercontainer.getLayout();
        layout.next(uppercontainer);
    }//GEN-LAST:event_ManageUserButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Headerlabel1;
    private javax.swing.JButton ManageEmployeeButton;
    private javax.swing.JButton ManageUserButton;
    private javax.swing.JButton OrgManageButton;
    private javax.swing.JLabel jenterpriselabel1;
    private javax.swing.JLabel jvaluelabel1;
    // End of variables declaration//GEN-END:variables
}
