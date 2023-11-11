package Program;

import Interfaces.IVideoConversor;
import Model.VideoFile;

public class ConversorVideoMP4 implements IVideoConversor{
	
	private String tipo = ".mp4";

	@Override
	public VideoFile converter(VideoFile video) {
		
		String nome = video.getName();
		nome  = nome.substring(0, nome.indexOf('.'));
		System.out.println("Convertido para mp4.");
		return new VideoFile(nome + this.tipo);		
		
	}

}
