package ai;

import android.content.Context;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public final class wt3 implements vt3 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowManager f11749a;

    public wt3(WindowManager windowManager) {
        this.f11749a = windowManager;
    }

    public static vt3 b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new wt3(windowManager);
        }
        return null;
    }

    @Override // ai.vt3
    public final void a(ut3 ut3Var) {
        ut3Var.a(this.f11749a.getDefaultDisplay());
    }

    @Override // ai.vt3
    public final void zzb() {
    }
}
