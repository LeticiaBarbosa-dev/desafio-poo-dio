module dio.digitalinnovationone.desafiopoodio {
    requires javafx.controls;
    requires javafx.fxml;


    opens dio.digitalinnovationone.dominio to javafx.fxml;
    exports dio.digitalinnovationone.dominio;
}