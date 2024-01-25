import java.util.*;
class Calci{

    //num1 : first number
    //num2: second number

    //addition function to add two number 
    public int add(int num1,int num2){

        return num1+num2;  // return sum of two number
    }

    //substraction function to substract two number 
    public int substraction(int num1,int num2){
        
        return num1-num2; //return substaction of number
    }

     //multiplication function to multiply two number 
     public double multiply(double num1,double num2){
        
        return num1*num2; //return product of two number
    }

     //Cube function to get cube of a number 
     public double Cube(double num1){
        
        return num1*num1*num1; //return product of two number
    }

    //Square function to get square of number 
    public double square(double num1){
        
        return num1*num1; //return square of a number
    }

    //SquareRoot function to get squareRoot of a number 
    public double squareRoot(double num1){
        
        return Math.sqrt(num1); //return squareRoot of a number
    }

    //division function to divide two number 
    public double divide(double num1,double num2){
        
        return num1/num2; //return division of two number
    }
    //function to get remainder when we divide two number 
    public int remainder(int num1,int num2){
        
        return num1 % num2; //return remainder when we divide num1 by num2

    }


    public static void main(String args[]){

        int a=5;

        int b=4;

        Calci c=new Calci();

        System.out.println(c.add(a,b));
        System.out.println(c.substraction(a,b));
        System.out.println(c.multiply(a,b));
        System.out.println(c.divide(a,b));
        System.out.println(c.Cube(a));
        System.out.println(c.square(a));
        System.out.println(c.remainder(a,b));
        System.out.println(c.squareRoot(a));



    }

    

   
}