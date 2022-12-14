/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author wmartinl01
 */
public class MiniEncuesta extends javax.swing.JFrame {

    /**
     * Creates new form MiniEncuesta
     */
    public MiniEncuesta() {
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

        grupoBotones = new javax.swing.ButtonGroup();
        panel = new javax.swing.JOptionPane();
        windows = new javax.swing.JRadioButton();
        linux = new javax.swing.JRadioButton();
        mac = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        programacion = new javax.swing.JCheckBox();
        diseñoGrafico = new javax.swing.JCheckBox();
        administracion = new javax.swing.JCheckBox();
        texto = new javax.swing.JLabel();
        horas = new javax.swing.JSlider();
        generar = new javax.swing.JButton();
        valorHoras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        grupoBotones.add(windows);
        windows.setText("Windows");

        grupoBotones.add(linux);
        linux.setText("Linux");

        grupoBotones.add(mac);
        mac.setText("Mac");

        jLabel1.setText("Elige un sistema operativo:");

        jLabel2.setText("Elige la especialidad:");

        programacion.setText("Programación");

        diseñoGrafico.setText("Diseño gráfico");

        administracion.setText("Administración");

        texto.setText("Horas que dedicas al ordenador:");

        horas.setMaximum(10);
        horas.setMinorTickSpacing(10);
        horas.setValue(0);
        horas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                horasStateChanged(evt);
            }
        });

        generar.setText("GENERAR");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });

        valorHoras.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(valorHoras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(administracion)
                            .addComponent(diseñoGrafico)
                            .addComponent(programacion)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(mac)
                            .addComponent(linux)
                            .addComponent(windows)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(texto))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(generar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(windows)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linux)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(programacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diseñoGrafico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(administracion)
                .addGap(18, 18, 18)
                .addComponent(texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorHoras))
                .addGap(18, 18, 18)
                .addComponent(generar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void horasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_horasStateChanged

        valorHoras.setText(String.valueOf(horas.getValue()));
        
    }//GEN-LAST:event_horasStateChanged

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        String sistemaOperativo;
        String especialidad="";
        
        if(windows.isSelected()){
            sistemaOperativo="Windows";
        } else {
            if(linux.isSelected()){
                sistemaOperativo="Linux";
            } else {
                sistemaOperativo="Mac";
            }
        }
        
        if (programacion.isSelected()){
            especialidad = " Programación ";
        }
        if (diseñoGrafico.isSelected()){
            especialidad = especialidad + " Diseño ";
        }
        if (administracion.isSelected()){
            especialidad = especialidad + " Administracion ";
        }
        /*if(programacion.isSelected()){
            especialidad="Programacion";
        } else {
            if(diseñoGrafico.isSelected()){
                especialidad="Diseño Gráfico";
            } else {
                especialidad="Administracion";
            }
        }*/
        
        panel.showMessageDialog(null, "Tu sistema operativo favorito es "+sistemaOperativo+" tus especialidades son "+especialidad+" y el numero de horas dedicadas al ordenador son "+valorHoras.getText());
        
    }//GEN-LAST:event_generarActionPerformed

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
            java.util.logging.Logger.getLogger(MiniEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiniEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiniEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiniEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiniEncuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox administracion;
    private javax.swing.JCheckBox diseñoGrafico;
    private javax.swing.JButton generar;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JSlider horas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton linux;
    private javax.swing.JRadioButton mac;
    private javax.swing.JOptionPane panel;
    private javax.swing.JCheckBox programacion;
    private javax.swing.JLabel texto;
    private javax.swing.JLabel valorHoras;
    private javax.swing.JRadioButton windows;
    // End of variables declaration//GEN-END:variables
}
