package Exam2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static  void main(String args[]){
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
        String countryId=pro.getProperty("countryId");
        String customerId=pro.getProperty("customerId");
        SqlLink sqlLink=new SqlLink();
        try {
            sqlLink.selectCity(countryId);
            sqlLink.selectFilm(customerId);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
