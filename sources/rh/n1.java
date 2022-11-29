package rh;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class n1 implements Handler.Callback {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ o1 f51485w;

    public /* synthetic */ n1(o1 o1Var, m1 m1Var) {
        this.f51485w = o1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i10 = message.what;
        if (i10 == 0) {
            hashMap = this.f51485w.f51487f;
            synchronized (hashMap) {
                k1 k1Var = (k1) message.obj;
                hashMap2 = this.f51485w.f51487f;
                l1 l1Var = (l1) hashMap2.get(k1Var);
                if (l1Var != null && l1Var.i()) {
                    if (l1Var.j()) {
                        l1Var.g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f51485w.f51487f;
                    hashMap3.remove(k1Var);
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            hashMap4 = this.f51485w.f51487f;
            synchronized (hashMap4) {
                k1 k1Var2 = (k1) message.obj;
                hashMap5 = this.f51485w.f51487f;
                l1 l1Var2 = (l1) hashMap5.get(k1Var2);
                if (l1Var2 != null && l1Var2.a() == 3) {
                    String valueOf = String.valueOf(k1Var2);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(valueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName b10 = l1Var2.b();
                    if (b10 == null) {
                        b10 = k1Var2.b();
                    }
                    if (b10 == null) {
                        String d10 = k1Var2.d();
                        p.i(d10);
                        b10 = new ComponentName(d10, "unknown");
                    }
                    l1Var2.onServiceDisconnected(b10);
                }
            }
            return true;
        }
    }
}
