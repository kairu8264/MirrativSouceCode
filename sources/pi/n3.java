package pi;

import android.util.Log;

/* loaded from: classes3.dex */
public final class n3 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ q3 B;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f48061w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f48062x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f48063y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f48064z;

    public n3(q3 q3Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.B = q3Var;
        this.f48061w = i10;
        this.f48062x = str;
        this.f48063y = obj;
        this.f48064z = obj2;
        this.A = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        long j10;
        char c11;
        long j11;
        g4 E = this.B.f48285a.E();
        if (E.l()) {
            c10 = this.B.f48155c;
            if (c10 == 0) {
                if (this.B.f48285a.y().H()) {
                    q3 q3Var = this.B;
                    q3Var.f48285a.b();
                    q3Var.f48155c = 'C';
                } else {
                    q3 q3Var2 = this.B;
                    q3Var2.f48285a.b();
                    q3Var2.f48155c = 'c';
                }
            }
            j10 = this.B.f48156d;
            if (j10 < 0) {
                q3 q3Var3 = this.B;
                q3Var3.f48285a.y().o();
                q3Var3.f48156d = 46000L;
            }
            char charAt = "01VDIWEA?".charAt(this.f48061w);
            c11 = this.B.f48155c;
            j11 = this.B.f48156d;
            String z10 = q3.z(true, this.f48062x, this.f48063y, this.f48064z, this.A);
            StringBuilder sb2 = new StringBuilder(z10.length() + 24);
            sb2.append("2");
            sb2.append(charAt);
            sb2.append(c11);
            sb2.append(j11);
            sb2.append(":");
            sb2.append(z10);
            String sb3 = sb2.toString();
            if (sb3.length() > 1024) {
                sb3 = this.f48062x.substring(0, 1024);
            }
            d4 d4Var = E.f47824d;
            if (d4Var != null) {
                d4Var.b(sb3, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.B.B(), "Persisted config not initialized. Not logging error/warn");
    }
}
