package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class fm0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4116a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4117b;

    /* renamed from: c  reason: collision with root package name */
    public final zj0 f4118c;

    /* renamed from: d  reason: collision with root package name */
    public final ay f4119d;

    /* renamed from: e  reason: collision with root package name */
    public final ey f4120e;

    /* renamed from: f  reason: collision with root package name */
    public final yg.j0 f4121f;

    /* renamed from: g  reason: collision with root package name */
    public final long[] f4122g;

    /* renamed from: h  reason: collision with root package name */
    public final String[] f4123h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4124i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4125j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4126k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4127l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4128m;

    /* renamed from: n  reason: collision with root package name */
    public kl0 f4129n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4130o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4131p;

    /* renamed from: q  reason: collision with root package name */
    public long f4132q;

    public fm0(Context context, zj0 zj0Var, String str, ey eyVar, ay ayVar) {
        yg.h0 h0Var = new yg.h0();
        h0Var.d("min_1", Double.MIN_VALUE, 1.0d);
        h0Var.d("1_5", 1.0d, 5.0d);
        h0Var.d("5_10", 5.0d, 10.0d);
        h0Var.d("10_20", 10.0d, 20.0d);
        h0Var.d("20_30", 20.0d, 30.0d);
        h0Var.d("30_max", 30.0d, Double.MAX_VALUE);
        this.f4121f = h0Var.e();
        this.f4124i = false;
        this.f4125j = false;
        this.f4126k = false;
        this.f4127l = false;
        this.f4132q = -1L;
        this.f4116a = context;
        this.f4118c = zj0Var;
        this.f4117b = str;
        this.f4120e = eyVar;
        this.f4119d = ayVar;
        String str2 = (String) ft.c().c(ox.f8108v);
        if (str2 == null) {
            this.f4123h = new String[0];
            this.f4122g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f4123h = new String[length];
        this.f4122g = new long[length];
        for (int i10 = 0; i10 < split.length; i10++) {
            try {
                this.f4122g[i10] = Long.parseLong(split[i10]);
            } catch (NumberFormatException e10) {
                uj0.g("Unable to parse frame hash target time number.", e10);
                this.f4122g[i10] = -1;
            }
        }
    }

    public final void a(kl0 kl0Var) {
        vx.a(this.f4120e, this.f4119d, "vpc2");
        this.f4124i = true;
        this.f4120e.d("vpn", kl0Var.h());
        this.f4129n = kl0Var;
    }

    public final void b() {
        if (!this.f4124i || this.f4125j) {
            return;
        }
        vx.a(this.f4120e, this.f4119d, "vfr2");
        this.f4125j = true;
    }

    public final void c() {
        if (!qz.f9240a.e().booleanValue() || this.f4130o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f4117b);
        bundle.putString("player", this.f4129n.h());
        for (yg.g0 g0Var : this.f4121f.b()) {
            String valueOf = String.valueOf(g0Var.f61885a);
            bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(g0Var.f61889e));
            String valueOf2 = String.valueOf(g0Var.f61885a);
            bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(g0Var.f61888d));
        }
        int i10 = 0;
        while (true) {
            long[] jArr = this.f4122g;
            if (i10 < jArr.length) {
                String str = this.f4123h[i10];
                if (str != null) {
                    bundle.putString("fh_".concat(Long.valueOf(jArr[i10]).toString()), str);
                }
                i10++;
            } else {
                wg.t.d().U(this.f4116a, this.f4118c.f13013w, "gmob-apps", bundle, true);
                this.f4130o = true;
                return;
            }
        }
    }

    public final void d(kl0 kl0Var) {
        if (this.f4126k && !this.f4127l) {
            if (yg.p1.m() && !this.f4127l) {
                yg.p1.k("VideoMetricsMixin first frame");
            }
            vx.a(this.f4120e, this.f4119d, "vff2");
            this.f4127l = true;
        }
        long a10 = wg.t.k().a();
        if (this.f4128m && this.f4131p && this.f4132q != -1) {
            this.f4121f.a(TimeUnit.SECONDS.toNanos(1L) / (a10 - this.f4132q));
        }
        this.f4131p = this.f4128m;
        this.f4132q = a10;
        long longValue = ((Long) ft.c().c(ox.f8116w)).longValue();
        long p10 = kl0Var.p();
        int i10 = 0;
        while (true) {
            String[] strArr = this.f4123h;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && longValue > Math.abs(p10 - this.f4122g[i10])) {
                String[] strArr2 = this.f4123h;
                int i11 = 8;
                Bitmap bitmap = kl0Var.getBitmap(8, 8);
                long j10 = 63;
                int i12 = 0;
                long j11 = 0;
                while (i12 < i11) {
                    int i13 = 0;
                    while (i13 < i11) {
                        int pixel = bitmap.getPixel(i13, i12);
                        j11 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j10);
                        i13++;
                        j10--;
                        i11 = 8;
                    }
                    i12++;
                    i11 = 8;
                }
                strArr2[i10] = String.format("%016X", Long.valueOf(j11));
                return;
            }
            i10++;
        }
    }

    public final void e() {
        this.f4128m = true;
        if (!this.f4125j || this.f4126k) {
            return;
        }
        vx.a(this.f4120e, this.f4119d, "vfp2");
        this.f4126k = true;
    }

    public final void f() {
        this.f4128m = false;
    }
}
