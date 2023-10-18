module es.ieslosmontecillos.operacionesbasicasuicontroltableview {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.operacionesbasicasuicontroltableview to javafx.fxml;
    exports es.ieslosmontecillos.operacionesbasicasuicontroltableview;
}