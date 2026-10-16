# Java-Course

My Java coursework: object-oriented programming exercises and small projects, kept here as a record of a second language I use to understand how concepts outlive the syntax.

Java was my first look at strict static typing, classes and object modelling — everything I write in TypeScript now is easier because of it.

---

## 📁 What's in this repository

| Path | Contents |
| :--- | :--- |
| `src/Chopter_07/Challenge/` | OOP challenges — e.g. a `BankAccount` class and a `Customer` model, each with a `Main` runner |
| `src/Chopter_07/Projectes/` | Small projects — e.g. a `SimpleCalculator` and a `Person` class, with the exercise briefs (`Ex_*.md`) |
| `src/Rebild/` | Revised copies of earlier chapter exercises, re-solved from scratch to check what stuck |

Every exercise is a self-contained pair of files: the model/class and a `Main` that demonstrates it.

---

## 🛠️ Technologies
- **Language:** Java
- **IDE:** IntelliJ IDEA (`.idea/` and the `.iml` module file are committed)

---

## 🚀 Running an Exercise

```bash
git clone https://github.com/EslamAyman-wab/Java-Course.git
cd Java-Course

# compile and run any exercise that has a Main class
javac src/Chopter_07/Challenge/Ch_01/*.java -d out
java -cp out Main
```

Requires a JDK (17+ works). In IntelliJ IDEA, open the project and run the `Main` class directly.
