package b8;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class i implements k, ComponentCallbacks2 {
    @Override // b8.k
    public void a(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(20);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
    }
}
