package com.test;
import java.awt.*;
import javax.swing.*;

public class Test4 extends JFrame {
	JPanel mb1,mb2,mb3;
	JButton an1,an2;
	JLabel bq1,bq2;
	JTextArea wbk;
	JPasswordField mmk;

	public static void main(String[] args) {
         Test4 a=new Test4();
	}
    public Test4()
    {   mb1=new JPanel();
        mb2=new JPanel();
        mb3=new JPanel();
    	an1=new JButton("登  录");
    	an2=new JButton("取  消");
    	bq1=new JLabel("nihao");
    	bq1=new JLabel("nihao");
    	wbk=new JTextArea();
    	
    	mb1.add(bq1);
    	mb1.add(bq2);
    	mb2.add(wbk);
    	mb3.add(an1);
    	mb3.add(an2);
    	
    	this.setLayout(new GridLayout(3,1));
        this.add(mb1);
        this.add(mb2);
        this.add(mb3);
        
    	this.setTitle("登录界面");
    	this.setSize(300, 400);
    	this.setLocation(400,300);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	this.setResizable(false);
    }
}
