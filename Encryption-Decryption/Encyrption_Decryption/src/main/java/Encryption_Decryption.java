/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chase Staples 2020
 * Creating project for encrypting and decrypting messages
 * by prompting a menu and then the user selects to decrypt or
 * encrypt their messages with a key
 */

import java.util.*;


public class Encryption_Decryption {
    
    private static String username = "";
    private static String password = "";
    
    public static String Encrypt(){
    
        return "";
    }
    public static String Decrypt(){
    
        return "";
    }
    
    public static void Prompt_Credentials(){
        
       System.out.print("Username: ");
       Scanner newUser = new Scanner(System.in);
       username = newUser.nextLine();
       System.out.println();
       
       System.out.print("Password: ");
       Scanner newPassword = new Scanner(System.in);
       password = newPassword.nextLine();
       System.out.println();
       
    }
    public static String Prompt_Menu(){
    
        
        
        System.out.println("     * * * Menu * * *    ");
        System.out.println("==========================");
        System.out.println("1. To Encrypt your message");
        System.out.println("2. To Decrypt your message");
        System.out.println("3. To Generate your key");
        System.out.println("4. To Check Username and Password");
        System.out.println("'Quit' to exit menu");
        System.out.println("==========================");
        
        System.out.print("Enter your choice here: ");
        Scanner options = new Scanner(System.in);
        String choice = options.nextLine();
        System.out.println();
        
        return choice;
    }
    
    public static String Generate_String(){
    }
    
    public static String Get_Username(){
        return username;
    }
    
    public static String Get_Password(){
        return password;
    }
    
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        String choice = Prompt_Menu();
        do{
           switch(choice){
                case "1" -> {
                    Encrypt();
                    break;
                }
                case "2" -> {
                    Decrypt();
                    break;
                }
                case "3" -> {
                    Generate_String();
                    break;
                }
                case "4" -> {
                    System.out.println("Your username is: " + Get_Username());
                    System.out.println("Your password is: " + Get_Password());
                    break;
                } 
                default -> {
                    System.out.println("Invald input! Enter a choice!");
                    break;
                }
           }
           choice = Prompt_Menu();
        } while(!"quit".equals(choice));
    }
}
