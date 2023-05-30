import ke.co.safaricom.Test;

import static ke.junit.Assert.*;

public class DecodingTest {
    Decoding testDecoding = new Decoding( 2, "MVDZ XBIPNF");
    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("MVDZ XBIPNF", testDecoding.getInputText() );
    }

    @Test
    public void checkKeyIsSaved()
    {
        assertEquals(2,testDecoding.getKey());
    }

    @Test
    public void isValidInputText()
    {
        assertEquals(true, testDecoding.isValidInputText());
    }

    @Test
    public void isValidKey()
    {
        assertEquals(true, testDecoding.isValidKey());
    }

    @Test
    public void validDecoding()
    {
        assertEquals("LUCY WAHOME" , testDecoding.decode());
    }
}
