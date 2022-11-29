package f0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.l;
import java.util.List;
import y1.a;

/* loaded from: classes.dex */
public final class s0 {
    public static final boolean a(y1.z zVar, y1.a aVar, y1.d0 d0Var, List<a.b<y1.p>> list, int i10, boolean z10, int i11, m2.d dVar, m2.q qVar, l.b bVar, long j10) {
        jo.p.h(zVar, "$this$canReuse");
        jo.p.h(aVar, "text");
        jo.p.h(d0Var, TtmlNode.TAG_STYLE);
        jo.p.h(list, "placeholders");
        jo.p.h(dVar, "density");
        jo.p.h(qVar, "layoutDirection");
        jo.p.h(bVar, "fontFamilyResolver");
        y1.y k10 = zVar.k();
        if (!zVar.v().i().b() && jo.p.c(k10.j(), aVar) && k10.i().A(d0Var) && jo.p.c(k10.g(), list) && k10.e() == i10 && k10.h() == z10 && j2.k.d(k10.f(), i11) && jo.p.c(k10.b(), dVar) && k10.d() == qVar && jo.p.c(k10.c(), bVar) && m2.b.p(j10) == m2.b.p(k10.a())) {
            if (z10 || j2.k.d(i11, j2.k.f37107a.b())) {
                return m2.b.n(j10) == m2.b.n(k10.a()) && m2.b.m(j10) == m2.b.m(k10.a());
            }
            return true;
        }
        return false;
    }
}
