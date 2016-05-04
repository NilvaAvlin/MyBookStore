package classes;

public class TestandoBuildAutomatico {
	String build;
	String teste;
	int ano;
	
	public String obterString(String build){
		
		
		if(build != "teste"){
			return "Erro";
		}
		return "Igual";
	}

}
