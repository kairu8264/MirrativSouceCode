package rh;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import rh.c;

/* loaded from: classes3.dex */
public final class a1 extends fi.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f51397a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c cVar, Looper looper) {
        super(looper);
        this.f51397a = cVar;
    }

    public static final void a(Message message) {
        b1 b1Var = (b1) message.obj;
        b1Var.b();
        b1Var.e();
    }

    public static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c.a aVar;
        c.a aVar2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        boolean z10;
        if (this.f51397a.Y.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 != 1 && i10 != 7 && ((i10 != 4 || this.f51397a.r()) && message.what != 5)) || this.f51397a.b()) {
            int i11 = message.what;
            if (i11 == 4) {
                this.f51397a.V = new ConnectionResult(message.arg2);
                if (c.f0(this.f51397a)) {
                    c cVar = this.f51397a;
                    z10 = cVar.W;
                    if (!z10) {
                        cVar.g0(3, null);
                        return;
                    }
                }
                c cVar2 = this.f51397a;
                connectionResult2 = cVar2.V;
                ConnectionResult connectionResult3 = connectionResult2 != null ? cVar2.V : new ConnectionResult(8);
                this.f51397a.L.a(connectionResult3);
                this.f51397a.J(connectionResult3);
                return;
            } else if (i11 == 5) {
                c cVar3 = this.f51397a;
                connectionResult = cVar3.V;
                ConnectionResult connectionResult4 = connectionResult != null ? cVar3.V : new ConnectionResult(8);
                this.f51397a.L.a(connectionResult4);
                this.f51397a.J(connectionResult4);
                return;
            } else if (i11 == 3) {
                Object obj = message.obj;
                ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
                this.f51397a.L.a(connectionResult5);
                this.f51397a.J(connectionResult5);
                return;
            } else if (i11 == 6) {
                this.f51397a.g0(5, null);
                c cVar4 = this.f51397a;
                aVar = cVar4.Q;
                if (aVar != null) {
                    aVar2 = cVar4.Q;
                    aVar2.s0(message.arg2);
                }
                this.f51397a.K(message.arg2);
                c.e0(this.f51397a, 5, 1, null);
                return;
            } else if (i11 == 2 && !this.f51397a.isConnected()) {
                a(message);
                return;
            } else if (b(message)) {
                ((b1) message.obj).c();
                return;
            } else {
                int i12 = message.what;
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i12);
                Log.wtf("GmsClient", sb2.toString(), new Exception());
                return;
            }
        }
        a(message);
    }
}
