package eh;

import ai.as;
import ai.bs;
import ai.bx2;
import ai.e41;
import ai.fr2;
import ai.fs;
import ai.ft;
import ai.hd0;
import ai.j43;
import ai.ka1;
import ai.kd0;
import ai.ki0;
import ai.mi0;
import ai.mq2;
import ai.nl1;
import ai.nq2;
import ai.op1;
import ai.or0;
import ai.ox;
import ai.p33;
import ai.pp1;
import ai.qm2;
import ai.ri0;
import ai.s43;
import ai.t43;
import ai.uj0;
import ai.wl2;
import ai.z33;
import ai.zj0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.google.android.gms.internal.ads.zzaat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import yg.c1;

/* loaded from: classes3.dex */
public final class f0 extends mi0 {
    public static final List<String> U = new ArrayList(Arrays.asList("/aclk", "/pcs/click"));
    public static final List<String> V = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final List<String> W = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion"));
    public static final List<String> X = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int Y = 0;
    public final t43 A;
    public final ScheduledExecutorService B;
    public kd0 C;
    public final l G;
    public final pp1 H;
    public final nq2 I;
    public final fr2 J;
    public final zj0 R;
    public String S;

    /* renamed from: w  reason: collision with root package name */
    public final or0 f30576w;

    /* renamed from: x  reason: collision with root package name */
    public Context f30577x;

    /* renamed from: y  reason: collision with root package name */
    public final ai.u f30578y;

    /* renamed from: z  reason: collision with root package name */
    public final qm2<nl1> f30579z;
    public Point D = new Point();
    public Point E = new Point();
    public final Set<WebView> F = Collections.newSetFromMap(new WeakHashMap());
    public final AtomicInteger Q = new AtomicInteger(0);
    public final boolean K = ((Boolean) ft.c().c(ox.f8082r5)).booleanValue();
    public final boolean L = ((Boolean) ft.c().c(ox.f8074q5)).booleanValue();
    public final boolean M = ((Boolean) ft.c().c(ox.f8090s5)).booleanValue();
    public final boolean N = ((Boolean) ft.c().c(ox.f8106u5)).booleanValue();
    public final String O = (String) ft.c().c(ox.f8098t5);
    public final String P = (String) ft.c().c(ox.f8114v5);
    public final String T = (String) ft.c().c(ox.f8122w5);

    public f0(or0 or0Var, Context context, ai.u uVar, qm2<nl1> qm2Var, t43 t43Var, ScheduledExecutorService scheduledExecutorService, pp1 pp1Var, nq2 nq2Var, fr2 fr2Var, zj0 zj0Var) {
        this.f30576w = or0Var;
        this.f30577x = context;
        this.f30578y = uVar;
        this.f30579z = qm2Var;
        this.A = t43Var;
        this.B = scheduledExecutorService;
        this.G = or0Var.z();
        this.H = pp1Var;
        this.I = nq2Var;
        this.J = fr2Var;
        this.R = zj0Var;
    }

    public static final /* synthetic */ Uri X5(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? d6(uri, "nas", str) : uri;
    }

    public static final /* synthetic */ ArrayList Y5(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (s6(uri) && !TextUtils.isEmpty(str)) {
                arrayList.add(d6(uri, "nas", str));
            } else {
                arrayList.add(uri);
            }
        }
        return arrayList;
    }

    public static boolean Z5(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            for (String str : list) {
                if (path.contains(str)) {
                    for (String str2 : list2) {
                        if (host.endsWith(str2)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    public static final Uri d6(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            return Uri.parse(uri2.substring(0, i10) + str + "=" + str2 + "&" + uri2.substring(i10));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    public static boolean s6(Uri uri) {
        return Z5(uri, W, X);
    }

    public static /* synthetic */ void u6(f0 f0Var, String str, String str2, String str3) {
        if (((Boolean) ft.c().c(ox.f8034l5)).booleanValue()) {
            if (((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
                nq2 nq2Var = f0Var.I;
                mq2 a10 = mq2.a(str);
                a10.c(str2, str3);
                nq2Var.a(a10);
                return;
            }
            op1 d10 = f0Var.H.d();
            d10.d(ActionLogBase.ACTION, str);
            d10.d(str2, str3);
            d10.e();
        }
    }

    @Override // ai.ni0
    public final void C3(List<Uri> list, final yh.a aVar, hd0 hd0Var) {
        try {
            if (!((Boolean) ft.c().c(ox.f8130x5)).booleanValue()) {
                hd0Var.s("The updating URL feature is not enabled.");
            } else if (list.size() != 1) {
                hd0Var.s("There should be only 1 click URL.");
            } else {
                final Uri uri = list.get(0);
                if (!Z5(uri, U, V)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 18);
                    sb2.append("Not a Google URL: ");
                    sb2.append(valueOf);
                    uj0.f(sb2.toString());
                    hd0Var.v0(list);
                    return;
                }
                s43 h10 = this.A.h(new Callable(this, uri, aVar) { // from class: eh.t

                    /* renamed from: a  reason: collision with root package name */
                    public final f0 f30610a;

                    /* renamed from: b  reason: collision with root package name */
                    public final Uri f30611b;

                    /* renamed from: c  reason: collision with root package name */
                    public final yh.a f30612c;

                    {
                        this.f30610a = this;
                        this.f30611b = uri;
                        this.f30612c = aVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f30610a.U5(this.f30611b, this.f30612c);
                    }
                });
                if (c6()) {
                    h10 = j43.i(h10, new p33(this) { // from class: eh.u

                        /* renamed from: a  reason: collision with root package name */
                        public final f0 f30613a;

                        {
                            this.f30613a = this;
                        }

                        @Override // ai.p33
                        public final s43 a(Object obj) {
                            return this.f30613a.T5((Uri) obj);
                        }
                    }, this.A);
                } else {
                    uj0.e("Asset view map is empty.");
                }
                j43.p(h10, new d0(this, hd0Var), this.f30576w.h());
            }
        } catch (RemoteException e10) {
            uj0.d("", e10);
        }
    }

    @Override // ai.ni0
    public final void R3(final List<Uri> list, final yh.a aVar, hd0 hd0Var) {
        if (!((Boolean) ft.c().c(ox.f8130x5)).booleanValue()) {
            try {
                hd0Var.s("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                uj0.d("", e10);
                return;
            }
        }
        s43 h10 = this.A.h(new Callable(this, list, aVar) { // from class: eh.r

            /* renamed from: a  reason: collision with root package name */
            public final f0 f30606a;

            /* renamed from: b  reason: collision with root package name */
            public final List f30607b;

            /* renamed from: c  reason: collision with root package name */
            public final yh.a f30608c;

            {
                this.f30606a = this;
                this.f30607b = list;
                this.f30608c = aVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f30606a.W5(this.f30607b, this.f30608c);
            }
        });
        if (c6()) {
            h10 = j43.i(h10, new p33(this) { // from class: eh.s

                /* renamed from: a  reason: collision with root package name */
                public final f0 f30609a;

                {
                    this.f30609a = this;
                }

                @Override // ai.p33
                public final s43 a(Object obj) {
                    return this.f30609a.V5((ArrayList) obj);
                }
            }, this.A);
        } else {
            uj0.e("Asset view map is empty.");
        }
        j43.p(h10, new c0(this, hd0Var), this.f30576w.h());
    }

    public final /* synthetic */ s43 S5(nl1[] nl1VarArr, String str, nl1 nl1Var) throws Exception {
        nl1VarArr[0] = nl1Var;
        Context context = this.f30577x;
        kd0 kd0Var = this.C;
        Map<String, WeakReference<View>> map = kd0Var.f6171x;
        JSONObject e10 = c1.e(context, map, map, kd0Var.f6170w);
        JSONObject b10 = c1.b(this.f30577x, this.C.f6170w);
        JSONObject c10 = c1.c(this.C.f6170w);
        JSONObject d10 = c1.d(this.f30577x, this.C.f6170w);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", e10);
        jSONObject.put("ad_view_signal", b10);
        jSONObject.put("scroll_view_signal", c10);
        jSONObject.put("lock_screen_signal", d10);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", c1.f(null, this.f30577x, this.E, this.D));
        }
        return nl1Var.d(str, jSONObject);
    }

    public final /* synthetic */ s43 T5(final Uri uri) throws Exception {
        return j43.j(b6("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new bx2(this, uri) { // from class: eh.w

            /* renamed from: a  reason: collision with root package name */
            public final f0 f30616a;

            /* renamed from: b  reason: collision with root package name */
            public final Uri f30617b;

            {
                this.f30616a = this;
                this.f30617b = uri;
            }

            @Override // ai.bx2
            public final Object apply(Object obj) {
                return f0.X5(this.f30617b, (String) obj);
            }
        }, this.A);
    }

    public final /* synthetic */ Uri U5(Uri uri, yh.a aVar) throws Exception {
        try {
            uri = this.f30578y.e(uri, this.f30577x, (View) yh.b.z0(aVar), null);
        } catch (zzaat e10) {
            uj0.g("", e10);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ s43 V5(final ArrayList arrayList) throws Exception {
        return j43.j(b6("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new bx2(this, arrayList) { // from class: eh.v

            /* renamed from: a  reason: collision with root package name */
            public final f0 f30614a;

            /* renamed from: b  reason: collision with root package name */
            public final List f30615b;

            {
                this.f30614a = this;
                this.f30615b = arrayList;
            }

            @Override // ai.bx2
            public final Object apply(Object obj) {
                return f0.Y5(this.f30615b, (String) obj);
            }
        }, this.A);
    }

    public final /* synthetic */ ArrayList W5(List list, yh.a aVar) throws Exception {
        String e10 = this.f30578y.b() != null ? this.f30578y.b().e(this.f30577x, (View) yh.b.z0(aVar), null) : "";
        if (!TextUtils.isEmpty(e10)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!s6(uri)) {
                    uj0.f("Not a Google URL: ".concat(String.valueOf(uri)));
                    arrayList.add(uri);
                } else {
                    arrayList.add(d6(uri, "ms", e10));
                }
            }
            if (arrayList.isEmpty()) {
                throw new Exception("Empty impression URLs result.");
            }
            return arrayList;
        }
        throw new Exception("Failed to get view signals.");
    }

    public final q a6(Context context, String str, String str2, fs fsVar, as asVar) {
        p x10 = this.f30576w.x();
        e41 e41Var = new e41();
        e41Var.e(context);
        wl2 wl2Var = new wl2();
        if (str == null) {
            str = "adUnitId";
        }
        wl2Var.L(str);
        if (asVar == null) {
            asVar = new bs().a();
        }
        wl2Var.G(asVar);
        if (fsVar == null) {
            fsVar = new fs();
        }
        wl2Var.I(fsVar);
        e41Var.f(wl2Var.l());
        x10.d(e41Var.h());
        h0 h0Var = new h0();
        h0Var.b(str2);
        x10.a(new j0(h0Var, null));
        new ka1();
        return x10.zza();
    }

    public final s43<String> b6(final String str) {
        final nl1[] nl1VarArr = new nl1[1];
        s43 i10 = j43.i(this.f30579z.b(), new p33(this, nl1VarArr, str) { // from class: eh.z

            /* renamed from: a  reason: collision with root package name */
            public final f0 f30620a;

            /* renamed from: b  reason: collision with root package name */
            public final nl1[] f30621b;

            /* renamed from: c  reason: collision with root package name */
            public final String f30622c;

            {
                this.f30620a = this;
                this.f30621b = nl1VarArr;
                this.f30622c = str;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f30620a.S5(this.f30621b, this.f30622c, (nl1) obj);
            }
        }, this.A);
        i10.c(new Runnable(this, nl1VarArr) { // from class: eh.a0

            /* renamed from: w  reason: collision with root package name */
            public final f0 f30560w;

            /* renamed from: x  reason: collision with root package name */
            public final nl1[] f30561x;

            {
                this.f30560w = this;
                this.f30561x = nl1VarArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f30560w.v6(this.f30561x);
            }
        }, this.A);
        return j43.f(j43.j((z33) j43.h(z33.E(i10), ((Integer) ft.c().c(ox.f8138y5)).intValue(), TimeUnit.MILLISECONDS, this.B), x.f30618a, this.A), Exception.class, y.f30619a, this.A);
    }

    public final boolean c6() {
        Map<String, WeakReference<View>> map;
        kd0 kd0Var = this.C;
        return (kd0Var == null || (map = kd0Var.f6171x) == null || map.isEmpty()) ? false : true;
    }

    @Override // ai.ni0
    @SuppressLint({"AddJavascriptInterface"})
    public final void e0(yh.a aVar) {
        if (((Boolean) ft.c().c(ox.H6)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                uj0.f("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            if (((Boolean) ft.c().c(ox.I6)).booleanValue()) {
                j43.p(a6(this.f30577x, null, rg.b.BANNER.name(), null, null).a(), new e0(this), this.f30576w.h());
            }
            WebView webView = (WebView) yh.b.z0(aVar);
            if (webView == null) {
                uj0.c("The webView cannot be null.");
            } else if (this.F.contains(webView)) {
                uj0.e("This webview has already been registered.");
            } else {
                this.F.add(webView);
                webView.addJavascriptInterface(new a(webView, this.f30578y), "gmaSdk");
            }
        }
    }

    @Override // ai.ni0
    public final void f5(yh.a aVar, ri0 ri0Var, ki0 ki0Var) {
        Context context = (Context) yh.b.z0(aVar);
        this.f30577x = context;
        j43.p(a6(context, ri0Var.f9449w, ri0Var.f9450x, ri0Var.f9451y, ri0Var.f9452z).a(), new b0(this, ki0Var), this.f30576w.h());
    }

    @Override // ai.ni0
    public final void s4(kd0 kd0Var) {
        this.C = kd0Var;
        this.f30579z.a(1);
    }

    public final /* synthetic */ void v6(nl1[] nl1VarArr) {
        nl1 nl1Var = nl1VarArr[0];
        if (nl1Var != null) {
            this.f30579z.c(j43.a(nl1Var));
        }
    }

    @Override // ai.ni0
    public final void zzf(yh.a aVar) {
        if (((Boolean) ft.c().c(ox.f8130x5)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) yh.b.z0(aVar);
            kd0 kd0Var = this.C;
            this.D = c1.h(motionEvent, kd0Var == null ? null : kd0Var.f6170w);
            if (motionEvent.getAction() == 0) {
                this.E = this.D;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.D;
            obtain.setLocation(point.x, point.y);
            this.f30578y.d(obtain);
            obtain.recycle();
        }
    }
}
