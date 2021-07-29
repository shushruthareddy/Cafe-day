/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * 
 * 
 */
public class Customers extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    Integer Command;

    int ADD = 0;
    int UPDATE = 1;

    /**
     * Creates new form Customers
     */
    public Customers() {
        super("Customers");
        initComponents();
        conn = dbconnect.connectdb();
        FrameInit();

    }

    private void FrameInit() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim);             ///This will let frame initialise in full screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel2 = new coffee.ImagePanel();
        btnrefresh = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        txtentcaddr = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnhome = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        txtcemail = new javax.swing.JTextField();
        txtcphno = new javax.swing.JTextField();
        txtcusname = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtcusid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtemailerr = new javax.swing.JLabel();
        txtentcustid = new javax.swing.JLabel();
        txtentcusname = new javax.swing.JLabel();
        txtentcphno = new javax.swing.JLabel();
        txtentcemail = new javax.swing.JLabel();
        txtentjDateChooser1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtcaddr = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagePanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                imagePanel2ComponentResized(evt);
            }
        });
        imagePanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnrefresh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnrefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/settings.png"))); // NOI18N
        btnrefresh.setText("REFRESH");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });
        imagePanel2.add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 160, 50));

        btnsave.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/save.png"))); // NOI18N
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        imagePanel2.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 160, 50));

        txtentcaddr.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtentcaddr.setForeground(new java.awt.Color(255, 0, 0));
        imagePanel2.add(txtentcaddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 466, 247, 22));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 70)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setText("CUSTOMER DETAILS");
        imagePanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 41, 810, -1));

        btnhome.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/home.png"))); // NOI18N
        btnhome.setText("HOME");
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        imagePanel2.add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, 147, 50));

        btndelete.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/delete.png"))); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        imagePanel2.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 160, 50));

        btnadd.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/add.png"))); // NOI18N
        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        imagePanel2.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 140, 50));

        btnsearch.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/search.png"))); // NOI18N
        btnsearch.setText("SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        imagePanel2.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 150, 50));

        btnupdate.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/Update.png"))); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        imagePanel2.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 150, 50));

        txtcemail.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtcemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcemailActionPerformed(evt);
            }
        });
        imagePanel2.add(txtcemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 257, 40));

        txtcphno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtcphno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcphnoActionPerformed(evt);
            }
        });
        imagePanel2.add(txtcphno, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 260, 40));

        txtcusname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtcusname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcusnameKeyTyped(evt);
            }
        });
        imagePanel2.add(txtcusname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 260, 40));

        jDateChooser1.setDateFormatString("YYYY-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        imagePanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 257, 40));

        txtcusid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtcusid.setEnabled(false);
        txtcusid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcusidFocusLost(evt);
            }
        });
        txtcusid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcusidActionPerformed(evt);
            }
        });
        txtcusid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcusidKeyTyped(evt);
            }
        });
        imagePanel2.add(txtcusid, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 260, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel7.setText("E-Mail");
        imagePanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 120, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel6.setText("Date Of Visit");
        imagePanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 190, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel5.setText("PhNo");
        imagePanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 110, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel4.setText("Address");
        imagePanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 130, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setText("Name");
        imagePanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 110, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setText("CustomerID");
        imagePanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 180, -1));
        imagePanel2.add(txtemailerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 536, -1, 17));

        txtentcustid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtentcustid.setForeground(new java.awt.Color(255, 0, 0));
        txtentcustid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtentcustidKeyTyped(evt);
            }
        });
        imagePanel2.add(txtentcustid, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 206, 260, 23));

        txtentcusname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtentcusname.setForeground(new java.awt.Color(255, 0, 0));
        imagePanel2.add(txtentcusname, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 286, 260, 23));

        txtentcphno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtentcphno.setForeground(new java.awt.Color(255, 0, 0));
        imagePanel2.add(txtentcphno, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 555, 250, 23));

        txtentcemail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtentcemail.setForeground(new java.awt.Color(255, 0, 0));
        imagePanel2.add(txtentcemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 635, 250, 25));

        txtentjDateChooser1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtentjDateChooser1.setForeground(new java.awt.Color(255, 51, 0));
        imagePanel2.add(txtentjDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 725, 257, 24));

        txtcaddr.setColumns(20);
        txtcaddr.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtcaddr.setRows(5);
        txtcaddr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcaddrKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtcaddr);

        imagePanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 260, 133));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "custid", "name", "address", "phno", "email", "dateofvisit"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        imagePanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 470, 269));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/view.png"))); // NOI18N
        jButton1.setText("VIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        imagePanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 120, 44));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/next.png"))); // NOI18N
        jButton2.setText("NEXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        imagePanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 630, 160, 44));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(imagePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(imagePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Are u sure u want to delete?", "delete", JOptionPane.YES_NO_OPTION);
        if (p == 0) {  
            String sql = "delete from customer where CustID=?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, txtcusid.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "deleted sucessfuly");

                String IDUpdateQry = "Update autogen SET CustID=?";

                pst = conn.prepareStatement(IDUpdateQry);
                pst.setString(1, "" + (Integer.parseInt(txtcusid.getText()) - (int) 1));

                btnsearch.setVisible(true);
                btnsave.setVisible(true);
                btnupdate.setVisible(true);
                btnadd.setVisible(true);
                txtcusid.setText("");
                txtcusname.setText("");
                txtcaddr.setText("");
                txtcemail.setText("");
                txtcphno.setText("");
                jDateChooser1.setDate(null);
                //txtccname.setToolTipText("");
                // txtccid.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        setVisible(false);
        HomePage ob = new HomePage();
        ob.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
       if (txtcusid.getText().trim().isEmpty()  && txtcusname.getText().trim().isEmpty() && txtcaddr.getText().trim().isEmpty() && txtcphno.getText().trim().isEmpty() && txtcemail.getText().trim().isEmpty() && ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().trim().isEmpty()) {
            txtentcustid.setText("Enter  Customer ID");
            txtentcusname.setText("Enter Customer Name");
            txtentcaddr.setText("Enter Address");
            txtentcphno.setText("Enter Phno");
            txtentcemail.setText("Enter Email");
            txtentjDateChooser1.setText("Enter Date Of Visit");
            
        } else if (txtcusid.getText().trim().isEmpty()) {
            txtentcustid.setText("Enter  Customer ID");
        } else if (txtcusname.getText().isEmpty()) {
            txtentcusname.setText("Enter Customer Name");
        } else if (txtcaddr.getText().trim().isEmpty()) {
         txtentcaddr.setText("Enter Address");
        } else if (txtcphno.getText().trim().isEmpty()) {
          txtentcphno.setText("Enter Phno");
        } else if (txtcemail.getText().trim().isEmpty()) {
           txtentcemail.setText("Enter Email");
        } else if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().trim().isEmpty()) {
          txtentjDateChooser1.setText("Enter Date Of Visit");
        } else {  

        
        Pattern p = Pattern.compile("^[6-9][0-9]{9}$");
        Matcher m = p.matcher(txtcphno.getText());
        if (!m.matches()) {
            JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        Pattern pa = Pattern.compile("^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$");
        Matcher ma = pa.matcher(txtcemail.getText());
        if (!ma.matches()) {
            JOptionPane.showMessageDialog(null, "Invalid  email", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String date = ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText();
        System.out.println(date);
        try {
            if (Command == UPDATE) {

                String sql = "update customer set CustID=?,"
                        + "CustName=?,Address=?,PhNo=?,Email=?,"
                        + "DateOfVisit=? "
                        + "where CustID=?";
                pst = conn.prepareStatement(sql);

                pst.setString(1, txtcusid.getText());
                pst.setString(2, txtcusname.getText());
                pst.setString(3, txtcaddr.getText());
                pst.setString(4, txtcphno.getText());
                pst.setString(5, txtcemail.getText());
               
                pst.setString(6, ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
                
                pst.setString(7, txtcusid.getText());

                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "updated sucessfuly");
                txtcusid.setText("");
                txtcusname.setText("");
                txtcaddr.setText("");
                txtcemail.setText("");
                txtcphno.setText("");
                btndelete.setVisible(true);
                btnsearch.setVisible(true);
                btnsave.setVisible(true);
                btnupdate.setVisible(true);
                btnadd.setVisible(true);
                ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
                
            } else if (Command == ADD) {
                String sql = "Insert into customer (CustID,CustName,Address,PhNo,Email,DateOfVisit) values (?,?,?,?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, txtcusid.getText());
                pst.setString(2, txtcusname.getText());
                pst.setString(3, txtcaddr.getText());
                pst.setString(4, txtcphno.getText());
                pst.setString(5, txtcemail.getText());
                pst.setString(6, ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
               
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "inserted successfully");
                String IDUpdateQry = "Update autogen SET CustID=?";

                pst = conn.prepareStatement(IDUpdateQry);
                pst.setString(1, "" + (Integer.parseInt(txtcusid.getText()) + (int) 1));
                pst.executeUpdate();
                btndelete.setVisible(true);
                btnsearch.setVisible(true);
                btnsave.setVisible(true);
                btnupdate.setVisible(true);
                btnadd.setVisible(true);
                txtcusid.setText("");
                txtcusname.setText("");
                txtcaddr.setText("");
                txtcphno.setText("");

                txtcemail.setText("");
                ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
                // txtccname.setToolTipText("");
               // txtccid.setText("");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnsaveActionPerformed
   }
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try {
            // TODO add your handling code here:
            txtcusid.setText("");
            txtcusname.setText("");
            txtcaddr.setText("");
            txtcphno.setText("");
            txtcemail.setText("");
            ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
            
           
            txtcaddr.setEnabled(true);
            btndelete.setVisible(false);
            btnupdate.setVisible(false);
            btnsave.setVisible(true);
            btnsearch.setVisible(true);
            Command = ADD;

            String getIDQry = "Select CustID FROM autogen;";
            pst = conn.prepareStatement(getIDQry);
            rs = pst.executeQuery();

            if (rs.next()) {
                txtcusid.setText(rs.getString("CustID"));
            } else {
                JOptionPane.showMessageDialog(null, "Unknown Error!!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        try {

            // txtcusid.setText("");
            txtcusname.setText("");
            txtcaddr.setText("");
            txtcphno.setText("");
            txtcemail.setText("");
            ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
           
            txtcusname.setEnabled(true);
            txtcaddr.setEnabled(true);
            txtcemail.setEnabled(true);
            txtcphno.setEnabled(true);
           
            Command = UPDATE;
            btndelete.setVisible(false);
            btnadd.setVisible(false);

            String sql2 = "SELECT * FROM customer WHERE CustID=?";
            pst = conn.prepareStatement(sql2);
            pst.setString(1, txtcusid.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtcusid.setText(rs.getString("CustID"));
                txtcusname.setText(rs.getString(2));
                txtcaddr.setText(rs.getString(3));
                txtcphno.setText(rs.getString(4));
                txtcemail.setText(rs.getString(5));   
                ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(rs.getString(6));

               
            } else {
                JOptionPane.showMessageDialog(null, "incorrect CustomerID");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        txtcusid.setEnabled(true);
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtcusidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcusidFocusLost
        try {
            txtcusid.setEnabled(false);
            String sql2 = "SELECT * FROM customer WHERE CustID=?";
            pst = conn.prepareStatement(sql2);
            pst.setString(1, txtcusid.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtcusid.setText(rs.getString("CustID"));
                txtcusname.setText(rs.getString(2));
                txtcaddr.setText(rs.getString(3));
                txtcphno.setText(rs.getString(4));
                txtcemail.setText(rs.getString(5));
                ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(rs.getString(6));

                //txtccname.setEnabled(false);
                //txtccid.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "incorrect CustomerID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtcusidFocusLost

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        txtcaddr.setText("");
        txtcemail.setText("");
        
        txtcphno.setText("");
        txtcusid.setText("");
        txtcusname.setText("");
        ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");

        txtcphno.setEnabled(true);
        txtcusid.setEnabled(true);
         txtcaddr.setEnabled(true);
        txtcemail.setEnabled(true);
         txtcusname.setEnabled(true);
        jDateChooser1.setEnabled(true);
        
        btnadd.setVisible(true);
        btndelete.setVisible(true);
        btnsave.setVisible(true);
        btnsearch.setVisible(true);
        btnupdate.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void txtcphnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcphnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcphnoActionPerformed

    private void txtcemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcemailActionPerformed
 
if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", txtcemail.getText()))) 
{
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "The email is valid", "Good!", JOptionPane.INFORMATION_MESSAGE);

            }
    }//GEN-LAST:event_txtcemailActionPerformed

    private void imagePanel2ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_imagePanel2ComponentResized
           URL resource = getClass().getResource("/iconandpictures/pexelscustomer.jpeg");

        try {
          //  System.out.println(Paths.get(resource.toURI()).toFile().getAbsolutePath());
            imagePanel2.setImage(new ImageIcon(resource).getImage(),
                    this.getWidth(), this.getHeight());
        } catch (Exception ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_imagePanel2ComponentResized

    private void txtentcustidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtentcustidKeyTyped
      
    }//GEN-LAST:event_txtentcustidKeyTyped

    private void txtcusidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcusidKeyTyped
        txtentcustid.setText("");
    }//GEN-LAST:event_txtcusidKeyTyped

    private void txtcusidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcusidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcusidActionPerformed

    private void txtcusnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcusnameKeyTyped
        txtentcusname.setText("");
    }//GEN-LAST:event_txtcusnameKeyTyped

    private void txtcaddrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcaddrKeyTyped
        txtentcaddr.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_txtcaddrKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          try
        {
              Statement St = conn.createStatement();
    String query="select * from customer";
    PreparedStatement pstmt=conn.prepareStatement(query);
     rs=pstmt.executeQuery();
     jTable1.setModel(DbUtils.resultSetToTableModel(rs));
}

             catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error:"+e);
             }
    
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Categorys ().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    (String args[]) {public static void main
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Customers.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Customers.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Customers.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Customers.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Customers().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private coffee.ImagePanel imagePanel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtcaddr;
    private javax.swing.JTextField txtcemail;
    private javax.swing.JTextField txtcphno;
    private javax.swing.JTextField txtcusid;
    private javax.swing.JTextField txtcusname;
    private javax.swing.JLabel txtemailerr;
    private javax.swing.JLabel txtentcaddr;
    private javax.swing.JLabel txtentcemail;
    private javax.swing.JLabel txtentcphno;
    private javax.swing.JLabel txtentcusname;
    private javax.swing.JLabel txtentcustid;
    private javax.swing.JLabel txtentjDateChooser1;
    // End of variables declaration//GEN-END:variables
}