package Dao;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Jdbc_1 {
    private static String user;
    private static String url;
    private static String driver;
    private static String password;
    static {
        //读取配置文件
        Properties properties=new Properties();
        try {
            properties.load(new FileInputStream("src/db.properties"));
            user=properties.getProperty("user");
            password=properties.getProperty("password");
            url=properties.getProperty("url");
            driver=properties.getProperty("driver");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
         Connection con=null;
        Statement preparedStatement=null;
        ResultSet resultSet=null;
        try{
            //注册类
            Class.forName(driver);
            //获取连接
           // con= DriverManager.getConnection("jdbc:mysql://localhost:3306/work?serverTimezone=UTC","root","342425");
            con= DriverManager.getConnection(url,user,password);
            //获取执行对象
            preparedStatement=  con.createStatement();
            //执行sql语句
            //resultSet=preparedStatement.executeQuery("select * from students");
            preparedStatement.addBatch("insert into worker(id,name)value (3,'sally')");
            preparedStatement.addBatch("insert into worker(id,name)value (4,'jam')");
            preparedStatement.executeBatch();
            //得到数据
           /* while(resultSet.next()){
                System.out.println(resultSet.getObject(1));

            }*/

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            con.close();
            preparedStatement.close();
           // resultSet.close();
        }

    }

}
