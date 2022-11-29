package gk;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.review.ReviewInfo;
import jk.o;

/* loaded from: classes3.dex */
public final class j extends i<ReviewInfo> {

    /* renamed from: z  reason: collision with root package name */
    public final String f33648z;

    public j(k kVar, o<ReviewInfo> oVar, String str) {
        super(kVar, new dk.f("OnRequestInstallCallback"), oVar);
        this.f33648z = str;
    }

    @Override // gk.i, dk.e
    public final void F0(Bundle bundle) throws RemoteException {
        super.F0(bundle);
        this.f33646x.e(new c((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
