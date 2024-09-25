package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Set;

public class Reservation {
	private long id;
	private long movieId;
	private String movieTitle;
	private String seatName;
			
	private static final File file = new File("src/movie/reservation.txt");
	
	public long getId() {
		return id;
	}
	
	public Reservation(long movieId, String movieTitle, String seatName) {
		this(Instant.now().toEpochMilli(), movieId, movieTitle, seatName);
	}
	
	public Reservation(long id, long movieId, String movieTitle, String seatName) {
		this.id = id;
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.seatName = seatName;
	}

	public static Reservation findById(String reservationID) {
		Reservation reservation = null;
		BufferedReader br = null;
		String line = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				if(reservationID.equals(temp[0])) {
					reservation = new Reservation(
							Long.parseLong(temp[0]),
							Long.parseLong(temp[1]),
							temp[2],
							temp[3]
							);
					break;
				}
			}
			br.close();
			return reservation;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
		return "영화: " + movieTitle + ", 좌석: " + seatName ;
	}

	public static Reservation cancel(String reservationID) {
		BufferedReader br = null;
		Reservation canceled = null;
		String line = "";
		String text = "";
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			while((line = br.readLine()) != null) {
				String[] temp = line.split(",");
				if(reservationID.equals(temp[0])) {
					canceled = new Reservation(
							Long.parseLong(temp[0]),
							Long.parseLong(temp[1]),
							temp[2],
							temp[3]
							);
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
		return canceled;
	}

	public static ArrayList<Reservation> findMovieId(String movieId) {
		ArrayList<Reservation> reservations = new ArrayList<Reservation>();
		
		BufferedReader bf = null;
		String line = null;
		
		try {
			bf = new BufferedReader(new FileReader(file));
			while((line = bf.readLine()) != null) {
				
				String[] temp = line.split(",");
				if(movieId.equals(temp[1])) {
			
					reservations.add(new Reservation(
							Long.parseLong(temp[0]),
							Long.parseLong(temp[1]),
							temp[2],
							temp[3]
							));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return reservations;
	}

	public String getSeatName() {
		return seatName;
	}

	public void save() throws IOException {
		FileWriter fw = new FileWriter(file,true);
		fw.write(this.toFileString() + "\n");
		fw.close();
	}

	private String toFileString() {
		return String.format("%d,%d,%s,%s", id, movieId, movieTitle, seatName);
	}

	
	
}
