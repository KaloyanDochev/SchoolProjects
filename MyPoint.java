package OOP;

public class MyPoint {
private double x;
private double y;

public double getX() {
	return x;
}

public double getY() {
	return y;
}

MyPoint(){
	x = 0;
	y = 0;
}

MyPoint(double x, double y){
	this.x = x;
	this.y = y;
}

double distance(MyPoint p){
	double dis;
	dis = Math.pow((x-p.x), 2) + Math.pow((y-p.y), 2);
	return Math.sqrt(dis);
}

static double distance(MyPoint p, MyPoint o){
	double dis;
	dis = Math.pow((o.x-p.x), 2) + Math.pow((o.y-p.y), 2);
	return Math.sqrt(dis);
}

}
