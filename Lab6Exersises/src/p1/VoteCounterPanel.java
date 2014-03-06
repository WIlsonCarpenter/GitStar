/**
 * 
 */
package p1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Creates a panel with labels and buttons for a vote.
 * @author Wilson
 *
 */
public class VoteCounterPanel extends JPanel {
    private int votesForJoe;
    private JButton joe;
    private JLabel labelJoe;
    
    private int votesForSam;
    private JButton sam;
    private JLabel labelSam;
    
    private JLabel labelWinning;
    
    private static final int PANEL_WIDTH = 300;
    private static final int PANEL_HEIGHT = 85;
    
    /**Constructor: Sets up the GUI.*/
    public VoteCounterPanel() {
        votesForJoe = 0;
        votesForSam = 0;
        
        joe = new JButton("Vote For Joe");
        sam = new JButton("Vote for Sam");
        
        joe.addActionListener(new VoteButtonListener());
        sam.addActionListener(new VoteButtonListener());
        
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        labelWinning = new JLabel();
        
        add(joe);
        add(labelJoe);

        add(sam);
        add(labelSam);
        
        add(labelWinning);
        
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        setBackground(Color.cyan);
    }
    
    /**Represents a listener for button push events.*/
    private class VoteButtonListener implements ActionListener {
        /**Updates the appropriate vote counter when a button
         * is pushed for one of the candidates.
         */
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == joe) {
                votesForJoe++;
                labelJoe.setText("Votes for Joe: " + votesForJoe);
            }
            else {
                votesForSam++;
                labelSam.setText("Votes for Sam: " + votesForSam);
            }
            
            
            if (votesForJoe == votesForSam) {
                labelWinning.setText("The score is tied!");
            }
            else {
                if (votesForJoe > votesForSam) {
                    labelWinning.setText("The current winner is: Joe");
                }
                else{
                    labelWinning.setText("The current winner is: Sam");
                }
            }

        }
    }
}
