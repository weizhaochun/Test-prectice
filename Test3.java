package com.test;
import java.awt.*;
import javax.swing.*;

public class Test3 extends JFrame {
	JButton[] an={null,null,null,null,null,null};
    JPanel mb1,mb2;
	public static void main(String[] args) {
         Test3 a=new Test3();
	}
    public Test3()
    {   mb1=new JPanel();
        mb2=new JPanel();
    	an[0]=new JButton("0");
    	an[1]=new JButton("1");
    	an[2]=new JButton("2");
    	an[3]=new JButton("3");
    	an[4]=new JButton("4");
    	an[5]=new JButton("5");
    	 
    	mb1.add(an[1]);
    	mb1.add(an[2]);
    	mb2.add(an[3]);
    	mb2.add(an[4]);
        this.add(mb1,BorderLayout.NORTH);
        this.add(mb2,BorderLayout.SOUTH);
        this.add(an[0]);
    	this.setTitle("流水式布局");
    	this.setSize(500, 300);
    	this.setLocation(400,300);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	//this.setResizable(false);
    }
}
