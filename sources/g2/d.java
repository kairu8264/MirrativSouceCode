package g2;

import android.graphics.Typeface;
import android.text.SpannableString;
import d2.u;
import d2.x;
import io.r;
import java.util.List;
import m2.s;
import y1.a;
import y1.d0;
import y1.p;
import y1.t;
import y1.v;

/* loaded from: classes.dex */
public final class d {
    public static final CharSequence a(String str, float f10, d0 d0Var, List<a.b<v>> list, List<a.b<p>> list2, m2.d dVar, r<? super d2.l, ? super x, ? super u, ? super d2.v, ? extends Typeface> rVar) {
        jo.p.h(str, "text");
        jo.p.h(d0Var, "contextTextStyle");
        jo.p.h(list, "spanStyles");
        jo.p.h(list2, "placeholders");
        jo.p.h(dVar, "density");
        jo.p.h(rVar, "resolveTypeface");
        if (list.isEmpty() && list2.isEmpty() && jo.p.c(d0Var.z(), j2.j.f37103c.a()) && s.e(d0Var.o())) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        if (b(d0Var) && d0Var.p() == null) {
            h2.e.o(spannableString, d0Var.o(), f10, dVar);
        } else {
            j2.c p10 = d0Var.p();
            if (p10 == null) {
                p10 = j2.c.f37061c.a();
            }
            h2.e.n(spannableString, d0Var.o(), f10, dVar, p10);
        }
        h2.e.v(spannableString, d0Var.z(), f10, dVar);
        h2.e.t(spannableString, d0Var, list, dVar, rVar);
        h2.c.d(spannableString, list2, dVar);
        return spannableString;
    }

    public static final boolean b(d0 d0Var) {
        jo.p.h(d0Var, "<this>");
        t s10 = d0Var.s();
        if (s10 != null) {
            s10.a();
            return true;
        }
        return true;
    }
}
