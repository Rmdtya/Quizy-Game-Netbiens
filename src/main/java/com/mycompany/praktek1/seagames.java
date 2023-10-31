/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.praktek1;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;  
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class seagames extends javax.swing.JInternalFrame {

    /**
     * Creates new form seagames
     */
    
    public seagames() {
        initComponents();
        TampilkanData();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cabang_olahraga = new javax.swing.JTextField();
        negara = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jumlah_medali = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tampildata = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        close = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        id_data = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setText("Cabang Olahraga");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Sea Games 2023");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel4.setText("Negara");

        cabang_olahraga.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cabang_olahraga.setEnabled(false);
        cabang_olahraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabang_olahragaActionPerformed(evt);
            }
        });

        negara.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        negara.setEnabled(false);
        negara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negaraActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel5.setText("Perolehan Medali");

        jumlah_medali.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jumlah_medali.setEnabled(false);
        jumlah_medali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_medaliActionPerformed(evt);
            }
        });

        tampildata.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tampildata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "ID", "Cabang Olahraga", "Negara", "Perolehan Medali"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tampildata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tampildataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tampildata);

        tambah.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        close.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        id_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_dataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tambah))
                    .addComponent(negara, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlah_medali, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(id_data, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cabang_olahraga, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(id_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(close)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cabang_olahraga, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(negara, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah_medali, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah)
                    .addComponent(clear)
                    .addComponent(update)
                    .addComponent(delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cabang_olahragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabang_olahragaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cabang_olahragaActionPerformed

    private void negaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_negaraActionPerformed

    private void jumlah_medaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_medaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah_medaliActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        EnableTextField();
        
        tambah.setText("Simpan");
       
        try{
            //definisikan variabel
            String inp_cabor = cabang_olahraga.getText();
            String inp_negara = negara.getText();
            int inp_medali = Integer.parseInt(jumlah_medali.getText());
            
            // perintah sql
            String sql_tambah = "INSERT INTO seagames(Cabang_Olahraga, negara, Perolehan_Medali) VALUES('"+inp_cabor+"', '"+inp_negara+"', '"+inp_medali+"')";
        
            //koneksi database
            Connection penghubung = (Connection)KoneksiDatabase.KonfigurasiDB();
            
            //Statement
            PreparedStatement statement = penghubung.prepareStatement(sql_tambah);
            
            //eksekusi
            statement.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
            BersihkanLayar();
            TampilkanData();
            tambah.setText("Tambah");
            
        } catch (Exception e) {
            
        }
        
    }//GEN-LAST:event_tambahActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        BersihkanLayar();
        tambah.setEnabled(true);
        update.setEnabled(false);
        delete.setEnabled(false);
        tambah.setText("Tambah");
    }//GEN-LAST:event_clearActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try {
            //definisikan variabel
            String inp_cabor = cabang_olahraga.getText();
            String inp_negara = negara.getText();
            int inp_medali = Integer.parseInt(jumlah_medali.getText());
            int inp_id = Integer.parseInt(id_data.getText());
            
            // perintah sql
            //String sql_update = "UPDATE seagames SET Cabang_Olahraga = '"+inp_cabor+"', Negara = '"+inp_negara+"', Perolehan_Medali = '"+inp_medali+"' WHERE Cabang_olahraga = '"+inp_cabor+";";
        
            String sql_update = "UPDATE seagames SET Cabang_Olahraga = '"+inp_cabor+"', Negara = '"+inp_negara+"', Perolehan_Medali = '"+inp_medali+"' WHERE no = '"+inp_id+"';";
            //koneksi database
            Connection penghubung = (Connection)KoneksiDatabase.KonfigurasiDB();
            
            //Statement
            PreparedStatement statement = penghubung.prepareStatement(sql_update);
            
            //eksekusi
            statement.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Update");
            BersihkanLayar();
            TampilkanData();
            SetButtonNonActive();
            tambah.setEnabled(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void tampildataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tampildataMouseClicked
        // TODO add your handling code here:
        int baris = tampildata.rowAtPoint(evt.getPoint());
        //int kolom = tampildata.columnAtPoint(evt.getPoint());
        
        tambah.setEnabled(false);

        
        String id = tampildata.getValueAt(baris, 1).toString();
        id_data.setText(id);
//        cabang_olahraga.setText(cabor);
//        GetId(id);
        //public static int id = id;

        String cabor = tampildata.getValueAt(baris, 2).toString();
        cabang_olahraga.setText(cabor);

        String ngr = tampildata.getValueAt(baris, 3).toString();
        negara.setText(ngr);

        String mdl = tampildata.getValueAt(baris, 4).toString();
        jumlah_medali.setText(mdl);

        //        int mdl = (int) tampildata.getValueAt(baris, 4);
        //        jumlah_medali.setText(mdl);
        //        String medali = String.valueOf(mdl);
        //        jumlah_medali.setText(String.valueOf(medali));
        
        SetButtonActive();
        
    }//GEN-LAST:event_tampildataMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        tambah.setEnabled(false);
        try {
            //definisikan variabel
            int inp_id = Integer.parseInt(id_data.getText());
            
            // perintah sql
            //String sql_update = "UPDATE seagames SET Cabang_Olahraga = '"+inp_cabor+"', Negara = '"+inp_negara+"', Perolehan_Medali = '"+inp_medali+"' WHERE Cabang_olahraga = '"+inp_cabor+";";
        
            String sql_update = "DELETE FROM seagames WHERE no = '"+inp_id+"';";
            //koneksi database
            Connection penghubung = (Connection)KoneksiDatabase.KonfigurasiDB();
            
            //Statement
            PreparedStatement statement = penghubung.prepareStatement(sql_update);
            
            //eksekusi
            statement.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
            BersihkanLayar();
            TampilkanData();
            SetButtonNonActive();
            tambah.setEnabled(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void id_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_dataActionPerformed

    public void SetButtonActive(){
        delete.setEnabled(true);
        update.setEnabled(true);
    }
    
    public void SetButtonNonActive(){
        delete.setEnabled(false);
        update.setEnabled(false);
    }
    
    public void EnableTextField(){
        cabang_olahraga.setEnabled(true);
        negara.setEnabled(true);
        jumlah_medali.setEnabled(true);
    }
    
    public void DisableTextField(){
        cabang_olahraga.setEnabled(false);
        negara.setEnabled(false);
        jumlah_medali.setEnabled(false);
    }
    
    public boolean AddMode(){
        return true;
    }


    private void BersihkanLayar(){
        cabang_olahraga.setText("");
        negara.setText("");
        jumlah_medali.setText("");
    }
    
    private void TampilkanData(){
        id_data.setVisible(false);
        SetButtonNonActive();
        DisableTextField();
        
        DefaultTableModel database = new DefaultTableModel();
        database.addColumn("no");
        database.addColumn("id");
        database.addColumn("Cabang Olahraga");
        database.addColumn("Negara");
        database.addColumn("Perolehan Medali");
        
        try {
            //01. Perintah SQL
            String sql_munculkanData = "SELECT * FROM seagames";
            
            //02. Hubungkan Java
            Connection penghubung = (Connection)KoneksiDatabase.KonfigurasiDB();
            
            //03. Statement
            Statement pernyataan_sql = penghubung.createStatement();
            
            //04. Eksekusi SQL
            ResultSet hasil_sql = pernyataan_sql.executeQuery(sql_munculkanData);
            
            int i = 1;
            //05. Munculkan Data
            while(hasil_sql.next()){
                database.addRow(new Object[]{
                   i++,hasil_sql.getString(1), hasil_sql.getString(2), hasil_sql.getString(3), hasil_sql.getString(4)                    
                });
            tampildata.setModel(database);
            }
            
       
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cabang_olahraga;
    private javax.swing.JButton clear;
    private javax.swing.JButton close;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id_data;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlah_medali;
    private javax.swing.JTextField negara;
    private javax.swing.JButton tambah;
    private javax.swing.JTable tampildata;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
