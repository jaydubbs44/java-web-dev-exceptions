package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        System.out.println(Divide(2,1));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        System.out.println(CheckFileExtension(studentFiles.get("Brad")));
    }

    public static int Divide(int x, int y)
    {
        if(y == 0){
            try{
                throw new DivisionException("You cannot divide by zero");

            }catch(DivisionException e){
                e.printStackTrace();
            }
        }
        return x/y;
    }

    public static int CheckFileExtension(String fileName)
    {
       if (fileName.equals (null)||fileName.equals("")){
           try{
               throw new FileNameException("You must choose a filename!");
           }catch(FileNameException e){
               e.printStackTrace();
           }
           return -1;
       }else if(fileName.contains(".java")){
           return 1;
       }else{
           return 0;
       }

    }

}
