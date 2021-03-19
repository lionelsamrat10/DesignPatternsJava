//The client uses only the ShapeMakerFacade Class
public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapeMakerFacade smf = new ShapeMakerFacade();
		
		//Call the draw methods
		smf.drawCircle();
		smf.drawRectangle();
		smf.drawSquare();
	}
}
