

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.service.ExpenseService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExpenseServiceTest {

    private ExpenseService service;

    @BeforeEach
    void setup() {
        service = new ExpenseService();
    }

    @Test
    void testAddExpense() {

        Expense exp = new Expense();
        exp.setTitle("Food");
        exp.setAmount(500);
        exp.setCategory("Restaurant");

        Expense expense = service.addExpense(exp);

        assertNotNull(expense);
        assertEquals("Food", expense.getTitle());
        assertEquals(500, expense.getAmount());
        assertEquals("Restaurant", expense.getCategory());
    }

    @Test
    void testGetAllExpenses() {

        Expense exp = new Expense();
        exp.setTitle("Food");
        exp.setAmount(500);
        exp.setCategory("Restaurant");

        service.addExpense(exp);

        List<Expense> expenses = service.getAllExpenses();

        assertEquals(1, expenses.size());
    }

    @Test
    void testFilterByCategory() {

        Expense e1 = new Expense();
        e1.setTitle("Dinner");
        e1.setAmount(700);
        e1.setCategory("Food");

        Expense e2 = new Expense();
        e2.setTitle("Taxi");
        e2.setAmount(300);
        e2.setCategory("Travel");

        service.addExpense(e1);
        service.addExpense(e2);

        List<Expense> result = service.getByCategory("Food");

        assertEquals(1, result.size());
        assertEquals("Dinner", result.get(0).getTitle());
    }

    @Test
    void testTotalExpense() {

        Expense e1 = new Expense();
        e1.setTitle("Food");
        e1.setAmount(500);
        e1.setCategory("Food");

        Expense e2 = new Expense();
        e2.setTitle("Travel");
        e2.setAmount(300);
        e2.setCategory("Travel");

        service.addExpense(e1);
        service.addExpense(e2);

        double total = service.getTotal();

        assertEquals(800, total);
    }

    @Test
    void testDeleteExpense() {

        Expense exp = new Expense();
        exp.setTitle("Food");
        exp.setAmount(500);
        exp.setCategory("Food");

        Expense expense = service.addExpense(exp);

        boolean deleted = service.deleteExpense(expense.getId());

        assertTrue(deleted);
    }
}