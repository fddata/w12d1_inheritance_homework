package Management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Bob", "ABC123", 30000, "IT");
    }


    @Test
    public void getDeptName() {
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void getName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals("ABC123", manager.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(30000, manager.getSalary(), 0);
    }

    @Test
    public void raiseSalary() {
        manager.raiseSalary(1.5);
        assertEquals(45000, manager.getSalary(), 0);
    }

    @Test
    public void payBonus() {
        assertEquals(300, manager.payBonus(), 0);
    }
}