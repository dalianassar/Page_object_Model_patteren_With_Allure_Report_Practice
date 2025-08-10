# Selenium Automation Framework with Bot, Fluent, and Factory Patterns + Allure Reporting

## 📌 Overview
This project is a **Java Selenium Automation Framework** designed with clean, maintainable, and scalable architecture.  
It implements **Bot Pattern**, **Fluent Pattern**, and **Factory Pattern** to ensure **readability**, **reusability**, and **easy maintenance**.  
Additionally, it integrates **Allure Reports** to provide **detailed, interactive test execution reports** with screenshots, logs, and step details.

---

## 🏗 Project Architecture

src ├── main │ ├── java │ │ ├── core # WebDriver setup & configuration │ │ ├── factory # Factory Pattern implementation for browser drivers │ │ ├── pages # Page Objects with Fluent Pattern │ │ ├── bot # Bot Pattern classes for user interactions │ │ └── utils # Helper utilities (read config, capture screenshots, etc.) │ └── resources # Config files └── test ├── java # Test classes └── resources # Test data

---

## 🧩 Design Patterns Used

### 1️⃣ Bot Pattern
- Encapsulates user actions into a single **Bot class**.
- Allows chaining methods to simulate user workflows.
- Example:
```java
LoginBot loginBot = new LoginBot(driver);
loginBot
    .enterUsername("admin")
    .enterPassword("password123")
    .clickLogin();

2️⃣ Fluent Pattern

Makes Page Object methods chainable for better readability.

Example:


homePage
    .navigateToProfile()
    .updateProfileInfo("New Name", "new@email.com")
    .saveChanges();

3️⃣ Factory Pattern

Creates WebDriver instances dynamically based on configuration.

Example:


WebDriver driver = DriverFactory.getDriver("chrome");


---

📊 Allure Reporting Integration

This project is integrated with Allure Reports for:

Test execution timeline

Step-by-step logs

Screenshots on failure

Test history and trends


How to Generate Reports:

1. Run the tests:



mvn clean test

2. Generate Allure report:



allure serve target/allure-results


---

⚙️ Tech Stack

Java 17

Selenium WebDriver

TestNG

Allure Report

Maven

Design Patterns: Bot, Fluent, Factory



---

🚀 How to Run

1. Clone the repository:



git clone https://github.com/dalianassar/Page_object_Model_patteren_With_Allure_Report_Practice.git

2. Navigate to the project:



cd selenium-patterns-allure

3. Run tests:



mvn clean test

4. Generate Allure report:



allure serve target/allure-results


---

📷 Example Allure Report




---

📝 Future Improvements

Add parallel execution with TestNG

Integrate Docker Selenium Grid

Add API testing module



---

👩‍💻 Author
Dalia Nassar

Dalia Nassar – Senior QC Engineer
LinkedIn | GitHub
