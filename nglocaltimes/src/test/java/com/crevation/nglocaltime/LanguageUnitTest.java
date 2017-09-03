package com.crevation.nglocaltime;

import org.junit.Test;

import static org.junit.Assert.*;

import com.crevation.nglocaltime.english.English;
import com.crevation.nglocaltime.hausa.Hausa;
import com.crevation.nglocaltime.yoruba.Yoruba;
import com.crevation.nglocaltime.igbo.Igbo;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LanguageUnitTest {


    @Test
    public  void TestLib(){

        Time yoruba = new Yoruba();
        Time igbo = new Igbo();
        Time hausa = new Hausa();
        Time english = new English();

        System.out.println(yoruba.getTime("4:00"));
        System.out.println(igbo.getTime("4:15"));
        System.out.println(hausa.getTime("4:35"));
        System.out.println(english.getCurrentTime());
    }
}