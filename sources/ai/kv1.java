package ai;

import android.os.Binder;
import com.google.android.gms.internal.ads.zzdym;
import com.google.android.gms.internal.ads.zzeap;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class kv1 {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f6368a;

    /* renamed from: b  reason: collision with root package name */
    public final su1 f6369b;

    /* renamed from: c  reason: collision with root package name */
    public final kn3<cw1> f6370c;

    public kv1(t43 t43Var, su1 su1Var, kn3<cw1> kn3Var) {
        this.f6368a = t43Var;
        this.f6369b = su1Var;
        this.f6370c = kn3Var;
    }

    public final s43<ie0> a(final ie0 ie0Var) {
        return g(ie0Var, ev1.b(this.f6369b), new jv1(this) { // from class: ai.fv1

            /* renamed from: a  reason: collision with root package name */
            public final kv1 f4215a;

            {
                this.f4215a = this;
            }

            @Override // ai.jv1
            public final s43 a(ie0 ie0Var2) {
                return this.f4215a.e(ie0Var2);
            }
        }, new p33(ie0Var) { // from class: ai.dv1

            /* renamed from: a  reason: collision with root package name */
            public final ie0 f3412a;

            {
                this.f3412a = ie0Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                ie0 ie0Var2 = this.f3412a;
                ie0Var2.F = new String(e23.a((InputStream) obj), zw2.f13232c);
                return j43.a(ie0Var2);
            }
        });
    }

    public final s43<Void> b(ie0 ie0Var) {
        if (u0.e(ie0Var.F)) {
            return j43.c(new zzdym(2, "Pool key missing from removeUrl call."));
        }
        return g(ie0Var, new jv1(this) { // from class: ai.hv1

            /* renamed from: a  reason: collision with root package name */
            public final kv1 f5007a;

            {
                this.f5007a = this;
            }

            @Override // ai.jv1
            public final s43 a(ie0 ie0Var2) {
                return this.f5007a.d(ie0Var2);
            }
        }, new jv1(this) { // from class: ai.iv1

            /* renamed from: a  reason: collision with root package name */
            public final kv1 f5423a;

            {
                this.f5423a = this;
            }

            @Override // ai.jv1
            public final s43 a(ie0 ie0Var2) {
                return this.f5423a.c(ie0Var2);
            }
        }, gv1.f4596a);
    }

    public final /* synthetic */ s43 c(ie0 ie0Var) {
        String str;
        cw1 zzb = this.f6370c.zzb();
        if (iz.f5453d.e().booleanValue()) {
            str = ie0Var.D;
        } else {
            str = ie0Var.F;
        }
        return zzb.T5(str);
    }

    public final /* synthetic */ s43 d(ie0 ie0Var) {
        String str;
        su1 su1Var = this.f6369b;
        if (iz.f5453d.e().booleanValue()) {
            str = ie0Var.D;
        } else {
            str = ie0Var.F;
        }
        return su1Var.c(str);
    }

    public final /* synthetic */ s43 e(ie0 ie0Var) {
        return this.f6370c.zzb().S5(ie0Var, Binder.getCallingUid());
    }

    public final /* synthetic */ s43 f(jv1 jv1Var, ie0 ie0Var, p33 p33Var, zzeap zzeapVar) throws Exception {
        return j43.i(jv1Var.a(ie0Var), p33Var, this.f6368a);
    }

    public final <RetT> s43<RetT> g(final ie0 ie0Var, jv1<InputStream> jv1Var, final jv1<InputStream> jv1Var2, final p33<InputStream, RetT> p33Var) {
        s43 g10;
        String str = ie0Var.f5204z;
        wg.t.d();
        if (yg.d2.f(str)) {
            g10 = j43.c(new zzeap(1));
        } else {
            g10 = j43.g(jv1Var.a(ie0Var), ExecutionException.class, bv1.f2560a, this.f6368a);
        }
        return j43.g(j43.i(z33.E(g10), p33Var, this.f6368a), zzeap.class, new p33(this, jv1Var2, ie0Var, p33Var) { // from class: ai.cv1

            /* renamed from: a  reason: collision with root package name */
            public final kv1 f3046a;

            /* renamed from: b  reason: collision with root package name */
            public final jv1 f3047b;

            /* renamed from: c  reason: collision with root package name */
            public final ie0 f3048c;

            /* renamed from: d  reason: collision with root package name */
            public final p33 f3049d;

            {
                this.f3046a = this;
                this.f3047b = jv1Var2;
                this.f3048c = ie0Var;
                this.f3049d = p33Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f3046a.f(this.f3047b, this.f3048c, this.f3049d, (zzeap) obj);
            }
        }, this.f6368a);
    }
}
