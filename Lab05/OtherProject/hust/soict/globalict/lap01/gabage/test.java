import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.io.*;


public class test {
    public static void main(String[] args) throws IOException {
        String filename = "test.txt" ;
        byte[] inputBytes  ={0};
        long startTime,endTime;
       
        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime =System.currentTimeMillis();
        // String outputString ="";
        // for(byte b : inputBytes){
        //     outputString += (char)b;
        // }
       

        StringBuilder outputStringBuider = new StringBuilder();
        for ( byte b :inputBytes){
            outputStringBuider.append((char)b);
        }
        endTime =System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
