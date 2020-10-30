package pl.wsb.targowicz.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import pl.wsb.targowicz.FlappyBirdGame;

public class MenuState extends State {
    Texture background;
    Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {
        //reacting to touch or mouse click
        if(Gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        //drawing menu and play button
        sb.begin();
        sb.draw(background, 0, 0, FlappyBirdGame.WIDTH, FlappyBirdGame.HEIGHT);
        sb.draw(playBtn, (FlappyBirdGame.WIDTH / 2) - (playBtn.getWidth() / 2), FlappyBirdGame.HEIGHT / 2);
        sb.end();

    }
}
