package com.task6;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Custom {
	List<Integer>list=new ArrayList<Integer>(10);
	void addMember(int element)
	{
		list.add(element);
	}
	int position(int element) {
		return list.indexOf(element);
	}
	void removeMember(int element)
	{
		list.remove(list.indexOf(element));
	}
	void print()
	{
		System.out.println(list);
		System.out.println();
	}
}
