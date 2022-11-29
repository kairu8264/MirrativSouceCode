package ai;

import android.content.Context;
import android.content.pm.PackageInfo;

/* loaded from: classes3.dex */
public final class p0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f8197w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ r0 f8198x;

    public p0(r0 r0Var, int i10, boolean z10) {
        this.f8198x = r0Var;
        this.f8197w = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s64 s64Var;
        r0 r0Var = this.f8198x;
        int i10 = this.f8197w;
        if (i10 > 0) {
            try {
                Thread.sleep(i10 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = r0Var.f9266a.getPackageManager().getPackageInfo(r0Var.f9266a.getPackageName(), 0);
            Context context = r0Var.f9266a;
            s64Var = du2.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            s64Var = null;
        }
        this.f8198x.f9275j = s64Var;
        if (this.f8197w < 4) {
            if (s64Var != null && s64Var.e0() && !s64Var.s0().equals("0000000000000000000000000000000000000000000000000000000000000000") && s64Var.v0() && s64Var.w0().B() && s64Var.w0().C() != -2) {
                return;
            }
            this.f8198x.s(this.f8197w + 1, true);
        }
    }
}
