package b6;

import b6.a;
import b6.b;
import jo.h;
import rp.f;
import rp.i;
import rp.y;
import uo.k0;

/* loaded from: classes.dex */
public final class d implements b6.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f17009e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final long f17010a;

    /* renamed from: b  reason: collision with root package name */
    public final y f17011b;

    /* renamed from: c  reason: collision with root package name */
    public final i f17012c;

    /* renamed from: d  reason: collision with root package name */
    public final b6.b f17013d;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final b.C0102b f17014a;

        public b(b.C0102b c0102b) {
            this.f17014a = c0102b;
        }

        @Override // b6.a.b
        /* renamed from: a */
        public c g() {
            b.d c10 = this.f17014a.c();
            if (c10 == null) {
                return null;
            }
            return new c(c10);
        }

        @Override // b6.a.b
        public y f() {
            return this.f17014a.f(1);
        }

        @Override // b6.a.b
        public y getMetadata() {
            return this.f17014a.f(0);
        }

        @Override // b6.a.b
        public void h() {
            this.f17014a.a();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements a.c {

        /* renamed from: w  reason: collision with root package name */
        public final b.d f17015w;

        public c(b.d dVar) {
            this.f17015w = dVar;
        }

        @Override // b6.a.c
        /* renamed from: a */
        public b s1() {
            b.C0102b a10 = this.f17015w.a();
            if (a10 == null) {
                return null;
            }
            return new b(a10);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f17015w.close();
        }

        @Override // b6.a.c
        public y f() {
            return this.f17015w.c(1);
        }

        @Override // b6.a.c
        public y getMetadata() {
            return this.f17015w.c(0);
        }
    }

    public d(long j10, y yVar, i iVar, k0 k0Var) {
        this.f17010a = j10;
        this.f17011b = yVar;
        this.f17012c = iVar;
        this.f17013d = new b6.b(b(), d(), k0Var, e(), 1, 2);
    }

    @Override // b6.a
    public a.c a(String str) {
        b.d K = this.f17013d.K(f(str));
        if (K == null) {
            return null;
        }
        return new c(K);
    }

    @Override // b6.a
    public i b() {
        return this.f17012c;
    }

    @Override // b6.a
    public a.b c(String str) {
        b.C0102b I = this.f17013d.I(f(str));
        if (I == null) {
            return null;
        }
        return new b(I);
    }

    public y d() {
        return this.f17011b;
    }

    public long e() {
        return this.f17010a;
    }

    public final String f(String str) {
        return f.f51677z.d(str).F().q();
    }
}
