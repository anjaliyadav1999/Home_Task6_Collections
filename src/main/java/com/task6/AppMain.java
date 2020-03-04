package com.task6;

import java.util.Scanner;

public class AppMain {
	public static void main(String args[])
	{
		Custom collection=new Custom();
		Scanner sc=new Scanner(System.in);
		int ch=1;
		while(ch!=0)
		{
			System.out.println("\nEnter 1 to Add Member");
			System.out.println("Enter 2 to get poistion of specific Member");
			System.out.println("Enetr 3 to remove Member:");
			System.out.println("Enter 4 to PrintList");
			System.out.println("Enter 0 to exit");
			ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("\nEnter Member:");
				collection.addMember(sc.nextInt());
			}
			else if(ch==2)
			{
				System.out.println("\nEnter Member:");
				System.out.println("Position is:"+collection.position(sc.nextInt()));
			}
			else if(ch==3)
			{
				System.out.println("\nEnter Member to remove:");
				collection.removeMember(sc.nextInt());
			}
			else if(ch==4)
			{
				System.out.println("\nThe List:");
				collection.print();
			}
		}
	}

}
