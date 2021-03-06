/**
 * Enumerator creates preset types for all instanced items.
 *
 * @author : Alejandro Sanchez Padron
 * @date : 11/07/2018
 */
public enum ItemType {

  AUDIO("AU"), VISUAL("VI"), AUDIO_MOBILE("AM"), VISUAL_MOBILE("VM");

  public final String code;

  /**
   * Creates the item type.
   */
  ItemType(String code) {
    this.code = code;
  }
}
