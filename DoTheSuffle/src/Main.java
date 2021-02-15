import java.util.Scanner;

public class Main {
	static char[] songs= {'A','B','C','D','E'};
	
	static public  void main(String[] args) {
		// Read in pair of integers until read button4.
		// For each pair of integers shuffle the character array.
		// when read button 4, end reading and output the character array.
		Scanner sc=new Scanner(System.in);
		while (true) {
			// read in pair, if button 4 then break;
			int button=sc.nextInt();
			int pushes=sc.nextInt();
			if (button==4) break;
			
			shuffle(button,pushes);
		}
		
		for (int i=0;i<songs.length;i++) {
			System.out.print(songs[i]+" ");
		}
		
	}

	private static void shuffle(int button, int pushes) {
		// TODO Auto-generated method stub
		switch (button) {
		case 1: 
			for (int i=0;i<pushes;i++) {
				shiftLeft(songs);
			}
			break;
		case 2:
			for (int i=0;i<pushes;i++) {
				shiftRight(songs);
			}
			break;
		case 3:
			for (int i=0;i<pushes;i++) {
				char song=songs[0];
				songs[0]=songs[1];
				songs[1]=song;
			}
			break;
		default:
			break;
		}
		
	}

	private static void shiftRight(char[] songs) {
		// TODO Auto-generated method stub
		char last=songs[songs.length-1];
		for (int i=1;i<songs.length;i++) {
			songs[i]=songs[i-1];
		}
		songs[0]=last;
	}

	private static void shiftLeft(char[] songs) {
		// TODO Auto-generated method stub
		char first=songs[0];
		for (int i=1;i<songs.length;i++) {
			songs[i-1]=songs[i];
		}
		songs[songs.length-1]=first;
	}

	

}
