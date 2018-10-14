package rpg.network.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerConnector {
	public ServerConnector() throws IOException {
		InetAddress address = InetAddress.getByName("46.165.137.63");
		int port = 9599;

		Socket s1 = null;
		String line = null;
		BufferedReader br = null;
		BufferedReader is = null;
		PrintWriter os = null;

		br = new BufferedReader(new InputStreamReader(System.in));
		s1 = new Socket(address, port);
		is = new BufferedReader(new InputStreamReader(s1.getInputStream()));
		os = new PrintWriter(s1.getOutputStream());

		String response = "";
		try {
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
	}
}
