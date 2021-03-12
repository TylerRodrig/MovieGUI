// GUI based version of the Movie application from Chapter 1

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovieGUI extends JFrame implements ActionListener
{
	
	// instance variables for this class
	String[] quotes = {"Game over man! Game over!", "I'll Be Back!", "I'm your huckleberry...", "You're gonna need a bigger boat!", "Alrighty then..."};
	String[] movies = {"*** Aliens (1986) ***", "*** The Terminator (1984) ***", "*** Tombstone (1993) ***", "*** Jaws (1975) ***", "*** Ace Ventura (1994) ***"};
	int rando = (int) (Math.random() * 5);

	Font myFont = new Font("Times New Roman", Font.BOLD, 24);
	JLabel quote = new JLabel(quotes[rando], SwingConstants.CENTER);
	JLabel movie = new JLabel("", SwingConstants.CENTER);
	JButton button = new JButton("Show Movie");
	// this JPanel has it's own FlowLayout to control the button placement and keep the button from stretching to the grid size
	JPanel panel = new JPanel(new FlowLayout());

	// create a custom constructor for this class
	public MovieGUI()
	{
		super("Movie Quote App");
		setSize(400, 160);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));
		getContentPane().setBackground(new Color(152, 224, 190));
		setVisible(true);
		quote.setFont(myFont);
		movie.setFont(myFont);
		button.setForeground(Color.RED);
		panel.setBackground(new Color(152, 224, 190));
		add(quote);
		panel.add(button);
		add(panel);
		add(movie);
		button.addActionListener(this);
	}

	// event handling method
	@Override
	public void actionPerformed(ActionEvent evt)
	{
		movie.setText(movies[rando]);
	}

	public static void main(String[] args)
	{
		MovieGUI myFrame = new MovieGUI();
	}
}