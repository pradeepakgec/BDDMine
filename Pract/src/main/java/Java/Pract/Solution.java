package Java.Pract;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Result 
{

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) 
    {
    // Write your code here
        for (int i = 0; i < n; i++) 
        {
            if(i%3 == 0 && i%5 == 0)
            {
                System.out.println("FizBuzz");
            }
                else if(i%3 == 0 && i%5 != 0)
                {
                    System.out.println("FizBuzz");
                }
                    else if(i%3 != 0 && i%5 != 0)
                    {
                        System.out.println("FizBuzz");
                    }
                        else if(i%3 != 0 && i%5 != 0)
                        {
                            System.out.println("FizBuzz");
                        }
        }
   
        }
    }

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}