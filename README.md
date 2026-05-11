# 📩 Spam Email Detector

A Java-based desktop application that detects whether an email or message is **Spam** or **Not Spam** using keyword-based text analysis.  
The project includes an interactive graphical user interface built with **Java Swing**.

---

## 🚀 Features

✅ User-friendly graphical interface  
✅ Real-time spam detection  
✅ Keyword-based classification  
✅ Dynamic result display  
✅ Modern GUI with interactive components  

---

## 🛠 Technologies Used

- Java  
- Java Swing  
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

```text
Spam-Email-Detector/
│
├── Main.java
├── SpamGUI.java
├── SpamDetector.java
└── README.md
```

---

## 📌 How It Works

The system analyzes the input text and checks for suspicious keywords such as:

- free
- win
- money
- lottery
- offer
- click
- urgent
- bonus

If multiple spam-related keywords are detected, the message is classified as:

**SPAM ❌**

Otherwise:

**NOT SPAM ✅**

---

## 🔄 Workflow

```text
User Input
   ↓
GUI Interface
   ↓
Spam Detection Logic
   ↓
Classification Result
```

---

## ▶️ How to Run

### Step 1
Compile all Java files:

```bash
javac *.java
```

### Step 2
Run the project:

```bash
java Main
```

---

## 💡 Example

### Input:
```text
Win free money now! Limited offer.
```

### Output:
```text
SPAM ❌
```

---

### Input:
```text
Project meeting tomorrow at 10 AM.
```

### Output:
```text
NOT SPAM ✅
```

---

## 🎯 Learning Outcomes

Through this project, I learned:

- Java GUI development using Java Swing  
- Event handling  
- Text processing  
- Object-oriented design  
- Basic spam classification techniques  

---

## 🔮 Future Enhancements

- Machine learning-based classification  
- CSV/email dataset integration  
- Spam probability score  
- Email file upload support  
- Database integration  

---

## 👩‍💻 Author

MEGHA VERMA

