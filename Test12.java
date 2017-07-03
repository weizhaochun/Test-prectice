package com.test;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Test12 extends JFrame
{
	Wdmb4 mb=null;	
	
	public static void main(String[] args)
	{
		Test12 lx=new Test12();
	}
	
	public Test12()
	{
		mb=new Wdmb4();
		this.add(mb);
		this.addKeyListener(mb);
		this.setSize(400,300);
		this.setLocation(300,280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);	
	}
}

class Wdmb4 extends JPanel implements KeyListener
{
	int x=50, y=60;
	public void paint(Graphics g)
	{
        super.paint(g);
        g.fillRect(x,y,30,30);
	}	
	public void keyTyped(KeyEvent e)
	{  // 有字符输出的函数
	}
	public void keyPressed(KeyEvent e) 
	{
//		System.out.println("键盘被按下");
//		System.out.println((char)e.getKeyCode()); 
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{    //System.out.println("下");
			     y+=10;
		}
		 if(e.getKeyCode()==KeyEvent.VK_UP)
		{
			//System.out.println("上");
			y--;
		}                                                                                                                             
		 if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			//System.out.println("左");
			x--;
		}
	   if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			//System.out.println("右");
			x+=8;
		}
		this.repaint();
	}
    public void keyReleased(KeyEvent e) 
    {
	   //按键抬起
	}  
}