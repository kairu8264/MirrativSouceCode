package d2;

import android.graphics.Typeface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.u;

/* loaded from: classes.dex */
public final class e0 implements d0 {
    @Override // d2.d0
    public Typeface a(x xVar, int i10) {
        jo.p.h(xVar, TtmlNode.ATTR_TTS_FONT_WEIGHT);
        return c(null, xVar, i10);
    }

    @Override // d2.d0
    public Typeface b(y yVar, x xVar, int i10) {
        jo.p.h(yVar, "name");
        jo.p.h(xVar, TtmlNode.ATTR_TTS_FONT_WEIGHT);
        return c(yVar.f(), xVar, i10);
    }

    public final Typeface c(String str, x xVar, int i10) {
        Typeface create;
        u.a aVar = u.f29139b;
        if (u.f(i10, aVar.b()) && jo.p.c(xVar, x.f29149x.d())) {
            if (str == null || str.length() == 0) {
                Typeface typeface = Typeface.DEFAULT;
                jo.p.g(typeface, "DEFAULT");
                return typeface;
            }
        }
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        Typeface create2 = Typeface.create(create, xVar.r(), u.f(i10, aVar.a()));
        jo.p.g(create2, "create(\n            fami…ontStyle.Italic\n        )");
        return create2;
    }
}
