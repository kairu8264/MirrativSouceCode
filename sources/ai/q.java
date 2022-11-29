package ai;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public interface q {
    String a(Context context, String str, View view);

    void b(View view);

    void c(MotionEvent motionEvent);

    String d(Context context);

    String e(Context context, View view, Activity activity);

    String f(Context context, String str, View view, Activity activity);

    @Deprecated
    void g(int i10, int i11, int i12);
}
