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
	
    JTextField tf1,tf2,tf3;  
    JButton b1,b2,b3,b4;
    
    TextFieldExample(){
    	String[] languages = {"Türkçe", "English"};

        JFrame f= new JFrame();
        JComboBox jb = new JComboBox(languages);
        
        jb.setBounds(50,20,90,20);
        tf1=new JTextField();  
        tf1.setBounds(50,70,200,20);  
        tf2=new JTextField();  
        tf2.setBounds(50,120,200,20);  
        tf3=new JTextField();  
        tf3.setBounds(50,170,330,20);  
        tf3.setEditable(false);   
        b1=new JButton("+");  
        b1.setBounds(50,220,100,100);  
        b2=new JButton("-");  
        b2.setBounds(200,220,100,100);
        b3=new JButton("*");  
        b3.setBounds(50,370,100,100);  
        b4=new JButton("/");  
        b4.setBounds(200,370,100,100);
        b1.addActionListener(this);  
        b2.addActionListener(this);
        b3.addActionListener(this);  
        b4.addActionListener(this);
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(jb);  
        f.setSize(400,600);  
        f.setLayout(null);  
        f.setVisible(true);  
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		String s1=tf1.getText();  
        String s2=tf2.getText();
        
        /*if else yazýlacak*/
        
        int a = bir.wordToNumber(s1);
        int b = bir.wordToNumber(s2); 
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
		
	}
	public static void main(String[] args) {  
	    new TextFieldExample();  
	} 
}