package com.socket;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class Server implements Runnable{
    public static void main(String[] args) throws IOException   {
        ServerSocket server = new ServerSocket(8189);//服务端套接字ServerSocket开启一个当前空闲的端口号8189，在主函数中开一次即可
        while(true) {

            Server x = new Server();
            x.client = server.accept();
            Server.count++;
            System.out.println("客户端 "+x.client.getInetAddress().getHostAddress()+" 连接了。。目前已有"+ Server.count+"人连接。。。");
            Thread t = new Thread(x);
            t.start();
        }

    }
    @Override
    public void run() {
        try {
            InputStream in = client.getInputStream();//获取客户端套接字对象的字节输入流
            BufferedReader input = new BufferedReader(new InputStreamReader(in,"gb2312"));
            while(true)//输入的控制台一旦关闭，就跳出循环
            {
                String str = input.readLine();
                if(str==null)break;
                System.out.println(Thread.currentThread().getName()+"线程， "+"客户端 "+client.getInetAddress()+" 说： "+str);
            }
            input.close();
            in.close();
            client.close();
            Server.count--;
            System.out.println(Thread.currentThread().getName()+"线程， "+"客户端 "+client.getInetAddress()+" 离开了。。当前剩余"+ Server.count+"人连接。。。");
        } catch (IOException e) {
        }
    }
    private Socket client;//成员变量
    private static int count=0;//代表目前连接的客户端计数器

}