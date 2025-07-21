# 🔐 LoginTestSelenium (Java + Selenium)

Automated login testing using **Selenium WebDriver** with **Java** in **Eclipse IDE**.

This project demonstrates how to automate a web login form using Selenium WebDriver with JUnit.

---

## 📂 Project Structure

LoginTestSelenium/

├── .classpath
|
├── .project
|
├── chromedriver.exe
|
├── bin/
| |
│ └── test/
| |
│ └── LoginTest.class
|
├── src/
| |
│ └── test/
| |
│ └── LoginTest.java
|
└── README.md


---

## 🚀 Features

- Automates login form interaction using Selenium.
- Opens Chrome browser, enters email & password, submits the form.
- Configurable via `chromedriver.exe` path and browser version.

---

## 🛠️ Prerequisites

- Java JDK (8 or later)
- Eclipse IDE or IntelliJ IDEA
- Chrome browser installed
- Download [ChromeDriver](https://sites.google.com/chromium.org/driver/) that matches your Chrome version
- Selenium Java Client Libraries (add `.jar` files to your project)

---

## 📦 Setup Instructions

### 1. Clone the Repository

```bash

git clone https://github.com/Dhamotharan-K-84/LoginTestSelenium.git

```

### 2. Set Up in Eclipse
```

Open Eclipse

Go to File → Import → Existing Projects into Workspace

Select the LoginTestSelenium folder

Right-click on the project → Build Path → Configure Build Path → Add External JARs

Add Selenium JARs (from selenium-java-X.X.X.zip/lib)

```
### 3. Place chromedriver.exe
```

Place chromedriver.exe in the project root folder or

Set system property in code:

System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

```
### 🧪 Run the Test
```

Open LoginTest.java in src/test/

Right-click → Run As → JUnit Test
```