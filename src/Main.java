import java.util.Locale; //automaticamente importou o metodo

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		byte age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.5;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f\n\n", product2, price2);
		System.out.printf("%d years old, code %d and gender: %s\n\n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f\n", measure);
		System.out.printf("Rounded (three decimal places): %.3f\n\n\n", measure);
		
		
		
		
//		System.out.println("São Paulo Futebol Clube");
		
		double distancia = 54.129;
//		System.out.printf("%.2f%n", seiLa);
//		System.out.printf("%.4f%n", seiLa);
		// %n é parar quebrar a linha no terminal
		// pode utilizar /n tbm

		//concateção #1
		System.out.println("Resultado = " + distancia + " metros");
		
		//usando printf para concatenar
		System.out.printf("%.2f metros percorridos\n", distancia);
		//usamos a string com um identificador "f" para adicionar a variavel
		
		//printf com varios elementos
		/**
		 * Para adicionar diferentes tipos de variaveis devemos usar:
		 * %f = ponto flutuante
		 * %d = número inteiro
		 * %s = textos
		 * %n = quebra de linha
		 */
		
		//variaveis:
//		String name = "Mussarelo";
//		int age = 23;
//		double salary = 4378.31;
//		System.out.printf("%s tem %d anos e ganha R$ %.2f de salário", name, age, salary);
		
		
	}

}
