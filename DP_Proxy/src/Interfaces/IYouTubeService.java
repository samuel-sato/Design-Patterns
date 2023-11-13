package Interfaces;

import java.util.List;

import Program.Video;

public interface IYouTubeService {
	
	public List<Video> listarVideos();
	public Video getVideo(int id);

}
