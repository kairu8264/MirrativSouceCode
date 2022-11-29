package ai;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class pu2 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8688a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f8689b;

    /* renamed from: c  reason: collision with root package name */
    public final vt2 f8690c;

    /* renamed from: d  reason: collision with root package name */
    public final xt2 f8691d;

    /* renamed from: e  reason: collision with root package name */
    public final ou2 f8692e;

    /* renamed from: f  reason: collision with root package name */
    public final ou2 f8693f;

    /* renamed from: g  reason: collision with root package name */
    public vi.g<s64> f8694g;

    /* renamed from: h  reason: collision with root package name */
    public vi.g<s64> f8695h;

    public pu2(Context context, Executor executor, vt2 vt2Var, xt2 xt2Var, lu2 lu2Var, mu2 mu2Var) {
        this.f8688a = context;
        this.f8689b = executor;
        this.f8690c = vt2Var;
        this.f8691d = xt2Var;
        this.f8692e = lu2Var;
        this.f8693f = mu2Var;
    }

    public static pu2 a(Context context, Executor executor, vt2 vt2Var, xt2 xt2Var) {
        final pu2 pu2Var = new pu2(context, executor, vt2Var, xt2Var, new lu2(), new mu2());
        if (pu2Var.f8691d.b()) {
            pu2Var.f8694g = pu2Var.g(new Callable(pu2Var) { // from class: ai.iu2

                /* renamed from: a  reason: collision with root package name */
                public final pu2 f5418a;

                {
                    this.f5418a = pu2Var;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f5418a.f();
                }
            });
        } else {
            pu2Var.f8694g = vi.j.e(pu2Var.f8692e.zza());
        }
        pu2Var.f8695h = pu2Var.g(new Callable(pu2Var) { // from class: ai.ju2

            /* renamed from: a  reason: collision with root package name */
            public final pu2 f5929a;

            {
                this.f5929a = pu2Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5929a.e();
            }
        });
        return pu2Var;
    }

    public static s64 h(vi.g<s64> gVar, s64 s64Var) {
        return !gVar.s() ? s64Var : gVar.o();
    }

    public final s64 b() {
        return h(this.f8694g, this.f8692e.zza());
    }

    public final s64 c() {
        return h(this.f8695h, this.f8693f.zza());
    }

    public final /* synthetic */ void d(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f8690c.c(2025, -1L, exc);
    }

    public final /* synthetic */ s64 e() throws Exception {
        Context context = this.f8688a;
        return du2.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ s64 f() throws Exception {
        Context context = this.f8688a;
        c64 y02 = s64.y0();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id2 = advertisingIdInfo.getId();
        if (id2 != null && id2.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id2);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id2 = Base64.encodeToString(bArr, 11);
        }
        if (id2 != null) {
            y02.J(id2);
            y02.K(advertisingIdInfo.isLimitAdTrackingEnabled());
            y02.X(6);
        }
        return y02.n();
    }

    public final vi.g<s64> g(Callable<s64> callable) {
        return vi.j.c(this.f8689b, callable).e(this.f8689b, new vi.d(this) { // from class: ai.ku2

            /* renamed from: a  reason: collision with root package name */
            public final pu2 f6363a;

            {
                this.f6363a = this;
            }

            @Override // vi.d
            public final void a(Exception exc) {
                this.f6363a.d(exc);
            }
        });
    }
}
