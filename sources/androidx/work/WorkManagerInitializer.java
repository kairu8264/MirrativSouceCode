package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import k5.j;
import k5.t;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b5.b<t> {

    /* renamed from: a  reason: collision with root package name */
    public static final String f16516a = j.f("WrkMgrInitializer");

    @Override // b5.b
    public List<Class<? extends b5.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // b5.b
    /* renamed from: c */
    public t b(Context context) {
        j.c().a(f16516a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        t.e(context, new a.b().a());
        return t.d(context);
    }
}
