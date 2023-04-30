package org.example;

public class ejercicio_55 {
    //creamos el metodo factorial
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static int taylor(int x){
        int sum=0;
        for(int i=0;i<10;i++){
            sum+=Math.pow(x,i)/factorial(i);

        }
        return sum;
    }

}

