package l0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import uo.d2;
import uo.p;
import v0.h;
import v0.i;
import wn.l;

/* loaded from: classes.dex */
public final class g1 extends m {

    /* renamed from: t  reason: collision with root package name */
    public static final a f39011t = new a(null);

    /* renamed from: u  reason: collision with root package name */
    public static final int f39012u = 8;

    /* renamed from: v  reason: collision with root package name */
    public static final xo.s<n0.g<b>> f39013v = xo.i0.a(n0.a.c());

    /* renamed from: a  reason: collision with root package name */
    public long f39014a;

    /* renamed from: b  reason: collision with root package name */
    public final l0.f f39015b;

    /* renamed from: c  reason: collision with root package name */
    public final uo.b0 f39016c;

    /* renamed from: d  reason: collision with root package name */
    public final ao.g f39017d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f39018e;

    /* renamed from: f  reason: collision with root package name */
    public uo.d2 f39019f;

    /* renamed from: g  reason: collision with root package name */
    public Throwable f39020g;

    /* renamed from: h  reason: collision with root package name */
    public final List<u> f39021h;

    /* renamed from: i  reason: collision with root package name */
    public final List<Set<Object>> f39022i;

    /* renamed from: j  reason: collision with root package name */
    public final List<u> f39023j;

    /* renamed from: k  reason: collision with root package name */
    public final List<u> f39024k;

    /* renamed from: l  reason: collision with root package name */
    public final List<r0> f39025l;

    /* renamed from: m  reason: collision with root package name */
    public final Map<p0<Object>, List<r0>> f39026m;

    /* renamed from: n  reason: collision with root package name */
    public final Map<r0, q0> f39027n;

    /* renamed from: o  reason: collision with root package name */
    public uo.p<? super wn.v> f39028o;

    /* renamed from: p  reason: collision with root package name */
    public int f39029p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f39030q;

    /* renamed from: r  reason: collision with root package name */
    public final xo.s<c> f39031r;

    /* renamed from: s  reason: collision with root package name */
    public final b f39032s;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final void c(b bVar) {
            n0.g gVar;
            n0.g add;
            do {
                gVar = (n0.g) g1.f39013v.getValue();
                add = gVar.add((n0.g) bVar);
                if (gVar == add) {
                    return;
                }
            } while (!g1.f39013v.e(gVar, add));
        }

        public final void d(b bVar) {
            n0.g gVar;
            n0.g remove;
            do {
                gVar = (n0.g) g1.f39013v.getValue();
                remove = gVar.remove((n0.g) bVar);
                if (gVar == remove) {
                    return;
                }
            } while (!g1.f39013v.e(gVar, remove));
        }
    }

    /* loaded from: classes.dex */
    public final class b {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<wn.v> {
        public d() {
            super(0);
        }

        public final void a() {
            uo.p U;
            Object obj = g1.this.f39018e;
            g1 g1Var = g1.this;
            synchronized (obj) {
                U = g1Var.U();
                if (((c) g1Var.f39031r.getValue()).compareTo(c.ShuttingDown) <= 0) {
                    throw uo.r1.a("Recomposer shutdown; frame clock awaiter will never resume", g1Var.f39020g);
                }
            }
            if (U != null) {
                l.a aVar = wn.l.f59224w;
                U.resumeWith(wn.l.a(wn.v.f59242a));
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<Throwable, wn.v> {

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<Throwable, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g1 f39036w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ Throwable f39037x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g1 g1Var, Throwable th2) {
                super(1);
                this.f39036w = g1Var;
                this.f39037x = th2;
            }

            public final void a(Throwable th2) {
                Object obj = this.f39036w.f39018e;
                g1 g1Var = this.f39036w;
                Throwable th3 = this.f39037x;
                synchronized (obj) {
                    if (th3 == null) {
                        th3 = null;
                    } else if (th2 != null) {
                        if (!(!(th2 instanceof CancellationException))) {
                            th2 = null;
                        }
                        if (th2 != null) {
                            wn.a.a(th3, th2);
                        }
                    }
                    g1Var.f39020g = th3;
                    g1Var.f39031r.setValue(c.ShutDown);
                    wn.v vVar = wn.v.f59242a;
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
                a(th2);
                return wn.v.f59242a;
            }
        }

        public e() {
            super(1);
        }

        public final void a(Throwable th2) {
            uo.p pVar;
            uo.p pVar2;
            CancellationException a10 = uo.r1.a("Recomposer effect job completed", th2);
            Object obj = g1.this.f39018e;
            g1 g1Var = g1.this;
            synchronized (obj) {
                uo.d2 d2Var = g1Var.f39019f;
                pVar = null;
                if (d2Var != null) {
                    g1Var.f39031r.setValue(c.ShuttingDown);
                    if (g1Var.f39030q) {
                        if (g1Var.f39028o != null) {
                            pVar2 = g1Var.f39028o;
                            g1Var.f39028o = null;
                            d2Var.p(new a(g1Var, th2));
                            pVar = pVar2;
                        }
                    } else {
                        d2Var.c(a10);
                    }
                    pVar2 = null;
                    g1Var.f39028o = null;
                    d2Var.p(new a(g1Var, th2));
                    pVar = pVar2;
                } else {
                    g1Var.f39020g = a10;
                    g1Var.f39031r.setValue(c.ShutDown);
                    wn.v vVar = wn.v.f59242a;
                }
            }
            if (pVar != null) {
                l.a aVar = wn.l.f59224w;
                pVar.resumeWith(wn.l.a(wn.v.f59242a));
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            a(th2);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements io.p<c, ao.d<? super Boolean>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f39038w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f39039x;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(c cVar, ao.d<? super Boolean> dVar) {
            return ((f) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f39039x = obj;
            return fVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f39038w == 0) {
                wn.m.b(obj);
                return co.b.a(((c) this.f39039x) == c.ShutDown);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ m0.c<Object> f39040w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ u f39041x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(m0.c<Object> cVar, u uVar) {
            super(0);
            this.f39040w = cVar;
            this.f39041x = uVar;
        }

        public final void a() {
            m0.c<Object> cVar = this.f39040w;
            u uVar = this.f39041x;
            for (Object obj : cVar) {
                uVar.s(obj);
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l<Object, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ u f39042w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(u uVar) {
            super(1);
            this.f39042w = uVar;
        }

        public final void a(Object obj) {
            jo.p.h(obj, "value");
            this.f39042w.o(obj);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Object obj) {
            a(obj);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {744}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ io.q<uo.q0, n0, ao.d<? super wn.v>, Object> A;
        public final /* synthetic */ n0 B;

        /* renamed from: w  reason: collision with root package name */
        public Object f39043w;

        /* renamed from: x  reason: collision with root package name */
        public int f39044x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f39045y;

        @co.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {745}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f39047w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f39048x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.q<uo.q0, n0, ao.d<? super wn.v>, Object> f39049y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ n0 f39050z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(io.q<? super uo.q0, ? super n0, ? super ao.d<? super wn.v>, ? extends Object> qVar, n0 n0Var, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f39049y = qVar;
                this.f39050z = n0Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                a aVar = new a(this.f39049y, this.f39050z, dVar);
                aVar.f39048x = obj;
                return aVar;
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f39047w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    io.q<uo.q0, n0, ao.d<? super wn.v>, Object> qVar = this.f39049y;
                    n0 n0Var = this.f39050z;
                    this.f39047w = 1;
                    if (qVar.s0((uo.q0) this.f39048x, n0Var, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.p<Set<? extends Object>, v0.h, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g1 f39051w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g1 g1Var) {
                super(2);
                this.f39051w = g1Var;
            }

            public final void a(Set<? extends Object> set, v0.h hVar) {
                uo.p pVar;
                jo.p.h(set, "changed");
                jo.p.h(hVar, "<anonymous parameter 1>");
                Object obj = this.f39051w.f39018e;
                g1 g1Var = this.f39051w;
                synchronized (obj) {
                    if (((c) g1Var.f39031r.getValue()).compareTo(c.Idle) >= 0) {
                        g1Var.f39022i.add(set);
                        pVar = g1Var.U();
                    } else {
                        pVar = null;
                    }
                }
                if (pVar != null) {
                    l.a aVar = wn.l.f59224w;
                    pVar.resumeWith(wn.l.a(wn.v.f59242a));
                }
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ wn.v invoke(Set<? extends Object> set, v0.h hVar) {
                a(set, hVar);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(io.q<? super uo.q0, ? super n0, ? super ao.d<? super wn.v>, ? extends Object> qVar, n0 n0Var, ao.d<? super i> dVar) {
            super(2, dVar);
            this.A = qVar;
            this.B = n0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            i iVar = new i(this.A, this.B, dVar);
            iVar.f39045y = obj;
            return iVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: l0.g1.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {436, 454}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends co.l implements io.q<uo.q0, n0, ao.d<? super wn.v>, Object> {
        public Object A;
        public int B;
        public /* synthetic */ Object C;

        /* renamed from: w  reason: collision with root package name */
        public Object f39052w;

        /* renamed from: x  reason: collision with root package name */
        public Object f39053x;

        /* renamed from: y  reason: collision with root package name */
        public Object f39054y;

        /* renamed from: z  reason: collision with root package name */
        public Object f39055z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<Long, uo.p<? super wn.v>> {
            public final /* synthetic */ List<u> A;
            public final /* synthetic */ Set<u> B;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g1 f39056w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ List<u> f39057x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ List<r0> f39058y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ Set<u> f39059z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g1 g1Var, List<u> list, List<r0> list2, Set<u> set, List<u> list3, Set<u> set2) {
                super(1);
                this.f39056w = g1Var;
                this.f39057x = list;
                this.f39058y = list2;
                this.f39059z = set;
                this.A = list3;
                this.B = set2;
            }

            public final uo.p<wn.v> a(long j10) {
                Object a10;
                int i10;
                uo.p<wn.v> U;
                if (this.f39056w.f39015b.l()) {
                    g1 g1Var = this.f39056w;
                    g2 g2Var = g2.f39062a;
                    a10 = g2Var.a("Recomposer:animation");
                    try {
                        g1Var.f39015b.m(j10);
                        v0.h.f56484e.g();
                        wn.v vVar = wn.v.f59242a;
                        g2Var.b(a10);
                    } finally {
                    }
                }
                g1 g1Var2 = this.f39056w;
                List<u> list = this.f39057x;
                List<r0> list2 = this.f39058y;
                Set<u> set = this.f39059z;
                List<u> list3 = this.A;
                Set<u> set2 = this.B;
                a10 = g2.f39062a.a("Recomposer:recompose");
                try {
                    synchronized (g1Var2.f39018e) {
                        g1Var2.i0();
                        List list4 = g1Var2.f39023j;
                        int size = list4.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            list.add((u) list4.get(i11));
                        }
                        g1Var2.f39023j.clear();
                        wn.v vVar2 = wn.v.f59242a;
                    }
                    m0.c cVar = new m0.c();
                    m0.c cVar2 = new m0.c();
                    while (true) {
                        if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                            break;
                        }
                        int size2 = list.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            u uVar = list.get(i12);
                            cVar2.add(uVar);
                            u f02 = g1Var2.f0(uVar, cVar);
                            if (f02 != null) {
                                list3.add(f02);
                            }
                        }
                        list.clear();
                        if (cVar.k()) {
                            synchronized (g1Var2.f39018e) {
                                List list5 = g1Var2.f39021h;
                                int size3 = list5.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    u uVar2 = (u) list5.get(i13);
                                    if (!cVar2.contains(uVar2) && uVar2.m(cVar)) {
                                        list.add(uVar2);
                                    }
                                }
                                wn.v vVar3 = wn.v.f59242a;
                            }
                        }
                        if (list.isEmpty()) {
                            j.i(list2, g1Var2);
                            while (!list2.isEmpty()) {
                                xn.x.y(set, g1Var2.e0(list2, cVar));
                                j.i(list2, g1Var2);
                            }
                        }
                    }
                    if (!list3.isEmpty()) {
                        g1Var2.f39014a = g1Var2.W() + 1;
                        xn.x.y(set2, list3);
                        int size4 = list3.size();
                        for (i10 = 0; i10 < size4; i10++) {
                            list3.get(i10).q();
                        }
                        list3.clear();
                    }
                    if (!set.isEmpty()) {
                        xn.x.y(set2, set);
                        for (u uVar3 : set) {
                            uVar3.e();
                        }
                        set.clear();
                    }
                    if (!set2.isEmpty()) {
                        for (u uVar4 : set2) {
                            uVar4.v();
                        }
                        set2.clear();
                    }
                    g1Var2.V();
                    synchronized (g1Var2.f39018e) {
                        U = g1Var2.U();
                    }
                    return U;
                } finally {
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ uo.p<? super wn.v> invoke(Long l10) {
                return a(l10.longValue());
            }
        }

        public j(ao.d<? super j> dVar) {
            super(3, dVar);
        }

        public static final void i(List<r0> list, g1 g1Var) {
            list.clear();
            synchronized (g1Var.f39018e) {
                List list2 = g1Var.f39025l;
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((r0) list2.get(i10));
                }
                g1Var.f39025l.clear();
                wn.v vVar = wn.v.f59242a;
            }
        }

        @Override // io.q
        /* renamed from: g */
        public final Object s0(uo.q0 q0Var, n0 n0Var, ao.d<? super wn.v> dVar) {
            j jVar = new j(dVar);
            jVar.C = n0Var;
            return jVar.invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v11, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v11, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r6v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c7 -> B:11:0x0086). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00f5 -> B:31:0x00f9). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 260
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: l0.g1.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.l<Object, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ u f39060w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ m0.c<Object> f39061x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(u uVar, m0.c<Object> cVar) {
            super(1);
            this.f39060w = uVar;
            this.f39061x = cVar;
        }

        public final void a(Object obj) {
            jo.p.h(obj, "value");
            this.f39060w.s(obj);
            m0.c<Object> cVar = this.f39061x;
            if (cVar != null) {
                cVar.add(obj);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Object obj) {
            a(obj);
            return wn.v.f59242a;
        }
    }

    public g1(ao.g gVar) {
        jo.p.h(gVar, "effectCoroutineContext");
        l0.f fVar = new l0.f(new d());
        this.f39015b = fVar;
        uo.b0 a10 = uo.g2.a((uo.d2) gVar.get(uo.d2.f56001s));
        a10.p(new e());
        this.f39016c = a10;
        this.f39017d = gVar.plus(fVar).plus(a10);
        this.f39018e = new Object();
        this.f39021h = new ArrayList();
        this.f39022i = new ArrayList();
        this.f39023j = new ArrayList();
        this.f39024k = new ArrayList();
        this.f39025l = new ArrayList();
        this.f39026m = new LinkedHashMap();
        this.f39027n = new LinkedHashMap();
        this.f39031r = xo.i0.a(c.Inactive);
        this.f39032s = new b();
    }

    public static final void d0(List<r0> list, g1 g1Var, u uVar) {
        list.clear();
        synchronized (g1Var.f39018e) {
            Iterator<r0> it = g1Var.f39025l.iterator();
            while (it.hasNext()) {
                r0 next = it.next();
                if (jo.p.c(next.b(), uVar)) {
                    list.add(next);
                    it.remove();
                }
            }
            wn.v vVar = wn.v.f59242a;
        }
    }

    public final void R(v0.c cVar) {
        try {
            if (cVar.A() instanceof i.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            cVar.d();
        }
    }

    public final Object S(ao.d<? super wn.v> dVar) {
        wn.v vVar;
        if (!Z()) {
            uo.q qVar = new uo.q(bo.b.b(dVar), 1);
            qVar.y();
            synchronized (this.f39018e) {
                if (!Z()) {
                    this.f39028o = qVar;
                } else {
                    l.a aVar = wn.l.f59224w;
                    qVar.resumeWith(wn.l.a(wn.v.f59242a));
                }
                vVar = wn.v.f59242a;
            }
            Object t10 = qVar.t();
            if (t10 == bo.c.c()) {
                co.h.c(dVar);
            }
            return t10 == bo.c.c() ? t10 : vVar;
        }
        return wn.v.f59242a;
    }

    public final void T() {
        synchronized (this.f39018e) {
            if (this.f39031r.getValue().compareTo(c.Idle) >= 0) {
                this.f39031r.setValue(c.ShuttingDown);
            }
            wn.v vVar = wn.v.f59242a;
        }
        d2.a.a(this.f39016c, null, 1, null);
    }

    public final uo.p<wn.v> U() {
        c cVar;
        if (this.f39031r.getValue().compareTo(c.ShuttingDown) <= 0) {
            this.f39021h.clear();
            this.f39022i.clear();
            this.f39023j.clear();
            this.f39024k.clear();
            this.f39025l.clear();
            uo.p<? super wn.v> pVar = this.f39028o;
            if (pVar != null) {
                p.a.a(pVar, null, 1, null);
            }
            this.f39028o = null;
            return null;
        }
        if (this.f39019f == null) {
            this.f39022i.clear();
            this.f39023j.clear();
            cVar = this.f39015b.l() ? c.InactivePendingWork : c.Inactive;
        } else if (!(!this.f39023j.isEmpty()) && !(!this.f39022i.isEmpty()) && !(!this.f39024k.isEmpty()) && !(!this.f39025l.isEmpty()) && this.f39029p <= 0 && !this.f39015b.l()) {
            cVar = c.Idle;
        } else {
            cVar = c.PendingWork;
        }
        this.f39031r.setValue(cVar);
        if (cVar == c.PendingWork) {
            uo.p pVar2 = this.f39028o;
            this.f39028o = null;
            return pVar2;
        }
        return null;
    }

    public final void V() {
        int i10;
        List k10;
        synchronized (this.f39018e) {
            if (!this.f39026m.isEmpty()) {
                List v10 = xn.t.v(this.f39026m.values());
                this.f39026m.clear();
                k10 = new ArrayList(v10.size());
                int size = v10.size();
                for (int i11 = 0; i11 < size; i11++) {
                    r0 r0Var = (r0) v10.get(i11);
                    k10.add(wn.q.a(r0Var, this.f39027n.get(r0Var)));
                }
                this.f39027n.clear();
            } else {
                k10 = xn.s.k();
            }
        }
        int size2 = k10.size();
        for (i10 = 0; i10 < size2; i10++) {
            wn.k kVar = (wn.k) k10.get(i10);
            r0 r0Var2 = (r0) kVar.a();
            q0 q0Var = (q0) kVar.b();
            if (q0Var != null) {
                r0Var2.b().w(q0Var);
            }
        }
    }

    public final long W() {
        return this.f39014a;
    }

    public final xo.g0<c> X() {
        return this.f39031r;
    }

    public final boolean Y() {
        return (this.f39023j.isEmpty() ^ true) || this.f39015b.l();
    }

    public final boolean Z() {
        boolean z10;
        synchronized (this.f39018e) {
            z10 = true;
            if (!(!this.f39022i.isEmpty()) && !(!this.f39023j.isEmpty())) {
                if (!this.f39015b.l()) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    @Override // l0.m
    public void a(u uVar, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
        jo.p.h(uVar, "composition");
        jo.p.h(pVar, "content");
        boolean r10 = uVar.r();
        h.a aVar = v0.h.f56484e;
        v0.c h10 = aVar.h(g0(uVar), l0(uVar, null));
        try {
            v0.h k10 = h10.k();
            uVar.x(pVar);
            wn.v vVar = wn.v.f59242a;
            h10.r(k10);
            if (!r10) {
                aVar.c();
            }
            synchronized (this.f39018e) {
                if (this.f39031r.getValue().compareTo(c.ShuttingDown) > 0 && !this.f39021h.contains(uVar)) {
                    this.f39021h.add(uVar);
                }
            }
            c0(uVar);
            uVar.q();
            uVar.e();
            if (r10) {
                return;
            }
            aVar.c();
        } finally {
            R(h10);
        }
    }

    public final boolean a0() {
        boolean z10;
        boolean z11;
        synchronized (this.f39018e) {
            z10 = !this.f39030q;
        }
        if (z10) {
            return true;
        }
        Iterator<uo.d2> it = this.f39016c.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                z11 = false;
                break;
            } else if (it.next().isActive()) {
                z11 = true;
                break;
            }
        }
        return z11;
    }

    @Override // l0.m
    public void b(r0 r0Var) {
        jo.p.h(r0Var, "reference");
        synchronized (this.f39018e) {
            h1.a(this.f39026m, r0Var.c(), r0Var);
        }
    }

    public final Object b0(ao.d<? super wn.v> dVar) {
        Object p10 = xo.e.p(X(), new f(null), dVar);
        return p10 == bo.c.c() ? p10 : wn.v.f59242a;
    }

    public final void c0(u uVar) {
        synchronized (this.f39018e) {
            List<r0> list = this.f39025l;
            int size = list.size();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (jo.p.c(list.get(i10).b(), uVar)) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                wn.v vVar = wn.v.f59242a;
                ArrayList arrayList = new ArrayList();
                d0(arrayList, this, uVar);
                while (!arrayList.isEmpty()) {
                    e0(arrayList, null);
                    d0(arrayList, this, uVar);
                }
            }
        }
    }

    @Override // l0.m
    public boolean d() {
        return false;
    }

    public final List<u> e0(List<r0> list, m0.c<Object> cVar) {
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            r0 r0Var = list.get(i10);
            u b10 = r0Var.b();
            Object obj = hashMap.get(b10);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(b10, obj);
            }
            ((ArrayList) obj).add(r0Var);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            u uVar = (u) entry.getKey();
            List list2 = (List) entry.getValue();
            l0.k.X(!uVar.r());
            v0.c h10 = v0.h.f56484e.h(g0(uVar), l0(uVar, cVar));
            try {
                v0.h k10 = h10.k();
                synchronized (this.f39018e) {
                    arrayList = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        r0 r0Var2 = (r0) list2.get(i11);
                        arrayList.add(wn.q.a(r0Var2, h1.b(this.f39026m, r0Var2.c())));
                    }
                }
                uVar.k(arrayList);
                wn.v vVar = wn.v.f59242a;
                h10.r(k10);
            } finally {
                R(h10);
            }
        }
        return xn.a0.B0(hashMap.keySet());
    }

    @Override // l0.m
    public int f() {
        return 1000;
    }

    public final u f0(u uVar, m0.c<Object> cVar) {
        if (uVar.r() || uVar.j()) {
            return null;
        }
        v0.c h10 = v0.h.f56484e.h(g0(uVar), l0(uVar, cVar));
        try {
            v0.h k10 = h10.k();
            boolean z10 = true;
            if (cVar == null || !cVar.k()) {
                z10 = false;
            }
            if (z10) {
                uVar.u(new g(cVar, uVar));
            }
            boolean l10 = uVar.l();
            h10.r(k10);
            if (l10) {
                return uVar;
            }
            return null;
        } finally {
            R(h10);
        }
    }

    @Override // l0.m
    public ao.g g() {
        return this.f39017d;
    }

    public final io.l<Object, wn.v> g0(u uVar) {
        return new h(uVar);
    }

    @Override // l0.m
    public void h(r0 r0Var) {
        uo.p<wn.v> U;
        jo.p.h(r0Var, "reference");
        synchronized (this.f39018e) {
            this.f39025l.add(r0Var);
            U = U();
        }
        if (U != null) {
            l.a aVar = wn.l.f59224w;
            U.resumeWith(wn.l.a(wn.v.f59242a));
        }
    }

    public final Object h0(io.q<? super uo.q0, ? super n0, ? super ao.d<? super wn.v>, ? extends Object> qVar, ao.d<? super wn.v> dVar) {
        Object f10 = uo.j.f(this.f39015b, new i(qVar, o0.a(dVar.getContext()), null), dVar);
        return f10 == bo.c.c() ? f10 : wn.v.f59242a;
    }

    @Override // l0.m
    public void i(u uVar) {
        uo.p<wn.v> pVar;
        jo.p.h(uVar, "composition");
        synchronized (this.f39018e) {
            if (this.f39023j.contains(uVar)) {
                pVar = null;
            } else {
                this.f39023j.add(uVar);
                pVar = U();
            }
        }
        if (pVar != null) {
            l.a aVar = wn.l.f59224w;
            pVar.resumeWith(wn.l.a(wn.v.f59242a));
        }
    }

    public final void i0() {
        if (!this.f39022i.isEmpty()) {
            List<Set<Object>> list = this.f39022i;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Set<? extends Object> set = list.get(i10);
                List<u> list2 = this.f39021h;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    list2.get(i11).p(set);
                }
            }
            this.f39022i.clear();
            if (U() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    @Override // l0.m
    public void j(r0 r0Var, q0 q0Var) {
        jo.p.h(r0Var, "reference");
        jo.p.h(q0Var, "data");
        synchronized (this.f39018e) {
            this.f39027n.put(r0Var, q0Var);
            wn.v vVar = wn.v.f59242a;
        }
    }

    public final void j0(uo.d2 d2Var) {
        synchronized (this.f39018e) {
            Throwable th2 = this.f39020g;
            if (th2 == null) {
                if (this.f39031r.getValue().compareTo(c.ShuttingDown) > 0) {
                    if (this.f39019f == null) {
                        this.f39019f = d2Var;
                        U();
                    } else {
                        throw new IllegalStateException("Recomposer already running".toString());
                    }
                } else {
                    throw new IllegalStateException("Recomposer shut down".toString());
                }
            } else {
                throw th2;
            }
        }
    }

    @Override // l0.m
    public q0 k(r0 r0Var) {
        q0 remove;
        jo.p.h(r0Var, "reference");
        synchronized (this.f39018e) {
            remove = this.f39027n.remove(r0Var);
        }
        return remove;
    }

    public final Object k0(ao.d<? super wn.v> dVar) {
        Object h02 = h0(new j(null), dVar);
        return h02 == bo.c.c() ? h02 : wn.v.f59242a;
    }

    @Override // l0.m
    public void l(Set<w0.a> set) {
        jo.p.h(set, "table");
    }

    public final io.l<Object, wn.v> l0(u uVar, m0.c<Object> cVar) {
        return new k(uVar, cVar);
    }

    @Override // l0.m
    public void p(u uVar) {
        jo.p.h(uVar, "composition");
        synchronized (this.f39018e) {
            this.f39021h.remove(uVar);
            this.f39023j.remove(uVar);
            this.f39024k.remove(uVar);
            wn.v vVar = wn.v.f59242a;
        }
    }
}
