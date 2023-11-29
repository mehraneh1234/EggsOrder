// file related class are imported
package eggsorder.java;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
/**
 * Mehraneh Hamedani - 30062786
 * AT3 - Activity1 - read/write from/in a text file and calculate in a method 
 */
public class EggsOrderJava {
    public static void main(String[] args) {
     //Thess files in a current location 1st one for reading and 2nd for writing
        Path file = Paths.get("eggs.txt");
        Path file2 = Paths.get("total_amount.txt");
        InputStream input = null;// Sends data from an input source(eggs.txt)
        try{// File read/write have possible exceptions e.g. I/O exception
            // Establish an input stream with the file eggs.txt
            input = Files.newInputStream(file);
            // Buffer for reading
            BufferedReader reader = new BufferedReader
                (new InputStreamReader(input));
            String s = null;// A string that will contain the data from the file
            s = reader.readLine();// Read a line from a file
            
           // int no = Integer.parseInt(s);// Cast sting to int
           
            input.close(); // Close the file
             if (-2147483647 <= Long.parseLong(s) && 
                     Long.parseLong(s) <= 2147483647 ){
              //if(s.length() < 10){
                 int no = Integer.parseInt(s);// Cast sting to int
                 no = Math.abs(no);
                 // Call the method and assign it to a string
                String ss = calculateTotalAmount(no); 
                // Each character of the string will be saved seperately
                byte[] data = ss.getBytes();
         // Output stream sends data to an output destination (total_amount.txt)
                OutputStream output = null;
                // total_amount.txt is created
                output = new BufferedOutputStream(Files.newOutputStream
                    (file2, CREATE));
                output.write(data);// The data are written in the file
                output.flush();//Flush any pending data to the destination
                //Close the data otherwise it will be remained locked
                output.close();
            }
             else {
                 System.out.println("Maximum value is 2147483647");
            }
           
        }
        catch(IOException e){ // Exception are handled here
            System.out.println(e);// Display the exception info
        }
        catch(NumberFormatException e){
            System.out.println(e);// Display the exception info
        }
    }// Define a method with integer input and string output
    public static String calculateTotalAmount(int i){
        int doz = i / 12;// Assign the number of dozen to an int variable
        int perEgg = i % 12;//Assign the remain of the eggs to an int variable
        // Calculate the price of the eggs and assign it to a double variable
        double total = (doz * 7.25) + (perEgg * 0.75);
        // Assign the result to a string
        String result = "You redered " + i + " eggs.\n"
                + "That is " + doz + " dozen eggs at $7.25 per dozen and " 
                + perEgg + " additional eggs at $0.75 each for a \n" 
                + "total of $" + total + ".";
        return result;// Return the result 
    }
    
}
