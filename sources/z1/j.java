package z1;

import android.text.Spanned;

/* loaded from: classes.dex */
public final class j {
    public static final boolean a(Spanned spanned, Class<?> cls) {
        jo.p.h(spanned, "<this>");
        jo.p.h(cls, "clazz");
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean b(Spanned spanned, Class<?> cls, int i10, int i11) {
        jo.p.h(spanned, "<this>");
        jo.p.h(cls, "clazz");
        return spanned.nextSpanTransition(i10 - 1, i11, cls) != i11;
    }
}
