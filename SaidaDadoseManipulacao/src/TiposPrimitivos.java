import java.util.Scanner;

public class TiposPrimitivos {
	
	public static void main(String[] args ) {
		
		//Importando Objeto
		
		Scanner Teclado = new Scanner (System.in);
				//System.out.print("A nota é "+ nota);
		
				//System.out.println("A nota é "+ nota);
					
				//System.out.printf("A nota de %s é %.2f ",nome, nota);
		
		System.out.print("Digite o nome do aluno: ");
		String nome = Teclado.nextLine();
		System.out.print("Digite a nota do aluno: ");
		float nota = Teclado.nextFloat();
		System.out.format("A nota de %s é %.2f ",nome, nota);
		
		
	}

}
