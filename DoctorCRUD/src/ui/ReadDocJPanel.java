/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DoctorList;
import model.Doctor;
/**
 *
 * @author harshinichandrika
 */
public class ReadDocJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReadDocJPanel
     */
    DoctorList doctr;
    public ReadDocJPanel() {
        initComponents();
        this.doctr=doctr;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnViewDoc = new javax.swing.JButton();
        lblDocID = new javax.swing.JLabel();
        lblHospID = new javax.swing.JLabel();
        txtDocName = new javax.swing.JTextField();
        txtDocID = new javax.swing.JTextField();
        txtHospID = new javax.swing.JTextField();
        lblDocName = new javax.swing.JLabel();
        lblViewDoctor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoc = new javax.swing.JTable();
        btnDeleteDoc = new javax.swing.JButton();
        lblDocHospUN = new javax.swing.JLabel();
        txtDocUN = new javax.swing.JTextField();
        lblDocPass = new javax.swing.JLabel();
        txtDocPass = new javax.swing.JTextField();

        btnViewDoc.setText("View");
        btnViewDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDocActionPerformed(evt);
            }
        });

        lblDocID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDocID.setText("Doctor ID :");

        lblHospID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHospID.setText("Hospital ID :");

        lblDocName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDocName.setText("Doctor Name :");

        lblViewDoctor.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblViewDoctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewDoctor.setText("View Doctor Details");

        tblDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor Name", "Doctor ID", "Hospital ID"
            }
        ));
        jScrollPane1.setViewportView(tblDoc);

        btnDeleteDoc.setText("Delete");
        btnDeleteDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDocActionPerformed(evt);
            }
        });

        lblDocHospUN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDocHospUN.setText("Doctor Username :");

        lblDocPass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDocPass.setText("Doctor Password :");

        txtDocPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnViewDoc)
                        .addGap(72, 72, 72)
                        .addComponent(btnDeleteDoc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDocID)
                    .addComponent(lblDocName)
                    .addComponent(lblHospID))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDocName)
                    .addComponent(txtDocID)
                    .addComponent(txtHospID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDocPass)
                    .addComponent(lblDocHospUN))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDocUN, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocPass, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(212, 212, 212)
                    .addComponent(lblViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnViewDoc)
                            .addComponent(btnDeleteDoc))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDocName)
                            .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDocID)
                            .addComponent(txtDocID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDocHospUN)
                            .addComponent(txtDocUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDocPass)
                            .addComponent(txtDocPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHospID))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(312, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDocActionPerformed
        // TODO add your handling code here:
        if(doctr!=null){
            int selectedRowIndex = tblDoc.getSelectedRow();
            if(selectedRowIndex<0){
                JOptionPane.showMessageDialog(this,"Please select a row to delete.");
                return;
            }
            DefaultTableModel model= (DefaultTableModel) tblDoc.getModel();
            Doctor selectedDoctor = (Doctor) model.getValueAt(selectedRowIndex, 0);
            txtDocName.setText(selectedDoctor.getDocName());
            txtDocID.setText(String.valueOf(selectedDoctor.getDocID()));
            txtHospID.setText(selectedDoctor.getHospID());
            txtDocUN.setText(String.valueOf(selectedDoctor.getDocUsername()));
            txtDocPass.setText(selectedDoctor.getDocPass());
        }
        else{
            JOptionPane.showMessageDialog(this,"Row empty.");
        }
    }//GEN-LAST:event_btnViewDocActionPerformed

    private void btnDeleteDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDocActionPerformed
        // TODO add your handling code here:
        if(doctr!=null){
            int selectedRowIndex = tblDoc.getSelectedRow();
            if(selectedRowIndex<0){
                JOptionPane.showMessageDialog(this,"Please select a row to delete.");
                return;
            }
            DefaultTableModel model= (DefaultTableModel) tblDoc.getModel();
            Doctor selectedDoctor = (Doctor) model.getValueAt(selectedRowIndex, 0);
            doctr.deleteDoc(selectedDoctor);
            JOptionPane.showMessageDialog(this, "Doctor deleted");
            populateTable();
        }
        else{
            JOptionPane.showMessageDialog(this,"Row empty.");
        }
    }//GEN-LAST:event_btnDeleteDocActionPerformed

    private void txtDocPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocPassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteDoc;
    private javax.swing.JButton btnViewDoc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDocHospUN;
    private javax.swing.JLabel lblDocID;
    private javax.swing.JLabel lblDocName;
    private javax.swing.JLabel lblDocPass;
    private javax.swing.JLabel lblHospID;
    private javax.swing.JLabel lblViewDoctor;
    private javax.swing.JTable tblDoc;
    private javax.swing.JTextField txtDocID;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtDocPass;
    private javax.swing.JTextField txtDocUN;
    private javax.swing.JTextField txtHospID;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
        DefaultTableModel model= (DefaultTableModel) tblDoc.getModel();
        model.setRowCount(0);
        
        for(Doctor dr : doctr.getDoctr()){
            Object[] row = new Object[5];
            row[0] = dr;
            row[1] = dr.getDocID();
            row[2] = dr.getHospID();
            row[3] = dr.getDocUsername();
            row[4] = dr.getDocPass();
            model.addRow(row);
        }
    }
}
