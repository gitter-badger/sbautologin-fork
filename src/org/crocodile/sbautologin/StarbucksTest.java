package org.crocodile.sbautologin;

import static org.junit.Assert.*;

import org.junit.Test;

public class StarbucksTest
{

    @Test
    public void testLogin() throws Exception
    {
        Starbucks s = new Starbucks();
        boolean res = s.login("http://www.codeminders.com/");
        assertTrue(res);
    }

}
