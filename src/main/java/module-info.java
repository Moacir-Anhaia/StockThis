module br.unipar.stockthis {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens br.unipar.stockthis to javafx.fxml;
    exports br.unipar.stockthis;
    exports br.unipar.stockthis.Cadastro;
    opens br.unipar.stockthis.Cadastro to javafx.fxml;
    exports br.unipar.stockthis.Estoque;
    opens br.unipar.stockthis.Estoque to javafx.fxml;
    exports br.unipar.stockthis.BancoDeDados;
    opens br.unipar.stockthis.BancoDeDados to javafx.fxml;
}