package tp19_MVC;

import java.util.EventListener;
public interface VolumeListener extends EventListener {
	public void volumeChanged(VolumeChangedEvent event);
}