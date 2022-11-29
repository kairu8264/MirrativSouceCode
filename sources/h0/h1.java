package h0;

import android.content.Context;
import android.content.res.Resources;
import h0.g1;

/* loaded from: classes.dex */
public final class h1 {
    public static final String a(int i10, l0.i iVar, int i11) {
        String str;
        iVar.x(-726638443);
        iVar.G(androidx.compose.ui.platform.z.f());
        Resources resources = ((Context) iVar.G(androidx.compose.ui.platform.z.g())).getResources();
        g1.a aVar = g1.f33874a;
        if (g1.i(i10, aVar.e())) {
            str = resources.getString(x0.i.f59396h);
            jo.p.g(str, "resources.getString(R.string.navigation_menu)");
        } else if (g1.i(i10, aVar.a())) {
            str = resources.getString(x0.i.f59389a);
            jo.p.g(str, "resources.getString(R.string.close_drawer)");
        } else if (g1.i(i10, aVar.b())) {
            str = resources.getString(x0.i.f59390b);
            jo.p.g(str, "resources.getString(R.string.close_sheet)");
        } else if (g1.i(i10, aVar.c())) {
            str = resources.getString(x0.i.f59391c);
            jo.p.g(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (g1.i(i10, aVar.d())) {
            str = resources.getString(x0.i.f59393e);
            jo.p.g(str, "resources.getString(R.string.dropdown_menu)");
        } else if (g1.i(i10, aVar.g())) {
            str = resources.getString(x0.i.f59401m);
            jo.p.g(str, "resources.getString(R.string.range_start)");
        } else if (g1.i(i10, aVar.f())) {
            str = resources.getString(x0.i.f59400l);
            jo.p.g(str, "resources.getString(R.string.range_end)");
        } else {
            str = "";
        }
        iVar.O();
        return str;
    }
}
