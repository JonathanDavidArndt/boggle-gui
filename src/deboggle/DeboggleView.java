/**
 *    De-Boggle. Unravel words from the Boggle board. How many did you miss?
 *    Copyright (C) 2008 Jonathan Arndt
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package deboggle;

import java.awt.Cursor;
import org.jdesktop.application.Action;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import org.jdesktop.application.Application;
import org.jdesktop.application.Task;

/**
 * The application's main frame.
 */
public class DeboggleView extends FrameView {

   private List<String> dictionaryWords;

   public DeboggleView(SingleFrameApplication app) {
      super(app);

      initComponents();

      // What words should we search for?
      try {
         dictionaryWords = Wordlist.load("resources/sowpods.txt");
      } catch (Exception e) {
         dictionaryWords = new ArrayList<String>();
      }
      NumberFormat formatter = new DecimalFormat("#,###,###");
      statusMessageLabel.setText("Words in Dictionary: " + formatter.format(dictionaryWords.size()));

      progressBar.setMinimum(0);
      progressBar.setMaximum(dictionaryWords.size());
      progressBar.setVisible(false);
   }

   @Action
   public void showAboutBox() {
      if (aboutBox == null) {
         JFrame mainFrame = DeboggleApp.getApplication().getMainFrame();
         aboutBox = new DeboggleAboutBox(mainFrame);
         aboutBox.setLocationRelativeTo(mainFrame);
      }
      DeboggleApp.getApplication().show(aboutBox);
   }

   /** This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      mainPanel = new javax.swing.JPanel();
      jButtonStart = new javax.swing.JButton();
      jScrollPaneFound = new javax.swing.JScrollPane();
      jTextAreaFound = new javax.swing.JTextArea();
      jLabelFound = new javax.swing.JLabel();
      jLabelBoard = new javax.swing.JLabel();
      jScrollPaneBoard = new javax.swing.JScrollPane();
      jTextAreaBoard = new javax.swing.JTextArea();
      jScrollPaneMissed = new javax.swing.JScrollPane();
      jTextAreaMissed = new javax.swing.JTextArea();
      jScrollPaneNotFound = new javax.swing.JScrollPane();
      jTextAreaNotFound = new javax.swing.JTextArea();
      jScrollPaneNotWords = new javax.swing.JScrollPane();
      jTextAreaNotWords = new javax.swing.JTextArea();
      jLabelMissed = new javax.swing.JLabel();
      jLabelNotFound = new javax.swing.JLabel();
      jLabelNotWords = new javax.swing.JLabel();
      jLabelScore = new javax.swing.JLabel();
      menuBar = new javax.swing.JMenuBar();
      javax.swing.JMenu fileMenu = new javax.swing.JMenu();
      javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
      javax.swing.JMenu helpMenu = new javax.swing.JMenu();
      javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();
      statusPanel = new javax.swing.JPanel();
      javax.swing.JSeparator statusPanelSeparator = new javax.swing.JSeparator();
      progressBar = new javax.swing.JProgressBar();
      statusMessageLabel = new javax.swing.JLabel();

      mainPanel.setName("mainPanel"); // NOI18N

      org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(deboggle.DeboggleApp.class).getContext().getResourceMap(DeboggleView.class);
      jButtonStart.setText(resourceMap.getString("jButtonStart.text")); // NOI18N
      jButtonStart.setName("jButtonStart"); // NOI18N
      jButtonStart.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            jButtonStartMouseClicked(evt);
         }
      });

      jScrollPaneFound.setName("jScrollPaneFound"); // NOI18N

      jTextAreaFound.setColumns(16);
      jTextAreaFound.setRows(4);
      jTextAreaFound.setName("jTextAreaFound"); // NOI18N
      jScrollPaneFound.setViewportView(jTextAreaFound);

      jLabelFound.setText(resourceMap.getString("jLabelFound.text")); // NOI18N
      jLabelFound.setName("jLabelFound"); // NOI18N

      jLabelBoard.setText(resourceMap.getString("jLabelBoard.text")); // NOI18N
      jLabelBoard.setName("jLabelBoard"); // NOI18N

      jScrollPaneBoard.setName("jScrollPaneBoard"); // NOI18N

      jTextAreaBoard.setColumns(16);
      jTextAreaBoard.setRows(4);
      jTextAreaBoard.setName("jTextAreaBoard"); // NOI18N
      jScrollPaneBoard.setViewportView(jTextAreaBoard);

      jScrollPaneMissed.setName("jScrollPaneMissed"); // NOI18N

      jTextAreaMissed.setBackground(resourceMap.getColor("jTextAreaMissed.background")); // NOI18N
      jTextAreaMissed.setColumns(5);
      jTextAreaMissed.setEditable(false);
      jTextAreaMissed.setRows(4);
      jTextAreaMissed.setName("jTextAreaMissed"); // NOI18N
      jScrollPaneMissed.setViewportView(jTextAreaMissed);

      jScrollPaneNotFound.setName("jScrollPaneNotFound"); // NOI18N

      jTextAreaNotFound.setBackground(resourceMap.getColor("jTextAreaNotFound.background")); // NOI18N
      jTextAreaNotFound.setColumns(5);
      jTextAreaNotFound.setEditable(false);
      jTextAreaNotFound.setRows(4);
      jTextAreaNotFound.setName("jTextAreaNotFound"); // NOI18N
      jScrollPaneNotFound.setViewportView(jTextAreaNotFound);

      jScrollPaneNotWords.setName("jScrollPaneNotWords"); // NOI18N

      jTextAreaNotWords.setBackground(resourceMap.getColor("jTextAreaNotWords.background")); // NOI18N
      jTextAreaNotWords.setColumns(5);
      jTextAreaNotWords.setEditable(false);
      jTextAreaNotWords.setRows(4);
      jTextAreaNotWords.setName("jTextAreaNotWords"); // NOI18N
      jScrollPaneNotWords.setViewportView(jTextAreaNotWords);

      jLabelMissed.setText(resourceMap.getString("jLabelMissed.text")); // NOI18N
      jLabelMissed.setName("jLabelMissed"); // NOI18N

      jLabelNotFound.setText(resourceMap.getString("jLabelNotFound.text")); // NOI18N
      jLabelNotFound.setName("jLabelNotFound"); // NOI18N

      jLabelNotWords.setText(resourceMap.getString("jLabelNotWords.text")); // NOI18N
      jLabelNotWords.setName("jLabelNotWords"); // NOI18N

      jLabelScore.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
      jLabelScore.setText(resourceMap.getString("jLabelScore.text")); // NOI18N
      jLabelScore.setName("jLabelScore"); // NOI18N

      javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
      mainPanel.setLayout(mainPanelLayout);
      mainPanelLayout.setHorizontalGroup(
         mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(mainPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jButtonStart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
               .addComponent(jScrollPaneFound, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
               .addComponent(jScrollPaneBoard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
               .addComponent(jLabelBoard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
               .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                  .addComponent(jLabelFound)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jLabelScore, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPaneMissed, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
               .addComponent(jLabelMissed, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPaneNotFound, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
               .addComponent(jLabelNotFound, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
            .addGap(6, 6, 6)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPaneNotWords, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
               .addComponent(jLabelNotWords, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
            .addContainerGap())
      );
      mainPanelLayout.setVerticalGroup(
         mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(mainPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabelBoard)
               .addComponent(jLabelMissed)
               .addComponent(jLabelNotFound)
               .addComponent(jLabelNotWords))
            .addGap(6, 6, 6)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPaneNotWords, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
               .addComponent(jScrollPaneNotFound, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
               .addComponent(jScrollPaneMissed, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
               .addGroup(mainPanelLayout.createSequentialGroup()
                  .addComponent(jScrollPaneBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabelFound)
                     .addComponent(jLabelScore))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jScrollPaneFound, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
            .addGap(11, 11, 11)
            .addComponent(jButtonStart)
            .addContainerGap())
      );

      menuBar.setName("menuBar"); // NOI18N

      fileMenu.setMnemonic('F');
      fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
      fileMenu.setName("fileMenu"); // NOI18N

      javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(deboggle.DeboggleApp.class).getContext().getActionMap(DeboggleView.class, this);
      exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
      exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
      exitMenuItem.setName("exitMenuItem"); // NOI18N
      fileMenu.add(exitMenuItem);

      menuBar.add(fileMenu);

      helpMenu.setMnemonic('H');
      helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
      helpMenu.setName("helpMenu"); // NOI18N

      aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
      aboutMenuItem.setName("aboutMenuItem"); // NOI18N
      helpMenu.add(aboutMenuItem);

      menuBar.add(helpMenu);

      statusPanel.setMinimumSize(new java.awt.Dimension(0, 45));
      statusPanel.setName("statusPanel"); // NOI18N
      statusPanel.setPreferredSize(new java.awt.Dimension(0, 45));

      statusPanelSeparator.setName("statusPanelSeparator"); // NOI18N

      progressBar.setName("progressBar"); // NOI18N

      statusMessageLabel.setText(resourceMap.getString("statusMessageLabel.text")); // NOI18N
      statusMessageLabel.setName("statusMessageLabel"); // NOI18N

      javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
      statusPanel.setLayout(statusPanelLayout);
      statusPanelLayout.setHorizontalGroup(
         statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(statusPanelSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(statusMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
            .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );
      statusPanelLayout.setVerticalGroup(
         statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(statusPanelLayout.createSequentialGroup()
            .addComponent(statusPanelSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(statusPanelLayout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                  .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(3, 3, 3))
               .addGroup(statusPanelLayout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(statusMessageLabel)
                  .addContainerGap())))
      );

      setComponent(mainPanel);
      setMenuBar(menuBar);
      setStatusBar(statusPanel);
   }// </editor-fold>//GEN-END:initComponents
   private void jButtonStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonStartMouseClicked

      // Clear the output panes.
      jTextAreaMissed.setText("");
      jTextAreaNotFound.setText("");
      jTextAreaNotWords.setText("");

      // Disable the start button.
      jButtonStart.setEnabled(false);

      // Turn on the wait cursor.
      mainPanel.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

      // Start the progress bar.
      progressBar.setValue(0);
      progressBar.setStringPainted(true);
      progressBar.setVisible(true);

      new Deboggle(getApplication()).execute();
}//GEN-LAST:event_jButtonStartMouseClicked

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButtonStart;
   private javax.swing.JLabel jLabelBoard;
   private javax.swing.JLabel jLabelFound;
   private javax.swing.JLabel jLabelMissed;
   private javax.swing.JLabel jLabelNotFound;
   private javax.swing.JLabel jLabelNotWords;
   private javax.swing.JLabel jLabelScore;
   private javax.swing.JScrollPane jScrollPaneBoard;
   private javax.swing.JScrollPane jScrollPaneFound;
   private javax.swing.JScrollPane jScrollPaneMissed;
   private javax.swing.JScrollPane jScrollPaneNotFound;
   private javax.swing.JScrollPane jScrollPaneNotWords;
   private javax.swing.JTextArea jTextAreaBoard;
   private javax.swing.JTextArea jTextAreaFound;
   private javax.swing.JTextArea jTextAreaMissed;
   private javax.swing.JTextArea jTextAreaNotFound;
   private javax.swing.JTextArea jTextAreaNotWords;
   private javax.swing.JPanel mainPanel;
   private javax.swing.JMenuBar menuBar;
   private javax.swing.JProgressBar progressBar;
   private javax.swing.JLabel statusMessageLabel;
   private javax.swing.JPanel statusPanel;
   // End of variables declaration//GEN-END:variables
   private JDialog aboutBox;

   private class Deboggle extends Task {

      public Deboggle(Application app) {
         super(app);
      }

      protected Object doInBackground() {
         // Load the Boggle board.
         Board board = new Board();

         try {
            board.load(jTextAreaBoard.getText());

            // What words from the dictionary can be found on the board?
            List<String> dictionaryWordsFound = new ArrayList<String>();

            // What words did we find ourselves?
            List<String> myWordsFound = Wordlist.loadText(jTextAreaFound.getText());

            // Search the board!
            // Display a list of words you found that are also in the dictionary.
            //jTextAreaMissed.append("[INFO] Words you found on the board:\n");
            int myWordsFoundCount = 0;
            for (int i = 0; i < dictionaryWords.size(); i++) {
               // Update the progress bar.
               progressBar.setValue(i);

               final String word = dictionaryWords.get(i);

               if (board.find(word)) {
                  dictionaryWordsFound.add(word);

                  if (myWordsFound.contains(word)) {
                     myWordsFoundCount++;
                  }
               }
            }

            // Display a list of words that you thought you found (but they're
            // actually not found on the board).
            //jTextAreaMissed.append("[INFO] Words you thought you found (but actually didn't):\n");
            int myWordsNotFoundCount = 0;
            for (int i = 0; i < myWordsFound.size(); i++) {
               final String word = myWordsFound.get(i);

               if (dictionaryWords.contains(word) && !dictionaryWordsFound.contains(word)) {
                  jTextAreaNotFound.append(word + "\n");
                  myWordsNotFoundCount++;
               }
            }

            // Display a list of words the dictionary found that you did not.
            //jTextAreaMissed.append("[INFO] Words you missed:\n");
            int myWordsMissedCount = 0;
            for (int i = 0; i < dictionaryWordsFound.size(); i++) {
               final String word = dictionaryWordsFound.get(i);

               if (!myWordsFound.contains(word)) {
                  jTextAreaMissed.append(word + "\n");
                  myWordsMissedCount++;
               }
            }

            // Display a list of words that you thought you found (but they're
            // actually not words).
            //jTextAreaMissed.append("[INFO] Words you thought were real words (they're not):\n");
            int myNotWordsCount = 0;
            for (int i = 0; i < myWordsFound.size(); i++) {
               final String word = myWordsFound.get(i);

               if (!dictionaryWords.contains(word)) {
                  jTextAreaNotWords.append(word + "\n");
                  myNotWordsCount++;
               }
            }

            // Format the numbers to be displayed.
            NumberFormat formatter = new DecimalFormat("#,###,###");

            Integer found = Integer.valueOf(myWordsFoundCount);
            Integer total = Integer.valueOf(myWordsFoundCount + myWordsMissedCount);
            long percent;

            if (0 < total) {
               percent = Math.round(100 * (found.doubleValue() / total.doubleValue()));
            } else {
               percent = 100;
            }

            jLabelScore.setText(formatter.format(found) + " of " + formatter.format(total) + " (" + percent + "%)");
         } catch (Exception e) {
            jTextAreaMissed.setText("ERROR: " + e.getMessage());
         }

         return null;
      }

      @Override
      protected void finished() {
         // Turn off wait cursor.
         mainPanel.setCursor(null); //turn off the wait cursor

         // Complete progress bar.
         progressBar.setVisible(false);

         // Re-enable the start button.
         jButtonStart.setEnabled(true);
      }
   }
}
