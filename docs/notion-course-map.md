# Java Masterclass Repository Map

This repository is organized around the Notion databases:

- `Java Masterclass`: course sections and progress.
- `Java Masterclass - All Lectures`: individual lectures, exercises, and challenge checkpoints.

The codebase should stay as one Java source root under `src/`. IntelliJ, compiled classes, and other local tool files should not be committed.

## Source Areas

| Path | Purpose |
| --- | --- |
| `src/A_Course` | Main Java Masterclass work that follows the Notion course sections. |
| `src/A_Course/A_Challenges` | Course challenges, grouped by broad course stage. |
| `src/A_Course/B_Coding_Exercise` | Numbered coding exercises from the course. |
| `src/A_Course/Z_Legacy_Chapter_06` | Older standalone Chapter 06 project preserved inside the main source root. |
| `src/B_Exercises` | External practice sources, mainly CodingBat and W3resource. |
| `src/D_Test_Area` | Sandbox experiments and personal test code. Not part of the canonical course path. |

## Notion Sections

Active course sections from Notion:

| Section | Status | Repository Coverage |
| --- | --- | --- |
| 01 - Getting Started with Java Programming | Completed | Mostly notes/setup, no required repo code. |
| 02 - Java Development Environment Setup | Completed | Mostly setup, no required repo code. |
| 03 - First Steps in Java Programming | Completed | `src/A_Course/A_Challenges/A_Ch`, early `B_Coding_Exercise` files. |
| 04 - Transitioning from JShell to IntelliJ IDEA | Completed | Early challenge and IDE practice files. |
| 05 - Expressions, Statements, Code Blocks, Method Overloading | Completed | `src/A_Course/B_Coding_Exercise/A_Ex`, `B_Ex`, and some `C_Ex`. |
| 06 - Conditional Logic, Loops, Interactive Applications | Completed | `src/A_Course/A_Challenges/A_Ch`, later `B_Ex`, and `C_Ex`. |
| 07 - OOP: Classes & Inheritance | Working on | `src/A_Course/A_Challenges/B_Ch`, `src/A_Course/B_Coding_Exercise/D_Ex`. |
| 08 - Composition, Encapsulation, Polymorphism | Not started | `src/A_Course/B_Coding_Exercise/D_Ex`, `E_Ex`, and OOP challenge folders. |
| 09 - Arrays | Not started | `src/B_Exercises/A_CodingBat/B_Array`, `src/B_Exercises/B_W3resource/F_Array`. |
| 10 - Lists, Iterators, Autoboxing, Enums | Not started | `src/A_Course/B_Coding_Exercise/E_Ex`, external list practice when added. |
| 11 - Abstraction & Interfaces | Not started | `src/A_Course/A_Challenges/C_Ch/Ch_27`, `Ch_29`, and W3resource polymorphism practice. |
| 12 - Generics | Not started | Future `src/A_Course` work; use external practice only as reference. |
| 13 - Nested Classes | Not started | Future `src/A_Course` work. |
| 14 - Lambdas | Not started | Future `src/A_Course` work. |
| 15 - Collections | Not started | Future `src/A_Course` work; some external W3resource examples may support it. |
| 16 - Mutability, Immutability, Final | Not started | Future `src/A_Course` work. |
| 17 - Streams | Not started | Future `src/A_Course` work. |
| 18 - Java Core APIs | Not started | Future `src/A_Course` work. |
| 19 - Regular Expressions | Not started | Future `src/A_Course` work. |
| 20 - Java I/O | Not started | Future `src/A_Course` work. |
| 21 - Concurrency | Not started | Future `src/A_Course` work. |
| 22 - JDBC | Not started | Future `src/A_Course` work. |
| 23 - Networking | Not started | Future `src/A_Course` work. |
| 24 - Debugging and Testing | Not started | Future `src/A_Course` work plus real test framework setup. |
| 25 - JavaFX | Not started | Future UI project/module. |
| 26 - Java 9 Module System | Not started | Future modular Java work. |

Canceled or archived Notion sections should not drive new repository folders unless code already exists and is intentionally preserved as legacy.

## Lesson Inventory Summary

The `Java Masterclass - All Lectures` Notion database was read and grouped by its `Section` relation. This is the current lesson count by section:

| Section | Lessons | Repository Status |
| --- | ---: | --- |
| 01 - Getting Started with Java Programming | 8 | No code required; course introduction. |
| 02 - Java Development Environment Setup | 5 | No code required; setup notes. |
| 03 - First Steps in Java Programming | 13 | Covered by early Java basics and challenge files. |
| 04 - Transitioning from JShell to IntelliJ IDEA | 16 | Covered by early IntelliJ/basic syntax practice. |
| 05 - Expressions, Statements, Code Blocks, Method Overloading | 27 | Covered by `A_Ex`, `B_Ex`, and early `C_Ex`. |
| 06 - Conditional Logic, Loops, Interactive Applications | 37 | Covered by `A_Ch`, loop/control-flow exercises, and user-input practice. |
| 07 - OOP: Classes & Inheritance | 33 | Covered by `B_Ch` and `D_Ex` OOP exercises. |
| 08 - Composition, Encapsulation, Polymorphism | 20 | Some lessons are currently unlinked in Notion; related code appears in `D_Ex`, `E_Ex`, and `B_Ch`. |
| 09 - Arrays | 16 | Covered mostly by external practice under `B_Exercises`. |
| 10 - Lists, Iterators, Autoboxing, Enums | 21 | Partially covered by later `E_Ex`; more official course code can be added later. |
| 11 - Abstraction & Interfaces | 17 | Partially covered by `C_Ch/Ch_27`, `C_Ch/Ch_29`, and interface practice. |
| 12 - Generics | 12 | Future official course work. |
| 13 - Nested Classes | 9 | Future official course work. |
| 14 - Lambdas | 13 | Future official course work. |
| 15 - Collections | 29 | Future official course work; external practice may support it. |
| 16 - Mutability, Immutability, Final | 22 | Future official course work. |
| 17 - Streams | 20 | Future official course work. |
| 18 - Java Core APIs | 18 | Future official course work. |
| 19 - Regular Expressions | 10 | Future official course work. |
| 20 - Java I/O | 25 | Future official course work. |
| 21 - Concurrency | 30 | Future official course work. |
| 22 - JDBC | 30 | Future official course work. |
| 23 - Networking | 26 | Future official course work. |
| 24 - Debugging and Testing | 11 | Future official tests should use a real test source root. |
| 25 - JavaFX | 47 | Future UI project/module. |
| 26 - Java 9 Module System | 3 | Future modular Java work. |
| 27 - Migrating Existing Java Projects to Java 9 and the Module System | 7 | Canceled in the section database; do not create new folders unless preserving old work. |
| 45 - Extra Information - Source code, and other stuff | 2 | Reference-only material. |

Notion data checks:

| Finding | Meaning |
| --- | --- |
| 20 lecture rows have no `Section` relation. | These appear to belong to section 08, Composition/Encapsulation/Polymorphism, and should be linked in Notion before using them as canonical repo targets. |
| 33 lecture rows are related to both section 07 and section 08. | This overlap is expected around the OOP transition, but it should be treated carefully when mapping files. |
| Several canceled/archived sections still have lecture rows. | Keep them out of the main source structure unless they preserve existing legacy code. |

## Current GitHub Repository Match

| GitHub Path | Best Notion Match | Notes |
| --- | --- | --- |
| `src/A_Course/A_Challenges/A_Ch` | Sections 03-06 | Basic syntax, expressions, conditionals, loops, and early challenge work. |
| `src/A_Course/A_Challenges/B_Ch` | Sections 07-08 | OOP class design, inheritance, composition, encapsulation, polymorphism, and master challenges. |
| `src/A_Course/A_Challenges/C_Ch` | Sections 10-11 | Later OOP, abstraction, interfaces, generics-adjacent practice, and collection-style exercises. |
| `src/A_Course/B_Coding_Exercise/A_Ex` | Section 05 | Early coding exercises. |
| `src/A_Course/B_Coding_Exercise/B_Ex` | Sections 05-06 | Intermediate control-flow and loop exercises. |
| `src/A_Course/B_Coding_Exercise/C_Ex` | Sections 06-07 | Transition from control flow into OOP basics. |
| `src/A_Course/B_Coding_Exercise/D_Ex` | Sections 07-08 | Multi-class OOP exercises such as calculator, person, wall, point, bedroom, inheritance, and printer. |
| `src/A_Course/B_Coding_Exercise/E_Ex` | Sections 08-11 | More advanced OOP/list/interface style exercises. |
| `src/A_Course/Z_Legacy_Chapter_06` | Legacy Section 07-style OOP work | Preserved from the old standalone `Chapter_06` IntelliJ project. |
| `src/B_Exercises/A_CodingBat` | External practice for Sections 06 and 09 | Warmup and array practice, not official Java Masterclass structure. |
| `src/B_Exercises/B_W3resource` | External practice for Sections 07-11 | Constructor, polymorphism, and array practice, not official Java Masterclass structure. |
| `src/D_Test_Area` | Sandbox | Manual experiments; not formal tests and not canonical course structure. |

## Tests And Practice

The current repository does not contain automated unit tests. The existing "test" areas are manual experiments:

| Path | Type | Keep As |
| --- | --- | --- |
| `src/D_Test_Area` | Manual sandbox / experiments | Sandbox only. |
| `src/B_Exercises/A_CodingBat` | External practice problems | Practice library. |
| `src/B_Exercises/B_W3resource` | External practice problems | Practice library. |

When formal tests are added, use a dedicated test source root such as `test/` or a standard Maven/Gradle layout instead of mixing automated tests into `D_Test_Area`.

## Rules For New Work

1. Put official Java Masterclass code under `src/A_Course`.
2. Put external site practice under `src/B_Exercises`.
3. Put throwaway experiments under `src/D_Test_Area`.
4. Do not commit `.idea`, `*.iml`, `*.class`, `out/`, or local scratch files.
5. Keep package declarations aligned with folder paths.
