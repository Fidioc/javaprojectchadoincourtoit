package mains;
import chanson.Genre;
import livreaudio.Categuories;
import livreaudio.Langue;
import livreaudio.livresAudios;
public class mains {
	public static void main(String[] args) {
		livresAudios livre;
		Categuories [] cate = Categuories.values();
		Langue [] langue = Langue.values();
		Genre [] genre = Genre.values();
		livre = new livresAudios(cate[1],langue[1],"pirate des caraibes","moi","long",300,2);
		System.out.println(livre.getTitre());
				
		
	}

}
