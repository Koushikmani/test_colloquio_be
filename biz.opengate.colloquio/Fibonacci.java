package biz.opengate.colloquio;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonacciSeries(100);
    }
    
    public static void printFibonacciSeries(int limit) {
        int a = 0;
        int b = 1;
        
        System.out.println("Fibonacci series numbers less than " + limit + ":");
        
        while (a < limit) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}