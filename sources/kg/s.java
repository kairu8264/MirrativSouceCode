package kg;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import dg.g;
import gg.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import mg.a;

/* loaded from: classes3.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38785a;

    /* renamed from: b  reason: collision with root package name */
    public final dg.e f38786b;

    /* renamed from: c  reason: collision with root package name */
    public final lg.d f38787c;

    /* renamed from: d  reason: collision with root package name */
    public final y f38788d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f38789e;

    /* renamed from: f  reason: collision with root package name */
    public final mg.a f38790f;

    /* renamed from: g  reason: collision with root package name */
    public final ng.a f38791g;

    /* renamed from: h  reason: collision with root package name */
    public final ng.a f38792h;

    /* renamed from: i  reason: collision with root package name */
    public final lg.c f38793i;

    public s(Context context, dg.e eVar, lg.d dVar, y yVar, Executor executor, mg.a aVar, ng.a aVar2, ng.a aVar3, lg.c cVar) {
        this.f38785a = context;
        this.f38786b = eVar;
        this.f38787c = dVar;
        this.f38788d = yVar;
        this.f38789e = executor;
        this.f38790f = aVar;
        this.f38791g = aVar2;
        this.f38792h = aVar3;
        this.f38793i = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(cg.o oVar) {
        return Boolean.valueOf(this.f38787c.x(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(cg.o oVar) {
        return this.f38787c.v1(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, cg.o oVar, long j10) {
        this.f38787c.G0(iterable);
        this.f38787c.e1(oVar, this.f38791g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f38787c.w(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f38793i.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f38793i.d(((Integer) entry.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(cg.o oVar, long j10) {
        this.f38787c.e1(oVar, this.f38791g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(cg.o oVar, int i10) {
        this.f38788d.a(oVar, i10 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final cg.o oVar, final int i10, Runnable runnable) {
        try {
            try {
                mg.a aVar = this.f38790f;
                final lg.d dVar = this.f38787c;
                Objects.requireNonNull(dVar);
                aVar.e(new a.InterfaceC0605a() { // from class: kg.i
                    @Override // mg.a.InterfaceC0605a
                    public final Object d() {
                        return Integer.valueOf(lg.d.this.t());
                    }
                });
                if (!k()) {
                    this.f38790f.e(new a.InterfaceC0605a() { // from class: kg.m
                        @Override // mg.a.InterfaceC0605a
                        public final Object d() {
                            Object s10;
                            s10 = s.this.s(oVar, i10);
                            return s10;
                        }
                    });
                } else {
                    u(oVar, i10);
                }
            } catch (SynchronizationException unused) {
                this.f38788d.a(oVar, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public cg.i j(dg.m mVar) {
        mg.a aVar = this.f38790f;
        final lg.c cVar = this.f38793i;
        Objects.requireNonNull(cVar);
        return mVar.a(cg.i.a().i(this.f38791g.a()).k(this.f38792h.a()).j("GDT_CLIENT_METRICS").h(new cg.h(zf.b.b("proto"), ((gg.a) aVar.e(new a.InterfaceC0605a() { // from class: kg.r
            @Override // mg.a.InterfaceC0605a
            public final Object d() {
                return lg.c.this.c();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f38785a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void u(final cg.o oVar, int i10) {
        dg.g b10;
        dg.m a10 = this.f38786b.a(oVar.b());
        long j10 = 0;
        while (true) {
            final long j11 = j10;
            while (((Boolean) this.f38790f.e(new a.InterfaceC0605a() { // from class: kg.k
                @Override // mg.a.InterfaceC0605a
                public final Object d() {
                    Boolean l10;
                    l10 = s.this.l(oVar);
                    return l10;
                }
            })).booleanValue()) {
                final Iterable<lg.k> iterable = (Iterable) this.f38790f.e(new a.InterfaceC0605a() { // from class: kg.l
                    @Override // mg.a.InterfaceC0605a
                    public final Object d() {
                        Iterable m10;
                        m10 = s.this.m(oVar);
                        return m10;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return;
                }
                if (a10 == null) {
                    hg.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                    b10 = dg.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (lg.k kVar : iterable) {
                        arrayList.add(kVar.b());
                    }
                    if (oVar.e()) {
                        arrayList.add(j(a10));
                    }
                    b10 = a10.b(dg.f.a().b(arrayList).c(oVar.c()).a());
                }
                if (b10.c() == g.a.TRANSIENT_ERROR) {
                    this.f38790f.e(new a.InterfaceC0605a() { // from class: kg.p
                        @Override // mg.a.InterfaceC0605a
                        public final Object d() {
                            Object n10;
                            n10 = s.this.n(iterable, oVar, j11);
                            return n10;
                        }
                    });
                    this.f38788d.b(oVar, i10 + 1, true);
                    return;
                }
                this.f38790f.e(new a.InterfaceC0605a() { // from class: kg.o
                    @Override // mg.a.InterfaceC0605a
                    public final Object d() {
                        Object o10;
                        o10 = s.this.o(iterable);
                        return o10;
                    }
                });
                if (b10.c() == g.a.OK) {
                    j10 = Math.max(j11, b10.b());
                    if (oVar.e()) {
                        this.f38790f.e(new a.InterfaceC0605a() { // from class: kg.j
                            @Override // mg.a.InterfaceC0605a
                            public final Object d() {
                                Object p10;
                                p10 = s.this.p();
                                return p10;
                            }
                        });
                    }
                } else if (b10.c() == g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (lg.k kVar2 : iterable) {
                        String j12 = kVar2.b().j();
                        if (!hashMap.containsKey(j12)) {
                            hashMap.put(j12, 1);
                        } else {
                            hashMap.put(j12, Integer.valueOf(((Integer) hashMap.get(j12)).intValue() + 1));
                        }
                    }
                    this.f38790f.e(new a.InterfaceC0605a() { // from class: kg.q
                        @Override // mg.a.InterfaceC0605a
                        public final Object d() {
                            Object q10;
                            q10 = s.this.q(hashMap);
                            return q10;
                        }
                    });
                }
            }
            this.f38790f.e(new a.InterfaceC0605a() { // from class: kg.n
                @Override // mg.a.InterfaceC0605a
                public final Object d() {
                    Object r10;
                    r10 = s.this.r(oVar, j11);
                    return r10;
                }
            });
            return;
        }
    }

    public void v(final cg.o oVar, final int i10, final Runnable runnable) {
        this.f38789e.execute(new Runnable() { // from class: kg.h
            @Override // java.lang.Runnable
            public final void run() {
                s.this.t(oVar, i10, runnable);
            }
        });
    }
}
