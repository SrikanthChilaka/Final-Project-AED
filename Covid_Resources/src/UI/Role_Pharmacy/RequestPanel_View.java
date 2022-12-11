/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Role_Pharmacy;

import Model.Account;
import Model.EcoSystem;
import Model.EnterPrise;
import Model.Organization.Organization;
import Model.WorkQueue.SupplierWorkRequest;
import Model.WorkQueue.WorkRequest;
import Model.WorkQueue.OperationsWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harshinichandrika
 */
public class RequestPanel_View extends javax.swing.JPanel {
    
    private EnterPrise enterprise;
    private JPanel panel;
    private EcoSystem eco;
    private Account acc;
    private Organization organization;
    private OperationsWorkRequest operationWorkRequest;

    /**
     * Creates new form RequestPanel_View
     */
    public RequestPanel_View(JPanel panel, Account acc, EnterPrise enterprise, Organization orgz) {
        initComponents();
        this.organization= orgz;
        this.panel=panel;
        this.acc=acc;
        this.enterprise=enterprise;
        fillRows();
    }
    
    public void fillRows() {
        DefaultTableModel o = (DefaultTableModel) tblReq.getModel();
        o.setRowCount(0);
        o.setRowCount(0);
        for (WorkRequest wr : acc.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = ((SupplierWorkRequest) wr).getMedicationName();
            row[1] = ((SupplierWorkRequest) wr).getQuantity();
            row[2] = wr.getReceiver().getUsrnm();
            String s = ((SupplierWorkRequest) wr).getStatus();
            row[3] = s == null ? "Waiting" : s;
            if (((SupplierWorkRequest) wr).getDeliveryTime() == null) {
                row[4] = "Details yet to be updated by supplier";
            } else {
                row[4] = "Expected delivery time " + ((SupplierWorkRequest) wr).getDeliveryTime();
            }
            o.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        tblReq = new javax.swing.JTable();
        lblHeader = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));

        tblReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE NAME", "URGENCY LEVEL", "RECIEVER", "STATUS", "DELIVERY DATE"
            }
        ));
        scrollPane.setViewportView(tblReq);

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(0, 51, 153));
        lblHeader.setText("VIEW REQUESTS");

        btnBack.setBackground(new java.awt.Color(0, 51, 153));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(0, 51, 153));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(lblHeader))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(480, 480, 480)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(384, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(308, 308, 308))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblHeader)
                .addGap(12, 12, 12)
                .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        panel.remove(this);
        Component[] ca = panel.getComponents();
        Component c = ca[ca.length - 1];
        WorkAreaPanel_Pharmacy wap = (WorkAreaPanel_Pharmacy) c;
        wap.arrangeRows();
        CardLayout cd = (CardLayout) panel.getLayout();
        cd.previous(panel);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblReq;
    // End of variables declaration//GEN-END:variables
}
