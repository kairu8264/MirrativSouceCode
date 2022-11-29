package v;

import l0.c2;

/* loaded from: classes.dex */
public final class o implements x {

    /* renamed from: a  reason: collision with root package name */
    public static final o f56299a = new o();

    /* loaded from: classes.dex */
    public static final class a implements y {

        /* renamed from: w  reason: collision with root package name */
        public final c2<Boolean> f56300w;

        /* renamed from: x  reason: collision with root package name */
        public final c2<Boolean> f56301x;

        /* renamed from: y  reason: collision with root package name */
        public final c2<Boolean> f56302y;

        public a(c2<Boolean> c2Var, c2<Boolean> c2Var2, c2<Boolean> c2Var3) {
            jo.p.h(c2Var, "isPressed");
            jo.p.h(c2Var2, "isHovered");
            jo.p.h(c2Var3, "isFocused");
            this.f56300w = c2Var;
            this.f56301x = c2Var2;
            this.f56302y = c2Var3;
        }

        @Override // v.y
        public void d(e1.c cVar) {
            jo.p.h(cVar, "<this>");
            cVar.c1();
            if (this.f56300w.getValue().booleanValue()) {
                e1.e.L0(cVar, c1.c0.k(c1.c0.f18634b.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.c(), 0.0f, null, null, 0, 122, null);
            } else if (this.f56301x.getValue().booleanValue() || this.f56302y.getValue().booleanValue()) {
                e1.e.L0(cVar, c1.c0.k(c1.c0.f18634b.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.c(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    @Override // v.x
    public y a(x.k kVar, l0.i iVar, int i10) {
        jo.p.h(kVar, "interactionSource");
        iVar.x(1683566979);
        int i11 = i10 & 14;
        c2<Boolean> a10 = x.r.a(kVar, iVar, i11);
        c2<Boolean> a11 = x.i.a(kVar, iVar, i11);
        c2<Boolean> a12 = x.f.a(kVar, iVar, i11);
        iVar.x(1157296644);
        boolean P = iVar.P(kVar);
        Object y10 = iVar.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = new a(a10, a11, a12);
            iVar.q(y10);
        }
        iVar.O();
        a aVar = (a) y10;
        iVar.O();
        return aVar;
    }
}
