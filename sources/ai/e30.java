package ai;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class e30 implements r30<rp0> {
    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(rp0 rp0Var, Map map) {
        rp0 rp0Var2 = rp0Var;
        wg.t.d();
        DisplayMetrics f02 = yg.d2.f0((WindowManager) rp0Var2.getContext().getSystemService("window"));
        int i10 = f02.widthPixels;
        int i11 = f02.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) rp0Var2).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i10));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i11));
        rp0Var2.j0("locationReady", hashMap);
        uj0.f("GET LOCATION COMPILED");
    }
}
