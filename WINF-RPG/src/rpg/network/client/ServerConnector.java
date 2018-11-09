package rpg.network.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerConnector extends Thread{
	public void Connector() throws IOException {
		NetworkFile netData = new NetworkFile();
		InetAddress address = netData.getAddress();
		int port = netData.getPort();

		Socket s1 = null;
		String line = null;
		BufferedReader br = null;
		BufferedReader is = null;
		PrintWriter os = null;

		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			s1 = new Socket(address, port);
			is = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			os = new PrintWriter(s1.getOutputStream());

			String response = "";
			try {
				System.out.println("connection sucssefuel");
				line = br.readLine();
				while (line.compareTo("QUIT") != 0) {
					os.println(line);
					os.flush();
					response = is.readLine();
					System.out.println("Server Response : " + response);
					line = br.readLine();

				}
			} catch (IOException e) {
				System.out.println("Socket read Error");
			} finally {
				is.close();
				os.close();
				br.close();
				s1.close();
				System.out.println("Connection Closed");
			}
		} catch (ConnectException e) {
			System.err.println("Unable to connect: Connection refused: connect");
		}
	}
	public void run() {
		try {
			Connector();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	class NetworkFile {
		private InetAddress address;
		private int port;
		public NetworkFile() throws UnknownHostException, IOException {
			File serverinformation = new File("Network.txt");
			BufferedReader br = new BufferedReader(new FileReader(serverinformation));
			
			address = InetAddress.getByName(br.readLine());
			System.out.println("Connect to: " + address);
			port = Integer.parseInt(br.readLine());
			System.out.println("On port: " + port);
			br.close();
		}
		public InetAddress getAddress() throws UnknownHostException {
			return address;
		}
		public int getPort() {
			return port;
		}
	}
}
