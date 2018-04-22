/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glarmesterIT;

import glarmester_solution.data.DataAccessorDatabase;
import glarmester_solution.logic.FrameType;
import glarmester_solution.presentation.TUI;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author OpieOP
 */
public class GlarmesterIT {

    private static DataAccessorDatabase database;
    private static TUI gui;
    //private static List list;

    public GlarmesterIT() {
    }

    @BeforeClass
    public static void setUp() {
        gui = new TUI();
        database = new DataAccessorDatabase();
    }

    //Test 1: Dataconnection Etablish Expected
    @Test
    public void accessTest() {
        double price = database.getGlassprice();
        assertEquals(300.00, price, 0);
    }
    
    @Test
    public void framePriceSimpleTest() {
        double price = database.getFramePrice(FrameType.Simple);
        assertEquals(100, price,0);
    }

    //Test 2: UI Test, Expected not to fail. 
    @Test
    public void UITest() {
        gui.getFrameHeight();
        gui.getFrameWidth();
    }
}
