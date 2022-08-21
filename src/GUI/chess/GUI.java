package GUI.chess;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class GUI extends JFrame {

    private final Board board;

    public GUI() {

        board = new Board();
        this.setContentPane(board);

        //Ακροατής σε συμβάντα τύπου 'κλικ' στο ποντίκι
        //MouseClickListener listener = new MouseClickListener();
        //board.addMouseListener(listener);

        //Ακροατής σε συμβάντα τύπου 'drag & drop' στο ποντίκι
        MouseMoveListener listener = new MouseMoveListener();
        board.addMouseMotionListener(listener);

        this.setVisible(true);
        this.setSize(400, 400);
    }

    class MouseClickListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent event) {

            int x = event.getX();
            int y = event.getY();
            board.setXYCoordinates(x, y);
            board.repaint();
        }

        @Override
        public void mouseEntered(MouseEvent arg0) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseExited(MouseEvent arg0) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mousePressed(MouseEvent arg0) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseReleased(MouseEvent arg0) {
            // TODO Auto-generated method stub

        }

    }

    class MouseMoveListener implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent event) {
            int x = event.getX();
            int y = event.getY();
            board.setXYCoordinates(x, y);
            board.repaint();

        }

        @Override
        public void mouseMoved(MouseEvent arg0) {
            // TODO Auto-generated method stub

        }

    }


}


