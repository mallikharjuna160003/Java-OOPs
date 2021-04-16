import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;
public class SongArr{
	ArrayList<Integer> songs=new ArrayList<Integer>();
	public void SubList(ArrayList<Integer> songs){
		for(int i=0;i<songs.size();i++)
		{
			for(int j=i;j<songs.size()/2;j++){
				if((songs.getIndex(j)-songs.getIndex(j+1))!=0 || (songs[j]-songs[j+1])!=1){

                  System.out.println(j);
				}
			}
		}

	}
	public void Reading(File fobj){
		Random random=new Random();
		
        int number;	
        try{
        Scanner scanner=new Scanner(fobj);
        while(scanner.hasNext()){
               	number=scanner.nextInt();
               	songs.add(number);
               	System.out.println(number);
               }
        scanner.close();
    }
    catch (IOException e){
    	e.printStackTrace();
    }

	}
	public void Writing(File fobj){
		Random random=new Random();
		
        int number;	
        try{
		FileWriter writer=new FileWriter(fobj,true);
		for(int i=0;i<10;i++){
                number=random.nextInt(10);
				writer.write(number+"\n");
			}
			writer.close();}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		
		
		File fobj=new File("C:\\Users\\sunka\\Pictures\\Saved Pictures\\songs.txt");
		SongArr myobj=new SongArr();

		try{
			
			
			//fobj.createNewFile();
			if(fobj.createNewFile()){	
			      myobj.Writing(fobj);
			      myobj.Reading(fobj);

			  }
			else{ 
              myobj.Writing(fobj);
			  myobj.Reading(fobj);             
			}
			Collections.sort(myobj.songs);
			System.out.println(myobj.songs);	
           
		}
		catch (IOException e){
          e.printStackTrace();
		}
	}
}