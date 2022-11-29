package mp;

import ep.a0;
import ep.b0;
import ep.d0;
import ep.u;
import ep.z;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import jo.p;
import kp.k;
import rp.f0;
import rp.h0;

/* loaded from: classes4.dex */
public final class f implements kp.d {

    /* renamed from: a  reason: collision with root package name */
    public volatile h f41347a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f41348b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f41349c;

    /* renamed from: d  reason: collision with root package name */
    public final jp.f f41350d;

    /* renamed from: e  reason: collision with root package name */
    public final kp.g f41351e;

    /* renamed from: f  reason: collision with root package name */
    public final e f41352f;

    /* renamed from: i  reason: collision with root package name */
    public static final a f41346i = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f41344g = fp.b.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f41345h = fp.b.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final List<b> a(b0 b0Var) {
            p.h(b0Var, "request");
            u e10 = b0Var.e();
            ArrayList arrayList = new ArrayList(e10.size() + 4);
            arrayList.add(new b(b.f41228f, b0Var.g()));
            arrayList.add(new b(b.f41229g, kp.i.f38930a.c(b0Var.j())));
            String d10 = b0Var.d("Host");
            if (d10 != null) {
                arrayList.add(new b(b.f41231i, d10));
            }
            arrayList.add(new b(b.f41230h, b0Var.j().v()));
            int size = e10.size();
            for (int i10 = 0; i10 < size; i10++) {
                String g10 = e10.g(i10);
                Locale locale = Locale.US;
                p.g(locale, "Locale.US");
                Objects.requireNonNull(g10, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = g10.toLowerCase(locale);
                p.g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!f.f41344g.contains(lowerCase) || (p.c(lowerCase, "te") && p.c(e10.m(i10), "trailers"))) {
                    arrayList.add(new b(lowerCase, e10.m(i10)));
                }
            }
            return arrayList;
        }

        public final d0.a b(u uVar, a0 a0Var) {
            p.h(uVar, "headerBlock");
            p.h(a0Var, "protocol");
            u.a aVar = new u.a();
            int size = uVar.size();
            kp.k kVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                String g10 = uVar.g(i10);
                String m10 = uVar.m(i10);
                if (!p.c(g10, ":status")) {
                    if (!f.f41345h.contains(g10)) {
                        aVar.e(g10, m10);
                    }
                } else {
                    k.a aVar2 = kp.k.f38933d;
                    kVar = aVar2.a("HTTP/1.1 " + m10);
                }
            }
            if (kVar != null) {
                return new d0.a().p(a0Var).g(kVar.f38935b).m(kVar.f38936c).k(aVar.g());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public f(z zVar, jp.f fVar, kp.g gVar, e eVar) {
        p.h(zVar, "client");
        p.h(fVar, "connection");
        p.h(gVar, "chain");
        p.h(eVar, "http2Connection");
        this.f41350d = fVar;
        this.f41351e = gVar;
        this.f41352f = eVar;
        List<a0> z10 = zVar.z();
        a0 a0Var = a0.H2_PRIOR_KNOWLEDGE;
        this.f41348b = z10.contains(a0Var) ? a0Var : a0.HTTP_2;
    }

    @Override // kp.d
    public void a() {
        h hVar = this.f41347a;
        p.e(hVar);
        hVar.n().close();
    }

    @Override // kp.d
    public f0 b(b0 b0Var, long j10) {
        p.h(b0Var, "request");
        h hVar = this.f41347a;
        p.e(hVar);
        return hVar.n();
    }

    @Override // kp.d
    public jp.f c() {
        return this.f41350d;
    }

    @Override // kp.d
    public void cancel() {
        this.f41349c = true;
        h hVar = this.f41347a;
        if (hVar != null) {
            hVar.f(mp.a.CANCEL);
        }
    }

    @Override // kp.d
    public long d(d0 d0Var) {
        p.h(d0Var, "response");
        if (kp.e.b(d0Var)) {
            return fp.b.s(d0Var);
        }
        return 0L;
    }

    @Override // kp.d
    public d0.a e(boolean z10) {
        h hVar = this.f41347a;
        p.e(hVar);
        d0.a b10 = f41346i.b(hVar.C(), this.f41348b);
        if (z10 && b10.h() == 100) {
            return null;
        }
        return b10;
    }

    @Override // kp.d
    public void f() {
        this.f41352f.flush();
    }

    @Override // kp.d
    public h0 g(d0 d0Var) {
        p.h(d0Var, "response");
        h hVar = this.f41347a;
        p.e(hVar);
        return hVar.p();
    }

    @Override // kp.d
    public void h(b0 b0Var) {
        p.h(b0Var, "request");
        if (this.f41347a != null) {
            return;
        }
        this.f41347a = this.f41352f.p0(f41346i.a(b0Var), b0Var.a() != null);
        if (!this.f41349c) {
            h hVar = this.f41347a;
            p.e(hVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            hVar.v().g(this.f41351e.g(), timeUnit);
            h hVar2 = this.f41347a;
            p.e(hVar2);
            hVar2.E().g(this.f41351e.i(), timeUnit);
            return;
        }
        h hVar3 = this.f41347a;
        p.e(hVar3);
        hVar3.f(mp.a.CANCEL);
        throw new IOException("Canceled");
    }
}
