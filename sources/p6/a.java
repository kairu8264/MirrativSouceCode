package p6;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Process;
import androidx.appcompat.widget.ActivityChooserModel;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes.dex */
public class a implements p6.x {

    /* renamed from: q  reason: collision with root package name */
    public static long f45800q;

    /* renamed from: r  reason: collision with root package name */
    public static long f45801r;

    /* renamed from: s  reason: collision with root package name */
    public static long f45802s;

    /* renamed from: t  reason: collision with root package name */
    public static long f45803t;

    /* renamed from: u  reason: collision with root package name */
    public static long f45804u;

    /* renamed from: a  reason: collision with root package name */
    public r6.f f45805a;

    /* renamed from: b  reason: collision with root package name */
    public p6.a0 f45806b;

    /* renamed from: c  reason: collision with root package name */
    public p6.d f45807c;

    /* renamed from: d  reason: collision with root package name */
    public p6.z f45808d;

    /* renamed from: e  reason: collision with root package name */
    public r6.i f45809e;

    /* renamed from: f  reason: collision with root package name */
    public r6.j f45810f;

    /* renamed from: g  reason: collision with root package name */
    public r6.j f45811g;

    /* renamed from: h  reason: collision with root package name */
    public h0 f45812h;

    /* renamed from: i  reason: collision with root package name */
    public p6.u f45813i;

    /* renamed from: j  reason: collision with root package name */
    public p6.g f45814j;

    /* renamed from: k  reason: collision with root package name */
    public p6.f f45815k;

    /* renamed from: l  reason: collision with root package name */
    public p6.y f45816l;

    /* renamed from: m  reason: collision with root package name */
    public p6.c0 f45817m;

    /* renamed from: n  reason: collision with root package name */
    public y0 f45818n;

    /* renamed from: o  reason: collision with root package name */
    public p6.d0 f45819o;

    /* renamed from: p  reason: collision with root package name */
    public p6.e0 f45820p;

    /* renamed from: p6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0701a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ t0 f45821w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f45822x;

        public RunnableC0701a(t0 t0Var, String str) {
            this.f45821w = t0Var;
            this.f45822x = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.R0(this.f45821w, this.f45822x);
        }
    }

    /* loaded from: classes.dex */
    public class a0 implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ z0 f45824w;

        public a0(z0 z0Var) {
            this.f45824w = z0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f45814j == null || a.this.f45814j.f45942q == null) {
                return;
            }
            a.this.f45814j.f45942q.a(this.f45824w.b());
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p6.v f45826w;

        public b(p6.v vVar) {
            this.f45826w = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.w0(this.f45826w);
        }
    }

    /* loaded from: classes.dex */
    public class b0 implements Runnable {
        public b0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f45814j == null || a.this.f45814j.f45936k == null) {
                return;
            }
            a.this.f45814j.f45936k.a(a.this.f45815k);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0 f45829w;

        public c(x0 x0Var) {
            this.f45829w = x0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.x0(this.f45829w);
        }
    }

    /* loaded from: classes.dex */
    public class c0 implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Uri f45831w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Intent f45832x;

        public c0(Uri uri, Intent intent) {
            this.f45831w = uri;
            this.f45832x = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f45814j == null) {
                return;
            }
            if (a.this.f45814j.f45943r != null ? a.this.f45814j.f45943r.a(this.f45831w) : true) {
                a.this.u0(this.f45832x, this.f45831w);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ z0 f45834w;

        public d(z0 z0Var) {
            this.f45834w = z0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.z0(this.f45834w);
        }
    }

    /* loaded from: classes.dex */
    public class d0 implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p6.h f45836w;

        public d0(p6.h hVar) {
            this.f45836w = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f45812h.a()) {
                a.this.f45808d.b("Event tracked before first activity resumed.\nIf it was triggered in the Application class, it might timestamp or even send an install long before the user opens the app.\nPlease check https://github.com/adjust/android_sdk#can-i-trigger-an-event-at-application-launch for more information.", new Object[0]);
                a.this.c1();
            }
            a.this.h1(this.f45836w);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p6.s f45838w;

        public e(p6.s sVar) {
            this.f45838w = sVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.t0(this.f45838w);
        }
    }

    /* loaded from: classes.dex */
    public class e0 implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Uri f45840w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f45841x;

        public e0(Uri uri, long j10) {
            this.f45840w = uri;
            this.f45841x = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.K0(this.f45840w, this.f45841x);
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.P0();
        }
    }

    /* loaded from: classes.dex */
    public class f0 implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f45844w;

        public f0(boolean z10) {
            this.f45844w = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.V0(this.f45844w);
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.o0();
        }
    }

    /* loaded from: classes.dex */
    public class g0 implements Runnable {
        public g0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.U0();
        }
    }

    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f45848w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f45849x;

        public h(boolean z10, String str) {
            this.f45848w = z10;
            this.f45849x = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f45848w) {
                new a1(a.this.getContext()).x(this.f45849x);
            }
            if (a.this.f45812h.a()) {
                return;
            }
            a.this.Y0(this.f45849x);
        }
    }

    /* loaded from: classes.dex */
    public class h0 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f45851a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f45852b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f45853c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f45854d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f45855e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f45856f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f45857g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f45858h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f45859i;

        public h0() {
        }

        public boolean a() {
            return !this.f45858h;
        }

        public boolean b() {
            return this.f45858h;
        }

        public boolean c() {
            return this.f45859i;
        }

        public boolean d() {
            return !this.f45857g;
        }

        public boolean e() {
            return this.f45851a;
        }

        public boolean f() {
            return this.f45856f;
        }

        public boolean g() {
            return this.f45853c;
        }

        public boolean h() {
            return this.f45854d;
        }

        public boolean i() {
            return !this.f45853c;
        }

        public boolean j() {
            return !this.f45854d;
        }

        public boolean k() {
            return this.f45852b;
        }

        public boolean l() {
            return this.f45855e;
        }
    }

    /* loaded from: classes.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.k0();
        }
    }

    /* loaded from: classes.dex */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f0();
        }
    }

    /* loaded from: classes.dex */
    public class k implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p6.p f45863w;

        public k(p6.p pVar) {
            this.f45863w = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.m1(this.f45863w);
        }
    }

    /* loaded from: classes.dex */
    public class l implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f45865w;

        public l(boolean z10) {
            this.f45865w = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.j1(this.f45865w);
        }
    }

    /* loaded from: classes.dex */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.d0();
            a.this.d1();
            a.this.b1();
            a.this.f45808d.g("Subsession start", new Object[0]);
            a.this.c1();
        }
    }

    /* loaded from: classes.dex */
    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.m0();
        }
    }

    /* loaded from: classes.dex */
    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.i0();
        }
    }

    /* loaded from: classes.dex */
    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.T();
        }
    }

    /* loaded from: classes.dex */
    public class q implements p6.b0 {
        public q() {
        }

        @Override // p6.b0
        public void a(a aVar) {
            aVar.W0(a.this.f45814j.f45950y.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public class r implements Runnable {
        public r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.h0();
        }
    }

    /* loaded from: classes.dex */
    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.S();
        }
    }

    /* loaded from: classes.dex */
    public class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.O0();
        }
    }

    /* loaded from: classes.dex */
    public class u implements p6.f0 {
        public u() {
        }

        @Override // p6.f0
        public void a(t0 t0Var, String str) {
            a.this.Q0(t0Var, str);
        }
    }

    /* loaded from: classes.dex */
    public class v implements p6.f0 {
        public v() {
        }

        @Override // p6.f0
        public void a(t0 t0Var, String str) {
            a.this.Q0(t0Var, str);
        }
    }

    /* loaded from: classes.dex */
    public class w implements Runnable {
        public w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.e1();
            a.this.Z0();
            a.this.f45808d.g("Subsession end", new Object[0]);
            a.this.g0();
        }
    }

    /* loaded from: classes.dex */
    public class x implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p6.v f45878w;

        public x(p6.v vVar) {
            this.f45878w = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f45814j == null || a.this.f45814j.f45939n == null) {
                return;
            }
            a.this.f45814j.f45939n.a(this.f45878w.c());
        }
    }

    /* loaded from: classes.dex */
    public class y implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p6.v f45880w;

        public y(p6.v vVar) {
            this.f45880w = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f45814j == null || a.this.f45814j.f45940o == null) {
                return;
            }
            a.this.f45814j.f45940o.a(this.f45880w.b());
        }
    }

    /* loaded from: classes.dex */
    public class z implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ z0 f45882w;

        public z(z0 z0Var) {
            this.f45882w = z0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f45814j == null || a.this.f45814j.f45941p == null) {
                return;
            }
            a.this.f45814j.f45941p.a(this.f45882w.c());
        }
    }

    public a(p6.g gVar) {
        k(gVar);
        p6.z h10 = p6.k.h();
        this.f45808d = h10;
        h10.e();
        this.f45805a = new r6.d("ActivityHandler");
        h0 h0Var = new h0();
        this.f45812h = h0Var;
        Boolean bool = gVar.f45950y;
        h0Var.f45851a = bool != null ? bool.booleanValue() : true;
        h0 h0Var2 = this.f45812h;
        h0Var2.f45852b = gVar.f45951z;
        h0Var2.f45853c = true;
        h0Var2.f45854d = false;
        h0Var2.f45855e = false;
        h0Var2.f45857g = false;
        h0Var2.f45858h = false;
        h0Var2.f45859i = false;
        this.f45805a.submit(new g());
    }

    public static a l0(p6.g gVar) {
        if (gVar == null) {
            p6.k.h().c("AdjustConfig missing", new Object[0]);
            return null;
        } else if (!gVar.e()) {
            p6.k.h().c("AdjustConfig not initialized correctly", new Object[0]);
            return null;
        } else {
            if (gVar.f45932g != null) {
                int myPid = Process.myPid();
                ActivityManager activityManager = (ActivityManager) gVar.f45929d.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                if (activityManager != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (next.pid == myPid) {
                            if (!next.processName.equalsIgnoreCase(gVar.f45932g)) {
                                p6.k.h().h("Skipping initialization in background process (%s)", next.processName);
                                return null;
                            }
                        }
                    }
                } else {
                    return null;
                }
            }
            return new a(gVar);
        }
    }

    public final void A0() {
        this.f45816l.a();
        this.f45806b.a();
        if (!g1(true)) {
            this.f45817m.a();
        } else {
            this.f45817m.b();
        }
    }

    public final boolean B0(boolean z10) {
        return z10 ? this.f45812h.k() || !p0() : this.f45812h.k() || !p0() || this.f45812h.h();
    }

    public final void C0(List<p6.b0> list) {
        if (list == null) {
            return;
        }
        for (p6.b0 b0Var : list) {
            b0Var.a(this);
        }
    }

    public final void D0(Uri uri, Handler handler) {
        if (uri == null) {
            return;
        }
        this.f45808d.h("Deferred deeplink received (%s)", uri);
        handler.post(new c0(uri, c0(uri)));
    }

    public final void E0() {
        if (U(this.f45807c)) {
            a1 a1Var = new a1(getContext());
            String c10 = a1Var.c();
            long b10 = a1Var.b();
            if (c10 == null || b10 == -1) {
                return;
            }
            J0(Uri.parse(c10), b10);
            a1Var.p();
        }
    }

    public final void F0() {
        if (this.f45807c.f45901z) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        p6.d dVar = this.f45807c;
        long j10 = currentTimeMillis - dVar.H;
        if (j10 < 0) {
            this.f45808d.c("Time travel!", new Object[0]);
            this.f45807c.H = currentTimeMillis;
            u1();
        } else if (j10 > f45803t) {
            k1(currentTimeMillis);
            V();
        } else if (j10 > f45804u) {
            int i10 = dVar.E + 1;
            dVar.E = i10;
            dVar.F += j10;
            dVar.H = currentTimeMillis;
            this.f45808d.g("Started subsession %d of session %d", Integer.valueOf(i10), Integer.valueOf(this.f45807c.D));
            u1();
            a0();
            this.f45819o.s();
            this.f45820p.c();
        } else {
            this.f45808d.g("Time span since last activity too short for a new subsession", new Object[0]);
        }
    }

    public final void G0(Context context) {
        try {
            this.f45807c = (p6.d) c1.W(context, "AdjustIoActivityState", "Activity state", p6.d.class);
        } catch (Exception e10) {
            this.f45808d.c("Failed to read %s file (%s)", "Activity state", e10.getMessage());
            this.f45807c = null;
        }
        if (this.f45807c != null) {
            this.f45812h.f45858h = true;
        }
    }

    public final void H0(Context context) {
        try {
            this.f45815k = (p6.f) c1.W(context, "AdjustAttribution", "Attribution", p6.f.class);
        } catch (Exception e10) {
            this.f45808d.c("Failed to read %s file (%s)", "Attribution", e10.getMessage());
            this.f45815k = null;
        }
    }

    public final void I0(Context context) {
        try {
            InputStream open = context.getAssets().open("adjust_config.properties");
            Properties properties = new Properties();
            properties.load(open);
            this.f45808d.g("adjust_config.properties file read and loaded", new Object[0]);
            String property = properties.getProperty("defaultTracker");
            if (property != null) {
                this.f45814j.f45935j = property;
            }
        } catch (Exception e10) {
            this.f45808d.d("%s file not found in this app", e10.getMessage());
        }
    }

    public void J0(Uri uri, long j10) {
        this.f45805a.submit(new e0(uri, j10));
    }

    public final void K0(Uri uri, long j10) {
        if (p0()) {
            if (c1.R(uri)) {
                p6.z zVar = this.f45808d;
                zVar.d("Deep link (" + uri.toString() + ") processing skipped", new Object[0]);
                return;
            }
            p6.c a10 = q0.a(uri, j10, this.f45807c, this.f45814j, this.f45813i, this.f45818n);
            if (a10 == null) {
                return;
            }
            this.f45817m.d(a10);
        }
    }

    public final void L0(Context context) {
        try {
            this.f45818n.f46170a = (Map) c1.W(context, "AdjustSessionCallbackParameters", "Session Callback parameters", Map.class);
        } catch (Exception e10) {
            this.f45808d.c("Failed to read %s file (%s)", "Session Callback parameters", e10.getMessage());
            this.f45818n.f46170a = null;
        }
    }

    public final void M0(Context context) {
        try {
            this.f45818n.f46171b = (Map) c1.W(context, "AdjustSessionPartnerParameters", "Session Partner parameters", Map.class);
        } catch (Exception e10) {
            this.f45808d.c("Failed to read %s file (%s)", "Session Partner parameters", e10.getMessage());
            this.f45818n.f46171b = null;
        }
    }

    public final void N0() {
        this.f45816l.b();
        this.f45806b.b();
        this.f45817m.b();
    }

    public void O0() {
        this.f45805a.submit(new f());
    }

    public final void P0() {
        if (this.f45812h.j()) {
            this.f45808d.h("Start delay expired or never configured", new Object[0]);
            return;
        }
        s1();
        this.f45812h.f45854d = false;
        this.f45811g.e();
        this.f45811g = null;
        r1();
    }

    public void Q0(t0 t0Var, String str) {
        this.f45805a.submit(new RunnableC0701a(t0Var, str));
    }

    public final void R0(t0 t0Var, String str) {
        if (p0() && r0(t0Var) && !c1.P(t0Var, str, this.f45807c)) {
            this.f45817m.d(q0.b(t0Var, str, this.f45807c, this.f45814j, this.f45813i, this.f45818n));
        }
    }

    public void S() {
        this.f45805a.submit(new p());
    }

    public final void S0() {
        String i10;
        if (!p0() || this.f45812h.a() || (i10 = new a1(getContext()).i()) == null || i10.isEmpty()) {
            return;
        }
        this.f45817m.f(i10, "system_installer_referrer");
    }

    public final void T() {
        if (f1()) {
            this.f45806b.e();
        }
    }

    public void T0() {
        this.f45805a.submit(new g0());
    }

    public final boolean U(p6.d dVar) {
        if (this.f45812h.a()) {
            this.f45808d.c("Sdk did not yet start", new Object[0]);
            return false;
        }
        return true;
    }

    public final void U0() {
        if (p0() && !this.f45812h.a()) {
            this.f45817m.e();
        }
    }

    public final void V() {
        W(new a1(getContext()));
    }

    public final void V0(boolean z10) {
        this.f45807c.B = z10;
        u1();
    }

    public final void W(a1 a1Var) {
        String j10 = a1Var.j();
        if (j10 != null && !j10.equals(this.f45807c.L)) {
            X0(j10, true);
        }
        if (a1Var.l() != null) {
            T0();
        }
        a0();
        this.f45819o.s();
        this.f45820p.c();
    }

    public final void W0(boolean z10) {
        p6.d dVar;
        if (n0(p0(), z10, "Adjust already enabled", "Adjust already disabled")) {
            if (z10 && (dVar = this.f45807c) != null && dVar.f45901z) {
                this.f45808d.c("Re-enabling SDK not possible for forgotten user", new Object[0]);
                return;
            }
            h0 h0Var = this.f45812h;
            h0Var.f45851a = z10;
            if (h0Var.a()) {
                t1(!z10, "Handlers will start as paused due to the SDK being disabled", "Handlers will still start as paused", "Handlers will start as active due to the SDK being enabled");
                return;
            }
            this.f45807c.f45900y = z10;
            u1();
            if (z10) {
                a1 a1Var = new a1(getContext());
                if (a1Var.e()) {
                    k0();
                } else {
                    if (a1Var.d()) {
                        f0();
                    }
                    for (p6.p pVar : this.f45814j.f45946u.f46007b) {
                        m1(pVar);
                    }
                    Boolean bool = this.f45814j.f45946u.f46008c;
                    if (bool != null) {
                        j1(bool.booleanValue());
                    }
                    this.f45814j.f45946u.f46007b = new ArrayList();
                    this.f45814j.f45946u.f46008c = null;
                }
                if (!a1Var.f()) {
                    this.f45808d.d("Detected that install was not tracked at enable time", new Object[0]);
                    k1(System.currentTimeMillis());
                }
                W(a1Var);
            }
            t1(!z10, "Pausing handlers due to SDK being disabled", "Handlers remain paused", "Resuming handlers due to SDK being enabled");
        }
    }

    public final void X() {
        if (U(this.f45807c)) {
            if (this.f45812h.f() && this.f45812h.d()) {
                return;
            }
            if (this.f45815k == null || this.f45807c.B) {
                this.f45816l.e();
            }
        }
    }

    public void X0(String str, boolean z10) {
        this.f45805a.submit(new h(z10, str));
    }

    public final boolean Y(p6.h hVar) {
        if (hVar == null) {
            this.f45808d.c("Event missing", new Object[0]);
            return false;
        } else if (hVar.c()) {
            return true;
        } else {
            this.f45808d.c("Event not initialized correctly", new Object[0]);
            return false;
        }
    }

    public final void Y0(String str) {
        if (U(this.f45807c) && p0()) {
            p6.d dVar = this.f45807c;
            if (dVar.f45901z || str == null || str.equals(dVar.L)) {
                return;
            }
            this.f45807c.L = str;
            u1();
            p6.c o10 = new p0(this.f45814j, this.f45813i, this.f45807c, this.f45818n, System.currentTimeMillis()).o("push");
            this.f45806b.f(o10);
            new a1(getContext()).t();
            if (this.f45814j.f45934i) {
                this.f45808d.h("Buffered event %s", o10.q());
            } else {
                this.f45806b.e();
            }
        }
    }

    public final void Z(x0 x0Var) {
        if (x0Var.f46161o) {
            String str = x0Var.f46169w;
            boolean z10 = true;
            if (str != null && str.equalsIgnoreCase("huawei_ads")) {
                p6.d dVar = this.f45807c;
                dVar.U = x0Var.f46162p;
                dVar.V = x0Var.f46163q;
                dVar.W = x0Var.f46164r;
                u1();
                return;
            }
            String str2 = x0Var.f46169w;
            if (str2 == null || !str2.equalsIgnoreCase("huawei_app_gallery")) {
                z10 = false;
            }
            if (z10) {
                p6.d dVar2 = this.f45807c;
                dVar2.U = x0Var.f46162p;
                dVar2.V = x0Var.f46163q;
                dVar2.X = x0Var.f46164r;
                u1();
                return;
            }
            p6.d dVar3 = this.f45807c;
            dVar3.N = x0Var.f46162p;
            dVar3.O = x0Var.f46163q;
            dVar3.P = x0Var.f46164r;
            dVar3.R = x0Var.f46165s;
            dVar3.S = x0Var.f46166t;
            dVar3.T = x0Var.f46167u;
            dVar3.Q = x0Var.f46168v;
            u1();
        }
    }

    public final void Z0() {
        if (this.f45810f != null && f1() && this.f45810f.g() <= 0) {
            this.f45810f.h(f45802s);
        }
    }

    @Override // p6.x
    public y0 a() {
        return this.f45818n;
    }

    public final void a0() {
        p6.d dVar = this.f45807c;
        if (dVar == null || !dVar.f45900y || dVar.f45901z) {
            return;
        }
        S0();
        if (this.f45814j.D && !this.f45812h.c()) {
            String str = this.f45813i.f46105k;
            if (str != null && !str.isEmpty()) {
                a1 a1Var = new a1(getContext());
                long h10 = a1Var.h();
                if (s0.i(h10)) {
                    this.f45812h.f45859i = true;
                    return;
                }
                if (s0.j("system_properties", h10)) {
                    String c10 = s0.c(this.f45813i.f46105k, this.f45808d);
                    if (c10 != null && !c10.isEmpty()) {
                        this.f45817m.f(c10, "system_properties");
                    } else {
                        h10 = s0.k("system_properties", h10);
                    }
                }
                if (s0.j("system_properties_reflection", h10)) {
                    String f10 = s0.f(this.f45813i.f46105k, this.f45808d);
                    if (f10 != null && !f10.isEmpty()) {
                        this.f45817m.f(f10, "system_properties_reflection");
                    } else {
                        h10 = s0.k("system_properties_reflection", h10);
                    }
                }
                if (s0.j("system_properties_path", h10)) {
                    String d10 = s0.d(this.f45813i.f46105k, this.f45808d);
                    if (d10 != null && !d10.isEmpty()) {
                        this.f45817m.f(d10, "system_properties_path");
                    } else {
                        h10 = s0.k("system_properties_path", h10);
                    }
                }
                if (s0.j("system_properties_path_reflection", h10)) {
                    String e10 = s0.e(this.f45813i.f46105k, this.f45808d);
                    if (e10 != null && !e10.isEmpty()) {
                        this.f45817m.f(e10, "system_properties_path_reflection");
                    } else {
                        h10 = s0.k("system_properties_path_reflection", h10);
                    }
                }
                if (s0.j("content_provider", h10)) {
                    String a10 = s0.a(this.f45814j.f45929d, this.f45813i.f46105k, this.f45808d);
                    if (a10 != null && !a10.isEmpty()) {
                        this.f45817m.f(a10, "content_provider");
                    } else {
                        h10 = s0.k("content_provider", h10);
                    }
                }
                if (s0.j("content_provider_intent_action", h10)) {
                    List<String> g10 = s0.g(this.f45814j.f45929d, this.f45813i.f46105k, this.f45808d);
                    if (g10 != null && !g10.isEmpty()) {
                        for (String str2 : g10) {
                            this.f45817m.f(str2, "content_provider_intent_action");
                        }
                    } else {
                        h10 = s0.k("content_provider_intent_action", h10);
                    }
                }
                if (s0.j("content_provider_no_permission", h10)) {
                    List<String> h11 = s0.h(this.f45814j.f45929d, this.f45813i.f46105k, this.f45808d);
                    if (h11 != null && !h11.isEmpty()) {
                        for (String str3 : h11) {
                            this.f45817m.f(str3, "content_provider_no_permission");
                        }
                    } else {
                        h10 = s0.k("content_provider_no_permission", h10);
                    }
                }
                if (s0.j("file_system", h10)) {
                    String b10 = s0.b(this.f45813i.f46105k, this.f45814j.G, this.f45808d);
                    if (b10 != null && !b10.isEmpty()) {
                        this.f45817m.f(b10, "file_system");
                    } else {
                        h10 = s0.k("file_system", h10);
                    }
                }
                a1Var.C(h10);
                this.f45812h.f45859i = true;
                return;
            }
            this.f45808d.d("Can't read preinstall payload, invalid package name", new Object[0]);
        }
    }

    public final void a1() {
        this.f45807c = new p6.d();
        this.f45812h.f45858h = true;
        r1();
        long currentTimeMillis = System.currentTimeMillis();
        a1 a1Var = new a1(getContext());
        this.f45807c.L = a1Var.j();
        if (this.f45812h.e()) {
            if (a1Var.e()) {
                k0();
            } else {
                if (a1Var.d()) {
                    f0();
                }
                for (p6.p pVar : this.f45814j.f45946u.f46007b) {
                    m1(pVar);
                }
                Boolean bool = this.f45814j.f45946u.f46008c;
                if (bool != null) {
                    j1(bool.booleanValue());
                }
                this.f45814j.f45946u.f46007b = new ArrayList();
                this.f45814j.f45946u.f46008c = null;
                this.f45807c.D = 1;
                n1(currentTimeMillis);
                W(a1Var);
            }
        }
        this.f45807c.e(currentTimeMillis);
        this.f45807c.f45900y = this.f45812h.e();
        this.f45807c.J = this.f45812h.l();
        u1();
        a1Var.t();
        a1Var.r();
        a1Var.q();
        E0();
    }

    @Override // p6.x
    public void b(z0 z0Var) {
        this.f45805a.submit(new d(z0Var));
    }

    public final boolean b0(String str) {
        if (str != null && !str.isEmpty()) {
            if (this.f45807c.c(str)) {
                this.f45808d.h("Skipping duplicated order ID '%s'", str);
                return false;
            }
            this.f45807c.b(str);
            this.f45808d.g("Added order ID '%s'", str);
        }
        return true;
    }

    public final void b1() {
        if (p0()) {
            this.f45809e.d();
        }
    }

    @Override // p6.x
    public String c() {
        p6.d dVar = this.f45807c;
        if (dVar == null) {
            return null;
        }
        return dVar.M;
    }

    public final Intent c0(Uri uri) {
        Intent intent;
        if (this.f45814j.f45938m == null) {
            intent = new Intent("android.intent.action.VIEW", uri);
        } else {
            p6.g gVar = this.f45814j;
            intent = new Intent("android.intent.action.VIEW", uri, gVar.f45929d, gVar.f45938m);
        }
        intent.setFlags(268435456);
        intent.setPackage(this.f45814j.f45929d.getPackageName());
        return intent;
    }

    public final void c1() {
        if (this.f45812h.a()) {
            p6.o.b(this.f45814j.f45947v);
            a1();
        } else if (this.f45807c.f45900y) {
            p6.o.b(this.f45814j.f45947v);
            r1();
            F0();
            X();
            E0();
        }
    }

    @Override // p6.x
    public void d(p6.s sVar) {
        this.f45805a.submit(new e(sVar));
    }

    public final void d0() {
        if (this.f45812h.j() || q0()) {
            return;
        }
        Double d10 = this.f45814j.f45945t;
        double doubleValue = d10 != null ? d10.doubleValue() : 0.0d;
        long i10 = p6.k.i();
        long j10 = (long) (1000.0d * doubleValue);
        if (j10 > i10) {
            double d11 = i10 / 1000;
            DecimalFormat decimalFormat = c1.f45890a;
            this.f45808d.b("Delay start of %s seconds bigger than max allowed value of %s seconds", decimalFormat.format(doubleValue), decimalFormat.format(d11));
            doubleValue = d11;
        } else {
            i10 = j10;
        }
        this.f45808d.h("Waiting %s seconds before starting first session", c1.f45890a.format(doubleValue));
        this.f45811g.h(i10);
        this.f45812h.f45855e = true;
        p6.d dVar = this.f45807c;
        if (dVar != null) {
            dVar.J = true;
            u1();
        }
    }

    public final void d1() {
        r6.j jVar = this.f45810f;
        if (jVar == null) {
            return;
        }
        jVar.e();
    }

    @Override // p6.x
    public void e(boolean z10) {
        this.f45805a.submit(new f0(z10));
    }

    public void e0() {
        this.f45805a.submit(new j());
    }

    public final void e1() {
        this.f45809e.e();
    }

    @Override // p6.x
    public void f(x0 x0Var) {
        this.f45805a.submit(new c(x0Var));
    }

    public final void f0() {
        a1 a1Var = new a1(getContext());
        a1Var.A();
        if (U(this.f45807c) && p0()) {
            p6.d dVar = this.f45807c;
            if (dVar.f45901z || dVar.A) {
                return;
            }
            dVar.A = true;
            u1();
            p6.c l10 = new p0(this.f45814j, this.f45813i, this.f45807c, this.f45818n, System.currentTimeMillis()).l();
            this.f45806b.f(l10);
            a1Var.q();
            if (this.f45814j.f45934i) {
                this.f45808d.h("Buffered event %s", l10.q());
            } else {
                this.f45806b.e();
            }
        }
    }

    public final boolean f1() {
        return g1(false);
    }

    @Override // p6.x
    public p6.d g() {
        return this.f45807c;
    }

    public final void g0() {
        if (!f1()) {
            A0();
        }
        if (o1(System.currentTimeMillis())) {
            u1();
        }
    }

    public final boolean g1(boolean z10) {
        if (B0(z10)) {
            return false;
        }
        if (this.f45814j.f45944s) {
            return true;
        }
        return this.f45812h.i();
    }

    @Override // p6.x
    public Context getContext() {
        return this.f45814j.f45929d;
    }

    @Override // p6.x
    public p6.u getDeviceInfo() {
        return this.f45813i;
    }

    @Override // p6.x
    public p6.g h() {
        return this.f45814j;
    }

    public void h0() {
        this.f45805a.submit(new o());
    }

    public final void h1(p6.h hVar) {
        if (U(this.f45807c) && p0() && Y(hVar) && b0(hVar.f45958f) && !this.f45807c.f45901z) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f45807c.C++;
            o1(currentTimeMillis);
            p6.c m10 = new p0(this.f45814j, this.f45813i, this.f45807c, this.f45818n, currentTimeMillis).m(hVar, this.f45812h.h());
            this.f45806b.f(m10);
            if (this.f45814j.f45934i) {
                this.f45808d.h("Buffered event %s", m10.q());
            } else {
                this.f45806b.e();
            }
            if (this.f45814j.f45944s && this.f45812h.g()) {
                Z0();
            }
            u1();
        }
    }

    @Override // p6.x
    public void i(v0 v0Var) {
        if (v0Var instanceof z0) {
            this.f45808d.d("Finished tracking session", new Object[0]);
            this.f45816l.f((z0) v0Var);
        } else if (v0Var instanceof x0) {
            x0 x0Var = (x0) v0Var;
            Z(x0Var);
            this.f45816l.g(x0Var);
        } else if (v0Var instanceof p6.v) {
            v0((p6.v) v0Var);
        }
    }

    public final void i0() {
        if (!p0()) {
            e1();
            return;
        }
        if (f1()) {
            this.f45806b.e();
        }
        if (o1(System.currentTimeMillis())) {
            u1();
        }
    }

    public void i1(boolean z10) {
        this.f45805a.submit(new l(z10));
    }

    @Override // p6.x
    public void j() {
        this.f45805a.submit(new n());
    }

    public void j0() {
        this.f45805a.submit(new i());
    }

    public final void j1(boolean z10) {
        if (!U(this.f45807c)) {
            this.f45814j.f45946u.f46008c = Boolean.valueOf(z10);
        } else if (p0() && !this.f45807c.f45901z) {
            p6.c p10 = new p0(this.f45814j, this.f45813i, this.f45807c, this.f45818n, System.currentTimeMillis()).p(z10);
            this.f45806b.f(p10);
            if (this.f45814j.f45934i) {
                this.f45808d.h("Buffered event %s", p10.q());
            } else {
                this.f45806b.e();
            }
        }
    }

    @Override // p6.x
    public void k(p6.g gVar) {
        this.f45814j = gVar;
    }

    public final void k0() {
        if (U(this.f45807c) && p0()) {
            p6.d dVar = this.f45807c;
            if (dVar.f45901z) {
                return;
            }
            dVar.f45901z = true;
            u1();
            p6.c n10 = new p0(this.f45814j, this.f45813i, this.f45807c, this.f45818n, System.currentTimeMillis()).n();
            this.f45806b.f(n10);
            new a1(getContext()).r();
            if (this.f45814j.f45934i) {
                this.f45808d.h("Buffered event %s", n10.q());
            } else {
                this.f45806b.e();
            }
        }
    }

    public final void k1(long j10) {
        p6.d dVar = this.f45807c;
        dVar.D++;
        dVar.I = j10 - dVar.H;
        n1(j10);
        this.f45807c.e(j10);
        u1();
    }

    @Override // p6.x
    public void l(p6.h hVar) {
        this.f45805a.submit(new d0(hVar));
    }

    public void l1(p6.p pVar) {
        this.f45805a.submit(new k(pVar));
    }

    public final void m0() {
        this.f45807c.f45901z = true;
        u1();
        this.f45806b.flush();
        W0(false);
    }

    public final void m1(p6.p pVar) {
        if (!U(this.f45807c)) {
            this.f45814j.f45946u.f46007b.add(pVar);
        } else if (p0() && !this.f45807c.f45901z) {
            p6.c r10 = new p0(this.f45814j, this.f45813i, this.f45807c, this.f45818n, System.currentTimeMillis()).r(pVar);
            this.f45806b.f(r10);
            if (this.f45814j.f45934i) {
                this.f45808d.h("Buffered event %s", r10.q());
            } else {
                this.f45806b.e();
            }
        }
    }

    public final boolean n0(boolean z10, boolean z11, String str, String str2) {
        if (z10 != z11) {
            return true;
        }
        if (z10) {
            this.f45808d.d(str, new Object[0]);
        } else {
            this.f45808d.d(str2, new Object[0]);
        }
        return false;
    }

    public final void n1(long j10) {
        this.f45806b.f(new p0(this.f45814j, this.f45813i, this.f45807c, this.f45818n, j10).q(this.f45812h.h()));
        this.f45806b.e();
    }

    public final void o0() {
        Double d10;
        f45803t = p6.k.n();
        f45804u = p6.k.p();
        f45800q = p6.k.q();
        f45801r = p6.k.r();
        f45802s = p6.k.q();
        H0(this.f45814j.f45929d);
        G0(this.f45814j.f45929d);
        this.f45818n = new y0();
        L0(this.f45814j.f45929d);
        M0(this.f45814j.f45929d);
        p6.g gVar = this.f45814j;
        if (gVar.f45950y != null) {
            gVar.f45946u.f46006a.add(new q());
        }
        if (this.f45812h.b()) {
            h0 h0Var = this.f45812h;
            p6.d dVar = this.f45807c;
            h0Var.f45851a = dVar.f45900y;
            h0Var.f45855e = dVar.J;
            h0Var.f45856f = false;
        } else {
            this.f45812h.f45856f = true;
        }
        I0(this.f45814j.f45929d);
        p6.g gVar2 = this.f45814j;
        this.f45813i = new p6.u(gVar2.f45929d, gVar2.f45933h);
        if (this.f45814j.f45934i) {
            this.f45808d.h("Event buffering is enabled", new Object[0]);
        }
        this.f45813i.A(this.f45814j.f45929d);
        if (this.f45813i.f46095a == null) {
            this.f45808d.b("Unable to get Google Play Services Advertising ID at start time", new Object[0]);
            p6.u uVar = this.f45813i;
            if (uVar.f46100f == null && uVar.f46101g == null && uVar.f46102h == null) {
                this.f45808d.c("Unable to get any device id's. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
            }
        } else {
            this.f45808d.h("Google Play Services Advertising ID read correctly at start time", new Object[0]);
        }
        String str = this.f45814j.f45935j;
        if (str != null) {
            this.f45808d.h("Default tracker: '%s'", str);
        }
        String str2 = this.f45814j.f45949x;
        if (str2 != null) {
            this.f45808d.h("Push token: '%s'", str2);
            if (this.f45812h.b()) {
                X0(this.f45814j.f45949x, false);
            } else {
                new a1(getContext()).x(this.f45814j.f45949x);
            }
        } else if (this.f45812h.b()) {
            X0(new a1(getContext()).j(), true);
        }
        if (this.f45812h.b()) {
            a1 a1Var = new a1(getContext());
            if (a1Var.e()) {
                j0();
            } else {
                if (a1Var.d()) {
                    e0();
                }
                for (p6.p pVar : this.f45814j.f45946u.f46007b) {
                    l1(pVar);
                }
                Boolean bool = this.f45814j.f45946u.f46008c;
                if (bool != null) {
                    i1(bool.booleanValue());
                }
                this.f45814j.f45946u.f46007b = new ArrayList();
                this.f45814j.f45946u.f46008c = null;
            }
        }
        this.f45809e = new r6.i(new r(), f45801r, f45800q, "Foreground timer");
        if (this.f45814j.f45944s) {
            this.f45808d.h("Send in background configured", new Object[0]);
            this.f45810f = new r6.j(new s(), "Background timer");
        }
        if (this.f45812h.a() && (d10 = this.f45814j.f45945t) != null && d10.doubleValue() > 0.0d) {
            this.f45808d.h("Delay start configured", new Object[0]);
            this.f45812h.f45854d = true;
            this.f45811g = new r6.j(new t(), "Delay Start timer");
        }
        q6.d.f(this.f45814j.f45948w);
        p6.g gVar3 = this.f45814j;
        this.f45806b = p6.k.j(this, this.f45814j.f45929d, g1(false), new q6.a(gVar3.F, gVar3.f45926a, gVar3.f45927b, gVar3.f45928c, this.f45813i.f46104j));
        p6.g gVar4 = this.f45814j;
        this.f45816l = p6.k.b(this, g1(false), new q6.a(gVar4.F, gVar4.f45926a, gVar4.f45927b, gVar4.f45928c, this.f45813i.f46104j));
        p6.g gVar5 = this.f45814j;
        this.f45817m = p6.k.m(this, g1(true), new q6.a(gVar5.F, gVar5.f45926a, gVar5.f45927b, gVar5.f45928c, this.f45813i.f46104j));
        if (q0()) {
            s1();
        }
        this.f45819o = new p6.d0(this.f45814j.f45929d, new u());
        this.f45820p = new p6.e0(this.f45814j.f45929d, new v());
        C0(this.f45814j.f45946u.f46006a);
        U0();
    }

    public final boolean o1(long j10) {
        if (U(this.f45807c)) {
            p6.d dVar = this.f45807c;
            long j11 = j10 - dVar.H;
            if (j11 > f45803t) {
                return false;
            }
            dVar.H = j10;
            if (j11 < 0) {
                this.f45808d.c("Time travel!", new Object[0]);
                return true;
            }
            dVar.F += j11;
            dVar.G += j11;
            return true;
        }
        return false;
    }

    @Override // p6.x
    public void onPause() {
        this.f45812h.f45853c = true;
        this.f45805a.submit(new w());
    }

    @Override // p6.x
    public void onResume() {
        this.f45812h.f45853c = false;
        this.f45805a.submit(new m());
    }

    public final boolean p0() {
        p6.d dVar = this.f45807c;
        if (dVar != null) {
            return dVar.f45900y;
        }
        return this.f45812h.e();
    }

    public final void p1(String str) {
        if (str == null || str.equals(this.f45807c.M)) {
            return;
        }
        this.f45807c.M = str;
        u1();
    }

    public final boolean q0() {
        p6.d dVar = this.f45807c;
        if (dVar != null) {
            return dVar.J;
        }
        return this.f45812h.l();
    }

    public boolean q1(p6.f fVar) {
        if (fVar == null || fVar.equals(this.f45815k)) {
            return false;
        }
        this.f45815k = fVar;
        v1();
        return true;
    }

    public final boolean r0(t0 t0Var) {
        String str;
        return (t0Var == null || (str = t0Var.f46088a) == null || str.length() == 0) ? false : true;
    }

    public final void r1() {
        if (!f1()) {
            A0();
            return;
        }
        N0();
        if (!this.f45814j.f45934i || (this.f45812h.f() && this.f45812h.d())) {
            this.f45806b.e();
        }
    }

    public final void s0(Handler handler) {
        if (this.f45814j.f45936k == null) {
            return;
        }
        handler.post(new b0());
    }

    public final void s1() {
        this.f45806b.g(this.f45818n);
        this.f45812h.f45855e = false;
        p6.d dVar = this.f45807c;
        if (dVar != null) {
            dVar.J = false;
            u1();
        }
    }

    public final void t0(p6.s sVar) {
        p1(sVar.f46126c);
        Handler handler = new Handler(this.f45814j.f45929d.getMainLooper());
        if (q1(sVar.f46132i)) {
            s0(handler);
        }
        D0(sVar.f46087o, handler);
    }

    public final void t1(boolean z10, String str, String str2, String str3) {
        if (z10) {
            this.f45808d.h(str, new Object[0]);
        } else if (B0(false)) {
            if (B0(true)) {
                this.f45808d.h(str2, new Object[0]);
            } else {
                p6.z zVar = this.f45808d;
                zVar.h(str2 + ", except the Sdk Click Handler", new Object[0]);
            }
        } else {
            this.f45808d.h(str3, new Object[0]);
        }
        r1();
    }

    public final void u0(Intent intent, Uri uri) {
        if (!(this.f45814j.f45929d.getPackageManager().queryIntentActivities(intent, 0).size() > 0)) {
            this.f45808d.c("Unable to open deferred deep link (%s)", uri);
            return;
        }
        this.f45808d.h("Open deferred deep link (%s)", uri);
        this.f45814j.f45929d.startActivity(intent);
    }

    public final void u1() {
        synchronized (p6.d.class) {
            p6.d dVar = this.f45807c;
            if (dVar == null) {
                return;
            }
            c1.c0(dVar, this.f45814j.f45929d, "AdjustIoActivityState", "Activity state");
        }
    }

    public void v0(p6.v vVar) {
        this.f45805a.submit(new b(vVar));
    }

    public final void v1() {
        synchronized (p6.f.class) {
            p6.f fVar = this.f45815k;
            if (fVar == null) {
                return;
            }
            c1.c0(fVar, this.f45814j.f45929d, "AdjustAttribution", "Attribution");
        }
    }

    public final void w0(p6.v vVar) {
        p1(vVar.f46126c);
        Handler handler = new Handler(this.f45814j.f45929d.getMainLooper());
        boolean z10 = vVar.f46124a;
        if (z10 && this.f45814j.f45939n != null) {
            this.f45808d.d("Launching success event tracking listener", new Object[0]);
            handler.post(new x(vVar));
        } else if (z10 || this.f45814j.f45940o == null) {
        } else {
            this.f45808d.d("Launching failed event tracking listener", new Object[0]);
            handler.post(new y(vVar));
        }
    }

    public final void x0(x0 x0Var) {
        p1(x0Var.f46126c);
        Handler handler = new Handler(this.f45814j.f45929d.getMainLooper());
        if (q1(x0Var.f46132i)) {
            s0(handler);
        }
    }

    public final void y0(z0 z0Var, Handler handler) {
        boolean z10 = z0Var.f46124a;
        if (z10 && this.f45814j.f45941p != null) {
            this.f45808d.d("Launching success session tracking listener", new Object[0]);
            handler.post(new z(z0Var));
        } else if (z10 || this.f45814j.f45942q == null) {
        } else {
            this.f45808d.d("Launching failed session tracking listener", new Object[0]);
            handler.post(new a0(z0Var));
        }
    }

    public final void z0(z0 z0Var) {
        this.f45808d.d("Launching SessionResponse tasks", new Object[0]);
        p1(z0Var.f46126c);
        Handler handler = new Handler(this.f45814j.f45929d.getMainLooper());
        if (q1(z0Var.f46132i)) {
            s0(handler);
        }
        if (this.f45815k == null && !this.f45807c.B) {
            this.f45816l.e();
        }
        if (z0Var.f46124a) {
            new a1(getContext()).B();
        }
        y0(z0Var, handler);
        this.f45812h.f45857g = true;
    }
}
