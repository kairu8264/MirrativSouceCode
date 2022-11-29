package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import j4.a;
import pi.k4;
import pi.l4;

/* loaded from: classes3.dex */
public final class AppMeasurementReceiver extends a implements k4 {

    /* renamed from: y  reason: collision with root package name */
    public l4 f27292y;

    @Override // pi.k4
    public void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f27292y == null) {
            this.f27292y = new l4(this);
        }
        this.f27292y.a(context, intent);
    }
}
