package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

/*    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }*/
    ComboBox<String> cbTransport;
    Label response;
    public void start(Stage myStage)
    {
        myStage.setTitle("ComboBox Demo");
        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);
        Scene scene = new Scene(rootNode,300,300);
        myStage.setScene(scene);
        response = new Label();
        ObservableList<String> trasnportTypes= FXCollections.observableArrayList("Car","Train","Plane");
        cbTransport = new ComboBox<String>(trasnportTypes);
        cbTransport.setValue("Train");
        cbTransport.setEditable(true);
        response.setText("Selected Transport is : "+cbTransport.getValue());
        cbTransport.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Selected Transport is : "+ cbTransport.getValue());
            }
        });
        rootNode.getChildren().addAll(cbTransport,response);
        myStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
