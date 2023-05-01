package com.ex.ui;

import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

public class MyFrame extends JFrame {

	public MyFrame() {
		final long serialVersionUID = 1L;
		setTitle("weWeb");
		setSize(300, 200);
		JLabel link = new JLabel("<html><u>Click here to Create or Join room</html></u>");
		link.setForeground(Color.BLUE);
		link.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		link.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("http://localhost:8080/lobby.html"));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		final Color[] colors = { Color.LIGHT_GRAY, Color.white, Color.LIGHT_GRAY, Color.white };
		final int DELAY = 1300;
		Timer timer = new Timer(DELAY, new ActionListener() {
			private int colorIndex = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				Color color = colors[colorIndex];
				getContentPane().setBackground(color);
				colorIndex = (colorIndex + 1) % colors.length;
			}
		});
		timer.start();
		add(link);
		setVisible(true);
		
		//setting app icon
		Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image iconImage = toolkit.getImage(getClass().getResource("/static/icons/weWeb.png"));
        setIconImage(iconImage);
	}
}
