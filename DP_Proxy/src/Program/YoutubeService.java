package Program;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IYouTubeService;

public class YoutubeService implements IYouTubeService {
	

	@Override
	public List<Video> listarVideos() {
		System.out.println("Listando vídeos");
		List<Video> list = new ArrayList<Video>();
		
		Video v1 = new Video(1, "Vídeo novo.");
		Video v2 = new Video(2, "Vídeo novo 2.");
		
		list.add(v1);
		list.add(v2);
		
		return list;
		
	}

	@Override
	public Video getVideo(int id) {
		System.out.println("Obtendo vídeo: " + id);
		return new Video(1, "Vídeo novo.");
		
	}

}
