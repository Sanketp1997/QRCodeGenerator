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

            ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();

            File f = new File("/home/sanketp/Desktop/folder/MyQR.jpg");
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(out.toByteArray());
            fos.flush();

        }

    }