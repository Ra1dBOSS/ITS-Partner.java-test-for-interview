package net.itspartner.test.n4;

/**
 * Task:
 * 1) Implement interface BiggestNumberFinder to provide functionality of finding the biggest number from array
 * 2) Write unit tests for this class with JUnit
 */
public class Main implements BiggestNumberFinder{

    public static void main(String[] args) {

        int[] a = {1, 3, 6 , -1, 12, 4, 5};
        Main m = new Main();
        System.out.println("The biggest number is " + m.findTheBiggestNumber(a));

    }

    @Override
    public int findTheBiggestNumber(int[] numbers) {
        int max = numbers[0];
        for (int x : numbers)
            if (max < x)
                max = x;
        return max;
    }
}
