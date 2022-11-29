package ai;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class rv0 implements lv0 {

    /* renamed from: a  reason: collision with root package name */
    public final ms1 f9601a;

    public rv0(ms1 ms1Var) {
        this.f9601a = ms1Var;
    }

    @Override // ai.lv0
    public final void a(Map<String, String> map) {
        char c10;
        String str = map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c10 = 0;
            }
            c10 = 65535;
        } else {
            if (str.equals("flick")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            this.f9601a.e(hs1.SHAKE);
        } else if (c10 != 1) {
            this.f9601a.e(hs1.NONE);
        } else {
            this.f9601a.e(hs1.FLICK);
        }
    }
}
