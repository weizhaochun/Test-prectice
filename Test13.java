package com.test;
import java.awt.*;
import javax.swing.*;

public class Test13 extends JFrame {
	JPanel mb1,mb2;
	JLabel bq1,bq2,bq3;
	JButton an1,an2;
	JTextField wbk;
	JPasswordField mmk;
	
	public static void main(String[] args)
	{
		Test13 w=new Test13();
		
	}
	public Test13()
	{
		bq1=new JLabel("欢迎使用",JLabel.CENTER);
		wbk=new JTextField();
		mmk=new JPasswordField();
		bq2=new JLabel("账号",JLabel.CENTER);
		bq3=new JLabel("密码",JLabel.CENTER);
		an1=new JButton ("登录");
		an1=new JButton ("取消");
		mb1=new JPanel();
		mb2=new JPanel();
		mb1.setLayout(new GridLayout(2,2));
		mb2.setLayout(new GridLayout(1,2));
		mb1.add(bq2);mb1.add(wbk);mb1.add(bq3);mb1.add(mmk);
		mb2.add(an1);mb2.add(an2);
		
		this.add(bq1,BorderLayout.NORTH);
    	this.add(mb2,BorderLayout.SOUTH);
    	this.add(mb1);
    	this.setTitle("登录界面");
    	this.setSize(300, 200);
    	this.setLocation(400,300);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	this.setResizable(false);
	}
	

}

