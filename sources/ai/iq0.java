package ai;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class iq0 implements r30<rp0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kq0 f5319a;

    public iq0(kq0 kq0Var) {
        this.f5319a = kq0Var;
    }

    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(rp0 rp0Var, Map map) {
        int i10;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.f5319a) {
                    i10 = this.f5319a.f6314e0;
                    if (i10 != parseInt) {
                        this.f5319a.f6314e0 = parseInt;
                        this.f5319a.requestLayout();
                    }
                }
            } catch (Exception e10) {
                uj0.g("Exception occurred while getting webview content height", e10);
            }
        }
    }
}
