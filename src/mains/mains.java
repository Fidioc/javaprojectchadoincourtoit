package mains;
import java.util.Scanner;
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

		while (true) {
		System.out.println("appuyer sur s pour sauvegarder: ");
		Scanner scan = nex Scanner(System.in);
		String choice = scan.next();
		switch (choice){
			case "s" :System.out.println("vous avez pressé le bouton" + choice);break;
			case "q" :System.out.println("Vous avez pressé le bouton" + choice);break;
			default : System.out.println("Vous avez pressé le bouton" + choice);break;
		}
		}
	}

}
