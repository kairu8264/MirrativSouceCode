package wf;

import ah.n;
import com.google.ads.mediation.AbstractAdViewAdapter;
import rg.l;

/* loaded from: classes3.dex */
public final class i extends l {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractAdViewAdapter f58689a;

    /* renamed from: b  reason: collision with root package name */
    public final n f58690b;

    public i(AbstractAdViewAdapter abstractAdViewAdapter, n nVar) {
        this.f58689a = abstractAdViewAdapter;
        this.f58690b = nVar;
    }

    @Override // rg.l
    public final void b() {
        this.f58690b.r(this.f58689a);
    }

    @Override // rg.l
    public final void e() {
        this.f58690b.s(this.f58689a);
    }
}
