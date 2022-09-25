/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management.system;
import java.sql.*;
/**
 *
 * @author MSSMohammad
 */
public class BankManagementSystem {
    static Connection Con;
    
    public static Connection getConnection(){
       try{
           Class.forName("com.mysql.jdbc.Driver"); 
           Con =DriverManager.getConnection("jdbc:mysql://localhost:3307/bank management system","root","");
           
       }catch(Exception ex){
           System.out.println(""+ ex);
       }
       return Con;
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
