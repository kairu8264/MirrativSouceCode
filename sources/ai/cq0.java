package ai;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzcmw;

/* loaded from: classes3.dex */
public final class cq0 {
    /* JADX WARN: Type inference failed for: r0v2, types: [ai.rp0, java.lang.Object] */
    public static final rp0 a(final Context context, final ir0 ir0Var, final String str, final boolean z10, final boolean z11, final u uVar, final oy oyVar, final zj0 zj0Var, ey eyVar, final wg.l lVar, final wg.a aVar, final qn qnVar, final fl2 fl2Var, final kl2 kl2Var) throws zzcmw {
        ox.a(context);
        try {
            yx2 yx2Var = new yx2(context, ir0Var, str, z10, z11, uVar, oyVar, zj0Var, null, lVar, aVar, qnVar, fl2Var, kl2Var) { // from class: ai.aq0
                public final boolean A;
                public final u B;
                public final oy C;
                public final zj0 D;
                public final wg.l E;
                public final wg.a F;
                public final qn G;
                public final fl2 H;
                public final kl2 I;

                /* renamed from: w  reason: collision with root package name */
                public final Context f1970w;

                /* renamed from: x  reason: collision with root package name */
                public final ir0 f1971x;

                /* renamed from: y  reason: collision with root package name */
                public final String f1972y;

                /* renamed from: z  reason: collision with root package name */
                public final boolean f1973z;

                {
                    this.f1970w = context;
                    this.f1971x = ir0Var;
                    this.f1972y = str;
                    this.f1973z = z10;
                    this.A = z11;
                    this.B = uVar;
                    this.C = oyVar;
                    this.D = zj0Var;
                    this.E = lVar;
                    this.F = aVar;
                    this.G = qnVar;
                    this.H = fl2Var;
                    this.I = kl2Var;
                }

                @Override // ai.yx2
                public final Object zza() {
                    Context context2 = this.f1970w;
                    ir0 ir0Var2 = this.f1971x;
                    String str2 = this.f1972y;
                    boolean z12 = this.f1973z;
                    boolean z13 = this.A;
                    u uVar2 = this.B;
                    oy oyVar2 = this.C;
                    zj0 zj0Var2 = this.D;
                    wg.l lVar2 = this.E;
                    wg.a aVar2 = this.F;
                    qn qnVar2 = this.G;
                    fl2 fl2Var2 = this.H;
                    kl2 kl2Var2 = this.I;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = kq0.f6309w0;
                        gq0 gq0Var = new gq0(new kq0(new hr0(context2), ir0Var2, str2, z12, z13, uVar2, oyVar2, zj0Var2, null, lVar2, aVar2, qnVar2, fl2Var2, kl2Var2));
                        gq0Var.setWebViewClient(wg.t.f().l(gq0Var, qnVar2, z13));
                        gq0Var.setWebChromeClient(new qp0(gq0Var));
                        return gq0Var;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ?? zza = yx2Var.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th2) {
            throw new zzcmw("Webview initialization failed.", th2);
        }
    }

    public static final s43<rp0> b(final Context context, final zj0 zj0Var, final String str, final u uVar, final wg.a aVar) {
        return j43.e(new o33(context, uVar, zj0Var, aVar, str) { // from class: ai.zp0

            /* renamed from: a  reason: collision with root package name */
            public final Context f13062a;

            /* renamed from: b  reason: collision with root package name */
            public final u f13063b;

            /* renamed from: c  reason: collision with root package name */
            public final zj0 f13064c;

            /* renamed from: d  reason: collision with root package name */
            public final wg.a f13065d;

            /* renamed from: e  reason: collision with root package name */
            public final String f13066e;

            {
                this.f13062a = context;
                this.f13063b = uVar;
                this.f13064c = zj0Var;
                this.f13065d = aVar;
                this.f13066e = str;
            }

            @Override // ai.o33
            public final s43 zza() {
                Context context2 = this.f13062a;
                u uVar2 = this.f13063b;
                zj0 zj0Var2 = this.f13064c;
                wg.a aVar2 = this.f13065d;
                String str2 = this.f13066e;
                wg.t.e();
                rp0 a10 = cq0.a(context2, ir0.b(), "", false, false, uVar2, null, zj0Var2, null, null, aVar2, qn.a(), null, null);
                lk0 f10 = lk0.f(a10);
                a10.i0().b1(new dr0(f10) { // from class: ai.bq0

                    /* renamed from: w  reason: collision with root package name */
                    public final lk0 f2439w;

                    {
                        this.f2439w = f10;
                    }

                    @Override // ai.dr0
                    public final void b(boolean z10) {
                        this.f2439w.g();
                    }
                });
                a10.loadUrl(str2);
                return f10;
            }
        }, hk0.f4882e);
    }
}
