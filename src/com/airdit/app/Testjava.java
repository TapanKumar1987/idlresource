package com.airdit.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Testjava {

	public static void main(String[] args) {
		/*
	     List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        List<Float> productPriceList2 =productsList.stream()  
	                                     .filter(p -> p.price < 30000)// filtering data  
	                                     .map(p->p.price)        // fetching price  
	                                     .collect(Collectors.toList()); // collecting as list  
	        System.out.println(productPriceList2); 
		
		*/
		
		
	        int[] arr={1,3,4,6};
	        boolean b=false;
	        ArrayList<Integer> arl=new  ArrayList<Integer>();
	        for(int i=1;i<=10;i++)
	        {
	           for(int j=0;j<arr.length;j++)
	           {
	            if(i==arr[j])
	            {
	            	b=false;
	               break;
	            }
	            else
	            { 	//if(i!=arr[j])
	            b=true;
	           }
	            
	           }
	           if(b)
	           {
	        	   arl.add(i);
	           }
	           
	        }
	        for(int s:arl)
	        System.out.println(s);
		/*
		
		Product pr =new Product();
				pr.count=3;
				System.out.println(pr.count);
				
				
		int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		  
		}
		int temp;
		 int n=0,n1=1,i;
		{System.out.print(0+" "+1);
		      for( i=2;i<10;++i)
		{
		        temp=n+n1;
                   n=n1;
		           n1=temp;

		System.out.print(" "+temp);
		}
		}
		/*
		int count=0;
		HashSet<String> has=new HashSet<String>();
		String[] str= {"abc","wer","abc","gtr","abc","erf","gtr","erf","asr","asr","wer","bsf"};
		for(String str1:str)
		{
			has.add(str1);
		}
		for(String str3:has)
		{
			System.out.print(str3+" ");
		}
		System.out.println();
		for(String str3:has)
	{
		for(int i=0;i<=str.length-1;i++)
		{
			
				if(str3.equals(str[i]))
				{
					++count;
				}
		}
			System.out.print(str3+count+" ");
			count=0;
	}*/
		 
	}
	
}


	
	
	

