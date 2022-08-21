package GUI.chess;

import javax.swing.*;
import java.awt.*;

class Board extends JPanel {

    private int xCoord = 0;
    private int yCoord = 0;

    //μέθοδος που θέτει συντεταγμένες στο 'πιόνι' που θα σχεδιαστεί
    public void setXYCoordinates(int x, int y) {
        xCoord = x;
        yCoord = y;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int sqSize1 = this.getWidth() / 8;
        int sqSize2 = this.getHeight() / 8;

        int sqSize = sqSize1;
        if (sqSize2 < sqSize1)
            sqSize = sqSize2;

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                int x = j * sqSize;
                int y = i * sqSize;

                if ((i + j) % 2 != 0) {
                    g.setColor(Color.BLUE);
                    g.fillRect(x, y, sqSize, sqSize);
                } else {
                    g.setColor(Color.RED);
                    g.fillRect(x, y, sqSize, sqSize);
                }
            }
        }

        //σχεδίαση πιονιού
        //προκειται για οβάλ (κύκλος) που σχεδιάζεται εντός ορθογωνίου (τετραγώνου)
        g.setColor(Color.GREEN);
        g.fillOval(xCoord - sqSize / 2, yCoord - sqSize / 2, sqSize, sqSize);
        //η μετατόπιση κατά sqSize/2 γινεται ώστε το κλίκ να αντιστοιχεί στο κέντρο του κύκλου

    }


}