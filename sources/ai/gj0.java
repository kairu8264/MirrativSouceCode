package ai;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public final class gj0 {

    /* renamed from: g  reason: collision with root package name */
    public final String f4480g;

    /* renamed from: h  reason: collision with root package name */
    public final yg.r1 f4481h;

    /* renamed from: a  reason: collision with root package name */
    public long f4474a = -1;

    /* renamed from: b  reason: collision with root package name */
    public long f4475b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f4476c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f4477d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f4478e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final Object f4479f = new Object();

    /* renamed from: i  reason: collision with root package name */
    public int f4482i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f4483j = 0;

    public gj0(String str, yg.r1 r1Var) {
        this.f4480g = str;
        this.f4481h = r1Var;
    }

    public final void a() {
        synchronized (this.f4479f) {
            this.f4482i++;
        }
    }

    public final void b() {
        synchronized (this.f4479f) {
            this.f4483j++;
        }
    }

    public final void c(as asVar, long j10) {
        synchronized (this.f4479f) {
            long w10 = this.f4481h.w();
            long currentTimeMillis = wg.t.k().currentTimeMillis();
            if (this.f4475b == -1) {
                if (currentTimeMillis - w10 > ((Long) ft.c().c(ox.E0)).longValue()) {
                    this.f4477d = -1;
                } else {
                    this.f4477d = this.f4481h.m();
                }
                this.f4475b = j10;
                this.f4474a = j10;
            } else {
                this.f4474a = j10;
            }
            Bundle bundle = asVar.f1985y;
            if (bundle != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.f4476c++;
            int i10 = this.f4477d + 1;
            this.f4477d = i10;
            if (i10 == 0) {
                this.f4478e = 0L;
                this.f4481h.k(currentTimeMillis);
            } else {
                this.f4478e = currentTimeMillis - this.f4481h.C();
            }
        }
    }

    public final void d() {
        g();
    }

    public final void e() {
        g();
    }

    public final Bundle f(Context context, String str) {
        Bundle bundle;
        synchronized (this.f4479f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f4481h.x() ? "" : this.f4480g);
            bundle.putLong("basets", this.f4475b);
            bundle.putLong("currts", this.f4474a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f4476c);
            bundle.putInt("preqs_in_session", this.f4477d);
            bundle.putLong("time_in_session", this.f4478e);
            bundle.putInt("pclick", this.f4482i);
            bundle.putInt("pimp", this.f4483j);
            Context a10 = we0.a(context);
            int identifier = a10.getResources().getIdentifier("Theme.Translucent", TtmlNode.TAG_STYLE, "android");
            boolean z10 = false;
            if (identifier == 0) {
                uj0.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == a10.getPackageManager().getActivityInfo(new ComponentName(a10.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                        z10 = true;
                    } else {
                        uj0.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    uj0.f("Fail to fetch AdActivity theme");
                    uj0.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z10);
        }
        return bundle;
    }

    public final void g() {
        if (iz.f5450a.e().booleanValue()) {
            synchronized (this.f4479f) {
                this.f4476c--;
                this.f4477d--;
            }
        }
    }
}
