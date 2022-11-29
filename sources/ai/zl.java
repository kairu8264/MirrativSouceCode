package ai;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zl {

    /* renamed from: a  reason: collision with root package name */
    public ByteArrayOutputStream f13024a = new ByteArrayOutputStream(4096);

    /* renamed from: b  reason: collision with root package name */
    public Base64OutputStream f13025b = new Base64OutputStream(this.f13024a, 10);

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ByteArrayOutputStream, android.util.Base64OutputStream] */
    public final String toString() {
        try {
            this.f13025b.close();
        } catch (IOException e10) {
            uj0.d("HashManager: Unable to convert to Base64.", e10);
        }
        try {
            this.f13024a.close();
            return this.f13024a.toString();
        } catch (IOException e11) {
            uj0.d("HashManager: Unable to convert to Base64.", e11);
            return "";
        } finally {
            this.f13024a = null;
            this.f13025b = null;
        }
    }
}
