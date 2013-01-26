import java.awt.Graphics;

import org.lwjgl.*;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

public class Main extends BasicGame{

	/**
	 * @param args
	 */
	  public Main()
	  {
	     super("Hello World");
	  }
	 
	  @Override
	  public void init(GameContainer gc) throws SlickException
	  {
	 
	  }
	 
	  @Override
	  public void update(GameContainer gc, int delta) throws SlickException
	  {
	 
	  }
	 
	  
	  @Override
	  public void render (GameContainer gc, Graphics g ) throws SlickException
	  {
	     g.drawString("Hello World", 100, 100);
	  }
	 
	
	  public static void main(String[] args) throws SlickException
	  {
	     AppGameContainer app = new AppGameContainer(new Main());
	 
	     app.setDisplayMode(800, 600, false);
	     app.start();
	  }
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Tween.registerAccessor(Particle.class, new ParticleAccessor());
		
		// We need a manager to handle every tween.

		TweenManager manager = new TweenManager();

		Particle particle1 = new Particle();
		Particle particle2 = new Particle();
		
		// We can now create as many interpolations as we need !

		Tween.to(particle1, ParticleAccessor.POSITION_XY, 1.0f)
		    .target(100, 200)
		    .start(manager);
		    
		Tween.to(particle2, ParticleAccessor.POSITION_XY, 0.5f)
		    .target(0, 0)
		    .ease(Bounce.OUT)
		    .delay(1.0f)
		    .repeatYoyo(2, 0.5f)
		    .start(manager);
	}
	*/

	@Override
	public void render(GameContainer arg0, org.newdawn.slick.Graphics arg1)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}

}
