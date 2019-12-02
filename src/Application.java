import java.io.*;
import java.util.*;
public class Application extends DataReader{

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		String fileToRead = "";
		System.out.println("Input file name:");
		fileToRead = scan.nextLine();
		DataReader read = new DataReader();
		read.readFile(fileToRead);
	}

}
