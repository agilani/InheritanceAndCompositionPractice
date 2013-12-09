package me.agilani.www;

import java.util.ArrayList;
import java.util.Iterator;

public class Runner {

	public static void main(String[] args) {

		ArrayList<Believer> list = new ArrayList<Believer>();
		
		list.add(new Muslim(new Muslimla(), new Islam()));
		list.add(new Christian(new Christianla(), new Jesus()));
		list.add(new Smo(new Smola(), new Sua()));
		
		Iterator<Believer> it = list.iterator();

		while(it.hasNext())
		{
			it.next().showBelieve();
		}
	}

}
