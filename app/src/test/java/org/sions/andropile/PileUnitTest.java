package org.sions.andropile;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PileUnitTest {
    @Test
    public void emptyPile() {
        Pile pile = new Pile();
        assertEquals(pile.list(), new ArrayList<String>());
    }

    @Test
    public void pile_add() {
        Pile pile = new Pile();
        pile.add("Alpha");
        assertEquals(pile.list(), new ArrayList<>(Arrays.asList("Alpha")));
        assertEquals(pile.list().size(), 1);
    }

    @Test
    public void pile_delete() {
        Pile pile = new Pile();
        assertEquals(pile.list(), new ArrayList<String>());
        pile.delete("");  //Test empty Deletion
        assertEquals(pile.list(), new ArrayList<String>());
        pile.add("Alpha");
        pile.delete("Alpha");
        assertEquals(pile.list(), new ArrayList<String>());
    }

    @Test
    public void pile_get_Choice() {
        Pile pile = new Pile();

        assertEquals(pile.getChoice(), "");

        pile.add("Alpha");
        assertEquals("Alpha", pile.getChoice());
    }

}