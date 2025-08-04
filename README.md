# ☕ Bean & Do — Backend (Spring Boot)

**Brew your focus. Get things done.**  
This is the **backend** for the Bean & Do productivity web app — a cozy, café‑inspired Pomodoro and task management tool.  
It provides the REST API that powers the frontend, which is available in a **separate repository**.

<img width="736" height="528" alt="Screenshot 2025-07-31 at 9 52 18 PM" src="https://github.com/user-attachments/assets/46c0beb0-5ba0-4b55-903f-8ed0602c0a4b" />

---

## ✨ Features
- 🗒 **Task Management API** – Create, update, and track to‑dos
- 🕵️ **Anonymous Usage** – UUID‑based identifiers for privacy
- ☁️ **Supabase‑hosted PostgreSQL** – Cloud database storage

---

## 🛠 Tech Stack
- **Spring Boot** 
- **PostgreSQL (Supabase)**

---

## 🎨 Design
The **UI/UX** for Bean and Do was custom‑designed in **Figma**, with:
- A **minimal, café‑inspired theme**
- Warm, coffee‑toned color palette
- Simple layouts for distraction‑free productivity
- Clean typography for readability

You can view the design concept here: https://www.figma.com/design/ZwS9rUK2bc1DAJy9KGO4X4/Bean---Do?node-id=0-1&t=CmJR9VtRcdA1sWnT-1

---

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Maven
- Supabase project with PostgreSQL enabled

---

### Backend Setup
#### Clone the backend repository
git clone https://github.com/your-username/bean-and-do-backend.git 
cd bean-and-do-backend

#### Export your Supabase credentials as environment variables
export SUPABASE_URL=jdbc:postgresql://<SUPABASE_HOST>:5432/postgres
export SUPABASE_USER=<SUPABASE_USER>
export SUPABASE_PASSWORD=<SUPABASE_PASSWORD>

#### Or add them to src/main/resources/application.properties:
spring.datasource.url=jdbc:postgresql://<SUPABASE_HOST>:5432/postgres
spring.datasource.username=<SUPABASE_USER>
spring.datasource.password=<SUPABASE_PASSWORD>

# Run the backend
./mvnw spring-boot:run
# Back-And-Do-Backend
# Back-And-Do-Backend
# Back-And-Do-Backend
# Bean-And-Do-Backend
