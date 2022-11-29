package al;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public class b0 {
    public static void a(InputStream inputStream, File file) throws IOException {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream2.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream2.finish();
                        g.f(gZIPOutputStream2);
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    g.f(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void b(File file, List<a0> list) {
        for (a0 a0Var : list) {
            InputStream inputStream = null;
            try {
                inputStream = a0Var.getStream();
                if (inputStream != null) {
                    a(inputStream, new File(file, a0Var.b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                g.f(null);
                throw th2;
            }
            g.f(inputStream);
        }
    }
}
