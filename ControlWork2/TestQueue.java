package ControlWork2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestQueue {
    private Queue<Integer> q;
    @BeforeEach
    void init(){
        q = new Queue<>(1000);
    }

    @Test
    void testPop(){
        q.Push(123);
        q.Push(231231);
        q.Push(9900990);
        assertEquals(123, q.pop());
    }

    @Test
    void testSize(){
        q.Push(123);
        q.Push(3213);
        q.Push(321321);
        assertEquals(3, q.size());
    }
    @Test
    void testClear(){
        q.Push(321321);
        q.Push(321322311);
        q.Push(421321);
        q.clear();
        assertEquals(0 , q.size());
    }
}
