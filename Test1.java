package com.test;
import java.awt.*;
import javax.swing.*;

public class Test1 extends JFrame {
	JButton[] an={null,null,null,null,null,null};
	public static void main(String[] args) {
		  Test1 a=new Test1();
	}
    public Test1()
    {
    	an[0]=new JButton("0");
    	an[1]=new JButton("1");
    	an[2]=new JButton("2");
    	an[3]=new JButton("3");
    	an[4]=new JButton("4");
    	an[5]=new JButton("5");
    	
    	this.setLayout(new FlowLayout());
    	for(int i=0;i<6;i++)
    		this.add(an[i]);
    	
    	this.setTitle("流水式布局");
    	this.setSize(500, 500);
    	this.setLocation(400,300);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	//this.setResizable(false);
    }
}
