package estvet_lt2_ex05.view;

import javax.swing.JOptionPane;

import estvet_lt2_ex05.controller.Controller05;

public class Main {
	
    public static void main(String[] args) {
    	
    	int vetor[] = new int[20], opc = 0;
    	
    	while(opc != 9) {
    		
    		opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Vetor \n2 - Mostra Vetor \n3 - Calcule a soma das diferenças \n9 - Fim "));
    	
    		switch(opc)
    		{
    		case 1:
    			vetor = Controller05.CarregaVetor(vetor);
    			break;
    			
    		case 2:
    			Controller05.MostraVetor(vetor);
    			break;
    			
    		case 3: 
    			Controller05.Calculo(vetor);
    			break;
    		
    		case 9:
    			JOptionPane.showMessageDialog(null, "Fim!");
    			System.exit(0);
    			break;
    			
    		default: JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
    			
    		}
    	
    	}
    	
    	
    	
    	
    	
    }
}