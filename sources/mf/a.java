package mf;

import android.os.Binder;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class a<T> extends Binder {

    /* renamed from: w  reason: collision with root package name */
    public final WeakReference<T> f41128w;

    public a(T t10) {
        this.f41128w = new WeakReference<>(t10);
    }

    public final T a() {
        return this.f41128w.get();
    }
}
