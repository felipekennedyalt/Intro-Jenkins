
import Pessoa.Pessoa;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class PessoaTest {
    
    Pessoa p = new Pessoa();
    
    @Before
    public void init(){
        p = new Pessoa();
    }
    
    @Test
    public void deveriaValidarNomePessoa(){
        p.setNome("Jojo");
        Assert.assertTrue(p.getNome().length() > 1);
        
    }
    @Test
    public void cpfDeveriaConterOnzaDigitos(){
        p.setCpf("12345678910");
        Assert.assertEquals(11, p.getCpf().length());
        
    }
    
}
