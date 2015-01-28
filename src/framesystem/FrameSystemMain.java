package framesystem;

/**
 *
 * @author 50013040
 */
public class FrameSystemMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrameSystemController controller
                = new FrameSystemController();
        FrameSystemView frame
                = new FrameSystemView(controller);
        frame.setBounds(5,5,655,455);
        frame.setVisible(true);
    }
    
}
