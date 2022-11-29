package ai;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class pr0 {

    /* renamed from: a  reason: collision with root package name */
    public zj0 f8529a;

    /* renamed from: b  reason: collision with root package name */
    public Context f8530b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<Context> f8531c;

    public final pr0 d(zj0 zj0Var) {
        this.f8529a = zj0Var;
        return this;
    }

    public final pr0 e(Context context) {
        this.f8531c = new WeakReference<>(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f8530b = context;
        return this;
    }
}
