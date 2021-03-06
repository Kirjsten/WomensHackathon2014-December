/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package climategame;

/**
 *
 * @author Kirjsten
 */
public class Results extends javax.swing.JFrame {
    int sum=0;
    int pos=(13*5);
    /**
     * Creates new form Results
     */
    public Results(int total) {
        sum=total;
        initComponents();
        changeText();
    }

    
    private void changeText()
    {
        if (sum >= 50)
        {
            grade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/goodmessage.png")));
        }
        else if (sum >= 30)
        {
            grade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/mediummessage.png")));
        }
        else //sum < 40
        {
            grade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/badmessage.png")));
        }
        
        outOf.setText(Integer.toString(pos));
        score.setText(Integer.toString(sum));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outOf = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        grade = new javax.swing.JLabel();
        backgroundResults = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        outOf.setText("# #");
        getContentPane().add(outOf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        score.setText("# # #");
        getContentPane().add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        grade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/goodmessage.png"))); // NOI18N
        getContentPane().add(grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 280, 170));

        backgroundResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Results.png"))); // NOI18N
        getContentPane().add(backgroundResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 440));

        setSize(new java.awt.Dimension(361, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundResults;
    private javax.swing.JLabel grade;
    private javax.swing.JLabel outOf;
    private javax.swing.JLabel score;
    // End of variables declaration//GEN-END:variables
}


/*
if (sum >= 60)
{
	System.out.println("Good job! You are eco-friendly. Keep up the good work!");
}
else if (sum >= 40)
{
	System.out.println("Caution! You are not quite eco-friendly yet.");
	System.out.println("Think about the polar bears!");
}
else //sum < 40
{
	System.out.println("Danger zone! Your actons are having a"); 
	System.out.println("negative effect on the environment!");
}

*/