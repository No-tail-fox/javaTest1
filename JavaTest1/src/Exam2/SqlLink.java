package Exam2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class SqlLink {
    static String url="";
    static String username="";
    static String password="";
    static {
        Properties pro = new Properties();
        FileInputStream in = null;
        try {
            in = new FileInputStream("src/db.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            pro.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        username=pro.getProperty("user");
        password=pro.getProperty("password");
        url="jdbc:mysql://"+pro.getProperty("ip")+":"+pro.getProperty("port")+"/"+pro.getProperty("database")+"?serverTimezone=CTT&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull";

    }
    public void selectCity(String countryId) throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(url,username,password);
        Statement st=conn.createStatement();
        String sql="select c.city_id,c.city from city as c where c.country_id="+Integer.parseInt(countryId);
        ResultSet resultSet=st.executeQuery(sql);
        while(resultSet.next()){
            System.out.print("city_id"+resultSet.getObject("city_id")+"  ||");
            System.out.println("  city"+resultSet.getObject("city"));
        }
    }
    public void selectFilm(String customerId) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(url,username,password);
        Statement st=conn.createStatement();
        String sql="SELECT f.film_id,f.title from sakila.film as f,sakila.inventory as i,sakila.rental as r where r.customer_id="+Integer.parseInt(customerId)+" and r.inventory_id=i.inventory_id and f.film_id=i.film_id order by r.rental_date desc";
        ResultSet resultSet=st.executeQuery(sql);
        while(resultSet.next()){
            System.out.print("city_id"+resultSet.getObject("film_id")+"  ||");
            System.out.println("  city"+resultSet.getObject("title"));
        }
    }
}
