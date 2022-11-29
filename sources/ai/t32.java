package ai;

import ai.g61;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzehe;
import com.google.android.gms.internal.ads.zzfaw;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class t32<AdT, AdapterT, ListenerT extends g61> implements ry1<AdT> {

    /* renamed from: a  reason: collision with root package name */
    public final ty1<AdapterT, ListenerT> f10089a;

    /* renamed from: b  reason: collision with root package name */
    public final yy1<AdT, AdapterT, ListenerT> f10090b;

    /* renamed from: c  reason: collision with root package name */
    public final cq2 f10091c;

    /* renamed from: d  reason: collision with root package name */
    public final t43 f10092d;

    public t32(cq2 cq2Var, t43 t43Var, ty1<AdapterT, ListenerT> ty1Var, yy1<AdT, AdapterT, ListenerT> yy1Var) {
        this.f10091c = cq2Var;
        this.f10092d = t43Var;
        this.f10090b = yy1Var;
        this.f10089a = ty1Var;
    }

    public static final String e(String str, int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 31);
        sb2.append("Error from: ");
        sb2.append(str);
        sb2.append(", code: ");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // ai.ry1
    public final s43<AdT> a(final sl2 sl2Var, final fl2 fl2Var) {
        final uy1<AdapterT, ListenerT> uy1Var;
        Iterator<String> it = fl2Var.f4109t.iterator();
        while (true) {
            if (!it.hasNext()) {
                uy1Var = null;
                break;
            }
            try {
                uy1Var = this.f10089a.a(it.next(), fl2Var.f4111v);
                break;
            } catch (zzfaw unused) {
            }
        }
        if (uy1Var == null) {
            return j43.c(new zzehe("Unable to instantiate mediation adapter class."));
        }
        mk0 mk0Var = new mk0();
        uy1Var.f10880c.M1(new s32(this, uy1Var, mk0Var));
        if (fl2Var.I) {
            Bundle bundle = sl2Var.f9875a.f8473a.f12650d.I;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        cq2 cq2Var = this.f10091c;
        return np2.d(new gp2(this, sl2Var, fl2Var, uy1Var) { // from class: ai.p32

            /* renamed from: a  reason: collision with root package name */
            public final t32 f8285a;

            /* renamed from: b  reason: collision with root package name */
            public final sl2 f8286b;

            /* renamed from: c  reason: collision with root package name */
            public final fl2 f8287c;

            /* renamed from: d  reason: collision with root package name */
            public final uy1 f8288d;

            {
                this.f8285a = this;
                this.f8286b = sl2Var;
                this.f8287c = fl2Var;
                this.f8288d = uy1Var;
            }

            @Override // ai.gp2
            public final void zza() {
                this.f8285a.d(this.f8286b, this.f8287c, this.f8288d);
            }
        }, this.f10092d, wp2.ADAPTER_LOAD_AD_SYN, cq2Var).j(wp2.ADAPTER_LOAD_AD_ACK).e(mk0Var).j(wp2.ADAPTER_WRAP_ADAPTER).b(new fp2(this, sl2Var, fl2Var, uy1Var) { // from class: ai.r32

            /* renamed from: a  reason: collision with root package name */
            public final t32 f9324a;

            /* renamed from: b  reason: collision with root package name */
            public final sl2 f9325b;

            /* renamed from: c  reason: collision with root package name */
            public final fl2 f9326c;

            /* renamed from: d  reason: collision with root package name */
            public final uy1 f9327d;

            {
                this.f9324a = this;
                this.f9325b = sl2Var;
                this.f9326c = fl2Var;
                this.f9327d = uy1Var;
            }

            @Override // ai.fp2
            public final Object a(Object obj) {
                return this.f9324a.c(this.f9325b, this.f9326c, this.f9327d, (Void) obj);
            }
        }).i();
    }

    @Override // ai.ry1
    public final boolean b(sl2 sl2Var, fl2 fl2Var) {
        return !fl2Var.f4109t.isEmpty();
    }

    public final /* synthetic */ Object c(sl2 sl2Var, fl2 fl2Var, uy1 uy1Var, Void r42) throws Exception {
        return this.f10090b.b(sl2Var, fl2Var, uy1Var);
    }

    public final /* synthetic */ void d(sl2 sl2Var, fl2 fl2Var, uy1 uy1Var) throws Exception {
        this.f10090b.a(sl2Var, fl2Var, uy1Var);
    }
}
