package com.company;

public class Main {

    public static void main(String[] args) {
//	    int sum= 5+9;
        //Shorthand Operators
//	    sum=sum+1;
//        System.out.println(sum);
//        sum+=1;
//        System.out.println(sum);
//        sum*=2;
//        int anotherInteger=10;
//        ++anotherInteger;
//        System.out.println(anotherInteger);

//        boolean isOver18=true;
//        if(!isOver18) {
//            System.out.println("You are not allowed to buy this product");
//        }

//        String operation = "Sum";
//        int numberA = 10;
//        int numberB = 5;
//        int result;
//        if (operation == "sum")
//            result = numberA + numberB;
//        else
//            result = numberA - numberB;

        //ternary if ?: is a shortcut to assigning two values to a variable
        //depending on a given condition

//        int result2 = operation == "sum" ? numberA + numberB : numberA - numberB;
//
//        System.out.println(result2);
//        int sum1=sum(5,6);
//        int sum2=sum(3,4);
//        int sum3=sum(1,2,3);
//        double sum4=sum(1.0,9.0);
//        System.out.println(sum4);
        Car car = new Car();
        car.setWheels(2);
//        car.setType("Mazda");
//
//        System.out.println(car.getWheels());
//        System.out.println(car.getType());

        BankAccount account=new BankAccount("000123",50.0,"Mark",25,"Mark@gmail.com");
        //account.setTotalBalance(100.0);
//        account.setAccountOwnerAge(25);
//        account.setAccountNumber("0001234");
//        account.deposit(5);
//        account.withdrawal(5);
//        account.withdrawal(100.1);
        System.out.println(account.getTotalBalance());
    }

    //A method is a block of code that can be executed by calling it
    //We can pass data to a method by parameters
    //Methods main purpose is to perform certain actions
    //Methods are also known as functions
    //With methods we can reuse code by defining it only once and using it many times
    //Each method will have a return type unless it's void (not returning anything)
    //Methods can be declared only within a class
    //Declaration of a method will usually start with access modifier such as public private etc..
    //Then we will set the return type such as int String void (void meaning return nothing) etc..
    //Afterwards we will write the method's name (in camelCase) followed by parentheses
    //Inside the parentheses we can declare which parameters the method will receive
    //It's best practice separating different actions into different methods
    //it will help with testing the application and maintaining the code

    //method overloading is using the same method name with different amounts and types of parameters
    //in order to overload a method we create a unique method signature we consists of the methods name
    //amount of parameters and their type, naming of parameters isn't required to be the same between the methods

    public static int sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public static int sum(int a, int b, int c) {
        int sum = a + b + c;
        //System.out.println(sum);
        return sum;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
