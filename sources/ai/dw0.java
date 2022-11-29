package ai;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class dw0 implements lv0 {

    /* renamed from: a  reason: collision with root package name */
    public final ms1 f3421a;

    public dw0(ms1 ms1Var) {
        this.f3421a = ms1Var;
    }

    @Override // ai.lv0
    public final void a(Map<String, String> map) {
        String str = map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f3421a.c(str.equals("true"));
    }
}
