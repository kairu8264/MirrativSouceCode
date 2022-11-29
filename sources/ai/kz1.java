package ai;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class kz1 implements rn3<jz1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<vx0> f6417a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f6418b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f6419c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<ym1> f6420d;

    public kz1(eo3<vx0> eo3Var, eo3<Context> eo3Var2, eo3<Executor> eo3Var3, eo3<ym1> eo3Var4) {
        this.f6417a = eo3Var;
        this.f6418b = eo3Var2;
        this.f6419c = eo3Var3;
        this.f6420d = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new jz1(this.f6417a.zzb(), this.f6418b.zzb(), this.f6419c.zzb(), this.f6420d.zzb());
    }
}
