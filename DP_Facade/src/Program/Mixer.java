package Program;

import Interfaces.IMixerAudio;
import Model.VideoFile;

public class Mixer implements IMixerAudio {

	@Override
	public void corrigirAtraso(VideoFile result) {
		System.out.println("Atraso de audio corrigido.");
	}

}
