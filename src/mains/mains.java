package mains;
import livreaudio.livresAudios;
public class mains {
	public static void main(String[] args) {
		livresAudios livre;
		livre = new livresAudios("aventure","fran�ais","pirate des caraibes","moi","long",300,2);
		System.out.println(livre.getTitre());		
		
	}

}
