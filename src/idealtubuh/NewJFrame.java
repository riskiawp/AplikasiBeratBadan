/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealtubuh;

import javax.swing.JOptionPane;

/**
 *
 * @author riskiawp
 */
public class NewJFrame extends javax.swing.JFrame {
    String temp = "";
    Double ti,bt,hl;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        etNama = new javax.swing.JTextField();
        etTinggi = new javax.swing.JTextField();
        etBB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbPr = new javax.swing.JRadioButton();
        rbLk = new javax.swing.JRadioButton();
        btHitung = new javax.swing.JButton();
        btCobaLagi = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        etIdeal = new javax.swing.JTextField();
        etHasil = new javax.swing.JTextField();
        etHasil2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 50, 120, 30);

        jLabel3.setText("cm");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 90, 28, 30);

        jLabel4.setText("Berat Badan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 130, 110, 30);
        getContentPane().add(etNama);
        etNama.setBounds(160, 50, 360, 30);
        getContentPane().add(etTinggi);
        etTinggi.setBounds(160, 90, 100, 30);
        getContentPane().add(etBB);
        etBB.setBounds(160, 130, 100, 30);

        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 170, 110, 30);

        buttonGroup1.add(rbPr);
        rbPr.setText("Perempuan");
        getContentPane().add(rbPr);
        rbPr.setBounds(160, 170, 100, 23);

        buttonGroup1.add(rbLk);
        rbLk.setText("Laki-Laki");
        getContentPane().add(rbLk);
        rbLk.setBounds(270, 170, 100, 23);

        btHitung.setText("Hitung");
        btHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHitungActionPerformed(evt);
            }
        });
        getContentPane().add(btHitung);
        btHitung.setBounds(40, 220, 90, 40);

        btCobaLagi.setText("Coba Lagi");
        btCobaLagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCobaLagiActionPerformed(evt);
            }
        });
        getContentPane().add(btCobaLagi);
        btCobaLagi.setBounds(150, 220, 130, 40);

        btExit.setText("Keluar");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        getContentPane().add(btExit);
        btExit.setBounds(300, 220, 110, 40);

        jLabel6.setText("Berat Badan Ideal");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 270, 200, 30);
        getContentPane().add(etIdeal);
        etIdeal.setBounds(160, 270, 70, 30);
        getContentPane().add(etHasil);
        etHasil.setBounds(40, 350, 440, 30);
        getContentPane().add(etHasil2);
        etHasil2.setBounds(40, 390, 440, 30);

        jLabel8.setText("Tinggi");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 90, 100, 30);

        jLabel9.setText("Kg");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(240, 270, 40, 30);

        jLabel10.setText("Kg");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 130, 28, 30);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel1.setText("CEK IDEAL TUBUH");

        jLabel7.setText("Hasil Diagnosa Kesehatan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 570, 450);

        setBounds(0, 0, 580, 492);
    }// </editor-fold>//GEN-END:initComponents

    private void btHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHitungActionPerformed
        if(etBB.getText().equals("")||etTinggi.getText().equals("")||etNama.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Kotak Isian Belum Diisi");
        }else if(rbPr.isSelected()||rbLk.isSelected()){
            try{
                Proses();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Inputan ada Yang Salah");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Pilih Jenis Kelamin Ada");
        }
    }//GEN-LAST:event_btHitungActionPerformed

    private void btCobaLagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCobaLagiActionPerformed
        etNama.setText(null);
        etBB.setText(null);
        etTinggi.setText(null);
        buttonGroup1.clearSelection();
        etIdeal.setText(null);
        etHasil.setText(null);
        etHasil2.setText(null);

    }//GEN-LAST:event_btCobaLagiActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        dispose();
    }//GEN-LAST:event_btExitActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCobaLagi;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btHitung;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField etBB;
    private javax.swing.JTextField etHasil;
    private javax.swing.JTextField etHasil2;
    private javax.swing.JTextField etIdeal;
    private javax.swing.JTextField etNama;
    private javax.swing.JTextField etTinggi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbLk;
    private javax.swing.JRadioButton rbPr;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
                 ti = Double.valueOf(etTinggi.getText());
        bt = Double.valueOf(etBB.getText());
        
        if(rbPr.isSelected()){
            hl = (ti - 100) *1;
        }else if(rbLk.isSelected()){
            hl = (ti-104)*1;
        }
        temp = Double.toString(hl.intValue());
        
        if(hl <bt){
            etIdeal.setText(temp);
            etHasil.setText("Maaf " + etNama.getText() + " , Sepertinya Anda Overweight :( ");
            etHasil2.setText("Banyaklah Berolahraga dan Hindari Makanan Berkolesterol");
        }else if(hl > bt){
            etIdeal.setText(temp);
            etHasil.setText("Maaf " + etNama.getText() + " , Sepertinya Anda UnderWeight :(");
            etHasil2.setText("Banyaklah Mengkonsumsi Makanan yang Berkarbohidrat");
        }else{
            etIdeal.setText(temp);
            etHasil.setText("Maaf " + etNama.getText() + " , Berat Badan Anda Sudah Ideal ");
            etHasil2.setText("Lanjutkan Pola Makan Teratur dan Gaya Hidup Sehat");
        }
    }
}
