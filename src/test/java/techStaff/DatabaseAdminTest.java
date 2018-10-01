package techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() throws Exception {
        databaseAdmin = new DatabaseAdmin("Samantha", "ABC4567", 20000);
    }


    @Test
    public void getName() {
        assertEquals("Samantha", databaseAdmin.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals("ABC4567", databaseAdmin.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(20000, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void raiseSalary() {
        databaseAdmin.raiseSalary(1.5);
        assertEquals(30000, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void payBonus() {
        assertEquals(200, databaseAdmin.payBonus(), 0);
    }
}