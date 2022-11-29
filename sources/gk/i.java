package gk;

import android.os.Bundle;
import android.os.RemoteException;
import dk.r;
import jk.o;

/* loaded from: classes3.dex */
public class i<T> extends dk.d {

    /* renamed from: w  reason: collision with root package name */
    public final dk.f f33645w;

    /* renamed from: x  reason: collision with root package name */
    public final o<T> f33646x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ k f33647y;

    public i(k kVar, dk.f fVar, o<T> oVar) {
        this.f33647y = kVar;
        this.f33645w = fVar;
        this.f33646x = oVar;
    }

    @Override // dk.e
    public void F0(Bundle bundle) throws RemoteException {
        r<dk.c> rVar = this.f33647y.f33650a;
        if (rVar != null) {
            rVar.s(this.f33646x);
        }
        this.f33645w.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
