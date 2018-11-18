package com.soft1841;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MailController implements Initializable {
    @FXML
    private FlowPane studentListView;
    @FXML
    private ComboBox<String> genderComboBox;
    @FXML
    private TextField keywordsField;
    MailList[] students = new MailList[]{
            new MailList("姚思佳", "姚思佳.jpg", "女", "18801582811", "汉", "347", "1802343336", "浙江丽水"),
            new MailList("刘恋", "刘恋.jpg", "女", "18386294658", "回", "347", "1802343336", "贵州毕节"),
            new MailList("亢悦昕", "亢月昕.jpg", "女", "18805160378", "汉", "347", "1802343330", "山西忻州"),
            new MailList("黄屏", "黄屏.jpg", "女", "13207779643", "汉", "347", "1802343329", "广西钦州"),
            new MailList("朝鲁蒙", "朝鲁蒙.jpg", "女", "15292778391", "蒙古族", "347", "1802343235", "新疆伊犁"),
            new MailList("孟妮", "梦妮.jpg", "女", "12855562248", "汉", "346", "1802343332", "安微宿州"),
            new MailList("王欢乐", "王欢乐.jpg", "女", "18805162678", "汉", "346", "1802343334", "甘肃平凉"),
            new MailList("林斌涛", "林斌涛.jpg", "男", "18851853611", "汉", "116", "1802343312", "浙江温州"),
            new MailList("杨俣涛", "杨俣涛.jpg", "男", "18852050969", "汉", "113", "1802343322", "江苏苏州"),
            new MailList("蔡一帆", "蔡一帆.jpg", "男", "19825088721", "汉", "114", "1802343302", "江苏南通"),
            new MailList("李启鹏", "liqipeng.jpg", "男", "17384592163", "汉", "116", "1802343310", "江苏连云港"),
            new MailList("王龙傲", "王龙傲.jpg", "男", "15152089434", "汉", "113", "1802343316", "江苏徐州"),
            new MailList("田震", "tianzhen.jpg", "男", "19850099292", "汉", "113", "1802343315", "山西吕梁"),
            new MailList("徐鹏", "xupeng.jpg", "男", "13485099125", "汉", "113", "1802343318", "江苏宿迁"),
            new MailList("位哲武", "weizhewu.jpg", "男", "13013947768", "汉", "115", "1802343317", "江苏徐州"),
            new MailList("周国庆", "zhouguoqing.jpg", "男", "13988889999", "汉", "113", "1802343328", "江苏徐州"),
            new MailList("杨苏祥", "yangsuxiang.jpg", "男", "15178114095", "汉", "114", "1802343321", "安徽阜阳"),
            new MailList("郭瑞昌", "guoruichang.jpg", "男", "18851853897", "汉", "114", "1802343306", "山西临汾"),
            new MailList("陈宇航", "chenyuhang.jpg", "男", "18851697959", "汉", "114", "1802343303", "江苏常州"),
            new MailList("白建坤", "baijiankun.jpg", "男", "15162220791", "汉", "113", "1802343301", "江苏徐州")
    };
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //初始化性别下拉框
        genderComboBox.getItems().setAll("男", "女", "114", "347", "112", "113", "115", "116", "346");
        //初始化学生数据
        for (MailList s : students
        ) {
            VBox vBox = new VBox();
            vBox.setSpacing(20);
            Image image = new Image("/img/" + s.getAvatar());
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(80);
            imageView.setFitWidth(80);
            vBox.getChildren().add(imageView);
            Label labelName = new Label("姓名：" + s.getName());
            vBox.getChildren().add(labelName);
            String hiddenPhone =
                    s.getPhoneNumber().replaceAll("(\\d{3})\\d{4}(\\d{4})",
                            "$1****$2");
            vBox.setOnMouseClicked(event -> {
                Stage stage = new Stage();
                BorderPane borderPane = new BorderPane();
                VBox vBox2 = new VBox();
                vBox2.setPadding(new Insets(20,0,0,30));
                vBox2.setSpacing(40);
                Image image1 = new Image("/img/" + s.getAvatar());
                ImageView imageView1 = new ImageView(image1);
                imageView1.setFitHeight(80);
                imageView1.setFitWidth(80);
                vBox2.getChildren().add(imageView1);
                Label labelName1 = new Label("姓名：" + s.getName());
                vBox2.getChildren().add(labelName1);
                Label labelGende1 = new Label("性别：" + s.getGender());
                vBox2.getChildren().add(labelGende1);
                String hiddenPhone1 =
                        s.getPhoneNumber().replaceAll("(\\d{3})\\d{4}(\\d{4})",
                                "$1****$2");
                Label labelNumber1 = new Label("手机号：" + hiddenPhone1);
                vBox2.getChildren().add(labelNumber1);
                Label labelNation1 = new Label("民族：" + s.getNation());
                vBox2.getChildren().add(labelNation1);
                Label labelDormitory1 = new Label("宿舍号：" + s.getDormitoryId());
                vBox2.getChildren().add(labelDormitory1);
                Label labelStudentId1 = new Label("学号：" + s.getStudentId());
                vBox2.getChildren().add(labelStudentId1);
                Label labelAddress1 = new Label("家庭住址:" + s.getHomeAddress());
                vBox2.getChildren().add(labelAddress1);
                borderPane.setCenter(vBox2);
                Scene scene = new Scene(borderPane,400,500);
                scene.getStylesheets().add(MailApp.class.getResource("/css/style1.css").toExternalForm());
                stage.setTitle(s.getName()+"-个人资料");
                stage.setScene(scene);
                stage.show();
            });
            studentListView.getChildren().add(vBox);
        }
        genderComboBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                searchSex(newValue);
            }
        });
    }
    public void searchSex(String keywords) {
        ObservableList<Node> list = studentListView.getChildren();
        studentListView.getChildren().removeAll(list);
        for (MailList student : students
        ) {
            VBox vBox = new VBox();
            vBox.setSpacing(20);
            Image image = new Image("/img/" + student.getAvatar());
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(80);
            imageView.setFitWidth(80);
            vBox.getChildren().add(imageView);
            Label labelName = new Label("姓名：" + student.getName());
            vBox.getChildren().add(labelName);
            String hiddenPhone =
                    student.getPhoneNumber().replaceAll("(\\d{3})\\d{4}(\\d{4})",
                            "$1****$2");
            vBox.setOnMouseClicked(event -> {
                Stage stage = new Stage();
                BorderPane borderPane = new BorderPane();
                VBox vBox2 = new VBox();
                vBox2.setPadding(new Insets(20,0,0,30));
                vBox2.setSpacing(40);
                Image image1 = new Image("/img/" + student.getAvatar());
                ImageView imageView1 = new ImageView(image1);
                imageView1.setFitHeight(80);
                imageView1.setFitWidth(80);
                vBox2.getChildren().add(imageView1);
                Label labelName1 = new Label("姓名：" + student.getName());
                vBox2.getChildren().add(labelName1);
                Label labelGende1 = new Label("性别：" + student.getGender());
                vBox2.getChildren().add(labelGende1);
                String hiddenPhone1 =
                        student.getPhoneNumber().replaceAll("(\\d{3})\\d{4}(\\d{4})",
                                "$1****$2");
                Label labelNumber1 = new Label("手机号：" + hiddenPhone1);
                vBox2.getChildren().add(labelNumber1);
                Label labelNation1 = new Label("民族：" + student.getNation());
                vBox2.getChildren().add(labelNation1);
                Label labelDormitory1 = new Label("宿舍号：" + student.getDormitoryId());
                vBox2.getChildren().add(labelDormitory1);
                Label labelStudentId1 = new Label("学号：" + student.getStudentId());
                vBox2.getChildren().add(labelStudentId1);
                Label labelAddress1 = new Label("家庭住址:" + student.getHomeAddress());
                vBox2.getChildren().add(labelAddress1);
                borderPane.setCenter(vBox2);
                Scene scene = new Scene(borderPane,400,500);
                scene.getStylesheets().add(MailApp.class.getResource("/css/style1.css").toExternalForm());
                stage.setTitle(student.getName()+"-个人资料");
                stage.setScene(scene);
                stage.show();
            });
            if (student.getGender().contains(keywords)) {
                studentListView.getChildren().add(vBox);
            }
            if (student.getDormitoryId().contains(keywords)) {
                studentListView.getChildren().add(vBox);
            }

        }
    }
    public void enter() {
        keywordsField.setText("");
    }
    public void searchByKeywords() {
        ObservableList<Node> list = studentListView.getChildren();
        studentListView.getChildren().removeAll(list);
        //获取文本框输入的关键词，并去除无用空格
        String keywords = keywordsField.getText().trim();
        //遍历students数组，并将符合条件的学生数据加入ListView中
        for (MailList student : students) {
            VBox vBox = new VBox();
            vBox.setSpacing(20);
            Image image = new Image("/img/" + student.getAvatar());
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(80);
            imageView.setFitWidth(80);
            vBox.getChildren().add(imageView);
            Label labelName = new Label("姓名：" + student.getName());
            vBox.getChildren().add(labelName);
            String hiddenPhone =
                    student.getPhoneNumber().replaceAll("(\\d{3})\\d{4}(\\d{4})",
                            "$1****$2");
            vBox.setOnMouseClicked(event -> {
                Stage stage = new Stage();
                BorderPane borderPane = new BorderPane();
                VBox vBox2 = new VBox();
                vBox2.setPadding(new Insets(20,0,0,30));
                vBox2.setSpacing(40);
                Image image1 = new Image("/img/" + student.getAvatar());
                ImageView imageView1 = new ImageView(image1);
                imageView1.setFitHeight(80);
                imageView1.setFitWidth(80);
                vBox2.getChildren().add(imageView1);
                Label labelName1 = new Label("姓名：" + student.getName());
                vBox2.getChildren().add(labelName1);
                Label labelGende1 = new Label("性别：" + student.getGender());
                vBox2.getChildren().add(labelGende1);
                String hiddenPhone1 =
                        student.getPhoneNumber().replaceAll("(\\d{3})\\d{4}(\\d{4})",
                                "$1****$2");
                Label labelNumber1 = new Label("手机号：" + hiddenPhone1);
                vBox2.getChildren().add(labelNumber1);
                Label labelNation1 = new Label("民族：" + student.getNation());
                vBox2.getChildren().add(labelNation1);
                Label labelDormitory1 = new Label("宿舍号：" + student.getDormitoryId());
                vBox2.getChildren().add(labelDormitory1);
                Label labelStudentId1 = new Label("学号：" + student.getStudentId());
                vBox2.getChildren().add(labelStudentId1);
                Label labelAddress1 = new Label("家庭住址:" + student.getHomeAddress());
                vBox2.getChildren().add(labelAddress1);
                borderPane.setCenter(vBox2);
                Scene scene = new Scene(borderPane,400,500);
                scene.getStylesheets().add(MailApp.class.getResource("/css/style1.css").toExternalForm());
                stage.setTitle(student.getName()+"-个人资料");
                stage.setScene(scene);
                stage.show();
            });
            if (student.getHomeAddress().contains(keywords)) {
                studentListView.getChildren().add(vBox);
            }
            if (student.getName().contains(keywords)) {
                studentListView.getChildren().add(vBox);
            }
        }
    }

}
