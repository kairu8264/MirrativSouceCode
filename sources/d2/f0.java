package d2;

import android.graphics.Typeface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class f0 implements d0 {
    @Override // d2.d0
    public Typeface a(x xVar, int i10) {
        jo.p.h(xVar, TtmlNode.ATTR_TTS_FONT_WEIGHT);
        return c(null, xVar, i10);
    }

    @Override // d2.d0
    public Typeface b(y yVar, x xVar, int i10) {
        jo.p.h(yVar, "name");
        jo.p.h(xVar, TtmlNode.ATTR_TTS_FONT_WEIGHT);
        Typeface d10 = d(g0.b(yVar.f(), xVar), xVar, i10);
        return d10 == null ? c(yVar.f(), xVar, i10) : d10;
    }

    public final Typeface c(String str, x xVar, int i10) {
        boolean z10 = false;
        if (u.f(i10, u.f29139b.b()) && jo.p.c(xVar, x.f29149x.d())) {
            if (str == null || str.length() == 0) {
                Typeface typeface = Typeface.DEFAULT;
                jo.p.g(typeface, "DEFAULT");
                return typeface;
            }
        }
        int c10 = f.c(xVar, i10);
        if (str == null || str.length() == 0) {
            z10 = true;
        }
        if (z10) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(c10);
            jo.p.g(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        Typeface create = Typeface.create(str, c10);
        jo.p.g(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }

    public final Typeface d(String str, x xVar, int i10) {
        boolean z10 = true;
        if (str.length() == 0) {
            return null;
        }
        Typeface c10 = c(str, xVar, i10);
        if (jo.p.c(c10, Typeface.create(Typeface.DEFAULT, f.c(xVar, i10))) || jo.p.c(c10, c(null, xVar, i10))) {
            z10 = false;
        }
        if (z10) {
            return c10;
        }
        return null;
    }
}
