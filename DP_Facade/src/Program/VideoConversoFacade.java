package Program;

import Interfaces.IConversorFacade;
import Interfaces.IVideoConversor;
import Model.VideoFile;

public class VideoConversoFacade implements IConversorFacade {
	//Converte vídeo e ajusta audio
	
	@Override
	public VideoFile converterVideo(String videoNome, String formato) {
		System.out.println("Início da conversão");
		VideoFile video = new VideoFile(videoNome);
		
		IVideoConversor conversor;
		
		if(formato.equals("mp4")) 
			conversor = new ConversorVideoMP4();
		else
			conversor = new ConversorVideoMOV();
		
		video = conversor.converter(video);
		System.out.println("Conversão finalizada");
		
		Mixer mixer = new Mixer();
		
		mixer.corrigirAtraso(video);
	
		return video;
	}



}
