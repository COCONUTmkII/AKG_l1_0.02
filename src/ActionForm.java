import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionForm  extends JPanel {

    BottomLine bottomLine;
    LeftLine leftLine;
    RightLine rightLine;
    TopLine topLine;

    Timer timer;

    int count = 0;
    boolean moovie=true;

    ActionForm(){
        setBackground(Color.WHITE);
        start();
        bottomLine = new BottomLine(50, 70, 100, 70);
        leftLine = new LeftLine(50, 70, 75, 20 );
        rightLine= new RightLine(100, 70, 75, 20);
        topLine = new TopLine(75, 20, 76, 20);
    }

    public void start() {

        timer = new Timer(250, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(moovie==true){
                    movee();
                }
               if(count==30){
                   moovie = false;
               }

               }
        });
        timer.start();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;

        graphics2D.draw(bottomLine);
        graphics2D.draw(leftLine);
        graphics2D.draw(rightLine);
        graphics2D.draw(topLine);

        Font f = new Font("Arial", Font.BOLD, 20);

        String s =  "" + count;
        g.setFont(f);
        g.drawString(s, 700, 50);




    }

    public void movee() {

            bottomLine.setX1(bottomLine.x1 + 20);
            bottomLine.setY1(bottomLine.y1 + 20);
            bottomLine.setX2(bottomLine.x2 + 20);
            bottomLine.setY2(bottomLine.y2 + 20);

            leftLine.setX1(leftLine.x1 + 20);
            leftLine.setY1(leftLine.y1 + 20);
            leftLine.setX2(leftLine.x2 + 20-0.8333333333);
            leftLine.setY2(leftLine.y2 + 20);

            rightLine.setX1(rightLine.x1+20);
            rightLine.setY1(rightLine.y1+20);
            rightLine.setX2(rightLine.x2+20+0.83333333339);
            rightLine.setY2(rightLine.y2+20);

            topLine.setX1(topLine.x1+20-0.77);
            topLine.setY1(topLine.y1+20);
            topLine.setX2(topLine.x2+20+0.77);
            topLine.setY2(topLine.y2+20);



            repaint();

        count++;
        System.out.println(count);

    }
}
