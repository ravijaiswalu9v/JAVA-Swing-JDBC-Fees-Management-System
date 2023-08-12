/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ravi_jaiswal
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form java
     */
    public AdminDashboard() {
        initComponents();
          this.setResizable(false);
        addTitleIcon();
    }
   private void addTitleIcon(){
        ImageIcon icon = new ImageIcon("src/Images/college.png");
        this.setIconImage(icon.getImage());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main2kGradientPanel2 = new keeptoo.KGradientPanel();
        editCourseBtn = new keeptoo.KGradientPanel();
        editBtn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        searchRecBtn = new keeptoo.KGradientPanel();
        searchBtn = new javax.swing.JPanel();
        SearchRecordBtn = new javax.swing.JLabel();
        viewCrseBtn = new keeptoo.KGradientPanel();
        vCourseBtn = new javax.swing.JPanel();
        viewCourseBtn = new javax.swing.JLabel();
        addFeesBtn = new keeptoo.KGradientPanel();
        addBtn = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        viewRecBtn = new keeptoo.KGradientPanel();
        vARBtn = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        viewReportBtn = new keeptoo.KGradientPanel();
        vReportBtn = new javax.swing.JPanel();
        viewReportButton = new javax.swing.JLabel();
        LogoutBtn1 = new keeptoo.KGradientPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        repoLogoLbl = new javax.swing.JLabel();
        repoLogoLbl1 = new javax.swing.JLabel();
        repoLogoLbl2 = new javax.swing.JLabel();
        repoLogoLbl3 = new javax.swing.JLabel();
        repoLogoLbl5 = new javax.swing.JLabel();
        repoLogoLbl6 = new javax.swing.JLabel();
        repoLogoLbl7 = new javax.swing.JLabel();
        repoLogoLbl8 = new javax.swing.JLabel();
        repoLogoLbl9 = new javax.swing.JLabel();
        repoLogoLbl10 = new javax.swing.JLabel();
        repoLogoLbl11 = new javax.swing.JLabel();
        repoLogoLbl12 = new javax.swing.JLabel();
        repoLogoLbl13 = new javax.swing.JLabel();
        viewStudentLbl = new javax.swing.JLabel();
        addStudentLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AdminDashboard......");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main2kGradientPanel2.setkEndColor(new java.awt.Color(121, 25, 255));
        main2kGradientPanel2.setkGradientFocus(1000);
        main2kGradientPanel2.setkStartColor(new java.awt.Color(235, 0, 19));
        main2kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editCourseBtn.setkEndColor(new java.awt.Color(255, 197, 2));
        editCourseBtn.setkGradientFocus(200);
        editCourseBtn.setkStartColor(new java.awt.Color(251, 130, 118));
        editCourseBtn.setPreferredSize(new java.awt.Dimension(900, 80));
        editCourseBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editBtn.setBackground(new java.awt.Color(255, 197, 2));
        editBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBtn.setOpaque(false);
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editBtnMouseExited(evt);
            }
        });
        editCourseBtn.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, 150));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/browser.png"))); // NOI18N
        jLabel7.setText("Edit Course");
        editCourseBtn.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, 220, 130));

        main2kGradientPanel2.add(editCourseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 245, 150));

        searchRecBtn.setBackground(new java.awt.Color(255, 102, 102));
        searchRecBtn.setForeground(new java.awt.Color(102, 102, 255));
        searchRecBtn.setkEndColor(new java.awt.Color(255, 197, 2));
        searchRecBtn.setkGradientFocus(200);
        searchRecBtn.setkStartColor(new java.awt.Color(251, 130, 118));
        searchRecBtn.setPreferredSize(new java.awt.Dimension(900, 80));
        searchRecBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchBtn.setBackground(new java.awt.Color(255, 197, 2));
        searchBtn.setForeground(new java.awt.Color(51, 255, 51));
        searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBtn.setOpaque(false);
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchBtnMouseExited(evt);
            }
        });
        searchRecBtn.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, 150));

        SearchRecordBtn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        SearchRecordBtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchRecordBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/statistics (1).png"))); // NOI18N
        SearchRecordBtn.setText("Search Record");
        SearchRecordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchRecordBtnMouseClicked(evt);
            }
        });
        searchRecBtn.add(SearchRecordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, 230, 130));

        main2kGradientPanel2.add(searchRecBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 245, 150));

        viewCrseBtn.setkEndColor(new java.awt.Color(255, 197, 2));
        viewCrseBtn.setkGradientFocus(200);
        viewCrseBtn.setkStartColor(new java.awt.Color(251, 130, 118));
        viewCrseBtn.setPreferredSize(new java.awt.Dimension(900, 80));
        viewCrseBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vCourseBtn.setBackground(new java.awt.Color(255, 197, 2));
        vCourseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vCourseBtn.setOpaque(false);
        vCourseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vCourseBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vCourseBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vCourseBtnMouseExited(evt);
            }
        });
        viewCrseBtn.add(vCourseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, 150));

        viewCourseBtn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        viewCourseBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewCourseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/webinar.png"))); // NOI18N
        viewCourseBtn.setText("View Course");
        viewCrseBtn.add(viewCourseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, 230, 110));

        main2kGradientPanel2.add(viewCrseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 245, 150));

        addFeesBtn.setkEndColor(new java.awt.Color(255, 197, 2));
        addFeesBtn.setkGradientFocus(200);
        addFeesBtn.setkStartColor(new java.awt.Color(251, 130, 118));
        addFeesBtn.setPreferredSize(new java.awt.Dimension(900, 80));
        addFeesBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBtn.setBackground(new java.awt.Color(255, 197, 2));
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.setOpaque(false);
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBtnMouseExited(evt);
            }
        });
        addFeesBtn.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, 150));

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button (1).png"))); // NOI18N
        jLabel11.setText("Add Fees");
        addFeesBtn.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 9, 210, 130));

        main2kGradientPanel2.add(addFeesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 245, 150));

        viewRecBtn.setkEndColor(new java.awt.Color(255, 197, 2));
        viewRecBtn.setkGradientFocus(200);
        viewRecBtn.setkStartColor(new java.awt.Color(251, 130, 118));
        viewRecBtn.setPreferredSize(new java.awt.Dimension(900, 80));
        viewRecBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vARBtn.setBackground(new java.awt.Color(255, 197, 2));
        vARBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vARBtn.setOpaque(false);
        vARBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vARBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vARBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vARBtnMouseExited(evt);
            }
        });
        viewRecBtn.add(vARBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, 150));

        jLabel13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/graph.png"))); // NOI18N
        jLabel13.setText("View all Records");
        viewRecBtn.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, 230, 120));

        main2kGradientPanel2.add(viewRecBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 245, 150));

        viewReportBtn.setkEndColor(new java.awt.Color(255, 197, 2));
        viewReportBtn.setkGradientFocus(200);
        viewReportBtn.setkStartColor(new java.awt.Color(251, 130, 118));
        viewReportBtn.setPreferredSize(new java.awt.Dimension(900, 80));
        viewReportBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vReportBtn.setBackground(new java.awt.Color(255, 197, 2));
        vReportBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vReportBtn.setOpaque(false);
        vReportBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vReportBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vReportBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vReportBtnMouseExited(evt);
            }
        });
        viewReportBtn.add(vReportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, 150));

        viewReportButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        viewReportButton.setForeground(new java.awt.Color(255, 255, 255));
        viewReportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/statistics.png"))); // NOI18N
        viewReportButton.setText("View Report");
        viewReportBtn.add(viewReportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, 220, 130));

        main2kGradientPanel2.add(viewReportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 245, 150));

        LogoutBtn1.setkEndColor(new java.awt.Color(255, 102, 102));
        LogoutBtn1.setkStartColor(new java.awt.Color(255, 0, 51));
        LogoutBtn1.setPreferredSize(new java.awt.Dimension(900, 80));
        LogoutBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutBtn1MouseExited(evt);
            }
        });
        LogoutBtn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.setOpaque(false);
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        LogoutBtn1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        jLabel16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        jLabel16.setText("LogOut");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        LogoutBtn1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, 90, 23));

        main2kGradientPanel2.add(LogoutBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 120, 40));

        repoLogoLbl.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        repoLogoLbl.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/artificial-intelligence.png"))); // NOI18N
        main2kGradientPanel2.add(repoLogoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 540, 630));

        repoLogoLbl1.setFont(new java.awt.Font("Jokerman", 0, 30)); // NOI18N
        repoLogoLbl1.setForeground(new java.awt.Color(255, 255, 51));
        repoLogoLbl1.setText("..Harish Chandra Post Graduate College..");
        main2kGradientPanel2.add(repoLogoLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 640, 40));

        repoLogoLbl2.setFont(new java.awt.Font("Jokerman", 0, 25)); // NOI18N
        repoLogoLbl2.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl2.setText("...Mahatama Gandhi Kashi Vidyapith University....");
        main2kGradientPanel2.add(repoLogoLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 610, 40));

        repoLogoLbl3.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        repoLogoLbl3.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl3.setText("Bawan beegha varanasi");
        main2kGradientPanel2.add(repoLogoLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 290, 40));

        repoLogoLbl5.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        repoLogoLbl5.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/artificial-intelligence.png"))); // NOI18N
        main2kGradientPanel2.add(repoLogoLbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 540, 630));

        repoLogoLbl6.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        repoLogoLbl6.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/artificial-intelligence (1).png"))); // NOI18N
        main2kGradientPanel2.add(repoLogoLbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 250, 350));

        repoLogoLbl7.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        repoLogoLbl7.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fireworks (1).png"))); // NOI18N
        main2kGradientPanel2.add(repoLogoLbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 120));

        repoLogoLbl8.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        repoLogoLbl8.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/about_1.png"))); // NOI18N
        repoLogoLbl8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        repoLogoLbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repoLogoLbl8MouseClicked(evt);
            }
        });
        main2kGradientPanel2.add(repoLogoLbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 710, -1, 50));

        repoLogoLbl9.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        repoLogoLbl9.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fireworks (1).png"))); // NOI18N
        main2kGradientPanel2.add(repoLogoLbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, -1, 120));

        repoLogoLbl10.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        repoLogoLbl10.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fireworks.png"))); // NOI18N
        main2kGradientPanel2.add(repoLogoLbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 210, 70, 60));

        repoLogoLbl11.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        repoLogoLbl11.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fireworks (1).png"))); // NOI18N
        main2kGradientPanel2.add(repoLogoLbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, 120));

        repoLogoLbl12.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        repoLogoLbl12.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fireworks (1).png"))); // NOI18N
        main2kGradientPanel2.add(repoLogoLbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, -1, 120));

        repoLogoLbl13.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        repoLogoLbl13.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fireworks (1).png"))); // NOI18N
        main2kGradientPanel2.add(repoLogoLbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 130, 70, 60));

        viewStudentLbl.setForeground(new java.awt.Color(255, 255, 255));
        viewStudentLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        viewStudentLbl.setText("View Students");
        viewStudentLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewStudentLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewStudentLblMouseClicked(evt);
            }
        });
        main2kGradientPanel2.add(viewStudentLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 420, -1, -1));

        addStudentLbl.setForeground(new java.awt.Color(255, 255, 255));
        addStudentLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add2.png"))); // NOI18N
        addStudentLbl.setText("Add Students");
        addStudentLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addStudentLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addStudentLblMouseClicked(evt);
            }
        });
        main2kGradientPanel2.add(addStudentLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 380, -1, -1));

        getContentPane().add(main2kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
       
        FeesAdmin fee = new FeesAdmin();
        fee.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_addBtnMouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        this.setVisible(false);
        HomeMain login = new HomeMain();
        login.setVisible(true);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        
    }//GEN-LAST:event_jLabel16MouseExited

    private void LogoutBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtn1MouseEntered
        
    }//GEN-LAST:event_LogoutBtn1MouseEntered

    private void LogoutBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtn1MouseExited
        
    }//GEN-LAST:event_LogoutBtn1MouseExited

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        this.dispose();
        SearchRecord sr= new SearchRecord();
        sr.setVisible(true);
    }//GEN-LAST:event_searchBtnMouseClicked

    private void SearchRecordBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchRecordBtnMouseClicked
        this.dispose();
        SearchRecord sc = new SearchRecord();
        sc.setVisible(true);
    }//GEN-LAST:event_SearchRecordBtnMouseClicked

    private void vARBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vARBtnMouseClicked
       this.dispose();
       ViewAllRecords var = new ViewAllRecords();
       var.setVisible(true);
    }//GEN-LAST:event_vARBtnMouseClicked

    private void searchBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseEntered
        searchRecBtn.setLocation(searchRecBtn.getX()+5, searchRecBtn.getY()+5);
    }//GEN-LAST:event_searchBtnMouseEntered

    private void addBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseEntered
        addFeesBtn.setLocation(addFeesBtn.getX()+5, addFeesBtn.getY()+5);
    }//GEN-LAST:event_addBtnMouseEntered

    private void addBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseExited
         addFeesBtn.setLocation(addFeesBtn.getX()-5, addFeesBtn.getY()-5);
    }//GEN-LAST:event_addBtnMouseExited

    private void searchBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseExited
         searchRecBtn.setLocation(searchRecBtn.getX()-5, searchRecBtn.getY()-5);
    }//GEN-LAST:event_searchBtnMouseExited

    private void vARBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vARBtnMouseEntered
        viewRecBtn.setLocation(viewRecBtn.getX()+5, viewRecBtn.getY()+5);
    }//GEN-LAST:event_vARBtnMouseEntered

    private void vARBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vARBtnMouseExited
        viewRecBtn.setLocation(viewRecBtn.getX()-5, viewRecBtn.getY()-5);
    }//GEN-LAST:event_vARBtnMouseExited

    private void editBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseEntered
         editCourseBtn.setLocation(editCourseBtn.getX()+5, editCourseBtn.getY()+5);
    }//GEN-LAST:event_editBtnMouseEntered

    private void editBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseExited
        editCourseBtn.setLocation(editCourseBtn.getX()-5, editCourseBtn.getY()-5);
    }//GEN-LAST:event_editBtnMouseExited

    private void vCourseBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vCourseBtnMouseEntered
        viewCrseBtn.setLocation(viewCrseBtn.getX()+5, viewCrseBtn.getY()+5);
    }//GEN-LAST:event_vCourseBtnMouseEntered

    private void vCourseBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vCourseBtnMouseExited
        viewCrseBtn.setLocation(viewCrseBtn.getX()-5, viewCrseBtn.getY()-5);
    }//GEN-LAST:event_vCourseBtnMouseExited

    private void vReportBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vReportBtnMouseEntered
        viewReportBtn.setLocation(viewReportBtn.getX()+5, viewReportBtn.getY()+5);
    }//GEN-LAST:event_vReportBtnMouseEntered

    private void vReportBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vReportBtnMouseExited
        viewReportBtn.setLocation(viewReportBtn.getX()-5, viewReportBtn.getY()-5);
    }//GEN-LAST:event_vReportBtnMouseExited

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
        this.dispose();
        EditCourse ec = new EditCourse();
        ec.setVisible(true);
    }//GEN-LAST:event_editBtnMouseClicked

    private void vCourseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vCourseBtnMouseClicked
        this.dispose();
        AdminViewCourse vc = new AdminViewCourse();
        vc.setVisible(true);
    }//GEN-LAST:event_vCourseBtnMouseClicked

    private void vReportBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vReportBtnMouseClicked
        this.dispose();
        Report r = new Report();
        r.setVisible(true);
    }//GEN-LAST:event_vReportBtnMouseClicked

    private void viewStudentLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewStudentLblMouseClicked
        this.dispose();
        ViiewStudents vs = new ViiewStudents();
        vs.setVisible(true);
    }//GEN-LAST:event_viewStudentLblMouseClicked

    private void addStudentLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStudentLblMouseClicked
       this.dispose();
       AddStudents as = new AddStudents();
       as.setVisible(true);
    }//GEN-LAST:event_addStudentLblMouseClicked

    private void repoLogoLbl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repoLogoLbl8MouseClicked
        JOptionPane.showMessageDialog(this, "This Software [Fees Report management System] "
               + " is developed by [RAVI JAISWAL] and CopyRight by RJSoftwares for any feedback"
               + " and query related to this software please DM us on 'ravijaiswalu9v@gmail.com' Enjoy! ", "ABOUT",JOptionPane.INFORMATION_MESSAGE);
    
    }//GEN-LAST:event_repoLogoLbl8MouseClicked

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel LogoutBtn1;
    private javax.swing.JLabel SearchRecordBtn;
    private javax.swing.JPanel addBtn;
    private keeptoo.KGradientPanel addFeesBtn;
    private javax.swing.JLabel addStudentLbl;
    private javax.swing.JPanel editBtn;
    private keeptoo.KGradientPanel editCourseBtn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel8;
    private keeptoo.KGradientPanel main2kGradientPanel2;
    private javax.swing.JLabel repoLogoLbl;
    private javax.swing.JLabel repoLogoLbl1;
    private javax.swing.JLabel repoLogoLbl10;
    private javax.swing.JLabel repoLogoLbl11;
    private javax.swing.JLabel repoLogoLbl12;
    private javax.swing.JLabel repoLogoLbl13;
    private javax.swing.JLabel repoLogoLbl2;
    private javax.swing.JLabel repoLogoLbl3;
    private javax.swing.JLabel repoLogoLbl5;
    private javax.swing.JLabel repoLogoLbl6;
    private javax.swing.JLabel repoLogoLbl7;
    private javax.swing.JLabel repoLogoLbl8;
    private javax.swing.JLabel repoLogoLbl9;
    private javax.swing.JPanel searchBtn;
    private keeptoo.KGradientPanel searchRecBtn;
    private javax.swing.JPanel vARBtn;
    private javax.swing.JPanel vCourseBtn;
    private javax.swing.JPanel vReportBtn;
    private javax.swing.JLabel viewCourseBtn;
    private keeptoo.KGradientPanel viewCrseBtn;
    private keeptoo.KGradientPanel viewRecBtn;
    private keeptoo.KGradientPanel viewReportBtn;
    private javax.swing.JLabel viewReportButton;
    private javax.swing.JLabel viewStudentLbl;
    // End of variables declaration//GEN-END:variables
}
