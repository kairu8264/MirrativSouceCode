package ai;

import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import java.util.Map;

/* loaded from: classes3.dex */
public final class i40 implements r30<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final h40 f5114a;

    public i40(h40 h40Var) {
        this.f5114a = h40Var;
    }

    public static void b(rp0 rp0Var, h40 h40Var) {
        rp0Var.c1("/reward", new i40(h40Var));
    }

    @Override // ai.r30
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get(ActionLogBase.ACTION);
        if ("grant".equals(str)) {
            lf0 lf0Var = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    lf0Var = new lf0(str2, parseInt);
                }
            } catch (NumberFormatException e10) {
                uj0.g("Unable to parse reward amount.", e10);
            }
            this.f5114a.p0(lf0Var);
        } else if ("video_start".equals(str)) {
            this.f5114a.zza();
        } else if ("video_complete".equals(str)) {
            this.f5114a.b();
        }
    }
}
