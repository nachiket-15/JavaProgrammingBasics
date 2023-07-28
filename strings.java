class HelloWorld {
    public static void main(String[] args) {

        //String
        String name ="Nachiket";//No error on increasing size , as they are of variable size
        String lname="Deshmukh";
        String friend="Soham";
        
        //Printing length of string (length()fn)
        System.out.println(friend.length());
        
        
        //Non primitive data types require intialization using a new keyword ,except in strings 
        String engg_year=new String("TY");
        
        
        //Strings 
        String name1="Vasudhaiv";
        String name2="Kutumbakam";
        
        String name3=name1+" "+name2;
        System.out.println(name3);
        
        //checking character at index in string
        System.out.println(name1.charAt(0));//here checking at 0th index
        
        //Length
        System.out.println(name1.length());
        
        String str="Java";
        //string name (.) replace(oldchar,newchar)
        String str2=str.replace('a','b');
        System.out.println(str2);
        
        //Strings in java are immutable 
        
        
        //Substrings 
        String name4="Now and then";
        //syntax:- var.substring(startindex,endindex+1)
        System.out.println(name4.substring(0,4));//Prints Now

             
    }
}
        
