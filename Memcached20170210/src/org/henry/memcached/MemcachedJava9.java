package org.henry.memcached;

import java.net.InetSocketAddress;
import java.util.concurrent.Future;

import net.spy.memcached.CASValue;
import net.spy.memcached.MemcachedClient;

public class MemcachedJava9 {
	   public static void main(String[] args) {
	   
	      try{
	   
	         // ���ӱ��ص� Memcached ����
	         MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("192.168.119.100", 11211));
	         System.out.println("Connection to server sucessful.");

	         // �������
	         Future fo = mcc.set("runoob", 900, "Free Education");

	         // ���ִ�� set �������״̬
	         System.out.println("set status:" + fo.get());
	            
	         // �ӻ����л�ȡ��Ϊ runoob ��ֵ
	         System.out.println("runoob value in cache - " + mcc.get("runoob"));

	         // ͨ�� gets ������ȡ CAS token�����ƣ�
	         CASValue casValue = mcc.gets("runoob");

	         // ��� CAS token�����ƣ� ֵ
	         System.out.println("CAS value in cache - " + casValue);

	         // �ر�����
	         mcc.shutdown();
	         
	      }catch(Exception ex){
	         System.out.println(ex.getMessage());
	   }
	   }}



