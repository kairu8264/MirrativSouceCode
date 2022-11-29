package rp;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class p implements h0 {

    /* renamed from: w  reason: collision with root package name */
    public final InputStream f51727w;

    /* renamed from: x  reason: collision with root package name */
    public final i0 f51728x;

    public p(InputStream inputStream, i0 i0Var) {
        jo.p.h(inputStream, "input");
        jo.p.h(i0Var, "timeout");
        this.f51727w = inputStream;
        this.f51728x = i0Var;
    }

    @Override // rp.h0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f51727w.close();
    }

    @Override // rp.h0
    public long f1(c cVar, long j10) {
        jo.p.h(cVar, "sink");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return 0L;
        }
        if (i10 >= 0) {
            try {
                this.f51728x.f();
                c0 d02 = cVar.d0(1);
                int read = this.f51727w.read(d02.f51665a, d02.f51667c, (int) Math.min(j10, 8192 - d02.f51667c));
                if (read == -1) {
                    if (d02.f51666b == d02.f51667c) {
                        cVar.f51656w = d02.b();
                        d0.b(d02);
                        return -1L;
                    }
                    return -1L;
                }
                d02.f51667c += read;
                long j11 = read;
                cVar.O(cVar.X() + j11);
                return j11;
            } catch (AssertionError e10) {
                if (t.d(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }
        throw new IllegalArgumentException(jo.p.o("byteCount < 0: ", Long.valueOf(j10)).toString());
    }

    @Override // rp.h0
    public i0 m() {
        return this.f51728x;
    }

    public String toString() {
        return "source(" + this.f51727w + ')';
    }
}
