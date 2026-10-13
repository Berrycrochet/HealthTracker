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
    private Double sleep;
    private Integer water;
    private String mood;

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

    public Double getSleep() { return sleep; }
    public void setSleep(Double sleep) { this.sleep = sleep; }

    public Integer getWater() { return water; }
    public void setWater(Integer water) { this.water = water; }

    public String getMood() { return mood; }
    public void setMood(String mood) { this.mood = mood; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}