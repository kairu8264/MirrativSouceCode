package ai;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class g00 extends tg.c {

    /* renamed from: a  reason: collision with root package name */
    public final e00 f4267a;

    /* renamed from: b  reason: collision with root package name */
    public final List<tg.d> f4268b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public String f4269c;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        r4.f4268b.add(new ai.n00(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g00(ai.e00 r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            r4.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.f4268b = r1
            r4.f4267a = r5
            java.lang.String r1 = r5.zzb()     // Catch: android.os.RemoteException -> L15
            r4.f4269c = r1     // Catch: android.os.RemoteException -> L15
            goto L1b
        L15:
            r1 = move-exception
            ai.uj0.d(r0, r1)
            r4.f4269c = r0
        L1b:
            java.util.List r5 = r5.b()     // Catch: android.os.RemoteException -> L58
            java.util.Iterator r5 = r5.iterator()     // Catch: android.os.RemoteException -> L58
        L23:
            boolean r1 = r5.hasNext()     // Catch: android.os.RemoteException -> L58
            if (r1 == 0) goto L57
            java.lang.Object r1 = r5.next()     // Catch: android.os.RemoteException -> L58
            boolean r2 = r1 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L58
            r3 = 0
            if (r2 == 0) goto L4a
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch: android.os.RemoteException -> L58
            if (r1 != 0) goto L37
            goto L4a
        L37:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch: android.os.RemoteException -> L58
            boolean r3 = r2 instanceof ai.m00     // Catch: android.os.RemoteException -> L58
            if (r3 == 0) goto L45
            r3 = r2
            ai.m00 r3 = (ai.m00) r3     // Catch: android.os.RemoteException -> L58
            goto L4a
        L45:
            ai.k00 r3 = new ai.k00     // Catch: android.os.RemoteException -> L58
            r3.<init>(r1)     // Catch: android.os.RemoteException -> L58
        L4a:
            if (r3 == 0) goto L23
            java.util.List<tg.d> r1 = r4.f4268b     // Catch: android.os.RemoteException -> L58
            ai.n00 r2 = new ai.n00     // Catch: android.os.RemoteException -> L58
            r2.<init>(r3)     // Catch: android.os.RemoteException -> L58
            r1.add(r2)     // Catch: android.os.RemoteException -> L58
            goto L23
        L57:
            return
        L58:
            r5 = move-exception
            ai.uj0.d(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.g00.<init>(ai.e00):void");
    }
}
