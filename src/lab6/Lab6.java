package lab6;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import lab6.listeners.CanvasListener;
import lab6.listeners.ToolButtonListener;
import lab6.tools.CircleTool;
import lab6.tools.EraserTool;
import lab6.tools.NullTool;
import lab6.tools.SquareTool;
import lab6.tools.ToolProxy;
import lab6.tools.TriangleTool;

import cse115.graphics.DrawingCanvas;

public class Lab6 {
	private ToolProxy _p;
	
	
	public Lab6() {

		// CREATE AND ORGANIZE THE WINDOW
		JFrame frame = new JFrame("FA11-CSE115-Lab6-SOLUTION");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.getContentPane().setLayout(new FlowLayout());

		// A PANEL FOR THE TOOL BUTTONS
		JPanel tools = new JPanel();
		tools.setBackground(java.awt.Color.LIGHT_GRAY);
		tools.setLayout(new BoxLayout(tools,BoxLayout.Y_AXIS));
		frame.getContentPane().add(tools);
		
		// A CANVAS FOR DRAWING
		DrawingCanvas canvas = new DrawingCanvas();
		canvas.setPreferredSize(new java.awt.Dimension(600,400));
		canvas.setBackground(java.awt.Color.WHITE);
		frame.getContentPane().add(canvas);

		// ---- DO NOT EDIT ABOVE THIS LINE ----------
		// ---- BEGIN YOUR CODE HERE -----------------
		_p = new ToolProxy(new NullTool(), canvas);
		canvas.addMouseListener(new CanvasListener(_p));
	
		
		JButton b1= new JButton("Null");
		tools.add(b1);
		b1.addActionListener(new ToolButtonListener(new NullTool(), _p));
		
		JButton b2= new JButton("Sqaure", new ImageIcon(canvas.makeImage("IMAGES/Square.png")));
		tools.add(b2);
		b2.addActionListener(new ToolButtonListener(new SquareTool(canvas), _p));
		
		JButton b3= new JButton("Circle", new ImageIcon(canvas.makeImage("IMAGES/Circle.png")));
		tools.add(b3);
		b3.addActionListener(new ToolButtonListener(new CircleTool(canvas), _p));
		
		JButton b4= new JButton("Triangle", new ImageIcon(canvas.makeImage("IMAGES/Triangle.png")));
		tools.add(b4);
		b4.addActionListener(new ToolButtonListener(new TriangleTool(canvas), _p));
		
		JButton b5= new JButton("Eraser", new ImageIcon(canvas.makeImage("IMAGES/Eraser.png")));
		tools.add(b5);
		b5.addActionListener(new ToolButtonListener(new EraserTool(canvas), _p));


		// ---- END YOUR CODE HERE -------------------
		// ---- DO NOT EDIT BELOW THIS LINE ----------

		// STANDARD FRAME STUFF
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Lab6();
	}

}
