/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

/**
 *
 * @author usuario
 */
public class Ventana03 extends JFrame {

    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFile;
    private List<JComboBox> jComboBoxList;

    public Ventana03() throws HeadlessException {
        this.setTitle(" ");
        this.setSize(500, 300);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.iniciarJlabels();
        this.iniciarJComboBox();
        this.iniciarJButtons();
        this.iniciarJTextfile();

        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarPaneles() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBackground(Color.WHITE);
        this.jPanelList.get(7).setBackground(Color.WHITE);
        this.jPanelList.get(8).setBackground(Color.WHITE);
        this.jPanelList.get(9).setBackground(Color.WHITE);
        this.jPanelList.get(16).setBackground(Color.WHITE);

        this.jPanelList.get(13).setBackground(Color.WHITE);
        this.jPanelList.get(1).setBackground(new Color(32, 167, 218));

        this.jPanelList.get(1).setBorder(new BevelBorder(BevelBorder.RAISED));

        this.jPanelList.get(0).setLayout(new GridLayout(9, 1));
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(0).add(this.jPanelList.get(8));
    this.jPanelList.get(0).add(this.jPanelList.get(16));
    }

    public void iniciarJlabels() {
        this.jLabelList = new ArrayList<>();

        this.jLabelList.add(new JLabel("INFORMACION DE CARRERA"));
        this.jLabelList.add(new JLabel("Periodo Académico: *     2020-2022"));
        this.jLabelList.add(new JLabel("Carrera:*        "));
        this.jLabelList.add(new JLabel("Modalidad:       "));
        this.jLabelList.add(new JLabel("Sede: *      "));
        this.jLabelList.add(new JLabel("Campus: *     "));
        this.jLabelList.add(new JLabel("Jornada: *      "));
        this.jLabelList.add(new JLabel("Fecha de Registro: *       29/04/2022"));
        
       

        this.jLabelList.get(0).setFont(new Font("Times New Roman", Font.PLAIN, 20));
        this.jPanelList.get(1).add(this.jLabelList.get(0));

        this.jLabelList.get(1).setFont(new Font("Times New Roman", Font.PLAIN, 14));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        

        this.jLabelList.get(2).setFont(new Font("Times New Roman", Font.PLAIN, 14));
        this.jPanelList.get(3).add(this.jLabelList.get(2));

        this.jLabelList.get(3).setFont(new Font("Times New Roman", Font.PLAIN, 14));
        this.jPanelList.get(4).add(this.jLabelList.get(3));

        this.jLabelList.get(4).setFont(new Font("Times New Roman", Font.PLAIN, 14));
        this.jPanelList.get(5).add(this.jLabelList.get(4));

        this.jLabelList.get(5).setFont(new Font("Times New Roman", Font.PLAIN, 14));
        this.jPanelList.get(6).add(this.jLabelList.get(5));

        this.jLabelList.get(6).setFont(new Font("Times New Roman", Font.PLAIN, 14));
        this.jPanelList.get(7).add(this.jLabelList.get(6));

        this.jLabelList.get(7).setFont(new Font("Times New Roman", Font.PLAIN, 14));
        this.jPanelList.get(8).add(this.jLabelList.get(7));
        
      

    }

    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();

        this.jButtonList.add(new JButton("Siguiente"));
        this.jPanelList.get(16).add(this.jButtonList.get(0));

    }

    public void iniciarJComboBox() {
        this.jComboBoxList = new ArrayList<>();
             var x= new String[5];
        x[0] = "Ingenieria en Sistemas";
        x[1] = "Ingenieria Automotriz";
        x[2] = "Ingenieria Electrica";
        x[3] = "Veterinaria";
        x[4]="Ingenieria";
        this.jComboBoxList.add(new JComboBox(x));
        var w =new String[3];
        w[0]="Presencial";
        w[1]="Online";
        w[2]="Semi Presencial";
        this.jComboBoxList.add(new JComboBox(w));

        var y= new String[3];
        y[0] = "MATRIZ CUENCA";
        y[1] = "QUITO";
        y[2] = "GUAYAQUIL";
        this.jComboBoxList.add(new JComboBox(y));
        var campus = new String[2];
        campus[0] = "El vecino";
        campus[1] = "El concecionario";
        this.jComboBoxList.add(new JComboBox(campus));

        var z= new String[3];
        z[0] = "Matutina";
        z[1] = "Vespertina";
        z[2] = "Nocturna";
        this.jComboBoxList.add(new JComboBox(z));

   
        
        
        this.jPanelList.get(5).add(this.jComboBoxList.get(2));
        this.jPanelList.get(6).add(this.jComboBoxList.get(3));
        this.jPanelList.get(7).add(this.jComboBoxList.get(4));
        this.jPanelList.get(3).add(this.jComboBoxList.get(0));
        this.jPanelList.get(4).add(this.jComboBoxList.get(1));
    }

    public void iniciarJTextfile() {
        this.jTextFile = new ArrayList<>();
        /*this.jTextFile.add(new JTextField(15));
        this.jPanelList.get(0).add(this.jTextFile.get(0));
        this.jPanelList.get(7).add(this.jTextFile.get(0));*/

    }

}
