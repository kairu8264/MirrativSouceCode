package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;

/* loaded from: classes.dex */
public class b extends q0 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: y  reason: collision with root package name */
    public Application f15503y;

    public b(Application application) {
        this.f15503y = application;
    }

    public <T extends Application> T f() {
        return (T) this.f15503y;
    }
}
