package com.crevation.nglocaltime;

import com.crevation.nglocaltime.efik.Efik;
import com.crevation.nglocaltime.english.English;
import com.crevation.nglocaltime.hausa.Hausa;
import com.crevation.nglocaltime.igbo.Igbo;
import com.crevation.nglocaltime.yoruba.Yoruba;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LanguageUnitTest {


    @Test
    public void showCorrectOutput() {

        Time yoruba = new Yoruba();
        Time igbo = new Igbo();
        Time hausa = new Hausa();
        Time english = new English();
        Time efik = new Efik();

        System.out.println(yoruba.getTime("4:00"));
        System.out.println(igbo.getTime("4:15"));
        System.out.println(hausa.getTime("4:15"));
        System.out.println(english.getTime("4:15"));
        System.out.println(efik.getTime("4:15"));
    }

    @Test
    public void yoruba_isCorrect() throws Exception {

        Time yoruba = new Yoruba();
        assertEquals(yoruba.getTime("4:00"), "Aago Merin");
    }

    @Test
    public void igbo_isCorrect() throws Exception {

        Time time = new Igbo();
        assertEquals(time.getTime("4:15"), "O ji nkeji Iri na ise gafee  Elekere Ano");
    }

    @Test
    public void hausa_isCorrect() throws Exception {

        Time time = new Hausa();
        assertEquals(time.getTime("4:15"), "Karfe Hudu Da Kwata");
    }

    @Test
    public void english_isCorrect() throws Exception {

        Time time = new English();
        assertEquals(time.getTime("4:15"), "Quarter past Four");
    }

    @Test
    public void efik_isCorrect() throws Exception {

        Time time = new Efik();
        assertEquals(time.getTime("4:15"), "Amia Inan ebe ke minute Efut");
    }
}