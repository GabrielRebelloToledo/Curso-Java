
public class TesteTipos {
	public static void main(String[] args ) {
		
		int idade = 30;
		String valorString = "30";
		
		//String valor = idade;
		//String valor = (String) idade;
		
		String valor = Integer.toString(idade);//Classe involucro 
		
		int idadeNumber = Integer.parseInt(valorString);
		
		
		System.out.println("A idade é: " + valor);
		
		System.out.println("A idadeNumber é : " + idadeNumber);
		
	}
}
