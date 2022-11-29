package ai;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class a41 {

    /* renamed from: a  reason: collision with root package name */
    public final cq2 f1731a;

    /* renamed from: b  reason: collision with root package name */
    public final zj0 f1732b;

    /* renamed from: c  reason: collision with root package name */
    public final ApplicationInfo f1733c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1734d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f1735e;

    /* renamed from: f  reason: collision with root package name */
    public final PackageInfo f1736f;

    /* renamed from: g  reason: collision with root package name */
    public final kn3<s43<String>> f1737g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1738h;

    /* renamed from: i  reason: collision with root package name */
    public final bd2<Bundle> f1739i;

    public a41(cq2 cq2Var, zj0 zj0Var, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, kn3<s43<String>> kn3Var, yg.r1 r1Var, String str2, bd2<Bundle> bd2Var) {
        this.f1731a = cq2Var;
        this.f1732b = zj0Var;
        this.f1733c = applicationInfo;
        this.f1734d = str;
        this.f1735e = list;
        this.f1736f = packageInfo;
        this.f1737g = kn3Var;
        this.f1738h = str2;
        this.f1739i = bd2Var;
    }

    public final s43<Bundle> a() {
        cq2 cq2Var = this.f1731a;
        return np2.a(this.f1739i.a(new Bundle()), wp2.SIGNALS, cq2Var).i();
    }

    public final s43<ie0> b() {
        final s43<Bundle> a10 = a();
        return this.f1731a.f(wp2.REQUEST_PARCEL, a10, this.f1737g.zzb()).a(new Callable(this, a10) { // from class: ai.z31

            /* renamed from: a  reason: collision with root package name */
            public final a41 f12849a;

            /* renamed from: b  reason: collision with root package name */
            public final s43 f12850b;

            {
                this.f12849a = this;
                this.f12850b = a10;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12849a.c(this.f12850b);
            }
        }).i();
    }

    public final /* synthetic */ ie0 c(s43 s43Var) throws Exception {
        return new ie0((Bundle) s43Var.get(), this.f1732b, this.f1733c, this.f1734d, this.f1735e, this.f1736f, this.f1737g.zzb().get(), this.f1738h, null, null);
    }
}
