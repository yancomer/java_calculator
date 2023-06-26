package Swing;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class TextFieldExample implements ActionListener{  
	
	Wordtonumber one = new Wordtonumber();
	Numbertoword two = new Numbertoword();
	Yazisayi bir = new Yazisayi();
	Sayiyazi iki = new Sayiyazi();
	
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;  
    JButton b1,b2,b3,b4;
    
    TextFieldExample(){
    	String[] languages = {"Türkçe", "English"};

        JFrame f= new JFrame();

        tf1=new JTextField();  
        tf1.setBounds(50,30,200,20);  
        tf2=new JTextField();  
        tf2.setBounds(50,80,200,20);  
        tf3=new JTextField();  
        tf3.setBounds(50,130,330,20);  
        tf3.setEditable(false);
        tf4=new JTextField();  
        tf4.setBounds(50,180,200,20);  
        tf5=new JTextField();  
        tf5.setBounds(50,230,200,20);  
        tf6=new JTextField();  
        tf6.setBounds(50,280,330,20);  
        tf6.setEditable(false);
        b1=new JButton("+");  
        b1.setBounds(50,350,50,50);  
        b2=new JButton("-");  
        b2.setBounds(200,350,50,50);
        b3=new JButton("*");  
        b3.setBounds(50,450,50,50);  
        b4=new JButton("/");  
        b4.setBounds(200,450,50,50);
        b1.addActionListener(this);  
        b2.addActionListener(this);
        b3.addActionListener(this);  
        b4.addActionListener(this);
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(tf4);f.add(tf5);f.add(tf6);f.add(b1);f.add(b2);f.add(b3);f.add(b4);  
        f.setSize(400,600);  
        f.setLayout(null);  
        f.setVisible(true);  
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		String s1=tf1.getText();  
        String s2=tf2.getText();
        String s4=tf4.getText();
        String s5=tf5.getText();
        /*if else yazýlacak*/
        
        int a = bir.yaziSayi(s1);
        int b = bir.yaziSayi(s2); 
        int c = 0;  
        if(e.getSource()==b1){  
            c=a+b;  
        }
        else if(e.getSource()==b2){  
            c=a-b;  
        }
		else if(e.getSource()==b3){  
			c=a*b;  
		} 
		else if(e.getSource()==b4){  
			c=a/b;  
		}
        String sonuc = iki.convert(c); 
        tf3.setText(sonuc);
        
        int x = one.wordToNumber(s4);
        int y = one.wordToNumber(s5); 
        int z = 0;  
        if(e.getSource()==b1){  
            z=x+y;  
        }
        else if(e.getSource()==b2){  
            z=x-y;  
        }
		else if(e.getSource()==b3){  
			z=x*y;  
		} 
		else if(e.getSource()==b4){  
			z=x/y;  
		}
        String result = two.convert(z); 
        tf6.setText(result); 
		
	}
	public static void main(String[] args) {  
	    new TextFieldExample();  
	} 
}