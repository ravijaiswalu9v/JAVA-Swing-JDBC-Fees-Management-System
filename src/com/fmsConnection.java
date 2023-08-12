/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import java.sql.*;

public class fmsConnection {
    Connection con;
    PreparedStatement pStmt;
    
    fmsConnection(String query){
        System.out.println("fmsConnection parameterized constructor.....");
       try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       
       String url="jdbc:mysql://localhost:3306/fms333";
       String user="root";
       String password="123456";
       
       con = DriverManager.getConnection(url, user, password);
       
       if(con.isClosed()){
           System.out.println("Connection failed.....");
       }
       else{
           System.out.println("Connection is created.....");
           pStmt=con.prepareStatement(query);
           System.out.println("After pstmt...");
       }
       }
     catch(Exception e){
         e.printStackTrace();
    }
     
    }
    
//    public void setQuery(String query){
//    this.query=query;
//    }
//    public String getQuery(){
//        return this.query;
//    }
//    public static void main(String[] args) {
////        new fmsConnection("test");
//    }
}
