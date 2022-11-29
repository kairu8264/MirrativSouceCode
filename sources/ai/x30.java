package ai;

import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public final class x30 implements r30<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11856a;

    public x30(Context context) {
        this.f11856a = context;
    }

    @Override // ai.r30
    public final void a(Object obj, Map<String, String> map) {
        char c10;
        if (wg.t.a().g(this.f11856a)) {
            String str = map.get("eventName");
            String str2 = map.get("eventId");
            int hashCode = str.hashCode();
            if (hashCode == 94399) {
                if (str.equals("_aa")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (str.equals("_ac")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                wg.t.a().s(this.f11856a, str2);
            } else if (c10 == 1) {
                wg.t.a().t(this.f11856a, str2);
            } else if (c10 != 2) {
                uj0.c("logScionEvent gmsg contained unsupported eventName");
            } else {
                wg.t.a().v(this.f11856a, str2);
            }
        }
    }
}
