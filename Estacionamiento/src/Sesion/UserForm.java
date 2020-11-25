package Sesion;


import java.awt.Color;
import java.awt.Panel;
import javax.swing.JOptionPane;

public class UserForm extends javax.swing.JFrame {
    public UserForm() {
        initComponents();
        //Desactivo el boton de Cerrar Sesion al iniciar el programa
        btnLogout.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        txtMensaje = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticación de Usuario");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Introduce tu usuario y contraseña");

        jLabel4.setText("Usuario:");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel5.setText("Contraseña:");

        txtMensaje.setBackground(new java.awt.Color(239, 239, 239));
        txtMensaje.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txtMensaje.setForeground(new java.awt.Color(204, 0, 0));
        txtMensaje.setAlignmentX(0.5F);
        txtMensaje.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), null));
        txtMensaje.setOpaque(true);

        btnLogin.setText("Iniciar Sesión");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogout.setText("Cerrar Sesión");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnLogout)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        
        //Cambio el color del Mensaje a verde y vacio su contenido para evitar fallos.
        txtMensaje.setForeground(Color.green);
        txtMensaje.setText("");
        //Creo una variable para diferenciar al usuario y luego comprobar su contraseña, la llamare id
        int id = 0;
        //Creo dos booleanos que me ayudaran a diferenciar Si la contraseña o el usuario son correctos individualmente
        boolean UserAceptado = false;
        boolean PassAceptado = false;
        if(txtUser.getText().isEmpty()){
            //Si el Usuario esta vacio, le mando un mensaje de error
            txtMensaje.setText("El campo 'Usuario' es obligatorio");
            //Cambio el color del mensaje a rojo
            txtMensaje.setForeground(Color.red);
        } else {
            //Si el usuario no esta vacio, compruebo el usuario con cada uno de la lista usuarios
            for(int i = 0; i < usuarios.length; i++){
                if(txtUser.getText().equals(usuarios[i])){
                    //Si el usuario es igual a algun usuario de la lista
                    //UserAceptado sera verdadero y se saldra del Ciclo For.
                    UserAceptado=true;
                    //Pongo el numero del usuario en la lista en la variable id
                    id = i;
                    //Rompe el ciclo con el break;
                    break;
                }
            }
            //Nota: Si el usuario introducido existe, UserAceptado sera verdadero, de lo contrario sera false.
            if(UserAceptado){
                //Si UserAceptado es verdadero
                //Comprobar la contraseña puesta con la contraseña correspondiente de la lista
                //la variable id guarda el numero del usuario en la lista
                //lo que me facilita comprobar si la contraseña que le corresponde a ese usuario es correcta
                if(txtPass.getText().equals(passwords[id])){
                    //Si la contraseña coincide, entonces PassAceptado sera verdadero
                    PassAceptado=true;
                }
                //Si la contraseña fue puesta correctamente, PassAceptado sera true, de lo contrario, sera false
                if(PassAceptado){
                    //Si la contraseña es correcta
                    //Cambio el mensaje a "Acceso Concedido, Bienvenido de vuelta, Nombre de usuario."
                    txtMensaje.setText("<html>Acceso Concedido<br>Bienvenido de vuelta, "+txtUser.getText()+".</html>");
                    //Cambio el color del mensaje a Verde
                    txtMensaje.setForeground(Color.green);
                    //Desactivo el boton de Login y los campos de Texto
                    txtUser.setEnabled(false);
                    txtPass.setEnabled(false);
                    btnLogin.setEnabled(false);
                    //Activo el boton de Logout
                    btnLogout.setEnabled(true);
                }else {
                    //Si la contraseña es incorrecta, envio un mensaje indicando el error y el numero de intentos restantes
                    //Decremento los intentos restantes en 1
                    intentosRestantes--;
                    txtMensaje.setText("<html>Contraseña Incorrecta!<br>Intentos Restantes: "+intentosRestantes);
                    //Cambio el color del mensaje a rojo, para resaltar el error
                    txtMensaje.setForeground(Color.red);
                }
            } else {
                    //Si no se encontro un usuario con dicho nombre
                    //Decremento los intentos restantes en 1
                    intentosRestantes--;
                    txtMensaje.setText("<html>Usuario No Encontrado!<br>Intentos Restantes: "+intentosRestantes);
                    //Cambio el color del mensaje a rojo, para resaltar el error
                    txtMensaje.setForeground(Color.red);
            }
        }
        //Verifico si aun hay intentos restantes antes de finalizar todo el proceso
        if(intentosRestantes<1){
            //Mostrar un mensaje indicando que se acabaron los intentos restantes
            txtMensaje.setText("<html>Lo sentimos!<br>Intentos Restantes: 0");
            //Cambio el color del mensaje a rojo, para resaltar el error
            txtMensaje.setForeground(Color.red);
            //Muestra un mensaje informadole al usuario que ya no le quedan intentos
            JOptionPane.showConfirmDialog(null, "Número de Intentos Restantes Excedidos.\nEl programa se cerrara al aceptar. Lo sentimos","Confirmar Acción",JOptionPane.DEFAULT_OPTION);
            txtUser.setEnabled(false);
            txtPass.setEnabled(false);
            //Sea cual sea la respuesta del usuario, el programa se cierra luego del mensaje
            this.dispose();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        if(JOptionPane.showConfirmDialog(null, "¿Esta Seguro?","Confirmar Acción",JOptionPane.YES_NO_OPTION)==0){
            //Pido confirmación al usuario para cerrar sesion
            //De aceptar los intentos restantes volveran a ser 3
            intentosRestantes=4;
            //el color del mensaje se pondra verde
            txtMensaje.setForeground(Color.green);
            //Activo los campos de texto Usuario y contraseña
            txtUser.setEnabled(true);
            txtPass.setEnabled(true);
            //se vaciara el texto de Mensaje, Pass y User
            txtMensaje.setText("");
            txtPass.setText("");
            txtUser.setText("");
            //Activo el boton de Login y desactivo el de Logout
            btnLogin.setEnabled(true);
            btnLogout.setEnabled(false);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         if(JOptionPane.showConfirmDialog(null, "¿Esta Seguro?","Confirmar Acción",JOptionPane.YES_NO_OPTION)==0){
            //Pregunta al usuario si esta seguro de cerrar el programa, si la respuesta es si
            //el programa se cierra con esta linea de codigo
            this.dispose();
         }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel txtMensaje;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
    
//DECLARACION E INICIALIZACION DE VARIABLES, USUARIOS Y CONTRASEÑAS ||==--

    //Declaro e inicializo una variable que indique los intentos restantes.
    int intentosRestantes = 3;
    //Declaro e inicializo un Arreglo con los usuarios existentes
    String[] usuarios = {"admin","user","ismael","123"};
    //Lo mismo para las contraseñas
    String[] passwords = {"senati","user","m8634","123"};
    //Aclaro que cada uno es correspondiente a su paralelo por ejemplo para el usuario[2] su contraseña es passwords[2]

// --==||
}
