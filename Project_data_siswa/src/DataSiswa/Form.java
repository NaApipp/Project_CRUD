/*Package Name*/
package DataSiswa;
/*Untuk Memanggil beberapa variable dari "JDBC MySql Connection"*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/*Nama Class*/
public class Form extends javax.swing.JFrame {
    /*Variable Connect To Database*/
public Connection con;
public Statement st;
public ResultSet rs;
public DefaultTableModel model;
    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
        String[] header = {"NIPD", "NAMA", "JURUSAN", "ALAMAT"};
        model = new DefaultTableModel (header, 0);
        tabel.setModel(model);
        insert();
    }
    /*Syntax Untuk Menampilkan data ke dalam tabel*/
    public void insert() {
        KoneksiDatabase kon = new KoneksiDatabase();
        try {
            con = KoneksiDatabase.getKoneksi();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM tbl_data2");
            while(rs.next()) {
                String[] row = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                model.addRow(row);
            }
        tabel.setModel(model);
    } catch(SQLException e) {
            System.out.println("gagal " +e.getMessage());
}}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        input_nipd = new java.awt.TextField();
        input_nama = new java.awt.TextField();
        input_alamat = new java.awt.TextField();
        input_jurusan = new java.awt.TextField();
        btnAdd = new java.awt.Button();
        btnDelete = new java.awt.Button();
        btnChange = new java.awt.Button();
        btnPreview = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Form Data SIswa");

        jLabel2.setText("NIPD");

        jLabel3.setText("NAMA");

        jLabel4.setText("JURUSAN");

        jLabel5.setText("ALAMAT");

        input_nipd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nipdActionPerformed(evt);
            }
        });

        input_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_namaActionPerformed(evt);
            }
        });

        input_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_alamatActionPerformed(evt);
            }
        });

        input_jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_jurusanActionPerformed(evt);
            }
        });

        btnAdd.setLabel("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setLabel("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnChange.setLabel("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnPreview.setLabel("Preview");
        btnPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviewActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(input_nipd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(input_nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(input_jurusan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(input_alamat, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2))
                    .addComponent(input_nipd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input_jurusan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input_alamat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_nipdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nipdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nipdActionPerformed

    private void input_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_namaActionPerformed

    private void input_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_alamatActionPerformed

    private void input_jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_jurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_jurusanActionPerformed


    /*Syntax untuk button tambah / add*/
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        
         try{
             /*Untuk memilih database mana yang akan di gunakan*/
            String url="jdbc:mysql://localhost:3306/db_siswa";
            String user="root";
            String pass="";
            String query = "INSERT INTO tbl_data2 VALUES (?, ?, ?, ?)";
            Class.forName("com.mysql.jdbc.Driver");
            
            con=DriverManager.getConnection(url, user, pass);
            st=con.createStatement();
            
            PreparedStatement sta = con.prepareStatement(query);
            sta.setString(1, input_nipd.getText());
            sta.setString(2, input_nama.getText());
            sta.setString(3, input_jurusan.getText());
            sta.setString(4, input_alamat.getText());
             sta.execute();
             
             JOptionPane.showMessageDialog(null, "berhasil");
        }catch(Exception e){
            System.out.println("gagal "+e.getMessage());
        }
         /*Update Tabel Secara Otomatis*/
          String[] header = {"NIPD", "NAMA", "JURUSAN", "ALAMAT"};
        model = new DefaultTableModel (header, 0);
        tabel.setModel(model);
        insert();
    }//GEN-LAST:event_btnAddActionPerformed



    /*Syntax Untuk Button Preview*/
    private void btnPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviewActionPerformed
        // TODO add your handling code here:
        
        String[] header = {"NIPD", "NAMA", "JURUSAN", "ALAMAT"};
        model = new DefaultTableModel (header, 0);
        tabel.setModel(model);
        insert();
    }//GEN-LAST:event_btnPreviewActionPerformed



    /*Syntax untuk tabel (yg berfungsi untuk ketika kita klik data yang ada di tabel dapat muncul pada kolom TextField)*/
    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        
        int baris = tabel.rowAtPoint(evt.getPoint());
        
        String nipd = tabel.getValueAt(baris, 0).toString();
        input_nipd.setText(nipd);
        
        String nama = tabel.getValueAt(baris, 1).toString();
        input_nama.setText(nama);
        
        String jurusan = tabel.getValueAt(baris, 2).toString();
        input_jurusan.setText(jurusan);
        
        String alamat = tabel.getValueAt(baris, 3).toString();
        input_alamat.setText(alamat);
    }//GEN-LAST:event_tabelMouseClicked





    /*Syntax Button Change / Update*/
    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        // TODO add your handling code here:
        con = KoneksiDatabase.getKoneksi();
        
        try {
            String sql = "UPDATE tbl_data2 SET nama='" +input_nama.getText()+
                    "',jurusan ='" +input_jurusan.getText()+
                    "',alamat ='" +input_alamat.getText()+"'"+
                    "WHERE nipd ='" +input_nipd.getText()+"'";
            
            PreparedStatement sta = con.prepareStatement(sql);
            sta.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Di Edit");
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "gagal di edit" +e.getMessage());
        }
        /*Update Tabel Secara Otomatis*/
         String[] header = {"NIPD", "NAMA", "JURUSAN", "ALAMAT"};
        model = new DefaultTableModel (header, 0);
        tabel.setModel(model);
        insert();
    }//GEN-LAST:event_btnChangeActionPerformed





    /*Syntax untuk Button Delete*/
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         con = KoneksiDatabase.getKoneksi();
try {
            String sql = "DELETE FROM tbl_data2 WHERE nipd  ='" +input_nipd.getText() + "'";
            
        PreparedStatement sta = con.prepareStatement(sql);
        sta.execute();
        JOptionPane.showMessageDialog(null, "Berhasil menghapus Brokk");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal hapus brokk" + e.getMessage());
        }
        //script update tabel
       String[] header = {"NIPD","NAMA","JURUSAN","ALAMAT"};
        model=new DefaultTableModel(header, 0);
        tabel.setModel(model);
        insert();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAdd;
    private java.awt.Button btnChange;
    private java.awt.Button btnDelete;
    private java.awt.Button btnPreview;
    private java.awt.TextField input_alamat;
    private java.awt.TextField input_jurusan;
    private java.awt.TextField input_nama;
    private java.awt.TextField input_nipd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
