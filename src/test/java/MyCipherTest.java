import org.junit.Test;

import static org.junit.Assert.*;

public class MyCipherTest {

    @Test
    public void compute() {
        MyCipher c=new MyCipher();
        assertEquals(6,c.compute("+ 4 2"));
    }
}