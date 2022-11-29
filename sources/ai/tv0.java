package ai;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class tv0 implements lv0 {

    /* renamed from: a  reason: collision with root package name */
    public final ms1 f10472a;

    public tv0(ms1 ms1Var) {
        this.f10472a = ms1Var;
    }

    @Override // ai.lv0
    public final void a(Map<String, String> map) {
        if (((Boolean) ft.c().c(ox.F6)).booleanValue()) {
            String str = map.get("policy_violations");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f10472a.l(str);
        }
    }
}
