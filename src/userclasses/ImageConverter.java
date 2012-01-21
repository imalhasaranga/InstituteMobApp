/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

/**
 *
 * @author PC
 */
public class ImageConverter {

    public  byte[] convertToBytes(Image img, int width, int height, String imgName) {

        if (img == null || width < 0 || height < 0 || imgName == null) {

            throw new IllegalArgumentException("Check arguments");

        }

        int[] imgRgbData = new int[width * height];

        try {

            img.getRGB(imgRgbData, 0, width, 0, 0, width, height);

        } catch (Exception e) {
        }
        ByteArrayOutputStream baos = null;
        try {
            // Write image data to output stream (in order to get
            // the record bytes in needed form)
            baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);
            dos.writeUTF(imgName);

            for (int i = 0; i < imgRgbData.length; i++) {
                dos.writeInt(imgRgbData[i]);
            }



        } catch (IOException ioe) {
            System.out.println(ioe);

        }

        return baos.toByteArray();
    }




    public Image ShowImage(int width,int height, byte imageby[]) {


        String imagename = null;
        Image image = null;

        try {
                    ByteArrayInputStream  bin =  new ByteArrayInputStream( imageby );
                    DataInputStream   din = new DataInputStream( bin );

                    imagename = din.readUTF();
                    int remaining =  (imageby.length-imagename.getBytes().length-2)/4;

                    int[] rawdata = new int[remaining];

                    for(int k =0; k<rawdata.length; k++) {
                        rawdata[k] = din.readInt();
                    }

                    image = Image.createRGBImage(rawdata,
                            width, height, false);

                    bin.reset();
                    din.close();
                    din =null;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

}
