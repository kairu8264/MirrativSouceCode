package v9;

import a0.b;
import a0.c0;
import a0.e0;
import a0.f0;
import a0.o;
import a0.y;
import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import io.p;
import io.r;
import java.util.ArrayList;
import java.util.List;
import jo.q;
import l0.h2;
import l0.i;
import l0.l1;
import l0.s0;
import l0.u1;
import l0.z1;
import q1.w;
import s1.a;
import uo.b1;
import uo.q0;
import v0.s;
import wn.v;
import x0.a;
import x0.f;
import xn.a0;
import xn.t;
import y.d1;
import y.f;
import y.g1;
import y.n1;
import y.q1;
import y.r0;
import y.s1;
import y.u1;
import y.v1;

/* loaded from: classes.dex */
public final class n {

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaViewKt$EmomoQuestEquipmentGachaView$1$1", f = "EmomoQuestEquipmentGachaView.kt", l = {124}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ v9.c A;
        public final /* synthetic */ s0<Boolean> B;

        /* renamed from: w  reason: collision with root package name */
        public int f57154w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ m2.d f57155x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s0<Integer> f57156y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ e0 f57157z;

        /* renamed from: v9.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0921a extends q implements io.a<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ s0<Integer> f57158w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0921a(s0<Integer> s0Var) {
                super(0);
                this.f57158w = s0Var;
            }

            @Override // io.a
            /* renamed from: a */
            public final Integer invoke() {
                return Integer.valueOf(n.b(this.f57158w));
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements xo.d<Integer> {
            public final /* synthetic */ s0<Integer> A;
            public final /* synthetic */ s0<Boolean> B;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e0 f57159w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f57160x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f57161y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ v9.c f57162z;

            @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaViewKt$EmomoQuestEquipmentGachaView$1$1$2", f = "EmomoQuestEquipmentGachaView.kt", l = {126, 132, 133}, m = "emit")
            /* renamed from: v9.n$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0922a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public Object f57163w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f57164x;

                /* renamed from: z  reason: collision with root package name */
                public int f57166z;

                public C0922a(ao.d<? super C0922a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f57164x = obj;
                    this.f57166z |= Integer.MIN_VALUE;
                    return b.this.a(0, this);
                }
            }

            public b(e0 e0Var, int i10, int i11, v9.c cVar, s0<Integer> s0Var, s0<Boolean> s0Var2) {
                this.f57159w = e0Var;
                this.f57160x = i10;
                this.f57161y = i11;
                this.f57162z = cVar;
                this.A = s0Var;
                this.B = s0Var2;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x009e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(int r9, ao.d<? super wn.v> r10) {
                /*
                    r8 = this;
                    boolean r9 = r10 instanceof v9.n.a.b.C0922a
                    if (r9 == 0) goto L13
                    r9 = r10
                    v9.n$a$b$a r9 = (v9.n.a.b.C0922a) r9
                    int r0 = r9.f57166z
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r0 & r1
                    if (r2 == 0) goto L13
                    int r0 = r0 - r1
                    r9.f57166z = r0
                    goto L18
                L13:
                    v9.n$a$b$a r9 = new v9.n$a$b$a
                    r9.<init>(r10)
                L18:
                    r3 = r9
                    java.lang.Object r9 = r3.f57164x
                    java.lang.Object r10 = bo.c.c()
                    int r0 = r3.f57166z
                    r1 = 3
                    r2 = 2
                    r6 = 1
                    if (r0 == 0) goto L4e
                    if (r0 == r6) goto L46
                    if (r0 == r2) goto L3d
                    if (r0 != r1) goto L35
                    java.lang.Object r10 = r3.f57163w
                    v9.n$a$b r10 = (v9.n.a.b) r10
                    wn.m.b(r9)
                    goto La0
                L35:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L3d:
                    java.lang.Object r0 = r3.f57163w
                    v9.n$a$b r0 = (v9.n.a.b) r0
                    wn.m.b(r9)
                L44:
                    r9 = r0
                    goto L8a
                L46:
                    java.lang.Object r0 = r3.f57163w
                    v9.n$a$b r0 = (v9.n.a.b) r0
                    wn.m.b(r9)
                    goto L6b
                L4e:
                    wn.m.b(r9)
                    a0.e0 r9 = r8.f57159w
                    int r0 = r8.f57160x
                    l0.s0<java.lang.Integer> r4 = r8.A
                    int r4 = v9.n.f(r4)
                    int r0 = r0 + r4
                    int r4 = r8.f57161y
                    int r4 = -r4
                    r3.f57163w = r8
                    r3.f57166z = r6
                    java.lang.Object r9 = r9.g(r0, r4, r3)
                    if (r9 != r10) goto L6a
                    return r10
                L6a:
                    r0 = r8
                L6b:
                    l0.s0<java.lang.Integer> r9 = r0.A
                    int r9 = v9.n.f(r9)
                    v9.c r4 = r0.f57162z
                    java.util.List r4 = r4.a()
                    int r4 = r4.size()
                    if (r9 < r4) goto La5
                    r4 = 1000(0x3e8, double:4.94E-321)
                    r3.f57163w = r0
                    r3.f57166z = r2
                    java.lang.Object r9 = uo.b1.a(r4, r3)
                    if (r9 != r10) goto L44
                    return r10
                L8a:
                    a0.e0 r0 = r9.f57159w
                    r2 = 0
                    r4 = 0
                    r5 = 2
                    r7 = 0
                    r3.f57163w = r9
                    r3.f57166z = r1
                    r1 = r2
                    r2 = r4
                    r4 = r5
                    r5 = r7
                    java.lang.Object r0 = a0.e0.h(r0, r1, r2, r3, r4, r5)
                    if (r0 != r10) goto L9f
                    return r10
                L9f:
                    r10 = r9
                La0:
                    l0.s0<java.lang.Boolean> r9 = r10.B
                    v9.n.i(r9, r6)
                La5:
                    wn.v r9 = wn.v.f59242a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: v9.n.a.b.a(int, ao.d):java.lang.Object");
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Integer num, ao.d dVar) {
                return a(num.intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m2.d dVar, s0<Integer> s0Var, e0 e0Var, v9.c cVar, s0<Boolean> s0Var2, ao.d<? super a> dVar2) {
            super(2, dVar2);
            this.f57155x = dVar;
            this.f57156y = s0Var;
            this.f57157z = e0Var;
            this.A = cVar;
            this.B = s0Var2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f57155x, this.f57156y, this.f57157z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57154w;
            if (i10 == 0) {
                wn.m.b(obj);
                int X = this.f57155x.X(m2.g.l(198));
                xo.c j10 = xo.e.j(u1.m(new C0921a(this.f57156y)));
                b bVar = new b(this.f57157z, 1, X, this.A, this.f57156y, this.B);
                this.f57154w = 1;
                if (j10.a(bVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaViewKt$EmomoQuestEquipmentGachaView$2$1", f = "EmomoQuestEquipmentGachaView.kt", l = {145}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57167w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s0<Integer> f57168x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s<v9.b> f57169y;

        /* loaded from: classes.dex */
        public static final class a extends q implements io.a<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ s0<Integer> f57170w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s0<Integer> s0Var) {
                super(0);
                this.f57170w = s0Var;
            }

            @Override // io.a
            /* renamed from: a */
            public final Integer invoke() {
                return Integer.valueOf(n.b(this.f57170w));
            }
        }

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaViewKt$EmomoQuestEquipmentGachaView$2$1$2", f = "EmomoQuestEquipmentGachaView.kt", l = {143}, m = "invokeSuspend")
        /* renamed from: v9.n$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0923b extends co.l implements p<xo.d<? super Integer>, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57171w;

            public C0923b(ao.d<? super C0923b> dVar) {
                super(2, dVar);
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(xo.d<? super Integer> dVar, ao.d<? super v> dVar2) {
                return ((C0923b) create(dVar, dVar2)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new C0923b(dVar);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57171w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f57171w = 1;
                    if (b1.a(1000L, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements xo.d<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ s<v9.b> f57172w;

            public c(s<v9.b> sVar) {
                this.f57172w = sVar;
            }

            public final Object a(int i10, ao.d<? super v> dVar) {
                v9.b bVar = (v9.b) a0.a0(this.f57172w, i10);
                if (bVar != null) {
                    bVar.play();
                }
                return v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Integer num, ao.d dVar) {
                return a(num.intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s0<Integer> s0Var, s<v9.b> sVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f57168x = s0Var;
            this.f57169y = sVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f57168x, this.f57169y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57167w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c w10 = xo.e.w(xo.e.j(u1.m(new a(this.f57168x))), new C0923b(null));
                c cVar = new c(this.f57169y);
                this.f57167w = 1;
                if (w10.a(cVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.l<y, v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ s0<Integer> B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v9.c f57173w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s<v9.b> f57174x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s0<Boolean> f57175y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<Integer, v> f57176z;

        /* loaded from: classes.dex */
        public static final class a extends q implements io.l<a0.q, a0.c> {

            /* renamed from: w  reason: collision with root package name */
            public static final a f57177w = new a();

            public a() {
                super(1);
            }

            public final long a(a0.q qVar) {
                jo.p.h(qVar, "$this$item");
                return c0.a(qVar.a());
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ a0.c invoke(a0.q qVar) {
                return a0.c.a(a(qVar));
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends q implements p<Integer, v9.f, Object> {

            /* renamed from: w  reason: collision with root package name */
            public static final b f57178w = new b();

            public b() {
                super(2);
            }

            public final Object a(int i10, v9.f fVar) {
                jo.p.h(fVar, "<anonymous parameter 1>");
                return Integer.valueOf(i10);
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ Object invoke(Integer num, v9.f fVar) {
                return a(num.intValue(), fVar);
            }
        }

        /* renamed from: v9.n$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0924c extends q implements io.q<a0.q, Integer, v9.f, a0.c> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ v9.c f57179w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0924c(v9.c cVar) {
                super(3);
                this.f57179w = cVar;
            }

            public final long a(a0.q qVar, int i10, v9.f fVar) {
                jo.p.h(qVar, "$this$itemsIndexed");
                jo.p.h(fVar, "<anonymous parameter 1>");
                if (this.f57179w.a().size() == 1) {
                    return c0.a(qVar.a());
                }
                return c0.a(1);
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ a0.c s0(a0.q qVar, Integer num, v9.f fVar) {
                return a0.c.a(a(qVar, num.intValue(), fVar));
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.l<Integer, v> f57180w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f57181x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ s0<Boolean> f57182y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(io.l<? super Integer, v> lVar, int i10, s0<Boolean> s0Var) {
                super(0);
                this.f57180w = lVar;
                this.f57181x = i10;
                this.f57182y = s0Var;
            }

            public final void a() {
                if (n.d(this.f57182y)) {
                    this.f57180w.invoke(Integer.valueOf(this.f57181x));
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ s0<Integer> f57183w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(s0<Integer> s0Var) {
                super(0);
                this.f57183w = s0Var;
            }

            public final void a() {
                s0<Integer> s0Var = this.f57183w;
                n.c(s0Var, n.b(s0Var) + 1);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ v9.b f57184w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(v9.b bVar) {
                super(0);
                this.f57184w = bVar;
            }

            public final void a() {
                this.f57184w.finish();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class g extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.l<Integer, v> f57185w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f57186x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ s0<Boolean> f57187y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public g(io.l<? super Integer, v> lVar, int i10, s0<Boolean> s0Var) {
                super(0);
                this.f57185w = lVar;
                this.f57186x = i10;
                this.f57187y = s0Var;
            }

            public final void a() {
                if (n.d(this.f57187y)) {
                    this.f57185w.invoke(Integer.valueOf(this.f57186x));
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class h extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ s0<Integer> f57188w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(s0<Integer> s0Var) {
                super(0);
                this.f57188w = s0Var;
            }

            public final void a() {
                s0<Integer> s0Var = this.f57188w;
                n.c(s0Var, n.b(s0Var) + 1);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class i extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ v9.b f57189w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(v9.b bVar) {
                super(0);
                this.f57189w = bVar;
            }

            public final void a() {
                this.f57189w.finish();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class j extends q implements io.l<a0.q, a0.c> {

            /* renamed from: w  reason: collision with root package name */
            public static final j f57190w = new j();

            public j() {
                super(1);
            }

            public final long a(a0.q qVar) {
                jo.p.h(qVar, "$this$item");
                return c0.a(qVar.a());
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ a0.c invoke(a0.q qVar) {
                return a0.c.a(a(qVar));
            }
        }

        /* loaded from: classes.dex */
        public static final class k extends q implements io.l<Integer, Object> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ p f57191w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ List f57192x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(p pVar, List list) {
                super(1);
                this.f57191w = pVar;
                this.f57192x = list;
            }

            public final Object a(int i10) {
                return this.f57191w.invoke(Integer.valueOf(i10), this.f57192x.get(i10));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* loaded from: classes.dex */
        public static final class l extends q implements p<a0.q, Integer, a0.c> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.q f57193w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ List f57194x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(io.q qVar, List list) {
                super(2);
                this.f57193w = qVar;
                this.f57194x = list;
            }

            public final long a(a0.q qVar, int i10) {
                jo.p.h(qVar, "$this$null");
                return ((a0.c) this.f57193w.s0(qVar, Integer.valueOf(i10), this.f57194x.get(i10))).g();
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ a0.c invoke(a0.q qVar, Integer num) {
                return a0.c.a(a(qVar, num.intValue()));
            }
        }

        /* loaded from: classes.dex */
        public static final class m extends q implements io.l<Integer, Object> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List f57195w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(List list) {
                super(1);
                this.f57195w = list;
            }

            public final Object a(int i10) {
                this.f57195w.get(i10);
                return null;
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* renamed from: v9.n$c$n  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0925n extends q implements r<o, Integer, l0.i, Integer, v> {
            public final /* synthetic */ int A;
            public final /* synthetic */ s0 B;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List f57196w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ s f57197x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ s0 f57198y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.l f57199z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0925n(List list, s sVar, s0 s0Var, io.l lVar, int i10, s0 s0Var2) {
                super(4);
                this.f57196w = list;
                this.f57197x = sVar;
                this.f57198y = s0Var;
                this.f57199z = lVar;
                this.A = i10;
                this.B = s0Var2;
            }

            @Override // io.r
            public /* bridge */ /* synthetic */ v F(o oVar, Integer num, l0.i iVar, Integer num2) {
                a(oVar, num.intValue(), iVar, num2.intValue());
                return v.f59242a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v0, types: [l0.i] */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v22 */
            /* JADX WARN: Type inference failed for: r1v25 */
            /* JADX WARN: Type inference failed for: r1v9 */
            public final void a(o oVar, int i10, l0.i iVar, int i11) {
                int i12;
                int i13;
                jo.p.h(oVar, "$this$items");
                if ((i11 & 14) == 0) {
                    i12 = (iVar.P(oVar) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    i12 |= iVar.d(i10) ? 32 : 16;
                }
                if ((i12 & 731) == 146 && iVar.j()) {
                    iVar.I();
                    return;
                }
                int i14 = (i12 & 112) | (i12 & 14);
                v9.f fVar = (v9.f) this.f57196w.get(i10);
                if ((i14 & 112) == 0) {
                    i13 = i14 | (iVar.d(i10) ? 32 : 16);
                } else {
                    i13 = i14;
                }
                if ((i14 & 896) == 0) {
                    i13 |= iVar.P(fVar) ? 256 : 128;
                }
                if ((i13 & 5841) == 1168 && iVar.j()) {
                    iVar.I();
                    return;
                }
                v9.b bVar = (v9.b) this.f57197x.get(i10);
                if (bVar instanceof v9.l) {
                    iVar.x(-800137073);
                    v9.l lVar = (v9.l) bVar;
                    Integer valueOf = Integer.valueOf(i10);
                    iVar.x(1618982084);
                    boolean P = iVar.P(this.f57198y) | iVar.P(this.f57199z) | iVar.P(valueOf);
                    Object y10 = iVar.y();
                    if (P || y10 == l0.i.f39065a.a()) {
                        y10 = new d(this.f57199z, i10, this.f57198y);
                        iVar.q(y10);
                    }
                    iVar.O();
                    io.a aVar = (io.a) y10;
                    iVar.x(1157296644);
                    boolean P2 = iVar.P(this.B);
                    Object y11 = iVar.y();
                    if (P2 || y11 == l0.i.f39065a.a()) {
                        y11 = new e(this.B);
                        iVar.q(y11);
                    }
                    iVar.O();
                    io.a aVar2 = y11;
                    iVar.x(1157296644);
                    boolean P3 = iVar.P(bVar);
                    Object y12 = iVar.y();
                    if (P3 || y12 == l0.i.f39065a.a()) {
                        y12 = new f(bVar);
                        iVar.q(y12);
                    }
                    iVar.O();
                    v9.m.a(null, fVar, lVar, aVar, aVar2, y12, iVar, (i13 >> 3) & 112, 1);
                    iVar.O();
                } else if (bVar instanceof v9.i) {
                    iVar.x(-800136523);
                    v9.i iVar2 = (v9.i) bVar;
                    Integer valueOf2 = Integer.valueOf(i10);
                    iVar.x(1618982084);
                    boolean P4 = iVar.P(this.f57198y) | iVar.P(this.f57199z) | iVar.P(valueOf2);
                    Object y13 = iVar.y();
                    if (P4 || y13 == l0.i.f39065a.a()) {
                        y13 = new g(this.f57199z, i10, this.f57198y);
                        iVar.q(y13);
                    }
                    iVar.O();
                    io.a aVar3 = (io.a) y13;
                    iVar.x(1157296644);
                    boolean P5 = iVar.P(this.B);
                    Object y14 = iVar.y();
                    if (P5 || y14 == l0.i.f39065a.a()) {
                        y14 = new h(this.B);
                        iVar.q(y14);
                    }
                    iVar.O();
                    io.a aVar4 = y14;
                    iVar.x(1157296644);
                    boolean P6 = iVar.P(bVar);
                    Object y15 = iVar.y();
                    if (P6 || y15 == l0.i.f39065a.a()) {
                        y15 = new i(bVar);
                        iVar.q(y15);
                    }
                    iVar.O();
                    v9.j.a(null, fVar, iVar2, aVar3, aVar4, y15, iVar, (i13 >> 3) & 112, 1);
                    iVar.O();
                } else {
                    iVar.x(-800136029);
                    iVar.O();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(v9.c cVar, s<v9.b> sVar, s0<Boolean> s0Var, io.l<? super Integer, v> lVar, int i10, s0<Integer> s0Var2) {
            super(1);
            this.f57173w = cVar;
            this.f57174x = sVar;
            this.f57175y = s0Var;
            this.f57176z = lVar;
            this.A = i10;
            this.B = s0Var2;
        }

        public final void a(y yVar) {
            jo.p.h(yVar, "$this$LazyVerticalGrid");
            a aVar = a.f57177w;
            v9.a aVar2 = v9.a.f56973a;
            y.c(yVar, null, aVar, null, aVar2.a(), 5, null);
            List<v9.f> a10 = this.f57173w.a();
            b bVar = b.f57178w;
            C0924c c0924c = new C0924c(this.f57173w);
            s<v9.b> sVar = this.f57174x;
            s0<Boolean> s0Var = this.f57175y;
            io.l<Integer, v> lVar = this.f57176z;
            int i10 = this.A;
            s0<Integer> s0Var2 = this.B;
            yVar.a(a10.size(), bVar != null ? new k(bVar, a10) : null, new l(c0924c, a10), new m(a10), s0.c.c(1229287273, true, new C0925n(a10, sVar, s0Var, lVar, i10, s0Var2)));
            y.c(yVar, null, j.f57190w, null, aVar2.b(), 5, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(y yVar) {
            a(yVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements p<l0.i, Integer, v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f57200w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ v9.c f57201x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<Integer, v> f57202y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f57203z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(x0.f fVar, v9.c cVar, io.l<? super Integer, v> lVar, io.a<v> aVar, int i10, int i11) {
            super(2);
            this.f57200w = fVar;
            this.f57201x = cVar;
            this.f57202y = lVar;
            this.f57203z = aVar;
            this.A = i10;
            this.B = i11;
        }

        public final void a(l0.i iVar, int i10) {
            n.a(this.f57200w, this.f57201x, this.f57202y, this.f57203z, iVar, this.A | 1, this.B);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(x0.f fVar, v9.c cVar, io.l<? super Integer, v> lVar, io.a<v> aVar, l0.i iVar, int i10, int i11) {
        x0.f fVar2;
        int i12;
        List<f> list;
        s sVar;
        char c10;
        int i13;
        x0.f fVar3;
        int i14;
        ao.d dVar;
        l0.i iVar2;
        v9.b iVar3;
        jo.p.h(cVar, "bindModel");
        jo.p.h(lVar, "onClickItem");
        jo.p.h(aVar, "onClickClose");
        l0.i h10 = iVar.h(1389048608);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            fVar2 = fVar;
        } else if ((i10 & 14) == 0) {
            Object obj = fVar;
            i12 = (h10.P(obj) ? 4 : 2) | i10;
            fVar2 = obj;
        } else {
            fVar2 = fVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= h10.P(cVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= h10.P(lVar) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= h10.P(aVar) ? 2048 : 1024;
        }
        int i16 = i12;
        if ((i16 & 5851) == 1170 && h10.j()) {
            h10.I();
            iVar2 = h10;
        } else {
            f.a aVar2 = i15 != 0 ? x0.f.f59359u : fVar2;
            e0 a10 = f0.a(0, 0, h10, 0, 3);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            h10.x(-492369756);
            Object y10 = h10.y();
            i.a aVar3 = l0.i.f39065a;
            x0.f fVar4 = aVar2;
            if (y10 == aVar3.a()) {
                y10 = z1.e(0, null, 2, null);
                h10.q(y10);
            }
            h10.O();
            s0 s0Var = (s0) y10;
            h10.x(-492369756);
            Object y11 = h10.y();
            if (y11 == aVar3.a()) {
                y11 = z1.e(Boolean.FALSE, null, 2, null);
                h10.q(y11);
            }
            h10.O();
            s0 s0Var2 = (s0) y11;
            h10.x(-492369756);
            Object y12 = h10.y();
            if (y12 == aVar3.a()) {
                List<f> a11 = cVar.a();
                ArrayList arrayList = new ArrayList(t.u(a11, 10));
                for (f fVar5 : a11) {
                    if (fVar5.g()) {
                        iVar3 = new l(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
                    } else {
                        iVar3 = new i(null, null, null, null, null, null, null, null, 255, null);
                    }
                    arrayList.add(iVar3);
                }
                y12 = u1.o(arrayList);
                h10.q(y12);
            }
            h10.O();
            s sVar2 = (s) y12;
            List<f> a12 = cVar.a();
            Object[] objArr = {dVar2, s0Var, a10, cVar, s0Var2};
            h10.x(-568225417);
            boolean z10 = false;
            for (int i17 = 0; i17 < 5; i17++) {
                z10 |= h10.P(objArr[i17]);
            }
            Object y13 = h10.y();
            if (z10 || y13 == l0.i.f39065a.a()) {
                list = a12;
                sVar = sVar2;
                c10 = 3;
                i13 = 0;
                fVar3 = fVar4;
                i14 = i16;
                dVar = null;
                a aVar4 = new a(dVar2, s0Var, a10, cVar, s0Var2, null);
                h10.q(aVar4);
                y13 = aVar4;
            } else {
                fVar3 = fVar4;
                list = a12;
                sVar = sVar2;
                i13 = 0;
                i14 = i16;
                dVar = null;
                c10 = 3;
            }
            h10.O();
            l0.c0.c(list, (p) y13, h10, 72);
            List<f> a13 = cVar.a();
            h10.x(511388516);
            s sVar3 = sVar;
            boolean P = h10.P(s0Var) | h10.P(sVar3);
            Object y14 = h10.y();
            if (P || y14 == l0.i.f39065a.a()) {
                y14 = new b(s0Var, sVar3, dVar);
                h10.q(y14);
            }
            h10.O();
            l0.c0.c(a13, (p) y14, h10, 72);
            x0.f l10 = d1.l(fVar3, 0.0f, 1, dVar);
            n1 b10 = v1.b(n1.f60856a, h10, 8);
            u1.a aVar5 = y.u1.f60981a;
            x0.f b11 = s1.b(l10, q1.c(b10, y.u1.o(aVar5.e(), aVar5.j())));
            a.C0986a c0986a = x0.a.f59327a;
            a.b g10 = c0986a.g();
            h10.x(-483455358);
            y.f fVar6 = y.f.f60773a;
            q1.c0 a14 = y.p.a(fVar6.g(), g10, h10, 48);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a15 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, v> a16 = w.a(b11);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a15);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a17 = h2.a(h10);
            h2.b(a17, a14, c0787a.d());
            h2.b(a17, dVar3, c0787a.b());
            h2.b(a17, qVar, c0787a.c());
            h2.b(a17, g2Var, c0787a.f());
            h10.c();
            a16.s0(l0.n1.a(l0.n1.b(h10)), h10, Integer.valueOf(i13));
            h10.x(2058660585);
            h10.x(-1163856341);
            x0.f k10 = r0.k(y.q.c(y.r.f60913a, d1.n(x0.f.f59359u, 0.0f, 1, null), 1.0f, false, 2, null), m2.g.l(16), 0.0f, 2, null);
            b.a aVar6 = new b.a(m2.g.l(64), null);
            boolean d10 = d(s0Var2);
            float f10 = 8;
            f.d o10 = fVar6.o(m2.g.l(f10), c0986a.g());
            Object[] objArr2 = new Object[5];
            objArr2[i13] = cVar;
            objArr2[1] = sVar3;
            objArr2[2] = s0Var2;
            objArr2[c10] = lVar;
            objArr2[4] = s0Var;
            h10.x(-568225417);
            for (int i18 = i13; i18 < 5; i18++) {
                i13 |= h10.P(objArr2[i18]) ? 1 : 0;
            }
            Object y15 = h10.y();
            if (i13 != 0 || y15 == l0.i.f39065a.a()) {
                c cVar2 = new c(cVar, sVar3, s0Var2, lVar, i14, s0Var);
                h10.q(cVar2);
                y15 = cVar2;
            }
            h10.O();
            a0.g.a(aVar6, k10, a10, null, false, null, o10, null, d10, (io.l) y15, h10, 1572864, 184);
            if (d(s0Var2)) {
                f.a aVar7 = x0.f.f59359u;
                g1.a(d1.o(aVar7, m2.g.l(f10)), h10, 6);
                iVar2 = h10;
                fVar2 = fVar3;
                k9.c.a(aVar, d1.v(aVar7, m2.g.l(180), m2.g.l(40)), new k9.a(o9.b.f44283a.a().v(), 0L, 0L, 0L, 0L, 0L, 62, null), 0.0f, false, null, null, v9.a.f56973a.c(), iVar2, 12582960 | ((i14 >> 9) & 14) | (k9.a.C << 6), 120);
                g1.a(d1.o(aVar7, m2.g.l(54)), iVar2, 6);
            } else {
                iVar2 = h10;
                fVar2 = fVar3;
            }
            iVar2.O();
            iVar2.O();
            iVar2.s();
            iVar2.O();
            iVar2.O();
        }
        l1 l11 = iVar2.l();
        if (l11 == null) {
            return;
        }
        l11.a(new d(fVar2, cVar, lVar, aVar, i10, i11));
    }

    public static final int b(s0<Integer> s0Var) {
        return s0Var.getValue().intValue();
    }

    public static final void c(s0<Integer> s0Var, int i10) {
        s0Var.setValue(Integer.valueOf(i10));
    }

    public static final boolean d(s0<Boolean> s0Var) {
        return s0Var.getValue().booleanValue();
    }

    public static final void e(s0<Boolean> s0Var, boolean z10) {
        s0Var.setValue(Boolean.valueOf(z10));
    }
}
