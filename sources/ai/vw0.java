package ai;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class vw0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f11392a;

    /* renamed from: b  reason: collision with root package name */
    public final h80 f11393b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f11394c;

    /* renamed from: d  reason: collision with root package name */
    public ax0 f11395d;

    /* renamed from: e  reason: collision with root package name */
    public final r30<Object> f11396e = new sw0(this);

    /* renamed from: f  reason: collision with root package name */
    public final r30<Object> f11397f = new uw0(this);

    public vw0(String str, h80 h80Var, Executor executor) {
        this.f11392a = str;
        this.f11393b = h80Var;
        this.f11394c = executor;
    }

    public static /* synthetic */ boolean g(vw0 vw0Var, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(vw0Var.f11392a);
    }

    public final void c(ax0 ax0Var) {
        this.f11393b.b("/updateActiveView", this.f11396e);
        this.f11393b.b("/untrackActiveViewUnit", this.f11397f);
        this.f11395d = ax0Var;
    }

    public final void d(rp0 rp0Var) {
        rp0Var.c1("/updateActiveView", this.f11396e);
        rp0Var.c1("/untrackActiveViewUnit", this.f11397f);
    }

    public final void e(rp0 rp0Var) {
        rp0Var.Y0("/updateActiveView", this.f11396e);
        rp0Var.Y0("/untrackActiveViewUnit", this.f11397f);
    }

    public final void f() {
        this.f11393b.c("/updateActiveView", this.f11396e);
        this.f11393b.c("/untrackActiveViewUnit", this.f11397f);
    }
}
