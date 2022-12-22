package zadaca1;

public class Glavna {

	public static void main(String[] args) {
		Vraboten vraboten = new Vraboten();
		vraboten.setIme("Ilija");
		vraboten.setPrezime("Bogdanovski");
		vraboten.setPlata("35000");
		
		XML xml = new XML();
		xml.createXMLFile("xml.xml", vraboten);

	}

}
