package ai;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class e32 implements rn3<d32> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f3514a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<zj0> f3515b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<yl2> f3516c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<Executor> f3517d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<hm1> f3518e;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<ym1> f3519f;

    /* renamed from: g  reason: collision with root package name */
    public final eo3<u30> f3520g;

    public e32(eo3<Context> eo3Var, eo3<zj0> eo3Var2, eo3<yl2> eo3Var3, eo3<Executor> eo3Var4, eo3<hm1> eo3Var5, eo3<ym1> eo3Var6, eo3<u30> eo3Var7) {
        this.f3514a = eo3Var;
        this.f3515b = eo3Var2;
        this.f3516c = eo3Var3;
        this.f3517d = eo3Var4;
        this.f3518e = eo3Var5;
        this.f3519f = eo3Var6;
        this.f3520g = eo3Var7;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new d32(this.f3514a.zzb(), ((cs0) this.f3515b).a(), ((l41) this.f3516c).a(), this.f3517d.zzb(), this.f3518e.zzb(), this.f3519f.zzb(), new u30());
    }
}
