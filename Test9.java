package com.test;
import java.awt.*;
import javax.swing.*;

public class Test9 extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel bq1;//����
    
    JPanel mb1;//�ϲ�
    JButton an1,an2,an3;
    
    JTabbedPane xxk;//�в�
    JPanel mb2,mb3,mb4;
    JButton an4;
    JLabel bq2,bq3,bq4,bq5;
    JTextField wbk;
    JPasswordField mmk;
    JCheckBox fx1,fx2;
    
    
	public static void main(String[] args) {
            Test9 a=new Test9();
	}
    public Test9()
    {
          //����
    	bq1=new JLabel("��    ӭ     ʹ     ��",JLabel.CENTER);
    	bq1.setFont(new Font("�п�",Font.PLAIN,25));
    	bq1.setForeground(Color.red);
    	  //�ϲ�
    	mb1=new JPanel();
    	an1=new JButton("�� ¼");
    	an2=new JButton("ȡ ��");
    	an3=new JButton("ע ��");
    	mb1.add(an1);mb1.add(an2);mb1.add(an3);
    	
    	  //�в�
    	fx1=new JCheckBox("�����¼");
    	fx2=new JCheckBox("��ס����");
    	bq2=new JLabel("�� ��",JLabel.CENTER);
    	bq3=new JLabel("�� ��",JLabel.CENTER);
    	bq4=new JLabel("��������",JLabel.CENTER);
    	bq4.setFont(new Font("����",Font.PLAIN,16));
    	bq4.setForeground(Color.blue);
    	bq5=new JLabel("<html><a href='www.qq.com'>�������뱣��</a>");
    	bq5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    	wbk=new JTextField();
    	mmk=new JPasswordField();
    	mb2=new JPanel();mb3=new JPanel();mb4=new JPanel();
    	mb3.setBackground(Color.BLUE);
    	mb4.setBackground(Color.orange);
    	mb2.setLayout(new GridLayout(3,3));
    	an4=new JButton("����˺�");
    	mb2.add(bq2); mb2.add(wbk); mb2.add(an4); mb2.add(bq3); mb2.add(mmk);
    	mb2.add(bq4); mb2.add(fx1); mb2.add(fx2); mb2.add(bq5);
    	xxk=new JTabbedPane();
    	xxk.add("��ͨ�û�", mb2);xxk.add("��Ա�û�", mb3);xxk.add("����Ա", mb4);
    	
    	this.add(bq1,BorderLayout.NORTH);
    	this.add(mb1,BorderLayout.SOUTH);
    	this.add(xxk);
    	this.setTitle("��¼����");
    	this.setSize(300, 200);
    	this.setLocation(400,300);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	this.setResizable(false);
    	
    	
    }
}
