package ai;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* loaded from: classes3.dex */
public final class t44 extends FilterInputStream {

    /* renamed from: w  reason: collision with root package name */
    public final HttpURLConnection f10146w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t44(java.net.HttpURLConnection r2) {
        /*
            r1 = this;
            java.io.InputStream r0 = r2.getInputStream()     // Catch: java.io.IOException -> L5
            goto L9
        L5:
            java.io.InputStream r0 = r2.getErrorStream()
        L9:
            r1.<init>(r0)
            r1.f10146w = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.t44.<init>(java.net.HttpURLConnection):void");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f10146w.disconnect();
    }
}
