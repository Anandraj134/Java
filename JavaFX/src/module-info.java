module JavaFX {
    requires javafx.fxml;
    requires javafx.controls;

    opens JavaFX_Prac;
    opens FXColorFontImage;
    opens FXEvents;
    opens FXShape;
    opens FXPane;
    opens OtherSamplePrograms;
}