package com.example.awtSample;//check in file explorer you will find folder awtSample inside example and that inside com which is further inside src folder

import java.awt.*;//AWT is abstract windows toolkit
//the star means to import all the classes,interfaces and static objects from java.awt class.
//also java.awt.event. is another package
//we could change that to java.awt.event.*
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//just copy the code its only for learning purposes

public class MyWindow extends Frame {

    public MyWindow(String title) throws HeadlessException {
        super(title);
        setSize(500, 200);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("Java is the best", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("-Tanmay Garg", 60, 100);

    }
}

//Now if you see the output its really good.
//But we had to write only few lines of code.
//Now this is the use of packages it is soo much powerful. Just think if this was not available we had to write all the code ourselves.
//writing a window manager,handling fonts and sizes all that stuff is now handled by the packages that we imported.
//we can see all these packages in java in external libraries at last in project window

//We can import the whole package by using * or import particular required bits. Both have their pros and cons.Its a debatable topic.
//But if you use import the whole package * , then you make a class with a name same as the one that you imported then java will give you error.
//You might think that is unlikely to happen but it does happen.