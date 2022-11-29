package th;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import ph.l;
import ph.n;
import rh.t;
import rh.v;
import rh.w;
import vi.g;
import vi.h;

/* loaded from: classes3.dex */
public final class d extends com.google.android.gms.common.api.b<w> implements v {

    /* renamed from: k  reason: collision with root package name */
    public static final a.g<e> f53642k;

    /* renamed from: l  reason: collision with root package name */
    public static final a.AbstractC0236a<e, w> f53643l;

    /* renamed from: m  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<w> f53644m;

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f53645n = 0;

    static {
        a.g<e> gVar = new a.g<>();
        f53642k = gVar;
        c cVar = new c();
        f53643l = cVar;
        f53644m = new com.google.android.gms.common.api.a<>("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, w wVar) {
        super(context, f53644m, wVar, b.a.f27194c);
    }

    @Override // rh.v
    public final g<Void> b(final t tVar) {
        n.a a10 = n.a();
        a10.d(di.d.f29655a);
        a10.c(false);
        a10.b(new l() { // from class: th.b
            @Override // ph.l
            public final void a(Object obj, Object obj2) {
                t tVar2 = t.this;
                int i10 = d.f53645n;
                ((a) ((e) obj).B()).h1(tVar2);
                ((h) obj2).c(null);
            }
        });
        return e(a10.a());
    }
}
