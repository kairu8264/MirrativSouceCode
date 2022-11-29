package d6;

import a6.q;
import a6.r;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import b6.a;
import d6.h;
import ep.b0;
import ep.d;
import ep.d0;
import ep.e;
import ep.e0;
import ep.x;
import j6.m;
import java.io.IOException;
import java.util.Map;
import jo.p;
import rp.t;
import so.n;
import so.o;
import wn.v;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: f  reason: collision with root package name */
    public static final a f29208f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final ep.d f29209g = new d.a().d().e().a();

    /* renamed from: h  reason: collision with root package name */
    public static final ep.d f29210h = new d.a().d().f().a();

    /* renamed from: a  reason: collision with root package name */
    public final String f29211a;

    /* renamed from: b  reason: collision with root package name */
    public final m f29212b;

    /* renamed from: c  reason: collision with root package name */
    public final wn.f<e.a> f29213c;

    /* renamed from: d  reason: collision with root package name */
    public final wn.f<b6.a> f29214d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f29215e;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements h.a<Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final wn.f<e.a> f29216a;

        /* renamed from: b  reason: collision with root package name */
        public final wn.f<b6.a> f29217b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f29218c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(wn.f<? extends e.a> fVar, wn.f<? extends b6.a> fVar2, boolean z10) {
            this.f29216a = fVar;
            this.f29217b = fVar2;
            this.f29218c = z10;
        }

        @Override // d6.h.a
        /* renamed from: b */
        public h a(Uri uri, m mVar, x5.e eVar) {
            if (c(uri)) {
                return new j(uri.toString(), mVar, this.f29216a, this.f29217b, this.f29218c);
            }
            return null;
        }

        public final boolean c(Uri uri) {
            return p.c(uri.getScheme(), "http") || p.c(uri.getScheme(), "https");
        }
    }

    @co.f(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {223}, m = "executeNetworkRequest")
    /* loaded from: classes.dex */
    public static final class c extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public /* synthetic */ Object f29219w;

        /* renamed from: y  reason: collision with root package name */
        public int f29221y;

        public c(ao.d<? super c> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f29219w = obj;
            this.f29221y |= Integer.MIN_VALUE;
            return j.this.c(null, this);
        }
    }

    @co.f(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {76, 105}, m = "fetch")
    /* loaded from: classes.dex */
    public static final class d extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f29222w;

        /* renamed from: x  reason: collision with root package name */
        public Object f29223x;

        /* renamed from: y  reason: collision with root package name */
        public Object f29224y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f29225z;

        public d(ao.d<? super d> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f29225z = obj;
            this.B |= Integer.MIN_VALUE;
            return j.this.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(String str, m mVar, wn.f<? extends e.a> fVar, wn.f<? extends b6.a> fVar2, boolean z10) {
        this.f29211a = str;
        this.f29212b = mVar;
        this.f29213c = fVar;
        this.f29214d = fVar2;
        this.f29215e = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128 A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:70:0x0180, B:53:0x011a, B:55:0x0128, B:59:0x013b, B:58:0x0137, B:61:0x0145, B:63:0x014d, B:65:0x0165), top: B:84:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145 A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:70:0x0180, B:53:0x011a, B:55:0x0128, B:59:0x013b, B:58:0x0137, B:61:0x0145, B:63:0x014d, B:65:0x0165), top: B:84:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ac  */
    @Override // d6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(ao.d<? super d6.g> r13) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.j.a(ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(ep.b0 r5, ao.d<? super ep.d0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof d6.j.c
            if (r0 == 0) goto L13
            r0 = r6
            d6.j$c r0 = (d6.j.c) r0
            int r1 = r0.f29221y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29221y = r1
            goto L18
        L13:
            d6.j$c r0 = new d6.j$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f29219w
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f29221y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wn.m.b(r6)
            goto L72
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            wn.m.b(r6)
            boolean r6 = o6.k.r()
            if (r6 == 0) goto L5d
            j6.m r6 = r4.f29212b
            j6.a r6 = r6.k()
            boolean r6 = r6.c()
            if (r6 != 0) goto L57
            wn.f<ep.e$a> r6 = r4.f29213c
            java.lang.Object r6 = r6.getValue()
            ep.e$a r6 = (ep.e.a) r6
            ep.e r5 = r6.b(r5)
            ep.d0 r5 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r5)
            goto L75
        L57:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L5d:
            wn.f<ep.e$a> r6 = r4.f29213c
            java.lang.Object r6 = r6.getValue()
            ep.e$a r6 = (ep.e.a) r6
            ep.e r5 = r6.b(r5)
            r0.f29221y = r3
            java.lang.Object r6 = o6.b.a(r5, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            r5 = r6
            ep.d0 r5 = (ep.d0) r5
        L75:
            boolean r6 = r5.u0()
            if (r6 != 0) goto L93
            int r6 = r5.h()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L93
            ep.e0 r6 = r5.a()
            if (r6 != 0) goto L8a
            goto L8d
        L8a:
            o6.k.c(r6)
        L8d:
            coil.network.HttpException r6 = new coil.network.HttpException
            r6.<init>(r5)
            throw r6
        L93:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.j.c(ep.b0, ao.d):java.lang.Object");
    }

    public final String d() {
        String h10 = this.f29212b.h();
        return h10 == null ? this.f29211a : h10;
    }

    public final rp.i e() {
        b6.a value = this.f29214d.getValue();
        p.e(value);
        return value.b();
    }

    public final String f(String str, x xVar) {
        String j10;
        String xVar2 = xVar == null ? null : xVar.toString();
        if ((xVar2 == null || n.C(xVar2, "text/plain", false, 2, null)) && (j10 = o6.k.j(MimeTypeMap.getSingleton(), str)) != null) {
            return j10;
        }
        if (xVar2 == null) {
            return null;
        }
        return o.H0(xVar2, ';', null, 2, null);
    }

    public final boolean g(b0 b0Var, d0 d0Var) {
        return this.f29212b.i().e() && (!this.f29215e || i6.b.f36341c.b(b0Var, d0Var));
    }

    public final b0 h() {
        b0.a e10 = new b0.a().j(this.f29211a).e(this.f29212b.j());
        for (Map.Entry<Class<?>, Object> entry : this.f29212b.p().a().entrySet()) {
            e10.h(entry.getKey(), entry.getValue());
        }
        boolean c10 = this.f29212b.i().c();
        boolean c11 = this.f29212b.k().c();
        if (!c11 && c10) {
            e10.c(ep.d.f30808o);
        } else if (!c11 || c10) {
            if (!c11 && !c10) {
                e10.c(f29210h);
            }
        } else if (this.f29212b.i().e()) {
            e10.c(ep.d.f30807n);
        } else {
            e10.c(f29209g);
        }
        return e10.b();
    }

    public final a.c i() {
        b6.a value;
        if (!this.f29212b.i().c() || (value = this.f29214d.getValue()) == null) {
            return null;
        }
        return value.a(d());
    }

    public final e0 j(d0 d0Var) {
        e0 a10 = d0Var.a();
        if (a10 != null) {
            return a10;
        }
        throw new IllegalStateException("response body == null".toString());
    }

    public final i6.a k(a.c cVar) {
        i6.a aVar;
        try {
            rp.e c10 = t.c(e().q(cVar.getMetadata()));
            try {
                aVar = new i6.a(c10);
                th = null;
            } catch (Throwable th2) {
                th = th2;
                aVar = null;
            }
            if (c10 != null) {
                c10.close();
            }
            if (th == null) {
                p.e(aVar);
                return aVar;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    public final a6.d l(d0 d0Var) {
        return d0Var.v() != null ? a6.d.NETWORK : a6.d.DISK;
    }

    public final q m(a.c cVar) {
        return r.c(cVar.f(), e(), d(), cVar);
    }

    public final q n(e0 e0Var) {
        return r.a(e0Var.n(), this.f29212b.g());
    }

    public final a.c o(a.c cVar, b0 b0Var, d0 d0Var, i6.a aVar) {
        a.b c10;
        v vVar;
        Long l10;
        v vVar2;
        Throwable th2 = null;
        if (!g(b0Var, d0Var)) {
            if (cVar != null) {
                o6.k.c(cVar);
            }
            return null;
        }
        if (cVar != null) {
            c10 = cVar.s1();
        } else {
            b6.a value = this.f29214d.getValue();
            c10 = value == null ? null : value.c(d());
        }
        try {
            if (c10 == null) {
                return null;
            }
            try {
                if (d0Var.h() == 304 && aVar != null) {
                    d0 c11 = d0Var.z().k(i6.b.f36341c.a(new i6.a(d0Var).d(), d0Var.p())).c();
                    rp.d b10 = t.b(e().p(c10.getMetadata(), false));
                    try {
                        new i6.a(c11).g(b10);
                        vVar2 = v.f59242a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        vVar2 = null;
                    }
                    if (b10 != null) {
                        try {
                            b10.close();
                        } catch (Throwable th4) {
                            if (th2 == null) {
                                th2 = th4;
                            } else {
                                wn.a.a(th2, th4);
                            }
                        }
                    }
                    if (th2 == null) {
                        p.e(vVar2);
                    } else {
                        throw th2;
                    }
                } else {
                    rp.d b11 = t.b(e().p(c10.getMetadata(), false));
                    try {
                        new i6.a(d0Var).g(b11);
                        vVar = v.f59242a;
                        th = null;
                    } catch (Throwable th5) {
                        th = th5;
                        vVar = null;
                    }
                    if (b11 != null) {
                        try {
                            b11.close();
                        } catch (Throwable th6) {
                            if (th == null) {
                                th = th6;
                            } else {
                                wn.a.a(th, th6);
                            }
                        }
                    }
                    if (th == null) {
                        p.e(vVar);
                        rp.d b12 = t.b(e().p(c10.f(), false));
                        try {
                            e0 a10 = d0Var.a();
                            p.e(a10);
                            l10 = Long.valueOf(a10.n().b0(b12));
                        } catch (Throwable th7) {
                            th2 = th7;
                            l10 = null;
                        }
                        if (b12 != null) {
                            try {
                                b12.close();
                            } catch (Throwable th8) {
                                if (th2 == null) {
                                    th2 = th8;
                                } else {
                                    wn.a.a(th2, th8);
                                }
                            }
                        }
                        if (th2 == null) {
                            p.e(l10);
                        } else {
                            throw th2;
                        }
                    } else {
                        throw th;
                    }
                }
                return c10.g();
            } catch (Exception e10) {
                o6.k.a(c10);
                throw e10;
            }
        } finally {
            o6.k.c(d0Var);
        }
    }
}
