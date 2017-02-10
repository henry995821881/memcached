package org.henry.memcached;

import java.net.InetSocketAddress;
import java.util.concurrent.Future;

import net.spy.memcached.MemcachedClient;

public class MemcachedJava3 {
	   public static void main(String[] args) {
	   
	      try {
	         //���ӱ��ص� Memcached ����
	         MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("192.168.119.100", 11211));
	         System.out.println("Connection to server sucessful.");

	         // ��ӵ�һ�� key=��value ��
	         Future fo = mcc.set("runoob", 900, "Free Education");

	         // ���ִ�� add �������״̬
	         System.out.println("add status:" + fo.get());

	         // ��ȡ����Ӧ��ֵ
	         System.out.println("runoob value in cache - " + mcc.get("runoob"));

	         // ����µ� key
	         fo = mcc.replace("runoob", 900, "Largest Tutorials' Library");

	         // ���ִ�� set �������״̬
	         System.out.println("replace status:" + fo.get());

	         // ��ȡ����Ӧ��ֵ
	         System.out.println("runoob value in cache - " + mcc.get("runoob"));

	         // �ر�����
	         mcc.shutdown();
	         
	      }catch(Exception ex){
	         System.out.println( ex.getMessage() );
	      }
	   }
	}



