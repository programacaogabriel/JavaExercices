package Util;

public class Class {
	
	private int number;
	private int up, down,lef,rigth;
	String name;
	
	public Class(int number,int left, int rigth, int up,int down) {
		this.number=number;
		this.up=up;
		this.lef=left;
		this.rigth=rigth;
		this.down=down;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getUp() {
		return up;
	}

	public void setUp(int up) {
		this.up = up;
	}

	public int getDown() {
		return down;
	}

	public void setDown(int down) {
		this.down = down;
	}

	public int getLef() {
		return lef;
	}

	public void setLef(int lef) {
		this.lef = lef;
	}

	public int getRigth() {
		return rigth;
	}

	public void setRigth(int rigth) {
		this.rigth = rigth;
	}
	
	
	
	
	
	

}
