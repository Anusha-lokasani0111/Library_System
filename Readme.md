# 📝 Java Notes Manager

A simple **text-based notes manager** built using Java.  
This program allows users to **write and read notes** stored in a local text file using `FileWriter` and `BufferedReader`.

## 📌 Features

- ✍️ Write notes to a file (`notes.txt`)
- 📖 Read all saved notes
- 💾 Stores notes persistently between runs
- 🖥️ Works in terminal/command-line (text-based menu)

---

## 🔧 Tools Used

- Java (JDK 8 or above)
- VS Code or any Java IDE
- Terminal / Command Prompt

---

## 📂 Files

NotesManager.java // Main Java file
notes.txt // File created to store user notes (auto-created)

## 🚀 How to Run

### 1️⃣ Compile the Java file:

```bash
javac NotesManager.java
2️⃣ Run the program:
java NotesManager


🧪 Sample Usage
--- Notes Manager ---
1. Write a Note
2. Read Notes
0. Exit
Enter your choice: 1
Enter your note: Review Java file handling

Note saved!

--- Notes Manager ---
1. Write a Note
2. Read Notes
0. Exit
Enter your choice: 2

--- Your Notes ---
- Review Java file handling
📄 How It Works
Uses FileWriter to append notes to notes.txt

Uses BufferedReader to read and display all notes

Automatically creates the file if it doesn’t exist

