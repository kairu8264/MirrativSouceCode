package ai;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class x31 implements k61, q51 {

    /* renamed from: w  reason: collision with root package name */
    public final Context f11857w;

    /* renamed from: x  reason: collision with root package name */
    public final fl2 f11858x;

    /* renamed from: y  reason: collision with root package name */
    public final vc0 f11859y;

    public x31(Context context, fl2 fl2Var, vc0 vc0Var, byte[] bArr) {
        this.f11857w = context;
        this.f11858x = fl2Var;
        this.f11859y = vc0Var;
    }

    @Override // ai.k61
    public final void a() {
        wc0 wc0Var = this.f11858x.Z;
        if (wc0Var == null || !wc0Var.f11545a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f11858x.Z.f11546b.isEmpty()) {
            return;
        }
        arrayList.add(this.f11858x.Z.f11546b);
    }

    @Override // ai.q51
    public final void p(Context context) {
    }

    @Override // ai.q51
    public final void t(Context context) {
    }

    @Override // ai.q51
    public final void y(Context context) {
    }
}
