package oops.impl16;

interface Multimedia{
	void play();
	void pause();
	void stop();
}

interface InternetConnectivity{
	void connect();
	void disconnect();
}

class SmartDevice implements Multimedia, InternetConnectivity{
	@Override
	public void play() {
		System.out.println("Music played");
	}

	@Override
	public void connect() {
		System.out.println("Device connected");	
	}

	@Override
	public void disconnect() {
		System.out.println("Device disconnected");
	}

	@Override
	public void pause() {
		System.out.println("Music paused");	
	}

	@Override
	public void stop() {
		System.out.println("Music stopped");
	}
}
public class InterfaceImpl2 {

	public static void main(String[] args) {
		SmartDevice d = new SmartDevice();
		d.connect();
		d.play();
		d.disconnect();
	}
}
