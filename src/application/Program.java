package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		
		System.out.println("Hello, word!");
		System.out.println("Good Morning!");
		System.out.println(sdf.format(x1));

	}

}
