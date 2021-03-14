package exercise.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class app {

	public static void main(String[] args) {
		

		String strPath = "C:\\temp\\exercise.csv";
		List<Product> outProducts = new ArrayList<>(); 
		
		//Reading the file
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
			String line = br.readLine();
			while(line != null) {
				String[] fieldsLine = line.split(",");
				
				String name = fieldsLine[0];
				Double value = Double.parseDouble(fieldsLine[1]);
				Integer quantity = Integer.parseInt(fieldsLine[2]);
			
				Product product = new Product(name,value,quantity);
				outProducts.add(product);
				
				line = br.readLine();
			}
			
		}
		catch(Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
		
		//Output File
		File path = new File(strPath);
		String folderPath = path.getParent();
		new File(folderPath+"\\out").mkdir();
		
		String outputPath = "C:\\temp\\out\\summary.csv";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))){
			
			for(Product product : outProducts) {
				bw.write(product.toString());
				bw.newLine();
			}
		}
		catch(Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
	}

}
