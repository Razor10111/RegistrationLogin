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
  }else {
 JOptionPane.showMessageDialog(null,
 "Username is not correct, please ensure that "
 + "your username contains an underscore and");
 }
 return true;
 }
  
 public static boolean CheckPasswordComplexity(){
 Password = JOptionPane.showInputDialog("Password");
 return Password.length()>=8&&
 Password.matches(".*[A-Z].*")&&
 Password.matches(".*[0-9].*")&&
 Password.matches(".*[@,#,$,%,&,*]*.");
 }
 public static String registerUser(){
 if (CheckPasswordComplexity() == false){
 JOptionPane.showMessageDialog(null, "Password is"
 + " not correct");
 }else{
 
 JOptionPane.showMessageDialog(null, "Password is" + " correct");
 }
 return Password ;
 }
 
   public static boolean loginUser(String User, String userPassword){
 user2 = JOptionPane.showInputDialog("Enter your Username");
 while (user2 == null ? userName != null : !user2.equals(userName)){
 JOptionPane.showMessageDialog(null, " "
 + "Username does not match");
 //user2 = JOptionPane.showInputDialog("Enter your Username");
 break;
 }
 if (user2 == null ? userName == null : user2.equals(userName)){
 Password2 = JOptionPane.showInputDialog("Enter your password");
 while (Password == null ? Password2 != null : !Password.equals(Password2)){
 JOptionPane.showMessageDialog(null, "Pasword "
 + "does not match");
 //Password2 = JOptionPane.showInputDialog("Enter your password");
 break;
 }
 }
 if (Password == null ? Password2 == null : Password.equals(Password2)){
 JOptionPane.showMessageDialog(null, "You have "+ "successfully logged in");
 }
 //}
 return true;
 }
    public static boolean returnLoginstatus(boolean Logged){
 JOptionPane.showMessageDialog(null, "Click "+ "ok to login");
 if (loginUser(userName, Password)){
 JOptionPane.showMessageDialog(null,"Welcome"+
 ""
 + " "+
 name +" "+ surname +" "+"it is good to see you");
 }
 else{
 JOptionPane.showMessageDialog(null, "Incorrect "+ "login details");
 }
 return true;
 }
}


 
 

 
      
    
  
