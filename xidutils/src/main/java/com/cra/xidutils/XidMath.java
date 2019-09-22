package com.cra.xidutils;

public class XidMath {


    public  static  int Plus (int a, int b){
        return a+b;
    }
    public  static  int Plus (int a, int b,int c){
        return a+b;
    }

    public  static  int Minus (int a, int b){
        return a-b;
    }
    public  static  int Times (int a, int b){
        return a*b;
    }
    public  static  float Div (int a, int b){

        if (b==0){
            throw  new IllegalArgumentException ("Div by Zero");
        }
        else
        {
            return a/b;
        }

    }

    public  static  int AddtoN (int n){

        int sum=0;
        for (int i=1;i<=n;i++) {
            sum+=i;
        }
        return sum;
        }

    public  static  int OddtoN (int n){

        int sum=0;
        for (int i=1;i<=n;i+=2) {
            sum+=i;
        }
        return sum;
    }

    public  static  int EventoN (int n){

        int sum=0;
        for (int i=0;i<=n;i+=2) {
            sum+=i;
        }
        return sum;
    }


}


