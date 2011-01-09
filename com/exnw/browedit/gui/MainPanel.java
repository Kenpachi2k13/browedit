package com.exnw.browedit.gui;

import java.awt.BorderLayout;

import javax.media.opengl.GLCanvas;
import javax.swing.JPanel;

import com.sun.opengl.util.Animator;

public class MainPanel extends JPanel
{
	public MainPanel(MainFrame mainFrame)
	{
		this.setLayout(new BorderLayout());
		GLCanvas canvas = new GLCanvas();
		BrowRenderer renderer = new BrowRenderer(mainFrame);
		canvas.addGLEventListener(renderer);
		canvas.addMouseListener(renderer);
		canvas.addMouseMotionListener(renderer);
		
		this.add(canvas, BorderLayout.CENTER);

	    Animator animator = new Animator(canvas);
	    animator.start();
	    animator.setRunAsFastAsPossible(true);
	    canvas.requestFocus();
	}
	
}