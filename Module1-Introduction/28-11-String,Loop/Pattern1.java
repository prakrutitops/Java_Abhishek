package com.a2811;

public class Pattern1 
{
	
	public static void main(String[] args)
	{
		
		
		//row
		for(int i=1;i<=5;i++)
		{
			
			//col
			for(int j=1;j<=i;j++)
			{
				//System.out.print("*");
				////System.out.print(i);
				//System.out.print(j);
				 //System.out.print((char)(64+i));  
			
					if(i%2==0)
					{
						System.out.print("#");
					}
					else
					{
						System.out.print("*");
					}
				
			}
			
			System.out.println();
			
		}
		
		
	}
	
}
