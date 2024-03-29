package proyecto1programacion2;
public class Reportes extends javax.swing.JFrame {

    /**
     * Creates new form Reportes
     */
    public Reportes() {
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

        ListarEventos = new javax.swing.JToggleButton();
        EventosFuturos = new javax.swing.JToggleButton();
        EventosCancelados = new javax.swing.JToggleButton();
        IngresoFecha = new javax.swing.JToggleButton();
        PerfilUsuario = new javax.swing.JToggleButton();
        BotonMenuPrincipal = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListarEventos.setText("Listar eventos realizados.");
        ListarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarEventosActionPerformed(evt);
            }
        });

        EventosFuturos.setText(" Listar eventos futuros");
        EventosFuturos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventosFuturosActionPerformed(evt);
            }
        });

        EventosCancelados.setText("Listar eventos cancelados");
        EventosCancelados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventosCanceladosActionPerformed(evt);
            }
        });

        IngresoFecha.setText("Ingreso generado por fecha");
        IngresoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoFechaActionPerformed(evt);
            }
        });

        PerfilUsuario.setText("Ver Perfil Usuario");
        PerfilUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilUsuarioActionPerformed(evt);
            }
        });

        BotonMenuPrincipal.setText("Volver Al Menu Principal");
        BotonMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListarEventos)
                    .addComponent(EventosFuturos)
                    .addComponent(EventosCancelados)
                    .addComponent(IngresoFecha)
                    .addComponent(PerfilUsuario)
                    .addComponent(BotonMenuPrincipal))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ListarEventos)
                .addGap(18, 18, 18)
                .addComponent(EventosFuturos)
                .addGap(18, 18, 18)
                .addComponent(EventosCancelados)
                .addGap(18, 18, 18)
                .addComponent(IngresoFecha)
                .addGap(18, 18, 18)
                .addComponent(PerfilUsuario)
                .addGap(18, 18, 18)
                .addComponent(BotonMenuPrincipal)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarEventosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ListarEventosActionPerformed

    private void EventosFuturosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventosFuturosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EventosFuturosActionPerformed

    private void EventosCanceladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventosCanceladosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EventosCanceladosActionPerformed

    private void IngresoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresoFechaActionPerformed

    private void PerfilUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerfilUsuarioActionPerformed

    private void BotonMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenuPrincipalActionPerformed
        // TODO add your handling code here:
        MenuPrincipal lea=new MenuPrincipal();
        lea.setVisible(true);
    }//GEN-LAST:event_BotonMenuPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonMenuPrincipal;
    private javax.swing.JToggleButton EventosCancelados;
    private javax.swing.JToggleButton EventosFuturos;
    private javax.swing.JToggleButton IngresoFecha;
    private javax.swing.JToggleButton ListarEventos;
    private javax.swing.JToggleButton PerfilUsuario;
    // End of variables declaration//GEN-END:variables
}
