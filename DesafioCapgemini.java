import java.util.Arrays;

public class DesafioCapgemini {

    // Questão 1
    public static int ObterMediana(int[] array) {
        int primeiraPosicao = 0;
        int ultimaPosicao = array.length - 1;

        Arrays.sort(array);

        return array[((primeiraPosicao + ultimaPosicao) / 2)];
    }

    // Questão 2
    public static int ContarParesPorDiferenca(int[] n, int x) {
        Arrays.sort(n);
        int tamanhoVetor = n.length - 1;

        int count = 0;

        for (int j = tamanhoVetor; j >= 0; j--) {
            for (int i = tamanhoVetor; i >= 0; i--) {
                if ((n[j] - n[i]) == x) {
                    count++;
                }
            }
        }

        return count;
    }

    // Questão 3
    public static String EncriptarTexto(String texto) {
        String result = texto.replaceAll("\\s+", "");
        double tamanhoTexto = result.length();

        int T = (int) Math.ceil(Math.sqrt(tamanhoTexto));

        char matriz[][] = new char[T][T];

        int indexCount = 0;
        StringBuilder textoEncriptado = new StringBuilder();

        for (var row = 0; row < T; row++) {
            for (var column = 0; column < T; column++) {

                if (indexCount > tamanhoTexto - 1)
                    break;

                matriz[row][column] = result.charAt(indexCount);
                indexCount++;
            }
        }

        for (var column = 0; column < T; column++) {
            for (var row = 0; row < T; row++) {

                if(!(matriz[row][column] == 0)){
                    textoEncriptado.append(matriz[row][column]);
                }

                if (row == (T - 1)) {
                    textoEncriptado.append(" ");
                }
                
            }
        }

        return textoEncriptado.toString().trim();
    }

}