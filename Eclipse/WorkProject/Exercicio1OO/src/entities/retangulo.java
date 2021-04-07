package entities;

public class retangulo {

	public double width,height;
	
	public double area() {
		return width*height;
	}
	public double perimeter() {
		return 2*(width+height);
	}
	public double diagonal() {
		return Math.sqrt(2*(width+height));
	}
	public String toString() {
		return " Area= "+area()+"\n"+
		      " Perimeter= "+perimeter()+"\n"
		      +" Diagonal= "+ String.format("%.2f", diagonal());
}
}