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
     * ���ö��д洢��Ʒ 
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
            System.out.println(getName()+"������׼�����Ѽ���Ԫ��");  
            try{  
                  
                Thread.sleep(2000);  
                //����ȡ��Ԫ�أ��������Ϊ�գ����߳�����  
                bq.take();  
                  
            }catch(Exception e){  
                e.printStackTrace();  
            }  
              
            System.out.println(getName()+"�������"+bq);  
        }  
          
    }  
}

class Producer  extends Thread{  
	  
    /*** 
     * ���ö��д洢��Ʒ 
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
            System.out.println(getName()+"������׼����������Ԫ����!");  
            try{  
                Thread.sleep(2000);  
                //���Է���Ԫ�أ�����������������̱߳�����  
                bq.put(str[i%3]);  
                  
            }catch(Exception e){  
                e.printStackTrace();  
            }  
            System.out.println(getName()+"�������:"+bq);  
        }  
          
          
    }  
      
      
}  
