package ai;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xv0 implements lv0 {

    /* renamed from: a  reason: collision with root package name */
    public final el2 f12322a;

    public xv0(el2 el2Var) {
        this.f12322a = el2Var;
    }

    @Override // ai.lv0
    public final void a(Map<String, String> map) {
        String str = map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f12322a.a(Boolean.parseBoolean(str));
        } catch (Exception unused) {
            throw new IllegalStateException("Invalid render_in_browser state");
        }
    }
}
