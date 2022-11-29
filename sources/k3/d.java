package k3;

import android.content.res.Configuration;
import android.os.Build;

/* loaded from: classes.dex */
public final class d {
    public static f a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? f.d(configuration.getLocales()) : f.a(configuration.locale);
    }
}
