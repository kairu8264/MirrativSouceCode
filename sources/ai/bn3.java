package ai;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public class bn3 implements Iterator<h54>, Closeable, i54 {
    public static final h54 C = new an3("eof ");
    public static final in3 D = in3.b(bn3.class);

    /* renamed from: w  reason: collision with root package name */
    public e54 f2418w;

    /* renamed from: x  reason: collision with root package name */
    public cn3 f2419x;

    /* renamed from: y  reason: collision with root package name */
    public h54 f2420y = null;

    /* renamed from: z  reason: collision with root package name */
    public long f2421z = 0;
    public long A = 0;
    public final List<h54> B = new ArrayList();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public final List<h54> e() {
        return (this.f2419x == null || this.f2420y == C) ? this.B : new hn3(this.B, this);
    }

    public final void h(cn3 cn3Var, long j10, e54 e54Var) throws IOException {
        this.f2419x = cn3Var;
        this.f2421z = cn3Var.b();
        cn3Var.u(cn3Var.b() + j10);
        this.A = cn3Var.b();
        this.f2418w = e54Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        h54 h54Var = this.f2420y;
        if (h54Var == C) {
            return false;
        }
        if (h54Var != null) {
            return true;
        }
        try {
            this.f2420y = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f2420y = C;
            return false;
        }
    }

    @Override // java.util.Iterator
    /* renamed from: i */
    public final h54 next() {
        h54 a10;
        h54 h54Var = this.f2420y;
        if (h54Var != null && h54Var != C) {
            this.f2420y = null;
            return h54Var;
        }
        cn3 cn3Var = this.f2419x;
        if (cn3Var != null && this.f2421z < this.A) {
            try {
                synchronized (cn3Var) {
                    this.f2419x.u(this.f2421z);
                    a10 = this.f2418w.a(this.f2419x, this);
                    this.f2421z = this.f2419x.b();
                }
                return a10;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.f2420y = C;
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i10 = 0; i10 < this.B.size(); i10++) {
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(this.B.get(i10).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }
}
