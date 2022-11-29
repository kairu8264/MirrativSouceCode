package wf;

import ah.n;
import com.google.ads.mediation.AbstractAdViewAdapter;
import rg.m;

/* loaded from: classes3.dex */
public final class h extends zg.b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractAdViewAdapter f58687a;

    /* renamed from: b  reason: collision with root package name */
    public final n f58688b;

    public h(AbstractAdViewAdapter abstractAdViewAdapter, n nVar) {
        this.f58687a = abstractAdViewAdapter;
        this.f58688b = nVar;
    }

    @Override // rg.d
    public final void a(m mVar) {
        this.f58688b.l(this.f58687a, mVar);
    }

    @Override // rg.d
    public final /* bridge */ /* synthetic */ void b(zg.a aVar) {
        zg.a aVar2 = aVar;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f58687a;
        abstractAdViewAdapter.mInterstitialAd = aVar2;
        aVar2.b(new i(abstractAdViewAdapter, this.f58688b));
        this.f58688b.q(this.f58687a);
    }
}
