package ai;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class gc2 implements rn3<ec2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t43> f4388a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<ScheduledExecutorService> f4389b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<String> f4390c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<Context> f4391d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<yl2> f4392e;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<or0> f4393f;

    public gc2(eo3<t43> eo3Var, eo3<ScheduledExecutorService> eo3Var2, eo3<String> eo3Var3, eo3<Context> eo3Var4, eo3<yl2> eo3Var5, eo3<or0> eo3Var6) {
        this.f4388a = eo3Var;
        this.f4389b = eo3Var2;
        this.f4390c = eo3Var3;
        this.f4391d = eo3Var4;
        this.f4392e = eo3Var5;
        this.f4393f = eo3Var6;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new ec2(t43Var, this.f4389b.zzb(), this.f4390c.zzb(), this.f4391d.zzb(), ((l41) this.f4392e).a(), this.f4393f.zzb());
    }
}
