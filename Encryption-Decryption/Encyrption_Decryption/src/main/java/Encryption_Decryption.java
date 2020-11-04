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
import java.math.*;


public class Encryption_Decryption {
    
    private static String username = "";
    private static String password = "";
    private static String message = "";
    private static String encrypted_Message = "";
    private static String decrypted_Message = "";
    private static int x = 0,y = 0,z = 0;
    
    static String Encrypt(int x, int y, int z){
        
        if(x == 0|| y == 0 || z == 0){
            System.out.println("Key has not been generated yet");
            return "";
        }
        
        System.out.println("Message to be encrypted:");
        Scanner newMess = new Scanner(System.in);
        message = newMess.nextLine();
        System.out.println();
        
        char[] encrypt = message.toCharArray();
        String newMessage = "";
        
        if(x == 0|| y == 0 || z == 0){
            System.out.println("Key has not been generated yet");
        }
         
        for(int i = 0; i < encrypt.length; i++){
            if(encrypt[i] == ' '){
                encrypt[i] = ' ';
                newMessage += encrypt[i];
            }
            else if(i % 2 == 0){
                encrypt[i] += x;
                newMessage += encrypt[i];
            }
            else if(i % 5 == 0){
                encrypt[i] += y;
                newMessage += encrypt[i];
            }
            else{
                encrypt[i]+= z;
                newMessage += encrypt[i];
            }
        }
        return newMessage;
    }
    static String Decrypt(String message, int x, int y, int z){
    
        if(x == 0|| y == 0 || z == 0){
            System.out.println("Key has not been generated yet");
            return "";
        }
        if(message.equals("")){
            System.out.println("Message has not been generated");
            return "";
        }
        System.out.println("Message to be decrypted: " + message);
        
        char[] encrypt = message.toCharArray();
        String newMessage = "";
         
        for(int i = 0; i < encrypt.length; i++){
            if(encrypt[i] == ' '){
                encrypt[i] = ' ';
                newMessage += encrypt[i];
            }
            else if(i % 2 == 0){
                encrypt[i] -= x;
                newMessage += encrypt[i];
            }
            else if(i % 5 == 0){
                encrypt[i] -= y;
                newMessage += encrypt[i];
            }
            else{
                encrypt[i] -= z;
                newMessage += encrypt[i];
            }
        }
        return newMessage;
    }
    
    static void Prompt_Credentials(){
        
       Scanner newUser = new Scanner(System.in); 
       System.out.println("Username: "); 
       username = newUser.nextLine(); 
       System.out.println();
       
       Scanner newPass = new Scanner(System.in);
       System.out.println("Password: ");
       password = newPass.nextLine();
       System.out.println();
       
    }
    static String Prompt_Menu(){
    
        
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
    
    static int Generate_Key(){
        System.out.println("Generating your key ....");
        Random random = new Random();
        String space = " ";
        x = random.nextInt(9); if(x == 0){x += 3;}
        y = random.nextInt(9); if(y == 0){x += 5;}
        z = random.nextInt(9); if(z == 0){x += 7;}
        System.out.println(x + space + y + space + z);
        return 0;
    }
    
    static String Get_Username(){
        return username;
    }
    
    static String Get_Password(){
        return password;
    }
    
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the message center, you can encrypt or decrypt messages");
        System.out.println("Don't forget to generate your encryption key first!");
        Prompt_Credentials();
        String choice = Prompt_Menu();
        do{
           switch(choice){
                case "1" -> {
                    encrypted_Message = Encrypt(x,y,z);
                    System.out.println(" Your encrypted message is ");
                    System.out.println("===========================");
                    System.out.println(encrypted_Message);
                    System.out.println("===========================");
                    System.out.println();
                    choice = Prompt_Menu();
                    break;
                }
                case "2" -> {
                    decrypted_Message = Decrypt(encrypted_Message,x,y,z);
                    System.out.println();
                    System.out.println(" Your decrypted message is ");
                    System.out.println("===========================");
                    System.out.println(decrypted_Message);
                    System.out.println("===========================");
                    System.out.println();
                    choice = Prompt_Menu();
                    break;
                }
                case "3" -> {
                    Generate_Key();
                    choice = Prompt_Menu();
                    break;
                }
                case "4" -> {
                    System.out.println("Your username is: " + Get_Username());
                    System.out.println("Your password is: " + Get_Password());
                    choice = Prompt_Menu();
                    break;
                } 
                case "Quit" -> {
                    System.out.println("Goodbye!");
                    choice = "quit";
                    break;
                }
                default -> {
                    System.out.println("Invald input! Enter a choice!");
                    choice = Prompt_Menu();
                    break;
                }
           }
        } while(!"quit".equals(choice));
    }
}
