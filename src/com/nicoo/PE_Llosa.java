package com.nicoo;
/*
Eduardo Dominico Llosa
CSCC 20 B - OBJECT-ORIENTED PROGRAMMING
Prelim Exam - Practical
*/

import java.util.Scanner;

public class PE_Llosa {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Roman numeral: ");
        String roman = read.nextLine();
        System.out.println("Arabic form: ");
        System.out.print(sol.romanToInt(roman));
    }
    static class Solution {
        public int romanToInt(String s)
        {
            int sum = 0;
            for(int i = 0; i < s.length(); i++)
            {
                switch(s.charAt(i))
                {
                    case 'I':
                        if(s.length() != i+1)
                        {
                            if(s.charAt(i+1)=='V'||s.charAt(i+1)=='X')
                            {sum--; }
                            else
                            {sum++; } }
                        else{sum++;}
                        break;
                    case 'V':
                        sum+=5;
                        break;
                    case 'X':
                        if(s.length() != i+1)
                        {
                            if(s.charAt(i+1)=='L'||s.charAt(i+1)=='C')
                            {sum -=10; }
                            else
                            {sum += 10;}}
                        else
                        {sum +=10; }
                        break;
                    case 'L':
                        sum+=50;
                        break;
                    case 'C':
                        if(s.length() != i+1)
                        {
                            if(s.charAt(i+1)=='D'||s.charAt(i+1)=='M')
                            {sum -=100;}
                            else
                            {sum += 100; }
                        }
                        else
                        {sum +=100;}
                        break;
                    case 'D':
                        sum+=500;
                        break;
                    case 'M':
                        sum+=1000;
                        break;
                }
            }

            return sum;
        }
    }
}