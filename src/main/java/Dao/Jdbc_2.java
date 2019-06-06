package Dao;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Jdbc_2 {
    private static String user;
    private static String url;
    private static String driver;
    private static String password;
    //设置sql语句
    static String upadtebook="update Book set price=? where name=?";
    static String querybook="select * from Book";

    static {
        //读取配置文件
        Properties properties=new Properties();
        try {
            properties.load(new FileInputStream("src/db.properties"));
            //读取信息
            user=properties.getProperty("user");
            password=properties.getProperty("password");
            url=properties.getProperty("url");
            driver=properties.getProperty("driver");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   @Test
   public void test(){
       Connection con;
       PreparedStatement pre;
       Statement sta;
       ResultSet res;
        try {
            //加载驱动
            Class.forName(driver);
            //创建连接
            con=DriverManager.getConnection(url,user,password);
            //获得执行
            pre=con.prepareStatement(upadtebook);
            sta=con.createStatement();
            //事务操作
            con.setAutoCommit(false);
            //执行sql语句
            pre.setInt(1,300);
            pre.setString(2,"java");

            pre.addBatch();
            pre.executeBatch();
            //获得查询
            res=sta.executeQuery(querybook);
           while (res.next()){
                String id=res.getString(1);
                String name=res.getString(2);
                String price=res.getString(3);
                String num=res.getString(4);
                System.out.println("id: "+id+" name: "+name+" price: "+price+" num: "+num);

            }

            //事务操作
            con.commit();
            pre.close();
            sta.close();
            con.close();



        }catch (Exception e){
            e.printStackTrace();
            System.err.println("出现错误");
        }
   }
}
