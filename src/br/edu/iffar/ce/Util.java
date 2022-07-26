package br.edu.iffar.ce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Util {


	public static void sleep(int valor) {
		try {
			System.out.println("sleep\n");
			Thread.sleep(valor);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static int diferenca(LocalDateTime hora) {
		return (int) ChronoUnit.SECONDS.between(hora,LocalDateTime.now());
	}
	
	public static Integer readInt() throws NumberFormatException, IOException{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		return Integer.parseInt(buffer.readLine());		
	}
	
	public static String readString() throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		return buffer.readLine();		
	}
}
