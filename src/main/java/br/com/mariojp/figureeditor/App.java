package br.com.mariojp.figureeditor;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}

            JFrame frame = new JFrame("Figure Editor — Clique para inserir figuras");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());


            DrawingPanel panel = new DrawingPanel(new CircleFactory());
            frame.add(panel, BorderLayout.CENTER);

            JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            JButton circleBtn = new JButton("Círculo");
            JButton rectBtn = new JButton("Retângulo");

            circleBtn.addActionListener(e -> panel.setFactory(new CircleFactory()));
            rectBtn.addActionListener(e -> panel.setFactory(new RectangleFactory()));

            buttonPanel.add(circleBtn);
            buttonPanel.add(rectBtn);

            frame.add(buttonPanel, BorderLayout.NORTH);

            frame.setSize(900, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
