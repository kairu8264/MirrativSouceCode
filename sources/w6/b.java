package w6;

import wn.v;

/* loaded from: classes.dex */
public interface b extends f {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ Object a(b bVar, s6.d dVar, int i10, int i11, float f10, h hVar, float f11, boolean z10, g gVar, ao.d dVar2, int i12, Object obj) {
            if (obj == null) {
                int h10 = (i12 & 2) != 0 ? bVar.h() : i10;
                int e10 = (i12 & 4) != 0 ? bVar.e() : i11;
                float f12 = (i12 & 8) != 0 ? bVar.f() : f10;
                h n10 = (i12 & 16) != 0 ? bVar.n() : hVar;
                return bVar.a(dVar, h10, e10, f12, n10, (i12 & 32) != 0 ? d.b(dVar, n10, f12) : f11, (i12 & 64) != 0 ? false : z10, (i12 & 128) != 0 ? g.Immediately : gVar, dVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
        }

        public static /* synthetic */ Object b(b bVar, s6.d dVar, float f10, int i10, boolean z10, ao.d dVar2, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    dVar = bVar.l();
                }
                s6.d dVar3 = dVar;
                if ((i11 & 2) != 0) {
                    f10 = bVar.g();
                }
                float f11 = f10;
                if ((i11 & 4) != 0) {
                    i10 = bVar.h();
                }
                int i12 = i10;
                if ((i11 & 8) != 0) {
                    z10 = !(f11 == bVar.g());
                }
                return bVar.o(dVar3, f11, i12, z10, dVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
        }
    }

    Object a(s6.d dVar, int i10, int i11, float f10, h hVar, float f11, boolean z10, g gVar, ao.d<? super v> dVar2);

    Object o(s6.d dVar, float f10, int i10, boolean z10, ao.d<? super v> dVar2);
}
