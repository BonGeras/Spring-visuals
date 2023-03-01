package com.example.spring_visuals;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringVisualsApplication extends Application {

    public static String[] args;

    public static void main(String[] args) {
        SpringVisualsApplication.args = args;
        Application.launch(SpringVisualsApplication.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image loadingAnimation = new Image(getClass().getResourceAsStream("F:/loading-gif"));
        ImageView imageView = new ImageView();
        imageView.setImage(loadingAnimation);
        Group root = new Group(imageView);
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX with Spring demo");
        primaryStage.setScene(scene);
        primaryStage.show();

        new Thread(() -> {
            new SpringApplicationBuilder(SpringVisualsApplication.class).run(args);
        }, "Spring Thread").start();
    }
}
