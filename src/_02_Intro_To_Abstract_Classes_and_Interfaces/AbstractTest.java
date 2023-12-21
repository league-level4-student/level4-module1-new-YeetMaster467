package _02_Intro_To_Abstract_Classes_and_Interfaces;

public class AbstractTest extends AbstractClassDemo implements InterfaceDemo , DemoInterface {

	@Override
	public void abstractDemo() {
		System.out.println("This is an Abstract Demo.");
	}

	@Override
	public int abstractNumDemo() {
		return 42;
	}

	@Override
	public String faceDemo() {

		return null;
	}

	@Override
	public double interDemo() {
		
		return 0;
	}

}
