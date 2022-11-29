package a6;

import a6.q;
import java.io.File;
import rp.y;

/* loaded from: classes.dex */
public final class t extends q {
    public y A;

    /* renamed from: w  reason: collision with root package name */
    public final File f541w;

    /* renamed from: x  reason: collision with root package name */
    public final q.a f542x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f543y;

    /* renamed from: z  reason: collision with root package name */
    public rp.e f544z;

    public t(rp.e eVar, File file, q.a aVar) {
        super(null);
        this.f541w = file;
        this.f542x = aVar;
        this.f544z = eVar;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("cacheDirectory must be a directory.".toString());
        }
    }

    @Override // a6.q
    public synchronized y a() {
        Long l10;
        h();
        y yVar = this.A;
        if (yVar == null) {
            y d10 = y.a.d(y.f51736x, File.createTempFile("tmp", null, this.f541w), false, 1, null);
            rp.d b10 = rp.t.b(i().p(d10, false));
            try {
                rp.e eVar = this.f544z;
                jo.p.e(eVar);
                l10 = Long.valueOf(b10.H0(eVar));
                th = null;
            } catch (Throwable th2) {
                th = th2;
                l10 = null;
            }
            if (b10 != null) {
                b10.close();
            }
            if (th == null) {
                jo.p.e(l10);
                this.f544z = null;
                this.A = d10;
                return d10;
            }
            throw th;
        }
        return yVar;
    }

    @Override // a6.q
    public synchronized y c() {
        h();
        return this.A;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f543y = true;
        rp.e eVar = this.f544z;
        if (eVar != null) {
            o6.k.c(eVar);
        }
        y yVar = this.A;
        if (yVar != null) {
            i().h(yVar);
        }
    }

    @Override // a6.q
    public q.a d() {
        return this.f542x;
    }

    @Override // a6.q
    public synchronized rp.e e() {
        h();
        rp.e eVar = this.f544z;
        if (eVar == null) {
            rp.i i10 = i();
            y yVar = this.A;
            jo.p.e(yVar);
            rp.e c10 = rp.t.c(i10.q(yVar));
            this.f544z = c10;
            return c10;
        }
        return eVar;
    }

    public final void h() {
        if (!(!this.f543y)) {
            throw new IllegalStateException("closed".toString());
        }
    }

    public rp.i i() {
        return rp.i.f51697b;
    }
}
