package ai;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class v20 implements r30 {

    /* renamed from: a  reason: collision with root package name */
    public static final r30 f10934a = new v20();

    @Override // ai.r30
    public final void a(Object obj, Map map) {
        tq0 tq0Var = (tq0) obj;
        r30<rp0> r30Var = q30.f8779a;
        if (!((Boolean) ft.c().c(ox.S5)).booleanValue()) {
            uj0.f("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            uj0.f("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(tq0Var.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        String obj2 = valueOf.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 13 + obj2.length());
        sb2.append("/canOpenApp;");
        sb2.append(str);
        sb2.append(";");
        sb2.append(obj2);
        yg.p1.k(sb2.toString());
        ((z50) tq0Var).j0("openableApp", hashMap);
    }
}
