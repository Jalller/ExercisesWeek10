package com.company;

import java.util.*;


public class Main {


    public static void main(String[] args) {
        System.out.println(min(-2, -3, 1)); //Opgave 1
        printEvenNumbers(10); //Opgave 2
        System.out.println(smallestAbsValue(-3, -2, 10)); //Opgave 3
        System.out.println(sumDigits(93)); //NOPE //Opgave 4
        reverseVertical("OKAY"); //Opgave 5
        processName();
        System.out.println(repeat("hej"));
        shortestName(3);
        practiceArraylists();
        randomNumbers();
        //maxMin();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3432);
        arr.add(34534534);
        arr.add(2);
        max(arr);
        printMuliple(5);
        int[] arr1 = new int[]{1, 10, 10};
        int[] arr2 = new int[]{2, 2, 3};
        allLess(arr1, arr2);
    }

    public static int min(int a, int b, int c) { //Opgave 1
        int first = Math.min(a, b);
        int second = Math.min(b, c);
        return Math.min(first, second);
    }

    public static void printEvenNumbers(int n) { //Opgave 2
        for (int i = 0; i <= n; i = i + 2) {
            System.out.println(i);
        }
    }

    public static int smallestAbsValue(int a, int b, int c) { //Opgave 3
        int smallest = 0;
        int absa = Math.abs(a);
        int absb = Math.abs(b);
        int absc = Math.abs(c);
        return min(absa, absb, absc);
    }

    public static int sumDigits(int n) { //////HOOOOOOOOW // Opgave 4
        int sum = 0;
        return sum;
    }

    public static void reverseVertical(String str) { //Opgave 5
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }

    public static void processName() { //Opgave 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String name = sc.nextLine();
        System.out.println("You're name is: " + name.toUpperCase());
    }

    public static String repeat(String str) { //Opgave 7 //MANGLER at kunne håndtere end tom streng, out of bounds -1 (ellers printes 1 for mange gange)
        String str2 = str.repeat(str.length());
        return str.concat(str2);
    }

    public static void shortestName(int n) { //Opgave 8.. No idea
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Please enter name " + i + " out of " + n + " names");
            String name = sc.nextLine();
            names.add(name);
            Collections.sort(names);
            //System.out.println("After " + i + "out of " + n +"names." + "currently shortest name is: " + names.get(0));
        }
        System.out.println("The shortest name is: " + names.get(0));

    }


    //EXERCISES FROM POWERPOINT 09-03-2021
    public static void practiceArraylists() {
        ArrayList<String> arrstr = new ArrayList<>();
        arrstr.add("Jesper");
        arrstr.add("is");
        arrstr.add("awesome");
        arrstr.add(2, "not");
        System.out.println(arrstr);
        arrstr.set(2, "totally");
        System.out.println(arrstr);
        for (int i = 0; i < arrstr.size(); i++) {
            if (arrstr.contains("totally")) {
                arrstr.remove(i);
                System.out.println(arrstr);
                System.out.println("her");
            }


        }
        arrstr.sort(Comparator.comparing(String::toString));
        System.out.println(arrstr);

    }

    public static void randomNumbers() { //Opgave 9
        Random rnd = new Random();
        do {
            System.out.println("Random number" + rnd.nextInt(1000));
        } while (rnd.nextInt(1000) <= 900);
        {
        }
    }

    public static void maxMin() { //Opgave 10
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (sc.hasNextInt()) {
            if (sc.nextInt() == -1) {
                System.out.println(numbers);
                for (int i = 0; i < numbers.size(); i++) {
                    System.out.println("The numbers are" + numbers);
                    Collections.sort(numbers);
                    System.out.println("The smallest number is: " + numbers.get(0));
                    System.out.println("The largest number is: " + numbers.get(numbers.size() - 1));
                }
                sc.close();
            } else {
                System.out.println("please enter a number or -1 to quit");
                int number = sc.nextInt();
                numbers.add(number);
            }

        }

    }

    public static void printMuliple(int n) { //Opgave 11
        for (int i = 0; i <= 10; i++) {
            if (i == 10) {
                System.out.print(n * i);
            } else {
                System.out.print(n * i + " og ");
            }
        }
    }

    public static int max(ArrayList<Integer> numbers) { //Opgave 12
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println("Largest number is" + numbers.get(numbers.size() - 1));
        return numbers.get(numbers.size() - 1);
    }

    public static boolean allLess(int[] arr, int[] arr2) {
        boolean firstLess = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] < arr2[j]) {
                    System.out.println("is" + arr[i] + " smaller than " + arr2[j] +" ? :" + firstLess);
                    firstLess = true;

                } else {
                    System.out.println("is" + arr[i] + " smaller than " + arr2[j] +" ? :" +firstLess);
                    firstLess = false;
                }
            }
        }
        return firstLess;


}


}
