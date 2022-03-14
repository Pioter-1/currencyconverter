package CurrencyConverting;

@SuppressWarnings("serial")
public class CurrencyConverter extends javax.swing.JFrame {

// waluty {PLN,Frank,Funt,Euro} 
double waluta1[] = {1,4.46,5.44,4.65};
double waluta2[] = {1,5.7,5.44,4.65}; 

public CurrencyConverter() {
Components();
}
                   
private void Components() {

j1 = new javax.swing.JLabel();
Window1 = new javax.swing.JComboBox<>();
Window2 = new javax.swing.JComboBox<>();
jtxtIlo�� = new javax.swing.JTextField();
jlblKurs = new javax.swing.JLabel();
jbtnSprawdzKurs = new javax.swing.JButton();
jbtnWyczy�� = new javax.swing.JButton();
jtxtSprawdzKurs = new javax.swing.JTextField();
jbtnZamknij = new javax.swing.JButton();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

j1.setFont(new java.awt.Font("Arial", 1, 20));
j1.setText("Kalkulator walut");


Window1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PLN", "Frank", "Funt","Euro" }));
Window2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PLN", "Frank", "Funt","Euro" }));


jtxtIlo��.setText("Kwota");
jlblKurs.setText("Kurs");


jbtnSprawdzKurs.setText("Sprawdz kurs");
jbtnSprawdzKurs.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent Y) {
jbtnSprawdzKursing(Y);
 }
});


jbtnWyczy��.setText("Wyczy��");
jbtnWyczy��.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
  jbtnWyczy��ActionPerformed(evt);
 }
});
    

jbtnZamknij.setText("Zamknij");
jbtnZamknij.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jbtnZamknijActionPerformed(evt);
}
});


javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(0, 0, Short.MAX_VALUE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(j1)
.addGroup(layout.createSequentialGroup()
.addComponent(jbtnSprawdzKurs)
.addGap(15, 15, 15)
.addComponent(jbtnWyczy��, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addComponent(Window1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(Window2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jtxtIlo��)
.addComponent(jlblKurs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jtxtSprawdzKurs))
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addGroup(layout.createSequentialGroup()
.addGap(155, 155, 155)
.addComponent(jbtnZamknij)
.addContainerGap(191, Short.MAX_VALUE))
 );
 
 
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(32, 32, 32)
.addComponent(j1)
.addGap(48, 48, 48)
.addComponent(Window1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(10, 10, 10)
.addComponent(Window2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(10, 10, 10)
.addComponent(jtxtIlo��, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(10, 10, 10)
.addComponent(jlblKurs)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jtxtSprawdzKurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(10, 10, 10)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jbtnSprawdzKurs)
.addComponent(jbtnWyczy��))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jbtnZamknij)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);
pack();
}                      

private void jbtnSprawdzKursing(java.awt.event.ActionEvent evt) {                                            

double amt = Double.parseDouble(jtxtIlo��.getText());

int Var1 = Window1.getSelectedIndex();
int Var2 = Window2.getSelectedIndex();

    if (Var1 == Var2){
String SameCurrency = "Nie mo�na przeliczy� tej samej waluty";
jtxtSprawdzKurs.setText(SameCurrency);
    }
 else {
double res = (amt/waluta1[Var1])*waluta2[Var2];

String conv = String.format("%.2f",res);
jtxtSprawdzKurs.setText(conv);
}
}                                           
private void jbtnWyczy��ActionPerformed(java.awt.event.ActionEvent evt) {                                          

jtxtIlo��.setText(null);
jtxtSprawdzKurs.setText(null);
Window1.setSelectedIndex(0);
Window2.setSelectedIndex(0);
}                                         

private void jbtnZamknijActionPerformed(java.awt.event.ActionEvent evt) {                                         
System.exit(0);
}                                        

public static void main(String args[]) {
try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
if ("Nimbus".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
  }
}
 } catch (ClassNotFoundException ex) {
 java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
 java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new CurrencyConverter().setVisible(true);
}
    });
}
         
private javax.swing.JLabel j1;
private javax.swing.JButton jbtnSprawdzKurs;
private javax.swing.JButton jbtnZamknij;
private javax.swing.JButton jbtnWyczy��;
private javax.swing.JComboBox<String> Window1;
private javax.swing.JComboBox<String> Window2;
private javax.swing.JLabel jlblKurs;
private javax.swing.JTextField jtxtIlo��;
private javax.swing.JTextField jtxtSprawdzKurs;           
}       