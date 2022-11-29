package b6;

import io.l;
import java.io.IOException;
import rp.f0;
import rp.k;
import wn.v;

/* loaded from: classes.dex */
public final class c extends k {

    /* renamed from: x  reason: collision with root package name */
    public final l<IOException, v> f17007x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f17008y;

    /* JADX WARN: Multi-variable type inference failed */
    public c(f0 f0Var, l<? super IOException, v> lVar) {
        super(f0Var);
        this.f17007x = lVar;
    }

    @Override // rp.k, rp.f0
    public void O0(rp.c cVar, long j10) {
        if (this.f17008y) {
            cVar.k(j10);
            return;
        }
        try {
            super.O0(cVar, j10);
        } catch (IOException e10) {
            this.f17008y = true;
            this.f17007x.invoke(e10);
        }
    }

    @Override // rp.k, rp.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f17008y = true;
            this.f17007x.invoke(e10);
        }
    }

    @Override // rp.k, rp.f0, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.f17008y = true;
            this.f17007x.invoke(e10);
        }
    }
}
