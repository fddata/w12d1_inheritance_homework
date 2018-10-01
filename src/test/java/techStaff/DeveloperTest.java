package techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() throws Exception {
        developer = new Developer("Tom", "ABC456", 20000);
    }


    @Test
    public void getName() {
        assertEquals("Tom", developer.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals("ABC456", developer.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(20000, developer.getSalary(), 0);
    }

    @Test
    public void raiseSalary() {
        developer.raiseSalary(1.5);
        assertEquals(30000, developer.getSalary(), 0);
    }

    @Test
    public void payBonus() {
        assertEquals(200, developer.payBonus(), 0);
    }
}