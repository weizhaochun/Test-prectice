package com.test;
import java.awt.*;
import javax.swing.*;

public class Test7 extends JFrame{
	JLabel bq;
	JList lb;
	JSplitPane cf;
	

	public static void main(String[] args) {
	     Test7 a=new Test7();
	}
    public Test7()
    {
    	String[] km={"����","����","ģ��","����","����","����"};
    	lb=new JList(km);
    	bq=new JLabel(new ImageIcon("tupian/201484006.jpg"));
    	cf=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,lb,bq);
    	cf.setOneTouchExpandable(true);
    	
    	this.add(cf);
    	this.setTitle("ѧ�ƽ���");
    	this.setSize(400, 400);
    	this.setLocation(400,300);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	this.setResizable(false);
    	
    }
}
