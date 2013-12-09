package me.agilani.www;

public class Muslim extends Believer {

	public Muslim(Pray pray, Religion religion) {
		super(pray, religion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showBelieve() {
		// TODO Auto-generated method stub
		show();
		pray();

	}

}
