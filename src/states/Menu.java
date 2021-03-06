package states;

import java.awt.Color;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

import core.Game;

public class Menu extends BasicGameState{
	
	Image play;
	Image background;
	Image waves;
	Image text;
	Image tap;
	Image logo;
	
	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		// TODO Auto-generated method stub
		play = new Image("res/images/play.png");
		background = new Image("res/images/background.png");
		logo = new Image("res/images/logo.png");
		tap = new Image("res/images/1double-tapinv.png");
		
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		// TODO Auto-generated method stub

		int mid = container.getWidth()/2;
		g.drawImage(background, 0, 0, mid*2, container.getHeight(), 0, 0);
		//g.drawImage(text, mid-(text.getWidth()/2), 200, (mid-text.getWidth()/2)+text.getWidth(),200 + text.getHeight() , 0,0, text.getWidth(), text.getHeight());
		//g.drawImage(waves, mid-waves.getWidth()/2, 350, (mid-waves.getWidth()/2)+waves.getWidth(),350+(waves.getHeight()), 0, 0, waves.getWidth(), waves.getHeight());
		
		g.drawImage(logo, mid-logo.getWidth()*4/10, 0, (mid-logo.getWidth()*4/10)+logo.getWidth()*4/5,(logo.getHeight()*4/5), 0, 0, logo.getWidth(), logo.getHeight());
		
		g.drawImage(play, mid + 60, 720, mid+60+play.getWidth()*1/7, 720+play.getHeight()*1/7, 0, 0, play.getWidth(), play.getHeight());
		g.drawImage(tap, mid-tap.getWidth()+10, 670, mid+10, 670+tap.getHeight(), 0, 0, tap.getWidth(), tap.getHeight());
		
		// g.setFont(Game.heading);
		//int wid = Game.heading.getWidth("DEFEAT THE BEAT");
		//g.drawString("DEFEAT THE BEAT", container.getWidth()/2-wid/2, 120);
		
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
		// TODO Auto-generated method stub
		if (container.getInput().isMouseButtonDown(Input.MOUSE_LEFT_BUTTON) || container.getInput().isKeyDown(Input.KEY_Z)) {
			game.enterState(3, new FadeOutTransition(), new FadeInTransition());
		}
		
	}
	
	@Override
	public void keyPressed(int key, char c) {
		// TODO Auto-generated method stub
		super.keyPressed(key, c);
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return Game.menu;
	}

}
