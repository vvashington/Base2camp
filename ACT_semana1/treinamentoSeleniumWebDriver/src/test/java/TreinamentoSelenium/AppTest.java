// 1 - pacote
package TreinamentoSelenium;

// 2 - bobliotecas

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

// 3 - Classes
public class AppTest{
    // 3.1 - Atributos

    // 3.2 - Funçoes e Metodos
    @Test //função que valida se a srting fruta realmente é Pera
    public <string> void meuPrimeiroTeste()
    {
        String fruta = "Pera";
        assertTrue( fruta.equals("Pera"));
    }

    @Test //função que valida se a string empresa e cidade  realmente são Base2 e B.H
    public void meuSegundoTeste()
    {
        String empresa = "Base2";
        String cidade = "B.H";
        assertTrue(empresa.equals("Base2"));
        assertTrue(cidade.equals("B.H"));
    }

    @Test //função que valida se o resultao obtido é o resutado esperado
    public void meuTeceiroTeste()
    {
        assertEquals(4+6, 10);
    }


}
