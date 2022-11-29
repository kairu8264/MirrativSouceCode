package ai;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public final class ns {

    /* renamed from: a  reason: collision with root package name */
    public final rg.g[] f7451a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7452b;

    public ns(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, rg.r.f51373a);
        String string = obtainAttributes.getString(rg.r.f51374b);
        String string2 = obtainAttributes.getString(rg.r.f51375c);
        boolean z10 = !TextUtils.isEmpty(string);
        boolean z11 = !TextUtils.isEmpty(string2);
        if (z10 && !z11) {
            this.f7451a = c(string);
        } else if (z10 || !z11) {
            if (z10) {
                obtainAttributes.recycle();
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            } else {
                obtainAttributes.recycle();
                throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
            }
        } else {
            this.f7451a = c(string2);
        }
        String string3 = obtainAttributes.getString(rg.r.f51376d);
        this.f7452b = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    public static rg.g[] c(String str) {
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        rg.g[] gVarArr = new rg.g[length];
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    gVarArr[i10] = new rg.g("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(trim.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(trim) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(trim)) {
                gVarArr[i10] = rg.g.f51347i;
            } else if ("LARGE_BANNER".equals(trim)) {
                gVarArr[i10] = rg.g.f51349k;
            } else if ("FULL_BANNER".equals(trim)) {
                gVarArr[i10] = rg.g.f51348j;
            } else if ("LEADERBOARD".equals(trim)) {
                gVarArr[i10] = rg.g.f51350l;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                gVarArr[i10] = rg.g.f51351m;
            } else if ("SMART_BANNER".equals(trim)) {
                gVarArr[i10] = rg.g.f51353o;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                gVarArr[i10] = rg.g.f51352n;
            } else if ("FLUID".equals(trim)) {
                gVarArr[i10] = rg.g.f51354p;
            } else if ("ICON".equals(trim)) {
                gVarArr[i10] = rg.g.f51357s;
            } else {
                throw new IllegalArgumentException(trim.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(trim) : new String("Could not parse XML attribute \"adSize\": "));
            }
        }
        if (length == 0) {
            throw new IllegalArgumentException(str.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(str) : new String("Could not parse XML attribute \"adSize\": "));
        }
        return gVarArr;
    }

    public final rg.g[] a(boolean z10) {
        if (z10 || this.f7451a.length == 1) {
            return this.f7451a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }

    public final String b() {
        return this.f7452b;
    }
}
