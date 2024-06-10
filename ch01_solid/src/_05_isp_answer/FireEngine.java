package _05_isp_answer;

public class FireEngine implements Car, IFireEngine {

	@Override
	public void drive() {
		System.out.println("운전중 ~~~");
	}

	@Override
	public void turnLeft() {
		System.out.println("좌회전");
	}

	@Override
	public void turnRight() {
		System.out.println("우회전");
	}

	@Override
	public void stop() {
		System.out.println("stop!!!");
	}

	@Override
	public void water() {
		System.out.println("water~~~~");
	}
}
