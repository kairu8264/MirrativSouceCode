package mp;

import com.dena.mirrorman.net.api.Referer;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import jo.d0;
import jo.e0;
import jo.p;
import mp.g;
import wn.v;

/* loaded from: classes4.dex */
public final class e implements Closeable {
    public static final mp.l Y;
    public static final c Z = new c(null);
    public int A;
    public int B;
    public boolean C;
    public final ip.e D;
    public final ip.d E;
    public final ip.d F;
    public final ip.d G;
    public final mp.k H;
    public long I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public final mp.l O;
    public mp.l P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public final Socket U;
    public final mp.i V;
    public final C0608e W;
    public final Set<Integer> X;

    /* renamed from: w */
    public final boolean f41262w;

    /* renamed from: x */
    public final d f41263x;

    /* renamed from: y */
    public final Map<Integer, mp.h> f41264y;

    /* renamed from: z */
    public final String f41265z;

    /* loaded from: classes4.dex */
    public static final class a extends ip.a {

        /* renamed from: e */
        public final /* synthetic */ String f41266e;

        /* renamed from: f */
        public final /* synthetic */ e f41267f;

        /* renamed from: g */
        public final /* synthetic */ long f41268g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, e eVar, long j10) {
            super(str2, false, 2, null);
            this.f41266e = str;
            this.f41267f = eVar;
            this.f41268g = j10;
        }

        @Override // ip.a
        public long f() {
            boolean z10;
            synchronized (this.f41267f) {
                if (this.f41267f.J < this.f41267f.I) {
                    z10 = true;
                } else {
                    this.f41267f.I++;
                    z10 = false;
                }
            }
            if (z10) {
                this.f41267f.L(null);
                return -1L;
            }
            this.f41267f.Y0(false, 1, 0);
            return this.f41268g;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        public Socket f41269a;

        /* renamed from: b */
        public String f41270b;

        /* renamed from: c */
        public rp.e f41271c;

        /* renamed from: d */
        public rp.d f41272d;

        /* renamed from: e */
        public d f41273e;

        /* renamed from: f */
        public mp.k f41274f;

        /* renamed from: g */
        public int f41275g;

        /* renamed from: h */
        public boolean f41276h;

        /* renamed from: i */
        public final ip.e f41277i;

        public b(boolean z10, ip.e eVar) {
            p.h(eVar, "taskRunner");
            this.f41276h = z10;
            this.f41277i = eVar;
            this.f41273e = d.f41278a;
            this.f41274f = mp.k.f41396a;
        }

        public final e a() {
            return new e(this);
        }

        public final boolean b() {
            return this.f41276h;
        }

        public final String c() {
            String str = this.f41270b;
            if (str == null) {
                p.v("connectionName");
            }
            return str;
        }

        public final d d() {
            return this.f41273e;
        }

        public final int e() {
            return this.f41275g;
        }

        public final mp.k f() {
            return this.f41274f;
        }

        public final rp.d g() {
            rp.d dVar = this.f41272d;
            if (dVar == null) {
                p.v("sink");
            }
            return dVar;
        }

        public final Socket h() {
            Socket socket = this.f41269a;
            if (socket == null) {
                p.v("socket");
            }
            return socket;
        }

        public final rp.e i() {
            rp.e eVar = this.f41271c;
            if (eVar == null) {
                p.v("source");
            }
            return eVar;
        }

        public final ip.e j() {
            return this.f41277i;
        }

        public final b k(d dVar) {
            p.h(dVar, "listener");
            this.f41273e = dVar;
            return this;
        }

        public final b l(int i10) {
            this.f41275g = i10;
            return this;
        }

        public final b m(Socket socket, String str, rp.e eVar, rp.d dVar) throws IOException {
            String str2;
            p.h(socket, "socket");
            p.h(str, "peerName");
            p.h(eVar, "source");
            p.h(dVar, "sink");
            this.f41269a = socket;
            if (this.f41276h) {
                str2 = fp.b.f32121i + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            this.f41270b = str2;
            this.f41271c = eVar;
            this.f41272d = dVar;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        public c() {
        }

        public final mp.l a() {
            return e.Y;
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class d {

        /* renamed from: b */
        public static final b f41279b = new b(null);

        /* renamed from: a */
        public static final d f41278a = new a();

        /* loaded from: classes4.dex */
        public static final class a extends d {
            @Override // mp.e.d
            public void b(mp.h hVar) throws IOException {
                p.h(hVar, "stream");
                hVar.d(mp.a.REFUSED_STREAM, null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(jo.h hVar) {
                this();
            }
        }

        public void a(e eVar, mp.l lVar) {
            p.h(eVar, "connection");
            p.h(lVar, Referer.SETTINGS);
        }

        public abstract void b(mp.h hVar) throws IOException;
    }

    /* renamed from: mp.e$e */
    /* loaded from: classes4.dex */
    public final class C0608e implements g.c, io.a<v> {

        /* renamed from: w */
        public final mp.g f41280w;

        /* renamed from: x */
        public final /* synthetic */ e f41281x;

        /* renamed from: mp.e$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends ip.a {

            /* renamed from: e */
            public final /* synthetic */ String f41282e;

            /* renamed from: f */
            public final /* synthetic */ boolean f41283f;

            /* renamed from: g */
            public final /* synthetic */ C0608e f41284g;

            /* renamed from: h */
            public final /* synthetic */ e0 f41285h;

            /* renamed from: i */
            public final /* synthetic */ boolean f41286i;

            /* renamed from: j */
            public final /* synthetic */ mp.l f41287j;

            /* renamed from: k */
            public final /* synthetic */ d0 f41288k;

            /* renamed from: l */
            public final /* synthetic */ e0 f41289l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, String str2, boolean z11, C0608e c0608e, e0 e0Var, boolean z12, mp.l lVar, d0 d0Var, e0 e0Var2) {
                super(str2, z11);
                this.f41282e = str;
                this.f41283f = z10;
                this.f41284g = c0608e;
                this.f41285h = e0Var;
                this.f41286i = z12;
                this.f41287j = lVar;
                this.f41288k = d0Var;
                this.f41289l = e0Var2;
            }

            @Override // ip.a
            public long f() {
                this.f41284g.f41281x.S().a(this.f41284g.f41281x, (mp.l) this.f41285h.f38136w);
                return -1L;
            }
        }

        /* renamed from: mp.e$e$b */
        /* loaded from: classes4.dex */
        public static final class b extends ip.a {

            /* renamed from: e */
            public final /* synthetic */ String f41290e;

            /* renamed from: f */
            public final /* synthetic */ boolean f41291f;

            /* renamed from: g */
            public final /* synthetic */ mp.h f41292g;

            /* renamed from: h */
            public final /* synthetic */ C0608e f41293h;

            /* renamed from: i */
            public final /* synthetic */ mp.h f41294i;

            /* renamed from: j */
            public final /* synthetic */ int f41295j;

            /* renamed from: k */
            public final /* synthetic */ List f41296k;

            /* renamed from: l */
            public final /* synthetic */ boolean f41297l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, String str2, boolean z11, mp.h hVar, C0608e c0608e, mp.h hVar2, int i10, List list, boolean z12) {
                super(str2, z11);
                this.f41290e = str;
                this.f41291f = z10;
                this.f41292g = hVar;
                this.f41293h = c0608e;
                this.f41294i = hVar2;
                this.f41295j = i10;
                this.f41296k = list;
                this.f41297l = z12;
            }

            @Override // ip.a
            public long f() {
                try {
                    this.f41293h.f41281x.S().b(this.f41292g);
                    return -1L;
                } catch (IOException e10) {
                    np.h g10 = np.h.f43761c.g();
                    g10.j("Http2Connection.Listener failure for " + this.f41293h.f41281x.O(), 4, e10);
                    try {
                        this.f41292g.d(mp.a.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* renamed from: mp.e$e$c */
        /* loaded from: classes4.dex */
        public static final class c extends ip.a {

            /* renamed from: e */
            public final /* synthetic */ String f41298e;

            /* renamed from: f */
            public final /* synthetic */ boolean f41299f;

            /* renamed from: g */
            public final /* synthetic */ C0608e f41300g;

            /* renamed from: h */
            public final /* synthetic */ int f41301h;

            /* renamed from: i */
            public final /* synthetic */ int f41302i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, String str2, boolean z11, C0608e c0608e, int i10, int i11) {
                super(str2, z11);
                this.f41298e = str;
                this.f41299f = z10;
                this.f41300g = c0608e;
                this.f41301h = i10;
                this.f41302i = i11;
            }

            @Override // ip.a
            public long f() {
                this.f41300g.f41281x.Y0(true, this.f41301h, this.f41302i);
                return -1L;
            }
        }

        /* renamed from: mp.e$e$d */
        /* loaded from: classes4.dex */
        public static final class d extends ip.a {

            /* renamed from: e */
            public final /* synthetic */ String f41303e;

            /* renamed from: f */
            public final /* synthetic */ boolean f41304f;

            /* renamed from: g */
            public final /* synthetic */ C0608e f41305g;

            /* renamed from: h */
            public final /* synthetic */ boolean f41306h;

            /* renamed from: i */
            public final /* synthetic */ mp.l f41307i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, boolean z10, String str2, boolean z11, C0608e c0608e, boolean z12, mp.l lVar) {
                super(str2, z11);
                this.f41303e = str;
                this.f41304f = z10;
                this.f41305g = c0608e;
                this.f41306h = z12;
                this.f41307i = lVar;
            }

            @Override // ip.a
            public long f() {
                this.f41305g.k(this.f41306h, this.f41307i);
                return -1L;
            }
        }

        public C0608e(e eVar, mp.g gVar) {
            p.h(gVar, "reader");
            this.f41281x = eVar;
            this.f41280w = gVar;
        }

        @Override // mp.g.c
        public void a(int i10, mp.a aVar) {
            p.h(aVar, "errorCode");
            if (this.f41281x.A0(i10)) {
                this.f41281x.x0(i10, aVar);
                return;
            }
            mp.h B0 = this.f41281x.B0(i10);
            if (B0 != null) {
                B0.y(aVar);
            }
        }

        @Override // mp.g.c
        public void b(boolean z10, int i10, int i11, List<mp.b> list) {
            p.h(list, "headerBlock");
            if (this.f41281x.A0(i10)) {
                this.f41281x.r0(i10, list, z10);
                return;
            }
            synchronized (this.f41281x) {
                mp.h c02 = this.f41281x.c0(i10);
                if (c02 == null) {
                    if (this.f41281x.C) {
                        return;
                    }
                    if (i10 <= this.f41281x.P()) {
                        return;
                    }
                    if (i10 % 2 == this.f41281x.U() % 2) {
                        return;
                    }
                    mp.h hVar = new mp.h(i10, this.f41281x, false, z10, fp.b.L(list));
                    this.f41281x.E0(i10);
                    this.f41281x.d0().put(Integer.valueOf(i10), hVar);
                    String str = this.f41281x.O() + '[' + i10 + "] onStream";
                    this.f41281x.D.i().i(new b(str, true, str, true, hVar, this, c02, i10, list, z10), 0L);
                    return;
                }
                v vVar = v.f59242a;
                c02.x(fp.b.L(list), z10);
            }
        }

        @Override // mp.g.c
        public void c(int i10, long j10) {
            if (i10 == 0) {
                synchronized (this.f41281x) {
                    e eVar = this.f41281x;
                    eVar.T = eVar.h0() + j10;
                    e eVar2 = this.f41281x;
                    if (eVar2 != null) {
                        eVar2.notifyAll();
                        v vVar = v.f59242a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            mp.h c02 = this.f41281x.c0(i10);
            if (c02 != null) {
                synchronized (c02) {
                    c02.a(j10);
                    v vVar2 = v.f59242a;
                }
            }
        }

        @Override // mp.g.c
        public void d(int i10, int i11, List<mp.b> list) {
            p.h(list, "requestHeaders");
            this.f41281x.w0(i11, list);
        }

        @Override // mp.g.c
        public void e() {
        }

        @Override // mp.g.c
        public void f(boolean z10, int i10, rp.e eVar, int i11) throws IOException {
            p.h(eVar, "source");
            if (this.f41281x.A0(i10)) {
                this.f41281x.q0(i10, eVar, i11, z10);
                return;
            }
            mp.h c02 = this.f41281x.c0(i10);
            if (c02 == null) {
                this.f41281x.j1(i10, mp.a.PROTOCOL_ERROR);
                long j10 = i11;
                this.f41281x.T0(j10);
                eVar.k(j10);
                return;
            }
            c02.w(eVar, i11);
            if (z10) {
                c02.x(fp.b.f32114b, true);
            }
        }

        @Override // mp.g.c
        public void g(int i10, mp.a aVar, rp.f fVar) {
            int i11;
            mp.h[] hVarArr;
            p.h(aVar, "errorCode");
            p.h(fVar, "debugData");
            fVar.G();
            synchronized (this.f41281x) {
                Object[] array = this.f41281x.d0().values().toArray(new mp.h[0]);
                if (array != null) {
                    hVarArr = (mp.h[]) array;
                    this.f41281x.C = true;
                    v vVar = v.f59242a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (mp.h hVar : hVarArr) {
                if (hVar.j() > i10 && hVar.t()) {
                    hVar.y(mp.a.REFUSED_STREAM);
                    this.f41281x.B0(hVar.j());
                }
            }
        }

        @Override // mp.g.c
        public void h(boolean z10, mp.l lVar) {
            p.h(lVar, Referer.SETTINGS);
            String str = this.f41281x.O() + " applyAndAckSettings";
            this.f41281x.E.i(new d(str, true, str, true, this, z10, lVar), 0L);
        }

        @Override // mp.g.c
        public void i(boolean z10, int i10, int i11) {
            if (z10) {
                synchronized (this.f41281x) {
                    if (i10 == 1) {
                        this.f41281x.J++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            this.f41281x.M++;
                            e eVar = this.f41281x;
                            if (eVar == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            eVar.notifyAll();
                        }
                        v vVar = v.f59242a;
                    } else {
                        this.f41281x.L++;
                    }
                }
                return;
            }
            String str = this.f41281x.O() + " ping";
            this.f41281x.E.i(new c(str, true, str, true, this, i10, i11), 0L);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            l();
            return v.f59242a;
        }

        @Override // mp.g.c
        public void j(int i10, int i11, int i12, boolean z10) {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:(2:15|(10:17|18|19|20|21|22|23|24|25|26)(2:51|52))|20|21|22|23|24|25|26) */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x00d6, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x00d7, code lost:
            r21.f41281x.L(r0);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [mp.l, T] */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void k(boolean r22, mp.l r23) {
            /*
                Method dump skipped, instructions count: 268
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: mp.e.C0608e.k(boolean, mp.l):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [mp.a] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, mp.g] */
        public void l() {
            mp.a aVar;
            mp.a aVar2;
            mp.a aVar3 = mp.a.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f41280w.d(this);
                    while (this.f41280w.c(false, this)) {
                    }
                    aVar2 = mp.a.NO_ERROR;
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th2) {
                    th = th2;
                    aVar = aVar3;
                    this.f41281x.K(aVar, aVar3, e10);
                    fp.b.j(this.f41280w);
                    throw th;
                }
                try {
                    this.f41281x.K(aVar2, mp.a.CANCEL, null);
                    aVar = aVar2;
                } catch (IOException e12) {
                    e10 = e12;
                    mp.a aVar4 = mp.a.PROTOCOL_ERROR;
                    e eVar = this.f41281x;
                    eVar.K(aVar4, aVar4, e10);
                    aVar = eVar;
                    aVar3 = this.f41280w;
                    fp.b.j(aVar3);
                }
                aVar3 = this.f41280w;
                fp.b.j(aVar3);
            } catch (Throwable th3) {
                th = th3;
                this.f41281x.K(aVar, aVar3, e10);
                fp.b.j(this.f41280w);
                throw th;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends ip.a {

        /* renamed from: e */
        public final /* synthetic */ String f41308e;

        /* renamed from: f */
        public final /* synthetic */ boolean f41309f;

        /* renamed from: g */
        public final /* synthetic */ e f41310g;

        /* renamed from: h */
        public final /* synthetic */ int f41311h;

        /* renamed from: i */
        public final /* synthetic */ rp.c f41312i;

        /* renamed from: j */
        public final /* synthetic */ int f41313j;

        /* renamed from: k */
        public final /* synthetic */ boolean f41314k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z10, String str2, boolean z11, e eVar, int i10, rp.c cVar, int i11, boolean z12) {
            super(str2, z11);
            this.f41308e = str;
            this.f41309f = z10;
            this.f41310g = eVar;
            this.f41311h = i10;
            this.f41312i = cVar;
            this.f41313j = i11;
            this.f41314k = z12;
        }

        @Override // ip.a
        public long f() {
            try {
                boolean a10 = this.f41310g.H.a(this.f41311h, this.f41312i, this.f41313j, this.f41314k);
                if (a10) {
                    this.f41310g.i0().q(this.f41311h, mp.a.CANCEL);
                }
                if (a10 || this.f41314k) {
                    synchronized (this.f41310g) {
                        this.f41310g.X.remove(Integer.valueOf(this.f41311h));
                    }
                    return -1L;
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends ip.a {

        /* renamed from: e */
        public final /* synthetic */ String f41315e;

        /* renamed from: f */
        public final /* synthetic */ boolean f41316f;

        /* renamed from: g */
        public final /* synthetic */ e f41317g;

        /* renamed from: h */
        public final /* synthetic */ int f41318h;

        /* renamed from: i */
        public final /* synthetic */ List f41319i;

        /* renamed from: j */
        public final /* synthetic */ boolean f41320j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, String str2, boolean z11, e eVar, int i10, List list, boolean z12) {
            super(str2, z11);
            this.f41315e = str;
            this.f41316f = z10;
            this.f41317g = eVar;
            this.f41318h = i10;
            this.f41319i = list;
            this.f41320j = z12;
        }

        @Override // ip.a
        public long f() {
            boolean d10 = this.f41317g.H.d(this.f41318h, this.f41319i, this.f41320j);
            if (d10) {
                try {
                    this.f41317g.i0().q(this.f41318h, mp.a.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (d10 || this.f41320j) {
                synchronized (this.f41317g) {
                    this.f41317g.X.remove(Integer.valueOf(this.f41318h));
                }
                return -1L;
            }
            return -1L;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends ip.a {

        /* renamed from: e */
        public final /* synthetic */ String f41321e;

        /* renamed from: f */
        public final /* synthetic */ boolean f41322f;

        /* renamed from: g */
        public final /* synthetic */ e f41323g;

        /* renamed from: h */
        public final /* synthetic */ int f41324h;

        /* renamed from: i */
        public final /* synthetic */ List f41325i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, String str2, boolean z11, e eVar, int i10, List list) {
            super(str2, z11);
            this.f41321e = str;
            this.f41322f = z10;
            this.f41323g = eVar;
            this.f41324h = i10;
            this.f41325i = list;
        }

        @Override // ip.a
        public long f() {
            if (this.f41323g.H.c(this.f41324h, this.f41325i)) {
                try {
                    this.f41323g.i0().q(this.f41324h, mp.a.CANCEL);
                    synchronized (this.f41323g) {
                        this.f41323g.X.remove(Integer.valueOf(this.f41324h));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
            return -1L;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends ip.a {

        /* renamed from: e */
        public final /* synthetic */ String f41326e;

        /* renamed from: f */
        public final /* synthetic */ boolean f41327f;

        /* renamed from: g */
        public final /* synthetic */ e f41328g;

        /* renamed from: h */
        public final /* synthetic */ int f41329h;

        /* renamed from: i */
        public final /* synthetic */ mp.a f41330i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, String str2, boolean z11, e eVar, int i10, mp.a aVar) {
            super(str2, z11);
            this.f41326e = str;
            this.f41327f = z10;
            this.f41328g = eVar;
            this.f41329h = i10;
            this.f41330i = aVar;
        }

        @Override // ip.a
        public long f() {
            this.f41328g.H.b(this.f41329h, this.f41330i);
            synchronized (this.f41328g) {
                this.f41328g.X.remove(Integer.valueOf(this.f41329h));
                v vVar = v.f59242a;
            }
            return -1L;
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends ip.a {

        /* renamed from: e */
        public final /* synthetic */ String f41331e;

        /* renamed from: f */
        public final /* synthetic */ boolean f41332f;

        /* renamed from: g */
        public final /* synthetic */ e f41333g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z10, String str2, boolean z11, e eVar) {
            super(str2, z11);
            this.f41331e = str;
            this.f41332f = z10;
            this.f41333g = eVar;
        }

        @Override // ip.a
        public long f() {
            this.f41333g.Y0(false, 2, 0);
            return -1L;
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends ip.a {

        /* renamed from: e */
        public final /* synthetic */ String f41334e;

        /* renamed from: f */
        public final /* synthetic */ boolean f41335f;

        /* renamed from: g */
        public final /* synthetic */ e f41336g;

        /* renamed from: h */
        public final /* synthetic */ int f41337h;

        /* renamed from: i */
        public final /* synthetic */ mp.a f41338i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, String str2, boolean z11, e eVar, int i10, mp.a aVar) {
            super(str2, z11);
            this.f41334e = str;
            this.f41335f = z10;
            this.f41336g = eVar;
            this.f41337h = i10;
            this.f41338i = aVar;
        }

        @Override // ip.a
        public long f() {
            try {
                this.f41336g.i1(this.f41337h, this.f41338i);
                return -1L;
            } catch (IOException e10) {
                this.f41336g.L(e10);
                return -1L;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends ip.a {

        /* renamed from: e */
        public final /* synthetic */ String f41339e;

        /* renamed from: f */
        public final /* synthetic */ boolean f41340f;

        /* renamed from: g */
        public final /* synthetic */ e f41341g;

        /* renamed from: h */
        public final /* synthetic */ int f41342h;

        /* renamed from: i */
        public final /* synthetic */ long f41343i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, String str2, boolean z11, e eVar, int i10, long j10) {
            super(str2, z11);
            this.f41339e = str;
            this.f41340f = z10;
            this.f41341g = eVar;
            this.f41342h = i10;
            this.f41343i = j10;
        }

        @Override // ip.a
        public long f() {
            try {
                this.f41341g.i0().z(this.f41342h, this.f41343i);
                return -1L;
            } catch (IOException e10) {
                this.f41341g.L(e10);
                return -1L;
            }
        }
    }

    static {
        mp.l lVar = new mp.l();
        lVar.h(7, 65535);
        lVar.h(5, 16384);
        Y = lVar;
    }

    public e(b bVar) {
        mp.l lVar;
        p.h(bVar, "builder");
        boolean b10 = bVar.b();
        this.f41262w = b10;
        this.f41263x = bVar.d();
        this.f41264y = new LinkedHashMap();
        String c10 = bVar.c();
        this.f41265z = c10;
        this.B = bVar.b() ? 3 : 2;
        ip.e j10 = bVar.j();
        this.D = j10;
        ip.d i10 = j10.i();
        this.E = i10;
        this.F = j10.i();
        this.G = j10.i();
        this.H = bVar.f();
        mp.l lVar2 = new mp.l();
        if (bVar.b()) {
            lVar2.h(7, 16777216);
        }
        v vVar = v.f59242a;
        this.O = lVar2;
        this.P = Y;
        this.T = lVar.c();
        this.U = bVar.h();
        this.V = new mp.i(bVar.g(), b10);
        this.W = new C0608e(this, new mp.g(bVar.i(), b10));
        this.X = new LinkedHashSet();
        if (bVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(bVar.e());
            String str = c10 + " ping";
            i10.i(new a(str, str, this, nanos), nanos);
        }
    }

    public static /* synthetic */ void N0(e eVar, boolean z10, ip.e eVar2, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            eVar2 = ip.e.f36975h;
        }
        eVar.M0(z10, eVar2);
    }

    public final boolean A0(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized mp.h B0(int i10) {
        mp.h remove;
        remove = this.f41264y.remove(Integer.valueOf(i10));
        notifyAll();
        return remove;
    }

    public final void D0() {
        synchronized (this) {
            long j10 = this.L;
            long j11 = this.K;
            if (j10 < j11) {
                return;
            }
            this.K = j11 + 1;
            this.N = System.nanoTime() + 1000000000;
            v vVar = v.f59242a;
            String str = this.f41265z + " ping";
            this.E.i(new j(str, true, str, true, this), 0L);
        }
    }

    public final void E0(int i10) {
        this.A = i10;
    }

    public final void F0(mp.l lVar) {
        p.h(lVar, "<set-?>");
        this.P = lVar;
    }

    public final void K(mp.a aVar, mp.a aVar2, IOException iOException) {
        int i10;
        p.h(aVar, "connectionCode");
        p.h(aVar2, "streamCode");
        if (fp.b.f32120h && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        try {
            L0(aVar);
        } catch (IOException unused) {
        }
        mp.h[] hVarArr = null;
        synchronized (this) {
            if (!this.f41264y.isEmpty()) {
                Object[] array = this.f41264y.values().toArray(new mp.h[0]);
                if (array != null) {
                    hVarArr = (mp.h[]) array;
                    this.f41264y.clear();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            v vVar = v.f59242a;
        }
        if (hVarArr != null) {
            for (mp.h hVar : hVarArr) {
                try {
                    hVar.d(aVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.V.close();
        } catch (IOException unused3) {
        }
        try {
            this.U.close();
        } catch (IOException unused4) {
        }
        this.E.n();
        this.F.n();
        this.G.n();
    }

    public final void L(IOException iOException) {
        mp.a aVar = mp.a.PROTOCOL_ERROR;
        K(aVar, aVar, iOException);
    }

    public final void L0(mp.a aVar) throws IOException {
        p.h(aVar, "statusCode");
        synchronized (this.V) {
            synchronized (this) {
                if (this.C) {
                    return;
                }
                this.C = true;
                int i10 = this.A;
                v vVar = v.f59242a;
                this.V.i(i10, aVar, fp.b.f32113a);
            }
        }
    }

    public final void M0(boolean z10, ip.e eVar) throws IOException {
        p.h(eVar, "taskRunner");
        if (z10) {
            this.V.c();
            this.V.v(this.O);
            int c10 = this.O.c();
            if (c10 != 65535) {
                this.V.z(0, c10 - 65535);
            }
        }
        ip.d i10 = eVar.i();
        String str = this.f41265z;
        i10.i(new ip.c(this.W, str, true, str, true), 0L);
    }

    public final boolean N() {
        return this.f41262w;
    }

    public final String O() {
        return this.f41265z;
    }

    public final int P() {
        return this.A;
    }

    public final d S() {
        return this.f41263x;
    }

    public final synchronized void T0(long j10) {
        long j11 = this.Q + j10;
        this.Q = j11;
        long j12 = j11 - this.R;
        if (j12 >= this.O.c() / 2) {
            k1(0, j12);
            this.R += j12;
        }
    }

    public final int U() {
        return this.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0031, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0033, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.V.n());
        r6 = r2;
        r8.S += r6;
        r4 = wn.v.f59242a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V0(int r9, boolean r10, rp.c r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            mp.i r12 = r8.V
            r12.d(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6c
            monitor-enter(r8)
        L12:
            long r4 = r8.S     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            long r6 = r8.T     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L32
            java.util.Map<java.lang.Integer, mp.h> r2 = r8.f41264y     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            throw r9     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
        L32:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L5b
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L5b
            mp.i r4 = r8.V     // Catch: java.lang.Throwable -> L5b
            int r4 = r4.n()     // Catch: java.lang.Throwable -> L5b
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L5b
            long r4 = r8.S     // Catch: java.lang.Throwable -> L5b
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L5b
            long r4 = r4 + r6
            r8.S = r4     // Catch: java.lang.Throwable -> L5b
            wn.v r4 = wn.v.f59242a     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r8)
            long r12 = r12 - r6
            mp.i r4 = r8.V
            if (r10 == 0) goto L56
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = r3
        L57:
            r4.d(r5, r9, r11, r2)
            goto Ld
        L5b:
            r9 = move-exception
            goto L6a
        L5d:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5b
            r9.interrupt()     // Catch: java.lang.Throwable -> L5b
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L5b
            r9.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r9     // Catch: java.lang.Throwable -> L5b
        L6a:
            monitor-exit(r8)
            throw r9
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mp.e.V0(int, boolean, rp.c, long):void");
    }

    public final void W0(int i10, boolean z10, List<mp.b> list) throws IOException {
        p.h(list, "alternating");
        this.V.j(z10, i10, list);
    }

    public final mp.l X() {
        return this.O;
    }

    public final mp.l Y() {
        return this.P;
    }

    public final void Y0(boolean z10, int i10, int i11) {
        try {
            this.V.o(z10, i10, i11);
        } catch (IOException e10) {
            L(e10);
        }
    }

    public final synchronized mp.h c0(int i10) {
        return this.f41264y.get(Integer.valueOf(i10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        K(mp.a.NO_ERROR, mp.a.CANCEL, null);
    }

    public final Map<Integer, mp.h> d0() {
        return this.f41264y;
    }

    public final void flush() throws IOException {
        this.V.flush();
    }

    public final long h0() {
        return this.T;
    }

    public final mp.i i0() {
        return this.V;
    }

    public final void i1(int i10, mp.a aVar) throws IOException {
        p.h(aVar, "statusCode");
        this.V.q(i10, aVar);
    }

    public final void j1(int i10, mp.a aVar) {
        p.h(aVar, "errorCode");
        String str = this.f41265z + '[' + i10 + "] writeSynReset";
        this.E.i(new k(str, true, str, true, this, i10, aVar), 0L);
    }

    public final synchronized boolean k0(long j10) {
        if (this.C) {
            return false;
        }
        if (this.L < this.K) {
            if (j10 >= this.N) {
                return false;
            }
        }
        return true;
    }

    public final void k1(int i10, long j10) {
        String str = this.f41265z + '[' + i10 + "] windowUpdate";
        this.E.i(new l(str, true, str, true, this, i10, j10), 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0048 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:48:0x0006, B:67:0x0053, B:69:0x0056, B:70:0x005c, B:72:0x0061, B:77:0x006f, B:78:0x007a, B:49:0x0007, B:51:0x000e, B:52:0x0013, B:54:0x0017, B:56:0x002a, B:58:0x0032, B:63:0x0042, B:65:0x0048, B:66:0x0051, B:79:0x007b, B:80:0x0080), top: B:87:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final mp.h l0(int r11, java.util.List<mp.b> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            mp.i r7 = r10.V
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L84
            int r0 = r10.B     // Catch: java.lang.Throwable -> L81
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            mp.a r0 = mp.a.REFUSED_STREAM     // Catch: java.lang.Throwable -> L81
            r10.L0(r0)     // Catch: java.lang.Throwable -> L81
        L13:
            boolean r0 = r10.C     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L7b
            int r8 = r10.B     // Catch: java.lang.Throwable -> L81
            int r0 = r8 + 2
            r10.B = r0     // Catch: java.lang.Throwable -> L81
            mp.h r9 = new mp.h     // Catch: java.lang.Throwable -> L81
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L81
            r0 = 1
            if (r13 == 0) goto L41
            long r1 = r10.S     // Catch: java.lang.Throwable -> L81
            long r3 = r10.T     // Catch: java.lang.Throwable -> L81
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L41
            long r1 = r9.r()     // Catch: java.lang.Throwable -> L81
            long r3 = r9.q()     // Catch: java.lang.Throwable -> L81
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L3f
            goto L41
        L3f:
            r13 = 0
            goto L42
        L41:
            r13 = r0
        L42:
            boolean r1 = r9.u()     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L51
            java.util.Map<java.lang.Integer, mp.h> r1 = r10.f41264y     // Catch: java.lang.Throwable -> L81
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L81
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L81
        L51:
            wn.v r1 = wn.v.f59242a     // Catch: java.lang.Throwable -> L81
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 != 0) goto L5c
            mp.i r11 = r10.V     // Catch: java.lang.Throwable -> L84
            r11.j(r6, r8, r12)     // Catch: java.lang.Throwable -> L84
            goto L66
        L5c:
            boolean r1 = r10.f41262w     // Catch: java.lang.Throwable -> L84
            r0 = r0 ^ r1
            if (r0 == 0) goto L6f
            mp.i r0 = r10.V     // Catch: java.lang.Throwable -> L84
            r0.p(r11, r8, r12)     // Catch: java.lang.Throwable -> L84
        L66:
            monitor-exit(r7)
            if (r13 == 0) goto L6e
            mp.i r11 = r10.V
            r11.flush()
        L6e:
            return r9
        L6f:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L84
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L84
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L84
            throw r12     // Catch: java.lang.Throwable -> L84
        L7b:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L81
            r11.<init>()     // Catch: java.lang.Throwable -> L81
            throw r11     // Catch: java.lang.Throwable -> L81
        L81:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L84
            throw r11     // Catch: java.lang.Throwable -> L84
        L84:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mp.e.l0(int, java.util.List, boolean):mp.h");
    }

    public final mp.h p0(List<mp.b> list, boolean z10) throws IOException {
        p.h(list, "requestHeaders");
        return l0(0, list, z10);
    }

    public final void q0(int i10, rp.e eVar, int i11, boolean z10) throws IOException {
        p.h(eVar, "source");
        rp.c cVar = new rp.c();
        long j10 = i11;
        eVar.I0(j10);
        eVar.f1(cVar, j10);
        String str = this.f41265z + '[' + i10 + "] onData";
        this.F.i(new f(str, true, str, true, this, i10, cVar, i11, z10), 0L);
    }

    public final void r0(int i10, List<mp.b> list, boolean z10) {
        p.h(list, "requestHeaders");
        String str = this.f41265z + '[' + i10 + "] onHeaders";
        this.F.i(new g(str, true, str, true, this, i10, list, z10), 0L);
    }

    public final void w0(int i10, List<mp.b> list) {
        p.h(list, "requestHeaders");
        synchronized (this) {
            if (this.X.contains(Integer.valueOf(i10))) {
                j1(i10, mp.a.PROTOCOL_ERROR);
                return;
            }
            this.X.add(Integer.valueOf(i10));
            String str = this.f41265z + '[' + i10 + "] onRequest";
            this.F.i(new h(str, true, str, true, this, i10, list), 0L);
        }
    }

    public final void x0(int i10, mp.a aVar) {
        p.h(aVar, "errorCode");
        String str = this.f41265z + '[' + i10 + "] onReset";
        this.F.i(new i(str, true, str, true, this, i10, aVar), 0L);
    }
}
