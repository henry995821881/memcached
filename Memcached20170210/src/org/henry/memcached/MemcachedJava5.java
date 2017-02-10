package org.henry.memcached;

import java.net.InetSocketAddress;
import java.util.concurrent.Future;

import net.spy.memcached.MemcachedClient;

public class MemcachedJava5 {
	public static void main(String[] args) {
	   
	      try{
	   
	         // ���ӱ��ص� Memcached ����
	         MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("192.168.119.100", 11211));
	         System.out.println("Connection to server sucessful.");

	         // �������
	         Future fo = mcc.set("runoob", 900, "Free Education");

	         // ���ִ�� set �������״̬
	         System.out.println("set status:" + fo.get());

	         // ��ȡ����Ӧ��ֵ
	         System.out.println("runoob value in cache - " + mcc.get("runoob"));

	         // �Դ��ڵ�key����������Ӳ���
	          fo = mcc.append(900,"runoob",  " for All");

	         // ���ִ�� set �������״̬
	         System.out.println("append status:" + fo.get());
	         
	         // ��ȡ����Ӧ��ֵ
	         System.out.println("runoob value in cache - " + mcc.get("codingground"));

	         // �ر�����
	         mcc.shutdown();
	         
	      }catch(Exception ex){
	         System.out.println(ex.getMessage());
	}
	   }
}




