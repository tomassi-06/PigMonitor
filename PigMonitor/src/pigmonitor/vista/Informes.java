/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pigmonitor.vista;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import pigmonitor.modelo.reportes.AlimentosCSV;
import pigmonitor.modelo.reportes.EnfermedadesCSV;
import pigmonitor.modelo.reportes.InsumosCSV;
import pigmonitor.modelo.reportes.MedicamentosCSV;

/**
 *
 * @author Usuario
 */
public class Informes extends javax.swing.JFrame {

    /**
     * Creates new form Informes
     */
    public Informes() {
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

        jPanel1 = new javax.swing.JPanel();
        loteCheckBox = new javax.swing.JCheckBox();
        alimentoCheckBox = new javax.swing.JCheckBox();
        enfermedadCheckBox = new javax.swing.JCheckBox();
        medicamentoCheckBox = new javax.swing.JCheckBox();
        insumosCheckBox = new javax.swing.JCheckBox();
        informesLabel = new javax.swing.JLabel();
        generarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loteCheckBox.setText("Lote");

        jPanel1.add(loteCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        alimentoCheckBox.setText("Alimento");
        jPanel1.add(alimentoCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        enfermedadCheckBox.setText("Enfermedad");
        jPanel1.add(enfermedadCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        medicamentoCheckBox.setText("Medicamento");
        jPanel1.add(medicamentoCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        insumosCheckBox.setText("Insumos");
        jPanel1.add(insumosCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        informesLabel.setText("Informes");
        jPanel1.add(informesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        generarButton.setText("Generar Informe");
        generarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(generarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarButtonActionPerformed
        // TODO add your handling code here:
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        
        if(alimentoCheckBox.isSelected()){
            AlimentosCSV foodcsv = new AlimentosCSV();
            foodcsv.crearCsv(now.toString());
        }
        if(medicamentoCheckBox.isSelected()){
            MedicamentosCSV medcsv = new MedicamentosCSV();
            medcsv.crearCsv(now.toString());
        }
        if(enfermedadCheckBox.isSelected()){
            EnfermedadesCSV enfcsv = new EnfermedadesCSV();
            enfcsv.crearCsv(now.toString());
        }
        if(insumosCheckBox.isSelected()){
            InsumosCSV inscsv = new InsumosCSV();
            inscsv.crearCsv(now.toString());
        }
    }//GEN-LAST:event_generarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alimentoCheckBox;
    private javax.swing.JCheckBox enfermedadCheckBox;
    private javax.swing.JButton generarButton;
    private javax.swing.JLabel informesLabel;
    private javax.swing.JCheckBox insumosCheckBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox loteCheckBox;
    private javax.swing.JCheckBox medicamentoCheckBox;
    // End of variables declaration//GEN-END:variables
}
