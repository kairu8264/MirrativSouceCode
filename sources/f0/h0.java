package f0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.l;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f31484a = so.n.u("H", 10);

    public static final long a(y1.d0 d0Var, m2.d dVar, l.b bVar, String str, int i10) {
        y1.h a10;
        jo.p.h(d0Var, TtmlNode.TAG_STYLE);
        jo.p.h(dVar, "density");
        jo.p.h(bVar, "fontFamilyResolver");
        jo.p.h(str, "text");
        a10 = y1.m.a(str, d0Var, m2.c.b(0, 0, 0, 0, 15, null), dVar, bVar, (r22 & 32) != 0 ? xn.s.k() : xn.s.k(), (r22 & 64) != 0 ? xn.s.k() : null, (r22 & 128) != 0 ? Integer.MAX_VALUE : i10, (r22 & 256) != 0 ? false : false);
        return m2.p.a(d(a10.a()), d(a10.getHeight()));
    }

    public static /* synthetic */ long b(y1.d0 d0Var, m2.d dVar, l.b bVar, String str, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = f31484a;
        }
        if ((i11 & 16) != 0) {
            i10 = 1;
        }
        return a(d0Var, dVar, bVar, str, i10);
    }

    public static final String c() {
        return f31484a;
    }

    public static final int d(float f10) {
        return lo.c.c((float) Math.ceil(f10));
    }
}
