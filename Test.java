package com.test;

import java.awt.*;
import javax.swing.*;

public class Test extends JFrame {
	JButton an1,an2,an3,an4,an5;
	public static void main(String[] args) {
		  Test a=new Test();
	}
    public Test()
    {
      an1=new JButton("��");
      an2=new JButton("��");
      an3=new JButton("��");
      an4=new JButton("��");
      an5=new JButton("��");
      
      this.add(an1,BorderLayout.EAST);
      this.add(an2,BorderLayout.WEST);
      this.add(an3,BorderLayout.SOUTH);
      this.add(an4,BorderLayout.NORTH);
      this.add(an5,BorderLayout.CENTER);
      
      this.setTitle("�û�����");
      this.setSize(400, 320);
      this.setLocation(200, 150);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
    }
}
