package com.test;
import java.awt.*;
import javax.swing.*;

public class Test8 extends JFrame{
     JTextArea wby;
     JTextField wbk;
     JButton an;
     JComboBox xlk;
     JScrollPane gd;
     JPanel mb;
     
    
	public static void main(String[] args) {
            Test8 a=new Test8();
	}
    public Test8()
    {
    	wby=new JTextArea();
    	wbk=new JTextField(10);
    	an=new JButton("����");
    	String[] xm={"����","����","������","С��","С��"};
    	xlk=new JComboBox(xm);
    	gd=new JScrollPane(wby);
    	mb=new JPanel();
    	
    	mb.add(xlk);
    	mb.add(wbk);
    	mb.add(an);
    	
    	this.add(gd);
    	this.add(mb,BorderLayout.SOUTH);
    	this.setTitle("�������");
    	this.setSize(400, 400);
    	this.setLocation(400,300);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	this.setResizable(false);
    	
    	
    }
}
