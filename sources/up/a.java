package up;

import java.io.Serializable;
import java.io.Writer;

/* loaded from: classes4.dex */
public class a extends Writer implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final StringBuilder f56103w;

    public a(int i10) {
        this.f56103w = new StringBuilder(i10);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.f56103w.toString();
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f56103w.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        if (cArr != null) {
            this.f56103w.append(cArr, i10, i11);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) {
        this.f56103w.append(c10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f56103w.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        this.f56103w.append(charSequence, i10, i11);
        return this;
    }
}
