package diadia;

public class StanzaTest2 {

	public static void main(String[] argc) {
		
		Stanza bar=new Stanza("bar");
		Stanza mensa=new Stanza("mensa");
		Attrezzo tazzina=new Attrezzo("tazzina", 0);
		Attrezzo piatto=new Attrezzo("piatto", 0);
		
		bar.impostaStanzaAdiacente("nord", mensa);
		mensa.impostaStanzaAdiacente("sud", bar);
		
		bar.addAttrezzo(tazzina);
		mensa.addAttrezzo(piatto);
		
		System.out.println(bar.getStanzaAdiacente("nord").getAttrezzo("piatto"));
		System.out.println(mensa.getStanzaAdiacente("sud").getAttrezzo("tazzina"));
		
	}
	
}
