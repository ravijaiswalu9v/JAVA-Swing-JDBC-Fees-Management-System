/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.*;


/**
 *
 * @author Ravi_jaiswal
 */
public class Theme {
    static String currentTheme;
    
    public static String getTheme(){
        String query= "SELECT * FROM theme";
        fmsConnection fms = new fmsConnection(query);
        try {
            ResultSet rs = fms.pStmt.executeQuery();
            rs.next();
            currentTheme = rs.getString("themes");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }  
        return currentTheme;
    }
    public static String setTheme(String selectedTheme){
        String query= "UPDATE theme SET themes=?";
        fmsConnection fms = new fmsConnection(query);
       
        try {
            fms.pStmt.setString(1, selectedTheme);
            fms.pStmt.executeUpdate();
            System.out.println("theme Updated to "+selectedTheme);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return selectedTheme;
    }
   
    
    
   
   
//    public static void main(String[] args) {
////        System.out.println("theme :"+getTheme());
////        System.out.println("updated theme: "+setTheme(true));
//
//    }
    
}










