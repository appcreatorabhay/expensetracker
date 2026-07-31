package com.example.expensetracker.controller;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.service.ExpenseService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService service;


    public ExpenseController(ExpenseService service) {
        this.service = service;
    }


    @Operation(
            summary = "Add a new expense",
            description = "Creates a new expense with title, amount, category and date"
    )
    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return service.addExpense(expense);
    }

    @Operation(
            summary = "Get all expenses",
            description = "Returns all expenses stored in the system"
    )
    @GetMapping
    public List<Expense> getAll() {
        return service.getAllExpenses();
    }


    @Operation(
            summary = "Filter expenses by category",
            description = "Returns all expenses matching the given category"
    )
    @GetMapping("/category/{category}")
    public List<Expense> byCategory(@PathVariable String category) {
        return service.getByCategory(category);
    }


    @Operation(
            summary = "Calculate total expenses",
            description = "Returns the total amount spent across all expenses"
    )
    @GetMapping("/total")
    public double total() {
        return service.getTotal();
    }


    @Operation(
            summary = "Calculate total expenses by category",
            description = "Returns the total amount spent for a specific category"
    )
    @GetMapping("/total/{category}")
    public double totalByCategory(@PathVariable String category) {
        return service.getTotalByCategory(category);
    }


    @Operation(
            summary = "Delete an expense",
            description = "Deletes an expense using its ID"
    )
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return service.deleteExpense(id) ? "Deleted" : "Not Found";
    }
}