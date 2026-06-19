🔐 Random Password Generator (Java)

A simple and secure Random Password Generator built in Java that creates strong passwords using a combination of uppercase letters, lowercase letters, numbers, and special characters. The user can specify the desired password length, and the program ensures that every generated password contains at least one character from each category.

📌 Features
🔑 Generates strong random passwords
🔠 Includes uppercase letters (A-Z)
🔡 Includes lowercase letters (a-z)
🔢 Includes numbers (0-9)
🎭 Includes special characters (!@#$%^&*)
📏 Custom password length support
✅ Minimum password length enforcement (8 characters)
🔀 Password shuffling for better randomness
🖥️ Simple console-based interface
📂 Project Structure
Passwordgenerator.java
🚀 Getting Started
Prerequisites
Java JDK 8 or higher
VS Code, IntelliJ IDEA, Eclipse, or Command Prompt
Compile the Program
javac Passwordgenerator.java
Run the Program
java Passwordgenerator
🎮 How It Works
User enters the desired password length.
If the length is less than 8, the program automatically sets it to 8.
The program guarantees at least:
One uppercase letter
One lowercase letter
One digit
One special character
Remaining characters are randomly selected from all available character sets.
Password characters are shuffled for additional security.
The final password is displayed.
💻 Sample Output
=====================================
      Random Password Generator
=====================================
Enter desired password length (min 8): 12

-------------------------------------
Generated Password: A@7m#P2xQ!9b
Password Length   : 12
-------------------------------------
Your password contains:
  Uppercase letters, Lowercase letters
  Numbers, Special characters
=====================================
🛠 Technologies Used
Java
Random Class
Scanner Class
StringBuilder
Arrays and Character Manipulation
📚 Concepts Practiced
Random Number Generation
String Handling
User Input Processing
Loops
Arrays
Password Security Basics
Fisher-Yates Shuffle Algorithm
🔒 Password Security Features

✔ At least one uppercase letter

✔ At least one lowercase letter

✔ At least one number

✔ At least one special character

✔ Randomized character positions

✔ Custom password length

🎯 Learning Outcomes

This project helps beginners learn:

Working with random values in Java
Building secure passwords
Using StringBuilder efficiently
Character array manipulation
Implementing shuffling algorithms
Creating practical utility applications
🔮 Future Enhancements
Allow users to choose character types
Password strength meter
Copy password to clipboard
Save generated passwords to a file
GUI version using Java Swing
Generate multiple passwords at once
Exclude ambiguous characters (e.g., O, 0, l, I)
