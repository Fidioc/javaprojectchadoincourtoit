package mains;

import java.util.Scanner;
import Album.Albums;
import Playlist.Playlist;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	static String contenu;

	public static void affichemap(Map<Integer, Chansons> chansons,int leID){

		System.out.println(chansons.get(leID));
	}
	public static void affichemapLiau(Map<Integer, livresAudios> livreaudio,int leID){
		System.out.println(livreaudio.get(leID));
	}
	public static void affichemapAlb(Map<Integer, Albums> albums,int leID){
                System.out.println(albums.get(leID));
        }
	public static void affichemapPla(Map<Integer, Playlist> playlists,int leID){
                System.out.println(playlists.get(leID));
        }


	public static void helpAffiche(){
		System.out.println("press c for chanson,\nl for livre audio,\np for playlist,\na for album,\n+ for add an existant music to an album\n- for remove a playlist\nq for quit\nh for help" );
	}
	public static void Scanner() {
		System.out.println("Définissez son titre:");
                @SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
                titre = scan.nextLine();
                System.out.println("Définissez son auteur:");
                auteur = scan.nextLine();
                System.out.println("Définissez son contenu:");
                contenu = scan.nextLine();
                System.out.println("Définissez sa durée:");
                duree = scan.nextInt();
		}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Map<Integer,Chansons> chansons=new HashMap<Integer,Chansons>();
		Map<Integer,Albums> album=new HashMap<>();
		Map<Integer,livresAudios> livreaudio=new HashMap<Integer,livresAudios>();
		Map<Integer,Playlist> playlist=new HashMap<>();
		try {
			FileInputStream fisa = new FileInputStream("albums.csv");
			@SuppressWarnings("resource")
			ObjectInputStream oisa = new ObjectInputStream(fisa);
			album.put(++ID, (Albums)oisa.readObject());
		} catch (FileNotFoundException e) {
			System.out.println("pas de fichier albums.csv");
		}
		try {
			FileInputStream fisp = new FileInputStream("playlist.csv");
			@SuppressWarnings("resource")
			ObjectInputStream oisp = new ObjectInputStream(fisp);
			playlist.put(++ID, (Playlist)oisp.readObject());
		} catch (FileNotFoundException e) {
			System.out.println("pas de fichier playlist.csv");
		}
		try {
			FileInputStream fisl = new FileInputStream("livreaudio.csv");
			@SuppressWarnings("resource")
			ObjectInputStream oisl = new ObjectInputStream(fisl);
			livreaudio.put(++ID, (livresAudios)oisl.readObject());
		} catch (FileNotFoundException e) {
			System.out.println("pas de fichier livreaudio.csv");
		}
		try {
			FileInputStream fisc = new FileInputStream("chansons.csv");
			@SuppressWarnings("resource")
			ObjectInputStream oisc = new ObjectInputStream(fisc);
			chansons.put(++ID, (Chansons)oisc.readObject());
		} catch (FileNotFoundException e) {	
			System.out.println("pas de fichier chansons.csv");
		}
		while (true) {
		System.out.println("Que voulez-vous ajouter ?");
		helpAffiche();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		switch (choice){
			case "c" :
					Scanner();
					System.out.println("Définissez son genre parmi: 1 = Jazz, 2 = Classique, 3 = Hip-Hop, 4 = Rock, 5 = Pop, 6 = Rap :");
					int leGenre = scan.nextInt();
					chansons.put(++ID, new Chansons(genre[--leGenre], titre, auteur, contenu, duree, ID));
					affichemap(chansons,ID);
					System.out.println("Vous avez ajouté la chanson " + titre + " de " + auteur + " avec succes !");
					break;
			case "l" :
					Scanner();
					System.out.println("Définissez sa langue parmi: 1 = Français, 2 = Anglais, 3 = Italien, 4 = Espagnol, 5 = Allemand :");
                    int laLangue = scan.nextInt();
					System.out.println("Définissez sa catégorie parmi: 1 = Jeunesse, 2 = Roman, 3 = Theatre, 4 = Discours, 5 = Documentaire :");
                    int laCategorie = scan.nextInt();
					livreaudio.put(++ID, new livresAudios(cate[--laCategorie],langue[--laLangue], titre, auteur, contenu, duree, ID));
					affichemapLiau(livreaudio, ID);
					System.out.println("Vous avez ajouté le livre audio " + titre + " de " + auteur + " avec succes !");
					break;
			case "p":
					System.out.println("Definissez le nom de la playlist : ");
					String nom = scan.nextLine();
					playlist.put(++ID,new Playlist(nom, ID));
					affichemapPla(playlist, ID);
					System.out.println("Vous avez ajouté la playlist " + nom + " avec succes !");
					break;
			case "a":
					System.out.println("Définissez son titre:");
					titre = scan.nextLine();
					System.out.println("Définissez son artiste:");
					auteur = scan.nextLine();
					System.out.println("Définissez son date de sortie:");
					int releaseDate = scan.nextInt();
					System.out.println("Définissez sa durée:");
					duree = scan.nextInt();
					album.put(++ID, new Albums(titre, auteur, duree, releaseDate,ID));
					affichemapAlb(album, ID);
					System.out.println("Vous avez ajouté l'album " + titre + " de " + auteur + " avec succes !");
					break;
			case "+":
				if (album.isEmpty()|| chansons.isEmpty()) {
					System.out.println("il n'y a aucun album ou aucune musique a ajout�");
				}else {
					System.out.println("a quel album voulez vous ajouter une chansons ?(entre son identifiant)");
					for (int i=0; i<ID;i++) {
						if (album.containsKey(i)) {
							affichemapAlb(album, i);
						}
					}
					int choix = scan.nextInt();
					System.out.println("quel chansons voulez vous ajout� a cette album ?");
					for (int i=0; i<ID+1;i++) {
						if (chansons.containsKey(i)) {
							affichemap(chansons, i);
						}
					}
					int choix2 = scan.nextInt();
					album.get(choix).addchansonexist(chansons.get(choix2));
					album.get(choix).affichechansons();
				}
				break;
			case "-":
				if (playlist.isEmpty()) {
					System.out.println("il n'y a aucune playlist a supprimer");
				}else {
					System.out.println("choisisser la playlist a supprimer.(entr� l'identifiant de la playlist)");
					for (int i=0; i<ID+1;i++) {
						if (playlist.containsKey(i)) {
							affichemapPla(playlist, i);
						}
					}
					int choix = scan.nextInt();
					playlist.remove(choix);
					System.out.println("la playlist selectionn� a �t� supprim�");
				}break;
			case "s":
				FileOutputStream fosa = new FileOutputStream("album.csv");
				ObjectOutputStream oosa = new ObjectOutputStream(fosa);
				if (!album.isEmpty()) {
					for(int i=0;i<ID+1;i++) {
						if (album.containsKey(i)) {
							oosa.writeObject(album.get(i));
						}
					}
				}
				FileOutputStream fosp = new FileOutputStream("playlist.csv");
				ObjectOutputStream oosp = new ObjectOutputStream(fosp);
				if (!playlist.isEmpty()) {
					for(int i=0;i<ID+1;i++) {
						if (playlist.containsKey(i)) {
							oosp.writeObject(playlist.get(i));
						}
					}
				}
				FileOutputStream fosc = new FileOutputStream("chansons.csv");
				ObjectOutputStream oosc = new ObjectOutputStream(fosc);
				if (!chansons.isEmpty()) {
					for(int i=0;i<ID+1;i++) {
						if (chansons.containsKey(i)) {
							oosc.writeObject(chansons.get(i));
						}
					}
				}
				FileOutputStream fosl = new FileOutputStream("livresaudios.csv");
				ObjectOutputStream oosl = new ObjectOutputStream(fosl);
				if (!livreaudio.isEmpty()) {
					for(int i=0;i<ID+1;i++) {
						if (livreaudio.containsKey(i)) {
							oosl.writeObject(livreaudio.get(i));
						}
					}
				}
			case "h":
				helpAffiche();
			case "q":
				return;
			default :break;
		}

	}
	}
}


