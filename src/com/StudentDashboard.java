
package com;

import com.mysql.cj.util.DnsSrv;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ravi_jaiswal
 */
public class StudentDashboard extends javax.swing.JFrame {

    /**
     * Creates new form java
     */
    public StudentDashboard() {
        addTitleIcon();
          this.setResizable(false);
        initComponents();
    }
    
    public StudentDashboard(String StdName,String RollNo) {
        addTitleIcon();
          this.setResizable(false);
        initComponents();
        StudentNameDisplayLbl.setText(StdName);
         StudentRollNoDispLbl.setText(RollNo);
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
        viewCrseBtn = new keeptoo.KGradientPanel();
        vCourseBtn = new javax.swing.JPanel();
        viewCourseBtn = new javax.swing.JLabel();
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
        repoLogoLbl6 = new javax.swing.JLabel();
        repoLogoLbl7 = new javax.swing.JLabel();
        repoLogoLbl8 = new javax.swing.JLabel();
        repoLogoLbl9 = new javax.swing.JLabel();
        repoLogoLbl11 = new javax.swing.JLabel();
        repoLogoLbl12 = new javax.swing.JLabel();
        repoLogoLbl13 = new javax.swing.JLabel();
        StudentNameDisplayLbl = new javax.swing.JLabel();
        repoLogoLbl4 = new javax.swing.JLabel();
        addFeesBtn = new keeptoo.KGradientPanel();
        addBtn = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        StudentRollNoDispLbl = new javax.swing.JLabel();
        repoLogoLbl17 = new javax.swing.JLabel();
        repoLogoLbl18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StudentDashboard......");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main2kGradientPanel2.setkEndColor(new java.awt.Color(121, 25, 255));
        main2kGradientPanel2.setkGradientFocus(1000);
        main2kGradientPanel2.setkStartColor(new java.awt.Color(235, 0, 19));
        main2kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        main2kGradientPanel2.add(viewCrseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 245, 150));

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

        main2kGradientPanel2.add(viewReportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 245, 150));

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
        main2kGradientPanel2.add(repoLogoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 510, 510));

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
        repoLogoLbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repoLogoLbl8MouseClicked(evt);
            }
        });
        main2kGradientPanel2.add(repoLogoLbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 710, -1, 50));

        repoLogoLbl9.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        repoLogoLbl9.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fireworks (1).png"))); // NOI18N
        main2kGradientPanel2.add(repoLogoLbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 130, -1, 120));

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
        main2kGradientPanel2.add(repoLogoLbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 260, 70, 60));

        StudentNameDisplayLbl.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        StudentNameDisplayLbl.setForeground(new java.awt.Color(255, 255, 255));
        main2kGradientPanel2.add(StudentNameDisplayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 130, 40));

        repoLogoLbl4.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        repoLogoLbl4.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/artificial-intelligence.png"))); // NOI18N
        main2kGradientPanel2.add(repoLogoLbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 510, 510));

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
        jLabel11.setText("Pay Fees");
        addFeesBtn.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 9, 210, 130));

        main2kGradientPanel2.add(addFeesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 245, 150));

        StudentRollNoDispLbl.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        StudentRollNoDispLbl.setForeground(new java.awt.Color(255, 255, 255));
        StudentRollNoDispLbl.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        main2kGradientPanel2.add(StudentRollNoDispLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 40, 120, 30));

        repoLogoLbl17.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        repoLogoLbl17.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user (1).png"))); // NOI18N
        main2kGradientPanel2.add(repoLogoLbl17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, -1, -1));

        repoLogoLbl18.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        repoLogoLbl18.setForeground(new java.awt.Color(255, 255, 255));
        repoLogoLbl18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fireworks.png"))); // NOI18N
        main2kGradientPanel2.add(repoLogoLbl18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 340, 70, 60));

        getContentPane().add(main2kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void vCourseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vCourseBtnMouseClicked
        this.dispose();
        StudentViewCourse vc = new StudentViewCourse();
        vc.setVisible(true);
    }//GEN-LAST:event_vCourseBtnMouseClicked

    private void vReportBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vReportBtnMouseClicked
        System.err.println("Under Development.........");
        JOptionPane.showMessageDialog(this,"this Button is in Under Development", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_vReportBtnMouseClicked

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        int rollNo;
        System.out.println("5");
        if(StudentRollNoDispLbl.getText().equals("")){
        rollNo=1;// by default
        }
        else{
         rollNo=Integer.parseInt(StudentRollNoDispLbl.getText());
        }    
        
        System.out.println("6");
          FeesStudent fee = new FeesStudent(rollNo);
          System.out.println("7");
        fee.setVisible(true);
        this.dispose();
        
//        FeesStudent fee = new FeesStudent();
//        fee.setVisible(true);
//        this.dispose();

    }//GEN-LAST:event_addBtnMouseClicked

    private void addBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseEntered
        addFeesBtn.setLocation(addFeesBtn.getX()+5, addFeesBtn.getY()+5);
    }//GEN-LAST:event_addBtnMouseEntered

    private void addBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseExited
        addFeesBtn.setLocation(addFeesBtn.getX()-5, addFeesBtn.getY()-5);
    }//GEN-LAST:event_addBtnMouseExited

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
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new StudentDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel LogoutBtn1;
    private javax.swing.JLabel StudentNameDisplayLbl;
    private javax.swing.JLabel StudentRollNoDispLbl;
    private javax.swing.JPanel addBtn;
    private keeptoo.KGradientPanel addFeesBtn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel8;
    private keeptoo.KGradientPanel main2kGradientPanel2;
    private javax.swing.JLabel repoLogoLbl;
    private javax.swing.JLabel repoLogoLbl1;
    private javax.swing.JLabel repoLogoLbl11;
    private javax.swing.JLabel repoLogoLbl12;
    private javax.swing.JLabel repoLogoLbl13;
    private javax.swing.JLabel repoLogoLbl17;
    private javax.swing.JLabel repoLogoLbl18;
    private javax.swing.JLabel repoLogoLbl2;
    private javax.swing.JLabel repoLogoLbl3;
    private javax.swing.JLabel repoLogoLbl4;
    private javax.swing.JLabel repoLogoLbl6;
    private javax.swing.JLabel repoLogoLbl7;
    private javax.swing.JLabel repoLogoLbl8;
    private javax.swing.JLabel repoLogoLbl9;
    private javax.swing.JPanel vCourseBtn;
    private javax.swing.JPanel vReportBtn;
    private javax.swing.JLabel viewCourseBtn;
    private keeptoo.KGradientPanel viewCrseBtn;
    private keeptoo.KGradientPanel viewReportBtn;
    private javax.swing.JLabel viewReportButton;
    // End of variables declaration//GEN-END:variables
}
