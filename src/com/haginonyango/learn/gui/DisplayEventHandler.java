package com.haginonyango.learn.gui;

import javax.swing.JFrame;
public class DisplayEventHandler {

	public static void main(String[] args) {

		EventHandling hagin = new EventHandling();
		hagin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hagin.setSize(350, 100);
		hagin.setVisible(true);
	}

}
