package com.test;
import java.awt.*;
import javax.swing.*;

public class Test6 extends JFrame {
    JPanel mb1,mb2;
    JLabel bq1,bq2;
    JComboBox xlk;
    JList lb;
    JScrollPane gd;
    
	public static void main(String[] args) {
          Test6 a=new Test6();
	}
    public Test6()
    {
    	  mb1=new JPanel();
	      mb2=new JPanel();
	      bq1=new JLabel("�� ��");
	      bq2=new JLabel("ѧ ��");
	      String[] jg={"����","�Ϻ�","����","����","����"};
	      xlk=new JComboBox(jg);
	      String[] xl={"����","��ר","����","˶ʿ","��ʿ"};
	      lb=new JList(xl);
	      lb.setVisibleRowCount(3);
	      gd=new JScrollPane(lb);
	      
	      mb1.add(bq1);
	      mb1.add(xlk);
	      mb2.add(bq2);
	      mb2.add(gd);
	      
	  	  this.setLayout(new GridLayout(2,1));
          this.add(mb1);
          this.add(mb2);
               
    	this.setTitle("ע�����");
    	this.setSize(250, 160);
    	this.setLocation(400,300);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	this.setResizable(false);
    	
    }
}
