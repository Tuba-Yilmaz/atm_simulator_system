package bank.management.system;
import java.sql.*;
public class Conn{
         //create connection
         //create statement
    Connection c;
    Statement s;
     public Conn(){
           try{
               
               c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","0207");
               s=c.createStatement();
           }catch(Exception e){
               System.out.println(e);
           }
       }
   }

   


