package al;

import cl.a0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public class e implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13753a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13754b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13755c;

    public e(String str, String str2, byte[] bArr) {
        this.f13754b = str;
        this.f13755c = str2;
        this.f13753a = bArr;
    }

    @Override // al.a0
    public a0.d.b a() {
        byte[] c10 = c();
        if (c10 == null) {
            return null;
        }
        return a0.d.b.a().b(c10).c(this.f13754b).a();
    }

    @Override // al.a0
    public String b() {
        return this.f13755c;
    }

    public final byte[] c() {
        if (d()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.f13753a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final boolean d() {
        byte[] bArr = this.f13753a;
        return bArr == null || bArr.length == 0;
    }

    @Override // al.a0
    public InputStream getStream() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f13753a);
    }
}
