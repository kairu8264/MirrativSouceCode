package n1;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.g2;
import uo.q0;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final m f41480a = new m(xn.s.k());

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f41481w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p f41482x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, io.p pVar) {
            super(1);
            this.f41481w = obj;
            this.f41482x = pVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("pointerInput");
            c1Var.a().b("key1", this.f41481w);
            c1Var.a().b("block", this.f41482x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f41483w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Object f41484x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.p f41485y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, Object obj2, io.p pVar) {
            super(1);
            this.f41483w = obj;
            this.f41484x = obj2;
            this.f41485y = pVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("pointerInput");
            c1Var.a().b("key1", this.f41483w);
            c1Var.a().b("key2", this.f41484x);
            c1Var.a().b("block", this.f41485y);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object[] f41486w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p f41487x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object[] objArr, io.p pVar) {
            super(1);
            this.f41486w = objArr;
            this.f41487x = pVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("pointerInput");
            c1Var.a().b("keys", this.f41486w);
            c1Var.a().b("block", this.f41487x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f41488w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<e0, ao.d<? super wn.v>, Object> f41489x;

        @co.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2$2$1", f = "SuspendingPointerInputFilter.kt", l = {243}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f41490w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f41491x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ n0 f41492y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.p<e0, ao.d<? super wn.v>, Object> f41493z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(n0 n0Var, io.p<? super e0, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f41492y = n0Var;
                this.f41493z = pVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                a aVar = new a(this.f41492y, this.f41493z, dVar);
                aVar.f41491x = obj;
                return aVar;
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f41490w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f41492y.m1((q0) this.f41491x);
                    io.p<e0, ao.d<? super wn.v>, Object> pVar = this.f41493z;
                    n0 n0Var = this.f41492y;
                    this.f41490w = 1;
                    if (pVar.invoke(n0Var, this) == c10) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, io.p<? super e0, ? super ao.d<? super wn.v>, ? extends Object> pVar) {
            super(3);
            this.f41488w = obj;
            this.f41489x = pVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-906157935);
            m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
            g2 g2Var = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
            iVar.x(1157296644);
            boolean P = iVar.P(dVar);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new n0(g2Var, dVar);
                iVar.q(y10);
            }
            iVar.O();
            n0 n0Var = (n0) y10;
            l0.c0.d(n0Var, this.f41488w, new a(n0Var, this.f41489x, null), iVar, 64);
            iVar.O();
            return n0Var;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f41494w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Object f41495x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.p<e0, ao.d<? super wn.v>, Object> f41496y;

        @co.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4$2$1", f = "SuspendingPointerInputFilter.kt", l = {291}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f41497w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f41498x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ n0 f41499y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.p<e0, ao.d<? super wn.v>, Object> f41500z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(n0 n0Var, io.p<? super e0, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f41499y = n0Var;
                this.f41500z = pVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                a aVar = new a(this.f41499y, this.f41500z, dVar);
                aVar.f41498x = obj;
                return aVar;
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f41497w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f41499y.m1((q0) this.f41498x);
                    io.p<e0, ao.d<? super wn.v>, Object> pVar = this.f41500z;
                    n0 n0Var = this.f41499y;
                    this.f41497w = 1;
                    if (pVar.invoke(n0Var, this) == c10) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Object obj, Object obj2, io.p<? super e0, ? super ao.d<? super wn.v>, ? extends Object> pVar) {
            super(3);
            this.f41494w = obj;
            this.f41495x = obj2;
            this.f41496y = pVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(1175567217);
            m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
            g2 g2Var = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
            iVar.x(1157296644);
            boolean P = iVar.P(dVar);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new n0(g2Var, dVar);
                iVar.q(y10);
            }
            iVar.O();
            n0 n0Var = (n0) y10;
            l0.c0.e(n0Var, this.f41494w, this.f41495x, new a(n0Var, this.f41496y, null), iVar, 576);
            iVar.O();
            return n0Var;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object[] f41501w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<e0, ao.d<? super wn.v>, Object> f41502x;

        @co.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6$2$1", f = "SuspendingPointerInputFilter.kt", l = {336}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f41503w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f41504x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ n0 f41505y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.p<e0, ao.d<? super wn.v>, Object> f41506z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(n0 n0Var, io.p<? super e0, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f41505y = n0Var;
                this.f41506z = pVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                a aVar = new a(this.f41505y, this.f41506z, dVar);
                aVar.f41504x = obj;
                return aVar;
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f41503w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f41505y.m1((q0) this.f41504x);
                    io.p<e0, ao.d<? super wn.v>, Object> pVar = this.f41506z;
                    n0 n0Var = this.f41505y;
                    this.f41503w = 1;
                    if (pVar.invoke(n0Var, this) == c10) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Object[] objArr, io.p<? super e0, ? super ao.d<? super wn.v>, ? extends Object> pVar) {
            super(3);
            this.f41501w = objArr;
            this.f41502x = pVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(664422852);
            m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
            g2 g2Var = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
            iVar.x(1157296644);
            boolean P = iVar.P(dVar);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new n0(g2Var, dVar);
                iVar.q(y10);
            }
            iVar.O();
            Object[] objArr = this.f41501w;
            io.p<e0, ao.d<? super wn.v>, Object> pVar = this.f41502x;
            n0 n0Var = (n0) y10;
            jo.h0 h0Var = new jo.h0(2);
            h0Var.a(n0Var);
            h0Var.b(objArr);
            l0.c0.f(h0Var.d(new Object[h0Var.c()]), new a(n0Var, pVar, null), iVar, 8);
            iVar.O();
            return n0Var;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final x0.f b(x0.f fVar, Object obj, io.p<? super e0, ? super ao.d<? super wn.v>, ? extends Object> pVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(pVar, "block");
        return x0.e.c(fVar, a1.c() ? new a(obj, pVar) : a1.a(), new d(obj, pVar));
    }

    public static final x0.f c(x0.f fVar, Object obj, Object obj2, io.p<? super e0, ? super ao.d<? super wn.v>, ? extends Object> pVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(pVar, "block");
        return x0.e.c(fVar, a1.c() ? new b(obj, obj2, pVar) : a1.a(), new e(obj, obj2, pVar));
    }

    public static final x0.f d(x0.f fVar, Object[] objArr, io.p<? super e0, ? super ao.d<? super wn.v>, ? extends Object> pVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(objArr, "keys");
        jo.p.h(pVar, "block");
        return x0.e.c(fVar, a1.c() ? new c(objArr, pVar) : a1.a(), new f(objArr, pVar));
    }
}
