package sistemadetransito;

class Estatistica {
	
	int CodigoCidade;
	String NomeCidade;
	int PQtdAcidentes;
	
	
	Estatistica(){
		
		this(0, "", 0);
	}
	
	Estatistica(int CodigoCidadeEstatistica, String NomeCidadeEstatistica, int QtdAcidentesEstatistica){
		
		CodigoCidade = CodigoCidadeEstatistica;
		NomeCidade = NomeCidadeEstatistica;
		PQtdAcidentes = QtdAcidentesEstatistica;
	}
	

}
