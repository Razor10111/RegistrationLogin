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
 
 public static boolean EnterUserDetails(){
 name = JOptionPane.showInputDialog("Name");
 surname = JOptionPane.showInputDialog("Surname");
 return true;
 }
 
  public static boolean CheckuserName(){
 String Underscore = "_";
 userName = JOptionPane.showInputDialog("UserName");
 if (userName.contains(Underscore) != false) {
 while (userName.length()>5){
 JOptionPane.showMessageDialog(null,"Username "
 + "is not correct, please ensure that "
 + "your username contains an underscore");
 break;
 }if (userName.length()<=5){
 JOptionPane.showMessageDialog(null,"Username " + "succesfull ");
 }
 
}


 
 

 
      
    
  
