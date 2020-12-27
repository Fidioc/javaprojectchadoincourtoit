package mains;

import java.util.Scanner;

import Album.Albums;
import Playlist.Playlist;

import java.util.HashMap;
import java.util.Map;

import chanson.Chansons;
import chanson.Genre;
import livreaudio.Categuories;
import livreaudio.Langue;
import livreaudio.livresAudios;

public class mains {
	static Categuories [] cate = Categuories.values();
	static Langue [] langue = Langue.values();
	static Genre [] genre = Genre.values();
	static int ID = 0;

	
	public static void main(String[] args) {
		Map<Integer,Chansons> chansons=new HashMap<>();
		Map<Integer,Albums> album=new HashMap<>();
		Map<Integer,livresAudios> livreaudio=new HashMap<>();
		Map<Integer,Playlist> playlist=new HashMap<>();
		
		int i=0;


		while (true) {
		System.out.println("appuyer sur s pour sauvegarder: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.next();
		switch (choice){
			case "s" :
				System.out.println("vous avez pressé le bouton" + choice);
				chansons.put(ID++, new Chansons(genre[i], choice, choice, choice, 300, ID));
				break;
			case "q" :System.out.println("Vous avez pressé le bouton" + choice);break;
			default : System.out.println("Vous avez pressé le bouton" + choice);break;
		}
		}

	}

}
