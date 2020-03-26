# database

Contains the [Flyway](https://flywaydb.org/) database migration files that define and
create the database schema. 

This project uses the [jOOQ](https://www.jooq.org/) code generator for database
access code and the [jOOQ Gradle plugin](https://github.com/etiennestuder/gradle-jooq-plugin)
to configure and run the generator.

The database access code generated by jOOQ is in `src/main/java/projektor/database/generated`

After adding a new database migration file, run the jOOQ code generator to update the
generated code:

`../gradlew generateJooq`