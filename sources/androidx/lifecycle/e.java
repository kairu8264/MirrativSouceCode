package androidx.lifecycle;

import java.io.Closeable;
import uo.i2;

/* loaded from: classes.dex */
public final class e implements Closeable, uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final ao.g f15533w;

    public e(ao.g gVar) {
        jo.p.h(gVar, "context");
        this.f15533w = gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        i2.e(getCoroutineContext(), null, 1, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f15533w;
    }
}
