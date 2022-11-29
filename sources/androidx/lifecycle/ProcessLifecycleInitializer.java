package androidx.lifecycle;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements b5.b<u> {
    @Override // b5.b
    public List<Class<? extends b5.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // b5.b
    /* renamed from: c */
    public u b(Context context) {
        q.a(context);
        j0.j(context);
        return j0.i();
    }
}
