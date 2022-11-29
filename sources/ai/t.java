package ai;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class t extends s {
    public t(Context context, String str, boolean z10) {
        super(context, str, z10);
    }

    public static t v(String str, Context context, boolean z10) {
        s.o(context, false);
        return new t(context, str, false);
    }

    @Deprecated
    public static t w(String str, Context context, boolean z10, int i10) {
        s.o(context, z10);
        return new t(context, str, z10);
    }

    @Override // ai.s
    public final List<Callable<Void>> r(r0 r0Var, Context context, c64 c64Var, v54 v54Var) {
        if (r0Var.e() != null && this.Q) {
            int u10 = r0Var.u();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(super.r(r0Var, context, c64Var, null));
            arrayList.add(new h1(r0Var, "NSYe0Ak7CUXd9zFZA3bczJ8pTgBK/kfUu9ICpHR+lQrTNc8+V7Owo49e2WIp0407", "Ux7t0A/7z2bV/IDvLZJgV4tTxr0Vvc1KngWKlG2Szwg=", c64Var, u10, 24));
            return arrayList;
        }
        return super.r(r0Var, context, c64Var, null);
    }
}
