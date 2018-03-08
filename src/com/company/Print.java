package com.company;

public class Print {
    private String basicLetter;
    Print() {
    }

    public void Star() {
        System.out.println("print *");
        System.out.println("*");
    }


    public void NLines(int n) {
        System.out.println("print n lines");
        for (int i = 0 ;i < n; i++) {
            System.out.println("*");
        }
    }

    public void RightTriangle(int n) {
        System.out.println("print right triangle");
        for (int i = 0 ; i< n; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void IsoscelesTriangle(int n) {
        System.out.println("print isosceles triangle");
        for (int i = 0 ; i< n; i++) {
            for (int j = 0; j <= i+2; j++){
                if(j< n-i-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }

    public void Diamond(int n) {
        System.out.println("print Diamond");
        for (int i = 0; i < 2*n; i++) {
            if (i < n) {
                for (int j = 0; j <= i+2; j++){
                    if(j< n-i-1){
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
                System.out.print("\n");
            }
            else {
                for (int j = 0; j<= 2*n -i; j++) {
                    if (j <= Math.abs(n - i)) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }

    }

    public void DiamondWithName(int n) {
        System.out.println("print Diamond With Name");
        for (int i = 0; i < 2*n-1; i++) {
            if (i == (n-1)) {
                System.out.println("Bill");
                continue;
            }

            if (i < n) {
                for (int j = 0; j <= i+2; j++){
                    if(j< n-i-1){
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
                System.out.print("\n");
            }
            else {
                for (int j = 0; j<= 2*n -i; j++) {
                    if (j <= Math.abs(n - i)) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }

    }

    public void FizzBuzz() {
        for (int i =1; i<= 100; i++) {
            if (i % 3 == 0){
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }

            if (i % 3 != 0 && i % 5 != 0){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void Array(int[] result) {
        for (int i = 0; i< result.length; i++) {
            if (result[i] != 0) {
                System.out.print(result[i] + ",");
            }
        }
    }
}
