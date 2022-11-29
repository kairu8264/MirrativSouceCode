package yg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class c2 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d2 f61861a;

    public /* synthetic */ c2(d2 d2Var, b2 b2Var) {
        this.f61861a = d2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            d2.I(this.f61861a, true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            d2.I(this.f61861a, false);
        }
    }
}
