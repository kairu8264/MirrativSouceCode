package gk;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import jk.o;

/* loaded from: classes3.dex */
public final class e extends ResultReceiver {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ o f33639w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Handler handler, o oVar) {
        super(handler);
        this.f33639w = oVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f33639w.e(null);
    }
}
