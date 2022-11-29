package wf;

import ah.p;
import com.google.ads.mediation.AbstractAdViewAdapter;
import rg.m;
import tg.f;
import tg.h;

/* loaded from: classes3.dex */
public final class j extends rg.c implements h.a, f.b, f.a {

    /* renamed from: w  reason: collision with root package name */
    public final AbstractAdViewAdapter f58691w;

    /* renamed from: x  reason: collision with root package name */
    public final p f58692x;

    public j(AbstractAdViewAdapter abstractAdViewAdapter, p pVar) {
        this.f58691w = abstractAdViewAdapter;
        this.f58692x = pVar;
    }

    @Override // tg.f.b
    public final void a(tg.f fVar) {
        this.f58692x.i(this.f58691w, fVar);
    }

    @Override // tg.f.a
    public final void c(tg.f fVar, String str) {
        this.f58692x.e(this.f58691w, fVar, str);
    }

    @Override // tg.h.a
    public final void h(tg.h hVar) {
        this.f58692x.n(this.f58691w, new f(hVar));
    }

    @Override // rg.c
    public final void n() {
        this.f58692x.f(this.f58691w);
    }

    @Override // rg.c
    public final void onAdClicked() {
        this.f58692x.o(this.f58691w);
    }

    @Override // rg.c
    public final void p(m mVar) {
        this.f58692x.g(this.f58691w, mVar);
    }

    @Override // rg.c
    public final void s() {
        this.f58692x.k(this.f58691w);
    }

    @Override // rg.c
    public final void t() {
    }

    @Override // rg.c
    public final void u() {
        this.f58692x.a(this.f58691w);
    }
}
