package ph;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes3.dex */
public interface g {
    Activity L();

    void l(String str, LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T s(String str, Class<T> cls);

    void startActivityForResult(Intent intent, int i10);
}
