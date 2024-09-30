/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationandlogin;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class RegistrationAndLogin {
 static String name;
 static String surname;
 static String userName ;
 static String Password;
 static String Password2;
 static String user2;
 
    
 public static void main(String[] args) {
     
    //Create object scanner
     Scanner input = new Scanner(System.in);
     EnterUserDetails();
     CheckuserName();
     CheckPasswordComplexity();
     registerUser();
     loginUser(user2, Password);
     returnLoginstatus(true);
     }
 
}


 
 

 
      
    
  
