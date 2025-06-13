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


## 🔄 CRUD Operations

| Operation  | URL Path             | Method | Description              |
|------------|----------------------|--------|--------------------------|
| Create     | `/add-task`          | POST   | Adds a new task          |
| Read       | `/tasks`             | GET    | View all tasks           |
| Update     | `/edit-task/{id}`    | GET/POST | Edit and save task     |
| Delete     | `/delete-task/{id}`  | GET    | Delete a task            |
| Mark Done  | `/complete-task/{id}`| GET    | Mark task as completed   |


## ⚙️ How to Run

### 📌 Prerequisites
- Java 17+ installed
- Maven installed
- IDE like IntelliJ or VS Code

### 📥 Clone the Repository

git clone https://github.com/your-username/task-tracker.git
cd task-tracker 
▶️ Run the Application

./mvnw spring-boot:run
Then, open your browser and visit:

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

Run using Maven:

./mvnw spring-boot:run
Visit in browser:

http://localhost:8080
🖼️ Screenshots
Add screenshots of your add-task, tasks, or edit-task pages here for better presentation.

🙋‍♂️ FAQ / Interview Prep
🔸 What are CRUD operations?
Create → Add task

Read → View all tasks

Update → Edit task

Delete → Delete task

🔸 What is @Entity, @Controller, @Repository?
@Entity: Maps a class to a DB table.

@Controller: Handles HTTP requests (MVC).

@Repository: Interface for data access layer (DAO).

🔸 How is data stored?
Using Spring Data JPA, tasks are stored in a relational database like H2 (in-memory) or MySQL.

❤️ Contributing
Feel free to fork this repo and submit a Pull Request (PR). For major changes, please open an issue first.

📃 License
This project is licensed under the MIT License.

🔗 Connect
GitHub: your-username

LinkedIn: Your Name

### 📝 Notes:
- Replace `your-username` and profile links with your actual details.
- If you're using MySQL instead of H2, I can help you add connection config to `application.properties`.

Let me know if you want the screenshots section filled too or want to deploy this project on GitHub Pages, Vercel, or Render.














