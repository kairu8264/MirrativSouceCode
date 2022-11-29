package y1;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.l;
import java.util.List;
import y1.a;

/* loaded from: classes.dex */
public final class l {
    public static final k a(String str, d0 d0Var, List<a.b<v>> list, List<a.b<p>> list2, m2.d dVar, l.b bVar) {
        jo.p.h(str, "text");
        jo.p.h(d0Var, TtmlNode.TAG_STYLE);
        jo.p.h(list, "spanStyles");
        jo.p.h(list2, "placeholders");
        jo.p.h(dVar, "density");
        jo.p.h(bVar, "fontFamilyResolver");
        return g2.f.a(str, d0Var, list, list2, dVar, bVar);
    }
}
