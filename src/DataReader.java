import java.io.*;

public class DataReader {
	
	public void readFile(String fileName) throws Exception {
		try(BufferedReader in = new BufferedReader(new FileReader(fileName))) {
			 String str;
		    while ((str = in.readLine()) != null) {
		    	DataBlock dataBlocks = new DataBlock();
		    	System.out.println(str);
			    String [] dataParts = str.split(",");
			    dataBlocks.setData1(dataParts[1]);
			    dataBlocks.setData2(dataParts[2]);
			    dataBlocks.setData3(dataParts[3]);
		    }
		}
	}
}