package com.test;
import java.awt.*;
import javax.swing.*;

public class Test5 extends JFrame{
	JPanel mb1,mb2,mb3;
	JButton an1,an2;
	JLabel bq1,bq2;
	JCheckBox fx1,fx2,fx3;
	JRadioButton dx1,dx2;
	ButtonGroup dxz;

	public static void main(String[] args) {
          Test5 a=new Test5();
	}
	 public Test5()
	    {   mb1=new JPanel();
	        mb2=new JPanel();
	        mb3=new JPanel();
	    	an1=new JButton("注  册");
	    	an2=new JButton("取  消");
	    	bq1=new JLabel("特 长");
	    	bq2=new JLabel("性 别");
	    	fx1=new JCheckBox("唱 歌");
	    	fx2=new JCheckBox("体 育");
	    	fx3=new JCheckBox("跳 舞");
	    	dx1=new JRadioButton("男");
	    	dx2=new JRadioButton("女");
	    	dxz=new ButtonGroup();
	    	
	        dxz.add(dx1);
	        dxz.add(dx2);
	    	mb1.add(bq1);
	    	mb1.add(fx1);
	    	mb1.add(fx2);
	    	mb1.add(fx3);
	    	mb2.add(bq2);
	    	mb2.add(dx1);
	    	mb2.add(dx2);
	    	mb3.add(an1);
	    	mb3.add(an2);
	    	
	    	this.setLayout(new GridLayout(3,1));
	        this.add(mb1);
	        this.add(mb2);
	        this.add(mb3);
	        
	    	this.setTitle("注册界面");
	    	this.setSize(250, 160);
	    	this.setLocation(400,300);
	    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	this.setVisible(true);
	    	this.setResizable(false);
	    }
}
