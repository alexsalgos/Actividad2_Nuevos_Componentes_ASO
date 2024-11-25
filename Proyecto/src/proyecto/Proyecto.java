
package proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Proyecto extends JFrame{
    
    private JButton uno;
    private JButton dos;
    private JButton tres;
    private JButton cuatro;
    private JButton cinco;
    private JButton seis;
    private JButton siete;
    private JButton ocho;
    private JButton nueve;
    private JButton cero;
    private JButton suma;
    private JButton resta;
    private JButton division;
    private JButton multiplicacion;
    private JButton igual;
    
    public Proyecto(){
        setTitle("Calculadora");
        setSize(500,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        //Elementos
        uno = new JButton("1");
        dos= new JButton("2");
        tres= new JButton("3");
        cuatro= new JButton("4");
        cinco= new JButton("5");
        seis= new JButton("6");
        siete= new JButton("7");
        ocho= new JButton("8");
        nueve= new JButton("9");
        cero= new JButton("0");
        suma= new JButton("+");
        resta= new JButton("-");
        division= new JButton("/");
        multiplicacion= new JButton("*");
        igual= new JButton("=");
}
public void Componentes(Proyecto ventana){
        ventana.add(uno);
        ventana.add(dos);
        ventana.add(tres);
        ventana.add(cuatro);
        ventana.add(cinco);
        ventana.add(seis);
        ventana.add(siete);
        ventana.add(ocho);
        ventana.add(nueve);
        ventana.add(cero);
        ventana.add(suma);
        ventana.add(resta);
        ventana.add(division);
        ventana.add(multiplicacion);
        ventana.add(igual);
    }
    

    public static void main(String[] args) {
        Proyecto ventana = new Proyecto();
        ventana.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        ventana.setBackground(Color.yellow);
        ventana.Componentes(ventana); 
          
        ventana.setVisible(true);
    }
    
}
