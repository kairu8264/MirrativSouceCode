package wf;

import ai.or;
import com.google.ads.mediation.AbstractAdViewAdapter;
import rg.m;

/* loaded from: classes3.dex */
public final class g extends rg.c implements sg.c, or {

    /* renamed from: w  reason: collision with root package name */
    public final AbstractAdViewAdapter f58685w;

    /* renamed from: x  reason: collision with root package name */
    public final ah.i f58686x;

    public g(AbstractAdViewAdapter abstractAdViewAdapter, ah.i iVar) {
        this.f58685w = abstractAdViewAdapter;
        this.f58686x = iVar;
    }

    @Override // sg.c
    public final void f(String str, String str2) {
        this.f58686x.p(this.f58685w, str, str2);
    }

    @Override // rg.c
    public final void n() {
        this.f58686x.m(this.f58685w);
    }

    @Override // rg.c
    public final void onAdClicked() {
        this.f58686x.c(this.f58685w);
    }

    @Override // rg.c
    public final void p(m mVar) {
        this.f58686x.d(this.f58685w, mVar);
    }

    @Override // rg.c
    public final void t() {
        this.f58686x.h(this.f58685w);
    }

    @Override // rg.c
    public final void u() {
        this.f58686x.j(this.f58685w);
    }
}
