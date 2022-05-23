import java.util.Scanner;

 class Eleicao 
{

	public static void main (String[]args) 
	{
		Scanner ler = new Scanner(System.in); 
		// criando sacnner.
		int PT = 0,PDT = 0,PL = 0,PSDB = 0,nulo = 0,branco = 0; 
		//declarando as variaveis.
		
		for(int i = 0; i<=50; i++)  
		//criando um contador que ira parar ao termino de 50 votos
		{
			int candidatos ; 
			//declarando a variavel que sera usada para receber os votos.
			  System.out.println("escolha o numero de seu candidato sendo 1=PT,2=PDT,3=PL,4=PSDB,5=nulo ou 6=branco "); 
			  //mensagem que aparecera para o eleitor.
			  candidatos = ler.nextInt();
			  //o eleitor digita o codigo do seu candidato.
			
			 
			switch(candidatos) 
			//aqui os votos serão armazenados. 
			{	
				case 0:
					branco++;
					break;
				case 1:
					nulo++;
					break;
				case 12:
					PDT++;
					break;	
				case 13:
					PT++;
					break;
				case 22:
					PL++;
					break;
				case 45:
					PSDB++;
					break;
			}
		}	
			//ao final dos 50 votos sera exibido as mensagens abaixo
			System.out.println("O PT teve um total de:"+ PT +"votos");
			System.out.println("O PL teve um total de:"+ PL +"votos");
			System.out.println("O PSDB teve um total de:"+ PSDB +"votos");
			System.out.println("O PDT teve um total de:"+ PDT +"votos");
			System.out.println("O total de votos nulos foi de:" + nulo);
			System.out.println("O total de votos branco foi de:" + branco);
	}
}
