# 📝 Task Tracker Web App

A simple yet powerful **Task Tracking Web Application** built using **Spring Boot**, **Spring Data JPA**, **Thymeleaf**, and **HTML/CSS**. It helps users manage their daily tasks with features like add, edit, delete, view, and mark tasks as completed.

---

## 🚀 Features

- ✅ Add new tasks with title and due date
- 📋 View all added tasks
- ✏️ Edit existing tasks
- 🗑️ Delete tasks you no longer need
- ✔️ Mark tasks as completed
- 📅 Date picker for due date
- 🔁 Automatic page redirects after actions

---

## 🛠️ Tech Stack

| Layer       | Technology Used            |
|-------------|-----------------------------|
| Language    | Java                        |
| Framework   | Spring Boot (MVC + JPA)     |
| Templating  | Thymeleaf                   |
| Database    | H2 (In-memory) / MySQL (optional) |
| Styling     | Plain CSS                   |
| Build Tool  | Maven                       |

---

## 📂 Project Structure

src/
├── main/
│ ├── java/com/example/tasktracker/
│ │ ├── Task.java # Entity class representing a Task
│ │ ├── TaskRepository.java # JPA repository interface for DB operations
│ │ └── TaskController.java # Controller class handling all routes and logic
│ └── resources/
│ ├── static/css/style.css # Custom CSS styling
│ ├── templates/
│ │ ├── home.html # Optional home page
│ │ ├── tasks.html # View all tasks
│ │ ├── add-task.html # Form to add a new task
│ │ └── edit-task.html # Form to edit a task
│ └── application.properties # DB and port configuration

yaml
Copy
Edit

---

## 🔄 CRUD Operations

| Operation  | URL Path             | Method | Description              |
|------------|----------------------|--------|--------------------------|
| Create     | `/add-task`          | POST   | Adds a new task          |
| Read       | `/tasks`             | GET    | View all tasks           |
| Update     | `/edit-task/{id}`    | GET/POST | Edit and save task     |
| Delete     | `/delete-task/{id}`  | GET    | Delete a task            |
| Mark Done  | `/complete-task/{id}`| GET    | Mark task as completed   |

---

## ⚙️ How to Run

### 📌 Prerequisites
- Java 17+ installed
- Maven installed
- IDE like IntelliJ or VS Code

### 📥 Clone the Repository

```bash
git clone https://github.com/your-username/task-tracker.git
cd task-tracker 
▶️ Run the Application
bash
Copy
Edit
./mvnw spring-boot:run
Then, open your browser and visit:

arduino
Copy
Edit
http://localhost:8080
📚 Interview / Viva Questions
Question	Answer
What is a class?	A blueprint to create objects, representing real-world entities.
What is an object?	An instance of a class, with its own state and behavior.
What is CRUD?	Create, Read, Update, Delete - basic operations for data management.
What does @Entity do?	Maps the Java class to a DB table.
What is @Controller?	Handles HTTP requests and returns views or responses.
How is data stored?	Using Spring Data JPA (Hibernate) into an H2/MySQL database.
What is @ModelAttribute in Spring?	Binds HTML form data to Java object.
What is the role of `	








