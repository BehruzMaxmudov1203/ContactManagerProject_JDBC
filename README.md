<!-- Banner -->
<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=28&pause=1000&color=6C5CE7&center=true&vCenter=true&width=900&lines=📇+Java+JDBC+Contact+Manager;🐘+PostgreSQL+Integration;⚙️+CRUD+Operations+%26+Search!" alt="Typing SVG" />
</p>

---

## 🚀 About the Project
This project demonstrates a **Contact Management System** built using **Java JDBC** and **PostgreSQL**.  
Users can **add, list, delete, and search contacts** from a database with a simple console interface.

---

## 🧩 Project Structure

### 📘 1. `controller/ContactController.java`
- Handles user input via console  
- Provides a **menu** for CRUD operations  
- Calls `ContactService` methods to perform actions

### 📗 2. `dto/Contact.java`
- Data Transfer Object (DTO) for storing contact information  
- Fields: `id`, `name`, `surname`, `phone`  

### 📙 3. `repository/ContactRepository.java`
- Handles **direct database operations**  
- Methods: `saveContact()`, `getByPhone()`, `getList()`, `delete()`, `search()`  
- Uses **PreparedStatement** for secure SQL queries

### 📒 4. `service/ContactService.java`
- Business logic layer  
- Validates phone uniqueness before saving  
- Calls repository methods and handles output messages

### 📕 5. `util/DatabaseUtil.java`
- Utility class for **database connection**  
- Creates the `contact` table if it doesn't exist  
- Provides `getConnection()` method for JDBC

---

## 🎯 Features
- Add a new contact  
- List all contacts  
- Delete a contact by phone  
- Search contacts by name, surname, or phone  
- Automatic table creation if it does not exist  
- Secure SQL queries using **PreparedStatement**

---

## 🛠 Technologies Used
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-007396?style=for-the-badge&logo=java&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)

---

## 🧠 Key Concepts
- **JDBC**: Connecting Java with PostgreSQL  
- **CRUD Operations**: Create, Read, Update, Delete  
- **PreparedStatement**: Secure queries to prevent SQL injection  
- **DTO Pattern**: Separate data representation  
- **Service Layer**: Business logic separation from repository  
- **Database Table Management**: Auto-create table if missing

---

## 📈 GitHub Stats
<p align="center">
  <img src="https://github-readme-stats.vercel.app/api?username=BehruzMaxmudov1203&show_icons=true&theme=tokyonight" alt="Behruz's GitHub stats" />
  <img src="https://github-readme-streak-stats.herokuapp.com/?user=BehruzMaxmudov1203&theme=tokyonight" alt="GitHub Streak" />
</p>

---

<p align="center">
  <img src="https://github-readme-activity-graph.vercel.app/graph?username=BehruzMaxmudov1203&theme=react-dark" alt="GitHub Activity Graph" />
</p>

---

<p align="center">⭐️ Created by <b>Behruz Maxmudov</b> — Java JDBC Contact Manager</p>
