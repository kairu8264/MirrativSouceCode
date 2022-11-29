package p2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import io.l;
import java.util.List;
import java.util.UUID;
import jo.p;
import jo.q;
import l0.a0;
import l0.c1;
import l0.c2;
import l0.h2;
import l0.n1;
import l0.r;
import l0.z;
import m2.m;
import m2.o;
import q1.b0;
import q1.c0;
import q1.d0;
import q1.e0;
import q1.n0;
import q1.q0;
import s1.a;
import uo.q0;
import w1.w;
import w1.y;
import wn.v;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final c1<String> f45688a = r.c(null, C0691a.f45689w, 1, null);

    /* renamed from: p2.a$a */
    /* loaded from: classes.dex */
    public static final class C0691a extends q implements io.a<String> {

        /* renamed from: w */
        public static final C0691a f45689w = new C0691a();

        public C0691a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<a0, z> {
        public final /* synthetic */ m2.q A;

        /* renamed from: w */
        public final /* synthetic */ p2.d f45690w;

        /* renamed from: x */
        public final /* synthetic */ io.a<v> f45691x;

        /* renamed from: y */
        public final /* synthetic */ p2.i f45692y;

        /* renamed from: z */
        public final /* synthetic */ String f45693z;

        /* renamed from: p2.a$b$a */
        /* loaded from: classes.dex */
        public static final class C0692a implements z {

            /* renamed from: a */
            public final /* synthetic */ p2.d f45694a;

            public C0692a(p2.d dVar) {
                this.f45694a = dVar;
            }

            @Override // l0.z
            public void dispose() {
                this.f45694a.e();
                this.f45694a.n();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p2.d dVar, io.a<v> aVar, p2.i iVar, String str, m2.q qVar) {
            super(1);
            this.f45690w = dVar;
            this.f45691x = aVar;
            this.f45692y = iVar;
            this.f45693z = str;
            this.A = qVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final z invoke(a0 a0Var) {
            p.h(a0Var, "$this$DisposableEffect");
            this.f45690w.q();
            this.f45690w.s(this.f45691x, this.f45692y, this.f45693z, this.A);
            return new C0692a(this.f45690w);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<v> {
        public final /* synthetic */ m2.q A;

        /* renamed from: w */
        public final /* synthetic */ p2.d f45695w;

        /* renamed from: x */
        public final /* synthetic */ io.a<v> f45696x;

        /* renamed from: y */
        public final /* synthetic */ p2.i f45697y;

        /* renamed from: z */
        public final /* synthetic */ String f45698z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p2.d dVar, io.a<v> aVar, p2.i iVar, String str, m2.q qVar) {
            super(0);
            this.f45695w = dVar;
            this.f45696x = aVar;
            this.f45697y = iVar;
            this.f45698z = str;
            this.A = qVar;
        }

        public final void a() {
            this.f45695w.s(this.f45696x, this.f45697y, this.f45698z, this.A);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements l<a0, z> {

        /* renamed from: w */
        public final /* synthetic */ p2.d f45699w;

        /* renamed from: x */
        public final /* synthetic */ p2.h f45700x;

        /* renamed from: p2.a$d$a */
        /* loaded from: classes.dex */
        public static final class C0693a implements z {
            @Override // l0.z
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p2.d dVar, p2.h hVar) {
            super(1);
            this.f45699w = dVar;
            this.f45700x = hVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final z invoke(a0 a0Var) {
            p.h(a0Var, "$this$DisposableEffect");
            this.f45699w.setPositionProvider(this.f45700x);
            this.f45699w.v();
            return new C0693a();
        }
    }

    @co.f(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", l = {299}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w */
        public int f45701w;

        /* renamed from: x */
        public /* synthetic */ Object f45702x;

        /* renamed from: y */
        public final /* synthetic */ p2.d f45703y;

        /* renamed from: p2.a$e$a */
        /* loaded from: classes.dex */
        public static final class C0694a extends q implements l<Long, v> {

            /* renamed from: w */
            public static final C0694a f45704w = new C0694a();

            public C0694a() {
                super(1);
            }

            public final void a(long j10) {
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(Long l10) {
                a(l10.longValue());
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p2.d dVar, ao.d<? super e> dVar2) {
            super(2, dVar2);
            this.f45703y = dVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            e eVar = new e(this.f45703y, dVar);
            eVar.f45702x = obj;
            return eVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0035 -> B:31:0x0038). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r4.f45701w
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r4.f45702x
                uo.q0 r1 = (uo.q0) r1
                wn.m.b(r5)
                r5 = r4
                goto L38
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1c:
                wn.m.b(r5)
                java.lang.Object r5 = r4.f45702x
                uo.q0 r5 = (uo.q0) r5
                r1 = r5
                r5 = r4
            L25:
                boolean r3 = uo.r0.g(r1)
                if (r3 == 0) goto L3e
                p2.a$e$a r3 = p2.a.e.C0694a.f45704w
                r5.f45702x = r1
                r5.f45701w = r2
                java.lang.Object r3 = androidx.compose.ui.platform.y0.a(r3, r5)
                if (r3 != r0) goto L38
                return r0
            L38:
                p2.d r3 = r5.f45703y
                r3.o()
                goto L25
            L3e:
                wn.v r5 = wn.v.f59242a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p2.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements l<q1.q, v> {

        /* renamed from: w */
        public final /* synthetic */ p2.d f45705w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(p2.d dVar) {
            super(1);
            this.f45705w = dVar;
        }

        public final void a(q1.q qVar) {
            p.h(qVar, "childCoordinates");
            q1.q P = qVar.P();
            p.e(P);
            this.f45705w.u(P);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(q1.q qVar) {
            a(qVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements c0 {

        /* renamed from: a */
        public final /* synthetic */ p2.d f45706a;

        /* renamed from: b */
        public final /* synthetic */ m2.q f45707b;

        /* renamed from: p2.a$g$a */
        /* loaded from: classes.dex */
        public static final class C0695a extends q implements l<q0.a, v> {

            /* renamed from: w */
            public static final C0695a f45708w = new C0695a();

            public C0695a() {
                super(1);
            }

            public final void a(q0.a aVar) {
                p.h(aVar, "$this$layout");
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(q0.a aVar) {
                a(aVar);
                return v.f59242a;
            }
        }

        public g(p2.d dVar, m2.q qVar) {
            this.f45706a = dVar;
            this.f45707b = qVar;
        }

        @Override // q1.c0
        public final d0 c(e0 e0Var, List<? extends b0> list, long j10) {
            p.h(e0Var, "$this$Layout");
            p.h(list, "<anonymous parameter 0>");
            this.f45706a.setParentLayoutDirection(this.f45707b);
            return e0.O0(e0Var, 0, 0, null, C0695a.f45708w, 4, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends q implements io.p<l0.i, Integer, v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;

        /* renamed from: w */
        public final /* synthetic */ p2.h f45709w;

        /* renamed from: x */
        public final /* synthetic */ io.a<v> f45710x;

        /* renamed from: y */
        public final /* synthetic */ p2.i f45711y;

        /* renamed from: z */
        public final /* synthetic */ io.p<l0.i, Integer, v> f45712z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(p2.h hVar, io.a<v> aVar, p2.i iVar, io.p<? super l0.i, ? super Integer, v> pVar, int i10, int i11) {
            super(2);
            this.f45709w = hVar;
            this.f45710x = aVar;
            this.f45711y = iVar;
            this.f45712z = pVar;
            this.A = i10;
            this.B = i11;
        }

        public final void a(l0.i iVar, int i10) {
            a.a(this.f45709w, this.f45710x, this.f45711y, this.f45712z, iVar, this.A | 1, this.B);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends q implements io.a<UUID> {

        /* renamed from: w */
        public static final i f45713w = new i();

        public i() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends q implements io.p<l0.i, Integer, v> {

        /* renamed from: w */
        public final /* synthetic */ p2.d f45714w;

        /* renamed from: x */
        public final /* synthetic */ c2<io.p<l0.i, Integer, v>> f45715x;

        /* renamed from: p2.a$j$a */
        /* loaded from: classes.dex */
        public static final class C0696a extends q implements l<y, v> {

            /* renamed from: w */
            public static final C0696a f45716w = new C0696a();

            public C0696a() {
                super(1);
            }

            public final void a(y yVar) {
                p.h(yVar, "$this$semantics");
                w.r(yVar);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(y yVar) {
                a(yVar);
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends q implements l<o, v> {

            /* renamed from: w */
            public final /* synthetic */ p2.d f45717w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(p2.d dVar) {
                super(1);
                this.f45717w = dVar;
            }

            public final void a(long j10) {
                this.f45717w.m33setPopupContentSizefhxjrPA(o.b(j10));
                this.f45717w.v();
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(o oVar) {
                a(oVar.j());
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends q implements io.p<l0.i, Integer, v> {

            /* renamed from: w */
            public final /* synthetic */ c2<io.p<l0.i, Integer, v>> f45718w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(c2<? extends io.p<? super l0.i, ? super Integer, v>> c2Var) {
                super(2);
                this.f45718w = c2Var;
            }

            public final void a(l0.i iVar, int i10) {
                if ((i10 & 11) == 2 && iVar.j()) {
                    iVar.I();
                } else {
                    a.b(this.f45718w).invoke(iVar, 0);
                }
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
                a(iVar, num.intValue());
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(p2.d dVar, c2<? extends io.p<? super l0.i, ? super Integer, v>> c2Var) {
            super(2);
            this.f45714w = dVar;
            this.f45715x = c2Var;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            x0.f a10 = z0.a.a(n0.a(w1.p.b(x0.f.f59359u, false, C0696a.f45716w, 1, null), new b(this.f45714w)), this.f45714w.getCanCalculatePosition() ? 1.0f : 0.0f);
            s0.a b10 = s0.c.b(iVar, 606497925, true, new c(this.f45715x));
            iVar.x(1406149896);
            p2.b bVar = p2.b.f45719a;
            iVar.x(-1323940314);
            m2.d dVar = (m2.d) iVar.G(o0.e());
            m2.q qVar = (m2.q) iVar.G(o0.j());
            g2 g2Var = (g2) iVar.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a12 = q1.w.a(a10);
            if (!(iVar.k() instanceof l0.e)) {
                l0.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a11);
            } else {
                iVar.o();
            }
            iVar.E();
            l0.i a13 = h2.a(iVar);
            h2.b(a13, bVar, c0787a.d());
            h2.b(a13, dVar, c0787a.b());
            h2.b(a13, qVar, c0787a.c());
            h2.b(a13, g2Var, c0787a.f());
            iVar.c();
            a12.s0(n1.a(n1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            b10.invoke(iVar, 6);
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(p2.h r27, io.a<wn.v> r28, p2.i r29, io.p<? super l0.i, ? super java.lang.Integer, wn.v> r30, l0.i r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.a.a(p2.h, io.a, p2.i, io.p, l0.i, int, int):void");
    }

    public static final io.p<l0.i, Integer, v> b(c2<? extends io.p<? super l0.i, ? super Integer, v>> c2Var) {
        return (io.p) c2Var.getValue();
    }

    public static final boolean e(View view) {
        p.h(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static final m f(Rect rect) {
        return new m(rect.left, rect.top, rect.right, rect.bottom);
    }
}
