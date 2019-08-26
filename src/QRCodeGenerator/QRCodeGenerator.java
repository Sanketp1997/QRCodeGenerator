package QRCodeGenerator;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class QRCodeGenerator
    {
        public static void main(String[] args) throws Exception
        {
            String details = "Welcome User! This QR Code is Generated using Java.";

            ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();   //Feel Free to Play with image type.

            File f = new File("path_where_you_want_to_save_the_image/MyQR.jpg"); //Type the Complete Path Where you want to save the generated QRCode.
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(out.toByteArray());
            fos.flush();

        }

    }
