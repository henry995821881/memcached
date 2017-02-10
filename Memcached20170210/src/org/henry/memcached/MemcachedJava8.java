package org.henry.memcached;

import java.net.InetSocketAddress;
import java.util.concurrent.Future;

import net.spy.memcached.MemcachedClient;

public class MemcachedJava8 {
	   public static void main(String[] args) {
	   
	      try{
	   
	         // 连接本地的 Memcached 服务
	         MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("192.168.119.100", 11211));
	         System.out.println("Connection to server sucessful.");

	         // 添加数据
	         Future fo = mcc.set("runoob", 900, "Free Education");

	         // 输出执行 set 方法后的状态
	         System.out.println("set status:" + fo.get());

	         // 使用 get 方法获取数据
	         System.out.println("runoob value in cache - " + mcc.get("runoob"));

	         // 关闭连接
	         mcc.shutdown();
	         
	      }catch(Exception ex){
	         System.out.println(ex.getMessage());
	   }
	}
}


