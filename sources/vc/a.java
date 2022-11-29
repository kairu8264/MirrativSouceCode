package vc;

import io.l;
import io.p;
import jo.q;
import l0.c2;
import l0.i;
import l0.u1;
import m2.u;
import uo.q0;
import wn.m;
import wn.v;
import z.c0;
import z.g0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: vc.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0927a extends q implements l<Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0927a f57269w = new C0927a();

        public C0927a() {
            super(1);
        }

        public final void a(int i10) {
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.SnapHelpedLazyColumnKt$SnapHelpedLazyColumn$2$1", f = "SnapHelpedLazyColumn.kt", l = {72}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57270w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c2<Integer> f57271x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c2<l<Integer, v>> f57272y;

        /* renamed from: vc.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0928a extends q implements io.a<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c2<Integer> f57273w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0928a(c2<Integer> c2Var) {
                super(0);
                this.f57273w = c2Var;
            }

            @Override // io.a
            /* renamed from: a */
            public final Integer invoke() {
                return this.f57273w.getValue();
            }
        }

        /* renamed from: vc.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0929b implements xo.d<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c2<l<Integer, v>> f57274w;

            /* JADX WARN: Multi-variable type inference failed */
            public C0929b(c2<? extends l<? super Integer, v>> c2Var) {
                this.f57274w = c2Var;
            }

            public final Object a(int i10, ao.d<? super v> dVar) {
                a.b(this.f57274w).invoke(co.b.d(i10));
                return v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Integer num, ao.d dVar) {
                return a(num.intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(c2<Integer> c2Var, c2<? extends l<? super Integer, v>> c2Var2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f57271x = c2Var;
            this.f57272y = c2Var2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f57271x, this.f57272y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57270w;
            if (i10 == 0) {
                m.b(obj);
                xo.c m10 = u1.m(new C0928a(this.f57271x));
                C0929b c0929b = new C0929b(this.f57272y);
                this.f57270w = 1;
                if (m10.a(c0929b, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements l<c0, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l<c0, v> f57275w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(l<? super c0, v> lVar) {
            super(1);
            this.f57275w = lVar;
        }

        public final void a(c0 c0Var) {
            jo.p.h(c0Var, "$this$LazyColumn");
            this.f57275w.invoke(c0Var);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c0 c0Var) {
            a(c0Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements p<i, Integer, v> {
        public final /* synthetic */ l<c0, v> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f57276w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f57277x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f57278y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ l<Integer, v> f57279z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(int i10, x0.f fVar, int i11, l<? super Integer, v> lVar, l<? super c0, v> lVar2, int i12, int i13) {
            super(2);
            this.f57276w = i10;
            this.f57277x = fVar;
            this.f57278y = i11;
            this.f57279z = lVar;
            this.A = lVar2;
            this.B = i12;
            this.C = i13;
        }

        public final void a(i iVar, int i10) {
            a.a(this.f57276w, this.f57277x, this.f57278y, this.f57279z, this.A, iVar, this.B | 1, this.C);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements m1.a {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q0 f57280w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g0 f57281x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c2<Integer> f57282y;

        @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.SnapHelpedLazyColumnKt$SnapHelpedLazyColumn$connection$1$1$onPostFling$2", f = "SnapHelpedLazyColumn.kt", l = {63}, m = "invokeSuspend")
        /* renamed from: vc.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0930a extends co.l implements p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57283w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ g0 f57284x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ c2<Integer> f57285y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0930a(g0 g0Var, c2<Integer> c2Var, ao.d<? super C0930a> dVar) {
                super(2, dVar);
                this.f57284x = g0Var;
                this.f57285y = c2Var;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new C0930a(this.f57284x, this.f57285y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((C0930a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57283w;
                if (i10 == 0) {
                    m.b(obj);
                    g0 g0Var = this.f57284x;
                    int intValue = this.f57285y.getValue().intValue();
                    this.f57283w = 1;
                    if (g0.h(g0Var, intValue, 0, this, 2, null) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                return v.f59242a;
            }
        }

        public e(q0 q0Var, g0 g0Var, c2<Integer> c2Var) {
            this.f57280w = q0Var;
            this.f57281x = g0Var;
            this.f57282y = c2Var;
        }

        @Override // m1.a
        public Object b(long j10, long j11, ao.d<? super u> dVar) {
            uo.l.d(this.f57280w, null, null, new C0930a(this.f57281x, this.f57282y, null), 3, null);
            return u.b(u.f40549b.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0 f57286w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f57287x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(g0 g0Var, int i10) {
            super(0);
            this.f57286w = g0Var;
            this.f57287x = i10;
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            int m10;
            if (this.f57286w.n() <= this.f57287x / 2) {
                m10 = this.f57286w.m();
            } else {
                m10 = this.f57286w.m() + 1;
            }
            return Integer.valueOf(m10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(int r19, x0.f r20, int r21, io.l<? super java.lang.Integer, wn.v> r22, io.l<? super z.c0, wn.v> r23, l0.i r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.a.a(int, x0.f, int, io.l, io.l, l0.i, int, int):void");
    }

    public static final l<Integer, v> b(c2<? extends l<? super Integer, v>> c2Var) {
        return (l) c2Var.getValue();
    }
}
