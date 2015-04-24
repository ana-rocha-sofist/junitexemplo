import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ana.fasanella on 24/04/15.
 */
public class qualquer_nomeTest {

    int parametro1 = 2;

    @Test
    public void addition_withValidParameters_shouldReturnCorrectResponse() {
        qualquer_nome add = new qualquer_nome();
        assertEquals("A soma de 2 e 3 deve ser 5", 5, add.addition(parametro1, 3));
    }

    @Test
    public void validaEmail_withValidEmail_shouldNotReturnError() {
        qualquer_nome add = new qualquer_nome();
        assertEquals("O email deveria ser Valido", true, add.validaEmail("ana.fasanella@sofist.com.br"));
    }


    @Test
    public void validaEmail_withInvalidEmailWithoutAt_shouldReturnError() {
        qualquer_nome add = new qualquer_nome();
        assertEquals("O email deveria ser invalido", false, add.validaEmail("aaa.com.br"));
    }

    @Test
    public void validaEmail_withInvalidEmailWithoutDoc_shouldReturnError() {
        qualquer_nome add = new qualquer_nome();
        assertEquals("O email deveria ser invalido", false, add.validaEmail("aaa@combr"));
    }

    @Test
    public void validaEmail_withInvalidEmailWithoutEnd_shouldReturnError() {
        qualquer_nome add = new qualquer_nome();
        assertEquals("O email deveria ser invalido", false, add.validaEmail("ana@"));
    }

    @Test
    public void validaEmail_withInvalidEmailWithoutStart_shouldReturnError() {
        qualquer_nome add = new qualquer_nome();
        assertEquals("O email deveria ser invalido", false, add.validaEmail("@ana.com.br"));
    }

    @Test
    public void validaEmail_withInvalidEmailWithALotOfDocs_shouldReturnError() {
        qualquer_nome add = new qualquer_nome();
        assertEquals("O email deveria ser invalido", false, add.validaEmail("ana@ana.com.com.com"));
    }

    @Test
    public void validaEmail_withInvalidEmailWithoutAll_shouldReturnError() {
        qualquer_nome add = new qualquer_nome();
        assertEquals("O email deveria ser invalido", false, add.validaEmail("ana"));
    }

    @Test
    public void validaEmail_withInvalidEmailWithTwoAts_shouldReturnError() {
        qualquer_nome add = new qualquer_nome();
        assertEquals("O email deveria ser invalido", false, add.validaEmail("ana@@ana.com.br"));
    }

    @Test
    public void validaEmail_withInvalidEmailWithInvalidCaracters_shouldReturnError() {
        qualquer_nome add = new qualquer_nome();
        assertEquals("O email deveria ser invalido", false, add.validaEmail("#$%@@ana.com.br"));
    }


    @Test
    public void maiorIdade_withValidParametersMoreThan18_shouldReturnCorrectResponse() {
        qualquer_nome add = new qualquer_nome();
        assertEquals("A idade deve ser maior que 18", true, add.maiorIdade(21));
    }

    @Test
    public void maiorIdade_withValidParametersLessThan18_shouldReturnCorrectResponse() {
        qualquer_nome add = new qualquer_nome();
        assertEquals("A idade deve ser menor que 18", false, add.maiorIdade(0));
    }

    @Test
    public void maiorIdade_withInvalidParametersEqual18_shouldReturnCorrectResponse() {
        qualquer_nome add = new qualquer_nome();
        assertEquals("A idade deve ser maior que 18", true, add.maiorIdade(18));
    }

}