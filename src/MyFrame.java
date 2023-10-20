import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

//    Calendar calendar;
    SimpleDateFormat timeFormate;
    SimpleDateFormat dayFormate;
    SimpleDateFormat dateFormate;

    JLabel timeLable;
    JLabel dayLable;
    JLabel dateLable;

    String time;
    String day;
    String date;
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this .setTitle("Digital Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
//        this.setResizable(false);

        timeFormate = new SimpleDateFormat("hh:mm:ss a");
        dayFormate = new SimpleDateFormat("EEEE");
        dateFormate = new SimpleDateFormat("dd MMMM , yyyy");

        timeLable = new JLabel();
        timeLable.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLable.setForeground(new Color(0x00FF00));
        timeLable.setBackground(Color.black);
        timeLable.setOpaque(true);

        dayLable = new JLabel();
        dayLable.setFont(new Font("Ink Free",Font.PLAIN,38));

        dateLable = new JLabel();
        dateLable.setFont(new Font("Ink Free",Font.PLAIN,30));

        this.add(timeLable) ;
        this.add(dayLable);
        this.add(dateLable);
        this.setVisible(true);
        setTime();
    }

    public void setTime()
    {
        while (true)
        {
            time = timeFormate.format(Calendar.getInstance().getTime());
            timeLable.setText(time);
            day = dayFormate.format(Calendar.getInstance().getTime());
            dayLable.setText(day);
            date = dateFormate.format(Calendar.getInstance().getTime());
            dateLable.setText(date);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }




    }

}
