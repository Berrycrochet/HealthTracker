package org.example.healthtracker;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private String mealType; // "Doručak", "Ručak", "Večera", "Užina"
    private String foodName; // Npr. "Zobena kaša sa borovnicama"
    private Integer calories; // Npr. 350

    public Meal() {}

    public Meal(LocalDate date, String mealType, String foodName, Integer calories) {
        this.date = date;
        this.mealType = mealType;
        this.foodName = foodName;
        this.calories = calories;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getMealType() { return mealType; }
    public void setMealType(String mealType) { this.mealType = mealType; }

    public String getFoodName() { return foodName; }
    public void setFoodName(String foodName) { this.foodName = foodName; }

    public Integer getCalories() { return calories; }
    public void setCalories(Integer calories) { this.calories = calories; }
}