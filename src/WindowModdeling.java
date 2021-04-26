import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class WindowModdeling {
	private JFrame MUSgui=new JFrame();
	private JComboBox<String> portListComboBox=new JComboBox<String>();
	private JButton connectButton=new JButton("Default");
	private JPanel topPanel=new JPanel();
	
	public void setWindowParameters(String window_name,int height, int width, boolean ExitOnClose) {
		MUSgui.setLayout(new BorderLayout());
		MUSgui.setTitle(window_name);
		MUSgui.setSize(height, width);
		if(ExitOnClose==true) {
			MUSgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	
	public void setPortListComboBox(String portlist[], int num_of_ports) {
		for(int i=0;i<num_of_ports;i++) {
			portListComboBox.addItem(portlist[i]);
		}
	}
	
	public void setConnectButtonName(String name) {
		connectButton.setText(name);
	}
	
	public void setTopPannel() {
		topPanel.add(portListComboBox);
		topPanel.add(connectButton);
		MUSgui.add(topPanel,BorderLayout.NORTH);
	}
	
	public void setWindowVisible(boolean visibility) {
		MUSgui.setVisible(visibility);
	}
	
}
