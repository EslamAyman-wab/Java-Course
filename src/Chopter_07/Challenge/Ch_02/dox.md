# Coding Challenge: Constructors — Customer Class

---

## Customer Class

Create a new class called `Customer` with **three fields**:

- `name`
- `creditLimit`
- `email`

### Requirements

- [ ] Create **getter methods** for each field only. (No setters needed.)
- [ ] Create **three constructors** for this class:
    1. A constructor that takes **all three fields** as parameters and assigns them directly to the instance fields.
    2. A **no-args constructor** that calls another constructor, passing hardcoded literal values for each argument.
    3. A constructor with **only `name` and `email`** as parameters, which also calls another constructor.

---

## Notes

> **NOTE:** Test your solution by writing test code in the usual main class and main method.

> **NOTE:** A no-args (empty) constructor is **not** implicitly generated if you've already created another constructor in your class — you must create it manually if needed.

> **NOTE:** To call another constructor from within a constructor, use `this(...)` as the **first statement** in the constructor body.