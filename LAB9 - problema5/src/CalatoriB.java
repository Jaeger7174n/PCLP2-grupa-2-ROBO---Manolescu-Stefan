public class CalatoriB extends Vagon {

	private boolean door = false;
	private boolean window_lock = false;
	final int calatori_max = 50;
	final int colete_max = 400;
	final int type=2;
	public CalatoriB() {
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
		this.window_lock = true;
		System.out.println("windows are now locked");
	}

}

