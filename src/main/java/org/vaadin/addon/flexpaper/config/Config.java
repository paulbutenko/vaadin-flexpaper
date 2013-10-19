package org.vaadin.addon.flexpaper.config;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * The Config for Flex Paper. 
 * 
 * Detailed information can be found at http://flexpaper.devaldi.com/docs_parameters.jsp.
 * 
 * @author Paul Butenko (paul.butenko@gmail.com)
 */
public class Config {

  /** The flash document FlexPaper should open. */
  private String SwfFile = "";

  /** The json document FlexPaper should open. */
  private String JSONFile = "";

  /** The pages as images FlexPaper should open. */
  private String IMGFiles = "";

  /** The PDF document FlexPaper should open. */
  private String PDFFile = "";

  /**
   * The initial zoom factor that should be used. Should be a number above 0 (1=100%)
   */
  private Double Scale = 0.8;

  /** The zoom transition that should be used when zooming in FlexPaper. */
  private ZoomTransition ZoomTransition = org.vaadin.addon.flexpaper.config.ZoomTransition.EASE_OUT;

  /**
   * The time it should take for the zoom to reach the new zoom factor. Should
   * be 0 or greater.
   */
  private Double ZoomTime = 0.5;

  /**
   * The interval which the zoom slider should be using. Basically how big the
   * "step" should be between each zoom factor. The default value is 0.1.
   * Should be a positive number.
   */
  private Double ZoomInterval = 0.5;

  /**
   * Fits the page on initial load. Same effect as using the fit-page button
   * in the toolbar.
   */
  private Boolean FitPageOnLoad = false;

  /**
   * Fits the width on initial load. Same effect as using the fit-width button
   * in the toolbar.
   */
  private Boolean FitWidthOnLoad = false;

  /** The locale (language) to use. */
  private LocaleChain localeChain = LocaleChain.ENGLISH;

  /**
   * With this set to true, clicking on fullscreen will open a new browser
   * window with FlexPaper maximized instead of using true fullscreen. This is
   * a preferred setting when using FlexPaper as flash standalone as the
   * security limitations of the Flash player disables (for security reasons)
   * most of the input controls in true fullscreen.
   */
  private Boolean FullScreenAsMaxWindow = true;

  /**
   * Will load and display the document progressively when set to true as
   * opposed to downloading the complete document before displaying the pages.
   * Documents need to be converted to at least Flash version 9 for this to
   * work (-T 9 flag using PDF2SWF).
   */
  private Boolean ProgressiveLoading = true;

  /** The maximum allowed zoom level. */
  private Double MaxZoomSize = 5.0;

  /** The minimum allowed zoom level. */
  private Double MinZoomSize = 0.2;

  /**
   * When set to true, the viewer highlights all matches when performing
   * searches in a document.
   */
  private Boolean SearchMatchAll = false;

  /** The start-up view mode. */
  private ViewMode InitViewMode = ViewMode.PORTRAIT;

  /**
   * When set to true, the viewer will print the document as a bitmap as
   * opposed to vectorized.
   */
  private Boolean PrintPaperAsBitmap = false;

  /** Instructs the viewer to start at a specific page. */
  private Integer StartAtPage = 1;

  /** Shows or hides view modes from the tool bar. */
  private Boolean ViewModeToolsVisible = true;

  /** Shows or hides zoom tools from the tool bar. */
  private Boolean ZoomToolsVisible = true;

  /** Shows or hides nav tools from the tool bar. */
  private Boolean NavToolsVisible = true;

  /** Shows or hides cursor tools from the tool bar. */
  private Boolean CursorToolsVisible = true;

  /** Shows or hides search tools from the tool bar. */
  private Boolean SearchToolsVisible = true;

  /**
   * Converts config to map.
   * 
   * @return the map
   */
  public Map<String, String> toMap() {
    Map<String, String> result = new HashMap<String, String>();
    Field[] fields = this.getClass().getDeclaredFields();
    for (Field field : fields) {
      try {
        result.put(field.getName(), field.get(this).toString());
      } catch (Exception e) {
      }
    }

    return result;

  }

  public String getSwfFile() {
    return SwfFile;
  }

  /**
   * Sets the flash document FlexPaper should open.
   * 
   * @param swfFile the new swf file
   */
  public void setSwfFile(final String swfFile) {
    SwfFile = swfFile;
  }

  public String getJSONFile() {
    return JSONFile;
  }

  /**
   * Sets the json document FlexPaper should open.
   * 
   * @param jsonFile the new json file
   */
  public void setJSONFile(final String jsonFile) {
    JSONFile = jsonFile;
  }

  public String getIMGFiles() {
    return IMGFiles;
  }

  /**
   * Sets the pages as images FlexPaper should open.
   * 
   * @param imgFiles the new img files
   */
  public void setIMGFiles(final String imgFiles) {
    IMGFiles = imgFiles;
  }

  public String getPDFFile() {
    return PDFFile;
  }

  /**
   * Sets the PDF document FlexPaper should open.
   * 
   * @param pdfFile the new pdf file
   */
  public void setPDFFile(final String pdfFile) {
    PDFFile = pdfFile;
  }

  public Double getScale() {
    return Scale;
  }

  /**
   * Sets the initial zoom factor that should be used. Should be a number
   * above 0 (1=100%).
   * 
   * @param scale the new scale
   */
  public void setScale(final Double scale) {
    Scale = scale;
  }

  public ZoomTransition getZoomTransition() {
    return ZoomTransition;
  }

  /**
   * Sets the zoom transition that should be used when zooming in FlexPaper.
   * 
   * @param zoomTransition the new zoom transition
   */
  public void setZoomTransition(final ZoomTransition zoomTransition) {
    ZoomTransition = zoomTransition;
  }

  public Double getZoomTime() {
    return ZoomTime;
  }

  /**
   * Sets the zoom time. The time it should take for the zoom to reach the new
   * zoom factor. Should be 0 or greater.
   * 
   * @param zoomTime the new zoom time
   */
  public void setZoomTime(final Double zoomTime) {
    ZoomTime = zoomTime;
  }

  public Double getZoomInterval() {
    return ZoomInterval;
  }

  /**
   * Sets the zoom interval. The interval which the zoom slider should be
   * using. Basically how big the "step" should be between each zoom factor.
   * The default value is 0.1. Should be a positive number.
   * 
   * @param zoomInterval the new zoom interval
   */
  public void setZoomInterval(final Double zoomInterval) {
    ZoomInterval = zoomInterval;
  }

  public Boolean getFitPageOnLoad() {
    return FitPageOnLoad;
  }

  /**
   * Sets the fit page on load. Fits the page on initial load. Same effect as
   * using the fit-page button in the toolbar.
   * 
   * @param fitPageOnLoad the new fit page on load
   */
  public void setFitPageOnLoad(final Boolean fitPageOnLoad) {
    FitPageOnLoad = fitPageOnLoad;
  }

  public Boolean getFitWidthOnLoad() {
    return FitWidthOnLoad;
  }

  /**
   * Sets the fit width on load. Fits the width on initial load. Same effect
   * as using the fit-width button in the toolbar.
   * 
   * @param fitWidthOnLoad the new fit width on load
   */
  public void setFitWidthOnLoad(final Boolean fitWidthOnLoad) {
    FitWidthOnLoad = fitWidthOnLoad;
  }

  public LocaleChain getLocaleChain() {
    return localeChain;
  }

  /**
   * Sets the locale (language) to use.
   * 
   * @param localeChain the new locale chain
   */
  public void setLocaleChain(final LocaleChain localeChain) {
    this.localeChain = localeChain;
  }

  public Boolean getFullScreenAsMaxWindow() {
    return FullScreenAsMaxWindow;
  }

  /**
   * Sets the full screen as max window. With this set to true, clicking on
   * fullscreen will open a new browser window with FlexPaper maximized
   * instead of using true fullscreen. This is a preferred setting when using
   * FlexPaper as flash standalone as the security limitations of the Flash
   * player disables (for security reasons) most of the input controls in true
   * fullscreen.
   * 
   * @param fullScreenAsMaxWindow the new full screen as max window
   */
  public void setFullScreenAsMaxWindow(final Boolean fullScreenAsMaxWindow) {
    FullScreenAsMaxWindow = fullScreenAsMaxWindow;
  }

  public Boolean getProgressiveLoading() {
    return ProgressiveLoading;
  }

  /**
   * Sets the progressive loading. Will load and display the document
   * progressively when set to true as opposed to downloading the complete
   * document before displaying the pages. Documents need to be converted to
   * at least Flash version 9 for this to work (-T 9 flag using PDF2SWF).
   * 
   * @param progressiveLoading the new progressive loading
   */
  public void setProgressiveLoading(final Boolean progressiveLoading) {
    ProgressiveLoading = progressiveLoading;
  }

  public Double getMaxZoomSize() {
    return MaxZoomSize;
  }

  /**
   * Sets the maximum allowed zoom level.
   * 
   * @param maxZoomSize the new max zoom size
   */
  public void setMaxZoomSize(final Double maxZoomSize) {
    MaxZoomSize = maxZoomSize;
  }

  public Double getMinZoomSize() {
    return MinZoomSize;
  }

  /**
   * Sets the minimum allowed zoom level.
   * 
   * @param minZoomSize the new min zoom size
   */
  public void setMinZoomSize(final Double minZoomSize) {
    MinZoomSize = minZoomSize;
  }

  public Boolean getSearchMatchAll() {
    return SearchMatchAll;
  }

  /**
   * Sets the search match all. When set to true, the viewer highlights all
   * matches when performing searches in a document.
   * 
   * @param searchMatchAll the new search match all
   */
  public void setSearchMatchAll(final Boolean searchMatchAll) {
    SearchMatchAll = searchMatchAll;
  }

  public ViewMode getInitViewMode() {
    return InitViewMode;
  }

  /**
   * Sets the start-up view mode.
   * 
   * @param initViewMode the new init view mode
   */
  public void setInitViewMode(final ViewMode initViewMode) {
    InitViewMode = initViewMode;
  }

  public Boolean getPrintPaperAsBitmap() {
    return PrintPaperAsBitmap;
  }

  /**
   * Sets the prints the paper as bitmap. When set to true, the viewer will
   * print the document as a bitmap as opposed to vectorized.
   * 
   * @param printPaperAsBitmap the new prints the paper as bitmap
   */
  public void setPrintPaperAsBitmap(final Boolean printPaperAsBitmap) {
    PrintPaperAsBitmap = printPaperAsBitmap;
  }

  public Integer getStartAtPage() {
    return StartAtPage;
  }

  /**
   * Sets the start at page.
   * 
   * @param startAtPage the new start at page
   */
  public void setStartAtPage(final Integer startAtPage) {
    StartAtPage = startAtPage;
  }

  public Boolean getViewModeToolsVisible() {
    return ViewModeToolsVisible;
  }

  /**
   * Sets the view mode tools visible.
   * 
   * @param viewModeToolsVisible the new view mode tools visible
   */
  public void setViewModeToolsVisible(final Boolean viewModeToolsVisible) {
    ViewModeToolsVisible = viewModeToolsVisible;
  }

  public Boolean getZoomToolsVisible() {
    return ZoomToolsVisible;
  }

  /**
   * Sets the zoom tools visible.
   * 
   * @param zoomToolsVisible the new zoom tools visible
   */
  public void setZoomToolsVisible(final Boolean zoomToolsVisible) {
    ZoomToolsVisible = zoomToolsVisible;
  }

  public Boolean getNavToolsVisible() {
    return NavToolsVisible;
  }

  /**
   * Sets the nav tools visible.
   * 
   * @param navToolsVisible the new nav tools visible
   */
  public void setNavToolsVisible(final Boolean navToolsVisible) {
    NavToolsVisible = navToolsVisible;
  }

  public Boolean getCursorToolsVisible() {
    return CursorToolsVisible;
  }

  /**
   * Sets the cursor tools visible.
   * 
   * @param cursorToolsVisible the new cursor tools visible
   */
  public void setCursorToolsVisible(final Boolean cursorToolsVisible) {
    CursorToolsVisible = cursorToolsVisible;
  }

  public Boolean getSearchToolsVisible() {
    return SearchToolsVisible;
  }

  /**
   * Sets the search tools visible.
   * 
   * @param searchToolsVisible the new search tools visible
   */
  public void setSearchToolsVisible(final Boolean searchToolsVisible) {
    SearchToolsVisible = searchToolsVisible;
  }

}
