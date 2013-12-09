package me.agilani.www;

public abstract class Believer extends Human {
	
	private Pray pray;
	private Religion religion;
	
	public Believer(Pray pray, Religion religion)
	{
		super();
		this.pray = pray;
		this.religion = religion;
	}
	
	public void pray()
	{
		pray.pray();
	}
	
	public void show()
	{
		religion.show();
	}

}
