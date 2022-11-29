package m1;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import ao.h;
import io.l;
import jo.p;
import jo.q;
import l0.c0;
import l0.i;
import l0.s;
import uo.q0;
import wn.v;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static final class a extends q implements l<c1, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ m1.a f40487w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ m1.b f40488x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m1.a aVar, m1.b bVar) {
            super(1);
            this.f40487w = aVar;
            this.f40488x = bVar;
        }

        public final void a(c1 c1Var) {
            p.h(c1Var, "$this$null");
            c1Var.b("nestedScroll");
            c1Var.a().b("connection", this.f40487w);
            c1Var.a().b("dispatcher", this.f40488x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c1 c1Var) {
            a(c1Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.q<x0.f, i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ m1.b f40489w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ m1.a f40490x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m1.b bVar, m1.a aVar) {
            super(3);
            this.f40489w = bVar;
            this.f40490x = aVar;
        }

        public final x0.f a(x0.f fVar, i iVar, int i10) {
            p.h(fVar, "$this$composed");
            iVar.x(410346167);
            iVar.x(773894976);
            iVar.x(-492369756);
            Object y10 = iVar.y();
            i.a aVar = i.f39065a;
            if (y10 == aVar.a()) {
                Object sVar = new s(c0.i(h.f16651w, iVar));
                iVar.q(sVar);
                y10 = sVar;
            }
            iVar.O();
            q0 d10 = ((s) y10).d();
            iVar.O();
            m1.b bVar = this.f40489w;
            iVar.x(100475938);
            if (bVar == null) {
                iVar.x(-492369756);
                Object y11 = iVar.y();
                if (y11 == aVar.a()) {
                    y11 = new m1.b();
                    iVar.q(y11);
                }
                iVar.O();
                bVar = (m1.b) y11;
            }
            iVar.O();
            m1.a aVar2 = this.f40490x;
            iVar.x(1618982084);
            boolean P = iVar.P(aVar2) | iVar.P(bVar) | iVar.P(d10);
            Object y12 = iVar.y();
            if (P || y12 == aVar.a()) {
                bVar.h(d10);
                y12 = new d(bVar, aVar2);
                iVar.q(y12);
            }
            iVar.O();
            d dVar = (d) y12;
            iVar.O();
            return dVar;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final x0.f a(x0.f fVar, m1.a aVar, m1.b bVar) {
        p.h(fVar, "<this>");
        p.h(aVar, "connection");
        return x0.e.c(fVar, a1.c() ? new a(aVar, bVar) : a1.a(), new b(bVar, aVar));
    }

    public static /* synthetic */ x0.f b(x0.f fVar, m1.a aVar, m1.b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        return a(fVar, aVar, bVar);
    }
}
