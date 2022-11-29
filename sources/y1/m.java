package y1;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.l;
import java.util.List;
import y1.a;

/* loaded from: classes.dex */
public final class m {
    public static final h a(String str, d0 d0Var, long j10, m2.d dVar, l.b bVar, List<a.b<v>> list, List<a.b<p>> list2, int i10, boolean z10) {
        jo.p.h(str, "text");
        jo.p.h(d0Var, TtmlNode.TAG_STYLE);
        jo.p.h(dVar, "density");
        jo.p.h(bVar, "fontFamilyResolver");
        jo.p.h(list, "spanStyles");
        jo.p.h(list2, "placeholders");
        return g2.g.b(str, d0Var, list, list2, i10, z10, j10, dVar, bVar);
    }

    public static final h c(k kVar, long j10, int i10, boolean z10) {
        jo.p.h(kVar, "paragraphIntrinsics");
        return g2.g.a(kVar, i10, z10, j10);
    }

    public static final int d(float f10) {
        return (int) Math.ceil(f10);
    }
}
