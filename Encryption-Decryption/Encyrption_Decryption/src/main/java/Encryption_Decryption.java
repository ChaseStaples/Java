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
    private static String message = "";
    private static String encrypted_Message = "";
    private static String decrypted_Message = "";
    
    public static String Encrypt(){
        //
        System.out.println("Message to be encrypted:");
        Scanner newMess = new Scanner(System.in);
        message = newMess.nextLine();
        System.out.println();
        
        char[] encrypt = message.toCharArray();
        String newMessage = "";
         
        for(int i = 0; i < encrypt.length; i++){
            if(encrypt[i] == ' '){
                encrypt[i] = ' ';
                newMessage += encrypt[i];
            }
            else if(i % 2 == 0){
                encrypt[i] += 2;
                newMessage += encrypt[i];
            }
            else if(i % 5 == 0){
                encrypt[i] += 5;
                newMessage += encrypt[i];
            }
            else{
                encrypt[i]+= 2;
                newMessage += encrypt[i];
            }
        }
        return newMessage;
    }
    public static String Decrypt(String message){
    
        System.out.println("Message to be decrypted: " + message);
        
        char[] encrypt = message.toCharArray();
        String newMessage = "";
         
        for(int i = 0; i < encrypt.length; i++){
            if(encrypt[i] == ' '){
                encrypt[i] = ' ';
                newMessage += encrypt[i];
            }
            else if(i % 2 == 0){
                encrypt[i] -= 2;
                newMessage += encrypt[i];
            }
            else if(i % 5 == 0){
                encrypt[i] -= 5;
                newMessage += encrypt[i];
            }
            else{
                encrypt[i] -= 2;
                newMessage += encrypt[i];
            }
        }
        return newMessage;
    }
    
    public static void Prompt_Credentials(){
        
       Scanner newUser = new Scanner(System.in);
       System.out.print("Username: "); 
       username = newUser.nextLine(); 
       
       Scanner newPassword = new Scanner(System.in);
       System.out.println("Password: ");
       password = newPassword.nextLine();
       
    }
    public static String Prompt_Menu(){
    
        
        System.out.println();
        System.out.println("     * * * Menu * * *    ");
        System.out.println("==========================");
        System.out.println("1. To Encrypt your message");
        System.out.println("2. To Decrypt your message");
        System.out.println("3. To Generate your key");
        System.out.println("4. To Check Username and Password");
        System.out.println("'Quit' to exit menu");
        System.out.println("==========================");
        System.out.println();
        
        System.out.println("Enter your choice here: ");
        Scanner options = new Scanner(System.in);
        String choice = options.nextLine();
        System.out.println();
        
        return choice;
    }
    
    public static String Generate_String(){
        
        return "";
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
        Prompt_Credentials();
        String choice = Prompt_Menu();
        do{
           switch(choice){
                case "1" -> {
                    encrypted_Message = Encrypt();
                    System.out.println(" Your encrypted message is ");
                    System.out.println("===========================");
                    System.out.println(encrypted_Message);
                    System.out.println("===========================");
                    System.out.println();
                    break;
                }
                case "2" -> {
                    decrypted_Message = Decrypt(encrypted_Message);
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
