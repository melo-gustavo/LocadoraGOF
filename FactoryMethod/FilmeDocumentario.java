package FactoryMethod;

public class FilmeDocumentario implements Filme {

	@Override
	public String exibirInfo(String nome) {
		// TODO Auto-generated method stub
		return "Filme de documentário: " + nome;
	}

}
