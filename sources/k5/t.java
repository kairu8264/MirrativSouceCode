package k5;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Collections;
import java.util.List;

@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class t {
    public static t d(Context context) {
        return l5.i.k(context);
    }

    public static void e(Context context, androidx.work.a aVar) {
        l5.i.e(context, aVar);
    }

    public abstract m a(String str);

    public abstract m b(List<? extends u> list);

    public final m c(u uVar) {
        return b(Collections.singletonList(uVar));
    }
}
