package ai;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class h20 extends tg.h {

    /* renamed from: a  reason: collision with root package name */
    public final g20 f4706a;

    /* renamed from: c  reason: collision with root package name */
    public final n00 f4708c;

    /* renamed from: e  reason: collision with root package name */
    public final tg.c f4710e;

    /* renamed from: b  reason: collision with root package name */
    public final List<tg.d> f4707b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final rg.u f4709d = new rg.u();

    /* renamed from: f  reason: collision with root package name */
    public final List<Object> f4711f = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|2|3|(2:5|(6:8|(4:13|(1:15)(1:22)|(3:17|18|19)(1:21)|20)|23|(0)(0)|20|6))|25|26|(2:28|(5:31|(1:33)(1:40)|(3:35|36|37)(1:39)|38|29))|(2:42|43)|(7:45|46|47|48|(2:50|51)|53|54)|59|46|47|48|(0)|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
        ai.uj0.d("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af A[Catch: RemoteException -> 0x00bc, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00bc, blocks: (B:45:0x00a7, B:47:0x00af), top: B:55:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h20(ai.g20 r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f4707b = r1
            rg.u r1 = new rg.u
            r1.<init>()
            r5.f4709d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f4711f = r1
            r5.f4706a = r6
            r1 = 0
            java.util.List r6 = r6.a()     // Catch: android.os.RemoteException -> L5b
            if (r6 == 0) goto L5f
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L5b
        L27:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L5b
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L5b
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L5b
            if (r3 == 0) goto L4d
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L5b
            if (r2 != 0) goto L3a
            goto L4d
        L3a:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L5b
            boolean r4 = r3 instanceof ai.m00     // Catch: android.os.RemoteException -> L5b
            if (r4 == 0) goto L47
            ai.m00 r3 = (ai.m00) r3     // Catch: android.os.RemoteException -> L5b
            goto L4e
        L47:
            ai.k00 r3 = new ai.k00     // Catch: android.os.RemoteException -> L5b
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L5b
            goto L4e
        L4d:
            r3 = r1
        L4e:
            if (r3 == 0) goto L27
            java.util.List<tg.d> r2 = r5.f4707b     // Catch: android.os.RemoteException -> L5b
            ai.n00 r4 = new ai.n00     // Catch: android.os.RemoteException -> L5b
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L5b
            r2.add(r4)     // Catch: android.os.RemoteException -> L5b
            goto L27
        L5b:
            r6 = move-exception
            ai.uj0.d(r0, r6)
        L5f:
            ai.g20 r6 = r5.f4706a     // Catch: android.os.RemoteException -> L8e
            java.util.List r6 = r6.u()     // Catch: android.os.RemoteException -> L8e
            if (r6 == 0) goto L92
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L8e
        L6b:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L8e
            if (r2 == 0) goto L92
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L8e
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L8e
            if (r3 == 0) goto L80
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L8e
            ai.yu r2 = ai.xu.R5(r2)     // Catch: android.os.RemoteException -> L8e
            goto L81
        L80:
            r2 = r1
        L81:
            if (r2 == 0) goto L6b
            java.util.List<java.lang.Object> r3 = r5.f4711f     // Catch: android.os.RemoteException -> L8e
            ai.zu r4 = new ai.zu     // Catch: android.os.RemoteException -> L8e
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L8e
            r3.add(r4)     // Catch: android.os.RemoteException -> L8e
            goto L6b
        L8e:
            r6 = move-exception
            ai.uj0.d(r0, r6)
        L92:
            ai.g20 r6 = r5.f4706a     // Catch: android.os.RemoteException -> La0
            ai.m00 r6 = r6.e()     // Catch: android.os.RemoteException -> La0
            if (r6 == 0) goto La4
            ai.n00 r2 = new ai.n00     // Catch: android.os.RemoteException -> La0
            r2.<init>(r6)     // Catch: android.os.RemoteException -> La0
            goto La5
        La0:
            r6 = move-exception
            ai.uj0.d(r0, r6)
        La4:
            r2 = r1
        La5:
            r5.f4708c = r2
            ai.g20 r6 = r5.f4706a     // Catch: android.os.RemoteException -> Lbc
            ai.e00 r6 = r6.l()     // Catch: android.os.RemoteException -> Lbc
            if (r6 == 0) goto Lc0
            ai.g00 r6 = new ai.g00     // Catch: android.os.RemoteException -> Lbc
            ai.g20 r2 = r5.f4706a     // Catch: android.os.RemoteException -> Lbc
            ai.e00 r2 = r2.l()     // Catch: android.os.RemoteException -> Lbc
            r6.<init>(r2)     // Catch: android.os.RemoteException -> Lbc
            r1 = r6
            goto Lc0
        Lbc:
            r6 = move-exception
            ai.uj0.d(r0, r6)
        Lc0:
            r5.f4710e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.h20.<init>(ai.g20):void");
    }

    @Override // tg.h
    public final String a() {
        try {
            return this.f4706a.g();
        } catch (RemoteException e10) {
            uj0.d("", e10);
            return null;
        }
    }

    @Override // tg.h
    public final String b() {
        try {
            return this.f4706a.f();
        } catch (RemoteException e10) {
            uj0.d("", e10);
            return null;
        }
    }

    @Override // tg.h
    public final String c() {
        try {
            return this.f4706a.h();
        } catch (RemoteException e10) {
            uj0.d("", e10);
            return null;
        }
    }

    @Override // tg.h
    public final String d() {
        try {
            return this.f4706a.c();
        } catch (RemoteException e10) {
            uj0.d("", e10);
            return null;
        }
    }

    @Override // tg.h
    public final tg.d e() {
        return this.f4708c;
    }

    @Override // tg.h
    public final List<tg.d> f() {
        return this.f4707b;
    }

    @Override // tg.h
    public final String g() {
        try {
            return this.f4706a.k();
        } catch (RemoteException e10) {
            uj0.d("", e10);
            return null;
        }
    }

    @Override // tg.h
    public final Double h() {
        try {
            double i10 = this.f4706a.i();
            if (i10 == -1.0d) {
                return null;
            }
            return Double.valueOf(i10);
        } catch (RemoteException e10) {
            uj0.d("", e10);
            return null;
        }
    }

    @Override // tg.h
    public final String i() {
        try {
            return this.f4706a.j();
        } catch (RemoteException e10) {
            uj0.d("", e10);
            return null;
        }
    }

    @Override // tg.h
    public final rg.u j() {
        try {
            if (this.f4706a.n() != null) {
                this.f4709d.b(this.f4706a.n());
            }
        } catch (RemoteException e10) {
            uj0.d("Exception occurred while getting video controller", e10);
        }
        return this.f4709d;
    }

    @Override // tg.h
    public final Object k() {
        try {
            yh.a C = this.f4706a.C();
            if (C != null) {
                return yh.b.z0(C);
            }
            return null;
        } catch (RemoteException e10) {
            uj0.d("", e10);
            return null;
        }
    }
}
