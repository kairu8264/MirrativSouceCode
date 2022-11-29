package ai;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes3.dex */
public final class xt3 implements DisplayManager.DisplayListener, vt3 {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayManager f12312a;

    /* renamed from: b  reason: collision with root package name */
    public ut3 f12313b;

    public xt3(DisplayManager displayManager) {
        this.f12312a = displayManager;
    }

    public static vt3 b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new xt3(displayManager);
        }
        return null;
    }

    @Override // ai.vt3
    public final void a(ut3 ut3Var) {
        this.f12313b = ut3Var;
        this.f12312a.registerDisplayListener(this, sb.M(null));
        ut3Var.a(c());
    }

    public final Display c() {
        return this.f12312a.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        ut3 ut3Var = this.f12313b;
        if (ut3Var == null || i10 != 0) {
            return;
        }
        ut3Var.a(c());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }

    @Override // ai.vt3
    public final void zzb() {
        this.f12312a.unregisterDisplayListener(this);
        this.f12313b = null;
    }
}
