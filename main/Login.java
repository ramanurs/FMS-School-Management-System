/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Teacher.Teacher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

/**
 *
 * @author franq
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    
    private Action enterAction,finishEnterAction;
    private ArrayList loginnames;
    private ArrayList loginids;
    private int levelid;
    
    public Login() {
        selects.QueryLoginLevels.getLoginNames();
        loginnames = selects.QueryLoginLevels.listofnames;
        loginids = selects.QueryLoginLevels.listofids;
        
        initComponents();
        cmblevel.setModel(new DefaultComboBoxModel(loginnames.toArray(new String[loginnames.size()])));
        
        //createa action listener for the ente button
        enterAction = new AbstractAction()
        {
        @Override
        public void actionPerformed(ActionEvent e)
        {
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.getFocusOwner().transferFocus();
        }
        };
        
        finishEnterAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
                btnloginActionPerformed(e);
            }
        };
        
        jtfuserid.setAction(enterAction);
        jtfpassword.setAction(enterAction);
        //cmblevel.setAction(finishEnterAction);
        
       
       Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
       this.setTitle("WELCOME - " + this.getSchoolName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submainpane = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtfuserid = new javax.swing.JFormattedTextField();
        jtfpassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmblevel = new javax.swing.JComboBox();
        btncancel = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        btnother = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        loginpic = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Frigate Management System");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(selects.QueryMainDetails.setIcon());
        setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());

        submainpane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel14.setMaximumSize(new java.awt.Dimension(1295, 522));
        jPanel14.setPreferredSize(new java.awt.Dimension(1295, 522));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel6.setPreferredSize(new java.awt.Dimension(300, 300));

        jLabel9.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel9.setPreferredSize(new java.awt.Dimension(300, 300));
        jLabel9.setIcon(new javax.swing.ImageIcon(readImage()));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 240))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("User ID:");

        jtfuserid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Password:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("User Level:");

        btncancel.setText("Exit");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btnother.setText("Use Other Credentials");
        btnother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnotherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfuserid)
                    .addComponent(jtfpassword)
                    .addComponent(cmblevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btncancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(btnlogin)))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnother, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmblevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancel)
                    .addComponent(btnlogin))
                .addGap(34, 34, 34)
                .addComponent(btnother, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        loginpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/loginmain.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginpic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginpic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout submainpaneLayout = new javax.swing.GroupLayout(submainpane);
        submainpane.setLayout(submainpaneLayout);
        submainpaneLayout.setHorizontalGroup(
            submainpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, submainpaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        submainpaneLayout.setVerticalGroup(
            submainpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submainpaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem2.setText("Refresh");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(submainpane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(submainpane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        jtfuserid.setText("");
        jtfpassword.setText("");
        cmblevel.setSelectedIndex(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnotherActionPerformed
        // TODO add your handling code here:
        jtfuserid.setText("");
        jtfpassword.setText("");
        cmblevel.setSelectedIndex(0);
    }//GEN-LAST:event_btnotherActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        if("".equals(jtfuserid.getText()))
        {
            JOptionPane.showMessageDialog(null,
                "Please Enter User ID To Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(jtfpassword.getText()))
        {
            JOptionPane.showMessageDialog(null,
                "Please Enter Pass Word To Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(cmblevel.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null,
                "Please Select User Level To Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Boolean login,exists;
            String userid,password,userlevel;
            userid = jtfuserid.getText();
            //get the level id for the specific user
            levelid = selects.QueryLoginLevels.getLevelID(userid);
            password = jtfpassword.getText();
            //userlevel = cmblevel.getSelectedItem().toString().toUpperCase();
            int userlevelidid = cmblevel.getSelectedIndex();
            int userlevelid = Integer.parseInt(loginids.get(userlevelidid).toString());
            if(userlevelid==4)
                userlevelid =3;

            //check whether user exists
            exists = selects.Authenticate.confirmUserExists(userid);
            if(exists == false)
            {

                JOptionPane.showMessageDialog(null,
                    "User ID Does Not Exist\nTry Again\n","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {

                //authenticate user
                login = selects.Authenticate.authenticateLogin(userid, password, levelid);
                if(login == true)
                {
                    if(levelid  == userlevelid && userlevelid == 1)
                    {
                        int superstaffid = selects.QueryStafftDetails.getuserIDwithNationalID(userid);
                        superadmin.SuperAdmin userpage = new superadmin.SuperAdmin(superstaffid);
                        userpage.main(new String[9]);
                        this.dispose();
                    }
                    else if(levelid  == userlevelid && userlevelid == 2)
                    {
                        try {
                            /*checks whether the teacher has other roles
                            * first checks whether teacher is a department head
                            * if so log them in to the department head module
                            * second check whether the teacher is a class teacher
                            * if so log them in to to the class teacher mofule
                            * if not so log them in to the normal teacher module
                            * */
                            int stfid = selects.QueryStafftDetails.getuserIDwithNationalID(userid);
                            int deptid = -1;
                            deptid = selects.QueryDepartmenDetails.getDepartmentID(stfid);
                            int classid = -1;
                            classid = selects.QueryClassDetails.getclassIDsithTeaccherID(stfid);
                            if(deptid != -1)
                            {
                                int deptheadid = selects.QueryStafftDetails.getuserIDwithNationalID(userid);
                                departmenthead.DepartmentHead departmentHead = new departmenthead.DepartmentHead(deptheadid, 1);
                                departmentHead.main(new String[9]);
                                this.dispose();
                            }
                            else if(classid != -1)
                            {
                                int classteacherid = selects.QueryStafftDetails.getuserIDwithNationalID(userid);
                                classteacher.ClassTeacher classTeacher = new classteacher.ClassTeacher(classteacherid);
                                classTeacher.main(new String[9]);
                                this.dispose();
                            }
                            else
                            {
                                int teacherstaffid = selects.QueryStafftDetails.getuserIDwithNationalID(userid);
                                Teacher teacher = new Teacher(teacherstaffid, 1);
                                teacher.main(new String[9]);
                                this.dispose();
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                    else if(levelid  == userlevelid && userlevelid == 3)
                    {
                        int clerkstaffid = selects.QueryStafftDetails.getuserIDwithNationalID(userid);
                        clerk.Clerk clerkobj = new clerk.Clerk(clerkstaffid);
                        clerkobj.main(new String[9]);
                        this.dispose();
                    }
                    else if(levelid  == userlevelid && userlevelid == 3)
                    {
                        int clerkstaffid = selects.QueryStafftDetails.getuserIDwithNationalID(userid);
                        clerk.Clerk clerkobj = new clerk.Clerk(clerkstaffid);
                        clerkobj.main(new String[9]);
                        this.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,
                            "Please Correct Your User Level to Continue","Error",JOptionPane.ERROR_MESSAGE);
                    }

                }
                else
                JOptionPane.showMessageDialog(null,
                    "Authentification Failed\nPlease Check Login details And Try Again\n","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btncancelActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    
    private static String getSchoolName()
    {
        DBConnection dbconn =new DBConnection();
        Connection conn = dbconn.vconnection;
        PreparedStatement pstmt;
        String schoolname= "";
        String sql = "SELECT `Name` FROM `school_details` WHERE `ID` = ?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 1);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            schoolname = rs.getString("Name");
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Some unexpected error occured \nSchool Name Details not found\n" +
                        "Please contact the system administrator", "Error "+ex.getErrorCode(), JOptionPane.WARNING_MESSAGE);
        }
        return schoolname;
    }
    
     private static BufferedImage readImage()
    {
        DBConnection dbconn =new DBConnection();
        Connection conn = dbconn.vconnection;
        PreparedStatement pstmt;
        String sql = "SELECT `logo` FROM `school_logo` WHERE `ID` = ?";
        
        BufferedImage bufImg = null;
        try {
            pstmt = conn.prepareStatement(sql);
            //should get the id of the current user and give it to 1
            pstmt.setInt(1, 1);
            ResultSet rs = pstmt.executeQuery();
            
            rs.next();
            InputStream in = rs.getBinaryStream("logo"); 
             bufImg = ImageIO.read(in); 
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bufImg;
    }
     
     private static BufferedImage readMainPTopImage()
    {
        DBConnection dbconn =new DBConnection();
        Connection conn = dbconn.vconnection;
        PreparedStatement pstmt;
        String sql = "SELECT `pic` FROM `loginpic` WHERE `ID`=?";
        
        BufferedImage bufImg = null;
        try {
            pstmt = conn.prepareStatement(sql);
            //should get the id of the current user and give it to 1
            pstmt.setInt(1, 1);
            ResultSet rs = pstmt.executeQuery();
            
            rs.next();
            InputStream in = rs.getBinaryStream("pic"); 
             bufImg = ImageIO.read(in); 
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bufImg;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnother;
    private javax.swing.JComboBox cmblevel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPasswordField jtfpassword;
    private javax.swing.JFormattedTextField jtfuserid;
    private javax.swing.JLabel loginpic;
    private javax.swing.JPanel submainpane;
    // End of variables declaration//GEN-END:variables
}