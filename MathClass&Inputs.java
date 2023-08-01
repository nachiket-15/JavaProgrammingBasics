// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        //Math in java
        
        //Math.max(a,b) returns maximum 
        System.out.println(Math.max(5,6));
        //Math.min(a,b)
        System.out.println(Math.min(5,6));
        
        //Math.random()-gives random value mostly less than zero
        System.out.println(Math.random());
        
        //(int)Math.random() type casts into int so gives 0 for less than 0 val
        System.out.println((int)Math.random());
        
        
        
        //Input in java
        //Use Scanner class
        
        Scanner sc=new Scanner(System.in);//sc is an object of class Scanner
        System.out.println("Input your name: ");
        
        //nextInt() is an func from Scanner class
        int age=sc.nextInt();//nextFloat(),etc
        
        //inputing text till first space :As next()is capable of inputing only one token
        String name=sc.next();
        System.out.println(name);
        
        //For input of whole line , nextLine() is used 
        
        
        
    }
}
