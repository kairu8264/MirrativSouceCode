package cg;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class a implements rl.a {

    /* renamed from: a  reason: collision with root package name */
    public static final rl.a f19560a = new a();

    /* renamed from: cg.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0155a implements ql.d<gg.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0155a f19561a = new C0155a();

        /* renamed from: b  reason: collision with root package name */
        public static final ql.c f19562b = ql.c.a("window").b(tl.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        public static final ql.c f19563c = ql.c.a("logSourceMetrics").b(tl.a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        public static final ql.c f19564d = ql.c.a("globalMetrics").b(tl.a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        public static final ql.c f19565e = ql.c.a("appNamespace").b(tl.a.b().c(4).a()).a();

        @Override // ql.b
        /* renamed from: b */
        public void a(gg.a aVar, ql.e eVar) throws IOException {
            eVar.b(f19562b, aVar.d());
            eVar.b(f19563c, aVar.c());
            eVar.b(f19564d, aVar.b());
            eVar.b(f19565e, aVar.a());
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements ql.d<gg.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19566a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final ql.c f19567b = ql.c.a("storageMetrics").b(tl.a.b().c(1).a()).a();

        @Override // ql.b
        /* renamed from: b */
        public void a(gg.b bVar, ql.e eVar) throws IOException {
            eVar.b(f19567b, bVar.a());
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements ql.d<gg.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f19568a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final ql.c f19569b = ql.c.a("eventsDroppedCount").b(tl.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        public static final ql.c f19570c = ql.c.a("reason").b(tl.a.b().c(3).a()).a();

        @Override // ql.b
        /* renamed from: b */
        public void a(gg.c cVar, ql.e eVar) throws IOException {
            eVar.d(f19569b, cVar.a());
            eVar.b(f19570c, cVar.b());
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements ql.d<gg.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f19571a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final ql.c f19572b = ql.c.a("logSource").b(tl.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        public static final ql.c f19573c = ql.c.a("logEventDropped").b(tl.a.b().c(2).a()).a();

        @Override // ql.b
        /* renamed from: b */
        public void a(gg.d dVar, ql.e eVar) throws IOException {
            eVar.b(f19572b, dVar.b());
            eVar.b(f19573c, dVar.a());
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements ql.d<l> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f19574a = new e();

        /* renamed from: b  reason: collision with root package name */
        public static final ql.c f19575b = ql.c.d("clientMetrics");

        @Override // ql.b
        /* renamed from: b */
        public void a(l lVar, ql.e eVar) throws IOException {
            eVar.b(f19575b, lVar.b());
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements ql.d<gg.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f19576a = new f();

        /* renamed from: b  reason: collision with root package name */
        public static final ql.c f19577b = ql.c.a("currentCacheSizeBytes").b(tl.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        public static final ql.c f19578c = ql.c.a("maxCacheSizeBytes").b(tl.a.b().c(2).a()).a();

        @Override // ql.b
        /* renamed from: b */
        public void a(gg.e eVar, ql.e eVar2) throws IOException {
            eVar2.d(f19577b, eVar.a());
            eVar2.d(f19578c, eVar.b());
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements ql.d<gg.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f19579a = new g();

        /* renamed from: b  reason: collision with root package name */
        public static final ql.c f19580b = ql.c.a("startMs").b(tl.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        public static final ql.c f19581c = ql.c.a("endMs").b(tl.a.b().c(2).a()).a();

        @Override // ql.b
        /* renamed from: b */
        public void a(gg.f fVar, ql.e eVar) throws IOException {
            eVar.d(f19580b, fVar.b());
            eVar.d(f19581c, fVar.a());
        }
    }

    @Override // rl.a
    public void a(rl.b<?> bVar) {
        bVar.a(l.class, e.f19574a);
        bVar.a(gg.a.class, C0155a.f19561a);
        bVar.a(gg.f.class, g.f19579a);
        bVar.a(gg.d.class, d.f19571a);
        bVar.a(gg.c.class, c.f19568a);
        bVar.a(gg.b.class, b.f19566a);
        bVar.a(gg.e.class, f.f19576a);
    }
}
