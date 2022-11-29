package t;

import l0.s0;
import l0.u1;
import l0.z1;
import u.z0;
import uo.q0;

/* loaded from: classes.dex */
public final class f {

    @co.f(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", f = "AnimatedVisibility.kt", l = {862}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f52916w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ z0<l> f52917x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s0<Boolean> f52918y;

        /* renamed from: t.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0816a extends jo.q implements io.a<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ z0<l> f52919w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0816a(z0<l> z0Var) {
                super(0);
                this.f52919w = z0Var;
            }

            @Override // io.a
            /* renamed from: a */
            public final Boolean invoke() {
                l g10 = this.f52919w.g();
                l lVar = l.Visible;
                return Boolean.valueOf(g10 == lVar || this.f52919w.m() == lVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ s0 f52920w;

            public b(s0 s0Var) {
                this.f52920w = s0Var;
            }

            @Override // xo.d
            public Object emit(Boolean bool, ao.d<? super wn.v> dVar) {
                this.f52920w.setValue(co.b.a(bool.booleanValue()));
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z0<l> z0Var, s0<Boolean> s0Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f52917x = z0Var;
            this.f52918y = s0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f52917x, this.f52918y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f52916w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c m10 = u1.m(new C0816a(this.f52917x));
                b bVar = new b(this.f52918y);
                this.f52916w = 1;
                if (m10.a(bVar, this) == c10) {
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
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ p A;
        public final /* synthetic */ io.q<g, l0.i, Integer, wn.v> B;
        public final /* synthetic */ int C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ z0<T> f52921w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<T, Boolean> f52922x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.f f52923y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ n f52924z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(z0<T> z0Var, io.l<? super T, Boolean> lVar, x0.f fVar, n nVar, p pVar, io.q<? super g, ? super l0.i, ? super Integer, wn.v> qVar, int i10) {
            super(2);
            this.f52921w = z0Var;
            this.f52922x = lVar;
            this.f52923y = fVar;
            this.f52924z = nVar;
            this.A = pVar;
            this.B = qVar;
            this.C = i10;
        }

        public final void a(l0.i iVar, int i10) {
            f.a(this.f52921w, this.f52922x, this.f52923y, this.f52924z, this.A, this.B, iVar, this.C | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ p A;
        public final /* synthetic */ io.q<g, l0.i, Integer, wn.v> B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ z0<T> f52925w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<T, Boolean> f52926x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.f f52927y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ n f52928z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(z0<T> z0Var, io.l<? super T, Boolean> lVar, x0.f fVar, n nVar, p pVar, io.q<? super g, ? super l0.i, ? super Integer, wn.v> qVar, int i10, int i11) {
            super(2);
            this.f52925w = z0Var;
            this.f52926x = lVar;
            this.f52927y = fVar;
            this.f52928z = nVar;
            this.A = pVar;
            this.B = qVar;
            this.C = i10;
            this.D = i11;
        }

        public final void a(l0.i iVar, int i10) {
            f.b(this.f52925w, this.f52926x, this.f52927y, this.f52928z, this.A, this.B, iVar, this.C | 1, this.D);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<Boolean, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f52929w = new d();

        public d() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ String A;
        public final /* synthetic */ io.q<g, l0.i, Integer, wn.v> B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f52930w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f52931x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ n f52932y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ p f52933z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(boolean z10, x0.f fVar, n nVar, p pVar, String str, io.q<? super g, ? super l0.i, ? super Integer, wn.v> qVar, int i10, int i11) {
            super(2);
            this.f52930w = z10;
            this.f52931x = fVar;
            this.f52932y = nVar;
            this.f52933z = pVar;
            this.A = str;
            this.B = qVar;
            this.C = i10;
            this.D = i11;
        }

        public final void a(l0.i iVar, int i10) {
            f.c(this.f52930w, this.f52931x, this.f52932y, this.f52933z, this.A, this.B, iVar, this.C | 1, this.D);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void a(u.z0<T> r18, io.l<? super T, java.lang.Boolean> r19, x0.f r20, t.n r21, t.p r22, io.q<? super t.g, ? super l0.i, ? super java.lang.Integer, wn.v> r23, l0.i r24, int r25) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.f.a(u.z0, io.l, x0.f, t.n, t.p, io.q, l0.i, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void b(u.z0<T> r23, io.l<? super T, java.lang.Boolean> r24, x0.f r25, t.n r26, t.p r27, io.q<? super t.g, ? super l0.i, ? super java.lang.Integer, wn.v> r28, l0.i r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.f.b(u.z0, io.l, x0.f, t.n, t.p, io.q, l0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(boolean r23, x0.f r24, t.n r25, t.p r26, java.lang.String r27, io.q<? super t.g, ? super l0.i, ? super java.lang.Integer, wn.v> r28, l0.i r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.f.c(boolean, x0.f, t.n, t.p, java.lang.String, io.q, l0.i, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> l e(z0<T> z0Var, io.l<? super T, Boolean> lVar, T t10, l0.i iVar, int i10) {
        l lVar2;
        iVar.x(-721837653);
        iVar.C(-721837546, z0Var);
        if (z0Var.q()) {
            if (lVar.invoke(t10).booleanValue()) {
                lVar2 = l.Visible;
            } else if (lVar.invoke(z0Var.g()).booleanValue()) {
                lVar2 = l.PostExit;
            } else {
                lVar2 = l.PreEnter;
            }
        } else {
            iVar.x(-3687241);
            Object y10 = iVar.y();
            if (y10 == l0.i.f39065a.a()) {
                y10 = z1.e(Boolean.FALSE, null, 2, null);
                iVar.q(y10);
            }
            iVar.O();
            s0 s0Var = (s0) y10;
            if (lVar.invoke(z0Var.g()).booleanValue()) {
                s0Var.setValue(Boolean.TRUE);
            }
            if (lVar.invoke(t10).booleanValue()) {
                lVar2 = l.Visible;
            } else if (((Boolean) s0Var.getValue()).booleanValue()) {
                lVar2 = l.PostExit;
            } else {
                lVar2 = l.PreEnter;
            }
        }
        iVar.N();
        iVar.O();
        return lVar2;
    }
}
