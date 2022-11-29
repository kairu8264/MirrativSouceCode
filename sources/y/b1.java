package y;

import y.c;

/* loaded from: classes.dex */
public abstract class b1 extends androidx.compose.ui.platform.d1 implements q1.p0 {

    /* loaded from: classes.dex */
    public static final class a extends b1 {

        /* renamed from: x  reason: collision with root package name */
        public final q1.a f60684x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1.a aVar, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
            super(lVar, null);
            jo.p.h(aVar, "alignmentLine");
            jo.p.h(lVar, "inspectorInfo");
            this.f60684x = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            a aVar = obj instanceof a ? (a) obj : null;
            if (aVar == null) {
                return false;
            }
            return jo.p.c(this.f60684x, aVar.f60684x);
        }

        @Override // q1.p0
        public Object g0(m2.d dVar, Object obj) {
            jo.p.h(dVar, "<this>");
            x0 x0Var = obj instanceof x0 ? (x0) obj : null;
            if (x0Var == null) {
                x0Var = new x0(0.0f, false, null, 7, null);
            }
            x0Var.d(s.f60957a.a(new c.a(this.f60684x)));
            return x0Var;
        }

        public int hashCode() {
            return this.f60684x.hashCode();
        }

        public String toString() {
            return "WithAlignmentLine(line=" + this.f60684x + ')';
        }
    }

    public b1(io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar) {
        super(lVar);
    }

    public /* synthetic */ b1(io.l lVar, jo.h hVar) {
        this(lVar);
    }
}
