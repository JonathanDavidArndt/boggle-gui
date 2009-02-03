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

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class DeboggleApp extends SingleFrameApplication {

   /**
    * At startup create and show the main frame of the application.
    */
   @Override
   protected void startup() {
      show(new DeboggleView(this));
   }

   /**
    * This method is to initialize the specified window by injecting resources.
    * Windows shown in our application come fully initialized from the GUI
    * builder, so this additional configuration is not needed.
    */
   @Override
   protected void configureWindow(java.awt.Window root) {
   }

   /**
    * A convenient static getter for the application instance.
    * @return the instance of DeboggleApp
    */
   public static DeboggleApp getApplication() {
      return Application.getInstance(DeboggleApp.class);
   }

   /**
    * Main method launching the application.
    */
   public static void main(String[] args) {
      launch(DeboggleApp.class, args);
   }

   /**
    * Process text to remove all non-letters (A-Z, case-insensitive).
    * 
    * @param text
    * @return
    */
   public final static String removeNonLetters(final String text) {
      return text.replaceAll("[^a-zA-Z]", "");
   }
}
