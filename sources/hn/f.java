package hn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* loaded from: classes4.dex */
public class f {
    public static byte[] a(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater b10 = b();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, b10);
        deflaterOutputStream.write(bArr, 0, bArr.length);
        deflaterOutputStream.close();
        b10.end();
        return byteArrayOutputStream.toByteArray();
    }

    public static Deflater b() {
        return new Deflater(-1, true);
    }
}
