// Online Java Compiler
// Use this editor to write, compile and run your Java code online

//Imported below class of Arrays to use predefined functions ex.sort()
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
         //Arrays 
        
        int []marks=new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;
        
        //Accessing array elements
        System.out.println(marks[0]);
        
        //If we access a value that does not exists , we get index out of bound error 
        System.out.println(marks[5]);
        
        //Length of an array
        System.out.println(marks.length);
        
        
        //Sort an array using sort func of class Arrays
        Arrays.sort(marks);
        // Check if it has get sorted  
        System.out.println(marks[0]);
        
        
        //Array when we prior know values of elements
        int []numbers={89,90,91};
        
        //2D arrays
        int [][] final_marks={{97,98,99},{95,96,97}};
        
        //Accessing them 
        System.out.println(final_marks[0][2]);//3rd subject of first student
        
        
        
        
        
    }
}
