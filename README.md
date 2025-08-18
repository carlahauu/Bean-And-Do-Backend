# ☕ Bean & Do — Backend (Spring Boot)

**Brew your focus. Get things done.**  
This is the **backend** for the Bean & Do productivity web app — a cozy, café‑inspired Pomodoro and task management tool.  
It provides the REST API that powers the frontend, which is available in a [**separate repository**](https://github.com/carlahauu/Bean-And-Do-Frontend).

![1754905348417](https://github.com/user-attachments/assets/df6fa371-4ac6-47f6-99f0-b994db0947df)

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
git clone https://github.com/carlahauu/bean-and-do-backend.git 
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
