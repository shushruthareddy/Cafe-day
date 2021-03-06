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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * 
 */
public class Billing extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    Integer Command;

    int SUBMIT = 0;
    int UPDATE = 1;
    

    /**
     * Creates new form Billing
     */
    public Billing() {
        super("Billing");
        initComponents();
        conn = dbconnect.connectdb();
        FrameInit();
    }

    private void FrameInit() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim);             ///This will let frame initialise in full screen
        setCustNameModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    private void setCustNameModel() {
        try {
            txtcustid.setEnabled(false);
            String Qry = "SELECT CustName FROM customer;";
            pst = conn.prepareStatement(Qry);
            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("CustName"));
                combocustname.addItem(rs.getString("CustName"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel1 = new coffee.ImagePanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtbillno = new javax.swing.JTextField();
        txtoid = new javax.swing.JTextField();
        txtcustid = new javax.swing.JTextField();
        btnhome = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        combopay = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtgamt = new javax.swing.JTextField();
        combocustname = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        btnrefresh = new javax.swing.JButton();
        txtentbillno = new javax.swing.JLabel();
        txtentorderid = new javax.swing.JLabel();
        txtentcombocustname = new javax.swing.JLabel();
        txtentcustid = new javax.swing.JLabel();
        txtentjdatechooser2 = new javax.swing.JLabel();
        txtentcombopay = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtdiscount = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtamt1 = new javax.swing.JTextField();
        txtentamt = new javax.swing.JLabel();
        txtedic = new javax.swing.JLabel();
        txtegtotal = new javax.swing.JLabel();
        btncal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        imagePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel8.setText("Customer Name");
        imagePanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 210, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setText("Bill No");
        imagePanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setText("Order ID");
        imagePanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 120, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel5.setText("Customer ID");
        imagePanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 170, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel6.setText("Mode Of Payment");
        imagePanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 240, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 70)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("BILLING");
        imagePanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 11, 320, 70));

        txtbillno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        imagePanel1.add(txtbillno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 250, 40));

        txtoid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtoid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtoidActionPerformed(evt);
            }
        });
        imagePanel1.add(txtoid, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 250, 40));

        txtcustid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtcustid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcustidActionPerformed(evt);
            }
        });
        imagePanel1.add(txtcustid, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 250, 40));

        btnhome.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/home.png"))); // NOI18N
        btnhome.setText("HOME");
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        imagePanel1.add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, 150, 50));

        btnsearch.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/search.png"))); // NOI18N
        btnsearch.setText("SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        imagePanel1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, 40));

        btnsave.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/save.png"))); // NOI18N
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        imagePanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 130, 40));

        btnsubmit.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnsubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/add.png"))); // NOI18N
        btnsubmit.setText("ADD");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        imagePanel1.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 120, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel10.setText("Date");
        imagePanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 396, 60, 30));

        btndelete.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/delete.png"))); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        imagePanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 140, 40));

        combopay.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        combopay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit", "Debit", "Paytm", " ", " ", " ", " ", " " }));
        imagePanel1.add(combopay, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 250, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel11.setText("Grand Total");
        imagePanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, -1, -1));

        txtgamt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        imagePanel1.add(txtgamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 250, -1));

        combocustname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        combocustname.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combocustnameItemStateChanged(evt);
            }
        });
        combocustname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocustnameActionPerformed(evt);
            }
        });
        imagePanel1.add(combocustname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 250, 40));

        jDateChooser2.setDateFormatString("YYYY-MM-dd");
        jDateChooser2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        imagePanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 250, 40));

        btnrefresh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnrefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/settings.png"))); // NOI18N
        btnrefresh.setText("REFRESH");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });
        imagePanel1.add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, -1, 40));

        txtentbillno.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtentbillno.setForeground(new java.awt.Color(255, 0, 0));
        imagePanel1.add(txtentbillno, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 193, 250, 20));

        txtentorderid.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtentorderid.setForeground(new java.awt.Color(255, 0, 0));
        imagePanel1.add(txtentorderid, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 287, 250, 24));

        txtentcombocustname.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtentcombocustname.setForeground(new java.awt.Color(255, 0, 0));
        imagePanel1.add(txtentcombocustname, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 385, 250, 20));

        txtentcustid.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtentcustid.setForeground(new java.awt.Color(255, 0, 0));
        imagePanel1.add(txtentcustid, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 469, 250, 20));

        txtentjdatechooser2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtentjdatechooser2.setForeground(new java.awt.Color(255, 0, 0));
        imagePanel1.add(txtentjdatechooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 550, 240, 20));

        txtentcombopay.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtentcombopay.setForeground(new java.awt.Color(255, 0, 0));
        imagePanel1.add(txtentcombopay, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, 250, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel9.setText("Discounts");
        imagePanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 140, -1));

        txtdiscount.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtdiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiscountActionPerformed(evt);
            }
        });
        imagePanel1.add(txtdiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 250, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel12.setText("Total Amount");
        imagePanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        txtamt1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtamt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamt1ActionPerformed(evt);
            }
        });
        imagePanel1.add(txtamt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 250, 40));

        txtentamt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtentamt.setForeground(new java.awt.Color(204, 0, 0));
        imagePanel1.add(txtentamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 701, 250, 24));

        txtedic.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtedic.setForeground(new java.awt.Color(204, 0, 0));
        imagePanel1.add(txtedic, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 795, 250, 26));

        txtegtotal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtegtotal.setForeground(new java.awt.Color(204, 0, 0));
        imagePanel1.add(txtegtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 890, 250, 23));

        btncal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btncal.setForeground(new java.awt.Color(0, 0, 204));
        btncal.setText("CALCULATE");
        btncal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalActionPerformed(evt);
            }
        });
        imagePanel1.add(btncal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 630, -1, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "billno", "orderid", "custname", "custid", "date", "modeofpayment", "totalamt", "discount", "grandtotal"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        imagePanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 610, 261));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/view.png"))); // NOI18N
        jButton1.setText("VIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        imagePanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 117, 40));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/back-arrow.png"))); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        imagePanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 620, 119, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcustidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcustidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcustidActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Are u sure u want to delete?", "delete", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            String sql = "delete from billings where BillNo=?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, txtbillno.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "deleted sucessfuly");
                btnsearch.setVisible(true);
                btnsave.setVisible(true);
                btnsubmit.setVisible(true);
                txtbillno.setText("");
                txtoid.setText("");
//        comboiname.setToolTipText("");
//        txtitemid.setText("");
                combocustname.setToolTipText("");
                txtcustid.setText("");
                ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText("");
                combopay.setToolTipText("");
                txtgamt.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
        try {
            txtbillno.setText("");
            txtoid.setText("");
            combocustname.setToolTipText("");
            txtcustid.setText("");
            ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText("");
            combopay.setToolTipText("");
            txtamt1.setText("");
            txtgamt.setText("");
            txtdiscount.setText("");
            txtoid.setEnabled(true);

            combocustname.setEnabled(true);
            txtcustid.setEnabled(true);
            jDateChooser2.setEnabled(true);
            txtamt1.setEnabled(true);
            txtdiscount.setEnabled(true);
            combopay.setEnabled(true);
            txtgamt.setEnabled(true);
            btndelete.setVisible(false);
            btnsave.setVisible(true);
            btnsearch.setVisible(true);
            Command = SUBMIT;
            String getIDQry = "Select BillNo FROM autogen;";
            pst = conn.prepareStatement(getIDQry);
            rs = pst.executeQuery();

            if (rs.next()) {
                txtbillno.setText(rs.getString("BillNo"));
            } else {
                JOptionPane.showMessageDialog(null, "Unknown Error!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        // TODO add your handling code here:
        if (txtbillno.getText().trim().isEmpty() && txtoid.getText().trim().isEmpty() && combocustname.getSelectedItem().toString().trim().isEmpty() && txtcustid.getText().trim().isEmpty() && ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().trim().isEmpty() && combopay.getSelectedItem().toString().trim().isEmpty() && txtamt1.getText().trim().isEmpty() && txtdiscount.getText().trim().isEmpty() && txtgamt.getText().trim().isEmpty()) {
            txtentbillno.setText("Enter  Bill No");
            txtentorderid.setText("Enter Order ID");
            txtentcombocustname.setText("Enter Customer Name");
            txtentcustid.setText("Enter Customer ID");
            txtentjdatechooser2.setText("Enter Date");
            txtentcombopay.setText("Enter Mode Of Payment");
            txtentamt.setText("Enter amount");
            txtedic.setText(" Enter discount");
            txtegtotal.setText("Enter Grand Total");

        } else if (txtbillno.getText().trim().isEmpty()) {
            txtentbillno.setText("Enter  Bill No");
        } else if (txtoid.getText().trim().isEmpty()) {
            txtentorderid.setText("Enter Order ID");
        } else if (combocustname.getSelectedItem().toString().trim().isEmpty()) {
            txtentcombocustname.setText("Enter Customer Name");
        } else if (txtcustid.getText().trim().isEmpty()) {
            txtentcustid.setText("Enter Customer ID");
        } else if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().trim().isEmpty()) {
            txtentjdatechooser2.setText("Enter Date");
        } else if (combopay.getSelectedItem().toString().trim().isEmpty()) {
            txtentcombopay.setText("Enter Mode Of Payment");
        } else if (txtdiscount.getText().trim().isEmpty()) {
            txtedic.setText(" Enter discount");
        } else if (txtgamt.getText().trim().isEmpty()) {
            txtegtotal.setText("Enter Grand Total");
        } else if (txtamt1.getText().trim().isEmpty()) {
            txtentamt.setText("Enter amount");
        } else {

            try {

                if (Command == SUBMIT) {
                    String sql = "Insert into billings (BillNo,OrderID,CustName,CustID,OrdDate,Payment,TotalAmt,Discounts,GrandTotal)   values (?,?,?,?,?,?,?,?,?)";
                    pst = conn.prepareStatement(sql);
                    pst.setString(1, txtbillno.getText());
                    pst.setString(2, txtoid.getText());

                    pst.setString(3, combocustname.getSelectedItem().toString());
                    pst.setString(4, txtcustid.getText());
                    pst.setString(5, ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText());
                    pst.setString(6, combopay.getSelectedItem().toString());
                    //pst.setString(9,txtgamt.getText());
                    pst.setString(7, txtamt1.getText());
                    pst.setString(8, txtdiscount.getText());
                    pst.setString(9, txtgamt.getText());
                    pst.executeUpdate();

                    String query = "UPDATE printbill SET BillNo=?, Payment=?, OrdDate=?, GrandTotal=?, Discounts=?"
                            + "WHERE OrderId=?";
                    pst = conn.prepareStatement(query);
                    pst.setString(6, txtoid.getText());
                    pst.setString(1, txtbillno.getText());
                    pst.setString(2, combopay.getSelectedItem().toString());
                    pst.setString(3, ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText());
                    pst.setString(4, txtgamt.getText());
                    pst.setString(5, txtdiscount.getText());
                    pst.executeUpdate();
                    
                    String IDUpdateQry = "Update autogen SET BillNo=?";

                    pst = conn.prepareStatement(IDUpdateQry);
                    pst.setString(1, "" + (Integer.parseInt(txtbillno.getText()) + (int) 1));
                    pst.executeUpdate();
                    
                    JOptionPane.showMessageDialog(null, "inserted successfully");
                    btndelete.setVisible(true);
                    btnsearch.setVisible(true);
                    btnsave.setVisible(true);
                    txtbillno.setText("");
                    txtoid.setText("");
                    combocustname.setToolTipText("");
                    txtcustid.setText("");
                    ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText("");
                    combopay.setToolTipText("");
                    txtgamt.setText("");
                }
                txtoid.setEnabled(true);
                combocustname.setEnabled(true);
                txtcustid.setEnabled(true);
                jDateChooser2.setEnabled(true);
                combopay.setEnabled(true);
                txtgamt.setEnabled(true);
                this.setVisible(false);
                new Printbill().setVisible(true);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        setVisible(false);
        HomePage ob = new HomePage();
        ob.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:

        try {

            String sql2 = "SELECT * FROM billings WHERE BillNo='"+txtbillno.getText()+"';";
            pst = conn.prepareStatement(sql2);
            //pst.setString(1, txtbillno.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtbillno.setText(rs.getString("BillNo"));
                txtoid.setText(rs.getString(2));

                combocustname.setSelectedItem(rs.getString(3));
                txtcustid.setText(rs.getString(4));
                jDateChooser2.setDate(rs.getDate(6));
                combopay.setSelectedItem(rs.getString(5));
                txtamt1.setText(rs.getString(7));
                txtdiscount.setText(rs.getString(8));
                txtgamt.setText(rs.getString(9));

            } else {
                JOptionPane.showMessageDialog(null, "incorrect BillNumber");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnsearchActionPerformed

    private void combocustnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocustnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combocustnameActionPerformed

    private void txtoidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtoidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtoidActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        txtbillno.setText("");
        txtoid.setText("");

        combocustname.setToolTipText("");
        txtcustid.setText("");
        ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText("");
        combopay.setToolTipText("");
        txtgamt.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        URL resource = getClass().getResource("/iconandpictures/pexelsbills.jpeg");

        try {
           // System.out.println(Paths.get(resource.toURI()).toFile().getAbsolutePath());
            imagePanel1.setImage(new ImageIcon(resource).getImage(),
                    this.getWidth(), this.getHeight());
        } catch (Exception ex) {
            Logger.getLogger(Categorys.class.getName()).log(Level.SEVERE, null, ex);
        } // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized

    private void txtdiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiscountActionPerformed

    private void btncalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalActionPerformed
        String total = txtamt1.getText();
        Double price = Double.parseDouble(total);
        String dic = txtdiscount.getText();
        Double qty = Double.parseDouble(dic);
        Double tamt =price * (qty*0.01);
        Double discount =price-tamt;
       
        txtgamt.setText("" + discount);
    }//GEN-LAST:event_btncalActionPerformed

    private void txtamt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtamt1ActionPerformed

    private void combocustnameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combocustnameItemStateChanged
        try {
            Connection connL;
            connL = dbconnect.connectdb();
            ResultSet rsL;
            PreparedStatement pstL;
            String SelectedItem = combocustname.getSelectedItem().toString();
            String Qry = "SELECT CustID,OrderID,TotalAmt from orders where CustName = '" + SelectedItem + "' "
                    + "ORDER BY OrderID DESC;";

            pstL = connL.prepareStatement(Qry);
            rsL = pstL.executeQuery();
            if (rsL.next()) {
                txtcustid.setText(rsL.getString("CustID"));
                txtoid.setText(rsL.getString("OrderID"));
                txtamt1.setText(rsL.getString("TotalAmt"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_combocustnameItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Order ob = new Order();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          try
        {
              Statement St = conn.createStatement();
    String query="select * from billings";
    PreparedStatement pstmt=conn.prepareStatement(query);
     rs=pstmt.executeQuery();
     jTable1.setModel(DbUtils.resultSetToTableModel(rs));
}

             catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error:"+e);
             }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
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
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Billing().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncal;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox<String> combocustname;
    private javax.swing.JComboBox<String> combopay;
    private coffee.ImagePanel imagePanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtamt1;
    private javax.swing.JTextField txtbillno;
    private javax.swing.JTextField txtcustid;
    private javax.swing.JTextField txtdiscount;
    private javax.swing.JLabel txtedic;
    private javax.swing.JLabel txtegtotal;
    private javax.swing.JLabel txtentamt;
    private javax.swing.JLabel txtentbillno;
    private javax.swing.JLabel txtentcombocustname;
    private javax.swing.JLabel txtentcombopay;
    private javax.swing.JLabel txtentcustid;
    private javax.swing.JLabel txtentjdatechooser2;
    private javax.swing.JLabel txtentorderid;
    private javax.swing.JTextField txtgamt;
    private javax.swing.JTextField txtoid;
    // End of variables declaration//GEN-END:variables
}
