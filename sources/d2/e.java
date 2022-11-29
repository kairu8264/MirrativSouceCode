package d2;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class e {
    public static final d a(Context context) {
        jo.p.h(context, "context");
        return new d(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0);
    }
}
