package v4;

import java.util.concurrent.Executor;
import v4.q0;

/* loaded from: classes.dex */
public final class h0 implements z4.h, r {

    /* renamed from: w  reason: collision with root package name */
    public final z4.h f56617w;

    /* renamed from: x  reason: collision with root package name */
    public final q0.f f56618x;

    /* renamed from: y  reason: collision with root package name */
    public final Executor f56619y;

    public h0(z4.h hVar, q0.f fVar, Executor executor) {
        this.f56617w = hVar;
        this.f56618x = fVar;
        this.f56619y = executor;
    }

    @Override // v4.r
    public z4.h a() {
        return this.f56617w;
    }

    @Override // z4.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f56617w.close();
    }

    @Override // z4.h
    public String getDatabaseName() {
        return this.f56617w.getDatabaseName();
    }

    @Override // z4.h
    public z4.g getReadableDatabase() {
        return new g0(this.f56617w.getReadableDatabase(), this.f56618x, this.f56619y);
    }

    @Override // z4.h
    public z4.g getWritableDatabase() {
        return new g0(this.f56617w.getWritableDatabase(), this.f56618x, this.f56619y);
    }

    @Override // z4.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f56617w.setWriteAheadLoggingEnabled(z10);
    }
}
