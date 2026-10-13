# HealthTracker Personal Wellness & Activity Dashboard
This repository is for the App HealthTracker for your daily use  , to benefit everybody to improve them self.


[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Database](https://img.shields.io/badge/Database-H2%20In--Memory-blue.svg)](https://www.h2database.com/)
[![Frontend](https://img.shields.io/badge/Frontend-Thymeleaf%20%7C%20JS%20%7C%20CSS3-pink.svg)](#)

**HealthTracker** je moderna, višenamjenska web aplikacija za praćenje ličnog zdravlja, aktivnosti, ishrane, sna i napretka. Dizajnirana sa naglaskom na estetiku i korisničko iskustvo, aplikacija nudi **4 dinamičke teme**, pametnog motivacijskog asistenta, te vizuelne prikazivače napretka u stilu *Samsung Health-a*.

---

## 🌟 Ključne Funkcionalnosti

### 🎨 1. Multi-Theme Engine (4 Dinamičke Teme)
Prilagodi izgled aplikacije jednim klikom. Svaka tema mijenja paletu boja, nazive, gramatički rod i emoji stikere u cijeloj aplikaciji:
- 🌸 **Girly Whimsy (Light)** – Pastelno roza i ljubičasta estetika.
- 🍷 **Girly Romantic Dark** – Mračna bordo-crna elegancija.
- 🩵 **Blue Pastel (Light)** – Svježi plavi akcenti za neutralan/muški izgled.
- ⚡ **Tech Bro (Dark Green)** – Futuristička tamno-zelena terminal estetika.

### 🤖 2. Pametni Motivacijski Asistent
- Automatizovana analiza dnevnog unosa vode, sna i kalorija.
- Pruža dinamičke savjete u realnom vremenu (npr. upozorenje o hidraciji ili nedovoljnom snu).
- Automatski mijenja identitet i emoji zavisno od izabrane teme (*Mala Healthie*, *Velvet Coach*, *Blue Coach*, *Tech Bro Bot*).

### 🥑 3. Dnevnik Obroka & Kalorija
- Unos pojedinačnih obroka (*Doručak*, *Ručak*, *Večera*, *Užina*).
- Automatsko izračunavanje i sumiranje ukupnih dnevnih kalorija.
- Trajno spašavanje u H2 bazi podataka preko REST API-ja.

### 🚶‍♀️ 4. Kalkulator Aktivnosti & Sna
- **Kalkulator Sna:** Automatsko izračunavanje sati sna unosom vremena odlaska na spavanje i buđenja.
- **Kalkulator Koraka:** Pretvaranje minuta šetnje u korake ($\approx 100\text{ koraka/min}$) ili direktan unos sa pametnog sata.

### 🧘‍♀️ 5. Profil, Ciljevi & BMI Kalkulator
- **Avatar Picker:** Izbor unikatnog emoji avatara.
- **Postavljanje Ciljeva:** Prilagođavanje dnevnih ciljeva za korake i vodu.
- **BMI Kalkulator:** Izračunavanje Indeksa Tjelesne Mase sa trenutnom povratnom informacijom o zdravstvenoj kategoriji.

### 📊 6. Vizuelni Dashboard & Grafikoni
- Integracija sa **Chart.js** bibliotekom za prikaz trenda težine i sna.
- Grafikoni automatski mijenjaju svoje boje u zavisnosti od aktivne teme.
- *Samsung Health* indikatorski prstenovi za brzi pregled dnevnog stanja.

---

## 🛠️ Tehnološki Stog (Tech Stack)

### **Backend**
- **Java 17**
- **Spring Boot 3.x**
  - *Spring Web* (REST API i kontroleri)
  - *Spring Data JPA* (ORM za rad sa bazom)
  - *Thymeleaf* (Šablonski mehanizam za prikaz HTML-a)
- **H2 Database** (In-memory baza podataka)

### **Frontend**
- **HTML5 & Custom CSS3** (CSS varijable za teme)
- **Vanilla JavaScript (ES6+)** (Dynamic Theme Switcher, LocalStorage, Fetch API)
- **Chart.js** (Interaktivni grafikoni)

---

## 📁 Arhitektura Projekta

```text
HealthTracker/
├── .mvn/wrapper/
├── src/
│   └── main/
│       ├── java/
│       │   └── org/example/healthtracker/
│       │       ├── HealthTrackerApplication.java  # Glavna Spring Boot klasa
│       │       ├── HomeContoller.java              # Kontroler ruta (/ , /napredak, /profil)
│       │       ├── HealthLog.java                 # Entitet za dnevne zdravstvene parametre
│       │       ├── HealthLogRepository.java       # Spring Data repository za logove
│       │       ├── HealthLogController.java       # REST API za zdravstvene unose
│       │       ├── Meal.java                      # Entitet za obroke i kalorije
│       │       ├── MealRepository.java            # Spring Data repository za obroke
│       │       ├── MealController.java            # REST API za obroke
│       │       └── User.java                      # Entitet za profil i postavke korisnika
│       └── resources/
│           ├── static/
│           │   └── style.css                      # Centralni CSS sa varijablama za 4 teme
│           ├── templates/
│           │   ├── index.html                     # Glavna stranica (Dnevnik obroka & aktivnost)
│           │   ├── napredak.html                  # Stranica sa grafikonima i prstenovima
│           │   └── profil.html                    # Stranica za profil i BMI kalkulator
│           └── application.properties             # Konfiguracija H2 baze i servera
├── pom.xml                                        # Maven ovisnosti
└── README.md
