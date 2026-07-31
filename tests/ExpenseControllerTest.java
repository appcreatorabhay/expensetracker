

import com.example.expensetracker.ExpensetrackerApplication;
import com.example.expensetracker.model.Expense;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.http.MediaType;

import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest(classes = ExpensetrackerApplication.class)
@AutoConfigureMockMvc
public class ExpenseControllerTest {


    @Autowired
    private MockMvc mockMvc;


    @Autowired
    private ObjectMapper objectMapper;



    @Test
    void testAddExpense() throws Exception {

        Expense expense = new Expense();

        expense.setTitle("Food");
        expense.setAmount(500);
        expense.setCategory("Restaurant");


        mockMvc.perform(post("/expenses")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(expense)))

                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Food"))
                .andExpect(jsonPath("$.amount").value(500));

    }



    @Test
    void testGetAllExpenses() throws Exception {


        mockMvc.perform(get("/expenses"))

                .andExpect(status().isOk());

    }



    @Test
    void testFilterExpenseByCategory() throws Exception {


        mockMvc.perform(get("/expenses/category/Food"))

                .andExpect(status().isOk());

    }



    @Test
    void testTotalExpense() throws Exception {


        mockMvc.perform(get("/expenses/total"))

                .andExpect(status().isOk());

    }



    @Test
    void testDeleteExpense() throws Exception {


        Expense expense = new Expense();

        expense.setTitle("Travel");
        expense.setAmount(300);
        expense.setCategory("Travel");


        String response =
                mockMvc.perform(post("/expenses")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(expense)))

                        .andReturn()
                        .getResponse()
                        .getContentAsString();


        Expense savedExpense =
                objectMapper.readValue(response, Expense.class);


        mockMvc.perform(delete("/expenses/" + savedExpense.getId()))

                .andExpect(status().isOk());

    }

}