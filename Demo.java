import java.util.Random;

public class Demo {
	public static void main(String[] args){			
		Dobbelsteen dobbelsteen1 = new Dobbelsteen();
		dobbelsteen1.werpen();

		Gans gans1 = new Gans();
		
		for(int x = 0; x < 100000 ; x++) {
			gans1.lopen(dobbelsteen1);
			dobbelsteen1.werpen();			
		}

	}
}

class Dobbelsteen{
	int uitkomst;
	void werpen() {
		Random willekeur = new Random ();
		uitkomst = willekeur.nextInt(6) + 1;
		System.out.println("De dobbelsteen werpt: "+ uitkomst);
	}
}

class Gans{
	int positie;
	void lopen(Dobbelsteen dobbelsteen) {
		positie = positie + dobbelsteen.uitkomst;
		System.out.println("Je staat op vakje: " + positie);
	}
}
