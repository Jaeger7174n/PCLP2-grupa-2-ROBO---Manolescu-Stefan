
public class CalatoriA extends Vagon {

	private boolean door = false;
	private boolean window_lock = false;
	final int calatori_max = 40;
	final int colete_max = 300;
	final int type=1;
	public CalatoriA() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		this.door = true;
		System.out.println("door has been opened");
	}
	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		this.door = false;
		System.out.println("door has been closed");
	}
	@Override
	public void lockWindows() {
		// TODO Auto-generated method stub
	}

}
