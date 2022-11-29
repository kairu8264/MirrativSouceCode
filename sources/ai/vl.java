package ai;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
/* loaded from: classes3.dex */
public final class vl extends Thread {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final String I;
    public final boolean J;
    public final boolean K;
    public final boolean L;

    /* renamed from: w  reason: collision with root package name */
    public boolean f11119w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11120x;

    /* renamed from: y  reason: collision with root package name */
    public final Object f11121y;

    /* renamed from: z  reason: collision with root package name */
    public final ll f11122z;

    public vl() {
        ll llVar = new ll();
        this.f11119w = false;
        this.f11120x = false;
        this.f11122z = llVar;
        this.f11121y = new Object();
        this.B = wy.f11800d.e().intValue();
        this.C = wy.f11797a.e().intValue();
        this.D = wy.f11801e.e().intValue();
        this.E = wy.f11799c.e().intValue();
        this.F = ((Integer) ft.c().c(ox.N)).intValue();
        this.G = ((Integer) ft.c().c(ox.O)).intValue();
        this.H = ((Integer) ft.c().c(ox.P)).intValue();
        this.A = wy.f11802f.e().intValue();
        this.I = (String) ft.c().c(ox.R);
        this.J = ((Boolean) ft.c().c(ox.S)).booleanValue();
        this.K = ((Boolean) ft.c().c(ox.T)).booleanValue();
        this.L = ((Boolean) ft.c().c(ox.U)).booleanValue();
        setName("ContentFetchTask");
    }

    public final void a() {
        synchronized (this.f11121y) {
            if (this.f11119w) {
                uj0.a("Content hash thread already started, quiting...");
                return;
            }
            this.f11119w = true;
            start();
        }
    }

    public final void b(View view) {
        try {
            kl klVar = new kl(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.K);
            Context e10 = wg.t.g().e();
            if (e10 != null && !TextUtils.isEmpty(this.I)) {
                String str = (String) view.getTag(e10.getResources().getIdentifier((String) ft.c().c(ox.Q), TtmlNode.ATTR_ID, e10.getPackageName()));
                if (str != null && str.equals(this.I)) {
                    return;
                }
            }
            ul c10 = c(view, klVar);
            klVar.k();
            if (c10.f10741a == 0 && c10.f10742b == 0) {
                return;
            }
            if (c10.f10742b == 0 && klVar.o() == 0) {
                return;
            }
            if (c10.f10742b == 0 && this.f11122z.b(klVar)) {
                return;
            }
            this.f11122z.d(klVar);
        } catch (Exception e11) {
            uj0.d("Exception in fetchContentOnUIThread", e11);
            wg.t.h().k(e11, "ContentFetchTask.fetchContent");
        }
    }

    public final ul c(View view, kl klVar) {
        if (view == null) {
            return new ul(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (!TextUtils.isEmpty(text)) {
                klVar.i(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                return new ul(this, 1, 0);
            }
            return new ul(this, 0, 0);
        } else if ((view instanceof WebView) && !(view instanceof rp0)) {
            WebView webView = (WebView) view;
            if (!vh.n.f()) {
                return new ul(this, 0, 0);
            }
            klVar.g();
            webView.post(new tl(this, klVar, webView, globalVisibleRect));
            return new ul(this, 0, 1);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                ul c10 = c(viewGroup.getChildAt(i12), klVar);
                i10 += c10.f10741a;
                i11 += c10.f10742b;
            }
            return new ul(this, i10, i11);
        } else {
            return new ul(this, 0, 0);
        }
    }

    public final void d(kl klVar, WebView webView, String str, boolean z10) {
        klVar.f();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (!this.J && !TextUtils.isEmpty(webView.getTitle())) {
                    String title = webView.getTitle();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb2.append(title);
                    sb2.append("\n");
                    sb2.append(optString);
                    klVar.h(sb2.toString(), z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    klVar.h(optString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (klVar.a()) {
                this.f11122z.c(klVar);
            }
        } catch (JSONException unused) {
            uj0.a("Json string may be malformed.");
        } catch (Throwable th2) {
            uj0.b("Failed to get webview content.", th2);
            wg.t.h().k(th2, "ContentFetchTask.processWebViewContent");
        }
    }

    public final kl e() {
        return this.f11122z.a(this.L);
    }

    public final void f() {
        synchronized (this.f11121y) {
            this.f11120x = false;
            this.f11121y.notifyAll();
            uj0.a("ContentFetchThread: wakeup");
        }
    }

    public final void g() {
        synchronized (this.f11121y) {
            this.f11120x = true;
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("ContentFetchThread: paused, mPause = ");
            sb2.append(true);
            uj0.a(sb2.toString());
        }
    }

    public final boolean h() {
        return this.f11120x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r3.importance != 100) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r2.inKeyguardRestrictedInputMode() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r0 == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r0.isScreenOn() == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        r0 = wg.t.g().d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r0 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        ai.uj0.a("ContentFetchThread: no activity. Sleeping.");
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        if (r0.getWindow() == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
        if (r0.getWindow().getDecorView() == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
        r1 = r0.getWindow().getDecorView().findViewById(16908290);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
        wg.t.h().k(r0, "ContentFetchTask.extractContent");
        ai.uj0.a("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
        ai.uj0.d("Error in ContentFetchTask", r0);
        wg.t.h().k(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        ai.uj0.d("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc A[EXC_TOP_SPLITTER, LOOP:1: B:65:0x00dc->B:70:0x00dc, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r6 = this;
        L0:
            ai.pl r0 = wg.t.g()     // Catch: java.lang.Throwable -> La8
            android.content.Context r0 = r0.e()     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch: java.lang.Throwable -> La8
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            if (r2 == 0) goto Lb2
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La8
        L2a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> La8
            if (r3 == 0) goto Lb2
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch: java.lang.Throwable -> La8
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> La8
            int r5 = r3.pid     // Catch: java.lang.Throwable -> La8
            if (r4 != r5) goto L2a
            int r1 = r3.importance     // Catch: java.lang.Throwable -> La8
            r3 = 100
            if (r1 != r3) goto Lb2
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto Lb2
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            boolean r0 = r0.isScreenOn()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            ai.pl r0 = wg.t.g()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            android.app.Activity r0 = r0.d()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            if (r0 != 0) goto L6d
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            ai.uj0.a(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r6.g()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            goto Lba
        L6d:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L8e
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)     // Catch: java.lang.Exception -> L8e
            goto L9d
        L8e:
            r0 = move-exception
            ai.fj0 r2 = wg.t.h()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.k(r0, r3)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            ai.uj0.a(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
        L9d:
            if (r1 == 0) goto Lba
            ai.ql r0 = new ai.ql     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r0.<init>(r6, r1)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r1.post(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            goto Lba
        La8:
            r0 = move-exception
            ai.fj0 r1 = wg.t.h()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.String r2 = "ContentFetchTask.isInForeground"
            r1.k(r0, r2)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
        Lb2:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            ai.uj0.a(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r6.g()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
        Lba:
            int r0 = r6.A     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            goto Ld9
        Lc3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            ai.uj0.d(r1, r0)
            ai.fj0 r1 = wg.t.h()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.k(r0, r2)
            goto Ld9
        Ld3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            ai.uj0.d(r1, r0)
        Ld9:
            java.lang.Object r0 = r6.f11121y
            monitor-enter(r0)
        Ldc:
            boolean r1 = r6.f11120x     // Catch: java.lang.Throwable -> Lee
            if (r1 == 0) goto Leb
            java.lang.String r1 = "ContentFetchTask: waiting"
            ai.uj0.a(r1)     // Catch: java.lang.InterruptedException -> Ldc java.lang.Throwable -> Lee
            java.lang.Object r1 = r6.f11121y     // Catch: java.lang.InterruptedException -> Ldc java.lang.Throwable -> Lee
            r1.wait()     // Catch: java.lang.InterruptedException -> Ldc java.lang.Throwable -> Lee
            goto Ldc
        Leb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lee
            goto L0
        Lee:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lee
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.vl.run():void");
    }
}
