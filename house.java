public class house extends Frame {

    house(){
        this.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }
    public void paint(Graphics g)
    {
        g.setColor(Color.pink);
        g.drawRect(260,280,790,380);
        g.setColor(Color.blue);
        g.drawLine(260,280,370,180);
        g.drawLine(370,180,470,280);
        g.drawLine(370,180,1050,180);
        g.drawLine(1050,180,1050,280);
        g.drawLine(470,280,470,660);
        g.drawRect(550,510,90,150);


    }

    public static void main(String[] args) {
        house h=new house();
        h.setSize(1920,1900);
        h.setVisible(true);

    }
}
