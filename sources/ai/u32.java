package ai;

import ai.g61;

/* loaded from: classes3.dex */
public final class u32<AdT, AdapterT, ListenerT extends g61> implements rn3<t32<AdT, AdapterT, ListenerT>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<cq2> f10596a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<t43> f10597b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<ty1<AdapterT, ListenerT>> f10598c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<yy1<AdT, AdapterT, ListenerT>> f10599d;

    public u32(eo3<cq2> eo3Var, eo3<t43> eo3Var2, eo3<ty1<AdapterT, ListenerT>> eo3Var3, eo3<yy1<AdT, AdapterT, ListenerT>> eo3Var4) {
        this.f10596a = eo3Var;
        this.f10597b = eo3Var2;
        this.f10598c = eo3Var3;
        this.f10599d = eo3Var4;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final t32<AdT, AdapterT, ListenerT> zzb() {
        return new t32<>(this.f10596a.zzb(), this.f10597b.zzb(), this.f10598c.zzb(), this.f10599d.zzb());
    }
}
