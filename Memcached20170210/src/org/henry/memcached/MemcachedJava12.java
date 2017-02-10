package org.henry.memcached;

import java.net.InetSocketAddress;
import java.util.concurrent.Future;

import net.spy.memcached.MemcachedClient;

public class MemcachedJava12 {
	   public static void main(String[] args) {
	   
	      try{
	   
	         // ���ӱ��ص� Memcached ����
	         MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("192.168.119.100", 11211));
	         System.out.println("Connection to server sucessful.");

	         // �������ֵ
	         Future fo = mcc.set("number", 900, "1000");

	         // ���ִ�� set �������״̬
	         System.out.println("set status:" + fo.get());

	         // ��ȡ����Ӧ��ֵ
	         System.out.println("value in cache - " + mcc.get("number"));

	         // ���������
	         System.out.println("value in cache after increment - " + mcc.incr("number", 111));

	         // �Լ������
	         System.out.println("value in cache after decrement - " + mcc.decr("number", 112));

	         // �ر�����
	         mcc.shutdown();
	         
	      }catch(Exception ex){
	         System.out.println(ex.getMessage());
	   }
	}
	   
}