package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class qx1 implements rn3<px1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f9227a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<a41> f9228b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<hx1> f9229c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<dx1> f9230d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<yg.r1> f9231e;

    public qx1(eo3<Context> eo3Var, eo3<a41> eo3Var2, eo3<hx1> eo3Var3, eo3<dx1> eo3Var4, eo3<yg.r1> eo3Var5) {
        this.f9227a = eo3Var;
        this.f9228b = eo3Var2;
        this.f9229c = eo3Var3;
        this.f9230d = eo3Var4;
        this.f9231e = eo3Var5;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final px1 zzb() {
        return new px1(((cn2) this.f9227a).a(), ((b41) this.f9228b).zzb(), this.f9229c.zzb(), ((ex1) this.f9230d).zzb(), ((bn2) this.f9231e).zzb());
    }
}
