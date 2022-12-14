/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package crimepatrolfinalproject;

import FireDepartment.FireStationPortal;
import LegalDepartment.LegalDeptAdmin;
import MedicalDepartment.DoctorManagementPortal;
import MedicalDepartment.HospitalPortal;
import PoliceDepartment.PoliceAdminActivity;
import citizenApp.CitizenMenu;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author bashu
 */
public class SysAdminJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form SysAdminJFrame
     */
    public SysAdminJFrame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageHospitalBtn = new javax.swing.JButton();
        manageCommAdminsBtn = new javax.swing.JButton();
        manageFireStationBtn = new javax.swing.JButton();
        managePoliceBtn = new javax.swing.JButton();
        manageHospitalsBtn = new javax.swing.JButton();
        manageEncountersBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        homePageBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageHospitalBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        manageHospitalBtn.setForeground(new java.awt.Color(0, 0, 204));
        manageHospitalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon2/hospitalm.png"))); // NOI18N
        manageHospitalBtn.setText("MANAGE HOSPITALS");
        manageHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHospitalBtnActionPerformed(evt);
            }
        });
        getContentPane().add(manageHospitalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 469, -1, -1));

        manageCommAdminsBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        manageCommAdminsBtn.setForeground(new java.awt.Color(0, 0, 204));
        manageCommAdminsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon2/legal.png"))); // NOI18N
        manageCommAdminsBtn.setText("MANAGE LAWYERS");
        manageCommAdminsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCommAdminsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(manageCommAdminsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 691, 298, -1));

        manageFireStationBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        manageFireStationBtn.setForeground(new java.awt.Color(0, 0, 204));
        manageFireStationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon2/Fire.png"))); // NOI18N
        manageFireStationBtn.setText("MANAGE FIRE STATION");
        manageFireStationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageFireStationBtnActionPerformed(evt);
            }
        });
        getContentPane().add(manageFireStationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 469, -1, -1));

        managePoliceBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        managePoliceBtn.setForeground(new java.awt.Color(0, 0, 204));
        managePoliceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon2/policem.png"))); // NOI18N
        managePoliceBtn.setText("MANAGE POLICE");
        managePoliceBtn.setToolTipText("");
        managePoliceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePoliceBtnActionPerformed(evt);
            }
        });
        getContentPane().add(managePoliceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 469, 298, -1));

        manageHospitalsBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        manageHospitalsBtn.setForeground(new java.awt.Color(0, 0, 204));
        manageHospitalsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon2/citizen.png"))); // NOI18N
        manageHospitalsBtn.setText("MANAGE CITIZENS");
        manageHospitalsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHospitalsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(manageHospitalsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 691, 298, -1));

        manageEncountersBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        manageEncountersBtn.setForeground(new java.awt.Color(0, 0, 204));
        manageEncountersBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon2/doctorm.png"))); // NOI18N
        manageEncountersBtn.setText("MANAGE DOCTORS");
        manageEncountersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEncountersBtnActionPerformed(evt);
            }
        });
        getContentPane().add(manageEncountersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 691, 314, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SYSTEM ADMIN OPERATIONS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 6, -1, -1));

        homePageBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        homePageBtn.setForeground(new java.awt.Color(0, 0, 204));
        homePageBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon2/Home.png"))); // NOI18N
        homePageBtn.setText("HOME");
        homePageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homePageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1015, 0, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon2/police-siren-siren.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 90, 363, 232));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHospitalBtnActionPerformed
        // TODO add your handling code here:
        HospitalPortal hp = new HospitalPortal();
        hp.setVisible(true);
        hp.setExtendedState(JFrame.MAXIMIZED_BOTH );
        dispose();
    }//GEN-LAST:event_manageHospitalBtnActionPerformed

    private void manageHospitalsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHospitalsBtnActionPerformed
        // TODO add your handling code here:
        CitizenMenu cm = new CitizenMenu();
        cm.setVisible(true);
        cm.setExtendedState(JFrame.MAXIMIZED_BOTH );
        dispose();
    }//GEN-LAST:event_manageHospitalsBtnActionPerformed

    private void managePoliceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePoliceBtnActionPerformed
        // TODO add your handling code here:
        PoliceAdminActivity pa = new PoliceAdminActivity();
        pa.setVisible(true);
        pa.setExtendedState(JFrame.MAXIMIZED_BOTH );
        dispose();
    }//GEN-LAST:event_managePoliceBtnActionPerformed

    private void manageFireStationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageFireStationBtnActionPerformed
        // TODO add your handling code here:
        FireStationPortal obj = new FireStationPortal();
        obj.setVisible(true);
        obj.setExtendedState(JFrame.MAXIMIZED_BOTH );
        dispose();
    }//GEN-LAST:event_manageFireStationBtnActionPerformed

    private void manageCommAdminsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCommAdminsBtnActionPerformed
        // TODO add your handling code here:
        LegalDeptAdmin ld = new LegalDeptAdmin();
        ld.setVisible(true);
        ld.setExtendedState(JFrame.MAXIMIZED_BOTH );
        dispose();
    }//GEN-LAST:event_manageCommAdminsBtnActionPerformed

    private void manageEncountersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEncountersBtnActionPerformed
        // TODO add your handling code here:
        DoctorManagementPortal dm = null;
        try {
            dm = new DoctorManagementPortal();
        } catch (SQLException ex) {
            Logger.getLogger(SysAdminJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
        dm.setVisible(true);
        dm.setExtendedState(JFrame.MAXIMIZED_BOTH );
        dispose();
    }//GEN-LAST:event_manageEncountersBtnActionPerformed

    private void homePageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homePageBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SysAdminJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SysAdminJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SysAdminJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SysAdminJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SysAdminJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homePageBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageCommAdminsBtn;
    private javax.swing.JButton manageEncountersBtn;
    private javax.swing.JButton manageFireStationBtn;
    private javax.swing.JButton manageHospitalBtn;
    private javax.swing.JButton manageHospitalsBtn;
    private javax.swing.JButton managePoliceBtn;
    // End of variables declaration//GEN-END:variables
}
