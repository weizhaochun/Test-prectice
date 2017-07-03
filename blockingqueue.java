package com.test;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class blockingqueue {
    public static void main(String[] args) throws Exception{
    	BlockingQueue<String> bq=new LinkedBlockingQueue<String>(10);
        Consumer customer=new Consumer(bq);
        Producer product=new Producer(bq);
     customer.start();
     product.start();
    }
}

class Consumer extends Thread {  
    /*** 
     * 利用队列存储样品 
     * */  
     private BlockingQueue<String> bq;  
     public Consumer() {  
        // TODO Auto-generated constructor stub  
    }  
    public Consumer(BlockingQueue<String> bq) {  
        super();  
        this.bq = bq;  
       
    }  
       
      
    @Override  
    public void run() {  
          
        while(true){  
            System.out.println(getName()+"消费者准备消费集合元素");  
            try{  
                  
                Thread.sleep(2000);  
                //尝试取出元素，如果队列为空，则被线程阻塞  
                bq.take();  
                  
            }catch(Exception e){  
                e.printStackTrace();  
            }  
              
            System.out.println(getName()+"消费完成"+bq);  
        }  
          
    }  
}

class Producer  extends Thread{  
	  
    /*** 
     * 利用队列存储样品 
     * */  
    private BlockingQueue<String> bq;  
      
    public Producer() {  
        // TODO Auto-generated constructor stub  
    }  
       
    public Producer(BlockingQueue<String> bq) {  
       
        this.bq = bq;  
    }  
  
    @Override  
    public void run() {  
        String []str=new String[]{"solr","lucene","nutch"};   
          
        for(int i=0;i<99999999;i++){  
            System.out.println(getName()+"生产者准备生产集合元素了!");  
            try{  
                Thread.sleep(2000);  
                //尝试放入元素，如果对列已满，则线程被阻塞  
                bq.put(str[i%3]);  
                  
            }catch(Exception e){  
                e.printStackTrace();  
            }  
            System.out.println(getName()+"生产完成:"+bq);  
        }  
          
          
    }  
      
      
}  
