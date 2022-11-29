package g0;

import androidx.compose.ui.platform.g2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final g2 f32212a;

    /* renamed from: b  reason: collision with root package name */
    public int f32213b;

    /* renamed from: c  reason: collision with root package name */
    public n1.w f32214c;

    public c(g2 g2Var) {
        jo.p.h(g2Var, "viewConfiguration");
        this.f32212a = g2Var;
    }

    public final int a() {
        return this.f32213b;
    }

    public final boolean b(n1.w wVar, n1.w wVar2) {
        jo.p.h(wVar, "prevClick");
        jo.p.h(wVar2, "newClick");
        return ((double) b1.f.k(b1.f.q(wVar2.f(), wVar.f()))) < 100.0d;
    }

    public final boolean c(n1.w wVar, n1.w wVar2) {
        jo.p.h(wVar, "prevClick");
        jo.p.h(wVar2, "newClick");
        return wVar2.l() - wVar.l() < this.f32212a.a();
    }

    public final void d(n1.m mVar) {
        jo.p.h(mVar, "event");
        n1.w wVar = this.f32214c;
        n1.w wVar2 = mVar.c().get(0);
        if (wVar != null && c(wVar, wVar2) && b(wVar, wVar2)) {
            this.f32213b++;
        } else {
            this.f32213b = 1;
        }
        this.f32214c = wVar2;
    }
}
