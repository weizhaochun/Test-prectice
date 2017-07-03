package com.test;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Test11 extends JFrame
{
	
    Wdmb1 mb=null;
	public static void main(String[] args) {
       Test11 a=new Test11();
	}

	public Test11()
	{
		mb=new Wdmb1();
		this.setTitle("画图界面");
		this.add(mb);
		this.addKeyListener(mb);
		this.setSize(400,300);
		this.setLocation(300,280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
}
class Wdmb1 extends JPanel implements KeyListener
{
	int x=50,y=50;
	public void paint(Graphics g)
	{
         super.paint(g);
         g.fillRect(x,y,40,40);
         
	}
	public void keyTyped(KeyEvent e)
	{
		//有字符输出
	}
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			y+=10;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP)
		{
			y--;
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			x--;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			x++;
		}
		this.repaint();
		
	}
	public void keyReleased(KeyEvent e)
	{
		
	}

}

