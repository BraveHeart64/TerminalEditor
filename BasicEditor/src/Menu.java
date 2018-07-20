/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryan
 */
import java.io.*;
import java.util.LinkedList;

public abstract class Menu {
    private FileInputStream save;
    private FileOutputStream open;
    
 
    
   abstract void  mSaveFile(LinkedList list);
   abstract String  mLoadFile(String load, String nameoffile);
   
}
