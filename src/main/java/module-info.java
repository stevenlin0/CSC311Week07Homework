module org.example.javafxdb_sql_shellcode {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.javafxdb_sql_shellcode to javafx.fxml;
    exports org.example.javafxdb_sql_shellcode;
    exports org.example.javafxdb_sql_shellcode.models;
    opens org.example.javafxdb_sql_shellcode.models to javafx.fxml;
}