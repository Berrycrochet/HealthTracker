package org.example.healthtracker;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "health_logs")
public class HealtLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private Double weight;
    private Double height; // u cm (npr. 168)
    private Double bmi;    // automatski izračunat
    private String bloodPressure; // npr. "120/80"
    private Integer pulse; // npr. 72g
    private Double sleep;
    private Integer water;
    private String mood;
    private Integer steps;    // Npr. 8500 koraka
    private Integer calories; // Npr. 450 kcal

    @Column(length = 1000)
    private String notes;

    public HealtLog() {}

    // Getteri i Setteri
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public Double getWeight() { return weight; }
    public void setWeight(Double weight) { this.weight = weight; }

    public Double getHeight() { return height; }
    public void setHeight(Double height) { this.height = height; }

    public Double getBmi() { return bmi; }
    public void setBmi(Double bmi) { this.bmi = bmi; }

    public String getBloodPressure() { return bloodPressure; }
    public void setBloodPressure(String bloodPressure) { this.bloodPressure = bloodPressure; }

    public Integer getPulse() { return pulse; }
    public void setPulse(Integer pulse) { this.pulse = pulse; }

    public Double getSleep() { return sleep; }
    public void setSleep(Double sleep) { this.sleep = sleep; }

    public Integer getWater() { return water; }
    public void setWater(Integer water) { this.water = water; }

    public String getMood() { return mood; }
    public void setMood(String mood) { this.mood = mood; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    @ManyToOne
    private User user; // Svaki unos pripada tačno jednom korisniku

    // Dodaj Gettere i Settere za steps, calories i user
    public Integer getSteps() { return steps; }
    public void setSteps(Integer steps) { this.steps = steps; }

    public Integer getCalories() { return calories; }
    public void setCalories(Integer calories) { this.calories = calories; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}