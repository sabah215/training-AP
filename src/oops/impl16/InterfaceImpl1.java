/**
 * Interface
 * Dynamic Binding
 * media player can handle different types of media sources without being tied 
 * to a specific implementation, for that reason use Java interfaces.
 * @author Heeren
 * @version 1.0
 */

package oops.impl16;

interface MediaPlayer{
	void play();
	void pause();
	void stop();
}

class MusicPlayer implements MediaPlayer {
	
	@Override
	public void play() {
		System.out.println("Music is played...");
	}
	
	@Override
	public void pause() {
		System.out.println("Music is paused...");
	}
	
	@Override
	public void stop() {
		System.out.println("Music is stopped...");
	}
}

class VideoPlayer implements MediaPlayer {
	@Override
	public void play() {
		System.out.println("Video is played...");
	}
	
	@Override
	public void pause() {
		System.out.println("Video is paused...");
	}
	
	@Override
	public void stop() {
		System.out.println("Video is stopped...");
	}
}
public class InterfaceImpl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediaPlayer musicPlayer = new MusicPlayer();
		MediaPlayer videoPlayer = new VideoPlayer();
		
		musicPlayer.play();
		musicPlayer.pause();
		musicPlayer.stop();
		
		videoPlayer.play();
		videoPlayer.pause();
		videoPlayer.stop();
		
	}

}
