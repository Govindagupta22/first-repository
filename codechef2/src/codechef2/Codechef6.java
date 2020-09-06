package codechef2;

import java.util.Scanner;
import java.io.*;

public class Codechef6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     System.out.println("First change");
	       int t=sc.nextInt();
	       for(int i=0;i<t;i++)
	       {
	    	   int[] a=new int[10000000];
	    	   int l,r,c=0,temp=0;
	    	   int n=sc.nextInt();
	    	   for(int j=0;j<n;j++)
	    	   {
	    		   l=sc.nextInt();
	    		   r=sc.nextInt();
	    		   if(a[l]==0)
	    		   {
	    			   temp=0;
	    			   a[l]=1;
	    			   for(int k=l+1;k<=r;k++)
	    				   if(a[k]>0)
	    				   {
	    					   temp=1;
	    					   break;
	    							   
	    				   }
	    			   if(temp==0) {
	    				   c++;
	    				   a[r]=1;
	    			   }
	    				  
	    			   else
	    				   a[l]=0;
	    		   }
	    		
	    			   
	    	   }
	    	   
	    	   int result=n-c;
	    	   
	    	   if(c==1)
	    		   System.out.println("-1");
	    	   else
	    		   System.out.println(result);
	       }
		

	}

}
