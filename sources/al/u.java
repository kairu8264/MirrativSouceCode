package al;

import cl.a0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public class u implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final File f13886a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13887b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13888c;

    public u(String str, String str2, File file) {
        this.f13887b = str;
        this.f13888c = str2;
        this.f13886a = file;
    }

    @Override // al.a0
    public a0.d.b a() {
        byte[] c10 = c();
        if (c10 != null) {
            return a0.d.b.a().b(c10).c(this.f13887b).a();
        }
        return null;
    }

    @Override // al.a0
    public String b() {
        return this.f13888c;
    }

    public final byte[] c() {
        byte[] bArr = new byte[8192];
        try {
            InputStream stream = getStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (stream == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (stream != null) {
                    stream.close();
                }
                return null;
            }
            while (true) {
                try {
                    int read = stream.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        stream.close();
                        return byteArray;
                    }
                } catch (Throwable th2) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // al.a0
    public InputStream getStream() {
        if (this.f13886a.exists() && this.f13886a.isFile()) {
            try {
                return new FileInputStream(this.f13886a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
