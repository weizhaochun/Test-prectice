package com.test;
import java.awt.*;
import javax.swing.*;

public class Test9 extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel bq1;//北部
    
    JPanel mb1;//南部
    JButton an1,an2,an3;
    
    JTabbedPane xxk;//中部
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
          //北部
    	bq1=new JLabel("欢    迎     使     用",JLabel.CENTER);
    	bq1.setFont(new Font("行楷",Font.PLAIN,25));
    	bq1.setForeground(Color.red);
    	  //南部
    	mb1=new JPanel();
    	an1=new JButton("登 录");
    	an2=new JButton("取 消");
    	an3=new JButton("注 册");
    	mb1.add(an1);mb1.add(an2);mb1.add(an3);
    	
    	  //中部
    	fx1=new JCheckBox("隐身登录");
    	fx2=new JCheckBox("记住密码");
    	bq2=new JLabel("账 号",JLabel.CENTER);
    	bq3=new JLabel("密 码",JLabel.CENTER);
    	bq4=new JLabel("忘记密码",JLabel.CENTER);
    	bq4.setFont(new Font("宋体",Font.PLAIN,16));
    	bq4.setForeground(Color.blue);
    	bq5=new JLabel("<html><a href='www.qq.com'>申请密码保护</a>");
    	bq5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    	wbk=new JTextField();
    	mmk=new JPasswordField();
    	mb2=new JPanel();mb3=new JPanel();mb4=new JPanel();
    	mb3.setBackground(Color.BLUE);
    	mb4.setBackground(Color.orange);
    	mb2.setLayout(new GridLayout(3,3));
    	an4=new JButton("清除账号");
    	mb2.add(bq2); mb2.add(wbk); mb2.add(an4); mb2.add(bq3); mb2.add(mmk);
    	mb2.add(bq4); mb2.add(fx1); mb2.add(fx2); mb2.add(bq5);
    	xxk=new JTabbedPane();
    	xxk.add("普通用户", mb2);xxk.add("会员用户", mb3);xxk.add("管理员", mb4);
    	
    	this.add(bq1,BorderLayout.NORTH);
    	this.add(mb1,BorderLayout.SOUTH);
    	this.add(xxk);
    	this.setTitle("登录界面");
    	this.setSize(300, 200);
    	this.setLocation(400,300);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	this.setResizable(false);
    	
    	
    }
}
