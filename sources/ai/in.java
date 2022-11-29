package ai;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes3.dex */
public final class in extends PushbackInputStream {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ jn f5301w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(jn jnVar, InputStream inputStream, int i10) {
        super(inputStream, 1);
        this.f5301w = jnVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        ln.f(this.f5301w.f5848y);
        super.close();
    }
}
