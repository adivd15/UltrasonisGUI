import com.fazecast.jSerialComm.SerialPort;

public class Communication {
	private SerialPort[] ports=SerialPort.getCommPorts();
	
	public String[] getPortNames() {
		String[] portNames=new String[ports.length];
		
		for(int i=0;i<ports.length;i++) {
			portNames[i]=ports[i].getSystemPortName();
		}
		return portNames;
	}
	public int getNumOfPorts() {
		return ports.length;
	}
	
}
