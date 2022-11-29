package xg;

import ai.ft;
import ai.ox;
import ai.uj0;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import yg.d2;
import yg.p1;

/* loaded from: classes3.dex */
public final class a {
    public static final boolean a(Context context, Intent intent, x xVar, v vVar, boolean z10) {
        if (z10) {
            return c(context, intent.getData(), xVar, vVar);
        }
        try {
            String valueOf = String.valueOf(intent.toURI());
            p1.k(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            wg.t.d();
            d2.p(context, intent);
            if (xVar != null) {
                xVar.f();
            }
            if (vVar != null) {
                vVar.b(true);
            }
            return true;
        } catch (ActivityNotFoundException e10) {
            uj0.f(e10.getMessage());
            if (vVar != null) {
                vVar.b(false);
            }
            return false;
        }
    }

    public static final boolean b(Context context, e eVar, x xVar, v vVar) {
        int i10 = 0;
        if (eVar == null) {
            uj0.f("No intent data for launcher overlay.");
            return false;
        }
        ox.a(context);
        Intent intent = eVar.D;
        if (intent != null) {
            return a(context, intent, xVar, vVar, eVar.F);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(eVar.f60264x)) {
            uj0.f("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(eVar.f60265y)) {
            intent2.setDataAndType(Uri.parse(eVar.f60264x), eVar.f60265y);
        } else {
            intent2.setData(Uri.parse(eVar.f60264x));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(eVar.f60266z)) {
            intent2.setPackage(eVar.f60266z);
        }
        if (!TextUtils.isEmpty(eVar.A)) {
            String[] split = eVar.A.split("/", 2);
            if (split.length < 2) {
                String valueOf = String.valueOf(eVar.A);
                uj0.f(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str = eVar.B;
        if (!TextUtils.isEmpty(str)) {
            try {
                i10 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                uj0.f("Could not parse intent flags.");
            }
            intent2.addFlags(i10);
        }
        if (((Boolean) ft.c().c(ox.U2)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) ft.c().c(ox.T2)).booleanValue()) {
                wg.t.d();
                d2.b0(context, intent2);
            }
        }
        return a(context, intent2, xVar, vVar, eVar.F);
    }

    public static final boolean c(Context context, Uri uri, x xVar, v vVar) {
        int i10;
        try {
            i10 = wg.t.d().Z(context, uri);
            if (xVar != null) {
                xVar.f();
            }
        } catch (ActivityNotFoundException e10) {
            uj0.f(e10.getMessage());
            i10 = 6;
        }
        if (vVar != null) {
            vVar.a(i10);
        }
        return i10 == 5;
    }
}
