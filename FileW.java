import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileW{
	public static void main(String[] args){
		Random random=new Random();
		String name;
        int number;	
		ArrayList<String> songslist=new ArrayList<String>();

		try{
			File fobj=new File("C:\\Users\\sunka\\Pictures\\Saved Pictures\\songs.txt");
			//Scanner scanner = new Scanner(fobj);
			FileWriter writer = new FileWriter(fobj);
			writer.write("Example");
			writer.close();
           
		}
		catch (IOException e){
          e.printStackTrace();
		}
	}
}