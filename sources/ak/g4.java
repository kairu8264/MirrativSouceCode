package ak;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.play.core.assetpacks.AssetPackException;

/* loaded from: classes3.dex */
public final class g4 extends ResultReceiver {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ jk.o f13377w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ h4 f13378x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(h4 h4Var, Handler handler, jk.o oVar) {
        super(handler);
        this.f13378x = h4Var;
        this.f13377w = oVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        b1 b1Var;
        if (i10 == 1) {
            this.f13377w.e(-1);
            b1Var = this.f13378x.f13401g;
            b1Var.b(null);
        } else if (i10 != 2) {
            this.f13377w.d(new AssetPackException(-100));
        } else {
            this.f13377w.e(0);
        }
    }
}
