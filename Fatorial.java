public class Fatorial {
	
	//vers�o iterativa do calculo do fatorial
	public int calcularFatorial(int n) throws IllegalArgumentException{
		if(n < 0)
			throw new IllegalArgumentException("n�o existe fatorial para numeros negativos");
		int resultado = 1;
		
		for(int i = 2; i <= n; i++)
			resultado *= i;
		return resultado;
	}
}