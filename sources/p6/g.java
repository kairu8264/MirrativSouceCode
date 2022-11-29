package p6;

import android.content.Context;
import com.dena.mirrativ.mirrativapi.BuildConfig;
import p6.l;

/* loaded from: classes.dex */
public class g {
    public String A;
    public String B;
    public String C;
    public boolean D;
    public Boolean E;
    public String F;
    public String G;

    /* renamed from: a  reason: collision with root package name */
    public String f45926a;

    /* renamed from: b  reason: collision with root package name */
    public String f45927b;

    /* renamed from: c  reason: collision with root package name */
    public String f45928c;

    /* renamed from: d  reason: collision with root package name */
    public Context f45929d;

    /* renamed from: e  reason: collision with root package name */
    public String f45930e;

    /* renamed from: f  reason: collision with root package name */
    public String f45931f;

    /* renamed from: g  reason: collision with root package name */
    public String f45932g;

    /* renamed from: h  reason: collision with root package name */
    public String f45933h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f45934i;

    /* renamed from: j  reason: collision with root package name */
    public String f45935j;

    /* renamed from: k  reason: collision with root package name */
    public j0 f45936k;

    /* renamed from: l  reason: collision with root package name */
    public Boolean f45937l;

    /* renamed from: m  reason: collision with root package name */
    public Class f45938m;

    /* renamed from: n  reason: collision with root package name */
    public m0 f45939n;

    /* renamed from: o  reason: collision with root package name */
    public l0 f45940o;

    /* renamed from: p  reason: collision with root package name */
    public o0 f45941p;

    /* renamed from: q  reason: collision with root package name */
    public n0 f45942q;

    /* renamed from: r  reason: collision with root package name */
    public k0 f45943r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f45944s;

    /* renamed from: t  reason: collision with root package name */
    public Double f45945t;

    /* renamed from: u  reason: collision with root package name */
    public l.b f45946u;

    /* renamed from: v  reason: collision with root package name */
    public z f45947v;

    /* renamed from: w  reason: collision with root package name */
    public String f45948w;

    /* renamed from: x  reason: collision with root package name */
    public String f45949x;

    /* renamed from: y  reason: collision with root package name */
    public Boolean f45950y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f45951z;

    public g(Context context, String str, String str2) {
        d(context, str, str2, false);
    }

    public final boolean a(String str) {
        if (str == null) {
            this.f45947v.c("Missing App Token", new Object[0]);
            return false;
        } else if (str.length() != 12) {
            this.f45947v.c("Malformed App Token '%s'", str);
            return false;
        } else {
            return true;
        }
    }

    public final boolean b(Context context) {
        if (context == null) {
            this.f45947v.c("Missing context", new Object[0]);
            return false;
        } else if (c1.a(context, "android.permission.INTERNET")) {
            return true;
        } else {
            this.f45947v.c("Missing permission: INTERNET", new Object[0]);
            return false;
        }
    }

    public final boolean c(String str) {
        if (str == null) {
            this.f45947v.c("Missing environment", new Object[0]);
            return false;
        } else if (str.equals("sandbox")) {
            this.f45947v.f("SANDBOX: Adjust is running in Sandbox mode. Use this setting for testing. Don't forget to set the environment to `production` before publishing!", new Object[0]);
            return true;
        } else if (str.equals(BuildConfig.FLAVOR)) {
            this.f45947v.f("PRODUCTION: Adjust is running in Production mode. Use this setting only for the build that you want to publish. Set the environment to `sandbox` if you want to test your app!", new Object[0]);
            return true;
        } else {
            this.f45947v.c("Unknown environment '%s'", str);
            return false;
        }
    }

    public final void d(Context context, String str, String str2, boolean z10) {
        this.f45947v = k.h();
        if (z10 && BuildConfig.FLAVOR.equals(str2)) {
            h(g0.SUPRESS, str2);
        } else {
            h(g0.INFO, str2);
        }
        if (context != null) {
            context = context.getApplicationContext();
        }
        this.f45929d = context;
        this.f45930e = str;
        this.f45931f = str2;
        this.f45934i = false;
        this.f45944s = false;
        this.D = false;
    }

    public boolean e() {
        return a(this.f45930e) && c(this.f45931f) && b(this.f45929d);
    }

    public void f(long j10, long j11, long j12, long j13, long j14) {
        this.A = c1.k("%d", Long.valueOf(j10));
        this.B = c1.k("%d%d%d%d", Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(j14));
    }

    public void g(g0 g0Var) {
        h(g0Var, this.f45931f);
    }

    public final void h(g0 g0Var, String str) {
        this.f45947v.a(g0Var, BuildConfig.FLAVOR.equals(str));
    }

    public void i(j0 j0Var) {
        this.f45936k = j0Var;
    }
}
