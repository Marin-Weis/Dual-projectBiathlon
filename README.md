# 🟦 CyBLE – Biathlon Cycle Evaluation App (Android / Kotlin)

CyBLE (Cycle de Biathlon en Éducation Physique) is a mobile application designed to support Physical Education (PE) teachers during **biathlon evaluation sessions** in 4th grade.  
The project is developed in collaboration between the **IUT de Vannes** and the **Collège Notre-Dame-La-Blanche (Theix-Noyalo)**.

The goal is to provide a **fully offline, real-time, local, and autonomous Android application** capable of managing student performance during biathlon sessions combining **running**, **laser shooting**, **VMA calculations**, and **penalty laps**.

---

## 📘 1. Project Overview

The school biathlon alternates:
- Running laps (distance adapted to each student’s VMA),
- Laser rifle shooting (5 shots),
- Penalty laps (30 m per missed shot).

Until now, teachers managed:
- Lap timing,  
- Accuracy tracking,  
- Penalties,  
- VMA distance adjustments,  

➡️ **Manually**, causing delays, errors, and reduced pedagogical efficiency.

CyBLE automates all these operations:
- Real-time tracking,
- Automatic penalty & score calculation,
- Local data storage,
- Instant feedback for students,
- Offline teacher–student communication.

A first functional prototype is expected for **January 2026**.

---

## 🌐 2. Network Architecture

The app must operate **outdoors**, often without Internet.  
Three models were evaluated: infrastructure, ad-hoc, and PWA.

### ✔ Chosen Solution: **Ad-Hoc Local Network**
- Teacher tablet acts as **Wi-Fi hotspot + local server**.
- Students connect directly to it.
- No external server required.
- Extremely low latency.
- Fully autonomous on a stadium.

Communication uses:
- **HTTP** for requests,
- **SSE (Server-Sent Events)** for real-time data pushes.

---

## 🛠 3. Technologies Used

### **Frontend**
**Jetpack Compose (Kotlin)**  
- Native Android UI  
- Live Preview & Hot Reload  
- High performance  

### **Backend**
**Ktor (Kotlin)**  
- Embedded local server  
- Supports HTTP + SSE  
- Lightweight & fast  

### **Database**
**SQLite + Room**  
- Local embedded SQL  
- Perfect offline reliability  
- Stores times, shots, penalties, VMA  

### **Language**
**Kotlin (JetBrains/Google official Android language)**

---

## 🧩 4. Main Features (Planned)

### ✔ For Teachers
- Session creation & management  
- Real-time tracking of students  
- Automatic calculations:  
  - Lap times  
  - Shooting accuracy  
  - Penalty laps  
  - Final score  
- Local data storage  
- CSV export  

### ✔ For Students
- Connect to teacher’s tablet  
- Enter shooting results  
- View performance metrics  
- Instant feedback  

### ✔ Technical
- Local Ktor server  
- Real-time events (SSE)  
- Fully offline  

---


## 👥 5. Contributors

### **Client**
- **Thierry LE GOFF**  
  *Professeur d’EPS – Collège Notre-Dame-La-Blanche (Theix-Noyalo)*  
  Responsable du besoin pédagogique, conception du cycle EPS et validation des fonctionnalités.  
  📧 **legoff.thierry2@gmail.com**

---

### **Development Team – IUT de Vannes (BUT Informatique)**  

- **Matthieu Gouelo**  
  *Scrum Master & FullStack Developer*  

- **Marin Weis**  
  *Responsable Communication & FullStack Developer*  

- **Nolann Lescop**  
  *FullStack Developer*  

- **Glen Potay**  
  *FullStack Developer*  

---
