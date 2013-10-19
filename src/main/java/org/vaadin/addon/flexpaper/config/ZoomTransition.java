package org.vaadin.addon.flexpaper.config;

/**
 * The Zoom transition enum.
 * 
 * @author Paul Butenko (paul.butenko@gmail.com)
 */
public enum ZoomTransition {
  
  /** The ease out. */
  EASE_OUT("easeOut"),
  
  /** The ease none. */
  EASE_NONE("easeNone"),
  
  /** The ease in sine. */
  EASE_IN_SINE("easeInSine"),
  
  /** The ease out sine. */
  EASE_OUT_SINE("easeOutSine"),
  
  /** The ease in out sine. */
  EASE_IN_OUT_SINE("easeInOutSine"),
  
  /** The ease in quad. */
  EASE_IN_QUAD("easeInQuad"),
  
  /** The ease out quad. */
  EASE_OUT_QUAD("easeOutQuad"),
  
  /** The ease in out quad. */
  EASE_IN_OUT_QUAD("easeInOutQuad"),
  
  /** The linear. */
  LINEAR("linear");

  /** The value. */
  private String value;

  /**
   * Instantiates a new zoom transition.
   *
   * @param value the value
   */
  private ZoomTransition(final String value) {
    this.value = value;
  }
  
  @Override
  public String toString() {
    return value;
  }
}
