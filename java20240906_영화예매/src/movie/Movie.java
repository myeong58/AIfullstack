package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Movie {

	private long id;
	private String title;
	private String genre;
	
	public String getTitle() {
		return title;
	}
	
	private static final File file = new File("src/movie/movies.txt");
	
	public Movie(String title, String genre) {
		this.id = Instant.now().getEpochSecond();
		this.title = title;
		this.genre = genre;
	}
	
	public Movie(long id, String title, String genre) {
		this.id = id;
		this.title = title;
		this.genre = genre;
	}
	
	public void save() throws IOException {
		FileWriter fw = new FileWriter(file, true);
		
		fw.write(this.toFileString() + "\n");
		fw.close();
		
	}
	
	private String toFileString() {
		return String.format("%d,%s,%s", id,title,genre);
	}

	public static Movie findAll(String movieId) {
		Movie movie = null;
		BufferedReader br = null;
		String line = null;
				
		try {
			br = new BufferedReader(new FileReader(file));
			
			while((line=br.readLine()) != null) {
				String[] temp = line.split(",");
				if(movieId.equals(temp[0])) {
					movie = new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
					break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		return movie;
	}
	
	public static ArrayList<Movie> findAll() throws IOException{
		
		ArrayList<Movie> movies = new ArrayList<Movie>();
		BufferedReader br = null;
		String line = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			while( (line = br.readLine()) != null) {
				String[] temp = line.split(",");
				
				Movie movie = 
						new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
				
				movies.add(movie);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();		
		}
		
		br.close();
		return movies;
		
	}
	
	public String toString() {
		return String.format("[%d] : %s(%s)", id, title, genre);
	}

	public static void delete(String movieId) {
		
		BufferedReader br = null;
		String text = "";
		String line = "";
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			while((line=br.readLine()) != null) {
				String[] temp = line.split(",");
				if(movieId.equals(temp[0])) {
					continue;
				}
				text += line + "\n";
			}
			br.close();
			
			FileWriter fw = new FileWriter(file);
			fw.write(text);
			
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
