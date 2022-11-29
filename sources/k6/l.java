package k6;

import android.view.View;

/* loaded from: classes.dex */
public final class l {
    public static final <T extends View> k<T> a(T t10, boolean z10) {
        return new f(t10, z10);
    }

    public static /* synthetic */ k b(View view, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(view, z10);
    }
}
