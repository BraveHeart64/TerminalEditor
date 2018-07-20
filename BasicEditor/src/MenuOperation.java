
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryan
 */
public class MenuOperation extends Menu {
    
    
    private String nameoffile = "";
    private  String data = "";

     
    /*
    public String filedata(String data){
        return this.data = data;
     }
    */
    
    public String getNewFileName(String nameoffile){
         
        return this.nameoffile = nameoffile;
     }
    
      @Override
    public void  mSaveFile(LinkedList list){
        FileOutputStream  save;
        Iterator itr = list.iterator();
         try{
             save = new FileOutputStream(nameoffile + ".txt");
             
            // byte[] convert_data_tobytes = data.getBytes();
            
            //byte[] convert_data_tobytes = itr.next().toString().getBytes();
            while(itr.hasNext()){
             byte[] convert_data_tobytes = itr.next().toString().getBytes();
             save.write(convert_data_tobytes);
            }
             save.close(); 
         }
         catch(IOException e){
             System.err.println(e.getMessage());
        
         }  
        
       
     }
     
   
   
     @Override
   public String  mLoadFile(String load,String nameoffile){
       FileInputStream open;
       BufferedReader  bf; 
       try{
        
        open = new FileInputStream(nameoffile);
        bf = new BufferedReader(new InputStreamReader(open));
        StringBuilder stbuild = new StringBuilder();
        
        while((data = bf.readLine()) != null){
            stbuild.append(data);
      
       }
        data = stbuild.toString();
        open.close();
        bf.close();
       }
       catch(IOException e){
       System.out.println(e.getMessage());
       }
       return data;
    }
   
   
   public boolean Quit(String data, boolean value ){
     
      if(data.contains("q")){
          value = false;
      }
            
       return value;
       
   }
   
    
    
}
