# ✅ Quick Start Summary
Clone or unzip the project and change the hardcoded file location in load.sql to yours and then run these commands:
```bash
# Start the Derby database
/opt/homebrew/Cellar/derby/10.17.1.0/bin/startNetworkServer

# launch the app
mvn javafx:run
```

---

## 🧩 Responsibilities
| Member | Assigned Table | Status |
|---------|----------------|--------|
| Owen Jones | Integration/Main UI | ✅ Done | 
| Ben Kosin | Orders table | ✅ Done |  
| Brooks Ward | Part Table | ✅ Done |  
| Isabel Martinez | Customer table | ✅ Done |  
| Ajani Wilson | PartSupp | ✅ Done |  

---

# 🧠 Advanced Java Team C — TPC-H Database Application

This project is a **JavaFX + Apache Derby** database application built for the *Advanced Java (COP2805)* course.  
It demonstrates reading and inserting data into tables (`Customer`, `Part`, etc.) from the **TPC-H** benchmark schema.

---

## 📦 Project Overview

This application connects to a **JavaDB (Apache Derby)** database named `tpchdb` and provides a JavaFX interface to view and insert records.

The project is modular and uses **Maven** for dependency management.  
Each contributor has their code organized under their own package.

```yaml
---

## 🚀 Features

- JavaFX user interface with buttons to open individual table windows  
- `Customer` and `Part` table viewers with live data from the Derby database  
- Insert dialogs for adding new records  
- Modular Maven setup for easy dependency management and expansion  

---

## ⚙️ Prerequisites

Make sure you have the following installed:

| Tool | Version | Check Command |
|------|----------|----------------|
| Java JDK | 22 or newer | `java -version` |
| Maven | 3.8 or newer | `mvn -version` |
| Apache Derby | (included with JDK or downloadable) | `echo $DERBY_HOME` |

---

## 🏗️ Database Setup (JavaDB / Apache Derby)

Before running the app, you must start the Derby network server and create the database.
```

### macOS / Linux (bash)
```bash
# 1. Start the Derby server
java -jar "$DERBY_HOME/lib/derbyrun.jar" server start &

# 2. Open ij tool
java -jar "$DERBY_HOME/lib/derbyrun.jar" ij

# 3. Inside ij, run the following:
CONNECT 'jdbc:derby://localhost:1527/tpchdb;create=true;user=app;password=app';

# 4. Create tables
RUN 'db/schema.sql';

# 5. Load data
RUN 'db/load.sql';

# 6. Exit ij
exit;
```

```powershell
Windows (Command Prompt)
REM 1. Start the Derby server
java -jar "%DERBY_HOME%\lib\derbyrun.jar" server start

REM 2. Open ij tool
java -jar "%DERBY_HOME%\lib\derbyrun.jar" ij

REM 3. Inside ij, run the following:
CONNECT 'jdbc:derby://localhost:1527/tpchdb;create=true;user=app;password=app';

REM 4. Create tables
RUN 'db/schema.sql';

REM 5. Load data
RUN 'db/load.sql';

REM 6. Exit ij
exit;
```

# 🧰 Building and Running the Application

## 🧱 Compile the project

```bash
mvn clean compile
```
## ▶️ Run the JavaFX application
```bash
mvn javafx:run
```

## 🧭 Application Navigation

When launched, the Main Menu window appears:

View Customers → Opens the Customer table viewer

View Parts → Opens the Part table viewer

Each table window supports viewing existing records and inserting new ones.

## 🧩 Technologies Used

JavaFX 23 — GUI framework

Apache Derby (JavaDB) — Database engine

Maven — Build and dependency management

Java 22 — Core language and modules

## 📁 Repository Layout

```
AdvancedJavaTeamC/
├── db/
│   ├── schema.sql        # Creates all tables
│   ├── load.sql          # Loads data from .tbl files
│   └── tpch_data/        # Dataset files (.tbl)
├── src/
│   └── main/java/edu/easternflorida/
│       ├── joneso/       # Main menu (MainMenu.java)
│       ├── martinezi/    # Customer TableView app
│       └── wardb/        # Part TableView app
├── pom.xml               # Maven project descriptor
└── README.md             # Project documentation
```