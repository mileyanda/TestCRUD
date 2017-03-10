/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;

/**
 *
 * @author Yanda
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    
    String nol_jam = "";
    String nol_menit = "";
    String nol_detik = "";
    
    public frmMain() {
        initComponents();
          setTanggal();
        setJam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rdLaki = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtKelas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rdPerempuan = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTempatLahir = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        Tanggal = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labeltanggal = new javax.swing.JLabel();
        labeljam = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        txtNama1 = new javax.swing.JTextField();
        txtNama2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(null);

        buttonGroup1.add(rdLaki);
        rdLaki.setText("Laki-Laki");
        jPanel1.add(rdLaki);
        rdLaki.setBounds(10, 270, 90, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Kelas");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 300, 40, 30);
        jPanel1.add(txtKelas);
        txtKelas.setBounds(10, 330, 200, 30);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 450, 200, 100);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Alamat");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 420, 50, 30);
        jPanel1.add(txtEmail);
        txtEmail.setBounds(10, 390, 200, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Email");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 360, 40, 30);

        buttonGroup1.add(rdPerempuan);
        rdPerempuan.setText("Perempuan");
        jPanel1.add(rdPerempuan);
        rdPerempuan.setBounds(110, 270, 100, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Jenis Kelamin");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 240, 120, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("Tanggal Lahir");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 180, 120, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setText("Tempat Lahir");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 120, 120, 30);

        txtTempatLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempatLahirActionPerformed(evt);
            }
        });
        jPanel1.add(txtTempatLahir);
        txtTempatLahir.setBounds(10, 150, 200, 30);
        jPanel1.add(txtNama);
        txtNama.setBounds(10, 90, 200, 30);
        jPanel1.add(Tanggal);
        Tanggal.setBounds(10, 210, 190, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("NIS");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 0, 50, 30);
        jPanel1.add(txtNIS);
        txtNIS.setBounds(10, 30, 200, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Nama");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 60, 50, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 100, 220, 560);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The Real Informatic Schools");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 50, 220, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM BIODATA SISWA SMK TELKOM");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 10, 440, 40);

        labeltanggal.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        labeltanggal.setForeground(new java.awt.Color(255, 255, 255));
        labeltanggal.setText("Tanggal");
        jPanel2.add(labeltanggal);
        labeltanggal.setBounds(690, 10, 110, 30);

        labeljam.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        labeljam.setForeground(new java.awt.Color(255, 255, 255));
        labeljam.setText("Jam");
        jPanel2.add(labeljam);
        labeljam.setBounds(690, 50, 110, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 930, 90);

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(null);

        btnAdd.setText("SAVE");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdd);
        btnAdd.setBounds(130, 10, 100, 30);

        jButton5.setText("EDIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(590, 10, 100, 30);

        jButton4.setText("REFRESH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(10, 10, 110, 30);

        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(240, 10, 110, 30);

        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(360, 10, 110, 30);

        jButton6.setText("PRINT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(480, 10, 100, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(230, 100, 700, 50);

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));
        jPanel4.setLayout(null);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NamaSiswa", "TempatLahir", "TanggalLahir", "JenisKelamin", "Kelas", "Email", "Alamat"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(10, 0, 680, 480);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(230, 160, 700, 500);
        getContentPane().add(txtNama1);
        txtNama1.setBounds(10, 200, 200, 30);
        getContentPane().add(txtNama2);
        txtNama2.setBounds(10, 200, 200, 30);

        setBounds(0, 0, 946, 702);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(Tanggal.getDate());
       String JK = "";
       
        String nis = txtNIS.getText();
        String nama = txtNama.getText();
        String tl = txtTempatLahir.getText();
        String kelas = txtKelas.getText();
        String email = txtEmail.getText();
        String alamat = txtAlamat.getText();
        
        if (rdLaki.isSelected()) {
            JK = "L";
        } else {
            JK = "P";
        }
        
                    
        if(txtNIS.getText().equals("") || 
           txtNama.getText().equals("") ||
                txtTempatLahir.getText().equals("") ||
                        tanggal.equals("") ||
                JK.equals("") ||
                txtKelas.getText().equals("")||
              txtEmail.getText().equals("") ||
                txtAlamat.getText().equals("")){
            
            JOptionPane.showMessageDialog(this, "Harap Lengkai Data", "Error",
                    JOptionPane.WARNING_MESSAGE);
        }else{
            String SQL ="INSERT INTO t_siswa (NIS,NamaSiswa,TempatLahir,TanggalLahir,JenisKelamin,Kelas,Email,Alamat)" 
                    + "VALUES('"+txtNIS.getText()+"','"+txtNama.getText()+"','"+txtTempatLahir.getText()+"','"+tanggal+"','"+JK+"',"
                    + "'"+txtKelas.getText()+"','"+txtEmail.getText()+"','"+txtAlamat.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris != -1){
            String NIS = tblData.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1){
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(Tanggal.getDate());
              
        txtNIS.setText("");
        txtNama.setText("");
        txtTempatLahir.setText("");
        Tanggal.setDate(null);
        buttonGroup1.clearSelection();
        txtKelas.setText("");
        txtEmail.setText("");
        txtAlamat.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_jButton4ActionPerformed
public void selectData() {
            String kolom[] = {"NIS","NamaSiswa","TempatLahir","TanggalLahir","JenisKelamin","Kelas","Email","Alamat"};
            DefaultTableModel dtm = new DefaultTableModel(null, kolom);
            String SQL = "SELECT * FROM t_siswa";
            ResultSet rs = KoneksiDB.executeQuery(SQL);
            try{
                while(rs.next()) {
                    String NIS = rs.getString(1);
                    String NamaSiswa = rs.getString(2);
                    String TempatLahir = rs.getString(3);
                    String TanggalLahir = rs.getString(4);
                    String JenisKelamin = "";
                    if ("L".equals(rs.getString(5))){
                        JenisKelamin = "Laki-Laki";
                    }else {
                        JenisKelamin = "Perempuan";
                    }
                    String Kelas = rs.getString(6);
                    String Email = rs.getString(7);
                    String Alamat = rs.getString(8);
                    String data[] = {NIS,NamaSiswa,TempatLahir,TanggalLahir,JenisKelamin,Kelas,Email,Alamat};
                    dtm.addRow(data);
                }
            } catch (SQLException ex){
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            tblData.setModel(dtm);
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         if("".equals(txtNIS.getText()) ||
            "".equals(txtNama.getText()) || 
            "".equals(txtTempatLahir.getText()) ||
            "".equals(txtKelas.getText()) || 
            "".equals(txtAlamat.getText()) ||
            "".equals(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data","Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String JK = "";
                if (rdLaki.isSelected()) {
                    JK = "L";
                } else {
                    JK = "P";
                }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(Tanggal.getDate());
            String SQL = "UPDATE t_siswa SET "
                    + "NamaSiswa='"+txtNama.getText()+"',"+
                    "TempatLahir='"+txtTempatLahir.getText()+"',"+
                    "TanggalLahir='"+tanggal+"',"+
                    "JenisKelamin='"+JK+"',"+
                    "Kelas='"+txtKelas.getText()+"',"+
                    "Email='"+txtEmail.getText()+"',"+
                    "Alamat='"+txtAlamat.getText()+"'"+
                    "WHERE NIS='"+txtNIS.getText()+"'";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
    }       
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            txtNIS.setText(tblData.getValueAt(baris, 0).toString());
            txtNIS.setEditable(false);
            txtNama.setText(tblData.getValueAt(baris,1).toString());
            txtTempatLahir.setText(tblData.getValueAt(baris, 2).toString());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal = tblData.getValueAt(baris, 3).toString();
            Date tgl;
            try {
                tgl = dateFormat.parse(tanggal);
                Tanggal.setDate(tgl);
            }catch (ParseException ex){
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null,ex);
            }
            String JK = tblData.getValueAt(baris, 4).toString();
            if (JK.equals("Laki-laki")){
                rdLaki.setSelected(true);
            }else {
                rdPerempuan.setSelected(true);
            }
            txtKelas.setText(tblData.getValueAt(baris, 5).toString());
            txtEmail.setText(tblData.getValueAt(baris, 6).toString());
            txtAlamat.setText(tblData.getValueAt(baris, 7).toString());
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new  MessageFormat("Biodata Siswa SMK Telkom Malang");
        MessageFormat  footer = new MessageFormat("Page {0,number,integer}        ");
        try{
            tblData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
            
        }catch (java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n", e.getMessage());
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtTempatLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempatLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempatLahirActionPerformed
       public void setTanggal(){
           java.util.Date skrg = new java.util.Date();
           java.text.SimpleDateFormat kal = new
            java.text.SimpleDateFormat("dd/MM/yyyy");
           labeltanggal.setText(kal.format(skrg));
       } 
      public void setJam() {
    ActionListener taskPerformer = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            Date dt = new Date();
            int nilai_jam = dt.getHours();
            int nilai_menit = dt.getMinutes();
            int nilai_detik = dt.getSeconds();
            if(nilai_jam <= 9){
                nol_jam = "0";
            }
            if(nilai_menit <= 9){
                nol_menit = "0";
            }
            if(nilai_detik <= 9){
                nol_detik = "0";
            }
                
            String jam = nol_jam + Integer.toString(nilai_jam);
            String menit = nol_menit + Integer.toString(nilai_menit);
            String detik = nol_detik + Integer.toString(nilai_detik);
            labeljam.setText("Jam " +jam+ ":" +menit+ ":" +detik);
            
        }
    };
    new Timer(100, taskPerformer).start();
      }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Tanggal;
    private javax.swing.JButton btnAdd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labeljam;
    private javax.swing.JLabel labeltanggal;
    private javax.swing.JRadioButton rdLaki;
    private javax.swing.JRadioButton rdPerempuan;
    private javax.swing.JTable tblData;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNama1;
    private javax.swing.JTextField txtNama2;
    private javax.swing.JTextField txtTempatLahir;
    // End of variables declaration//GEN-END:variables
}
