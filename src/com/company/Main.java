package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

 // Exercise 3       int [] bu = {1,20,3,4};   System.out.println(bu[indexOfMax(bu)]);
 // Exercise 4       boolean [] findPrimenumbers = sieve(10);
 // Exercise 5       int[] ba = {2,5,3};    System.out.println(areFactors(10, ba ));
    }

/*    Exercise 5
//  Takes an integer n and an array of integers, and
//  returns true if the numbers in the array are all factors of n
//  (which is to say that n is divisible by all of them).
    public static boolean areFactors(int n, int[] p){
        for(int i = 0; i < p.length; i++){
            int test = n % p[i];
            if (test != 0){
                return false;
            }
        }
         return true;
    }
//    Exercise 5 END */

 /*//EXERCISE 4
// returns a boolean array from 0 to one less than n. Is the number prime, it returns true, else false
    public static boolean[] sieve(int n){
        n = n-1;
        boolean [] prime = new boolean[n];      //boolean is by default false
        for (int i = 0 ; i < n; i++){           //loop, counting for each variable in array
            prime[i] = true;                    //changing boolean to true
                for (int a = 2 ; a < i ; a++){  //loop counting all numbers between 2 and the variable value
                    int test = i % a;           //calculating for prime number
                if (test == 0 ) {               //testing for reminders
                    prime[i] = false;           //Changing to false if it's not prime-number
                }
                }

        }
        prime[0] = false;   //0 have not been checked if it is prime, but it can not be divided by 1
        prime[1] = false;   //1 have not been checked, but it can not be divided by any other number
        return prime;
    }

//EXERCISE 4 END */

/*  Exercise 3
//  Method that takes an array of integers and returns the index of the largest element.
//  Can you write this method by using an enhanced for loop? Why or why not?
    public static int indexOfMax(int[] all){
        int max=0;
        for (int i = 0 ; i < all.length-1 ; i++ ){
            if (all[i+1]>all[max]){
                max = i+1;
            }
        }return max;
    }

//    Exercise 3 END */


/* //    Exercise 2
//    OUTPUT : 30
//    mus takes 1 and ads the value og first placeholder in the string, then the second value and so on.
//    se the stack diagram below.


    public static int[] make(int n) {   //n=5           //
        int[] a = new int[n];           //a= [0,0,0,0,0]//
        for (int i = 0; i < n; i++) {   //i=0    n=5    //i=1 n=5       // //i=4 n=5        //i=5 n=5 STOP
            a[i] = i + 1;               //a= [1,0,0,0,0]//a=[1,2,0,0,0] // //a=[1,2,3,4,5]
                                        //i=1           //i=2           // //i=5
        }
        return a;                                                                           //returner [1,2,3,4,5]
    }
    public static void dub(int[] jub) {         // [1,2,3,4,5]
        for (int i = 0; i < jub.length; i++) {  //
            jub[i] *= 2;                        // [1,4,6,8,10]
        }
    }
    public static int mus(int[] zoo) {          //zoo=[1,4,6,8,10]
        int fus = 0;
        for (int i = 0; i < zoo.length; i++) {  //i=0 zoo.length=5 inden næste linje i=1
            fus += zoo[i];                      //fus= 1+1=2   //2+4=6  //6+6=12  //12+8=20  //20+10=30
            System.out.println(fus);
        }
        return fus;                             //returnere 29
    }
    public static void main(String[] args) {
        int[] bob = make(5);         // bob=[1,2,3,4,5]
        dub(bob);                       // [1,4,6,8,10]
        System.out.println(mus(bob));   //15
    }
EXERCISE 2 END */

/*    //EXERCISE 1
    public static int banana(int[] a) { //modtager array a
        int kiwi = 1;           //definere kiwi og sætter den til 1
        int i = 0;              //definere    i og sætter den til 0
        while (i < a.length) {  //while  i(0) er mindre end længden på a
            kiwi = kiwi * a[i]; //kiwi ændres til kiwi(1)*færste værdi i a, næste loop er det den nue kiwi * værdi 2 af a osv.
            i++;
        }
        return kiwi;
    }
    public static int grapefruit(int[] a, int grape) { //modtager array a og tal grape
        for (int i = 0; i < a.length; i++) {    //tjekker for hver karakter af a
            if (a[i] == grape) {                //tjekker om karakteren i a er tallet grape
                return i;                       //hvis true, returnere placeringen i i
            }
        }
        return -1;                              //hvis false, returnere -1
    }
    public static int pineapple(int[] a, int apple) { //modtager array a og tal apple
        int pear = 0;               //definere pear og sætter den til 0
        for (int pine: a) {         //tester på puine og a
            if (pine == apple) {    //hvis pine er tallet apple så:
                pear++;             //hver gang pear er lig tallet apple tilføjes 1
            }
        }
        return pear;                //til sidst retuneres værdien af pear
    }   EXERCISE 1 END*/
}
