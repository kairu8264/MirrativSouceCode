package ai;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdkm;

/* loaded from: classes3.dex */
public final class x02 implements ne1 {

    /* renamed from: a  reason: collision with root package name */
    public final fl2 f11835a;

    /* renamed from: b  reason: collision with root package name */
    public final ya0 f11836b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11837c;

    /* renamed from: d  reason: collision with root package name */
    public n51 f11838d = null;

    public x02(fl2 fl2Var, ya0 ya0Var, boolean z10) {
        this.f11835a = fl2Var;
        this.f11836b = ya0Var;
        this.f11837c = z10;
    }

    @Override // ai.ne1
    public final void a(boolean z10, Context context, i51 i51Var) throws zzdkm {
        try {
            if (this.f11837c ? this.f11836b.h4(yh.b.h1(context)) : this.f11836b.y0(yh.b.h1(context))) {
                if (this.f11838d == null) {
                    return;
                }
                if (((Boolean) ft.c().c(ox.f7939a1)).booleanValue() || this.f11835a.U != 2) {
                    return;
                }
                this.f11838d.zza();
                return;
            }
            throw new zzdkm("Adapter failed to show.");
        } catch (Throwable th2) {
            throw new zzdkm(th2);
        }
    }

    public final void b(n51 n51Var) {
        this.f11838d = n51Var;
    }
}
