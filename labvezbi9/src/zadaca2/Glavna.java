package zadaca2;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		
		List<Vraboten> vraboteni = new ArrayList<Vraboten>();
	
		vraboteni.add(new Vraboten("Ilija", "Bogdanovski", "20000"));
		vraboteni.add(new Vraboten("Zdravko", "Trajkovski", "35000"));
		vraboteni.add(new Vraboten("Trajce", "Srbinovski", "40000"));
		
		XML xml = new XML();
		xml.createXMLFile("xml.xml", vraboteni);
	}
}
