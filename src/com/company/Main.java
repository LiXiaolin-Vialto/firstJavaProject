package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Print print = new Print();
        print.Star();
        print.NLines(3);
        print.RightTriangle(3);
        print.IsoscelesTriangle(3);
        print.Diamond(3);
        print.DiamondWithName(3);
        print.FizzBuzz();
        int[] primes = findPrimeFactor(210);
        System.out.println("print prime factor");
        print.Array(primes);
    }

    private static int[] findPrimeFactor(int n) {
        int[] result = new int[n-2];
        int p = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && isPrime(i)){
                result[p] = i;
                p++;
            }
        }
        return result;
    }

    private static boolean isPrime(int n) {
        for (int i = 2 ; i<= Math.ceil(Math.sqrt(n)) && i < n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
