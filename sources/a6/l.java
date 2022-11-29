package a6;

import a6.q;
import java.io.Closeable;
import rp.y;

/* loaded from: classes.dex */
public final class l extends q {
    public final q.a A;
    public boolean B;
    public rp.e C;

    /* renamed from: w  reason: collision with root package name */
    public final y f495w;

    /* renamed from: x  reason: collision with root package name */
    public final rp.i f496x;

    /* renamed from: y  reason: collision with root package name */
    public final String f497y;

    /* renamed from: z  reason: collision with root package name */
    public final Closeable f498z;

    public l(y yVar, rp.i iVar, String str, Closeable closeable, q.a aVar) {
        super(null);
        this.f495w = yVar;
        this.f496x = iVar;
        this.f497y = str;
        this.f498z = closeable;
        this.A = aVar;
    }

    @Override // a6.q
    public synchronized y a() {
        h();
        return this.f495w;
    }

    @Override // a6.q
    public y c() {
        return a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.B = true;
        rp.e eVar = this.C;
        if (eVar != null) {
            o6.k.c(eVar);
        }
        Closeable closeable = this.f498z;
        if (closeable != null) {
            o6.k.c(closeable);
        }
    }

    @Override // a6.q
    public q.a d() {
        return this.A;
    }

    @Override // a6.q
    public synchronized rp.e e() {
        h();
        rp.e eVar = this.C;
        if (eVar == null) {
            rp.e c10 = rp.t.c(j().q(this.f495w));
            this.C = c10;
            return c10;
        }
        return eVar;
    }

    public final void h() {
        if (!(!this.B)) {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final String i() {
        return this.f497y;
    }

    public rp.i j() {
        return this.f496x;
    }
}
