package day7;

import java.util.TreeSet;
import java.util.Iterator;

public class ScoreMain 
{
public static void main(String[] args)
{
	TreeSet<Score> scores= new TreeSet<>();
	scores.add(new Score("monisha",123));
	scores.add(new Score("monish",523));
	scores.add(new Score("nisha",423));
	System.out.println(scores);
	Iterator<Score> iterator = scores.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
}
}
