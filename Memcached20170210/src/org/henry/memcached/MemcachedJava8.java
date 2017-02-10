package org.henry.memcached;

import java.net.InetSocketAddress;
import java.util.concurrent.Future;

import net.spy.memcached.MemcachedClient;

public class MemcachedJava8 {
	   public static void main(String[] args) {
	   
	      try{
	   
	         // ���ӱ��ص� Memcached ����
	         MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("192.168.119.100", 11211));
	         System.out.println("Connection to server sucessful.");

	         // �������
	         Future fo = mcc.set("runoob", 900, "Free Education");

	         // ���ִ�� set �������״̬
	         System.out.println("set status:" + fo.get());

	         // ʹ�� get ������ȡ����
	         System.out.println("runoob value in cache - " + mcc.get("runoob"));

	         // �ر�����
	         mcc.shutdown();
	         
	      }catch(Exception ex){
	         System.out.println(ex.getMessage());
	   }
	}
}


