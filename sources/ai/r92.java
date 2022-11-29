package ai;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class r92 implements xc2<s92> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9380a;

    /* renamed from: b  reason: collision with root package name */
    public final t43 f9381b;

    public r92(Context context, t43 t43Var) {
        this.f9380a = context;
        this.f9381b = t43Var;
    }

    @Override // ai.xc2
    public final s43<s92> zza() {
        return this.f9381b.h(new Callable(this) { // from class: ai.q92

            /* renamed from: a  reason: collision with root package name */
            public final r92 f8860a;

            {
                this.f8860a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String a10;
                String g10;
                String str;
                wg.t.d();
                vl zzb = wg.t.h().p().zzb();
                Bundle bundle = null;
                if (zzb != null && (!wg.t.h().p().d() || !wg.t.h().p().e())) {
                    if (zzb.h()) {
                        zzb.f();
                    }
                    kl e10 = zzb.e();
                    if (e10 != null) {
                        a10 = e10.b();
                        str = e10.c();
                        g10 = e10.d();
                        if (a10 != null) {
                            wg.t.h().p().H(a10);
                        }
                        if (g10 != null) {
                            wg.t.h().p().H0(g10);
                        }
                    } else {
                        a10 = wg.t.h().p().a();
                        g10 = wg.t.h().p().g();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!wg.t.h().p().e()) {
                        if (g10 != null && !TextUtils.isEmpty(g10)) {
                            bundle2.putString("v_fp_vertical", g10);
                        } else {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        }
                    }
                    if (a10 != null && !wg.t.h().p().d()) {
                        bundle2.putString("fingerprint", a10);
                        if (!a10.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new s92(bundle);
            }
        });
    }
}
