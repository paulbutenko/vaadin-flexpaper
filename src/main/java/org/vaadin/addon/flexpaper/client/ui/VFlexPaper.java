package org.vaadin.addon.flexpaper.client.ui;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.terminal.gwt.client.ApplicationConnection;
import com.vaadin.terminal.gwt.client.Paintable;
import com.vaadin.terminal.gwt.client.UIDL;
import com.vaadin.terminal.gwt.client.ValueMap;

/**
 * The client side implementation for FlexPaper.
 * 
 * @author Paul Butenko (paul.butenko@gmail.com)
 */
public class VFlexPaper extends Widget implements Paintable {

  /** Set the CSS class name to allow styling. */
  public static final String CLASSNAME = "v-flexpaper";

  /** The client side widget identifier. */
  protected String paintableId;

  /** Reference to the server connection object. */
  protected ApplicationConnection client;

  /** The initialized. */
  private boolean initialized = false;

  /**
   * Instantiates a new v flex paper.
   */
  public VFlexPaper() {
    DivElement flexPaperDiv = Document.get().createDivElement();

    setElement(flexPaperDiv);

    setStyleName(CLASSNAME);
  }

  /**
   * Called whenever an update is received from the server.
   *
   * @param uidl the uidl
   * @param client the client
   */
  public void updateFromUIDL(final UIDL uidl,
                             final ApplicationConnection client) {
    // This call should be made first.
    // It handles sizes, captions, tooltips, etc. automatically.
    if (client.updateComponent(this, uidl, true)) {
      return;
    }

    // Save reference to server connection object to be able to send
    // user interaction later
    this.client = client;

    // Save the client side identifier (paintable id) for the widget
    paintableId = uidl.getId();

    if (!initialized) {
      ValueMap config = uidl.getMapAttribute("config");

      getElement().setId("documentViewer" + paintableId);

      FlexPaperJs.createFlexPaper(getElement().getId(), config);

      initialized = true;
    }
  }
}
