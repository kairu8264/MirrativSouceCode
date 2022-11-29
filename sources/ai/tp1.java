package ai;

import java.util.Set;

/* loaded from: classes3.dex */
public final class tp1 implements rn3<sp1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<lp1> f10366a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Set<rp1>> f10367b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<vh.f> f10368c;

    public tp1(eo3<lp1> eo3Var, eo3<Set<rp1>> eo3Var2, eo3<vh.f> eo3Var3) {
        this.f10366a = eo3Var;
        this.f10367b = eo3Var2;
        this.f10368c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new sp1(this.f10366a.zzb(), ((co3) this.f10367b).zzb(), this.f10368c.zzb());
    }
}
