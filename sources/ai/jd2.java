package ai;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class jd2 implements xc2<hd2> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f5707a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f5708b;

    public jd2(t43 t43Var, Context context) {
        this.f5707a = t43Var;
        this.f5708b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ ai.hd2 a() throws java.lang.Exception {
        /*
            r9 = this;
            android.content.Context r0 = r9.f5708b
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r2 = r0.getNetworkOperator()
            boolean r1 = vh.n.n()
            r3 = 0
            if (r1 == 0) goto L29
            ai.gx<java.lang.Boolean> r1 = ai.ox.f7971d6
            ai.mx r4 = ai.ft.c()
            java.lang.Object r1 = r4.c(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L29
            r4 = r3
            goto L2e
        L29:
            int r1 = r0.getNetworkType()
            r4 = r1
        L2e:
            int r5 = r0.getPhoneType()
            wg.t.d()
            android.content.Context r0 = r9.f5708b
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = yg.d2.e(r0, r1)
            r1 = -1
            if (r0 == 0) goto L68
            android.content.Context r0 = r9.f5708b
            java.lang.String r3 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r3 = r0.getActiveNetworkInfo()
            if (r3 == 0) goto L60
            int r1 = r3.getType()
            android.net.NetworkInfo$DetailedState r3 = r3.getDetailedState()
            int r3 = r3.ordinal()
            r8 = r3
            r3 = r1
            r1 = r8
            goto L61
        L60:
            r3 = r1
        L61:
            boolean r0 = r0.isActiveNetworkMetered()
            r6 = r0
            r7 = r1
            goto L6c
        L68:
            r0 = -2
            r7 = r1
            r6 = r3
            r3 = r0
        L6c:
            ai.hd2 r0 = new ai.hd2
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.jd2.a():ai.hd2");
    }

    @Override // ai.xc2
    public final s43<hd2> zza() {
        return this.f5707a.h(new Callable(this) { // from class: ai.id2

            /* renamed from: a  reason: collision with root package name */
            public final jd2 f5197a;

            {
                this.f5197a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5197a.a();
            }
        });
    }
}
