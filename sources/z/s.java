package z;

import b0.c;
import java.util.HashMap;
import java.util.Map;
import l0.c2;
import l0.s0;
import l0.u1;
import l0.z1;
import uo.q0;
import xn.n0;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final int f62329a = 30;

    /* renamed from: b  reason: collision with root package name */
    public static final int f62330b = 100;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c.a<m>, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f62331w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f62332x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ HashMap<Object, Integer> f62333y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, HashMap<Object, Integer> hashMap) {
            super(1);
            this.f62331w = i10;
            this.f62332x = i11;
            this.f62333y = hashMap;
        }

        public final void a(c.a<m> aVar) {
            jo.p.h(aVar, "it");
            if (aVar.c().b() == null) {
                return;
            }
            io.l<Integer, Object> b10 = aVar.c().b();
            if (b10 != null) {
                int max = Math.max(this.f62331w, aVar.b());
                int min = Math.min(this.f62332x, (aVar.b() + aVar.a()) - 1);
                if (max > min) {
                    return;
                }
                while (true) {
                    this.f62333y.put(b10.invoke(Integer.valueOf(max - aVar.b())), Integer.valueOf(max));
                    if (max == min) {
                        return;
                    }
                    max++;
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c.a<m> aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.foundation.lazy.LazyListItemProviderImplKt$rememberItemProvider$1", f = "LazyListItemProviderImpl.kt", l = {54}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f62334w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g0 f62335x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s0<po.i> f62336y;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<po.i> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g0 f62337w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g0 g0Var) {
                super(0);
                this.f62337w = g0Var;
            }

            @Override // io.a
            /* renamed from: a */
            public final po.i invoke() {
                return s.b(this.f62337w.m());
            }
        }

        /* renamed from: z.s$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1072b implements xo.d<po.i> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ s0<po.i> f62338w;

            public C1072b(s0<po.i> s0Var) {
                this.f62338w = s0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(po.i iVar, ao.d<? super wn.v> dVar) {
                this.f62338w.setValue(iVar);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g0 g0Var, s0<po.i> s0Var, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f62335x = g0Var;
            this.f62336y = s0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f62335x, this.f62336y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f62334w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c m10 = u1.m(new a(this.f62335x));
                C1072b c1072b = new C1072b(this.f62336y);
                this.f62334w = 1;
                if (m10.a(c1072b, this) == c10) {
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
    public static final class c extends jo.q implements io.a<t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c2<io.l<c0, wn.v>> f62339w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s0<po.i> f62340x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(c2<? extends io.l<? super c0, wn.v>> c2Var, s0<po.i> s0Var) {
            super(0);
            this.f62339w = c2Var;
            this.f62340x = s0Var;
        }

        @Override // io.a
        /* renamed from: a */
        public final t invoke() {
            d0 d0Var = new d0();
            this.f62339w.getValue().invoke(d0Var);
            return new t(d0Var.h(), d0Var.g(), this.f62340x.getValue());
        }
    }

    public static final po.i b(int i10) {
        int i11 = f62329a;
        int i12 = (i10 / i11) * i11;
        int i13 = f62330b;
        return po.n.t(Math.max(i12 - i13, 0), i12 + i11 + i13);
    }

    public static final Map<Object, Integer> c(po.i iVar, b0.c<m> cVar) {
        jo.p.h(iVar, "range");
        jo.p.h(cVar, "list");
        int k10 = iVar.k();
        if (k10 >= 0) {
            int min = Math.min(iVar.m(), cVar.a() - 1);
            if (min < k10) {
                return n0.e();
            }
            HashMap hashMap = new HashMap();
            cVar.b(k10, min, new a(k10, min, hashMap));
            return hashMap;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final q d(g0 g0Var, io.l<? super c0, wn.v> lVar, l0.i iVar, int i10) {
        jo.p.h(g0Var, "state");
        jo.p.h(lVar, "content");
        iVar.x(-619676707);
        c2 l10 = u1.l(lVar, iVar, (i10 >> 3) & 14);
        iVar.x(1157296644);
        boolean P = iVar.P(g0Var);
        Object y10 = iVar.y();
        if (P || y10 == l0.i.f39065a.a()) {
            v0.h a10 = v0.h.f56484e.a();
            try {
                v0.h k10 = a10.k();
                po.i b10 = b(g0Var.m());
                a10.r(k10);
                a10.d();
                y10 = z1.e(b10, null, 2, null);
                iVar.q(y10);
            } catch (Throwable th2) {
                a10.d();
                throw th2;
            }
        }
        iVar.O();
        s0 s0Var = (s0) y10;
        l0.c0.c(s0Var, new b(g0Var, s0Var, null), iVar, 0);
        iVar.x(1157296644);
        boolean P2 = iVar.P(s0Var);
        Object y11 = iVar.y();
        if (P2 || y11 == l0.i.f39065a.a()) {
            y11 = new r(u1.b(new c(l10, s0Var)));
            iVar.q(y11);
        }
        iVar.O();
        r rVar = (r) y11;
        iVar.O();
        return rVar;
    }
}
