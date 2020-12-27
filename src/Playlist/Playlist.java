package Playlist;
import livreaudio.livresAudios;
import java.util.LinkedList;

import chanson.Chansons;

public class Playlist {
	LinkedList<Chansons> Chansonslist = new LinkedList<Chansons>();
	LinkedList<livresAudios> livreAudiolist = new Linkedlist<livresAudios>();
	String Nom;
	int ID;
	public Playlist (String Name, int ID){
}
public String getNom(){
	return Nom;
}
public int getID(){
	return 0;
}
public void addchanson(Chansons cham){
	Chansonslist.add(new Chansons(cham.getGenre(), cham.getTitre(), cham.getArtiste(), cham.getContenu(), cham.getDuree(), cham.getID()));
}
public void addlivreaudio(livresAudios liau){
	livreAudiolist.add(new livresAudios(liau.getTitre(), liau.getAuteur(), liau.getCategories(), liau.getContenu(), liau.getLangues(), liau.getDuree(), liau.getID()));
}
}
