/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PoliceDepartment;

import crimepatrolfinalproject.Login;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Location;
import utilPackage.GenerateId;
import utilPackage.Helper;
import utilPackage.SendNotification;

/**
 *
 * @author sahilpadyal
 */
public class CasePortalCaptain extends javax.swing.JFrame {

    /**
     * Creates new form Case
     */
    
    Integer currentCaseId;
    
    public CasePortalCaptain() {
        initComponents();
        try {
          
            List<Case> objList = Helper.getResultSet(Case.class, "case");
            
            for(Case i : objList){
                Integer iD = i.getCaseId(); 
                Integer precinctId = i.getPrecinctId();
                Integer policeId = i.getPoliceId(); 
                Integer lawyerId = i.getLawyerId(); 
                Integer detectiveId = i.getDetectiveId();
                String caseStatus = i.getCaseStatus(); 
                String description = i.getDescription(); 
                String date = i.getDateTime().toString();
                Integer locationId = i.getLocationid();
                DefaultTableModel tblModel = (DefaultTableModel)jCaseMasterTable.getModel();
                Object[] obj = {iD, date, precinctId, policeId, lawyerId, detectiveId, caseStatus, description, locationId};
                tblModel.addRow(obj);                   
            }
            
        } catch (InstantiationException ex) {
            Logger.getLogger(CasePortalCaptain.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPrecinctId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLawyerId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCaseStatus = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jDescription = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDetectiveId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jUpdateButton = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jCaseMasterTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPoliceId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLocation = new javax.swing.JTextField();
        jDate = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jCaseType = new javax.swing.JComboBox<>();
        searchTxt = new javax.swing.JTextField();
        searchByOptions = new javax.swing.JComboBox<>();
        searchCaseBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Case Records");

        jButton6.setText("LogOut");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel3.setText("Precinct ID");

        jPrecinctId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrecinctIdActionPerformed(evt);
            }
        });

        jLabel4.setText("Date");

        jLabel5.setText("Case Status");

        jCaseStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Open", "Closed" }));
        jCaseStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCaseStatusActionPerformed(evt);
            }
        });

        jLabel6.setText("Description");

        jDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDescriptionActionPerformed(evt);
            }
        });

        jLabel7.setText("Lawyer ID");

        jLabel8.setText("Detective ID");

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jUpdateButton.setText("Update");
        jUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateButtonActionPerformed(evt);
            }
        });

        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jButton4.setText("Reset");

        jCaseMasterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Case ID", "Date", "Precinct ID", "Police ID", "Lawyer ID", "Detective ID", "Case Status", "Description", "Location ID"
            }
        ));
        jCaseMasterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCaseMasterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jCaseMasterTable);

        jLabel9.setText("Police ID");

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel10.setText("Search By");

        jButton7.setText("View Evidence");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel11.setText("Location ID");

        jLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLocationActionPerformed(evt);
            }
        });

        jLabel12.setText("Case Type");

        jCaseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Police", "Fire", "Medical" }));
        jCaseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCaseTypeActionPerformed(evt);
            }
        });

        searchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtActionPerformed(evt);
            }
        });

        searchByOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Case ID", "Precinct ID", "Police ID", "Lawyer ID", "Detective ID", "Case Status", "Description", "Location ID" }));
        searchByOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByOptionsActionPerformed(evt);
            }
        });

        searchCaseBtn.setText("SEARCH");
        searchCaseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchCaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCaseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel3))
                                            .addGap(6, 6, 6))
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel11))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDetectiveId, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPoliceId, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPrecinctId, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLawyerId, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCaseStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jCaseType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jUpdateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchByOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchCaseBtn)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jPrecinctId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jPoliceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLawyerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jDetectiveId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jCaseStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jCaseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jUpdateButton)
                    .addComponent(jDelete)
                    .addComponent(jButton4)
                    .addComponent(jButton7))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(searchByOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchCaseBtn)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int precinctId = Integer.parseInt(jPrecinctId.getText()); 
        int policeId = Integer.parseInt(jPoliceId.getText());
        Integer lawyerId = null;
        Integer detectiveId = null;
        
        if(!jLawyerId.getText().equals("")) {
            lawyerId = Integer.parseInt(jLawyerId.getText());
        }
        
        if(!jDetectiveId.getText().equals("")) {
            detectiveId = Integer.parseInt(jDetectiveId.getText());
        }
       
        
        String caseStatus = jCaseStatus.getSelectedItem().toString();
        String caseType = jCaseType.getSelectedItem().toString();
        Date dateOfCase = jDate.getDate();
        String description = jDescription.getText();
        int location = Integer.parseInt(jLocation.getText());
        
        Integer caseId = null;
        try {
            caseId = Helper.getMaxId("case", "case_id", null);
        } catch (SQLException ex) {
            Logger.getLogger(CasePortalCaptain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
        DefaultTableModel tblModel = (DefaultTableModel)jCaseMasterTable.getModel();
        Object[] obj = {caseId, dateOfCase, precinctId, policeId, lawyerId, detectiveId, caseStatus, description, location};
        tblModel.addRow(obj);
       
        Location loc = null;
        try { 
            
            loc = Helper.fetchLocation(location);
            Precinct pre = Helper.fetchPrecinct(precinctId);
            Case cas = new Case(caseId, description, loc, pre, policeId, lawyerId, caseType, dateOfCase, caseStatus, detectiveId);
            cas.addToCaseTable(cas);
            
        } catch (SQLException ex) {
            Logger.getLogger(CasePortalCaptain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(caseType.equals("Medical")) {
            
            String emailBody = "MEDICAL ATTENTION NEEDED AT coordinates" + loc.getLatitude() + "," + loc.getLongtude();
            SendNotification.sendEmailNotification("NEW MEDICAL CASE", emailBody, "snehil.aryan7823@gmail.com");
            //snehil.aryan7823@gmail.com
            System.out.println("Notification Sent to");
            
        }
    

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPrecinctIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrecinctIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrecinctIdActionPerformed

    private void jLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLocationActionPerformed

    private void jCaseStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCaseStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCaseStatusActionPerformed

    private void jUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateButtonActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)jCaseMasterTable.getModel();
        
        
        if (jCaseMasterTable.getSelectedRowCount() == 1){
            
            Integer caseId = Integer.valueOf(tblModel.getValueAt(jCaseMasterTable.getSelectedRow(), 0).toString()); 
            Integer precinctId = Integer.valueOf(jPrecinctId.getText()); 
            Integer policeId = Integer.valueOf(jPoliceId.getText()); 
            Integer lawyerId = Integer.valueOf(jLawyerId.getText()); 
            Integer detectiveId = Integer.valueOf(jDetectiveId.getText()); 
            String description = jDescription.getText(); 
            String caseStatus = (String) jCaseStatus.getSelectedItem();
           
            System.out.println(description);
            System.out.println(caseId);
            
            tblModel.setValueAt(precinctId, jCaseMasterTable.getSelectedRow(), 2);
            tblModel.setValueAt(policeId, jCaseMasterTable.getSelectedRow(), 3);
            tblModel.setValueAt(lawyerId, jCaseMasterTable.getSelectedRow(), 4);
            tblModel.setValueAt(detectiveId, jCaseMasterTable.getSelectedRow(), 5);
            tblModel.setValueAt(caseStatus, jCaseMasterTable.getSelectedRow(), 6);
            tblModel.setValueAt(description, jCaseMasterTable.getSelectedRow(), 7);
            
            Map<String, String> mp = new HashMap<>();
            mp.put("description", description);
            mp.put("lawyerid", String.valueOf(lawyerId));
            mp.put("precinct_id", String.valueOf(precinctId));
            mp.put("police_id", String.valueOf(policeId));
            mp.put("casestatus", caseStatus);
            mp.put("detective_id", String.valueOf(detectiveId));
            
            try {
                Helper.updateColumns("case", mp, "case_id = " + caseId);
            } 
            
            catch (SQLException ex) {
                System.out.println("Failed");
                Logger.getLogger(CasePortalCaptain.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            tblModel.setRowCount(0);
            
            try {
            List<Case> objList = Helper.getResultSet(Case.class, "case");
            
            for(Case i : objList){
                Integer id = i.getCaseId(); 
                Integer objPrecinctId = i.getPrecinctId();
                Integer objPoliceId = i.getPoliceId(); 
                Integer objLawyerId = i.getLawyerId(); 
                Integer objDetectiveId = i.getDetectiveId();
                String objCaseStatus = i.getCaseStatus(); 
                String objDesc = i.getDescription(); 
                String objDate = i.getDateTime().toString();
                Object[] obj = {id, objDate, objPrecinctId, objPoliceId, objLawyerId, objDetectiveId, objCaseStatus, objDesc};
                tblModel.addRow(obj);                   
            }
            
        } catch (InstantiationException ex) {
            Logger.getLogger(CasePortalCaptain.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        }
        
        
        
    }//GEN-LAST:event_jUpdateButtonActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)jCaseMasterTable.getModel();
        if (jCaseMasterTable.getSelectedRowCount() == 1){
            Integer caseId = Integer.valueOf(tblModel.getValueAt(jCaseMasterTable.getSelectedRow(), 0).toString());
            currentCaseId = caseId;
            EvidencePortal evidencePortal = new EvidencePortal(currentCaseId);
            evidencePortal.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Login obj = new Login(); 
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jCaseMasterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCaseMasterTableMouseClicked
        
        DefaultTableModel tblModel = (DefaultTableModel)jCaseMasterTable.getModel();
        int caseIdUpdate = Integer.parseInt(tblModel.getValueAt(jCaseMasterTable.getSelectedRow(), 0).toString());

        
        if(jCaseMasterTable.getSelectedRowCount() == 1){
            
            String dt = tblModel.getValueAt(jCaseMasterTable.getSelectedRow(), 1).toString();
            SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
            Date date = null;
            try {
                date = formatter.parse(dt);
            } catch (ParseException ex) {
                Logger.getLogger(CasePortalCaptain.class.getName()).log(Level.SEVERE, null, ex);
            }
            jDate.setDate(date);
            jPrecinctId.setText(tblModel.getValueAt(jCaseMasterTable.getSelectedRow(), 2).toString());
            jPoliceId.setText(tblModel.getValueAt(jCaseMasterTable.getSelectedRow(), 3).toString());
            
            if(tblModel.getValueAt(jCaseMasterTable.getSelectedRow(), 4) != null) {
               jLawyerId.setText(tblModel.getValueAt(jCaseMasterTable.getSelectedRow(), 4).toString()); 
            } else {
                jLawyerId.setText("");
            }
            if(tblModel.getValueAt(jCaseMasterTable.getSelectedRow(), 5) != null) {
               jDetectiveId.setText(tblModel.getValueAt(jCaseMasterTable.getSelectedRow(), 5).toString());
            } else {
                jDetectiveId.setText("");
            }
            //jCaseStatus.setText(tblModel.getValueAt(jCaseMasterTable.getSelectedRow(), 6).toString()); 
            jDescription.setText(tblModel.getValueAt(jCaseMasterTable.getSelectedRow(), 7).toString()); 
            jLocation.setText(tblModel.getValueAt(jCaseMasterTable.getSelectedRow(), 8).toString());
            
            
        }
    }//GEN-LAST:event_jCaseMasterTableMouseClicked
    
    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        
        DefaultTableModel tblModel = (DefaultTableModel)jCaseMasterTable.getModel();
        if(jCaseMasterTable.getSelectedRowCount() == 1){
            
            Integer caseId = Integer.valueOf(tblModel.getValueAt(jCaseMasterTable.getSelectedRow(), 0).toString()); 
            
            
            tblModel.removeRow(jCaseMasterTable.getSelectedRow());
            
            Helper.insertDeleteData("delete from case where case_id = " + caseId);
            
          }
        
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDescriptionActionPerformed

    private void searchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtActionPerformed

    private void searchByOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByOptionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByOptionsActionPerformed

    private void searchCaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCaseBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) jCaseMasterTable.getModel();
        String searchString = searchTxt.getText();
        String searchField = (String) searchByOptions.getSelectedItem();

        int tblHeaderIndex = 1;

        switch(searchField) {
            case "Case ID":
            tblHeaderIndex = 0;
            break;
            case "Precinct Id":
            tblHeaderIndex = 2;
            break;
            case "Police ID":
            tblHeaderIndex = 3;
            break;
            case "Lawyer ID":
            tblHeaderIndex = 4;
            break;
            case "Detective ID":
            tblHeaderIndex = 5;
            break;
            case "Case Status":
            tblHeaderIndex = 6;
            break;
            case "Description":
            tblHeaderIndex = 7;
            break;
            case "Location ID":
            tblHeaderIndex = 8;
            break;
            default:
            tblHeaderIndex = 0;
        }

        TableRowSorter<DefaultTableModel> tSorter = new TableRowSorter(tblModel);
        jCaseMasterTable.setRowSorter(tSorter);
        tSorter.setRowFilter(RowFilter.regexFilter(searchString.trim(), tblHeaderIndex));

    }//GEN-LAST:event_searchCaseBtnActionPerformed

    private void jCaseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCaseTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCaseTypeActionPerformed

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
            java.util.logging.Logger.getLogger(CasePortalCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CasePortalCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CasePortalCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CasePortalCaptain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CasePortalCaptain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JTable jCaseMasterTable;
    private javax.swing.JComboBox<String> jCaseStatus;
    private javax.swing.JComboBox<String> jCaseType;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JButton jDelete;
    private javax.swing.JTextField jDescription;
    private javax.swing.JTextField jDetectiveId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLawyerId;
    private javax.swing.JTextField jLocation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPoliceId;
    private javax.swing.JTextField jPrecinctId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jUpdateButton;
    private javax.swing.JComboBox<String> searchByOptions;
    private javax.swing.JButton searchCaseBtn;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables
}
