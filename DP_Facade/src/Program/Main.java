package Program;

import Model.VideoFile;

public class Main {
	
	public static void main(String[] args) {
	
		VideoConversoFacade conversor = new VideoConversoFacade();
		VideoFile video = conversor.converterVideo("videoTeste.ogg", "mp4");

		System.out.println(video.getName());

	}
	
	
}
