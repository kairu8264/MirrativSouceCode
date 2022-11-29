package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class o82 implements xc2 {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f7685g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f7686a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7687b;

    /* renamed from: c  reason: collision with root package name */
    public final i21 f7688c;

    /* renamed from: d  reason: collision with root package name */
    public final ym2 f7689d;

    /* renamed from: e  reason: collision with root package name */
    public final yl2 f7690e;

    /* renamed from: f  reason: collision with root package name */
    public final yg.r1 f7691f = wg.t.h().p();

    public o82(String str, String str2, i21 i21Var, ym2 ym2Var, yl2 yl2Var) {
        this.f7686a = str;
        this.f7687b = str2;
        this.f7688c = i21Var;
        this.f7689d = ym2Var;
        this.f7690e = yl2Var;
    }

    public final /* synthetic */ void a(Bundle bundle, Bundle bundle2) {
        if (((Boolean) ft.c().c(ox.S3)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) ft.c().c(ox.R3)).booleanValue()) {
                synchronized (f7685g) {
                    this.f7688c.c(this.f7690e.f12650d);
                    bundle2.putBundle("quality_signals", this.f7689d.b());
                }
            } else {
                this.f7688c.c(this.f7690e.f12650d);
                bundle2.putBundle("quality_signals", this.f7689d.b());
            }
        }
        bundle2.putString("seq_num", this.f7686a);
        bundle2.putString("session_id", this.f7691f.x() ? "" : this.f7687b);
    }

    @Override // ai.xc2
    public final s43 zza() {
        final Bundle bundle = new Bundle();
        if (((Boolean) ft.c().c(ox.S3)).booleanValue()) {
            this.f7688c.c(this.f7690e.f12650d);
            bundle.putAll(this.f7689d.b());
        }
        return j43.a(new wc2(this, bundle) { // from class: ai.n82

            /* renamed from: a  reason: collision with root package name */
            public final o82 f7236a;

            /* renamed from: b  reason: collision with root package name */
            public final Bundle f7237b;

            {
                this.f7236a = this;
                this.f7237b = bundle;
            }

            @Override // ai.wc2
            public final void d(Object obj) {
                this.f7236a.a(this.f7237b, (Bundle) obj);
            }
        });
    }
}
