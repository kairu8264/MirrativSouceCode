package dk;

import android.content.Context;

/* loaded from: classes3.dex */
public final class t {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
