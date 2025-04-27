
package DataSiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Form extends javax.swing.JFrame {
public Connection con;
public Statement st;
public ResultSet rs;
public DefaultTableModel model;
    /**
     * Creates new form Form
     */
    public Form() { 
        initComponents();
        String[] header = {"NIPD", "NAMA", "JURUSAN", "ALAMAT"}; //daftar nama kolom pada table db
        model = new DefaultTableModel (header, 0); //membuat model table terbaru sesuai header dimulai dari 0
        tabel.setModel(model); //Menghubungkan model yang baru dibuat tadi ke komponen tabel
        insert();
    }
    
    public void insert() {
        KoneksiDatabase kon = new KoneksiDatabase(); 
        try {
            con = KoneksiDatabase.getKoneksi(); //Membuat objek baru  (con) dari class KoneksiDatabase, Mengambil koneksi ke database menggunakan getKoneksi().
            st = con.createStatement(); //membuat statement sql untuk menjalankan query
            rs = st.executeQuery("SELECT * FROM tbl_data2");  //Menjalankan query SELECT semua data dari tabel tbl_data2.   
            while(rs.next()) { 
                String[] row = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)}; //➡Ambil isi kolom ke-1, 2, 3, 4 dari baris saat ini di ResultSet, lalu taruh ke array row.
                model.addRow(row); //Menambahkan array row tadi ke tabel model (DefaultTableModel)
            }
        tabel.setModel(model);
    } catch(SQLException e) { //Kalau terjadi error SQL (contohnya koneksi gagal, query salah),
            System.out.println("gagal " +e.getMessage());
}}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
        jLabel6 = new javax.swing.JLabel();

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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel6)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(input_nipd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel6))
        );

        pack();
    }// </editor-fold>                        

    private void input_nipdActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void input_namaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void input_alamatActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void input_jurusanActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        
        
         try{
            String url="jdbc:mysql://localhost:3306/db_siswa"; //koneksi ke database
            String user="root"; //username
            String pass=""; //password
            String query = "INSERT INTO tbl_data2 VALUES (?, ?, ?, ?)"; //membuat perintah untuk memasukkan data ke tabel tbl_data2,dengan 4 data yang nanti diisi menggunakan PreparedStatement supaya aman dan terhindar dari SQL Injection.
            Class.forName("com.mysql.jdbc.Driver"); //Memuat/mendaftarkan driver JDBC MySQL ke program Java, supaya Java bisa terhubung ke database MySQL.
            
            con=DriverManager.getConnection(url, user, pass); //membuka koneksi ke database MySQL, dengan: url, username, dan password
            st=con.createStatement(); //Membuat Statement SQL dari koneksi con tadi, supaya kamu bisa mengirim query SQL ke database.
            
            PreparedStatement sta = con.prepareStatement(query); ///mempersiapkan query sql agar bisa di isi 1/1
            sta.setString(1, input_nipd.getText()); //mengisi nilai "?" di query berdasarkan input dari form
            sta.setString(2, input_nama.getText()); //mengisi nilai "?" di query berdasarkan input dari form
            sta.setString(3, input_jurusan.getText()); //mengisi nilai "?" di query berdasarkan input dari form
            sta.setString(4, input_alamat.getText()); //mengisi nilai "?" di query berdasarkan input dari form
             sta.execute(); //Menjalankan query tersebut ke database. (data baru di tambahkan ke tabel)
             
             JOptionPane.showMessageDialog(null, "Data berhasil Diinputkan"); //mssg jika data acc ke database
        }catch(Exception e){
            System.out.println("gagal "+e.getMessage()); //mssg jika data gagal ke database
        }
         //UPDATE TABEL AUTOMATIC (Mengupdate tabel secara otomatis apa bila ada perubahan
          String[] header = {"NIPD", "NAMA", "JURUSAN", "ALAMAT"};
        model = new DefaultTableModel (header, 0);
        tabel.setModel(model);
        insert();
    }                                      

    private void btnPreviewActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //UPDATE TABEL AUTOMATIC (Mengupdate tabel secara otomatis apa bila ada perubahan
        String[] header = {"NIPD", "NAMA", "JURUSAN", "ALAMAT"};
        model = new DefaultTableModel (header, 0);
        tabel.setModel(model);
        insert();
    }                                          

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        
        int baris = tabel.rowAtPoint(evt.getPoint()); //untuk menentukan baris keberapa yang diklik di tabel
        
        String nipd = tabel.getValueAt(baris, 0).toString();
        input_nipd.setText(nipd); //Ambil nilai kolom ke-0 (kolom pertama, NIPD) dari baris yang diklik, lalu tampilkan ke field input_nipd.
        
        String nama = tabel.getValueAt(baris, 1).toString();
        input_nama.setText(nama); //Ambil nilai kolom ke-1 (NAMA) dari baris yang diklik, lalu tampilkan ke field input_nama.
        
        String jurusan = tabel.getValueAt(baris, 2).toString();
        input_jurusan.setText(jurusan); //Ambil nilai kolom ke-2 (JURUSAN) dari baris yang diklik, lalu tampilkan ke field input_jurusan.
        
        String alamat = tabel.getValueAt(baris, 3).toString();
        input_alamat.setText(alamat); ////Ambil nilai kolom ke-3 (ALAMAT) dari baris yang diklik, lalu tampilkan ke field input_alamat.
    }                                  

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        con = KoneksiDatabase.getKoneksi(); //Membuat objek baru  (con) dari class KoneksiDatabase, Mengambil koneksi ke database menggunakan getKoneksi().
        
        try {
            String sql = "UPDATE tbl_data2 SET nama='" +input_nama.getText()+ //Membuat query SQL untuk mengupdate data di tabel tbl_data2
                    "',jurusan ='" +input_jurusan.getText()+ //jurusan dengan nilai dari input_jurusan
                    "',alamat ='" +input_alamat.getText()+"'"+ //alamat dengan nilai dari input_alamat
                    "WHERE nipd ='" +input_nipd.getText()+"'"; //Tapi baris yang nipd-nya sama dengan nilai dari input_nipd.
            
            PreparedStatement sta = con.prepareStatement(sql);
            sta.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Edit");  //mssg jika data berhasil di edit
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Data Gagal Di Edit" +e.getMessage()); //mssg jika data gagal di edit
        }
        //UPDATE TABEL AUTOMATIC (Mengupdate tabel secara otomatis apa bila ada perubahan
         String[] header = {"NIPD", "NAMA", "JURUSAN", "ALAMAT"};
        model = new DefaultTableModel (header, 0);
        tabel.setModel(model);
        insert();
    }                                         

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
         con = KoneksiDatabase.getKoneksi();
try {
            String sql = "DELETE FROM tbl_data2 WHERE nipd  ='" +input_nipd.getText() + "'"; //query sql delete data berdasarkan nipd
            
        PreparedStatement sta = con.prepareStatement(sql);
        sta.execute();
        JOptionPane.showMessageDialog(null, "Data Berhasil dihapus"); //mssg jika data berhasil di hapus
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus" + e.getMessage()); //mssg jika data gagal di hapus
        }
        //UPDATE TABEL AUTOMATIC (Mengupdate tabel secara otomatis apa bila ada perubahan
       String[] header = {"NIPD","NAMA","JURUSAN","ALAMAT"};
        model=new DefaultTableModel(header, 0);
        tabel.setModel(model);
        insert();
    }                                         

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

    // Variables declaration - do not modify                     
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabel;
    // End of variables declaration                   
}
