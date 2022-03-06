import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DesafioCapgeminiTest {

    @Test
    public void ObterMedianaTest() {
        int array[] = { 9, 2, 1, 4, 6 };
        int resultado = DesafioCapgemini.ObterMediana(array);

        assertEquals(4, resultado);
    }

    @Test
    public void ContarParesPorDiferencaTest() {
        int n[] = { 1, 5, 3, 4, 2 };
        int x = 2;

        int resultado = DesafioCapgemini.ContarParesPorDiferenca(n, x);

        assertEquals(3, resultado);
    }

    @Test
    public void EncriptarTextoExemplo1Test(){
        String resultado = DesafioCapgemini.EncriptarTexto("tenha um bom dia");
        assertEquals("taoa eum nmd hbi", resultado);
    }

    @Test
    public void EncriptarTextoExemplo2Test(){
        String resultado = DesafioCapgemini.EncriptarTexto("ola mundo");
        assertEquals("omd luo an", resultado);
    }

}