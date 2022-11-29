package v1;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.z;
import c1.e0;
import l0.i;

/* loaded from: classes.dex */
public final class b {
    public static final long a(int i10, i iVar, int i11) {
        Context context = (Context) iVar.G(z.g());
        if (Build.VERSION.SDK_INT >= 23) {
            return a.f56562a.a(context, i10);
        }
        return e0.b(context.getResources().getColor(i10));
    }
}
