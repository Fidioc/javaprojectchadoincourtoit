package mains;

import java.util.Scanner;
import java.util.Set;

import Album.Albums;
import Playlist.Playlist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import chanson.Chansons;
import chanson.Genre;
import livreaudio.Categuories;
import livreaudio.Langue;
import livreaudio.livresAudios;


public class mains {
	private static final Categuories[] categorie = null;
	static Categuories [] cate = Categuories.values();
	static Langue [] langue = Langue.values();
	static Genre [] genre = Genre.values();
	static int ID = 0;
	static String titre;
	static String auteur;
	static int duree;
	static String contenu;

	public static void affichemap(Map<Integer, Chansons> chansons){
		int i=0; 
		 Set set=chansons.entrySet();//Converting to Set so that we can traverse  
		 Iterator itr=set.iterator(); 
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());
		}
		//for(i=0;i<listkeys;i++) {
			
		//}
		
	}
	public static void helpaffiche(){
		System.out.println("press c for chanson,\nl for livre audio,\np for playlist,\na for album,\nq for quit\n" );
	}
	public static void Scanner() {
		System.out.println("Définissez son titre:");
                Scanner scan = new Scanner(System.in);
                titre = scan.next();
                System.out.println("Définissez son auteur:");
                auteur = scan.next();
                System.out.println("Définissez son contenu:");
                contenu = scan.next();
                System.out.println("Définissez sa durée:");
                duree = scan.nextInt();
		}
	
	public static void main(String[] args) {
		Map<Integer,Chansons> chansons=new HashMap<>();
		Map<Integer,Albums> album=new HashMap<>();
		Map<Integer,livresAudios> livreaudio=new HashMap<>();
		Map<Integer,Playlist> playlist=new HashMap<>();
		affichemap(chansons);
		while (true) {
		System.out.println("Que voulez-vous ajouter ?\n");
		helpaffiche();
		Scanner scan = new Scanner(System.in);
		String choice = scan.next();
		switch (choice){
			case "c" :
					Scanner();
					System.out.println("Définissez son genre parmi: 1 = Jazz, 2 = Classique, 3 = Hip-Hop, 4 = Rock, 5 = Pop, 6 = Rap :"); 
					int legenre = scan.nextInt(); 
					chansons.put(ID++, new Chansons(genre[legenre], titre, auteur, contenu, duree, ID));
					affichemap(chansons);
					break;
			case "l" :
					Scanner();
					System.out.println("Définissez sa langue parmi: 1 = Français, 2 = Anglais, 3 = Italien, 4 = Espagnol, 5 = Allemand :");
                    int lalangue = scan.nextInt();
					System.out.println("Définissez sa catégorie parmi: 1 = Jeunesse, 2 = Roman, 3 = Theatre, 4 = Discours, 5 = Documentaire :");
                    int lacategorie = scan.nextInt();
					livreaudio.put(ID++, new livresAudios(categorie[lacategorie],langue[lalangue], titre, auteur, contenu, duree, ID));
			case "p":System.out.println("Definissez le nom de la playlist : ");
					String nom = scan.next();
					playlist.put(ID++,new Playlist(nom, ID));
			case "a":System.out.println("Définissez son titre:");
					titre = scan.next();
					System.out.println("Définissez son artiste:");
					auteur = scan.next();
					System.out.println("Définissez son date de sortie:");
					int releaseDate = scan.nextInt();
					System.out.println("Définissez sa durée:");
					duree = scan.nextInt();
					//playlist.put(ID++, new playlist(titre, artiste, duree, ID, releaseDate, chansons));
			case "h":
					helpaffiche();
			default :break;
		}
		}

	}

}
