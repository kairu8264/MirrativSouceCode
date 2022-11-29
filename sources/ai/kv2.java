package ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzggm;
import java.io.File;

/* loaded from: classes3.dex */
public final class kv2 {

    /* renamed from: a  reason: collision with root package name */
    public final File f6371a;

    /* renamed from: b  reason: collision with root package name */
    public final File f6372b;

    /* renamed from: c  reason: collision with root package name */
    public final SharedPreferences f6373c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6374d;

    public kv2(Context context, int i10) {
        this.f6373c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        lv2.d(dir, false);
        this.f6371a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        lv2.d(dir2, true);
        this.f6372b = dir2;
        this.f6374d = i10;
    }

    public static String b(j2 j2Var) {
        return vh.k.a(j2Var.T().U());
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(ai.g2 r8, ai.rv2 r9) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kv2.a(ai.g2, ai.rv2):boolean");
    }

    public final jv2 c(int i10) {
        j2 d10 = d(1);
        if (d10 == null) {
            return null;
        }
        String B = d10.B();
        File a10 = lv2.a(B, "pcam.jar", e());
        if (!a10.exists()) {
            a10 = lv2.a(B, "pcam", e());
        }
        return new jv2(d10, a10, lv2.a(B, "pcbc", e()), lv2.a(B, "pcopt", e()));
    }

    public final j2 d(int i10) {
        String string;
        if (i10 == 1) {
            string = this.f6373c.getString(g(), null);
        } else {
            string = this.f6373c.getString(f(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            j2 G = j2.G(oh3.N(vh.k.c(string)));
            String B = G.B();
            File a10 = lv2.a(B, "pcam.jar", e());
            if (!a10.exists()) {
                a10 = lv2.a(B, "pcam", e());
            }
            File a11 = lv2.a(B, "pcbc", e());
            if (a10.exists()) {
                if (a11.exists()) {
                    return G;
                }
            }
        } catch (zzggm unused) {
        }
        return null;
    }

    public final File e() {
        File file = new File(this.f6371a, Integer.toString(this.f6374d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String f() {
        int i10 = this.f6374d;
        StringBuilder sb2 = new StringBuilder(17);
        sb2.append("FBAMTD");
        sb2.append(i10 - 1);
        return sb2.toString();
    }

    public final String g() {
        int i10 = this.f6374d;
        StringBuilder sb2 = new StringBuilder(17);
        sb2.append("LATMTD");
        sb2.append(i10 - 1);
        return sb2.toString();
    }
}
