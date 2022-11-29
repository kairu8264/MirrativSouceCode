package ai;

/* loaded from: classes3.dex */
public final class at1 implements rn3<zs1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t43> f2057a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<t43> f2058b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<iu1> f2059c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<cw1> f2060d;

    public at1(eo3<t43> eo3Var, eo3<t43> eo3Var2, eo3<iu1> eo3Var3, eo3<cw1> eo3Var4) {
        this.f2057a = eo3Var;
        this.f2058b = eo3Var2;
        this.f2059c = eo3Var3;
        this.f2060d = eo3Var4;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final zs1 zzb() {
        t43 t43Var = hk0.f4879b;
        zn3.b(t43Var);
        t43 t43Var2 = hk0.f4878a;
        zn3.b(t43Var2);
        return new zs1(t43Var, t43Var2, ((pt1) this.f2059c).zzb(), pn3.b(this.f2060d));
    }
}
