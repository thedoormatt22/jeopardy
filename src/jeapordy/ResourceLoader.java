package jeapordy;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

public class ResourceLoader {
	
	private static ResourceLoader rl = new ResourceLoader();
	private static Toolkit tk = Toolkit.getDefaultToolkit();
	
	public static Image getImage(String fileName) {
		URL url = rl.getClass().getResource("/images/" + fileName);
		return tk.getImage(url);
	}
	
	public static URL getAudio(String fileName) {
		return rl.getClass().getResource("/audio/" + fileName);
	}

}