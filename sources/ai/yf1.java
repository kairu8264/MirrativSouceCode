package ai;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class yf1 implements rn3<lx0> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<qk> f12578a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f12579b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Context> f12580c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<vh.f> f12581d;

    public yf1(eo3<qk> eo3Var, eo3<Executor> eo3Var2, eo3<Context> eo3Var3, eo3<vh.f> eo3Var4) {
        this.f12578a = eo3Var;
        this.f12579b = eo3Var2;
        this.f12580c = eo3Var3;
        this.f12581d = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new lx0(this.f12579b.zzb(), new ww0(this.f12580c.zzb(), this.f12578a.zzb()), this.f12581d.zzb());
    }
}
