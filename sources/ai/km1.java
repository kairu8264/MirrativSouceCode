package ai;

/* loaded from: classes3.dex */
public final class km1 implements rn3<yn> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<yl2> f6287a;

    public km1(eo3<yl2> eo3Var) {
        this.f6287a = eo3Var;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        yn ynVar;
        if (((l41) this.f6287a).a().f12661o.f7852a == 3) {
            ynVar = yn.REWARDED_INTERSTITIAL;
        } else {
            ynVar = yn.REWARD_BASED_VIDEO_AD;
        }
        zn3.b(ynVar);
        return ynVar;
    }
}
