package day7;

import java.util.LinkedList;

public class BrowseHistoryMain
{
@SuppressWarnings("unused")
public static void main(String[] args)
{
	LinkedList<String> browsehistory=new LinkedList<String>();
	
	browsehistory.add("Durable");
	browsehistory.add("Wikipedia");
	browsehistory.add("Loveable");
	browsehistory.add("Youtube Converter");
	
	System.out.println("The history :");
	for(String URLs: browsehistory)
	{
		System.out.println(URLs);
	}
	browsehistory.removeLast();
	System.out.println("The history before deletion:");
	for(String URLs: browsehistory)
	{
		System.out.println(URLs);
	}
}
}
