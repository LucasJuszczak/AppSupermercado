module com.example.appsupermercado {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.appsupermercado to javafx.fxml;
    exports com.example.appsupermercado;
    exports com.example.appsupermercado.Controllers;
    opens com.example.appsupermercado.Controllers to javafx.fxml;
    exports com.example.appsupermercado.Janelas;
    opens com.example.appsupermercado.Janelas to javafx.fxml;
}