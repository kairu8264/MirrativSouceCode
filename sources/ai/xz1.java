package ai;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class xz1 implements rn3<wz1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f12370a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<rz0> f12371b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f12372c;

    public xz1(eo3<Context> eo3Var, eo3<rz0> eo3Var2, eo3<Executor> eo3Var3) {
        this.f12370a = eo3Var;
        this.f12371b = eo3Var2;
        this.f12372c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new wz1(this.f12370a.zzb(), this.f12371b.zzb(), this.f12372c.zzb());
    }
}
