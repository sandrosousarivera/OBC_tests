package SimpleDialogScanner;

public class EjercicioTema3CursoBasicoJava {
	

	public static void main(String[] args) {
		
		
		String Nombres [] = {"Sandro", "Luis", "Lucía", "Esmeralda"};
		
		String textoFinal= " " ;
		
		
		for (int i=0; i< Nombres.length; i++ ) {
			
			textoFinal += Nombres[i] + " ";
			
		}
	
		System.out.println(textoFinal);
	}
}
