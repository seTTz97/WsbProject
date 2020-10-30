package pl.wsb.targowicz.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import pl.wsb.targowicz.FlappyBirdGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		// casual settings for desktop app
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = FlappyBirdGame.WIDTH;
		config.height = FlappyBirdGame.HEIGHT;
		config.title = FlappyBirdGame.TITLE;
		new LwjglApplication(new FlappyBirdGame(), config);
	}
}
