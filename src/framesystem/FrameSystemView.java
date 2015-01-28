package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import lib.Calculation_lib;
import lib.MM1_lib;
import lib.MMS_lib;

/**
 *
 * @author 50013040
 */
public class FrameSystemView extends Frame implements ActionListener,WindowListener,KeyListener{

    private TextField text1 = new TextField("",10);
    private TextField text2 = new TextField("",10);
    private TextField text3 = new TextField("",10);
    private Button button1 =new Button("Addition");

    // for MM1
    private TextField m1 = new TextField("",10);
    private TextField m2 = new TextField("",10);
    private TextField m3 = new TextField("",10);
    private Button bm =new Button("M/M/1");
    
    // for MMS
    private TextField s1 = new TextField("",10);
    private TextField s2 = new TextField("",10);
    private TextField s3 = new TextField("",10);
    private TextField s4 = new TextField("",10);
    private Button bs =new Button("M/M/S");
    
    public FrameSystemView(FrameSystemController controller) {
        addWindowListener(this);
        setTitle("FrameSystem");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(text1);
        add(text2);
        add(button1);
        add(new Label("Result"));
        add(text3);
        button1.addActionListener(this);

        add(new Label("Lambda"));
        add(m1);
        add(new Label("Mu"));
        add(m2);
        add(bm);
        add(new Label("Result"));
        add(m3);
        bm.addActionListener(this);
        
        add(new Label("Lambda"));
        add(s1);
        add(new Label("Mu"));
        add(s2);
        add(new Label("s"));
        add(s3);
        add(bs);
        add(new Label("Result"));
        add(s4);
        bs.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            int val1 = Integer.parseInt(text1.getText());
            int val2 = Integer.parseInt(text2.getText());
            //text3.setText(String.valueOf(val1 + val2));
            Calculation_lib clib = new Calculation_lib(val1, val2);
            text3.setText(String.valueOf(clib.getPlus()));
        }
        else if(e.getSource() == bm){
            double lambda = Double.parseDouble(m1.getText());
            double mu = Double.parseDouble(m2.getText());
            MM1_lib mlib = new MM1_lib(lambda, mu);
            m3.setText(String.valueOf(mlib.getLength()));
        }
        else if(e.getSource() == bs){
            double lambda = Double.parseDouble(s1.getText());
            double mu = Double.parseDouble(s2.getText());
            int s = Integer.parseInt(s3.getText());
            MMS_lib slib = new MMS_lib(lambda, mu, s);
            s4.setText(String.valueOf(slib.getLq()));
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
