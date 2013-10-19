package org.vaadin.addon.flexpaper.config;

import java.util.Locale;

/**
 * The Locale chain enum.
 * 
 * @author Paul Butenko (paul.butenko@gmail.com)
 */
public enum LocaleChain {
  
  /** The english language. */
  ENGLISH(Locale.US),
  
  /** The french language. */
  FRENCH(Locale.FRANCE),
  
  /** The chinese language. */
  CHINESE(Locale.SIMPLIFIED_CHINESE),
  
  /** The brazillian portugese language. */
  BRAZILLIAN_PORTUGESE(new Locale("pt_BR")),
  
  /** The russian language. */
  RUSSIAN(new Locale("ru", "RU")),
  
  /** The finnish language. */
  FINNISH(new Locale("fi", "FN")),
  
  /** The german language. */
  GERMAN(Locale.GERMANY),
  
  /** The netherlands language. */
  NETHERLANDS(new Locale("nl", "NL")),
  
  /** The turkish language. */
  TURKISH(new Locale("tr", "TR")),
  
  /** The swedish language. */
  SWEDISH(new Locale("se", "SE")),
  
  /** The portugese language. */
  PORTUGESE(new Locale("pt", "PT")),
  
  /** The greek language. */
  GREEK(new Locale("el", "EL")),
  
  /** The danish language. */
  DANISH(new Locale("dn", "DN")),
  
  /** The czech language. */
  CZECH(new Locale("cz", "CS")),
  
  /** The italian language. */
  ITALIAN(new Locale("it", "IT")),
  
  /** The polish language. */
  POLISH(new Locale("pl", "PL")),
  
  /** The finnish pv language. */
  FINNISH_PV(new Locale("pv", "FN")),
  
  /** The hungariuan language. */
  HUNGARIUAN(new Locale("hu", "HU"));

  /** The value. */
  private Locale value;

  /**
   * Instantiates a new locale chain.
   *
   * @param value the locale
   */
  private LocaleChain(final Locale value) {
    this.value = value;
  }
  
  @Override
  public String toString() {
    return value.toString();
  }
}
