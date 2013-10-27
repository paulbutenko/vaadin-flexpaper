package org.vaadin.addon.flexpaper.client.ui;

import com.google.gwt.core.client.GWT;
import com.vaadin.terminal.gwt.client.ValueMap;


/**
 * Wrapper arround flexpaper.js.
 * 
 * @author Paul Butenko (paul.butenko@gmail.com)
 */
class FlexPaperJs {
	
	/** The base url. */
	private static String BASE_URL = GWT.getModuleBaseURL();
	
	/**
	 * Creates the flex paper.
	 *
	 * @param divId the div id
	 * @param config the config
	 */
	native public static void createFlexPaper(String divId, ValueMap config) /*-{
	
		config['baseUrl'] = @org.vaadin.addon.flexpaper.client.ui.FlexPaperJs::BASE_URL;
		$wnd.jQuery('#' + divId).FlexPaperViewer({config : config});
		
	}-*/;
	
	
	native public static void loadSwf(String divId, String swfPath) /*-{
    $wnd.getDocViewer(divId).loadSwf(swfPath);
  }-*/;
	
	native public static void gotoPage(String divId, String pageNumber) /*-{
    $wnd.getDocViewer(divId).gotoPage(pageNumber);
  }-*/;
	
	native public static void fitWidth(String divId) /*-{
    $wnd.getDocViewer(divId).fitWidth();
  }-*/;
	
	native public static void fitHeight(String divId) /*-{
    $wnd.getDocViewer(divId).fitHeight();
  }-*/;
	
	native public static String getCurrPage(String divId) /*-{
    return $wnd.getDocViewer(divId).getCurrPage();
  }-*/;
	
	native public static void nextPage(String divId) /*-{
    $wnd.getDocViewer(divId).nextPage();
  }-*/;
	
	native public static void prevPage(String divId) /*-{
    $wnd.getDocViewer(divId).prevPage();
  }-*/;
	
	native public static void setZoom(String divId, String factor) /*-{
    $wnd.getDocViewer(divId).setZoom(factor);
  }-*/;
	
	native public static void searchText(String divId, String text) /*-{
    $wnd.getDocViewer(divId).searchText(text);
  }-*/;
	
	native public static void switchMode(String divId, String mode) /*-{
    $wnd.getDocViewer(divId).switchMode(mode);
  }-*/;
	
	native public static void printPaper(String divId) /*-{
    $wnd.getDocViewer(divId).printPaper();
  }-*/;
	
	native public static void highlight(String divId, String url) /*-{
    $wnd.getDocViewer(divId).highlight(url);
  }-*/;
	
	native public static void postSnapshot(String divId, String url) /*-{
    $wnd.getDocViewer(divId).postSnapshot(url);
  }-*/;
	
}
