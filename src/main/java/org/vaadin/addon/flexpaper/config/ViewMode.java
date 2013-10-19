package org.vaadin.addon.flexpaper.config;

/**
 * The View mode enum.
 * 
 * @author Paul Butenko (paul.butenko@gmail.com)
 */
public enum ViewMode {
  
  /** The portrait view mode. */
  PORTRAIT("Portrait"),
  
  /** The tile view mode. */
  TILE("Tile"),
  
  /** The two page view mode. */
  TWO_PAGE("TwoPage"),
  
  /** The single page view mode. */
  SINGLE_PAGE("SinglePage");

  /** The value. */
  private String value;

  /**
   * Instantiates a new view mode.
   *
   * @param value the value
   */
  private ViewMode(final String value) {
    this.value = value;
  }
  
  @Override
  public String toString() {
    return value;
  }
}
