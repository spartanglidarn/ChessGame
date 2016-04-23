package Gui;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Pieces.Board;


public class GuiBoard extends JFrame{
	private JFrame mainFrame;
	private JLabel headerLabel;
	
	//private JLabel statusLabel;
	//private JLabel msglabel;
	
	private JPanel controlPanel;
	
	public GuiBoard() {
		//drawGuiBoard();
	}

	public void drawGuiBoard() {
		mainFrame = new JFrame("The Chess game");
		mainFrame.setSize(600, 600);
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}	
		});
		
		String headerLabelText = "";
		
		for (int x = 0; x < Board.drawBoard().size(); x ++){
			if (x % 8 == 0){
				headerLabelText = headerLabelText + "<br>"; //trodde att denna skulle ge ett radbryt, men funkar ej. 
			}
			headerLabelText = headerLabelText + Board.drawBoard().get(x);
		}
		
		headerLabel = new JLabel(headerLabelText, JLabel.CENTER);
		//statusLabel = new JLabel("", JLabel.CENTER);
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.setVisible(true);
		
	}
	
}
