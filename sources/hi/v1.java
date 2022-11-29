package hi;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes3.dex */
public final class v1 extends m2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ Context C;
    public final /* synthetic */ Bundle D;
    public final /* synthetic */ x2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(x2 x2Var, String str, String str2, Context context, Bundle bundle) {
        super(x2Var, true);
        this.E = x2Var;
        this.A = str;
        this.B = str2;
        this.C = context;
        this.D = bundle;
    }

    @Override // hi.m2
    public final void a() {
        boolean n10;
        String str;
        String str2;
        String str3;
        f1 f1Var;
        int c10;
        f1 f1Var2;
        String str4;
        String str5;
        try {
            x2 x2Var = this.E;
            n10 = x2.n(this.A, this.B);
            if (n10) {
                String str6 = this.B;
                String str7 = this.A;
                str5 = this.E.f36058a;
                str2 = str7;
                str3 = str6;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            rh.p.i(this.C);
            x2 x2Var2 = this.E;
            x2Var2.f36066i = x2Var2.t(this.C, true);
            f1Var = this.E.f36066i;
            if (f1Var == null) {
                str4 = this.E.f36058a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a10 = DynamiteModule.a(this.C, ModuleDescriptor.MODULE_ID);
            o1 o1Var = new o1(46000L, Math.max(a10, c10), DynamiteModule.c(this.C, ModuleDescriptor.MODULE_ID) < a10, str, str2, str3, this.D, pi.u4.a(this.C));
            f1Var2 = this.E.f36066i;
            ((f1) rh.p.i(f1Var2)).initialize(yh.b.h1(this.C), o1Var, this.f35851w);
        } catch (Exception e10) {
            this.E.k(e10, true, false);
        }
    }
}
