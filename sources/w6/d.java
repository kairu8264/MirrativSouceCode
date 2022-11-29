package w6;

import w6.b;
import wn.v;

/* loaded from: classes.dex */
public final class d {
    public static final b a() {
        return new c();
    }

    public static final float c(s6.d dVar, h hVar, float f10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 >= 0 || dVar != null) {
            if (dVar == null) {
                return 0.0f;
            }
            if (i10 >= 0) {
                if (hVar == null) {
                    return 0.0f;
                }
                return hVar.b(dVar);
            } else if (hVar != null) {
                return hVar.a(dVar);
            }
        }
        return 1.0f;
    }

    public static final b d(l0.i iVar, int i10) {
        iVar.x(-610207972);
        iVar.x(-3687241);
        Object y10 = iVar.y();
        if (y10 == l0.i.f39065a.a()) {
            y10 = a();
            iVar.q(y10);
        }
        iVar.O();
        b bVar = (b) y10;
        iVar.O();
        return bVar;
    }

    public static final Object e(b bVar, ao.d<? super v> dVar) {
        Object b10 = b.a.b(bVar, null, c(bVar.l(), bVar.n(), bVar.f()), 1, false, dVar, 9, null);
        return b10 == bo.c.c() ? b10 : v.f59242a;
    }
}
