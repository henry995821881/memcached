package org.henry.memcached;

import java.net.InetSocketAddress;
import java.util.concurrent.Future;

import net.spy.memcached.MemcachedClient;

public class MemcachedJava2 {
	   public static void main(String[] args) {
	   
	      try{
	   
	         // 连接本地的 Memcached 服务
	         MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("192.168.119.100", 11211));
	         System.out.println("Connection to server sucessful.");

	         // 添加数据
	       
	         // 添加
	         Future fo = mcc.add("runoob", 900, "memcached");

	         // 打印状态
	         System.out.println("add status:" + fo.get());

	         // 添加新key
	         fo = mcc.add("codingground", 900, "All Free Compilers");

	         // 打印状态
	         System.out.println("add status:" + fo.get());
	         
	         // 输出
	         System.out.println("codingground value in cache - " + mcc.get("codingground"));

	         // 关闭连接
	         mcc.shutdown();
	         
	      }catch(Exception ex){
	         System.out.println(ex.getMessage());
	      }
	   }
	}