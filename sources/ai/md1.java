package ai;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class md1 {

    /* renamed from: a  reason: collision with root package name */
    public final ne1 f6887a;

    /* renamed from: b  reason: collision with root package name */
    public final rp0 f6888b;

    public md1(ne1 ne1Var, rp0 rp0Var) {
        this.f6887a = ne1Var;
        this.f6888b = rp0Var;
    }

    public static final gc1<xb1> h(se1 se1Var) {
        return new gc1<>(se1Var, hk0.f4883f);
    }

    public final ne1 a() {
        return this.f6887a;
    }

    public final rp0 b() {
        return this.f6888b;
    }

    public final View c() {
        rp0 rp0Var = this.f6888b;
        if (rp0Var != null) {
            return rp0Var.I();
        }
        return null;
    }

    public final View d() {
        rp0 rp0Var = this.f6888b;
        if (rp0Var == null) {
            return null;
        }
        return rp0Var.I();
    }

    public Set<gc1<v41>> e(u31 u31Var) {
        return Collections.singleton(new gc1(u31Var, hk0.f4883f));
    }

    public Set<gc1<xb1>> f(u31 u31Var) {
        return Collections.singleton(new gc1(u31Var, hk0.f4883f));
    }

    public final gc1<o91> g(Executor executor) {
        final rp0 rp0Var = this.f6888b;
        return new gc1<>(new o91(rp0Var) { // from class: ai.ld1

            /* renamed from: w  reason: collision with root package name */
            public final rp0 f6530w;

            {
                this.f6530w = rp0Var;
            }

            @Override // ai.o91
            public final void zza() {
                rp0 rp0Var2 = this.f6530w;
                if (rp0Var2.d0() != null) {
                    rp0Var2.d0().zzb();
                }
            }
        }, executor);
    }
}
