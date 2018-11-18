package com.soft1841;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;

public class MailApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
            //加载布局文件
            URL location = getClass().getResource("/fxml/main.fxml");
            FXMLLoader fxmlLoader = new FXMLLoader(location);
            StackPane stackPane = fxmlLoader.load();
            //获取屏幕大小
            Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
            Scene scene = new Scene(stackPane,621,716);
            //添加样式
            scene.getStylesheets().addAll("org/kordamp/bootstrapfx/bootstrapfx.css",
                    "/css/style.css");
            //窗口标题
            primaryStage.setTitle("软件1841通讯录");
            //设置窗体的logo
            primaryStage.getIcons().add(new Image("/img/logo.png"));
            //舞台设置场景
            primaryStage.setScene(scene);
            //舞台可见
            primaryStage.show();
        }

    public static void main(String[] args) {
        launch(args);
    }
    }