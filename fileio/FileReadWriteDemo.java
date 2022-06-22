package fileio;

import java.lang.*;
import java.io.*;

public class FileReadWriteDemo
{
	private File file;
	private FileWriter writer;
	private FileReader reader;
	private BufferedReader bufferedReader;

	public void writeInFile(String s)
	{
		try{
			File dir = new File("fileio/Food_Detailes");
			dir.mkdirs();

			String dirPath = dir.getPath();
			
			file = new File(dirPath + File.separator + "Food_History.txt");

			file.createNewFile();
			writer = new FileWriter(file, true);
			writer.write(s + "\r" + "\n");
			writer.flush();
			writer.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}

	public void readFromFile()
	{
		try{
			reader = new FileReader(file);
			bufferedReader = new BufferedReader(reader);
			String text = "", temp;

			while((temp = bufferedReader.readLine()) != null)
			{
				text = text + temp + "\n" + "\r";
			}
			System.out.println(text);
			reader.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}