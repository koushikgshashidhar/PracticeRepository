
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        
    	 int i = 4;
         double d = 4.0;
         String s = "HackerRank ";
 		
         Scanner scan = new Scanner(System.in);
       
         
         int i2=scan.nextInt();
         double d2=scan.nextDouble();
         String s2=new String(); 
         scan.nextLine();
         s2=scan.nextLine();
         String s3=s.concat(s2);
         System.out.println(i+i2);
         System.out.println(d+d2);
       //  System.out.println(s2);
         System.out.println(s3);
         
         /* Declare second integer, double, and String variables. */

         /* Read and save an integer, double, and String to your variables.*/
         // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

         /* Print the sum of both integer variables on a new line. */

         /* Print the sum of the double variables on a new line. */
 		
         /* Concatenate and print the String variables on a new line; 
         	the 's' variable above should be printed first. */

         scan.close();
    }
}
