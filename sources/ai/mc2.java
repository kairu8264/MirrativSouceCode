package ai;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class mc2 implements xc2<nc2> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f6878a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f6879b;

    /* renamed from: c  reason: collision with root package name */
    public final zj0 f6880c;

    public mc2(t43 t43Var, Context context, zj0 zj0Var) {
        this.f6878a = t43Var;
        this.f6879b = context;
        this.f6880c = zj0Var;
    }

    public final /* synthetic */ nc2 a() throws Exception {
        boolean g10 = xh.c.a(this.f6879b).g();
        wg.t.d();
        boolean h10 = yg.d2.h(this.f6879b);
        String str = this.f6880c.f13013w;
        wg.t.f();
        boolean s10 = yg.e.s();
        wg.t.d();
        ApplicationInfo applicationInfo = this.f6879b.getApplicationInfo();
        return new nc2(g10, h10, str, s10, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.c(this.f6879b, ModuleDescriptor.MODULE_ID), DynamiteModule.a(this.f6879b, ModuleDescriptor.MODULE_ID));
    }

    @Override // ai.xc2
    public final s43<nc2> zza() {
        return this.f6878a.h(new Callable(this) { // from class: ai.lc2

            /* renamed from: a  reason: collision with root package name */
            public final mc2 f6516a;

            {
                this.f6516a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6516a.a();
            }
        });
    }
}
