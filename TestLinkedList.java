import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by axelntwari on 6/14/17.
 */
public class TestLinkedList {

    @Test
    public void isEmpty() throws Exception {
        LinkedList<Integer> a = new LinkedList<>();
        assertTrue(a.isEmpty());
        a.add(10);
        assertFalse(a.isEmpty());
    }

    @Test
    public void add() throws Exception {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(10);
        assertTrue(a.search(10));
        assertFalse(a.search(15));
    }

    @Test
    public void size() throws Exception {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(100);

        int size = a.size();

        assertEquals(size, 2);
    }

    @Test
    public void search() throws Exception {
        LinkedList<Integer> a = new LinkedList<>();

        assertFalse(a.search(15));

        a.add(10);
        assertTrue(a.search(10));
        assertFalse(a.search(15));
    }

    @Test
    public void remove() throws Exception {
        LinkedList<Integer> a = new LinkedList<>();

        a.add(10);
        a.add(15);
        assertTrue(a.search(10));
        assertTrue(a.search(15));

        a.remove(15);
        assertTrue(a.search(10));
        assertFalse(a.search(15));

        a.remove(10);
        assertTrue(a.isEmpty());
    }

}