package ai;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class u20 implements r30 {

    /* renamed from: a  reason: collision with root package name */
    public static final r30 f10573a = new u20();

    @Override // ai.r30
    public final void a(Object obj, Map map) {
        tq0 tq0Var = (tq0) obj;
        r30<rp0> r30Var = q30.f8779a;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            uj0.f("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = tq0Var.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z10 = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), C.DEFAULT_BUFFER_SEGMENT_SIZE) == null) {
                z10 = false;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            hashMap.put(str2, valueOf);
            String obj2 = valueOf.toString();
            StringBuilder sb2 = new StringBuilder(str2.length() + 14 + obj2.length());
            sb2.append("/canOpenURLs;");
            sb2.append(str2);
            sb2.append(";");
            sb2.append(obj2);
            yg.p1.k(sb2.toString());
        }
        ((z50) tq0Var).j0("openableURLs", hashMap);
    }
}
