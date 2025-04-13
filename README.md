# ☕ Yahoo Login Automation (Java + Selenium)

This project demonstrates a Page Object Model (POM) framework to automate the login functionality of Yahoo using **Java**, **Selenium WebDriver**, and **TestNG**.

It follows best practices in test automation by separating test logic from UI interactions using reusable Page classes.

---

## 📂 Project Structure

```
src/
├── main/
│   └── java/
│       └── com/Yahoo/Pages/         # Page Objects
├── test/
    └── java/
        └── com/Yahoo/Testcases/     # Test Classes
```

---

## 🛠 Tools & Technologies

- Java 8+
- Selenium WebDriver
- TestNG
- Maven
- ChromeDriver

---

## ▶️ How to Run

1. Clone the repo:
```bash
git clone https://github.com/rrefaat/YahooLoginAutomation.git
```

2. Import it as a Maven Project into IntelliJ / Eclipse

3. Install dependencies using Maven:
```bash
mvn clean install
```

4. Run the test class:
- `UserLogin.java` contains 3 test cases:
  - Successful login with username only
  - Login with full email
  - Login failure scenario

---

## ⚠️ Note

- Update credentials inside `UserLogin.java` before running.
- ChromeDriver path should be updated in `TestBase.java` or added to system `PATH`.

---

## 🙋‍♀️ Author

Rawan Refaat  
🔗 [LinkedIn Profile](https://www.linkedin.com/in/rawanrefaat/)
