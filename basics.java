
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello Java");
       //Variables 
        
        //----Primitive Types----
        byte age=30;//-127 to 128 is storage limit
        int phone=992299999;
        
        //Append long by L , else Java assumes it to be integer
        long phone2=9022515467L;
        
        //Similar for float too , append F
        float pi=3.14F;
        
        //Character (2 bytes)
        char letter='@';
        
        //boolean
        boolean isAdult=true;
        boolean notAdult=false;
        
        //----Non Primitive Types----
        
        //String
        String name ="Nachiket";//No error on increasing size , as they are of variable size
        String lname="Deshmukh";
        String friend="Soham";
        
        //Printing length of string (length()fn)
        System.out.println(friend.length());
        
        
        //Non primitive data types require intialization using a new keyword ,except in strings 
        String engg_year=new String("TY");
        
    }
}
