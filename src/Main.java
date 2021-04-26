
public class Main {

	public static void main(String[] args) {
		
		WindowModdeling gui=new WindowModdeling();
		Communication commPortal=new Communication();
		
		gui.setWindowParameters("Mapping Ultrasonic Scanner", 500, 500, true);
		gui.setPortListComboBox(commPortal.getPortNames(), commPortal.getNumOfPorts());
		gui.setConnectButtonName("Connect");
		gui.setTopPannel();
		gui.setWindowVisible(true);
	}

}
