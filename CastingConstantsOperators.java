// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        //Casting 
      
        //Converion from one type to another:      1)Implicit 2)Explicit
        double price=100.00;
        double fprice=price+18;//Implicit casting : As here we convert small int into double 
        
        // System.out.println(fprice);//op will be 118.00 and not 118 as addition of integer is done on double data type number 
        
        //Similaryly if u add double number to integer number then it would throw error as integer size is small and information which is greater in double is tring to get into int which is small and may loose out 
        
        //Hence java does not allow type casting from large data type (ex double) to small data type (ex int)
        
        int p=100;
        int fp=p+18.0;
        //printing fp will throw error hence 
        
        //Explicit Typecasting : We purposely advise java to convert double into int and we allow data loss
        
        int fpp=p+(int)18.0;//This wont throw error
        
        
        //Constants 
        
        int age=32;
        age=33;
        age=34;
        
        //When we want to create a var whose values we dont want to change
        final float PI=3.14f;
        //Below line will through error
        PI=3.22f;
        
        
        
        
        
        
        //Operators
        int a=1;
        int b=2;
        int sum=a+b;
        System.out.println(sum);
        int diff=a-b;
        System.out.println(diff);
        int mul=a*b;
        System.out.println(mul);
        
        double po=3;
        double so=6;
        double div=(po/so);
        System.out.println(div);
        
        double w=5;
        double q=3;
        double modulo=w%q;
        System.out.println(modulo);
        
        //unary operators
        w++ ;//equivalent to w=w+1
        
        
        System.out.println(w++);//6
        System.out.println(w);//7
        System.out.println(++w);//8
        
        
        
        
        
        
    }
}
