import java.util.*;

class Calculator{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int choice;
        double num1,num2;
        String option="""
        WELCOME!!! To Simple Calculator....
        Choose one of the Following operations: 
        1. Add
        2. Subtract
        3. Multiply
        4. Divide
        5. Modulus
        6. Power
        7. Exit
        """;
                  
        System.out.print(option);
    for(;;){
        System.out.print("Now, enter your choice: ");
        choice=s.nextInt();
        if(choice==7){
            System.out.println("Exiting the Calculator...Thankyou!!!");
            break;
        }
        
        System.out.print("Enter First number: ");
        num1=s.nextDouble();
        System.out.print("Enter second number: ");
        num2=s.nextDouble();

        switch(choice){
            case 1:
                double add=num1+num2;
                System.out.println("The addition of two numbers is "+add+"\n");
            break;
            case 2:
                double sub=num1-num2;
                System.out.println("The subtraction of two numbers is "+sub+"\n");
            break;
            case 3:
                double mul=num1*num2;
                System.out.println("The multiplication of two numbers is "+mul+"\n");
            break;
            case 4:
                double div=num1/num2;
                if(num2==0){
                    System.out.println("Invalid entry for division.\n");
                    System.out.println("Again, Enter value for second number: ");
                    num2=s.nextDouble();
                    div=num1/num2;
                    System.out.println("The division of two numbers is "+div+"\n");
                
                }else{
                //double div=division(num1,num2);
                System.out.println("The division of two numbers is "+div+"\n");
                }
            break;
            case 5:
                double mod=num1%num2;
                if(num2==0){
                    System.out.println("Invalid entry for modulus.\n");
                }else{
                //double mod= modulus(num1,num2);
                System.out.println("The modulus of two numbers is "+mod+"\n");
                }
            break;
            case 6:
                double power=Math.pow(num1,num2);
                System.out.println("The power of first number raised to another is "+power+"\n");
            break; 
            default:
                System.out.println("Invalid Entry;");   
        }
        
        System.out.print(option);
    }
    
    }
}
