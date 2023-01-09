import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*
    1. Հայտարարեք char տիպի զանգված և սկզբնարժեքավորեք այն “CheeseBurger” արտահայտությամբ:
*/
        String cheeseBurger = "CheeseBurger"; // empty string will cause out of 0 bounds exception
        char[] cheeseBurgerCharArray = cheeseBurger.toCharArray();
        int[] cheeseBurgerCharToIntArray = new int[cheeseBurgerCharArray.length];

        //a. Այդ զանգվածի մեջից գտնել ըստ ASCII աղյուսակի ամենափոքր սիմվոլի արժեքը և տպել էկրանին։
        for (int i = 0; i < cheeseBurgerCharArray.length; i++) {
            cheeseBurgerCharToIntArray[i] = cheeseBurgerCharArray[i];
            System.out.print(cheeseBurgerCharToIntArray[i] + " ");
        }
        System.out.println(cheeseBurgerCharArray);
        int min = cheeseBurgerCharToIntArray[0];
        for (int i = 0; i < cheeseBurgerCharToIntArray.length; i++) {
            if (min > cheeseBurgerCharToIntArray[i]) {
                min = cheeseBurgerCharToIntArray[i];
            }
        }
        System.out.println("Minimum is: " + min);

        //b. Այդ զանգվածի մեջից գտնել ըստ ASCII աղյուսակի ամենամեծ սիմվոլի արժեքը և տպել էկրանին։
        int max = cheeseBurgerCharToIntArray[0];
        for (int i = 0; i < cheeseBurgerCharToIntArray.length; i++) {
            if (max < cheeseBurgerCharToIntArray[i]) {
                max = cheeseBurgerCharToIntArray[i];
            }
        }
        System.out.println("Maximum is: " + max);

        //c. Հաշվեք և տպեք էկրանին այդ զանգվածի մեջ բոլոր ձայնավորների քանակը:
        int sum = 0;
        for (int i = 0; i < cheeseBurgerCharToIntArray.length; i++) {
            switch (String.valueOf(cheeseBurgerCharArray[i]).toLowerCase(Locale.ROOT)) {
                case "a", "e", "u", "o", "i":
                    sum += cheeseBurgerCharToIntArray[i];
                    System.out.print(cheeseBurgerCharArray[i] + " = ");
                    System.out.println(cheeseBurgerCharToIntArray[i] + " ");
                    break;
            }
        }
        System.out.println("Sum is " + sum);

        //e. Սկզբնական զանգվածի էլեմենտները դասավորեք հակառակ հերթականությամբ նույն զանգվածի մեջ։
        for (int i = cheeseBurgerCharArray.length - 1; i >= 0; i--) {
            System.out.print(cheeseBurgerCharArray[i]);
        }
        System.out.println();

/*
2. Ստացված զանգվածի մեջ բոլոր փոքրատառերը սարքել մեծատառ և տպել էկրանին։
 */

        System.out.println(String.valueOf(cheeseBurgerCharArray).toUpperCase(Locale.ROOT));

/*
3. Գրեք ծրագիր, որը երկու չափսի զանգվածներ կմիավորի երրորդ զանգվածի մեջ: Այսինքն ստանալ զանգված,
որը կպարունակի սկզբնական երկու զանգվածների բոլոր էլեմենտները։
 */

        char[] array1 = new char[]{33, 34, 35, 36, 37};
        char[] array2 = new char[]{38, 39, 40};
        char[] array3 = new char[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            System.out.println(array3[i]);
        }
        for (int k = 0; k < array2.length; k++) {
            array3[k] = array2[k];
            System.out.println(array3[k]);
        }



/*
4. Գրեք ծրագիր, որը գտնում և տպում է զանգվածի երկրորդ ամենափոքր տարրը: Այսինքն՝ տվյալ տարրը
փոքր է լինելու զանգվածի բոլոր էլեմենտներից, բացառությամբ երկուսից (ինքը իրենից և փոքրագույնից)
 */

        int[] arr = new int[]{20, 10, 30, 50, 40, 5, 4, 5, 4};
        int firstMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (firstMin > arr[i]) {
                firstMin = arr[i];
            }
        }
        int secondMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondMin && arr[i] != firstMin) {
                secondMin = arr[i];
            }
        }
        System.out.println(firstMin + " " + secondMin);


/*
5. Գրեք ծրագիր, որը ամբողջ թվային զանգվածի բոլոր կենտ թվերը լցնում է մեկ այլ զանգվածի մեջ:
Ստացված զանգվածը տպել էկրանին։
 */

        int[] arrayOfInts = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] secondArrayOfInts = new int[arrayOfInts.length];
        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] % 2 == 0) {
                secondArrayOfInts[i] = arrayOfInts[i];
                System.out.print(secondArrayOfInts[i] + " ");
            }
        }
        System.out.println();


/*
6. Հաշվել տրված զանգվածում բոլոր թվերի կրկնությունների քանակը։ Օրինակ,
եթե տրված է [1, 1, 2, 3, 4, 4, 5] զանգվածը, ապա ծրագիրը պետք է տպի էկրանին
"1: 2, 2: 1, 3: 1, 4: 2, 5: 1" (կրկնությունների քանակը)։
 */



/*
7. 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 Ֆիբոնաչիի առաջին տասը թվերն են։
Գրել ծրագիր, որը հաշվում է Ֆիբոնաչիի թվերի զույգ արժեքների գումարը։ Դիտարկել միայն այն թվերը,
որոնց արժեքը չի գերազանցում 4 միլիոնը։ Ստուգել պատասխանը այստեղ. https://projecteuler.net/problem=2
 */
        //print fibonacci sequence
        long [] fibonacciArray = new long[90];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i = 2; i < 90; i++){
            fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
            System.out.print(fibonacciArray[i] + " ");
        }
        System.out.println();

        //print sum of fibonacci even numbers
        long sumOfFibo = 0;
        for(long val : fibonacciArray){
            if (val%2 == 0){
                sumOfFibo += val;
            }
        }
        System.out.println(sumOfFibo);




/*
8. Իրականացնել ֆունկցիա, որը ստանում է թվային զանգված և սորտավորում այն՝ օգտագործելով bubble sort ալգորիթմը։
 */

        int unsortedArray[] ={3, 2, 60, 7, 35, 5, 2, 8, 45, 32, 5};
        sort(unsortedArray);
        System.out.println("Array After Bubble Sort");
        for(int i = 0; i < unsortedArray.length; i++){
            System.out.print(unsortedArray[i] + " ");
        }


/*
9. Իրականացնել ֆունկցիա, որը ստանում է թիվ և վերադարձնում այդ թվի ֆակտորիալը։
 */
        System.out.println(factorial(5));
    }


    static void sort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    static int factorial(int input){
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
        System.out.println("Factorial is " + factorial);
        return factorial;
    }


}