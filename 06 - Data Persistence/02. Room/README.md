# Room for data persistence

Define your tables as data classes annotated with `@Entity`.

Define properties annotated with `@ColumnInfo` as columns in the tables.

Define a data access object (DAO) as an interface annotated with `@Dao`. The DAO maps Kotlin functions to database queries.

Use annotations to define

```kt
@Insert, @Delete, and @Update functions.
```

Use the `@Query` annotation with an SQLite query string as a parameter for any other queries.

Use Database Inspector to view the data saved in the Android SQLite database.
