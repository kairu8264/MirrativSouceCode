package u0;

import io.l;
import io.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo.q;
import l0.a0;
import l0.c0;
import l0.d1;
import l0.l1;
import l0.r;
import l0.z;
import wn.v;
import xn.n0;

/* loaded from: classes.dex */
public final class d implements u0.c {

    /* renamed from: d  reason: collision with root package name */
    public static final c f54230d = new c(null);

    /* renamed from: e  reason: collision with root package name */
    public static final i<d, ?> f54231e = j.a(a.f54235w, b.f54236w);

    /* renamed from: a  reason: collision with root package name */
    public final Map<Object, Map<String, List<Object>>> f54232a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Object, C0852d> f54233b;

    /* renamed from: c  reason: collision with root package name */
    public u0.f f54234c;

    /* loaded from: classes.dex */
    public static final class a extends q implements p<k, d, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f54235w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Map<Object, Map<String, List<Object>>> invoke(k kVar, d dVar) {
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(dVar, "it");
            return dVar.g();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<Map<Object, Map<String, ? extends List<? extends Object>>>, d> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f54236w = new b();

        public b() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final d invoke(Map<Object, Map<String, List<Object>>> map) {
            jo.p.h(map, "it");
            return new d(map);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }

        public final i<d, ?> a() {
            return d.f54231e;
        }
    }

    /* renamed from: u0.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0852d {

        /* renamed from: a  reason: collision with root package name */
        public final Object f54237a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f54238b;

        /* renamed from: c  reason: collision with root package name */
        public final u0.f f54239c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ d f54240d;

        /* renamed from: u0.d$d$a */
        /* loaded from: classes.dex */
        public static final class a extends q implements l<Object, Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d f54241w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(1);
                this.f54241w = dVar;
            }

            @Override // io.l
            /* renamed from: a */
            public final Boolean invoke(Object obj) {
                jo.p.h(obj, "it");
                u0.f f10 = this.f54241w.f();
                return Boolean.valueOf(f10 != null ? f10.a(obj) : true);
            }
        }

        public C0852d(d dVar, Object obj) {
            jo.p.h(obj, "key");
            this.f54240d = dVar;
            this.f54237a = obj;
            this.f54238b = true;
            this.f54239c = h.a((Map) dVar.f54232a.get(obj), new a(dVar));
        }

        public final u0.f a() {
            return this.f54239c;
        }

        public final void b(Map<Object, Map<String, List<Object>>> map) {
            jo.p.h(map, "map");
            if (this.f54238b) {
                Map<String, List<Object>> c10 = this.f54239c.c();
                if (c10.isEmpty()) {
                    map.remove(this.f54237a);
                } else {
                    map.put(this.f54237a, c10);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements l<a0, z> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Object f54243x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ C0852d f54244y;

        /* loaded from: classes.dex */
        public static final class a implements z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ C0852d f54245a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ d f54246b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ Object f54247c;

            public a(C0852d c0852d, d dVar, Object obj) {
                this.f54245a = c0852d;
                this.f54246b = dVar;
                this.f54247c = obj;
            }

            @Override // l0.z
            public void dispose() {
                this.f54245a.b(this.f54246b.f54232a);
                this.f54246b.f54233b.remove(this.f54247c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, C0852d c0852d) {
            super(1);
            this.f54243x = obj;
            this.f54244y = c0852d;
        }

        @Override // io.l
        /* renamed from: a */
        public final z invoke(a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            boolean z10 = !d.this.f54233b.containsKey(this.f54243x);
            Object obj = this.f54243x;
            if (z10) {
                d.this.f54232a.remove(this.f54243x);
                d.this.f54233b.put(this.f54243x, this.f54244y);
                return new a(this.f54244y, d.this, this.f54243x);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements p<l0.i, Integer, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Object f54249x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ p<l0.i, Integer, v> f54250y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f54251z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Object obj, p<? super l0.i, ? super Integer, v> pVar, int i10) {
            super(2);
            this.f54249x = obj;
            this.f54250y = pVar;
            this.f54251z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            d.this.a(this.f54249x, this.f54250y, iVar, this.f54251z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public d() {
        this(null, 1, null);
    }

    public d(Map<Object, Map<String, List<Object>>> map) {
        jo.p.h(map, "savedStates");
        this.f54232a = map;
        this.f54233b = new LinkedHashMap();
    }

    @Override // u0.c
    public void a(Object obj, p<? super l0.i, ? super Integer, v> pVar, l0.i iVar, int i10) {
        jo.p.h(obj, "key");
        jo.p.h(pVar, "content");
        l0.i h10 = iVar.h(-1198538093);
        h10.x(444418301);
        h10.H(207, obj);
        h10.x(-642722479);
        h10.x(-492369756);
        Object y10 = h10.y();
        if (y10 == l0.i.f39065a.a()) {
            u0.f fVar = this.f54234c;
            if (fVar != null ? fVar.a(obj) : true) {
                y10 = new C0852d(this, obj);
                h10.q(y10);
            } else {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        h10.O();
        C0852d c0852d = (C0852d) y10;
        r.a(new d1[]{h.b().c(c0852d.a())}, pVar, h10, (i10 & 112) | 8);
        c0.a(v.f59242a, new e(obj, c0852d), h10, 0);
        h10.O();
        h10.w();
        h10.O();
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new f(obj, pVar, i10));
    }

    public final u0.f f() {
        return this.f54234c;
    }

    public final Map<Object, Map<String, List<Object>>> g() {
        Map<Object, Map<String, List<Object>>> p10 = n0.p(this.f54232a);
        for (C0852d c0852d : this.f54233b.values()) {
            c0852d.b(p10);
        }
        if (p10.isEmpty()) {
            return null;
        }
        return p10;
    }

    public final void h(u0.f fVar) {
        this.f54234c = fVar;
    }

    public /* synthetic */ d(Map map, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
