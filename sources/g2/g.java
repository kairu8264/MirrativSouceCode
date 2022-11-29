package g2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.l;
import j2.e;
import java.util.List;
import jo.p;
import y1.a;
import y1.d0;
import y1.v;
import z1.s;

/* loaded from: classes.dex */
public final class g {
    public static final y1.h a(y1.k kVar, int i10, boolean z10, long j10) {
        p.h(kVar, "paragraphIntrinsics");
        return new c((e) kVar, i10, z10, j10, null);
    }

    public static final y1.h b(String str, d0 d0Var, List<a.b<v>> list, List<a.b<y1.p>> list2, int i10, boolean z10, long j10, m2.d dVar, l.b bVar) {
        p.h(str, "text");
        p.h(d0Var, TtmlNode.TAG_STYLE);
        p.h(list, "spanStyles");
        p.h(list2, "placeholders");
        p.h(dVar, "density");
        p.h(bVar, "fontFamilyResolver");
        return new c(new e(str, d0Var, list, list2, bVar, dVar), i10, z10, j10, null);
    }

    public static final int e(s sVar, int i10) {
        int h10 = sVar.h();
        for (int i11 = 0; i11 < h10; i11++) {
            if (sVar.g(i11) > i10) {
                return i11;
            }
        }
        return sVar.h();
    }

    public static final int f(j2.e eVar) {
        e.a aVar = j2.e.f37075b;
        if (eVar == null ? false : j2.e.j(eVar.m(), aVar.d())) {
            return 3;
        }
        if (eVar == null ? false : j2.e.j(eVar.m(), aVar.e())) {
            return 4;
        }
        if (eVar == null ? false : j2.e.j(eVar.m(), aVar.a())) {
            return 2;
        }
        if (eVar == null ? false : j2.e.j(eVar.m(), aVar.f())) {
            return 0;
        }
        return eVar == null ? false : j2.e.j(eVar.m(), aVar.b()) ? 1 : 0;
    }
}
