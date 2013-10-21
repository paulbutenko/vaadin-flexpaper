package org.vaadin.addon.flexpaper.sample;

import org.vaadin.addon.flexpaper.FlexPaper;
import org.vaadin.addon.flexpaper.config.Config;

import com.vaadin.Application;
import com.vaadin.ui.Window;

public class VaadinFlexpaperApplication extends Application {
	private static final long serialVersionUID = -6330390589556125450L;

	@Override
	public void init() {
		Window mainWindow = new Window("Vaadin Flexpaper Application");
		Config config = new Config();
		config.setSwfFile("vaadin-flexpaper/VAADIN/docs/Paper.pdf.swf");
		config.setFullScreenAsMaxWindow(true);
		
		final FlexPaper fp = new FlexPaper(config);
		
		mainWindow.addComponent(fp);
		setMainWindow(mainWindow);
	}

}
