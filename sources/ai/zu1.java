package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zu1 implements rn3<yu1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Map<String, eo3<av1>>> f13189a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<t43> f13190b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<p71> f13191c;

    public zu1(eo3<Map<String, eo3<av1>>> eo3Var, eo3<t43> eo3Var2, eo3<p71> eo3Var3) {
        this.f13189a = eo3Var;
        this.f13190b = eo3Var2;
        this.f13191c = eo3Var3;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final yu1 zzb() {
        Map c10 = ((yn3) this.f13189a).c();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new yu1(c10, t43Var, ((q71) this.f13191c).zzb());
    }
}
