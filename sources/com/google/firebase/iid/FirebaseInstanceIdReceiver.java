package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import em.l;
import java.util.concurrent.ExecutionException;
import mh.a;
import mh.b;
import vi.j;

/* loaded from: classes4.dex */
public final class FirebaseInstanceIdReceiver extends b {
    @Override // mh.b
    public final int b(Context context, a aVar) {
        try {
            return ((Integer) j.a(new l(context).g(aVar.p()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // mh.b
    public final void c(Context context, Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (com.google.firebase.messaging.b.A(putExtras)) {
            com.google.firebase.messaging.b.s(putExtras);
        }
    }
}
