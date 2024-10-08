/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HealthCareEquipmentAdmin;

import Model.Organization.RepositoryOrganization;
import Model.Organization.Organization;
import Model.Organization.Organization.OrganizationType;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srikanthchilaka
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

private RepositoryOrganization Direc_org;
private JPanel uppercontainer;



    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel uppercontainer,RepositoryOrganization Direc_org ) {
        initComponents();
        this.uppercontainer = uppercontainer;
        this.Direc_org = Direc_org;
        populateTable();
        populateCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jlabel2 = new javax.swing.JTable();
        jorglabel1 = new javax.swing.JLabel();
        cmbboxitem = new javax.swing.JComboBox();
        buttonback = new javax.swing.JButton();
        btnOrgadd = new javax.swing.JButton();
        headlabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));

        jlabel2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jlabel2);

        jorglabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jorglabel1.setText("Organization Type :");

        cmbboxitem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbboxitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbboxitemActionPerformed(evt);
            }
        });

        buttonback.setBackground(new java.awt.Color(0, 51, 153));
        buttonback.setForeground(new java.awt.Color(255, 255, 255));
        buttonback.setText("<<Back");
        buttonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbackActionPerformed(evt);
            }
        });

        btnOrgadd.setBackground(new java.awt.Color(0, 51, 153));
        btnOrgadd.setForeground(new java.awt.Color(255, 255, 255));
        btnOrgadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/R.png"))); // NOI18N
        btnOrgadd.setText("Add Organization");
        btnOrgadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrgaddActionPerformed(evt);
            }
        });

        headlabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        headlabel1.setForeground(new java.awt.Color(0, 51, 153));
        headlabel1.setText("Manage Organization");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jorglabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(cmbboxitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(buttonback, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnOrgadd))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(headlabel1)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(headlabel1)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jorglabel1)
                    .addComponent(cmbboxitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonback)
                    .addComponent(btnOrgadd))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbboxitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbboxitemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbboxitemActionPerformed

    private void buttonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbackActionPerformed
        uppercontainer.remove(this);
        CardLayout crd = (CardLayout) uppercontainer.getLayout();
        crd.previous(uppercontainer);
    }//GEN-LAST:event_buttonbackActionPerformed

    private void btnOrgaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrgaddActionPerformed

        OrganizationType orgType = (OrganizationType) cmbboxitem.getSelectedItem();
        Direc_org.addOrg(orgType);
        populateTable();
        
    }//GEN-LAST:event_btnOrgaddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrgadd;
    private javax.swing.JButton buttonback;
    private javax.swing.JComboBox cmbboxitem;
    private javax.swing.JLabel headlabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jlabel2;
    private javax.swing.JLabel jorglabel1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    DefaultTableModel model = (DefaultTableModel) jlabel2.getModel();
    model.setRowCount(0);
    for (Organization organization : Direc_org.getOrganizations()){
        Object[] row = new Object[2];
        row[0] = organization.getOrgId();
        row[1] = organization.getOrgName();
        model.addRow(row);
        
    }
    }

    private void populateCombo() {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        cmbboxitem.removeAllItems();
for (OrganizationType orgType : Organization.OrganizationType.values()){
    if(!orgType.getValue().equals(OrganizationType.Admin.getValue()))
        cmbboxitem.addItem(orgType);
}
    }



    }

