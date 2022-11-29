package ci;

import android.content.Context;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;

/* loaded from: classes3.dex */
public final class p extends com.google.android.gms.common.api.b<a.d.c> implements ih.b {

    /* renamed from: m  reason: collision with root package name */
    public static final a.g<d> f19657m;

    /* renamed from: n  reason: collision with root package name */
    public static final a.AbstractC0236a<d, a.d.c> f19658n;

    /* renamed from: o  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<a.d.c> f19659o;

    /* renamed from: k  reason: collision with root package name */
    public final Context f19660k;

    /* renamed from: l  reason: collision with root package name */
    public final nh.e f19661l;

    static {
        a.g<d> gVar = new a.g<>();
        f19657m = gVar;
        n nVar = new n();
        f19658n = nVar;
        f19659o = new com.google.android.gms.common.api.a<>("AppSet.API", nVar, gVar);
    }

    public p(Context context, nh.e eVar) {
        super(context, f19659o, a.d.f27183a, b.a.f27194c);
        this.f19660k = context;
        this.f19661l = eVar;
    }

    @Override // ih.b
    public final vi.g<ih.c> a() {
        if (this.f19661l.h(this.f19660k, 212800000) == 0) {
            return g(ph.n.a().d(ih.h.f36823a).b(new ph.l() { // from class: ci.m
                @Override // ph.l
                public final void a(Object obj, Object obj2) {
                    ((g) ((d) obj).B()).z0(new ih.d(null, null), new o(p.this, (vi.h) obj2));
                }
            }).c(false).e(27601).a());
        }
        return vi.j.d(new ApiException(new Status(17)));
    }
}
