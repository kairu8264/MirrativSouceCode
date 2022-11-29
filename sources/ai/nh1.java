package ai;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nh1 implements yz {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ki1 f7329a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7330b;

    public nh1(ki1 ki1Var, ViewGroup viewGroup) {
        this.f7329a = ki1Var;
        this.f7330b = viewGroup;
    }

    @Override // ai.yz
    public final void a(MotionEvent motionEvent) {
        this.f7329a.onTouch(null, motionEvent);
    }

    @Override // ai.yz
    public final JSONObject b() {
        return this.f7329a.p();
    }

    @Override // ai.yz
    public final JSONObject d() {
        return this.f7329a.l();
    }

    @Override // ai.yz
    public final void zza() {
        ki1 ki1Var = this.f7329a;
        zz2<String> zz2Var = kh1.J;
        Map<String, WeakReference<View>> i10 = ki1Var.i();
        if (i10 == null) {
            return;
        }
        int size = zz2Var.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            if (i10.get(zz2Var.get(i11)) != null) {
                this.f7329a.onClick(this.f7330b);
                return;
            }
            i11 = i12;
        }
    }
}
