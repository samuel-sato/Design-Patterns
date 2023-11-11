package Program;

import Interfaces.IVideoConversor;
import Model.VideoFile;

public class ConversorVideoMOV implements IVideoConversor{
	
	private String tipo = ".mov";

	@Override
	public VideoFile converter(VideoFile video) {
		String nome = video.getName();
		nome  = nome.substring(0, nome.indexOf('.'));
		System.out.println("Convertido para mov.");
		return new VideoFile(nome + "mov");		
	}

}
