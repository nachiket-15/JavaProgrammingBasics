// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        //Comparision Operators 
        
        //a==b (equal)
        //!= (not equal)
        //< 
        //>
        
        
        //Conditional Statements
        boolean isSunUp=true;
        
        if(isSunUp){
            System.out.println("It is day time");
        }else{
            System.out.println("It is night time");
        }
        
        
        //Logical operators
        //&& both conditions true --> Final ans true else false
        
        int a=45;
        int b=56;
        
        if(a<60 && b<60){
            System.out.println("Both less than 60");
        }
        
        // || requires atleast one to be true
        if(a<50 || b<50){
            System.out.println("Atleast one is less than 50");
        }
        
        //   " ! " Not Operator -- Unary 
        
        boolean age2=false;
        if(!age2){
            System.out.println(!age2);//will give opposite of prev age2
        }
        
        
        
        //Switch statements 
        int day=1;//1-monday ,2-tuesday
        
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Funday");
                break;
        }
        
        
    }
}
