package a_socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class EchoServer {
	public static void main(String[] args) throws IOException {
		// establish server socket
		try (var s = new ServerSocket(8189)) {
			// wait for client connection
			System.out.println("고객을 기다린다...");
			try (Socket incoming = s.accept()) {
				InputStream inStream = incoming.getInputStream();
				OutputStream outStream = incoming.getOutputStream();

				try (var in = new Scanner(inStream, StandardCharsets.UTF_8)) {
					var out = new PrintWriter(new OutputStreamWriter(outStream, StandardCharsets.UTF_8),
							true /* autoFlush */);

					out.println("to stop type 'bye'");

					// echo client input
					var done = false;
					while (!done && in.hasNextLine()) {
						String line = in.nextLine();
						out.println("Echo: " + line);
						System.out.println("메아리 출력 내용: " + line);
						if (line.trim().equalsIgnoreCase("BYE"))
							done = true;
					}
					incoming.close();
				}
			}
		}
	}
}
