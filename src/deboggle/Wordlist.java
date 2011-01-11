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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Stores a word list. Each word in the list should contain only letters (A-Z,
 * case in-sensitive). Some words will (hopefully) be found on the Deboggle board.
 *
 * @author JonathanDavid
 */
public class Wordlist extends DeboggleApp {

   public final static int MIN_WORD_LENGTH = 3;

   public static final List<String> load(final String resourceName)
           throws IOException {

      InputStream dataStream = Wordlist.class.getResourceAsStream(resourceName);
      BufferedReader data = new BufferedReader(
              new InputStreamReader(dataStream));

      List<String> words = new ArrayList<String>();

      String nextLine;
      while (null != (nextLine = data.readLine())) {

         // Process the next line according to Deboggle standards.
         nextLine = removeNonLetters(nextLine.toLowerCase());

         // Filter words that are too short.
         if (MIN_WORD_LENGTH <= nextLine.length()) {
            words.add(nextLine);
         }
      }

      data.close();

      return words;
   }

   public static final List<String> loadText(final String text)
           throws IOException {

      String[] textSplit = text.split("\r\n|\r|\n");

      List<String> words = new ArrayList<String>();

      String nextLine;
      for (int i = 0; i < textSplit.length; i++) {

         // Process the next line according to Deboggle standards.
         nextLine = removeNonLetters(textSplit[i].toLowerCase());

         // Filter words that are too short.
         if (MIN_WORD_LENGTH <= nextLine.length()) {
            words.add(nextLine);
         }
      }

      return words;
   }
}
