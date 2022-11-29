package ai;

import android.text.TextUtils;

@Deprecated
/* loaded from: classes3.dex */
public final class ux {
    public static final void a(tx txVar, rx rxVar) {
        if (rxVar.b() != null) {
            if (!TextUtils.isEmpty(rxVar.c())) {
                txVar.a(rxVar.b(), rxVar.c(), rxVar.a(), rxVar.d());
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
}
