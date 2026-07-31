package com.example.expensetracker.service;

import com.example.expensetracker.model.Expense;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ExpenseService {

    private List<Expense> expenses = new ArrayList<>();
    private int idCounter = 1;

    public Expense addExpense(Expense expense) {
        expense.setId(idCounter++);

        // ✅ If user did NOT send date → use current date
        if (expense.getDate() == null) {
            expense.setDate(java.time.LocalDate.now());
        }

        expenses.add(expense);
        return expense;
    }
    public List<Expense> getAllExpenses() {
        return expenses;
    }

    public List<Expense> getByCategory(String category) {
        return expenses.stream()
                .filter(e -> e.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public double getTotal() {
        return expenses.stream().mapToDouble(Expense::getAmount).sum();
    }

    public double getTotalByCategory(String category) {
        return getByCategory(category).stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }
    public void clearAll() {
        expenses.clear();
        idCounter = 1;
    }
    public boolean deleteExpense(int id) {
        return expenses.removeIf(e -> e.getId() == id);
    }
}