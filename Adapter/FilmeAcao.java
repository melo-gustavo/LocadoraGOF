package Adapter;

public class FilmeAcao extends LocadoraAdapter{

	public FilmeAcao(String name) {
		super(name);
	}
	
	public String filmeAcao(){
		return "Filme de a��o: " + name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Filme " + name;
	}
}
