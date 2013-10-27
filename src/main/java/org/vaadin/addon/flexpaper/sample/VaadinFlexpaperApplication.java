package org.vaadin.addon.flexpaper.sample;

import org.vaadin.addon.flexpaper.FlexPaper;
import org.vaadin.addon.flexpaper.config.Config;
import org.vaadin.addon.flexpaper.config.ViewMode;

import com.vaadin.Application;
import com.vaadin.terminal.ExternalResource;
import com.vaadin.terminal.Resource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class VaadinFlexpaperApplication extends Application {
	private static final long serialVersionUID = -6330390589556125450L;

	@Override
	public void init() {
		final Window mainWindow = new Window("Vaadin Flexpaper Application");
		
		HorizontalLayout hl = new HorizontalLayout();
		hl.setSpacing(true);
		
		Config config = new Config();
		config.setSwfFile("vaadin-flexpaper/VAADIN/docs/Paper.pdf.swf");
		config.setFullScreenAsMaxWindow(true);
		
		final FlexPaper fp = new FlexPaper(config);		
		hl.addComponent(fp);
		
		VerticalLayout vl = new VerticalLayout();
		
		hl.addComponent(vl);
		
		Button loadSwf = new Button("Load SWF"); 
		loadSwf.addListener(new ClickListener() {
      private static final long serialVersionUID = 7753039995659483482L;

      @Override
      public void buttonClick(ClickEvent event) {
       fp.loadSwf("vaadin-flexpaper/VAADIN/docs/Paper.pdf.swf"); 
      }
    });
		vl.addComponent(loadSwf);
		
		
		Button gotoPage = new Button("Go to page 3"); 
		gotoPage.addListener(new ClickListener() {
      private static final long serialVersionUID = -1133975523938840106L;

      @Override
      public void buttonClick(ClickEvent event) {
       fp.gotoPage(3); 
      }
    });
		vl.addComponent(gotoPage);
		
		
		Button fitWidth = new Button("Fit width"); 
		fitWidth.addListener(new ClickListener() {
      private static final long serialVersionUID = -8133975543928840126L;

      @Override
      public void buttonClick(ClickEvent event) {
       fp.fitWidth(); 
      }
    });
    vl.addComponent(fitWidth);
    
    
    Button fitHeight = new Button("Fit height"); 
    fitHeight.addListener(new ClickListener() {
      private static final long serialVersionUID = -1132975543928850126L;

      @Override
      public void buttonClick(ClickEvent event) {
       fp.fitHeight(); 
      }
    });
    vl.addComponent(fitHeight);
    
    Button nextPage = new Button("Next page"); 
    nextPage.addListener(new ClickListener() {
      private static final long serialVersionUID = -8139375443628254126L;

      @Override
      public void buttonClick(ClickEvent event) {
       fp.nextPage();
      }
    });
    vl.addComponent(nextPage);
    
    Button prevPage = new Button("Previous page"); 
    prevPage.addListener(new ClickListener() {
      private static final long serialVersionUID = -8439375443622256126L;

      @Override
      public void buttonClick(ClickEvent event) {
       fp.prevPage();
      }
    });
    vl.addComponent(prevPage);
    
    Button setZoom = new Button("Set zoom 1.4"); 
    setZoom.addListener(new ClickListener() {
      private static final long serialVersionUID = -4439375443692226126L;

      @Override
      public void buttonClick(ClickEvent event) {
       fp.setZoom(1.4);
      }
    });
    vl.addComponent(setZoom);
    
    Button searchText = new Button("Search text: 'Report'"); 
    searchText.addListener(new ClickListener() {
      private static final long serialVersionUID = -4549375442692726116L;

      @Override
      public void buttonClick(ClickEvent event) {
       fp.searchText("Report");
      }
    });
    vl.addComponent(searchText);
    
    Button switchMode = new Button("Switch mode to 'TwoPage'"); 
    switchMode.addListener(new ClickListener() {
      private static final long serialVersionUID = -8549335442662722116L;

      @Override
      public void buttonClick(ClickEvent event) {
       fp.switchMode(ViewMode.TWO_PAGE);
      }
    });
    vl.addComponent(switchMode);
    
    Button printPaper = new Button("Print paper"); 
    printPaper.addListener(new ClickListener() {
      private static final long serialVersionUID = -6549337442669722216L;

      @Override
      public void buttonClick(ClickEvent event) {
       fp.printPaper();
      }
    });
    vl.addComponent(printPaper);
    
    Button highlight = new Button("Highlight"); 
    highlight.addListener(new ClickListener() {
      private static final long serialVersionUID = -5549337442269726211L;

      @Override
      public void buttonClick(ClickEvent event) {
       fp.highlight("/vaadin-flexpaper/VAADIN/docs/highlight.xml");
      }
    });
    vl.addComponent(new Label("Highlight text from sample http://flexpaper.googlecode.com/svn/trunk/Example/flash/debug/highlight.xml"));
    vl.addComponent(highlight);
    
    Button postSnapshot = new Button("Post snapshot to local app"); 
    postSnapshot.addListener(new ClickListener() {
      private static final long serialVersionUID = -2549437742299726211L;

      @Override
      public void buttonClick(ClickEvent event) {
       fp.postSnapshot("/vaadin-flexpaper/postimage");
      }
    });
    vl.addComponent(postSnapshot);
    
    
    Button displaySnapshot = new Button("Display snapshot"); 
    displaySnapshot.addListener(new ClickListener() {
      private static final long serialVersionUID = -2549436642239726211L;

      @Override
      public void buttonClick(ClickEvent event) {
        Resource res = new ExternalResource("/vaadin-flexpaper/VAADIN/docs/image.png");
        
        Embedded  image = new Embedded(null, res);
        mainWindow.addComponent(image);
      }
    });
    vl.addComponent(displaySnapshot);
		
		
    mainWindow.addComponent(hl);
		
		setMainWindow(mainWindow);
	}

}
