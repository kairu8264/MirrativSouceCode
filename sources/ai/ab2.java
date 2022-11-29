package ai;

import android.content.pm.PackageInfo;

/* loaded from: classes3.dex */
public final class ab2 implements rn3<ya2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t43> f1805a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<yl2> f1806b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<PackageInfo> f1807c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<yg.r1> f1808d;

    public ab2(eo3<t43> eo3Var, eo3<yl2> eo3Var2, eo3<PackageInfo> eo3Var3, eo3<yg.r1> eo3Var4) {
        this.f1805a = eo3Var;
        this.f1806b = eo3Var2;
        this.f1807c = eo3Var3;
        this.f1808d = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new ya2(t43Var, ((l41) this.f1806b).a(), this.f1807c.zzb(), ((bn2) this.f1808d).zzb());
    }
}
