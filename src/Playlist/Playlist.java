package Playlist;
import livreaudio.Categuories;
import livreaudio.Langue;
import livreaudio.livresAudios;
import java.util.LinkedList;

import chanson.Chansons;

public class Playlist {
	LinkedList<Chansons> Chansonslist = new LinkedList<Chansons>();
	LinkedList<livresAudios> livreAudiolist = new LinkedList<livresAudios>();
	String Nom;
	int ID;
	public Playlist (String Name, int ID){
		this.ID = ID;
		this.Nom = Nom;
}

public String toString(){
	return titre;
}
public String getNom(){
	return Nom;
}
public int getID(){
	return this.ID;
}
public void addchanson(Chansons cham){
	Chansonslist.add(new Chansons(cham.getGenre(), cham.getTitre(), cham.getCreateur(), cham.getContenu(), cham.getDuree(), cham.getID()));
}
public void addlivreaudio(livresAudios liau){
	livreAudiolist.add(new livresAudios(liau.getCategories(), liau.getLangues(),liau.getTitre(), liau.getCreateur(), liau.getContenu(), liau.getDuree(), liau.getID()));
}
}
