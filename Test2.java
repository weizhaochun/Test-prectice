package com.test;
import java.awt.*;
import javax.swing.*;


public class Test2 extends JFrame{

	JButton[] an={null,null,null,null,null,null,null,null,null};
	public static void main(String[] args) {
		  Test2 a=new Test2();
	}
    public Test2()
    {
    	an[0]=new JButton("0");
    	an[1]=new JButton("1");
    	an[2]=new JButton("2");
    	an[3]=new JButton("3");
    	an[4]=new JButton("4");
    	an[5]=new JButton("5");
    	an[6]=new JButton("6");
    	an[7]=new JButton("7");
    	an[8]=new JButton("8");
    	
    	this.setLayout(new GridLayout(3,3,12,13));
    	for(int i=0;i<9;i++)
    		this.add(an[i]);
    	
    	this.setTitle("网格式布局");
    	this.setSize(500, 500);
    	this.setLocation(400,300);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	//this.setResizable(false);
    }
}
