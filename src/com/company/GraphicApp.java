package com.company;
import javax.swing.*;
import java.awt.*;

    public class GraphicApp {
        private JFrame frame;
        private GraphicPanel graphicPanel;

        public GraphicApp() {
            createFrame();
        }

        private void createFrame() {
            frame = new JFrame("Графическое приложение");
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

        public void show() {
            frame.setVisible(true);
        }

        private void coordinatePlane() {
            graphicPanel = new GraphicPanel();
        }
    }
