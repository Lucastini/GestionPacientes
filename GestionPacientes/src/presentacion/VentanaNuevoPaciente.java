
package presentacion;

import java.awt.Color;
import java.awt.event.KeyEvent;
import negocio.GestorPacientes;
import negocio.Paciente;

public class VentanaNuevoPaciente extends javax.swing.JFrame {

    public VentanaNuevoPaciente(GestorPacientes g) {
        initComponents();
        gestor=g;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblAltura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Paciente");

        jblNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jblNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        lblApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblApellido.setText("Apellido:");

        txtApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoKeyPressed(evt);
            }
        });

        lblEdad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEdad.setText("Edad: ");

        txtEdad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEdad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEdadFocusLost(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEdadKeyPressed(evt);
            }
        });

        lblAltura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAltura.setText("Altura: ");

        txtAltura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAltura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAlturaFocusLost(evt);
            }
        });
        txtAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAlturaKeyPressed(evt);
            }
        });

        lblPeso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPeso.setText("Peso: ");

        txtPeso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPeso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPesoFocusLost(evt);
            }
        });
        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesoKeyPressed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltura)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeso)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
            boolean errorDato=false;
            String ape=txtApellido.getText();
            if(ape.isEmpty()){
                javax.swing.JOptionPane.showMessageDialog(null, "Debe ingresar un apellido");
                errorDato=true;
                txtApellido.setBackground(Color.red);}
            String nom=txtNombre.getText();
            if(nom.isEmpty()){
                javax.swing.JOptionPane.showMessageDialog(null, "Debe ingresar un nombre");
                txtNombre.setBackground(Color.red);
                errorDato=true;}
            int ed=Integer.parseInt(txtEdad.getText());
            if(ed<=0||ed>120){
                javax.swing.JOptionPane.showMessageDialog(null, "El valor para edad debe estar entre 0 y 120");
                txtEdad.setBackground(Color.red);
                errorDato=true;}
            double alt=Double.parseDouble(txtAltura.getText());
            if(alt<0.1||alt>2.5){
                javax.swing.JOptionPane.showMessageDialog(null, "El valor para altura debe estar entre 0.1 y 2.5");
                txtAltura.setBackground(Color.red);
                errorDato=true;}
            double pes=Double.parseDouble(txtPeso.getText());
            if(pes<=0||pes>500){
                javax.swing.JOptionPane.showMessageDialog(null, "El valor para peso debe estar entre 0 y 500");
                txtPeso.setBackground(Color.red);
                errorDato=true;}
            if(!errorDato){
                Paciente p=new Paciente(ape, nom, ed, alt, pes);
                gestor.addPaciente(p);
                txtNombre.setText("");
                txtApellido.setText("");
                txtEdad.setText("");
                txtAltura.setText("");
                txtPeso.setText("");
                txtNombre.requestFocus();
            }
        }
        catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(null, "Los campos edad, altura y peso deben ser numericos");
            txtEdad.setBackground(Color.red);
            txtAltura.setBackground(Color.red);
            txtPeso.setBackground(Color.red);
            txtNombre.requestFocus();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            txtApellido.requestFocus();
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
            txtNombre.setText(txtNombre.getText().trim().toUpperCase());
            String nom=txtNombre.getText();
            if(nom.isEmpty())
                txtNombre.setBackground(Color.red);
            else
                txtNombre.setBackground(Color.white);
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
            txtApellido.setText(txtApellido.getText().trim().toUpperCase());
            String ape=txtApellido.getText();
            if(ape.isEmpty())
                txtApellido.setBackground(Color.red);
            else
                txtApellido.setBackground(Color.white);
    }//GEN-LAST:event_txtApellidoFocusLost

    private void txtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            txtEdad.requestFocus();
    }//GEN-LAST:event_txtApellidoKeyPressed

    private void txtEdadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            txtAltura.requestFocus();
    }//GEN-LAST:event_txtEdadKeyPressed

    private void txtAlturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlturaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            txtPeso.requestFocus();
    }//GEN-LAST:event_txtAlturaKeyPressed

    private void txtPesoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            btnGuardar.requestFocus();
    }//GEN-LAST:event_txtPesoKeyPressed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtNombre.setBackground(Color.white);
        txtApellido.setText("");
        txtApellido.setBackground(Color.white);
        txtEdad.setText("");
        txtEdad.setBackground(Color.white);
        txtAltura.setText("");
        txtAltura.setBackground(Color.white);
        txtPeso.setText("");
        txtPeso.setBackground(Color.white);
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        txtNombre.setText(".");
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusLost
        try{
            String eds=txtEdad.getText().trim();
            txtEdad.setText(eds);
            int ed=Integer.parseInt(eds);
            if(ed<0||ed>120)
                txtEdad.setBackground(Color.red);
            else
                txtEdad.setBackground(Color.white); 
        }
        catch(NumberFormatException ex){
            txtEdad.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtEdadFocusLost

    private void txtAlturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAlturaFocusLost
        try{
            String alt=txtAltura.getText().trim();
            txtAltura.setText(alt);
            double al=Double.parseDouble(alt);
            if(al<0.2||al>2.5)
                txtAltura.setBackground(Color.red);
            else
                txtAltura.setBackground(Color.white);
        }
        catch(NumberFormatException ex){
            txtAltura.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtAlturaFocusLost

    private void txtPesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesoFocusLost
        try{
            String pes=txtPeso.getText().trim();
            txtPeso.setText(pes);
            double pe=Double.parseDouble(pes);
            if(pe<=0||pe>500)
                txtPeso.setBackground(Color.red);
            else
                txtPeso.setBackground(Color.white);
        }
        catch(NumberFormatException e){
            txtPeso.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtPesoFocusLost

    private void txtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoFocusGained



    //DECLARACION DE ATRIBUTOS:
    private GestorPacientes gestor;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jblNombre;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}