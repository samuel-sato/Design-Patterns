package Program;

import java.util.List;

import Interfaces.IYouTubeService;

public class YoutubeCache implements IYouTubeService{
	
	private List<Video> list;
	private Video video;
	private IYouTubeService service;
	
	public YoutubeCache(IYouTubeService service) {
		this.service = service;
	}

	
	@Override
	public List<Video> listarVideos() {
		if (this.list == null)
			this.list = service.listarVideos();
		return this.list;
	}

	@Override
	public Video getVideo(int id) {
		if(this.video == null)
			this.video = service.getVideo(id);
		return this.video;
	}
	
	


	

}
