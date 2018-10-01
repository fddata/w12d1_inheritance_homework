package Management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectorTest {
    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Janice", "DEF123", 50000, "IT", 100000);
    }


    @Test
    public void getDeptName() {
        assertEquals("IT", director.getDeptName());
    }

    @Test
    public void getName() {
        assertEquals("Janice", director.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals("DEF123", director.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(50000, director.getSalary(), 0);
    }

    @Test
    public void raiseSalary() {
        director.raiseSalary(1.5);
        assertEquals(75000, director.getSalary(), 0);
    }

    @Test
    public void payBonus() {
        assertEquals(1000, director.payBonus(), 0);
    }


    @Test
    public void getBudget() {
        assertEquals(100000, director.getBudget(), 0);
    }
}