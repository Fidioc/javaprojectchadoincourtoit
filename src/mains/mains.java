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

	public static void affichemap(Map<Integer, Chansons> chansons,int leID){
		System.out.println(chansons.get(leID));
	}
	public static void affichemapLiau(Map<Integer, LivreAudio> livreaudio,int leID){
		System.out.println(livreaudio.get(leID));
	}
	public static void affichemapAlb(Map<Integer, Album> albums,int leID){
                System.out.println(albums.get(leID));
        }
	public static void affichemapPla(Map<Integer, Playlists> playlists,int leID){
                System.out.println(playlists.get(leID));
        }


	public static void helpAffiche(){
		System.out.println("press c for chanson,\nl for livre audio,\np for playlist,\na for album,\nq for quit\n" );
	}
	public static void Scanner() {
		System.out.println("Définissez son titre:");
                Scanner scan = new Scanner(System.in);
                titre = scan.nextLine();
                System.out.println("Définissez son auteur:");
                auteur = scan.nextLine();
                System.out.println("Définissez son contenu:");
                contenu = scan.nextLine();
                System.out.println("Définissez sa durée:");
                duree = scan.nextInt();
		}

	public static void main(String[] args) {
		Map<Integer,Chansons> chansons=new HashMap<Integer,Chansons>();
		Map<Integer,Albums> album=new HashMap<>();
		Map<Integer,livresAudios> livreaudio=new HashMap<>();
		Map<Integer,Playlist> playlist=new HashMap<>();
		while (true) {
		System.out.println("Que voulez-vous ajouter ?\n");
		Scanner scan = new Scanner(System.in);
		String choice = scan.next();
		switch (choice){
			case "c" :
					Scanner();
					System.out.println("Définissez son genre parmi: 1 = Jazz, 2 = Classique, 3 = Hip-Hop, 4 = Rock, 5 = Pop, 6 = Rap :");
					int leGenre = scan.nextInt();
					chansons.put(ID++, new Chansons(genre[leGenre], titre, auteur, contenu, duree, ID));
					affichemap(chansons,ID);
					System.out.println("Vous avez ajouté la chanson " + titre + " de " + auteur + " avec succes !");
					break;
			case "l" :
					Scanner();
					System.out.println("Définissez sa langue parmi: 1 = Français, 2 = Anglais, 3 = Italien, 4 = Espagnol, 5 = Allemand :");
                    			int laLangue = scan.nextInt();
					System.out.println("Définissez sa catégorie parmi: 1 = Jeunesse, 2 = Roman, 3 = Theatre, 4 = Discours, 5 = Documentaire :");
                    			int laCategorie = scan.nextInt();
					livreaudio.put(ID++, new livresAudios(categorie[laCategorie],langue[laLangue], titre, auteur, contenu, duree, ID));
					affichemapLiau(livreaudio, ID);
					System.out.println("Vous avez ajouté le livre audio " + titre + " de " + auteur + " avec succes !");
					break;
			case "p":
					System.out.println("Definissez le nom de la playlist : ");
					String nom = scan.next();
					playlist.put(ID++,new Playlist(nom, ID));
					affichemapPla(playlists, ID);
					System.out.println("Vous avez ajouté la playlist " + nom + " avec succes !");
					break;
			case "a":
					System.out.println("Définissez son titre:");
					titre = scan.next();
					System.out.println("Définissez son artiste:");
					auteur = scan.nextLine();
					System.out.println("Définissez son date de sortie:");
					int releaseDate = scan.nextInt();
					System.out.println("Définissez sa durée:");
					duree = scan.nextInt();
					album.put(ID++, new Albums(titre, auteur, duree, ID, releaseDate));
					affichemapAlb(albums, ID);
					System.out.println("Vous avez ajouté l'album " + titre + " de " + auteur + " avec succes !");
					break;
			case "h":
				helpAffiche()
			default :break;
		}

	}
	}
}


