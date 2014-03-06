/**
 * 
 */
package p1;
import javax.swing.JFrame;

/**
 * Creates a new VoteCounterPanel
 * @author Wilson
 *
 */
public class VoteCounter {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(new VoteCounterPanel());
        
        frame.pack();
        frame.setVisible(true);
    }

}
