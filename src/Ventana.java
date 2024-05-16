import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JTabbedPane tabbedPane1;
    private JSpinner spinner1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField1;
    private JButton agregarButton;
    private JTextField textField2;
    private JButton totalPaquetesButton;

    private Lista paquetes = new Lista();

    private Ventana(){

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    paquetes.adicionarElemento(new Paqueteria(Integer.parseInt(spinner1.getValue().toString()),Double.parseDouble(textField1.getText()), comboBox1.getSelectedItem().toString(),comboBox2.getSelectedItem().toString(), textField2.getText()));
                    JOptionPane.showConfirmDialog(null,"Paquete agregado");
                    System.out.println(paquetes.listarPaquetes());
            }catch(Exception ex){
                    JOptionPane.showConfirmDialog(null,ex.getMessage());
                }
            }
        });
        totalPaquetesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,"El total de paquetes es: "+ paquetes.sumarTotalPeso());

            }
        });
    }

}
