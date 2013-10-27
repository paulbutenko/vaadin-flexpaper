package org.vaadin.addon.flexpaper;

import java.util.Map;

import org.vaadin.addon.flexpaper.config.Config;
import org.vaadin.addon.flexpaper.config.ViewMode;

import com.vaadin.terminal.PaintException;
import com.vaadin.terminal.PaintTarget;
import com.vaadin.ui.AbstractComponent;

/**
 * Server side component for the VFlexPaper widget.
 * 
 * @author Paul Butenko (paul.butenko@gmail.com)
 */
@com.vaadin.ui.ClientWidget(org.vaadin.addon.flexpaper.client.ui.VFlexPaper.class)
public class FlexPaper extends AbstractComponent {
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 7424013201850978726L;

  /** The Constant DEFAULT_HEIGHT. */
  private static final int DEFAULT_HEIGHT = 500;
  
  /** The Constant DEFAULT_WIDTH. */
  private static final int DEFAULT_WIDTH = 650;

  /** The config. */
  private Config config;
  
  /** The swf path. */
  private String swfPath;
  
  /** The page number. */
  private Integer pageNumber;

  /** The fit width. */
  private String fitWidth;

  /** The fit height. */
  private String fitHeight;

  /** The cur page. */
  private String curPage = "";
  
  /** The next page. */
  private String nextPage;

  /** The prev page. */
  private String prevPage;

  /** The factor. */
  private Double factor;

  /** The text. */
  private String text;

  /** The mode. */
  private ViewMode mode;

  /** The print paper. */
  private String printPaper;

  /** The highlight url. */
  private String highlightUrl;

  /** The snapshot url. */
  private String snapshotUrl;

  /**
   * Instantiates a new flex paper.
   *
   * @param config the config
   */
  public FlexPaper(final Config config) {
    setWidth(DEFAULT_WIDTH, UNITS_PIXELS);
    setHeight(DEFAULT_HEIGHT, UNITS_PIXELS);

    this.config = config;
  }
  
  /* (non-Javadoc)
   * @see com.vaadin.ui.AbstractComponent#paintContent(com.vaadin.terminal.PaintTarget)
   */
  @Override
  public void paintContent(final PaintTarget target) throws PaintException {
    super.paintContent(target);

    if (config != null) {
      target.addAttribute("config", config.toMap());
    }
    
    if (swfPath != null && swfPath.length() > 0) {
      target.addAttribute("swfPath", swfPath);
      swfPath = null;
    }
    
    if (pageNumber != null) {
      target.addAttribute("pageNumber", pageNumber.toString());
      pageNumber = null;
    }
    
    if (fitWidth != null && fitWidth.length() > 0) {
      target.addAttribute("fitWidth", fitWidth);
      fitWidth = null;
    }
    
    if (fitHeight != null && fitHeight.length() > 0) {
      target.addAttribute("fitHeight", fitHeight);
      fitHeight = null;
    }
    
    if (nextPage != null && nextPage.length() > 0) {
      target.addAttribute("nextPage", nextPage);
      nextPage = null;
    }
    
    if (prevPage != null && prevPage.length() > 0) {
      target.addAttribute("prevPage", prevPage);
      prevPage = null;
    }
    
    if (factor != null) {
      target.addAttribute("factor", factor.toString());
      factor = null;
    }
    
    if (text != null && text.length() > 0) {
      target.addAttribute("text", text);
      text = null;
    }
    
    if (mode != null) {
      target.addAttribute("mode", mode.toString());
      mode = null;
    }
    
    if (printPaper != null && printPaper.length() > 0) {
      target.addAttribute("printPaper", "printPaper");
      printPaper = null;
    }
    
    if (highlightUrl != null && highlightUrl.length() > 0) {
      target.addAttribute("highlightUrl", highlightUrl);
      highlightUrl = null;
    }
    
    if (snapshotUrl != null && snapshotUrl.length() > 0) {
      target.addAttribute("snapshotUrl", snapshotUrl);
      snapshotUrl = null;
    }
  }

  /**
   * Receive and handle events and other variable changes from the client.
   * 
   * {@inheritDoc}
   */
  @Override
  public void changeVariables(final Object source,
                              final Map<String, Object> variables) {
    super.changeVariables(source, variables);
    
    if (variables.containsKey("curPage")) {
      this.curPage = (String) variables.get("curPage");
    }
  }

  /**
   * Loads a new document into the viewer.
   *
   * @param swfPath the swf path
   */
  public void loadSwf(String swfPath) {
    this.swfPath = swfPath;
    requestRepaint();
  }

  /**
   * Navigates the viewer to the specified page.
   *
   * @param pageNumber the page number
   */
  public void gotoPage(Integer pageNumber) {
    this.pageNumber = pageNumber;
    requestRepaint();
  }
  
  /**
   * Sets the viewer to fit width mode.
   */
  public void fitWidth() {
    this.fitWidth = "fitWidth";
    requestRepaint();
  }
  
  /**
   * Sets the viewer to fit height mode.
   */
  public void fitHeight() {
    this.fitHeight = "fitHeight";
    requestRepaint();
  }
  
  /**
   * TODO: Will be implemented in the next release
   */
  private String getCurrPage() {
    return "";
  }
  
  /**
   * Move to next page in the loaded document.
   */
  public void nextPage() {
    this.nextPage = "nextPage";
    requestRepaint();
  }
  
  /**
   * Move to previous page in the loaded document.
   */
  public void prevPage() {
    this.prevPage = "prevPage";
    requestRepaint();
  }
  
  /**
   * Zoom the viewer to the specified factor.
   *
   * @param factor the new zoom
   */
  public void setZoom(Double factor) {
    this.factor = factor;
    requestRepaint();
  }
  
  /**
   * Search the loaded document for the specified text.
   *
   * @param text the text to search
   */
  public void searchText(String text) {
    this.text = text;
    requestRepaint();
  }
  
  /**
   * Switch viewing mode..
   *
   * @param mode the mode
   */
  public void switchMode(ViewMode mode) {
    this.mode = mode;
    requestRepaint();
  }
  
  /**
   * Print the loaded document.
   */
  public void printPaper() {
    this.printPaper = "printPaper";
    requestRepaint();
  }
  
  /**
   * Highlights all matches in a document according to Adobe's XML highlighting specification.
   *
   * @param highlightUrl the highlight url
   */
  public void highlight(String highlightUrl) {
    this.highlightUrl = highlightUrl;
    requestRepaint();
  }
  
  /**
   * Posts a snapshot of the current document page to the specified url.
   *
   * @param snapshotUrl the snapshot url
   */
  public void postSnapshot(String snapshotUrl) {
    this.snapshotUrl = snapshotUrl;
    requestRepaint();
  }

}
