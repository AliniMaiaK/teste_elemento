package teste_sequencia_elemento;

public class elemento{

    public static void main(String[] args) {
        
    	int[][] sequencias = {
                {1, 3, 5, 7},
                {2, 4, 8, 16, 32, 64},
                {0, 1, 4, 9, 16, 25, 36},
                {4, 16, 36, 64},
                {1, 1, 2, 3, 5, 8},
                {2, 10, 12, 16, 17, 18, 19}
            };

            for (int i = 0; i < sequencias.length; i++) {
                int[] sequencia = sequencias[i];
                int proximo = calcularProximo(sequencia);
                System.out.println("Próxima sequência: " + proximo);
                
            }
        }

        public static int calcularProximo(int[] sequencia) {
            int ultimo = sequencia[sequencia.length - 1];
            return ultimo + (sequencia[1] - sequencia[0]);
        }
    }
	
