package ai;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ea2 implements xc2<fa2> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f3594a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f3595b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f3596c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<String> f3597d;

    public ea2(t43 t43Var, ViewGroup viewGroup, Context context, Set<String> set) {
        this.f3594a = t43Var;
        this.f3597d = set;
        this.f3595b = viewGroup;
        this.f3596c = context;
    }

    public final /* synthetic */ fa2 a() throws Exception {
        if (((Boolean) ft.c().c(ox.f8009i4)).booleanValue() && this.f3595b != null && this.f3597d.contains(MRLog.TARGET_TYPE_BANNER)) {
            return new fa2(Boolean.valueOf(this.f3595b.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) ft.c().c(ox.f8017j4)).booleanValue() && this.f3597d.contains("native")) {
            Context context = this.f3596c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window != null && (window.getAttributes().flags & 16777216) != 0) {
                    bool = Boolean.TRUE;
                } else {
                    try {
                        bool = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                return new fa2(bool);
            }
        }
        return new fa2(null);
    }

    @Override // ai.xc2
    public final s43<fa2> zza() {
        return this.f3594a.h(new Callable(this) { // from class: ai.da2

            /* renamed from: a  reason: collision with root package name */
            public final ea2 f3192a;

            {
                this.f3192a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f3192a.a();
            }
        });
    }
}
