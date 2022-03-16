package AbstractyFactory;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locadora filmeLoc = new Filme();
		
		FilmeAcao clienteAcao = filmeLoc.filmeAcao();
		FilmeComedia clienteComedia = filmeLoc.filmeComedia();
		FilmeDocumentario clienteDocumentario = filmeLoc.filmeDocumentario();
		FilmeFiccaoCientifica clienteFiccao = filmeLoc.filmeFiccaoCientifica();
		FilmeRomance clienteRomance = filmeLoc.filmeRomance();
		FilmeTerror clienteTerror = filmeLoc.filmeTerror();
		
		System.out.println(clienteAcao);
		System.out.println(clienteComedia);
		System.out.println(clienteDocumentario);
		System.out.println(clienteFiccao);
		System.out.println(clienteRomance);
		System.out.println(clienteTerror);
		
	}

}