package sp;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.ArrayList;
import jo.p;
import rp.f;
import rp.y;
import xn.a0;
import xn.x;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a */
    public static final rp.f f52828a;

    /* renamed from: b */
    public static final rp.f f52829b;

    /* renamed from: c */
    public static final rp.f f52830c;

    /* renamed from: d */
    public static final rp.f f52831d;

    /* renamed from: e */
    public static final rp.f f52832e;

    static {
        f.a aVar = rp.f.f51677z;
        f52828a = aVar.d("/");
        f52829b = aVar.d("\\");
        f52830c = aVar.d("/\\");
        f52831d = aVar.d(TopicConstant.SEPARATOR);
        f52832e = aVar.d("..");
    }

    public static final y j(y yVar, y yVar2, boolean z10) {
        p.h(yVar, "<this>");
        p.h(yVar2, "child");
        if (yVar2.i() || yVar2.t() != null) {
            return yVar2;
        }
        rp.f m10 = m(yVar);
        if (m10 == null && (m10 = m(yVar2)) == null) {
            m10 = s(y.f51737y);
        }
        rp.c cVar = new rp.c();
        cVar.o0(yVar.c());
        if (cVar.X() > 0) {
            cVar.o0(m10);
        }
        cVar.o0(yVar2.c());
        return q(cVar, z10);
    }

    public static final y k(String str, boolean z10) {
        p.h(str, "<this>");
        return q(new rp.c().a0(str), z10);
    }

    public static final int l(y yVar) {
        int y10 = rp.f.y(yVar.c(), f52828a, 0, 2, null);
        return y10 != -1 ? y10 : rp.f.y(yVar.c(), f52829b, 0, 2, null);
    }

    public static final rp.f m(y yVar) {
        rp.f c10 = yVar.c();
        rp.f fVar = f52828a;
        if (rp.f.t(c10, fVar, 0, 2, null) != -1) {
            return fVar;
        }
        rp.f c11 = yVar.c();
        rp.f fVar2 = f52829b;
        if (rp.f.t(c11, fVar2, 0, 2, null) != -1) {
            return fVar2;
        }
        return null;
    }

    public static final boolean n(y yVar) {
        return yVar.c().i(f52832e) && (yVar.c().G() == 2 || yVar.c().A(yVar.c().G() + (-3), f52828a, 0, 1) || yVar.c().A(yVar.c().G() + (-3), f52829b, 0, 1));
    }

    public static final int o(y yVar) {
        if (yVar.c().G() == 0) {
            return -1;
        }
        boolean z10 = false;
        if (yVar.c().l(0) == ((byte) 47)) {
            return 1;
        }
        byte b10 = (byte) 92;
        if (yVar.c().l(0) == b10) {
            if (yVar.c().G() <= 2 || yVar.c().l(1) != b10) {
                return 1;
            }
            int r10 = yVar.c().r(f52829b, 2);
            return r10 == -1 ? yVar.c().G() : r10;
        } else if (yVar.c().G() > 2 && yVar.c().l(1) == ((byte) 58) && yVar.c().l(2) == b10) {
            char l10 = (char) yVar.c().l(0);
            if ('a' <= l10 && l10 <= 'z') {
                return 3;
            }
            if ('A' <= l10 && l10 <= 'Z') {
                z10 = true;
            }
            return !z10 ? -1 : 3;
        } else {
            return -1;
        }
    }

    public static final boolean p(rp.c cVar, rp.f fVar) {
        if (p.c(fVar, f52829b) && cVar.X() >= 2 && cVar.n(1L) == ((byte) 58)) {
            char n10 = (char) cVar.n(0L);
            if (!('a' <= n10 && n10 <= 'z')) {
                if (!('A' <= n10 && n10 <= 'Z')) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final y q(rp.c cVar, boolean z10) {
        rp.f fVar;
        rp.f R0;
        p.h(cVar, "<this>");
        rp.c cVar2 = new rp.c();
        int i10 = 0;
        rp.f fVar2 = null;
        int i11 = 0;
        while (true) {
            if (!cVar.c1(0L, f52828a)) {
                fVar = f52829b;
                if (!cVar.c1(0L, fVar)) {
                    break;
                }
            }
            byte readByte = cVar.readByte();
            if (fVar2 == null) {
                fVar2 = r(readByte);
            }
            i11++;
        }
        boolean z11 = i11 >= 2 && p.c(fVar2, fVar);
        if (z11) {
            p.e(fVar2);
            cVar2.o0(fVar2);
            cVar2.o0(fVar2);
        } else if (i11 > 0) {
            p.e(fVar2);
            cVar2.o0(fVar2);
        } else {
            long w12 = cVar.w1(f52830c);
            if (fVar2 == null) {
                if (w12 == -1) {
                    fVar2 = s(y.f51737y);
                } else {
                    fVar2 = r(cVar.n(w12));
                }
            }
            if (p(cVar, fVar2)) {
                if (w12 == 2) {
                    cVar2.O0(cVar, 3L);
                } else {
                    cVar2.O0(cVar, 2L);
                }
            }
        }
        boolean z12 = cVar2.X() > 0;
        ArrayList arrayList = new ArrayList();
        while (!cVar.a1()) {
            long w13 = cVar.w1(f52830c);
            if (w13 == -1) {
                R0 = cVar.G();
            } else {
                R0 = cVar.R0(w13);
                cVar.readByte();
            }
            rp.f fVar3 = f52832e;
            if (p.c(R0, fVar3)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (z10 && (z12 || (!arrayList.isEmpty() && !p.c(a0.i0(arrayList), fVar3)))) {
                        if (!z11 || arrayList.size() != 1) {
                            x.G(arrayList);
                        }
                    } else {
                        arrayList.add(R0);
                    }
                }
            } else if (!p.c(R0, f52831d) && !p.c(R0, rp.f.A)) {
                arrayList.add(R0);
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            while (true) {
                int i12 = i10 + 1;
                if (i10 > 0) {
                    cVar2.o0(fVar2);
                }
                cVar2.o0((rp.f) arrayList.get(i10));
                if (i12 >= size) {
                    break;
                }
                i10 = i12;
            }
        }
        if (cVar2.X() == 0) {
            cVar2.o0(f52831d);
        }
        return new y(cVar2.G());
    }

    public static final rp.f r(byte b10) {
        if (b10 == 47) {
            return f52828a;
        }
        if (b10 == 92) {
            return f52829b;
        }
        throw new IllegalArgumentException(p.o("not a directory separator: ", Byte.valueOf(b10)));
    }

    public static final rp.f s(String str) {
        if (p.c(str, "/")) {
            return f52828a;
        }
        if (p.c(str, "\\")) {
            return f52829b;
        }
        throw new IllegalArgumentException(p.o("not a directory separator: ", str));
    }
}
