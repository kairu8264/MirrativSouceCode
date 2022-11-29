package ai;

import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.dena.mirrorman.clientlog.logs.LogBase;
import java.util.Map;

/* loaded from: classes3.dex */
public final class t20 implements r30<rp0> {
    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(rp0 rp0Var, Map map) {
        rp0 rp0Var2 = rp0Var;
        String str = (String) map.get(ActionLogBase.ACTION);
        if ("tick".equals(str)) {
            String str2 = (String) map.get(LogBase.LABEL);
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                uj0.f("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                uj0.f("No timestamp given for CSI tick.");
            } else {
                try {
                    long elapsedRealtime = wg.t.k().elapsedRealtime() + (Long.parseLong(str4) - wg.t.k().currentTimeMillis());
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    rp0Var2.l().b(str2, str3, elapsedRealtime);
                } catch (NumberFormatException e10) {
                    uj0.g("Malformed timestamp for CSI tick.", e10);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                uj0.f("No value given for CSI experiment.");
            } else {
                rp0Var2.l().c().d(i7.e.f36387u, str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                uj0.f("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                uj0.f("No name given for CSI extra.");
            } else {
                rp0Var2.l().c().d(str6, str7);
            }
        }
    }
}
