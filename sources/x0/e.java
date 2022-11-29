package x0;

import a1.u;
import a1.w;
import a1.x;
import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import io.l;
import io.q;
import jo.j0;
import jo.m;
import jo.p;
import l0.c0;
import wn.v;
import x0.f;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final q<a1.d, l0.i, Integer, f> f59352a = a.f59354w;

    /* renamed from: b */
    public static final q<u, l0.i, Integer, f> f59353b = b.f59356w;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements q<a1.d, l0.i, Integer, a1.f> {

        /* renamed from: w */
        public static final a f59354w = new a();

        /* renamed from: x0.e$a$a */
        /* loaded from: classes.dex */
        public static final class C0988a extends jo.q implements io.a<v> {

            /* renamed from: w */
            public final /* synthetic */ a1.f f59355w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0988a(a1.f fVar) {
                super(0);
                this.f59355w = fVar;
            }

            public final void a() {
                this.f59355w.f();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class b extends m implements l<x, v> {
            public b(Object obj) {
                super(1, obj, a1.d.class, "onFocusEvent", "onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V", 0);
            }

            public final void i(x xVar) {
                p.h(xVar, "p0");
                ((a1.d) this.f38131x).Z0(xVar);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(x xVar) {
                i(xVar);
                return v.f59242a;
            }
        }

        public a() {
            super(3);
        }

        public final a1.f a(a1.d dVar, l0.i iVar, int i10) {
            p.h(dVar, "mod");
            iVar.x(-1790596922);
            iVar.x(1157296644);
            boolean P = iVar.P(dVar);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new a1.f(new b(dVar));
                iVar.q(y10);
            }
            iVar.O();
            a1.f fVar = (a1.f) y10;
            c0.g(new C0988a(fVar), iVar, 0);
            iVar.O();
            return fVar;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ a1.f s0(a1.d dVar, l0.i iVar, Integer num) {
            return a(dVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements q<u, l0.i, Integer, w> {

        /* renamed from: w */
        public static final b f59356w = new b();

        public b() {
            super(3);
        }

        public final w a(u uVar, l0.i iVar, int i10) {
            p.h(uVar, "mod");
            iVar.x(945678692);
            iVar.x(1157296644);
            boolean P = iVar.P(uVar);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new w(uVar.G());
                iVar.q(y10);
            }
            iVar.O();
            w wVar = (w) y10;
            iVar.O();
            return wVar;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ w s0(u uVar, l0.i iVar, Integer num) {
            return a(uVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements l<f.b, Boolean> {

        /* renamed from: w */
        public static final c f59357w = new c();

        public c() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(f.b bVar) {
            p.h(bVar, "it");
            return Boolean.valueOf(((bVar instanceof x0.d) || (bVar instanceof a1.d) || (bVar instanceof u)) ? false : true);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.p<f, f.b, f> {

        /* renamed from: w */
        public final /* synthetic */ l0.i f59358w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l0.i iVar) {
            super(2);
            this.f59358w = iVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final f invoke(f fVar, f.b bVar) {
            f L;
            p.h(fVar, "acc");
            p.h(bVar, "element");
            if (bVar instanceof x0.d) {
                L = e.e(this.f59358w, (f) ((q) j0.e(((x0.d) bVar).b(), 3)).s0(f.f59359u, this.f59358w, 0));
            } else {
                f L2 = bVar instanceof a1.d ? bVar.L((f) ((q) j0.e(e.f59352a, 3)).s0(bVar, this.f59358w, 0)) : bVar;
                L = bVar instanceof u ? L2.L((f) ((q) j0.e(e.f59353b, 3)).s0(bVar, this.f59358w, 0)) : L2;
            }
            return fVar.L(L);
        }
    }

    public static final f c(f fVar, l<? super c1, v> lVar, q<? super f, ? super l0.i, ? super Integer, ? extends f> qVar) {
        p.h(fVar, "<this>");
        p.h(lVar, "inspectorInfo");
        p.h(qVar, "factory");
        return fVar.L(new x0.d(lVar, qVar));
    }

    public static /* synthetic */ f d(f fVar, l lVar, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = a1.a();
        }
        return c(fVar, lVar, qVar);
    }

    public static final f e(l0.i iVar, f fVar) {
        p.h(iVar, "<this>");
        p.h(fVar, "modifier");
        if (fVar.e(c.f59357w)) {
            return fVar;
        }
        iVar.x(1219399079);
        f fVar2 = (f) fVar.k(f.f59359u, new d(iVar));
        iVar.O();
        return fVar2;
    }
}
