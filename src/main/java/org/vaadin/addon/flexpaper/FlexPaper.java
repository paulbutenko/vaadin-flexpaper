package org.vaadin.addon.flexpaper;

import java.util.Map;

import org.vaadin.addon.flexpaper.config.Config;

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
  
  @Override
  public void paintContent(final PaintTarget target) throws PaintException {
    super.paintContent(target);

    if (config != null) {
      target.addAttribute("config", config.toMap());
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
  }

}
