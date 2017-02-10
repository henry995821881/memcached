package org.henry.memcached;

import java.net.InetSocketAddress;
import java.util.concurrent.Future;

import net.spy.memcached.MemcachedClient;

public class MemcachedJava {
   public static void main(String[] args) {
   
      try{
   
         // ���ӱ��ص� Memcached ����
         MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("192.168.119.100", 11211));
         System.out.println("Connection to server sucessful.");

         // �������
       //  Future fo = mcc.set("runoob", 900, "Free Education");

         // ��ӡ״̬
        // System.out.println("set status:" + fo.get());

         // ���
        // System.out.println("runoob value in cache - " + mcc.get("runoob"));

         // ���
         
         Future fo = mcc.add("runoob", 900, "memcached");

//         // ��ӡ״̬
        System.out.println("add status:" + fo.get());
//
//         // �����key
         fo = mcc.add("codingground", 900, "All Free Compilers");
//
//         // ��ӡ״̬
         System.out.println("add status:" + fo.get());
//         
//         // ���
         System.out.println("codingground value in cache - " + mcc.get("codingground"));

         // �ر�����
         mcc.shutdown();
         
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }
   }
}


















