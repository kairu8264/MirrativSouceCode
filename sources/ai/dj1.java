package ai;

/* loaded from: classes3.dex */
public final class dj1 implements rn3<cj1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t43> f3315a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<qj1> f3316b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<vj1> f3317c;

    public dj1(eo3<t43> eo3Var, eo3<qj1> eo3Var2, eo3<vj1> eo3Var3) {
        this.f3315a = eo3Var;
        this.f3316b = eo3Var2;
        this.f3317c = eo3Var3;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final cj1 zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new cj1(t43Var, ((rj1) this.f3316b).zzb(), ((wj1) this.f3317c).zzb());
    }
}
