package ai;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class n00 extends tg.d {

    /* renamed from: a  reason: collision with root package name */
    public final m00 f7127a;

    /* renamed from: b  reason: collision with root package name */
    public final Drawable f7128b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f7129c;

    /* renamed from: d  reason: collision with root package name */
    public final double f7130d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7131e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7132f;

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|2|3|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        ai.uj0.d("", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        ai.uj0.d("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
        ai.uj0.d("", r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
        ai.uj0.d("", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n00(ai.m00 r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            r3.<init>()
            r3.f7127a = r4
            r1 = 0
            yh.a r4 = r4.zzb()     // Catch: android.os.RemoteException -> L15
            if (r4 == 0) goto L19
            java.lang.Object r4 = yh.b.z0(r4)     // Catch: android.os.RemoteException -> L15
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4     // Catch: android.os.RemoteException -> L15
            goto L1a
        L15:
            r4 = move-exception
            ai.uj0.d(r0, r4)
        L19:
            r4 = r1
        L1a:
            r3.f7128b = r4
            ai.m00 r4 = r3.f7127a     // Catch: android.os.RemoteException -> L23
            android.net.Uri r1 = r4.b()     // Catch: android.os.RemoteException -> L23
            goto L27
        L23:
            r4 = move-exception
            ai.uj0.d(r0, r4)
        L27:
            r3.f7129c = r1
            ai.m00 r4 = r3.f7127a     // Catch: android.os.RemoteException -> L30
            double r1 = r4.d()     // Catch: android.os.RemoteException -> L30
            goto L36
        L30:
            r4 = move-exception
            ai.uj0.d(r0, r4)
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L36:
            r3.f7130d = r1
            r4 = -1
            ai.m00 r1 = r3.f7127a     // Catch: android.os.RemoteException -> L40
            int r1 = r1.c()     // Catch: android.os.RemoteException -> L40
            goto L45
        L40:
            r1 = move-exception
            ai.uj0.d(r0, r1)
            r1 = r4
        L45:
            r3.f7131e = r1
            ai.m00 r1 = r3.f7127a     // Catch: android.os.RemoteException -> L4e
            int r4 = r1.a()     // Catch: android.os.RemoteException -> L4e
            goto L52
        L4e:
            r1 = move-exception
            ai.uj0.d(r0, r1)
        L52:
            r3.f7132f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.n00.<init>(ai.m00):void");
    }

    @Override // tg.d
    public final Drawable a() {
        return this.f7128b;
    }

    @Override // tg.d
    public final double b() {
        return this.f7130d;
    }

    @Override // tg.d
    public final Uri c() {
        return this.f7129c;
    }

    @Override // tg.d
    public final int d() {
        return this.f7131e;
    }

    @Override // tg.d
    public final int e() {
        return this.f7132f;
    }
}
