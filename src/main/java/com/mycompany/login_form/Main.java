/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
*/
package com.mycompany.login_form;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author JhayJTheGosu
 */
public class Main extends javax.swing.JFrame {
    String path;
    String path2;
    int userClick;
    
    // DATABASE
    Connection conmain = null;
    PreparedStatement pstmain = null;
    ResultSet rs = null;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        // disable the textbox
        txt_studno.setEnabled(false);
        txt_last.setEnabled(false);
        txt_first.setEnabled(false);
        txt_middle.setEnabled(false);
        txt_add.setEnabled(false);
        txt_bday.setEnabled(false);
        jc_dept.setEnabled(false);
        jc_course.setEnabled(false);
        
        btn_upload.setEnabled(false);
        btn_save.setEnabled(false);
        btn_update.setEnabled(false);
    }
    
    public void tableupdate(){
        int c;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conmain = DriverManager.getConnection("jdbc:ucanaccess://JavaLoginClone.accdb");

            String sql = "SELECT * FROM StudInfoTbl";
            pstmain = conmain.prepareStatement(sql);
            rs = pstmain.executeQuery();
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
            dft.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int i =1; i<=c;i++){
                    v2.add(rs.getString("Student"));
                    v2.add(rs.getString("Last-name"));
                    v2.add(rs.getString("First-name"));
                    v2.add(rs.getString("Middle-name"));
                    v2.add(rs.getString("Address"));
                    v2.add(rs.getString("Birthday"));
                    v2.add(rs.getString("Department"));
                    v2.add(rs.getString("Course"));
                    // image column
                    v2.add(rs.getBlob("StudentProfile"));
                }
                dft.addRow(v2);
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
    //
    public void addnewrecord(){
         btn_delete.setEnabled(false);
        btn_update.setEnabled(false);
        edit_btn.setEnabled(false);
        btn_view.setEnabled(false);
        
        btn_upload.setEnabled(true);
        btn_save.setEnabled(true);
        // enable textbox
        txt_studno.setEnabled(true);
        txt_last.setEnabled(true);
        txt_first.setEnabled(true);
        txt_middle.setEnabled(true);
        txt_add.setEnabled(true);
        txt_bday.setEnabled(true);
        jc_dept.setEnabled(true);
        jc_course.setEnabled(true);
        
        // set to empty string
        txt_studno.setText("");
        txt_last.setText("");
        txt_first.setText("");
        txt_middle.setText("");
        txt_add.setText("");
        txt_bday.setText("");
        jc_dept.setSelectedItem(4);
        txt_studno.requestFocus();
        picture.setIcon(null);
    }

    public void disabletextbox(){
        txt_studno.setEnabled(false);
        txt_last.setEnabled(false);
        txt_first.setEnabled(false);
        txt_middle.setEnabled(false);
        txt_add.setEnabled(false);
        txt_bday.setEnabled(false);
        jc_dept.setEnabled(false);
        jc_course.setEnabled(false);
        
        btn_save.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_last = new javax.swing.JTextField();
        txt_first = new javax.swing.JTextField();
        txt_middle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_add = new javax.swing.JTextField();
        txt_bday = new javax.swing.JTextField();
        jc_dept = new javax.swing.JComboBox<>();
        txt_studno = new javax.swing.JTextField();
        picture = new javax.swing.JLabel();
        jc_course = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        btn_view = new javax.swing.JButton();
        btn_upload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImages(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(254, 255, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(102, 102, 102)));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("MS ACCESS DATABASE CONNECTION WITH JAVA NETBEANS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student no.", "Last Name", "First Name", "Middle Name", "Address", "Birthday", "Department", "Course", "Student Profile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setGridColor(new java.awt.Color(255, 254, 255));
        jTable1.setShowGrid(true);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(254, 255, 254));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(0, 204, 255));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel2.setText("Student no.:");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel3.setText("Last name:");

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel4.setText("First name:");

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel5.setText("Middle Name:");

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel7.setText("Birthday:");

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel8.setText("Department:");

        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel9.setText("Course:");

        jc_dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School of Computer Studies", "School of Education", "School of Business Management", "School of Hospitality and Tourism Management", "------------Select Department----------" }));
        jc_dept.setSelectedIndex(4);
        jc_dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_deptActionPerformed(evt);
            }
        });

        txt_studno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_studnoActionPerformed(evt);
            }
        });

        picture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        picture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        picture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        picture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        picture.setPreferredSize(new java.awt.Dimension(170, 149));
        picture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pictureMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_last)
                    .addComponent(txt_first)
                    .addComponent(txt_middle)
                    .addComponent(txt_studno, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_bday, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_add, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jc_dept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jc_course, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_studno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_last, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_middle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_first, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jc_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_bday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jc_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(254, 255, 254));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_save.setBackground(new java.awt.Color(25, 119, 243));
        btn_save.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("Save Record");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(25, 119, 243));
        btn_delete.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete Record");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(25, 119, 243));
        btn_add.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Add New Record");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(25, 119, 243));
        btn_update.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update Record");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(25, 119, 243));
        btn_exit.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        edit_btn.setBackground(new java.awt.Color(25, 119, 243));
        edit_btn.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        edit_btn.setForeground(new java.awt.Color(255, 255, 255));
        edit_btn.setText("Edit Record");
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        btn_view.setBackground(new java.awt.Color(25, 119, 243));
        btn_view.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btn_view.setForeground(new java.awt.Color(255, 255, 255));
        btn_view.setText("view");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });

        btn_upload.setBackground(new java.awt.Color(25, 119, 243));
        btn_upload.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btn_upload.setForeground(new java.awt.Color(255, 255, 255));
        btn_upload.setText("Add/Upload Image");
        btn_upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_save)
                .addGap(18, 18, 18)
                .addComponent(btn_delete)
                .addGap(18, 18, 18)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_view)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btn_upload)
                .addGap(18, 18, 18)
                .addComponent(btn_exit)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_delete)
                    .addComponent(btn_add)
                    .addComponent(btn_update)
                    .addComponent(btn_exit)
                    .addComponent(edit_btn)
                    .addComponent(btn_view)
                    .addComponent(btn_upload))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        txt_studno.setText(model.getValueAt(selectedIndex, 0).toString());
        txt_last.setText(model.getValueAt(selectedIndex, 1).toString());
        txt_first.setText(model.getValueAt(selectedIndex, 2).toString());
        txt_middle.setText(model.getValueAt(selectedIndex, 3).toString());
        txt_add.setText(model.getValueAt(selectedIndex, 4).toString());
        txt_bday.setText(model.getValueAt(selectedIndex, 5).toString());
        jc_dept.setSelectedItem(model.getValueAt(selectedIndex, 6));
        jc_course.setSelectedItem(model.getValueAt(selectedIndex, 7));
        
        Blob imageBlob = (Blob) model.getValueAt(selectedIndex, 8);
        byte[] imageBytes;
        try {
            try {
                imageBytes = imageBlob.getBinaryStream().readAllBytes();
                ImageIcon imageIcon = new ImageIcon(imageBytes);
                picture.setIcon(imageIcon);
                
                //GET THE CURRENT WIDTH AND HEIGHT TO MATCH IN IMAGE
                int labelWidth = picture.getWidth();
                int labelHeight = picture.getHeight();
                
                Image scaledImage = imageIcon.getImage().getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scaledImage);
                picture.setIcon(scaledIcon);
                
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }//GEN-LAST:event_jTable1MouseClicked
    //
    

    private void jc_deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_deptActionPerformed
        // TODO add your handling code here:
        if(jc_dept.getSelectedItem().equals("School of Computer Studies")){
            jc_course.removeAllItems();
            jc_course.addItem("BS. Information Technology");
            jc_course.addItem("BS. Computer Science");
        }
        else if(jc_dept.getSelectedItem().equals("School of Business Management")){
            jc_course.removeAllItems();
            jc_course.addItem("BS. Marketing Management");
            jc_course.addItem("BS. Human Resources and Development");
            jc_course.addItem("BS. Office administration");
        }
        else if(jc_dept.getSelectedItem().equals("School of Hospitality and Tourism Management")){
            jc_course.removeAllItems();
            jc_course.addItem("BS. in Hotel Management");
            jc_course.addItem("BS. in Tourism Management");
        }
        else if(jc_dept.getSelectedItem().equals("School of Education")){
            jc_course.removeAllItems();
            jc_course.addItem("B.S.E Major in English");
            jc_course.addItem("B.S.E Major in Mathematics");
            jc_course.addItem("B.S.E Major in Social Studies");
            jc_course.addItem("B.S.E Major in Filipino");
        }
        else if(jc_dept.getSelectedItem().equals("------------Select Department----------")){
            jc_course.removeAllItems();
        }
    }//GEN-LAST:event_jc_deptActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        System.out.println("fggf");
       
        if(txt_studno.getText().equals("") || txt_last.getText().equals("") || txt_first.getText().equals("") || txt_middle.getText().equals("") || txt_add.getText().equals("")
                || txt_bday.getText().equals("") || jc_dept.getSelectedItem().equals("------------Select Department----------") || jc_course.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please enter requeried fields");
        }
        else {
          
            try {
                String urlmain = "jdbc:ucanaccess://JavaLoginClone.accdb";
                conmain = DriverManager.getConnection(urlmain);
                String studentNumber, lastName, firstName, middleName, address, birthDate, department, course;
                
                studentNumber = txt_studno.getText();
                lastName = txt_last.getText();
                firstName = txt_first.getText();
                middleName = txt_middle.getText();
                address = txt_add.getText();
                birthDate = txt_bday.getText();
                department = (String) jc_dept.getSelectedItem();
                course = (String) jc_course.getSelectedItem();
                try{
                    InputStream s = new FileInputStream(new File(path));
                    
                    String sql = "INSERT into StudInfoTbl([Student], [LAST-NAME], [FIRST-NAME], [MIDDLE-NAME], Address, Birthday, Department, Course, StudentProfile) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";
                    pstmain = conmain.prepareStatement(sql);
                    
                    System.out.println(studentNumber);
                    System.out.println(lastName);
                    System.out.println(firstName);
                    System.out.println(middleName);
                    System.out.println(address);
                    System.out.println(birthDate);
                    System.out.println(department);
                    System.out.println(course);
                    System.out.println(s);
                    
                    pstmain.setString(1, studentNumber);   // STUD-NO
                    pstmain.setString(2, lastName);        // LAST-NAME
                    pstmain.setString(3, firstName);       // FIRST-NAME
                    pstmain.setString(4, middleName);      // MIDDLE-NAME
                    pstmain.setString(5, address);         // Address
                    pstmain.setString(6, birthDate);       // Birthday
                    pstmain.setString(7, department);      // Department
                    pstmain.setString(8, course);          // Course
                    pstmain.setBlob(9, s);
                    pstmain.executeUpdate();
                    JOptionPane.showMessageDialog(rootPane, "Inserted Successfully!");
                    
                     // set to empty string
                    txt_studno.setText("");
                    txt_last.setText("");
                    txt_first.setText("");
                    txt_middle.setText("");
                    txt_add.setText("");
                    txt_bday.setText("");
                    jc_dept.setSelectedItem("------------Select Department----------");
                    txt_studno.requestFocus();
                    picture.setIcon(null);
        
                    tableupdate();
                    // disable the textbox
                    disabletextbox();
                    btn_save.setEnabled(false);
                    btn_upload.setEnabled(false);
                    
                    
                    btn_delete.setEnabled(true);
                    edit_btn.setEnabled(true);
                    btn_view.setEnabled(true);
                }catch(HeadlessException | FileNotFoundException | SQLException e){
                    System.out.println("Error in query " + e);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "The student id is already given");
            }
            
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        if(jTable1.getSelectedRowCount() == 1){
            try {
                String urlmain = "jdbc:ucanaccess://JavaLoginClone.accdb";
                conmain = DriverManager.getConnection(urlmain);
                String sql = "DELETE FROM StudInfoTbl WHERE Student = ?";
                pstmain = conmain.prepareStatement(sql);
                int confirmed = JOptionPane.showConfirmDialog(null,"Do you want to delete?", "Question" , JOptionPane.YES_NO_OPTION);
                if(confirmed == JOptionPane.YES_OPTION){ // check if the user click the ( YES )
                    pstmain.setString(1, txt_studno.getText());   // STUD-NO
                    pstmain.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Recored Deleted");
                    
                    txt_studno.setText("");
                    txt_last.setText("");
                    txt_first.setText("");
                    txt_middle.setText("");
                    txt_add.setText("");
                    txt_bday.setText("");
                    jc_dept.setSelectedItem("------------Select Department----------");
                    txt_studno.requestFocus();
                }
                else{
                    txt_studno.setText("");
                    txt_last.setText("");
                    txt_first.setText("");
                    txt_middle.setText("");
                    txt_add.setText("");
                    txt_bday.setText("");
                    jc_dept.setSelectedItem("------------Select Department----------");
                    picture.setIcon(null);
                    txt_studno.requestFocus();
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        // btn_save.setEnabled(true);
        btn_upload.setText("Add Image");
        userClick = 1;
        addnewrecord();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

    try {
        String urlmain = "jdbc:ucanaccess://JavaLoginClone.accdb";
        conmain = DriverManager.getConnection(urlmain);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        String id = model.getValueAt(selectedRow, 0).toString();

        String studentNumber, lastName, firstName, middleName, address, birthDate, department, course;
        studentNumber = txt_studno.getText();
        lastName = txt_last.getText();
        firstName = txt_first.getText();
        middleName = txt_middle.getText();
        address = txt_add.getText();
        birthDate = txt_bday.getText();
        department = jc_dept.getSelectedItem().toString();
        course = jc_course.getSelectedItem().toString();

            // Update the SQL statement to include the image column
            String sql = "UPDATE StudInfoTbl SET `Student`=?, `Last-name`=?, `First-name`=?, `Middle-name`=?, Address=?, Birthday=?, Department=?, Course=? WHERE `Student`=?";
            pstmain = conmain.prepareStatement(sql);

            // Set values in the prepared statement
            pstmain.setString(1, studentNumber);
            pstmain.setString(2, lastName);
            pstmain.setString(3, firstName);
            pstmain.setString(4, middleName);
            pstmain.setString(5, address);
            pstmain.setString(6, birthDate);
            pstmain.setString(7, department);
            pstmain.setString(8, course);
            pstmain.setString(9, id);
            int k = JOptionPane.showConfirmDialog(rootPane, "Confirm to Update?", "Update", JOptionPane.YES_NO_OPTION);
            if (k == JOptionPane.YES_OPTION) {
                pstmain.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Updated Successfully!");
                txt_studno.setText("");
                txt_last.setText("");
                txt_first.setText("");
                txt_middle.setText("");
                txt_add.setText("");
                txt_bday.setText("");
                jc_dept.setSelectedItem("------------Select Department----------");
                picture.setIcon(null);
                txt_studno.requestFocus();
                
                disabletextbox();
                
                btn_save.setEnabled(false);
                btn_update.setEnabled(false);
                
                btn_delete.setEnabled(true);
                btn_add.setEnabled(true);
                btn_upload.setEnabled(false);
                tableupdate();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Data not Updated!");
            }
        
    } catch (HeadlessException | SQLException e) {
        System.out.println(e);
    } 
        
       
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        LogIn frame5 = new LogIn();
        frame5.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        // TODO add your handling code here:
        userClick = 2;
        btn_upload.setText("Update Image");
        
         txt_studno.setEnabled(false);
        txt_last.setEnabled(true);
        txt_first.setEnabled(true);
        txt_middle.setEnabled(true);
        txt_add.setEnabled(true);
        txt_bday.setEnabled(true);
        jc_dept.setEnabled(true);
        jc_course.setEnabled(true);
        
        btn_upload.setEnabled(true);
        btn_save.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_add.setEnabled(false);
        btn_upload.setEnabled(true);
        btn_update.setEnabled(true);
        try
        {
            String urlmain = "jdbc:ucanaccess://JavaLoginClone.accdb";
            conmain = DriverManager.getConnection(urlmain);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int selectedRow = jTable1.getSelectedRow();
            String id = (model.getValueAt(selectedRow, 0).toString());
            
            String studentNumber, lastName, firstName, middleName, address, birthDate, department, course;
            
            studentNumber = txt_studno.getText();
            lastName = txt_last.getText();
            firstName = txt_first.getText();
            middleName = txt_middle.getText();
            address = txt_add.getText();
            birthDate = txt_bday.getText();
            department = (String) jc_dept.getSelectedItem();
            course = (String) jc_course.getSelectedItem();
            String sql = "UPDATE StudInfoTbl SET `Student`=?, `Last-name`=?, `First-name`=?, `Middle-name`=?, Address=?, Birthday=?, Department=?, Course=? WHERE `Student`=?";
            pstmain = conmain.prepareStatement(sql);
            
            // Correct order for setting values in the prepared statement
            pstmain.setString(1, studentNumber);   // Stud-no
            pstmain.setString(2, lastName);        // Last-name
            pstmain.setString(3, firstName);       // First-name
            pstmain.setString(4, middleName);      // Middle-name
            pstmain.setString(5, address);         // Address
            pstmain.setString(6, birthDate);       // Birthday
            pstmain.setString(7, department);      // Department
            pstmain.setString(8, course);          // Course
            pstmain.setString(9, studentNumber);   // WHERE condition
            
            pstmain.executeUpdate();
            
            txt_studno.setText("");
            txt_last.setText("");
            txt_first.setText("");
            txt_middle.setText("");
            txt_add.setText("");
            txt_bday.setText("");
            jc_dept.setSelectedItem("------------Select Department----------");
            txt_studno.requestFocus();
            picture.setIcon(null);
            tableupdate();
            
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_edit_btnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        tableupdate();
    }//GEN-LAST:event_formWindowActivated

    private void txt_studnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_studnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_studnoActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        txt_studno.setText(model.getValueAt(selectedIndex, 0).toString());
        txt_last.setText(model.getValueAt(selectedIndex, 1).toString());
        txt_first.setText(model.getValueAt(selectedIndex, 2).toString());
        txt_middle.setText(model.getValueAt(selectedIndex, 3).toString());
        txt_add.setText(model.getValueAt(selectedIndex, 4).toString());
        txt_bday.setText(model.getValueAt(selectedIndex, 5).toString());
        jc_dept.setSelectedItem(model.getValueAt(selectedIndex, 6));
        jc_course.setSelectedItem(model.getValueAt(selectedIndex, 7));
        
        String studentNumber, lastName, firstName, middleName, address, birthDate, department, course;
        
        studentNumber = model.getValueAt(selectedIndex, 0).toString();
        lastName = model.getValueAt(selectedIndex, 1).toString();
        firstName = model.getValueAt(selectedIndex, 2).toString();
        middleName = model.getValueAt(selectedIndex, 3).toString();
        address = model.getValueAt(selectedIndex, 4).toString();
        birthDate = model.getValueAt(selectedIndex, 5).toString();
        department = model.getValueAt(selectedIndex, 6).toString();
        course = model.getValueAt(selectedIndex, 7).toString();
        
        viewform vf = new viewform();
        vf.getInfo(studentNumber, lastName, firstName, middleName, address, birthDate, department, course);
        vf.setVisible(true);
        
    }//GEN-LAST:event_btn_viewActionPerformed

    private void pictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureMouseClicked
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_pictureMouseClicked
    public void UpdateImage(){
        Connection conUpdate = null;
        PreparedStatement pstUpdate = null;
        ResultSet rsUpdate = null;
         try {
      String urlmain = "jdbc:ucanaccess://JavaLoginClone.accdb";
      conUpdate = DriverManager.getConnection(urlmain);

      String studentNumber = txt_studno.getText();

      // Choose a file for the new image
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.setDialogTitle("Choose Image File");
      fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

      if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        InputStream imageStream = new FileInputStream(selectedFile);

        // UPDATE FOR IMAGE COLUMN
        String sql = "UPDATE StudInfoTbl SET `Student`=?, StudentProfile=? WHERE `Student`=?";
        pstUpdate = conUpdate.prepareStatement(sql);

        // PARAMETER FOR IMAGE COLUMN AND CONDITION FOR PRIMARY KEY
        pstUpdate.setString(1, studentNumber);
        pstUpdate.setBinaryStream(2, imageStream); // PASSING DATA
        pstUpdate.setString(3, studentNumber); // WHERE condition

        int k = JOptionPane.showConfirmDialog(rootPane, "Confirm to Update?", "Update", JOptionPane.YES_NO_OPTION);
        if (k == JOptionPane.YES_OPTION) {
          pstUpdate.executeUpdate();
          JOptionPane.showMessageDialog(rootPane, "Updated Successfully!");
          txt_studno.setText("");
          txt_last.setText("");
          txt_first.setText("");
          txt_middle.setText("");
          txt_add.setText("");
          txt_bday.setText("");
          jc_dept.setSelectedItem("---Select Department---");
          jc_course.setSelectedItem("-------Select Course--------");
          picture.setIcon(null);
          txt_studno.requestFocus();
          disabletextbox();
           
          btn_save.setEnabled(false);
          btn_update.setEnabled(false);
           
          btn_delete.setEnabled(true);
          btn_add.setEnabled(true);
          btn_upload.setEnabled(true);
          tableupdate();
        } else {
          JOptionPane.showMessageDialog(rootPane, "Data not Updated!");
        }
      }
    } catch (HeadlessException | FileNotFoundException | SQLException e) {
      System.out.println("UPDATE : "+e);
    }
    }
   
   public void UploadImage(){
        JFileChooser imagePicked = new JFileChooser();
        imagePicked.showOpenDialog(null);
        File file = imagePicked.getSelectedFile();
        path = file.getAbsolutePath();
        try{
            BufferedImage Bimage = ImageIO.read(new File(path));
            Image img = Bimage.getScaledInstance(149, 170, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            picture.setIcon(icon);
            path2 = path;
        }catch(IOException e){
            System.out.println(e);
        }
   }
    private void btn_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uploadActionPerformed

        switch (userClick) {
            case 2 -> {
                btn_upload.setText("Update Image");
                UpdateImage();
            }
            case 1 -> {
                 btn_upload.setText("Add Image");
                UploadImage();
                
            }
            default -> {
            }
        }
        

    }//GEN-LAST:event_btn_uploadActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_upload;
    private javax.swing.JButton btn_view;
    private javax.swing.JButton edit_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jc_course;
    private javax.swing.JComboBox<String> jc_dept;
    private javax.swing.JLabel picture;
    private javax.swing.JTextField txt_add;
    private javax.swing.JTextField txt_bday;
    private javax.swing.JTextField txt_first;
    private javax.swing.JTextField txt_last;
    private javax.swing.JTextField txt_middle;
    private javax.swing.JTextField txt_studno;
    // End of variables declaration//GEN-END:variables
}
