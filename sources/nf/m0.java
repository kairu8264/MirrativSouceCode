package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftPreset;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityFontConfig;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig;
import ha.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.f1;
import uo.r0;

/* loaded from: classes3.dex */
public final class m0 extends androidx.lifecycle.q0 implements uo.q0 {

    /* renamed from: b0  reason: collision with root package name */
    public static final a f43023b0 = new a(null);

    /* renamed from: c0  reason: collision with root package name */
    public static final int f43024c0 = 8;
    public final xo.s<Boolean> A;
    public final xo.g0<Boolean> B;
    public final xo.s<UniqueEmomoGiftPreset> C;
    public final xo.g0<UniqueEmomoGiftPreset> D;
    public final xo.s<List<UniqueEmomoGiftUnityTextConfig>> E;
    public final xo.g0<List<UniqueEmomoGiftUnityTextConfig>> F;
    public final xo.s<String> G;
    public final xo.g0<String> H;
    public final xo.s<List<ClosetAvatarSimpleValue>> I;
    public final xo.g0<List<ClosetAvatarSimpleValue>> J;
    public final xo.s<String> K;
    public final xo.g0<String> L;
    public final xo.s<jf.c> M;
    public final xo.g0<jf.c> N;
    public final wo.f<wn.v> O;
    public final wo.f<wn.v> P;
    public final wo.f<Integer> Q;
    public final xo.s<Integer> R;
    public final xo.g0<Integer> S;
    public final xo.s<Boolean> T;
    public final xo.c<Boolean> U;
    public final xo.s<List<UniqueEmomoGiftUnityFontConfig>> V;
    public final xo.g0<List<UniqueEmomoGiftUnityFontConfig>> W;
    public final androidx.lifecycle.e0<ha.a> X;
    public final LiveData<ha.a> Y;
    public final wo.f<File> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wo.f<MRError> f43025a0;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f43026y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f43027z;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoRichGiftCreationStore$isPreviewButtonEnabled$2", f = "UniqueEmomoRichGiftCreationStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.q<Boolean, Boolean, ao.d<? super Boolean>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43028w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ boolean f43029x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ boolean f43030y;

        public b(ao.d<? super b> dVar) {
            super(3, dVar);
        }

        public final Object a(boolean z10, boolean z11, ao.d<? super Boolean> dVar) {
            b bVar = new b(dVar);
            bVar.f43029x = z10;
            bVar.f43030y = z11;
            return bVar.invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f43028w == 0) {
                wn.m.b(obj);
                return co.b.a((this.f43029x || this.f43030y) ? false : true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ Object s0(Boolean bool, Boolean bool2, ao.d<? super Boolean> dVar) {
            return a(bool.booleanValue(), bool2.booleanValue(), dVar);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return zn.a.c(Integer.valueOf(((UniqueEmomoGiftUnityTextConfig) t10).getIndex()), Integer.valueOf(((UniqueEmomoGiftUnityTextConfig) t11).getIndex()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return zn.a.c(Integer.valueOf(((UniqueEmomoGiftUnityTextConfig) t10).getIndex()), Integer.valueOf(((UniqueEmomoGiftUnityTextConfig) t11).getIndex()));
        }
    }

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoRichGiftCreationStore$on$14", f = "UniqueEmomoRichGiftCreationStore.kt", l = {187}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43031w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f43033y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f43033y = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f43033y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43031w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = m0.this.Q;
                Integer d10 = co.b.d(this.f43033y);
                this.f43031w = 1;
                if (fVar.r(d10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoRichGiftCreationStore$on$15", f = "UniqueEmomoRichGiftCreationStore.kt", l = {212}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43034w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f1.i f43036y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(f1.i iVar, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f43036y = iVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f43036y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43034w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = m0.this.Z;
                File a10 = this.f43036y.a();
                this.f43034w = 1;
                if (fVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoRichGiftCreationStore$on$16", f = "UniqueEmomoRichGiftCreationStore.kt", l = {219}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43037w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f1.h f43039y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f1.h hVar, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f43039y = hVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f43039y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43037w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = m0.this.f43025a0;
                MRError a10 = this.f43039y.a();
                this.f43037w = 1;
                if (fVar.r(a10, this) == c10) {
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

    /* loaded from: classes3.dex */
    public static final class h extends jo.q implements io.l<ClosetAvatarSimpleValue, Comparable<?>> {

        /* renamed from: w  reason: collision with root package name */
        public static final h f43040w = new h();

        public h() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Comparable<?> invoke(ClosetAvatarSimpleValue closetAvatarSimpleValue) {
            jo.p.h(closetAvatarSimpleValue, "it");
            Long updatedAt = closetAvatarSimpleValue.getUpdatedAt();
            return Long.valueOf((updatedAt != null ? updatedAt.longValue() : 0L) * (-1));
        }
    }

    /* loaded from: classes3.dex */
    public static final class i extends jo.q implements io.l<ClosetAvatarSimpleValue, Comparable<?>> {

        /* renamed from: w  reason: collision with root package name */
        public static final i f43041w = new i();

        public i() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Comparable<?> invoke(ClosetAvatarSimpleValue closetAvatarSimpleValue) {
            jo.p.h(closetAvatarSimpleValue, "it");
            return Integer.valueOf(Integer.parseInt(closetAvatarSimpleValue.getId()) * (-1));
        }
    }

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoRichGiftCreationStore$on$4", f = "UniqueEmomoRichGiftCreationStore.kt", l = {141}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43042w;

        public j(ao.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43042w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = m0.this.O;
                wn.v vVar = wn.v.f59242a;
                this.f43042w = 1;
                if (fVar.r(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoRichGiftCreationStore$on$9", f = "UniqueEmomoRichGiftCreationStore.kt", l = {161}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43044w;

        public k(ao.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43044w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = m0.this.P;
                wn.v vVar = wn.v.f59242a;
                this.f43044w = 1;
                if (fVar.r(vVar, this) == c10) {
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

    /* loaded from: classes3.dex */
    public static final class l implements xo.c<Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ xo.c f43046w;

        /* loaded from: classes3.dex */
        public static final class a<T> implements xo.d {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.d f43047w;

            @co.f(c = "com.dena.mirrorman.store.UniqueEmomoRichGiftCreationStore$special$$inlined$map$1$2", f = "UniqueEmomoRichGiftCreationStore.kt", l = {224}, m = "emit")
            /* renamed from: nf.m0$l$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0635a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public /* synthetic */ Object f43048w;

                /* renamed from: x  reason: collision with root package name */
                public int f43049x;

                public C0635a(ao.d dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f43048w = obj;
                    this.f43049x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(xo.d dVar) {
                this.f43047w = dVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // xo.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, ao.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof nf.m0.l.a.C0635a
                    if (r0 == 0) goto L13
                    r0 = r6
                    nf.m0$l$a$a r0 = (nf.m0.l.a.C0635a) r0
                    int r1 = r0.f43049x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f43049x = r1
                    goto L18
                L13:
                    nf.m0$l$a$a r0 = new nf.m0$l$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f43048w
                    java.lang.Object r1 = bo.c.c()
                    int r2 = r0.f43049x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    wn.m.b(r6)
                    goto L4f
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    wn.m.b(r6)
                    xo.d r6 = r4.f43047w
                    java.lang.Number r5 = (java.lang.Number) r5
                    int r5 = r5.intValue()
                    r2 = -1
                    if (r5 == r2) goto L41
                    r5 = r3
                    goto L42
                L41:
                    r5 = 0
                L42:
                    java.lang.Boolean r5 = co.b.a(r5)
                    r0.f43049x = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4f
                    return r1
                L4f:
                    wn.v r5 = wn.v.f59242a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: nf.m0.l.a.emit(java.lang.Object, ao.d):java.lang.Object");
            }
        }

        public l(xo.c cVar) {
            this.f43046w = cVar;
        }

        @Override // xo.c
        public Object a(xo.d<? super Boolean> dVar, ao.d dVar2) {
            Object a10 = this.f43046w.a(new a(dVar), dVar2);
            return a10 == bo.c.c() ? a10 : wn.v.f59242a;
        }
    }

    public m0(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f43026y = aVar;
        this.f43027z = r0.b();
        aVar.b(this);
        Boolean bool = Boolean.FALSE;
        xo.s<Boolean> a10 = xo.i0.a(bool);
        this.A = a10;
        this.B = a10;
        xo.s<UniqueEmomoGiftPreset> a11 = xo.i0.a(null);
        this.C = a11;
        this.D = a11;
        xo.s<List<UniqueEmomoGiftUnityTextConfig>> a12 = xo.i0.a(xn.s.k());
        this.E = a12;
        this.F = a12;
        xo.s<String> a13 = xo.i0.a("");
        this.G = a13;
        this.H = a13;
        xo.s<List<ClosetAvatarSimpleValue>> a14 = xo.i0.a(xn.s.k());
        this.I = a14;
        this.J = a14;
        xo.s<String> a15 = xo.i0.a("");
        this.K = a15;
        this.L = a15;
        xo.s<jf.c> a16 = xo.i0.a(null);
        this.M = a16;
        this.N = a16;
        this.O = wo.g.a(-2);
        this.P = wo.g.a(-2);
        this.Q = wo.g.a(-2);
        xo.s<Integer> a17 = xo.i0.a(-1);
        this.R = a17;
        this.S = a17;
        xo.s<Boolean> a18 = xo.i0.a(bool);
        this.T = a18;
        this.U = xo.e.h(new l(a17), a18, new b(null));
        xo.s<List<UniqueEmomoGiftUnityFontConfig>> a19 = xo.i0.a(xn.s.k());
        this.V = a19;
        this.W = a19;
        androidx.lifecycle.e0<ha.a> e0Var = new androidx.lifecycle.e0<>(a.d.f34697b);
        this.X = e0Var;
        this.Y = e0Var;
        this.Z = wo.g.a(-2);
        this.f43025a0 = wo.g.a(-2);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f43026y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43027z.getCoroutineContext();
    }

    public final xo.g0<jf.c> k() {
        return this.N;
    }

    public final xo.g0<Integer> l() {
        return this.S;
    }

    public final LiveData<ha.a> m() {
        return this.Y;
    }

    public final xo.c<wn.v> n() {
        return xo.e.a(this.P);
    }

    public final xo.g0<List<UniqueEmomoGiftUnityFontConfig>> o() {
        return this.W;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f1.b bVar) {
        jo.p.h(bVar, "event");
        this.X.p(a.b.f34695b);
    }

    public final xo.c<wn.v> p() {
        return xo.e.a(this.O);
    }

    public final xo.g0<List<ClosetAvatarSimpleValue>> q() {
        return this.J;
    }

    public final xo.g0<UniqueEmomoGiftPreset> r() {
        return this.D;
    }

    public final xo.c<MRError> s() {
        return xo.e.a(this.f43025a0);
    }

    public final xo.c<File> t() {
        return xo.e.a(this.Z);
    }

    public final xo.g0<String> u() {
        return this.L;
    }

    public final xo.c<Integer> v() {
        return xo.e.a(this.Q);
    }

    public final xo.g0<List<UniqueEmomoGiftUnityTextConfig>> w() {
        return this.F;
    }

    public final xo.g0<String> x() {
        return this.H;
    }

    public final xo.g0<Boolean> y() {
        return this.B;
    }

    public final xo.c<Boolean> z() {
        return this.U;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f1.c cVar) {
        jo.p.h(cVar, "event");
        this.X.p(a.d.f34697b);
        this.A.setValue(Boolean.FALSE);
        this.C.setValue(cVar.c());
        this.V.setValue(cVar.c().getFonts());
        this.E.setValue(cVar.c().getDefaultTexts());
        this.M.setValue(cVar.b());
        xo.s<List<ClosetAvatarSimpleValue>> sVar = this.I;
        List v02 = xn.a0.v0(cVar.a().getMotions(), zn.a.b(h.f43040w, i.f43041w));
        ArrayList arrayList = new ArrayList();
        for (Object obj : v02) {
            if (!((ClosetAvatarSimpleValue) obj).isTrial()) {
                arrayList.add(obj);
            }
        }
        sVar.setValue(arrayList);
        this.K.setValue(((ClosetAvatarSimpleValue) xn.a0.X(this.I.getValue())).getId());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f1.a aVar) {
        jo.p.h(aVar, "event");
        this.X.p(new a.C0439a(aVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f1.m mVar) {
        jo.p.h(mVar, "event");
        this.A.setValue(Boolean.TRUE);
        this.G.setValue(mVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f1.e eVar) {
        jo.p.h(eVar, "event");
        this.K.setValue(eVar.a());
        uo.l.d(this, null, null, new j(null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bc, code lost:
        r1.add(new com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig(r6, r5.getUnityFontName(), r8, r9, true));
     */
    @dq.l(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void on(pd.f1.d r12) {
        /*
            r11 = this;
            java.lang.String r0 = "event"
            jo.p.h(r12, r0)
            xo.s<java.lang.Boolean> r0 = r11.A
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            xo.s<java.util.List<com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig>> r0 = r11.E
            java.lang.Object r1 = r0.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r3 = r1.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r1.next()
            r6 = r3
            com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig r6 = (com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig) r6
            int r6 = r6.getIndex()
            int r7 = r12.b()
            if (r6 != r7) goto L37
            goto L38
        L37:
            r4 = r5
        L38:
            if (r4 != 0) goto L1d
            r2.add(r3)
            goto L1d
        L3e:
            xo.s<java.util.List<com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig>> r1 = r11.E
            java.lang.Object r1 = r1.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L4f:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L6f
            java.lang.Object r6 = r1.next()
            r7 = r6
            com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig r7 = (com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig) r7
            int r7 = r7.getIndex()
            int r8 = r12.b()
            if (r7 != r8) goto L68
            r7 = r4
            goto L69
        L68:
            r7 = r5
        L69:
            if (r7 == 0) goto L4f
            r3.add(r6)
            goto L4f
        L6f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 10
            int r4 = xn.t.u(r3, r4)
            r1.<init>(r4)
            java.util.Iterator r3 = r3.iterator()
        L7e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Ld3
            java.lang.Object r4 = r3.next()
            com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig r4 = (com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig) r4
            int r8 = r12.b()
            java.lang.String r9 = r4.getText()
            java.lang.String r6 = r12.a()
            xo.s<java.util.List<com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityFontConfig>> r4 = r11.V
            java.lang.Object r4 = r4.getValue()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        La2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lcb
            java.lang.Object r5 = r4.next()
            com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityFontConfig r5 = (com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityFontConfig) r5
            java.lang.String r7 = r5.getId()
            java.lang.String r10 = r12.a()
            boolean r7 = jo.p.c(r7, r10)
            if (r7 == 0) goto La2
            java.lang.String r7 = r5.getUnityFontName()
            com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig r4 = new com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig
            r10 = 1
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            r1.add(r4)
            goto L7e
        Lcb:
            java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r12.<init>(r0)
            throw r12
        Ld3:
            java.util.List r12 = xn.a0.o0(r2, r1)
            nf.m0$c r1 = new nf.m0$c
            r1.<init>()
            java.util.List r12 = xn.a0.v0(r12, r1)
            r0.setValue(r12)
            r2 = 0
            r3 = 0
            nf.m0$k r4 = new nf.m0$k
            r12 = 0
            r4.<init>(r12)
            r5 = 3
            r6 = 0
            r1 = r11
            uo.j.d(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.m0.on(pd.f1$d):void");
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f1.l lVar) {
        jo.p.h(lVar, "event");
        this.R.setValue(Integer.valueOf(lVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f1.j jVar) {
        jo.p.h(jVar, "event");
        this.A.setValue(Boolean.TRUE);
        int intValue = this.R.getValue().intValue();
        xo.s<List<UniqueEmomoGiftUnityTextConfig>> sVar = this.E;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sVar.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((UniqueEmomoGiftUnityTextConfig) next).getIndex() == intValue)) {
                arrayList.add(next);
            }
        }
        ArrayList<UniqueEmomoGiftUnityTextConfig> arrayList2 = new ArrayList();
        for (Object obj : this.E.getValue()) {
            if (((UniqueEmomoGiftUnityTextConfig) obj).getIndex() == intValue) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(xn.t.u(arrayList2, 10));
        for (UniqueEmomoGiftUnityTextConfig uniqueEmomoGiftUnityTextConfig : arrayList2) {
            arrayList3.add(new UniqueEmomoGiftUnityTextConfig(uniqueEmomoGiftUnityTextConfig.getFontId(), uniqueEmomoGiftUnityTextConfig.getUnityFontName(), intValue, jVar.a(), true));
        }
        sVar.setValue(xn.a0.v0(xn.a0.o0(arrayList, arrayList3), new d()));
        uo.l.d(this, null, null, new e(intValue, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f1.k kVar) {
        jo.p.h(kVar, "event");
        this.R.setValue(-1);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f1.g gVar) {
        jo.p.h(gVar, "event");
        this.T.setValue(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f1.f fVar) {
        jo.p.h(fVar, "event");
        this.T.setValue(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f1.i iVar) {
        jo.p.h(iVar, "event");
        uo.l.d(this, null, null, new f(iVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f1.h hVar) {
        jo.p.h(hVar, "event");
        uo.l.d(this, null, null, new g(hVar, null), 3, null);
    }
}
