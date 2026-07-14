# Testing Notes

Current state:

- There is no automated test framework configured.
- `src/D_Test_Area` contains manual experiments and scratch programs.
- CodingBat and W3resource folders are practice solutions, not test suites.

Recommended next step for real tests:

1. Choose a build tool, preferably Maven or Gradle.
2. Add a dedicated test source root.
3. Use JUnit for automated checks.
4. Keep sandbox experiments separate from formal tests.

Until then, validate the repository by compiling all Java files:

```shell
rg --files -g "*.java" > sources.txt
javac -d out @sources.txt
```

`sources.txt`, `out/`, and compiled `.class` files are ignored by Git.
