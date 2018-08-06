
public class MainClass {
	
	private double one;
	private double two;
	
public MainClass (){
	
}
public MainClass (double one,double two){
	this.one = one;
	this.two = two;
	
}

public double getAverage(){
	return (one+two) /2;
		
}
public void setNum(double one, double two){
	this.one = one;
	this.two = two;
		
}
public double getOne() {
	return one;
}
public void setOne(double one) {
	this.one = one ;
}
public double getTwo() {
	return two;
}
public void setTwo(double two) {
	this.two = two;
}



}




