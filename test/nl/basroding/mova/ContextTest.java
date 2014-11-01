/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.basroding.mova;

import nl.basroding.mova.dummy.views.CheckLoginData;
import nl.basroding.mova.dummy.views.LoginView;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Bas
 */
public class ContextTest
{
    private Context context;
    
    public ContextTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        Context context = new Context() {
        };
        
        context.getMapper().map(LoginView.NameEnteredEvent.class, CheckLoginData.class);
        context.run();
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    @Test
    public void testSomeMethod()
    {
        LoginView view = new LoginView();
        view.doSomething();
        
        assert(true);
    }
    
}
