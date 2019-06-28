#Sock Merchant

Given a pile of __n__ number of colored socks, find how many pairs of socks are present.

Write a method that takes _n_(number of elements), and _ar_ (an array of the different socks represented by numbers).

Example:

__Input__ 9, [10, 20, 20, 10, 10, 30, 50, 10, 20]

__Output__ 3

[Problem Statement](sock-merchant.pdf)

## What did I learn?

* Write numerous test cases with different inputs. 
    * I started out using the Modular operation and the Count reduction operation. 
        And the first testcase was successful by happenstance.
```java
public class SockMerchant{
    static int sockMerchant(int n, int[] ar){
        
        Map<Integer, Integer> counts = new HashMap<>();
        // ... array that puts ar into map
        
        return counts.keySet().stream().mapToInt(k -> counts.get(k) % 2).count();
    }
    
    public static void main(String[] args){
        
        final int[] ar = {0, 1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        final int n = ar.length;
        
        sockMerchant(n, ar);
        /*
        * This set has four pairs ({1,1}, {3,3}, {3,3}, {3,3})
        * 
        * And the _sockMerchant_ method returns 4
        */
    }
}
```   
 
* The _count_ operation _sum_ operation are different.
    * Seems pretty obvious now:
        * The _sum_ operation is used to sum together all the elements of the stream.
        * The _count_ operation is used to could all the elements of the stream.
