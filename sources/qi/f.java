package qi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static f f49515c;

    /* renamed from: a  reason: collision with root package name */
    public k f49516a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f49517b;

    public f(Context context) {
        this.f49517b = context.getApplicationContext();
    }

    public static int a(h hVar) {
        return hVar.f49518a.getIdentifier("libraries_social_licenses_license", TtmlNode.TAG_LAYOUT, hVar.f49519b);
    }

    public static f b(Context context) {
        if (f49515c == null) {
            f fVar = new f(context);
            f49515c = fVar;
            fVar.f49516a = new k(fVar.f49517b);
        }
        return f49515c;
    }

    public static h c(Context context, String str) {
        try {
            return new h(context.getPackageManager().getResourcesForApplication(str), str);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 52);
            sb2.append("Unable to get resources for ");
            sb2.append(str);
            sb2.append(", using local resources.");
            Log.w("OssLicenses", sb2.toString());
            return new h(context.getResources(), context.getPackageName());
        }
    }

    public static int d(h hVar) {
        return hVar.f49518a.getIdentifier("license", TtmlNode.ATTR_ID, hVar.f49519b);
    }

    public final k e() {
        return this.f49516a;
    }
}
