package shape;

public class PaintApp {

	public static void main(String[] args) {
		Point point = new Point();
		point.setX(2);
		point.setY(5);
		
		point.show();
	
		Point point2 = new Point(10,23);
		point2.show(true);	//true써도되고 안써도됨
	
		point.show(false);
		point2.show(false);
	}

}
