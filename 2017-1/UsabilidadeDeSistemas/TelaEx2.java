package br.com.bilac.usabilidade;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaEx2 extends JFrame {

	private static final long serialVersionUID = 1L;

	BufferedImage image;

	public TelaEx2() {
		JLabel nameLabel, emailLabel, numberLabel;

		nameLabel = new JLabel("Nome completo:   Igor Venturelli Oliveira");
		emailLabel = new JLabel("E-mail:   igor.venturelli@me.com");
		numberLabel = new JLabel("Número do Celular:   (12) 99154-7780");

		setLayout(new GridLayout());

		try {
			image = ImageIO.read(new FileInputStream("src/imagens/curriculo.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		JLabel cvImg = new JLabel(new ImageIcon(image));

		JPanel leftPanel = new JPanel();
		leftPanel.add(cvImg);

		JPanel rightPanel = new JPanel();
		rightPanel.add(nameLabel);
		rightPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		rightPanel.add(emailLabel);
		rightPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		rightPanel.add(numberLabel);
		rightPanel.add(Box.createRigidArea(new Dimension(0, 5)));

		add(leftPanel);
		add(rightPanel);

		setTitle("Currículo");
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}
}
