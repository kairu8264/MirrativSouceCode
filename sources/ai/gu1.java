package ai;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class gu1 implements rn3<fu1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<or0> f4582a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f4583b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<zj0> f4584c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<yl2> f4585d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<Executor> f4586e;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<String> f4587f;

    /* renamed from: g  reason: collision with root package name */
    public final eo3<p71> f4588g;

    /* renamed from: h  reason: collision with root package name */
    public final eo3<t71> f4589h;

    public gu1(eo3<or0> eo3Var, eo3<Context> eo3Var2, eo3<zj0> eo3Var3, eo3<yl2> eo3Var4, eo3<Executor> eo3Var5, eo3<String> eo3Var6, eo3<p71> eo3Var7, eo3<t71> eo3Var8) {
        this.f4582a = eo3Var;
        this.f4583b = eo3Var2;
        this.f4584c = eo3Var3;
        this.f4585d = eo3Var4;
        this.f4586e = eo3Var5;
        this.f4587f = eo3Var6;
        this.f4588g = eo3Var7;
        this.f4589h = eo3Var8;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final fu1 zzb() {
        or0 zzb = this.f4582a.zzb();
        Context a10 = ((cn2) this.f4583b).a();
        zj0 a11 = ((cs0) this.f4584c).a();
        yl2 a12 = ((l41) this.f4585d).a();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new fu1(zzb, a10, a11, a12, t43Var, this.f4587f.zzb(), ((q71) this.f4588g).zzb(), ((v71) this.f4589h).zzb());
    }
}
