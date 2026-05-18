package sistemadevotação;

class Votacao {
	
	int NumeroSeçao;
	int NumeroCandidato;
	
	Votacao(){
		
		this(0, 0);
		
	}
	
	Votacao(int NumeroSeçaoVotacao, int NumeroCandidatoVotacao) {
		
		NumeroSeçao = NumeroSeçaoVotacao;
		NumeroCandidato = NumeroCandidatoVotacao;
	}

}
