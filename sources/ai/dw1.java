package ai;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class dw1 implements rn3<cw1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f3422a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f3423b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<ue0> f3424c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<hv0> f3425d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<te0> f3426e;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<ArrayDeque<zv1>> f3427f;

    /* renamed from: g  reason: collision with root package name */
    public final eo3<hw1> f3428g;

    public dw1(eo3<Context> eo3Var, eo3<Executor> eo3Var2, eo3<ue0> eo3Var3, eo3<hv0> eo3Var4, eo3<te0> eo3Var5, eo3<ArrayDeque<zv1>> eo3Var6, eo3<hw1> eo3Var7) {
        this.f3422a = eo3Var;
        this.f3423b = eo3Var2;
        this.f3424c = eo3Var3;
        this.f3425d = eo3Var4;
        this.f3426e = eo3Var5;
        this.f3427f = eo3Var6;
        this.f3428g = eo3Var7;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new cw1(((tr0) this.f3422a).a(), this.f3423b.zzb(), new ue0(), ((zr0) this.f3425d).zzb(), ((ls0) this.f3426e).zzb(), this.f3427f.zzb(), new hw1(), null);
    }
}
