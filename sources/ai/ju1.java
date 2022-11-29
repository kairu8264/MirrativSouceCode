package ai;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* loaded from: classes3.dex */
public final class ju1 extends de0 {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ mu1 f5928w;

    public ju1(mu1 mu1Var) {
        this.f5928w = mu1Var;
    }

    @Override // ai.ee0
    public final void c5(ParcelFileDescriptor parcelFileDescriptor) {
        this.f5928w.f7059w.d(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // ai.ee0
    public final void j5(yg.d0 d0Var) {
        this.f5928w.f7059w.e(new zzbb(d0Var.f61862w, d0Var.f61863x));
    }
}
