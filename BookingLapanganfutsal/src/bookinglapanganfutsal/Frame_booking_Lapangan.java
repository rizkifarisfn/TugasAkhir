package bookinglapanganfutsal;
//import java.awt.event.KeyEvent;
import java.text.NumberFormat;

public class Frame_booking_Lapangan extends javax.swing.JFrame {
    double nama,harga,jmlhjual,total;
    Model_booking penjualan = new Model_booking();
    
    /**
     * Model lapangan
     */
    public Frame_booking_Lapangan() {
        initComponents();
        tblBarang.setModel(penjualan.getTabel());
//          kode item
        kode.addItem("Lapangan A");
        kode.addItem("Lapangan B");
        kode.addItem("Lapangan C");
        kode.addItem("Lapangan D");
        
        for (int a=1; a<=31; a++){
            Tgl.addItem(a);
        } 
        
        Bln.addItem("Januari");
        Bln.addItem("Februari");
        Bln.addItem("Maret");
        Bln.addItem("April");
        Bln.addItem("Mei");
        Bln.addItem("Juni");
        Bln.addItem("Juli");
        Bln.addItem("Agustus");
        Bln.addItem("September");
        Bln.addItem("Oktober");
        Bln.addItem("November");
        Bln.addItem("Desember");
        
        for (int b=2019; b<=2020; b++){
            Thn.addItem(b);
        }

        Jam1.addItem("08.00");
        Jam1.addItem("09.00");
        Jam1.addItem("10.00");
        Jam1.addItem("11.00");
        Jam1.addItem("12.00");
        Jam1.addItem("13.00");
        Jam1.addItem("14.00");
        Jam1.addItem("15.00");
        Jam1.addItem("15.00");
        Jam1.addItem("16.00");
        Jam1.addItem("17.00");
        Jam1.addItem("18.00");
        Jam1.addItem("19.00");
        Jam1.addItem("20.00");
        Jam1.addItem("21.00");
        Jam1.addItem("22.00");
        Jam1.addItem("23.00");
        Jam1.addItem("24.00");
        
        Jam2.addItem("08.00");
        Jam2.addItem("09.00");
        Jam2.addItem("10.00");
        Jam2.addItem("11.00");
        Jam2.addItem("12.00");
        Jam2.addItem("13.00");
        Jam2.addItem("14.00");
        Jam2.addItem("15.00");
        Jam2.addItem("15.00");
        Jam2.addItem("16.00");
        Jam2.addItem("17.00");
        Jam2.addItem("18.00");
        Jam2.addItem("19.00");
        Jam2.addItem("20.00");
        Jam2.addItem("21.00");
        Jam2.addItem("22.00");
        Jam2.addItem("23.00");
        Jam2.addItem("24.00");
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        kode = new javax.swing.JComboBox();
        Tgl = new javax.swing.JComboBox();
        Bln = new javax.swing.JComboBox();
        Thn = new javax.swing.JComboBox();
        Jam1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        Jam2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnPesan = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("BOOKING LAPANGAN FUTSAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 330, 60));

        kode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lapangan A", "Lapangan B", "Lapangan C", "Lapangan D" }));
        kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeActionPerformed(evt);
            }
        });
        getContentPane().add(kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 280, -1));

        Tgl.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Tgl.setToolTipText("");
        Tgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TglActionPerformed(evt);
            }
        });
        getContentPane().add(Tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        Bln.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Bln, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        Thn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Thn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        Jam1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Jam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jLabel2.setText("Sampai");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 50, 20));

        Jam2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Jam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("KODE BOOKING");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText(" TANGGAL BOOKING");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 190, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("JAM MAIN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, -1));

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 280, -1));

        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 280, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("NAMA PEMESAN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 110, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("NO. HANDPHONE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 110, -1));

        btnPesan.setText("PESAN");
        btnPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesanActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblBarang);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeActionPerformed

    private void TglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TglActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    txtNo.setText("");
    txtNama.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanActionPerformed
        String[] data = new String[5];
        data[0] = (""+kode.getSelectedItem());
        data[1] = (""+Tgl.getSelectedItem()+"-"+Bln.getSelectedItem()+"-"+Thn.getSelectedItem());
        data[2] = (""+Jam1.getSelectedItem()+"-"+Jam2.getSelectedItem());
        data[3] = txtNama.getText();
        data[4] = txtNo.getText();
        
        penjualan.getTabel().addRow(data);
    }//GEN-LAST:event_btnPesanActionPerformed

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_booking_Lapangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_booking_Lapangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_booking_Lapangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_booking_Lapangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Frame_booking_Lapangan().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Bln;
    private javax.swing.JComboBox Jam1;
    private javax.swing.JComboBox Jam2;
    private javax.swing.JComboBox Tgl;
    private javax.swing.JComboBox Thn;
    private javax.swing.JButton btnPesan;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox kode;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNo;
    // End of variables declaration//GEN-END:variables
}