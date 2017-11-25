package com.crevation.nglocaltime;

import com.crevation.nglocaltime.efik.Efik;
import com.crevation.nglocaltime.english.English;
import com.crevation.nglocaltime.hausa.Hausa;
import com.crevation.nglocaltime.igbo.Igbo;
import com.crevation.nglocaltime.yoruba.Yoruba;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LanguageUnitTest {

    Time yoruba;
    Time igbo;
    Time hausa;
    Time english;
    Time efik;

    @Before
    public void setupTime() {

        yoruba = new Yoruba();
        igbo = new Igbo();
        hausa = new Hausa();
        english = new English();
        efik = new Efik();
    }

    @Test
    public void showCorrectOutput() {


        System.out.println(yoruba.getTime("4:00"));
        System.out.println(igbo.getTime("4:15"));
        System.out.println(hausa.getTime("4:15"));
        System.out.println(english.getTime("4:15"));
        System.out.println(efik.getTime("4:15"));
        System.out.println(efik.getTime("45"));
    }

    @Test
    public void yoruba_isCorrect() throws Exception {

        assertEquals(yoruba.getTime("4:00"), "Aago Merin");

    }

    @Test
    public void igbo_isCorrect() throws Exception {


        assertEquals(igbo.getTime("4:15"), "O ji nkeji Iri na ise gafee  Elekere Ano");
    }

    @Test
    public void hausa_isCorrect() throws Exception {


        assertEquals(hausa.getTime("4:15"), "Karfe Hudu Da Kwata");
    }

    @Test
    public void english_isCorrect() throws Exception {


        assertEquals(english.getTime("4:15"), "Quarter past Four");
    }

    @Test
    public void efik_isCorrect() throws Exception {

        assertEquals(efik.getTime("4:15"), "Amia Inan ebe ke minute Efut");
    }
}