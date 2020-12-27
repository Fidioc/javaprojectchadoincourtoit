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
	static String titre;
	static String auteur;
	static int duree;

	void Scanner{
		System.out.println("Définissez son titre:");
                Scanner scan = new Scanner(System.in);
                titre = scan.next();
                System.out.println("Définissez son auteur:");
                Scanner scan = new Scanner(System.in);
                auteur = scan.next();
                System.out.println("Définissez son contenu:");
                Scanner scan = new Scanner(System.in);
                contenu = scan.next();
                System.out.println("Définissez sa durée:");
                Scanner scan = new Scanner(System.in);
                duree = scan.next();
		}
	public static void main(String[] args) {
		Map<Integer,Chansons> chansons=new HashMap<>();
		Map<Integer,Albums> album=new HashMap<>();
		Map<Integer,livresAudios> livreaudio=new HashMap<>();
		Map<Integer,Playlist> playlist=new HashMap<>();

		int i=0;


		while (true) {
		System.out.println("Que voulez-vous ajouter ? (press c for chanson, l for livre audio, p for playlist, a for album, q for quit) ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.next();
		switch (choice){
			case "c" :Scanner();
					System.out.println("Définissez son genre parmi: 1 = Jazz, 2 = Classique, 3 = Hip-Hop, 4 = Rock, 5 = Pop, 6 = Rap :"); 
                                        Scanner scan = new Scanner(System.in);
					int genre = scan.next(); 
					chansons.put(ID++, new Chansons(genre[i], titre, artiste, contenu, duree, ID));break;
			case "l" :Scanner();
					System.out.println("Définissez sa langue parmi: 1 = Français, 2 = Anglais, 3 = Italien, 4 = Espagnol, 5 = Allemand :");
                                        Scanner scan = new Scanner(System.in);
                                        int langue = scan.next();
					System.out.println("Définissez sa catégorie parmi: 1 = Jeunesse, 2 = Roman, 3 = Theatre, 4 = Discours, 5 = Documentaire :");
                                        Scanner scan = new Scanner(System.in);
                                        int categorie = scan.next();
					livreaudio.put(ID++, new livresAudios(categorie[categorie],langue[langue], titre, auteur, contenu, duree, ID));
			case "p":System.out.println("Definissez le nom de la playlist : ");
					Scanner scan = new Scanner(System.in);
					String nom = scan.next();
					// je vois pas trop pour mettre des chansons et livres audios dedans
					// playlist.put(ID++,nom, ID, ...);
			case "a":System.out.println("Définissez son titre:");
	                		Scanner scan = new Scanner(System.in);
        	        		titre = scan.next();
                			System.out.println("Définissez son artiste:");
	                		Scanner scan = new Scanner(System.in);
        	        		artiste = scan.next();
                			System.out.println("Définissez son date de sortie:");
	                		Scanner scan = new Scanner(System.in);
        	        		releaseDate = scan.next();
                			System.out.println("Définissez sa durée:");
					Scanner scan = new Scanner(System.in);
                			duree = scan.next();
					//playlist.put(ID++, new playlist(titre, artiste, duree, ID, releaseDate, chansons));
			default :break;
		}
		}

	}

}
