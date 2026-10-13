package org.example.healthtracker;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    private String password;
    private String name;
    private String profilePicUrl; // Link ili odabrani avatar

    // Lični ciljevi za motivacijskog agenta
    private Integer targetSteps = 10000;
    private Integer targetWater = 8;
    private Double targetSleep = 8.0;

    public User() {}

    // Getteri i Setteri
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getProfilePicUrl() { return profilePicUrl; }
    public void setProfilePicUrl(String profilePicUrl) { this.profilePicUrl = profilePicUrl; }

    public Integer getTargetSteps() { return targetSteps; }
    public void setTargetSteps(Integer targetSteps) { this.targetSteps = targetSteps; }

    public Integer getTargetWater() { return targetWater; }
    public void setTargetWater(Integer targetWater) { this.targetWater = targetWater; }

    public Double getTargetSleep() { return targetSleep; }
    public void setTargetSleep(Double targetSleep) { this.targetSleep = targetSleep; }
}