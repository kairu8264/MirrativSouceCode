package po;

import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes4.dex */
public class m {
    public static final void a(boolean z10, Number number) {
        p.h(number, MRLog.PAYLOAD_KEY_STEP);
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    public static final e<Float> b(float f10, float f11) {
        return new d(f10, f11);
    }
}
