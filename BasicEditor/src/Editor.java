/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryan
 */

import java.util.Scanner;
import java.util.LinkedList;

public class Editor {
    MenuOperation op_menu =  new MenuOperation();
     private boolean run;
     private String data;
     private  LinkedList list = new LinkedList();
     
     Editor(){
         
         run = true;
         data = "";   
         
     }
    
     
    
    
    public void  MainLoop(){
       System.out.println("\t\t\t\t\t\t\t" +"Welcome to A------Basic------Text-----Editor");
        Scanner scan = new Scanner(System.in);
        MenuOperation menu = new MenuOperation();
        
       while(run){
           data = scan.nextLine();
           list.add(data);
           
           
           run = menu.Quit(data,run);
           
           // temporary but will replace with keyvents instead
           
           if(list.contains("#q")){
               
               list.removeLast();
           }
           else if(list.contains("#s")){
                String nameoffile= null;
                list.removeLast();
                
                System.out.println("Please type in the name of your file");
                nameoffile = scan.nextLine();
                menu.getNewFileName(nameoffile);
                menu.mSaveFile(list);  
           }
           else if(list.contains("#lo")){
               String filename = "";
               //list.removeLast(); 
               list.clear();
               System.out.println("Type the name of the file you wish to load");
              filename  = scan.nextLine();
              filename = op_menu.getNewFileName(filename);
              data =  op_menu.mLoadFile(data,filename);
              list.add(data);
              System.out.println(data);
           }
           
           if(list.contains("#help")){
              list.removeLast();
              System.out.println("Press #lo to load a file,#s to save a file #q to end program.");
            }
       }
           
       }
    
   
       
        
    }
    
