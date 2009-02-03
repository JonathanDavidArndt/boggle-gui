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

/**
 * Contains information for an individual letter on the Boggle board.
 * 
 * @author JonathanDavid
 */
public class Letter extends Board {

   public static final Character BORDER_CHAR = '*';
   char value;

   // Letters are not visited until searches begin.
   boolean visited = false;

   /**
    * Create a new letter.
    * 
    * @param newValue
    *           The character (from A-Z). Case in-sensitive.
    * @param newX
    *           Horizontal offset from top left-hand corner.
    * @param newY
    *           Vertical offset from top left-hand corner.
    */
   public Letter(final Character newValue) {
      this.setValue(newValue);
   }

   /**
    * Gets the character value for this grid position on the board. When the
    * "visited" flag has been set, use an upper-case letter. This can be useful
    * for showing the location for the result of a particular search.
    * 
    * @return
    */
   public char getValue() {
      if (this.isVisited()) {
         return Character.toUpperCase(this.value);
      }
      return this.value;
   }

   /**
    * Sets the character value for this grid position on the board. To make
    * things easy, when the board assigns a character the null value, that
    * indicates that this letter appears on the boarder of the board.
    * 
    * @param newValue
    */
   private void setValue(Character newValue) {
      if (null == newValue) {
         newValue = BORDER_CHAR;
      }
      this.value = Character.toLowerCase(newValue);
   }

   /**
    * Has this letter position already been visited during the current search?
    * 
    * @return
    */
   public boolean isVisited() {
      return this.visited;
   }

   public void setVisited(final boolean isVisited) {
      this.visited = isVisited;
   }
}
