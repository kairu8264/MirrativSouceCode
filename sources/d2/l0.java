package d2;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f29104a = new l0();

    public final Typeface a(Typeface typeface, int i10, boolean z10) {
        jo.p.h(typeface, "typeface");
        Typeface create = Typeface.create(typeface, i10, z10);
        jo.p.g(create, "create(typeface, finalFontWeight, finalFontStyle)");
        return create;
    }
}
