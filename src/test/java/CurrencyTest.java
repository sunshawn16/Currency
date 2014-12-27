import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CurrencyTest {
    @Test
    public void tshould_get_rmb_when_rmb_plus_dollar() throws Exception {
        Currency rmb= new RMB();
        Currency dollar= new Dollar();
        rmb.setValue(1);
        System.out.println(rmb.value);
        dollar.setValue(1);
        System.out.println(dollar.value);
        dollar.setRadio(6);

        assertThat(rmb.add(dollar), is(7.0));

    }




}