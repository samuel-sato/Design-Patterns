package Program;

import java.util.List;

import Interfaces.IYouTubeService;

public class YoutubeManager {
	
	private IYouTubeService service;
	
	public YoutubeManager (IYouTubeService service){
		this.service = service;
	}
	
	public List<Video> listarVideos() {
		return this.service.listarVideos();
	}

	public Video getVideo(int id) {
		return this.service.getVideo(id);
	}
}
