package ai;

import com.google.android.gms.internal.ads.zzfaw;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class jn1 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, in1> f5850a = new HashMap();

    public final synchronized void a(String str, pm2 pm2Var) {
        if (this.f5850a.containsKey(str)) {
            return;
        }
        try {
            this.f5850a.put(str, new in1(str, pm2Var.C(), pm2Var.a()));
        } catch (zzfaw unused) {
        }
    }

    public final synchronized void b(String str, ya0 ya0Var) {
        if (this.f5850a.containsKey(str)) {
            return;
        }
        try {
            this.f5850a.put(str, new in1(str, ya0Var.a(), ya0Var.f()));
        } catch (Throwable unused) {
        }
    }

    public final synchronized in1 c(String str) {
        return this.f5850a.get(str);
    }

    public final in1 d(List<String> list) {
        for (String str : list) {
            in1 c10 = c(str);
            if (c10 != null) {
                return c10;
            }
        }
        return null;
    }
}
