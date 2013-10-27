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

  private String divId;

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

      divId = "documentViewer" + paintableId;
      getElement().setId(divId);

      FlexPaperJs.createFlexPaper(divId, config);

      initialized = true;
    }
    
    if (uidl.hasAttribute("pageNumber")) {
      String pageNumber = uidl.getStringAttribute("pageNumber");
      FlexPaperJs.gotoPage(divId, pageNumber);
    }
    
    if (uidl.hasAttribute("swfPath")) {
      String swfPath = uidl.getStringAttribute("swfPath");
      FlexPaperJs.loadSwf(divId, swfPath);
    }
    
    if (uidl.hasAttribute("fitWidth")) {
      FlexPaperJs.fitWidth(divId);
    }
    
    if (uidl.hasAttribute("fitHeight")) {
      FlexPaperJs.fitHeight(divId);
    }
    
    if (uidl.hasAttribute("requestCurrentPage")) {
      String curPage = FlexPaperJs.getCurrPage(divId);
      client.updateVariable(paintableId, "curPage", "page_" + curPage, true);
    }
    
    if (uidl.hasAttribute("nextPage")) {
      FlexPaperJs.nextPage(divId);
    }
    
    if (uidl.hasAttribute("prevPage")) {
      FlexPaperJs.prevPage(divId);
    }
    
    if (uidl.hasAttribute("factor")) {
      String factor = uidl.getStringAttribute("factor");
      FlexPaperJs.setZoom(divId, factor);
    }
    
    if (uidl.hasAttribute("text")) {
      String text = uidl.getStringAttribute("text");
      FlexPaperJs.searchText(divId, text);
    }
    
    if (uidl.hasAttribute("mode")) {
      String mode = uidl.getStringAttribute("mode");
      FlexPaperJs.switchMode(divId, mode);
    }
    
    if (uidl.hasAttribute("printPaper")) {
      FlexPaperJs.printPaper(divId);
    }
    
    if (uidl.hasAttribute("highlightUrl")) {
      String url = uidl.getStringAttribute("highlightUrl");
      FlexPaperJs.highlight(divId, url);
    }
    
    if (uidl.hasAttribute("snapshotUrl")) {
      String url = uidl.getStringAttribute("snapshotUrl");
      FlexPaperJs.postSnapshot(divId, url);
    }
    
  }
  
  
  
}
