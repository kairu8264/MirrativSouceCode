package d2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.x;

/* loaded from: classes.dex */
public final class f {
    public static final x a(x.a aVar) {
        jo.p.h(aVar, "<this>");
        return aVar.g();
    }

    public static final int b(boolean z10, boolean z11) {
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public static final int c(x xVar, int i10) {
        jo.p.h(xVar, TtmlNode.ATTR_TTS_FONT_WEIGHT);
        return b(xVar.compareTo(a(x.f29149x)) >= 0, u.f(i10, u.f29139b.a()));
    }
}
