package org.vaadin.addon.flexpaper.sample;

import org.vaadin.addon.flexpaper.FlexPaper;
import org.vaadin.addon.flexpaper.config.Config;

import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class VaadinFlexpaperApplication extends Application {
	private static final long serialVersionUID = -6330390589556125450L;

	@Override
	public void init() {
		Window mainWindow = new Window("Vaadin Flexpaper Application");
		
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
    
    
    Button getCurPage = new Button("Get cur page"); 
    getCurPage.addListener(new ClickListener() {
      private static final long serialVersionUID = -7139975443928854126L;

      @Override
      public void buttonClick(ClickEvent event) {
       String curPage = fp.getCurrPage();
       
       getMainWindow().showNotification(curPage);
      }
    });
    vl.addComponent(getCurPage);
		
		
    mainWindow.addComponent(hl);
		
		setMainWindow(mainWindow);
	}

}
