package ai;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class ci0 {
    public static String a(String str, Context context, boolean z10) {
        String q10;
        if ((!((Boolean) ft.c().c(ox.f7989g0)).booleanValue() || z10) && wg.t.a().g(context) && !TextUtils.isEmpty(str) && (q10 = wg.t.a().q(context)) != null) {
            String str2 = (String) ft.c().c(ox.Z);
            if (((Boolean) ft.c().c(ox.Y)).booleanValue() && str.contains(str2)) {
                if (wg.t.d().W(str)) {
                    wg.t.a().s(context, q10);
                    return d(str, context).replace(str2, q10);
                } else if (wg.t.d().X(str)) {
                    wg.t.a().t(context, q10);
                    return d(str, context).replace(str2, q10);
                } else {
                    return str;
                }
            } else if (str.contains("fbs_aeid")) {
                return str;
            } else {
                if (wg.t.d().W(str)) {
                    wg.t.a().s(context, q10);
                    return c(d(str, context), "fbs_aeid", q10).toString();
                } else if (wg.t.d().X(str)) {
                    wg.t.a().t(context, q10);
                    return c(d(str, context), "fbs_aeid", q10).toString();
                } else {
                    return str;
                }
            }
        }
        return str;
    }

    public static String b(Uri uri, Context context) {
        if (!wg.t.a().g(context)) {
            return uri.toString();
        }
        String q10 = wg.t.a().q(context);
        if (q10 == null) {
            return uri.toString();
        }
        String str = (String) ft.c().c(ox.Z);
        String uri2 = uri.toString();
        if (((Boolean) ft.c().c(ox.Y)).booleanValue() && uri2.contains(str)) {
            wg.t.a().s(context, q10);
            return d(uri2, context).replace(str, q10);
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            String uri3 = c(d(uri2, context), "fbs_aeid", q10).toString();
            wg.t.a().s(context, q10);
            return uri3;
        } else {
            return uri2;
        }
    }

    public static Uri c(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            return Uri.parse(str.substring(0, i10) + str2 + "=" + str3 + "&" + str.substring(i10));
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    public static String d(String str, Context context) {
        String o10 = wg.t.a().o(context);
        String p10 = wg.t.a().p(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(o10)) {
            str = c(str, "gmp_app_id", o10).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(p10)) ? str : c(str, "fbs_aiid", p10).toString();
    }
}
