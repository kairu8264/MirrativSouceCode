package d2;

import android.content.Context;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final i0 f29099a = new i0();

    public final Typeface a(Context context, h0 h0Var) {
        jo.p.h(context, "context");
        jo.p.h(h0Var, "font");
        Typeface font = context.getResources().getFont(h0Var.d());
        jo.p.g(font, "context.resources.getFont(font.resId)");
        return font;
    }
}
