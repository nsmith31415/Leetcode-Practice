package Leetcode;

/**
 * ArrayProduct
 */
public class ArrayProduct {

    /*Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
    For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
    Follow-up: what if you can't use division?
    */
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        array = arrayprod(array,false);
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }

    public static int[] arrayprod(int[] arr, boolean div){
        //with division
        if(arr.length == 1){
            int[] newarr = {0};
            return newarr;
        }
        if(div){
            int product = 1;
            //find a total product of all elements
            for(int i=0; i<arr.length; i++){
                product*=arr[i];
            }
            int[] newarr = new int[arr.length];
            //divide by each to get that slot
            for(int j=0; j<arr.length; j++){
                newarr[j]=product/arr[j];
            }
            return newarr;
        }
        //without division
        else{
            int[] left = new int[arr.length], right = new int[arr.length], prod = new int[arr.length];

            /*
            Theory:
            [a,b,c,d,e]
                   a           b     c        d         e
            Left: [1       \\ a    \\ a*b \\ a*b*c \\a*b*c*d]

            Right:[b*c*d*e \\ c*d*e \\ d*e \\  e   \\ 1]
            
            L*R:  
            */
            left[0]=1;
            right[arr.length-1]=1;
            for(int i=1; i<arr.length; i++){
                left[i]=arr[i-1]*left[i-1];
            }

            for(int j=arr.length-2; j>=0; j--){
                right[j]=arr[j+1]*right[j+1];

            }
            
            for(int k=0; k<arr.length; k++){
                prod[k] = left[k]*right[k];
            }

            return prod;
        }
    }

}