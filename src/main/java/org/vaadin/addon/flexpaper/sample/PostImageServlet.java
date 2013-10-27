package org.vaadin.addon.flexpaper.sample;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostImageServlet extends HttpServlet {
  private static final long serialVersionUID = 1743689620093440533L;

  public void doPost(HttpServletRequest request,
                     HttpServletResponse response) throws ServletException, IOException {
    System.out.println("Image posted");
    writeImage(request);
  }

  private void writeImage(HttpServletRequest request) throws IOException {
    BufferedImage image = null;

    try {
      InputStream inputStream = request.getInputStream();

      image = ImageIO.read(inputStream);

      ImageIO.write(image, "png", new File(request.getSession().getServletContext().getRealPath("")
          + "\\VAADIN\\docs\\image.png"));

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
