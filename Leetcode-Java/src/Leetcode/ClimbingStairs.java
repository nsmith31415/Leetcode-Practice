package Leetcode;

public class ClimbingStairs {
    public static void main(String[] args) throws Exception {
        //  Climbing Stairs Problem:
        /*  You are climbing a stair case. It takes n steps to reach to the top.
            Each time you can either climb 1 or 2 steps. 
            In how many distinct ways can you climb to the top?
        */
        
        ClimbingStairs a = new ClimbingStairs();
        for(int i=0; i<10; i++){
            a.climbStairs(i);
        }
        
    }

    public int totalclimbs=0;
    
    public int climbStairs(int n) {
        System.out.println("n:" + n);
       if(n<=3){
            return n;
       }
       else{
           int a=0;
           int b=1;
           int c=a+b;

           for(int i=1; i<n; i++){
                a=b;
                b=c;
                c=a+b;
           }
           System.out.println("total:" +c);
           return c;
       }
    }
    
    public void recursivehelper(int step,int n){
        if(step>n){
            
        }
        else if(step==n){
            totalclimbs++;
        }
        else{
            n-=step;
            recursivehelper(1,n);
            recursivehelper(2,n);
        }
    }
}