package com.test;
import java.awt.*;
import javax.swing.*;

public class Test10 extends JFrame
{
	Wdmb1 mb=null;	
	
	public static void main(String[] args)
	{
		Test10 lx=new Test10();
	}
	
	public Test10()
	{
		mb=new Wdmb1();
		this.setTitle("画图界面");
		this.add(mb);
		this.setSize(400,300);
		this.setLocation(300,280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
}

class Wdmb extends JPanel
{
	public void paint(Graphics g) //这个方法是覆盖父类的方法，画笔的意思
	{
		//System.out.println("paint方法被调用");
		//g.drawOval(50,60,80,80);
		//g.drawLine(100,100,100,200);
        //g.drawRect(100,100,60,60);
		//g.draw3DRect(100,100,50,60,true);
//		g.setColor(Color.red); //如果不设置颜色，默认是黑色
//		g.fillRect(100,100,100,100);
		g.setColor(Color.green);
		g.fillOval(220,100,80,80);				
	}
}

//paint方法会在以下三种情况下被系统自动调用
 //1.  启动程序       2.窗口大小发生变化      3. 运行repaint函数时