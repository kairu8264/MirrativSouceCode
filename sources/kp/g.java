package kp;

import ep.b0;
import ep.d0;
import ep.w;
import java.io.IOException;
import java.util.List;
import jo.p;

/* loaded from: classes4.dex */
public final class g implements w.a {

    /* renamed from: a */
    public int f38919a;

    /* renamed from: b */
    public final jp.e f38920b;

    /* renamed from: c */
    public final List<w> f38921c;

    /* renamed from: d */
    public final int f38922d;

    /* renamed from: e */
    public final jp.c f38923e;

    /* renamed from: f */
    public final b0 f38924f;

    /* renamed from: g */
    public final int f38925g;

    /* renamed from: h */
    public final int f38926h;

    /* renamed from: i */
    public final int f38927i;

    /* JADX WARN: Multi-variable type inference failed */
    public g(jp.e eVar, List<? extends w> list, int i10, jp.c cVar, b0 b0Var, int i11, int i12, int i13) {
        p.h(eVar, "call");
        p.h(list, "interceptors");
        p.h(b0Var, "request");
        this.f38920b = eVar;
        this.f38921c = list;
        this.f38922d = i10;
        this.f38923e = cVar;
        this.f38924f = b0Var;
        this.f38925g = i11;
        this.f38926h = i12;
        this.f38927i = i13;
    }

    public static /* synthetic */ g c(g gVar, int i10, jp.c cVar, b0 b0Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f38922d;
        }
        if ((i14 & 2) != 0) {
            cVar = gVar.f38923e;
        }
        jp.c cVar2 = cVar;
        if ((i14 & 4) != 0) {
            b0Var = gVar.f38924f;
        }
        b0 b0Var2 = b0Var;
        if ((i14 & 8) != 0) {
            i11 = gVar.f38925g;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = gVar.f38926h;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = gVar.f38927i;
        }
        return gVar.b(i10, cVar2, b0Var2, i15, i16, i13);
    }

    @Override // ep.w.a
    public d0 a(b0 b0Var) throws IOException {
        p.h(b0Var, "request");
        if (this.f38922d < this.f38921c.size()) {
            this.f38919a++;
            jp.c cVar = this.f38923e;
            if (cVar != null) {
                if (cVar.j().g(b0Var.j())) {
                    if (!(this.f38919a == 1)) {
                        throw new IllegalStateException(("network interceptor " + this.f38921c.get(this.f38922d - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f38921c.get(this.f38922d - 1) + " must retain the same host and port").toString());
                }
            }
            g c10 = c(this, this.f38922d + 1, null, b0Var, 0, 0, 0, 58, null);
            w wVar = this.f38921c.get(this.f38922d);
            d0 intercept = wVar.intercept(c10);
            if (intercept != null) {
                if (this.f38923e != null) {
                    if (!(this.f38922d + 1 >= this.f38921c.size() || c10.f38919a == 1)) {
                        throw new IllegalStateException(("network interceptor " + wVar + " must call proceed() exactly once").toString());
                    }
                }
                if (intercept.a() != null) {
                    return intercept;
                }
                throw new IllegalStateException(("interceptor " + wVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + wVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final g b(int i10, jp.c cVar, b0 b0Var, int i11, int i12, int i13) {
        p.h(b0Var, "request");
        return new g(this.f38920b, this.f38921c, i10, cVar, b0Var, i11, i12, i13);
    }

    @Override // ep.w.a
    public ep.e call() {
        return this.f38920b;
    }

    public final jp.e d() {
        return this.f38920b;
    }

    public final int e() {
        return this.f38925g;
    }

    public final jp.c f() {
        return this.f38923e;
    }

    public final int g() {
        return this.f38926h;
    }

    public final b0 h() {
        return this.f38924f;
    }

    public final int i() {
        return this.f38927i;
    }

    @Override // ep.w.a
    public b0 j() {
        return this.f38924f;
    }

    public int k() {
        return this.f38926h;
    }
}
