package v;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public interface m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f56291a = a.f56292a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f56292a = new a();

        public final m0 a() {
            if (b0.c(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? n0.f56296b : o0.f56303b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    l0 a(c0 c0Var, View view, m2.d dVar, float f10);

    boolean b();
}
