import test.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodingTest {
    Encoding testEncoding = new Encoding("LUCY WAHOME", 2);

    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("LUCY WAHOME", testEncoding.getInputText() );
    }

    @Test
    public void checkKeyIsSaved()
    {
        assertEquals(2,testEncoding.getKey());
    }

    @Test
    public void isNotEmpty()
    {
        assertEquals(true,testEncoding.isNotEmpty());
    }

    @Test
    public void isValidInputText()
    {
        assertEquals(true, testEncoding.isValidInputText());
    }

    @Test
    public void isValidKey()
    {
        assertEquals(true, testEncoding.isValidKey());
    }

    @Test
    public void validEncoding()
    {
        assertEquals("MVDZ XBIPNF" , testEncoding.encode());
    }

}
