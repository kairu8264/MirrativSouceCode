package b6;

import co.l;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jo.h;
import jo.p;
import jo.q;
import rp.f0;
import rp.i;
import rp.j;
import rp.t;
import rp.y;
import so.n;
import so.o;
import uo.b3;
import uo.k0;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;

/* loaded from: classes.dex */
public final class b implements Closeable, Flushable {
    public static final a O = new a(null);
    public static final so.e P = new so.e("[a-z0-9_-]{1,120}");
    public final y A;
    public final y B;
    public final y C;
    public final LinkedHashMap<String, c> D;
    public final q0 E;
    public long F;
    public int G;
    public rp.d H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final e N;

    /* renamed from: w  reason: collision with root package name */
    public final y f16983w;

    /* renamed from: x  reason: collision with root package name */
    public final long f16984x;

    /* renamed from: y  reason: collision with root package name */
    public final int f16985y;

    /* renamed from: z  reason: collision with root package name */
    public final int f16986z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* renamed from: b6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0102b {

        /* renamed from: a  reason: collision with root package name */
        public final c f16987a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f16988b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f16989c;

        public C0102b(c cVar) {
            this.f16987a = cVar;
            this.f16989c = new boolean[b.this.f16986z];
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public final d c() {
            d K;
            b bVar = b.this;
            synchronized (bVar) {
                b();
                K = bVar.K(g().d());
            }
            return K;
        }

        public final void d(boolean z10) {
            b bVar = b.this;
            synchronized (bVar) {
                if (!this.f16988b) {
                    if (p.c(g().b(), this)) {
                        bVar.F(this, z10);
                    }
                    this.f16988b = true;
                    v vVar = v.f59242a;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            }
        }

        public final void e() {
            if (p.c(this.f16987a.b(), this)) {
                this.f16987a.m(true);
            }
        }

        public final y f(int i10) {
            y yVar;
            b bVar = b.this;
            synchronized (bVar) {
                if (!this.f16988b) {
                    h()[i10] = true;
                    y yVar2 = g().c().get(i10);
                    o6.e.a(bVar.N, yVar2);
                    yVar = yVar2;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            }
            return yVar;
        }

        public final c g() {
            return this.f16987a;
        }

        public final boolean[] h() {
            return this.f16989c;
        }
    }

    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f16991a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f16992b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<y> f16993c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<y> f16994d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f16995e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f16996f;

        /* renamed from: g  reason: collision with root package name */
        public C0102b f16997g;

        /* renamed from: h  reason: collision with root package name */
        public int f16998h;

        public c(String str) {
            this.f16991a = str;
            this.f16992b = new long[b.this.f16986z];
            this.f16993c = new ArrayList<>(b.this.f16986z);
            this.f16994d = new ArrayList<>(b.this.f16986z);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int i10 = b.this.f16986z;
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.f16993c.add(b.this.f16983w.p(sb2.toString()));
                sb2.append(".tmp");
                this.f16994d.add(b.this.f16983w.p(sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final ArrayList<y> a() {
            return this.f16993c;
        }

        public final C0102b b() {
            return this.f16997g;
        }

        public final ArrayList<y> c() {
            return this.f16994d;
        }

        public final String d() {
            return this.f16991a;
        }

        public final long[] e() {
            return this.f16992b;
        }

        public final int f() {
            return this.f16998h;
        }

        public final boolean g() {
            return this.f16995e;
        }

        public final boolean h() {
            return this.f16996f;
        }

        public final void i(C0102b c0102b) {
            this.f16997g = c0102b;
        }

        public final void j(List<String> list) {
            if (list.size() == b.this.f16986z) {
                int i10 = 0;
                try {
                    int size = list.size();
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        this.f16992b[i10] = Long.parseLong(list.get(i10));
                        i10 = i11;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException(p.o("unexpected journal line: ", list));
                }
            }
            throw new IOException(p.o("unexpected journal line: ", list));
        }

        public final void k(int i10) {
            this.f16998h = i10;
        }

        public final void l(boolean z10) {
            this.f16995e = z10;
        }

        public final void m(boolean z10) {
            this.f16996f = z10;
        }

        public final d n() {
            if (this.f16995e && this.f16997g == null && !this.f16996f) {
                ArrayList<y> arrayList = this.f16993c;
                b bVar = b.this;
                int i10 = 0;
                int size = arrayList.size();
                while (i10 < size) {
                    int i11 = i10 + 1;
                    if (!bVar.N.j(arrayList.get(i10))) {
                        try {
                            bVar.Y(this);
                        } catch (IOException unused) {
                        }
                        return null;
                    }
                    i10 = i11;
                }
                this.f16998h++;
                return new d(this);
            }
            return null;
        }

        public final void o(rp.d dVar) {
            long[] jArr = this.f16992b;
            int length = jArr.length;
            int i10 = 0;
            while (i10 < length) {
                long j10 = jArr[i10];
                i10++;
                dVar.b1(32).J0(j10);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class d implements Closeable {

        /* renamed from: w  reason: collision with root package name */
        public final c f17000w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f17001x;

        public d(c cVar) {
            this.f17000w = cVar;
        }

        public final C0102b a() {
            C0102b I;
            b bVar = b.this;
            synchronized (bVar) {
                close();
                I = bVar.I(d().d());
            }
            return I;
        }

        public final y c(int i10) {
            if (!this.f17001x) {
                return this.f17000w.a().get(i10);
            }
            throw new IllegalStateException("snapshot is closed".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f17001x) {
                return;
            }
            this.f17001x = true;
            b bVar = b.this;
            synchronized (bVar) {
                c d10 = d();
                d10.k(d10.f() - 1);
                if (d().f() == 0 && d().h()) {
                    bVar.Y(d());
                }
                v vVar = v.f59242a;
            }
        }

        public final c d() {
            return this.f17000w;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends j {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ i f17003f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i iVar) {
            super(iVar);
            this.f17003f = iVar;
        }

        @Override // rp.j, rp.i
        public f0 p(y yVar, boolean z10) {
            y n10 = yVar.n();
            if (n10 != null) {
                d(n10);
            }
            return super.p(yVar, z10);
        }
    }

    @co.f(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17004w;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f17004w == 0) {
                m.b(obj);
                b bVar = b.this;
                synchronized (bVar) {
                    if (bVar.J && !bVar.K) {
                        try {
                            bVar.d0();
                        } catch (IOException unused) {
                            bVar.L = true;
                        }
                        try {
                            if (bVar.N()) {
                                bVar.i0();
                            }
                        } catch (IOException unused2) {
                            bVar.M = true;
                            bVar.H = t.b(t.a());
                        }
                        return v.f59242a;
                    }
                    return v.f59242a;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements io.l<IOException, v> {
        public g() {
            super(1);
        }

        public final void a(IOException iOException) {
            b.this.I = true;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(IOException iOException) {
            a(iOException);
            return v.f59242a;
        }
    }

    public b(i iVar, y yVar, k0 k0Var, long j10, int i10, int i11) {
        this.f16983w = yVar;
        this.f16984x = j10;
        this.f16985y = i10;
        this.f16986z = i11;
        if (!(j10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (i11 > 0) {
            this.A = yVar.p("journal");
            this.B = yVar.p("journal.tmp");
            this.C = yVar.p("journal.bkp");
            this.D = new LinkedHashMap<>(0, 0.75f, true);
            this.E = r0.a(b3.b(null, 1, null).plus(k0Var.d0(1)));
            this.N = new e(iVar);
            return;
        }
        throw new IllegalArgumentException("valueCount <= 0".toString());
    }

    public final void E() {
        if (!(!this.K)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public final synchronized void F(C0102b c0102b, boolean z10) {
        c g10 = c0102b.g();
        if (p.c(g10.b(), c0102b)) {
            int i10 = 0;
            if (z10 && !g10.h()) {
                int i11 = this.f16986z;
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = i12 + 1;
                    if (c0102b.h()[i12] && !this.N.j(g10.c().get(i12))) {
                        c0102b.a();
                        return;
                    }
                    i12 = i13;
                }
                int i14 = this.f16986z;
                while (i10 < i14) {
                    int i15 = i10 + 1;
                    y yVar = g10.c().get(i10);
                    y yVar2 = g10.a().get(i10);
                    if (this.N.j(yVar)) {
                        this.N.c(yVar, yVar2);
                    } else {
                        o6.e.a(this.N, g10.a().get(i10));
                    }
                    long j10 = g10.e()[i10];
                    Long d10 = this.N.l(yVar2).d();
                    long longValue = d10 == null ? 0L : d10.longValue();
                    g10.e()[i10] = longValue;
                    this.F = (this.F - j10) + longValue;
                    i10 = i15;
                }
            } else {
                int i16 = this.f16986z;
                while (i10 < i16) {
                    this.N.h(g10.c().get(i10));
                    i10++;
                }
            }
            g10.i(null);
            if (g10.h()) {
                Y(g10);
                return;
            }
            this.G++;
            rp.d dVar = this.H;
            p.e(dVar);
            if (!z10 && !g10.g()) {
                this.D.remove(g10.d());
                dVar.a0("REMOVE");
                dVar.b1(32);
                dVar.a0(g10.d());
                dVar.b1(10);
                dVar.flush();
                if (this.F <= this.f16984x || N()) {
                    O();
                }
                return;
            }
            g10.l(true);
            dVar.a0("CLEAN");
            dVar.b1(32);
            dVar.a0(g10.d());
            g10.o(dVar);
            dVar.b1(10);
            dVar.flush();
            if (this.F <= this.f16984x) {
            }
            O();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void G() {
        close();
        o6.e.b(this.N, this.f16983w);
    }

    public final synchronized C0102b I(String str) {
        E();
        h0(str);
        L();
        c cVar = this.D.get(str);
        if ((cVar == null ? null : cVar.b()) != null) {
            return null;
        }
        if (cVar == null || cVar.f() == 0) {
            if (!this.L && !this.M) {
                rp.d dVar = this.H;
                p.e(dVar);
                dVar.a0("DIRTY");
                dVar.b1(32);
                dVar.a0(str);
                dVar.b1(10);
                dVar.flush();
                if (this.I) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new c(str);
                    this.D.put(str, cVar);
                }
                C0102b c0102b = new C0102b(cVar);
                cVar.i(c0102b);
                return c0102b;
            }
            O();
            return null;
        }
        return null;
    }

    public final synchronized d K(String str) {
        E();
        h0(str);
        L();
        c cVar = this.D.get(str);
        d n10 = cVar == null ? null : cVar.n();
        if (n10 == null) {
            return null;
        }
        this.G++;
        rp.d dVar = this.H;
        p.e(dVar);
        dVar.a0("READ");
        dVar.b1(32);
        dVar.a0(str);
        dVar.b1(10);
        if (N()) {
            O();
        }
        return n10;
    }

    public final synchronized void L() {
        if (this.J) {
            return;
        }
        this.N.h(this.B);
        if (this.N.j(this.C)) {
            if (this.N.j(this.A)) {
                this.N.h(this.C);
            } else {
                this.N.c(this.C, this.A);
            }
        }
        if (this.N.j(this.A)) {
            try {
                U();
                S();
                this.J = true;
                return;
            } catch (IOException unused) {
                G();
                this.K = false;
            }
        }
        i0();
        this.J = true;
    }

    public final boolean N() {
        return this.G >= 2000;
    }

    public final void O() {
        uo.l.d(this.E, null, null, new f(null), 3, null);
    }

    public final rp.d P() {
        return t.b(new b6.c(this.N.a(this.A), new g()));
    }

    public final void S() {
        Iterator<c> it = this.D.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            c next = it.next();
            int i10 = 0;
            if (next.b() == null) {
                int i11 = this.f16986z;
                while (i10 < i11) {
                    j10 += next.e()[i10];
                    i10++;
                }
            } else {
                next.i(null);
                int i12 = this.f16986z;
                while (i10 < i12) {
                    this.N.h(next.a().get(i10));
                    this.N.h(next.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.F = j10;
    }

    public final void U() {
        v vVar;
        rp.e c10 = t.c(this.N.q(this.A));
        Throwable th2 = null;
        try {
            String s02 = c10.s0();
            String s03 = c10.s0();
            String s04 = c10.s0();
            String s05 = c10.s0();
            String s06 = c10.s0();
            if (p.c("libcore.io.DiskLruCache", s02) && p.c(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, s03) && p.c(String.valueOf(this.f16985y), s04) && p.c(String.valueOf(this.f16986z), s05)) {
                int i10 = 0;
                if (!(s06.length() > 0)) {
                    while (true) {
                        try {
                            X(c10.s0());
                            i10++;
                        } catch (EOFException unused) {
                            this.G = i10 - this.D.size();
                            if (!c10.a1()) {
                                i0();
                            } else {
                                this.H = P();
                            }
                            vVar = v.f59242a;
                            if (c10 != null) {
                                try {
                                    c10.close();
                                } catch (Throwable th3) {
                                    if (th2 == null) {
                                        th2 = th3;
                                    } else {
                                        wn.a.a(th2, th3);
                                    }
                                }
                            }
                            if (th2 == null) {
                                p.e(vVar);
                                return;
                            }
                            throw th2;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + s02 + ", " + s03 + ", " + s04 + ", " + s05 + ", " + s06 + ']');
        } catch (Throwable th4) {
            th2 = th4;
            vVar = null;
        }
    }

    public final void X(String str) {
        String substring;
        int T = o.T(str, ' ', 0, false, 6, null);
        if (T != -1) {
            int i10 = T + 1;
            int T2 = o.T(str, ' ', i10, false, 4, null);
            if (T2 == -1) {
                substring = str.substring(i10);
                p.g(substring, "this as java.lang.String).substring(startIndex)");
                if (T == 6 && n.C(str, "REMOVE", false, 2, null)) {
                    this.D.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, T2);
                p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            LinkedHashMap<String, c> linkedHashMap = this.D;
            c cVar = linkedHashMap.get(substring);
            if (cVar == null) {
                cVar = new c(substring);
                linkedHashMap.put(substring, cVar);
            }
            c cVar2 = cVar;
            if (T2 != -1 && T == 5 && n.C(str, "CLEAN", false, 2, null)) {
                String substring2 = str.substring(T2 + 1);
                p.g(substring2, "this as java.lang.String).substring(startIndex)");
                List<String> q02 = o.q0(substring2, new char[]{' '}, false, 0, 6, null);
                cVar2.l(true);
                cVar2.i(null);
                cVar2.j(q02);
                return;
            } else if (T2 == -1 && T == 5 && n.C(str, "DIRTY", false, 2, null)) {
                cVar2.i(new C0102b(cVar2));
                return;
            } else if (T2 != -1 || T != 4 || !n.C(str, "READ", false, 2, null)) {
                throw new IOException(p.o("unexpected journal line: ", str));
            } else {
                return;
            }
        }
        throw new IOException(p.o("unexpected journal line: ", str));
    }

    public final boolean Y(c cVar) {
        rp.d dVar;
        if (cVar.f() > 0 && (dVar = this.H) != null) {
            dVar.a0("DIRTY");
            dVar.b1(32);
            dVar.a0(cVar.d());
            dVar.b1(10);
            dVar.flush();
        }
        if (cVar.f() <= 0 && cVar.b() == null) {
            C0102b b10 = cVar.b();
            if (b10 != null) {
                b10.e();
            }
            int i10 = this.f16986z;
            for (int i11 = 0; i11 < i10; i11++) {
                this.N.h(cVar.a().get(i11));
                this.F -= cVar.e()[i11];
                cVar.e()[i11] = 0;
            }
            this.G++;
            rp.d dVar2 = this.H;
            if (dVar2 != null) {
                dVar2.a0("REMOVE");
                dVar2.b1(32);
                dVar2.a0(cVar.d());
                dVar2.b1(10);
            }
            this.D.remove(cVar.d());
            if (N()) {
                O();
            }
            return true;
        }
        cVar.m(true);
        return true;
    }

    public final boolean c0() {
        for (c cVar : this.D.values()) {
            if (!cVar.h()) {
                Y(cVar);
                return true;
            }
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        C0102b b10;
        if (this.J && !this.K) {
            int i10 = 0;
            Object[] array = this.D.values().toArray(new c[0]);
            if (array != null) {
                c[] cVarArr = (c[]) array;
                int length = cVarArr.length;
                while (i10 < length) {
                    c cVar = cVarArr[i10];
                    i10++;
                    if (cVar.b() != null && (b10 = cVar.b()) != null) {
                        b10.e();
                    }
                }
                d0();
                r0.d(this.E, null, 1, null);
                rp.d dVar = this.H;
                p.e(dVar);
                dVar.close();
                this.H = null;
                this.K = true;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        this.K = true;
    }

    public final void d0() {
        while (this.F > this.f16984x) {
            if (!c0()) {
                return;
            }
        }
        this.L = false;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.J) {
            E();
            d0();
            rp.d dVar = this.H;
            p.e(dVar);
            dVar.flush();
        }
    }

    public final void h0(String str) {
        if (P.a(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final synchronized void i0() {
        v vVar;
        rp.d dVar = this.H;
        if (dVar != null) {
            dVar.close();
        }
        rp.d b10 = t.b(this.N.p(this.B, false));
        Throwable th2 = null;
        try {
            b10.a0("libcore.io.DiskLruCache").b1(10);
            b10.a0(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).b1(10);
            b10.J0(this.f16985y).b1(10);
            b10.J0(this.f16986z).b1(10);
            b10.b1(10);
            for (c cVar : this.D.values()) {
                if (cVar.b() != null) {
                    b10.a0("DIRTY");
                    b10.b1(32);
                    b10.a0(cVar.d());
                    b10.b1(10);
                } else {
                    b10.a0("CLEAN");
                    b10.b1(32);
                    b10.a0(cVar.d());
                    cVar.o(b10);
                    b10.b1(10);
                }
            }
            vVar = v.f59242a;
        } catch (Throwable th3) {
            vVar = null;
            th2 = th3;
        }
        if (b10 != null) {
            b10.close();
        }
        if (th2 == null) {
            p.e(vVar);
            if (this.N.j(this.A)) {
                this.N.c(this.A, this.C);
                this.N.c(this.B, this.A);
                this.N.h(this.C);
            } else {
                this.N.c(this.B, this.A);
            }
            this.H = P();
            this.G = 0;
            this.I = false;
            this.M = false;
        } else {
            throw th2;
        }
    }
}
