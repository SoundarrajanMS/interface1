package org.comp;

public class Desktop implements Hardware,Software {
public void desktopModel() {
	System.out.println("year-2012");

}
	@Override
	public void sottwareResources() {
		System.out.println("winows 10");
		
	}

	@Override
	public void hardWareResources() {
		System.out.println("keyboard");
		
	}
	@Override
	public void nonPhysical() {
		System.out.println("google chrome");
	}
public static void main(String[] args) {
	Desktop comp = new Desktop();
	comp.hardWareResources();
	comp.sottwareResources();
	comp.desktopModel();

	comp.nonPhysical();
	
}
}
