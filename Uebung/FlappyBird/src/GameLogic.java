import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JFrame;

public class GameLogic implements ActionListener{
	
	public static GameLogic flappyBird;
	public Renderer renderer;
	public Rectangle bird;
	
	public final int WIDTH = 800, HEIGHT = 500;
	
	public GameLogic() {
		JFrame jframe = new JFrame();
		
		renderer = new Renderer();
		Timer timer = new Timer(20, this);
		
		jframe.add(renderer);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setResizable(false);
		jframe.setVisible(true);
		
		bird = new Rectangle(WIDTH/2, HEIGHT/2, 20, 20);
		
		timer.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		renderer.repaint();
	}
	
	public void repaint(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect(0, 0, WIDTH, HEIGHT);
	}
	
	public static void main(String[] args) {
		flappyBird = new GameLogic();
	}

	
	
}
