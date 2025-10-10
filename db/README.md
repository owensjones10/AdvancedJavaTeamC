
# 🗃️ Team C – Preloaded Derby Database Setup
### Advanced Java Team Project – Fall 2025  
**Team Leader:** Owen Jones  

## 📦 Overview
This folder contains a **preloaded Apache Derby database** (`tpchdb.zip`) that includes all TPC-H tables and imported data:

| Table | Rows | Status |
|--------|------|---------|
| PART | 200,000 | ✅ |
| PARTSUPP | 800,000 | ✅ |
| CUSTOMER | 150,000 | ✅ |
| ORDERS | 1,500,000 | ✅ |

This lets each teammate quickly restore the database without re-importing `.tbl` files or running SQL scripts.

## 🧰 Requirements
- **Java SE 22+**
- **Apache Derby 10.14.x (JavaDB)**
- A terminal (macOS, Linux, or Windows PowerShell)

## ⚙️ Setup Instructions

### 1️⃣ Download and Extract the Database
Unzip the shared `tpchdb.zip` file into your Derby databases directory.

**macOS / Linux**
```bash
mkdir -p ~/DerbyDBs
unzip tpchdb.zip -d ~/DerbyDBs
```

**Windows (PowerShell)**
```powershell
mkdir "$env:USERPROFILE\DerbyDBs"
Expand-Archive -Path tpchdb.zip -DestinationPath "$env:USERPROFILE\DerbyDBs"
```

After extracting, you should have:
```
~/DerbyDBs/tpchdb/
 ┣ service.properties
 ┣ seg0/
 ┣ log/
 ┗ tmp/
```

### 2️⃣ Set Your Derby Environment Variables

**macOS / Linux**
```bash
export DERBY_HOME=/Users/$(whoami)/derby
export PATH=$PATH:$DERBY_HOME/bin
```

**Windows (PowerShell)**
```powershell
setx DERBY_HOME "C:\Users\%USERNAME%\derby"
setx PATH "%PATH%;%DERBY_HOME%\bin"
```

*(Replace the paths if your Derby installation is located elsewhere.)*

### 3️⃣ Start the Derby Network Server
Run:
```bash
java -cp "$DERBY_HOME/lib/derbynet.jar:$DERBY_HOME/lib/derby.jar" \
  org.apache.derby.drda.NetworkServerControl start \
  -noSecurityManager \
  -h 0.0.0.0 \
  -p 1527
```
**Windows (PowerShell)**
```powershell
java -cp "$env:DERBY_HOME\lib\derbynet.jar;$env:DERBY_HOME\lib\derby.jar" `
  org.apache.derby.drda.NetworkServerControl start `
  -noSecurityManager -h 0.0.0.0 -p 1527
```

✅ **Expected output:**
```
Apache Derby Network Server - 10.14.2.0 - started and ready to accept connections on port 1527
```
Leave this terminal open while working — it keeps the database running.

### 4️⃣ Verify the Database Works
Connect to it using `ij`:
```bash
java -jar "$DERBY_HOME/lib/derbyrun.jar" ij
```
At the prompt:
```sql
CONNECT 'jdbc:derby://localhost:1527/tpchdb;user=app;password=app';
SHOW TABLES;
```
✅ You should see:
```
APP | PART
APP | PARTSUPP
APP | CUSTOMER
APP | ORDERS
```

### 5️⃣ Run a Sample Query
```sql
SELECT * FROM PART FETCH FIRST 5 ROWS ONLY;
SELECT COUNT(*) FROM ORDERS;
```
You should see real TPC-H data and counts similar to:

| Table | Row Count |
|--------|------------|
| PART | 200,000 |
| PARTSUPP | 800,000 |
| CUSTOMER | 150,000 |
| ORDERS | 1,500,000 |

## ⚙️ JDBC Connection Info for JavaFX
Use this connection string in your Java code:
```java
String url = "jdbc:derby://localhost:1527/tpchdb";
String user = "app";
String password = "app";
Connection conn = DriverManager.getConnection(url, user, password);
```

## 🧠 Troubleshooting
| Issue | Fix |
|-------|-----|
| **"Unable to connect"** | Ensure the Derby server is running (`lsof -i :1527` on macOS/Linux or check logs). |
| **"Port already in use"** | Stop other Derby instances or specify a new port using `-p 1530`. |
| **"File not found"** | Confirm `tpchdb.zip` was extracted into `~/DerbyDBs/`, not a subfolder. |
| **Windows path issues** | Use double quotes around paths with spaces (e.g., `"C:\Program Files\..."`). |

## 📤 Verification
After setup, verify your counts match the reference:
```
PART:      200,000  
PARTSUPP:  800,000  
CUSTOMER:  150,000  
ORDERS:  1,500,000  
```
If all counts match, your setup is complete.

## 🧩 Notes
- Keep the Derby server running while testing your JavaFX GUI.
- Each teammate runs their own local copy — no need for shared network hosting.
- Do **not** modify table names or schema; your GUI code depends on these exact names.

**Team C | Advanced Java – EFSC Fall 2025**  
Maintained by **Owen Jones**
