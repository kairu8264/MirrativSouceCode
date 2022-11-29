package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class f0 extends Writer {

    /* renamed from: w  reason: collision with root package name */
    public final String f15334w;

    /* renamed from: x  reason: collision with root package name */
    public StringBuilder f15335x = new StringBuilder(128);

    public f0(String str) {
        this.f15334w = str;
    }

    public final void a() {
        if (this.f15335x.length() > 0) {
            Log.d(this.f15334w, this.f15335x.toString());
            StringBuilder sb2 = this.f15335x;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f15335x.append(c10);
            }
        }
    }
}
