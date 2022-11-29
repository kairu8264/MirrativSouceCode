package yg;

import ai.bn1;
import ai.dt;
import ai.fl2;
import ai.fo3;
import ai.ft;
import ai.gx;
import ai.hk0;
import ai.ip0;
import ai.j43;
import ai.kl2;
import ai.kz;
import ai.nj0;
import ai.ny;
import ai.oq0;
import ai.ow2;
import ai.ox;
import ai.s43;
import ai.tj0;
import ai.uj0;
import ai.we0;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.d;

/* loaded from: classes3.dex */
public final class d2 {

    /* renamed from: i */
    public static final ow2 f61866i = new q1(Looper.getMainLooper());

    /* renamed from: j */
    public static boolean f61867j = false;

    /* renamed from: e */
    public String f61872e;

    /* renamed from: a */
    public final AtomicReference<Pattern> f61868a = new AtomicReference<>(null);

    /* renamed from: b */
    public final AtomicReference<Pattern> f61869b = new AtomicReference<>(null);

    /* renamed from: c */
    public boolean f61870c = true;

    /* renamed from: d */
    public final Object f61871d = new Object();

    /* renamed from: f */
    public boolean f61873f = false;

    /* renamed from: g */
    public boolean f61874g = false;

    /* renamed from: h */
    public final Executor f61875h = Executors.newSingleThreadExecutor();

    public static KeyguardManager E(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    public static boolean F(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String G(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    public static Bundle H(Context context) {
        try {
            return xh.c.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            p1.l("Error getting metadata", e10);
            return null;
        }
    }

    public static int L(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 > 0) {
            StringBuilder sb2 = new StringBuilder(97);
            sb2.append("HTTP timeout too low: ");
            sb2.append(i10);
            sb2.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
            uj0.f(sb2.toString());
            return 60000;
        }
        return 60000;
    }

    public static void V(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            hk0.f4878a.execute(runnable);
        }
    }

    public static final long a(View view) {
        int i10;
        float f10 = Float.MAX_VALUE;
        ViewParent viewParent = view;
        do {
            if (!(viewParent instanceof View)) {
                break;
            }
            View view2 = viewParent;
            f10 = Math.min(f10, view2.getAlpha());
            i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            viewParent = view2.getParent();
        } while (i10 > 0);
        return Math.round((f10 >= 0.0f ? f10 : 0.0f) * 100.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a0(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.d2.a0(android.view.View):boolean");
    }

    public static final WebResourceResponse b(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", wg.t.d().P(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = new s0(context).b(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", C.UTF8_NAME, new ByteArrayInputStream(str3.getBytes(C.UTF8_NAME)));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e10) {
            uj0.g("Could not fetch MRAID JS.", e10);
        }
        return null;
    }

    @TargetApi(18)
    public static final void b0(Context context, Intent intent) {
        if (intent != null && vh.n.e()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static final String c() {
        Resources j10 = wg.t.h().j();
        return j10 != null ? j10.getString(vg.a.f57327n) : "Test Ad";
    }

    public static final String c0(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return G(H(context));
    }

    public static final v0 d(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                uj0.c("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            if (queryLocalInterface instanceof v0) {
                return (v0) queryLocalInterface;
            }
            return new t0(iBinder);
        } catch (Exception e10) {
            wg.t.h().k(e10, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final String d0() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final boolean e(Context context, String str) {
        Context a10 = we0.a(context);
        return xh.c.a(a10).b(str, a10.getPackageName()) == 0;
    }

    public static final String e0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
        sb2.append(str);
        sb2.append(" ");
        sb2.append(str2);
        return sb2.toString();
    }

    public static final boolean f(String str) {
        if (tj0.j()) {
            if (((Boolean) ft.c().c(ox.f8072q3)).booleanValue()) {
                String str2 = (String) ft.c().c(ox.f8088s3);
                if (!str2.isEmpty()) {
                    for (String str3 : str2.split(";")) {
                        if (str3.equals(str)) {
                            return false;
                        }
                    }
                }
                String str4 = (String) ft.c().c(ox.f8080r3);
                if (str4.isEmpty()) {
                    return true;
                }
                for (String str5 : str4.split(";")) {
                    if (str5.equals(str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final DisplayMetrics f0(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    @TargetApi(16)
    public static final boolean g(Context context) {
        KeyguardManager E;
        return context != null && vh.n.c() && (E = E(context)) != null && E.isKeyguardLocked();
    }

    public static final int[] g0() {
        return new int[]{0, 0};
    }

    public static final boolean h(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th2) {
            uj0.d("Error loading class.", th2);
            wg.t.h().k(th2, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean i(Context context) {
        boolean z10;
        if (vh.n.k()) {
            if (((Boolean) ft.c().c(ox.f7953b6)).booleanValue()) {
                synchronized (d2.class) {
                    z10 = f61867j;
                }
                return z10;
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static final boolean j(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean k(Context context) {
        Bundle H = H(context);
        return TextUtils.isEmpty(G(H)) && !TextUtils.isEmpty(H.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean l(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void m(View view, int i10, MotionEvent motionEvent) {
        String str;
        int i11;
        int i12;
        int i13;
        fl2 D;
        kl2 E;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof bn1) {
                view2 = ((bn1) view2).getChildAt(0);
            }
            if ((view2 instanceof tg.n) || (view2 instanceof dh.e)) {
                str = "NATIVE";
                i11 = 1;
            } else {
                str = "UNKNOWN";
                i11 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i13 = rect.width();
                i12 = rect.height();
            } else {
                i12 = 0;
                i13 = 0;
            }
            wg.t.d();
            long a10 = a(view2);
            view2.getLocationOnScreen(iArr);
            int i14 = iArr[0];
            int i15 = iArr[1];
            String str2 = "none";
            String str3 = (!(view2 instanceof oq0) || (E = ((oq0) view2).E()) == null) ? "none" : E.f6277b;
            if ((view2 instanceof ip0) && (D = ((ip0) view2).D()) != null) {
                str = fl2.a(D.f4082b);
                i11 = D.f4090f;
                str2 = D.E;
            }
            uj0.e(String.format(Locale.US, "<Ad package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", packageName, str2, str3, str, Integer.valueOf(i11), view2.getClass().getName(), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i13), Integer.valueOf(i12), Long.valueOf(a10), Integer.toString(i10, 2)));
        } catch (Exception e10) {
            uj0.d("Failure getting view location.", e10);
        }
    }

    public static final void n(Context context, String str, String str2) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(str2);
        for (String str3 : arrayList) {
            new d1(context, str, str3).c();
        }
    }

    public static final void o(Context context, Throwable th2) {
        if (context != null) {
            try {
                if (kz.f6409b.e().booleanValue()) {
                    vh.h.a(context, th2);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final void p(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final int q(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            uj0.f("Could not parse value:".concat(e10.toString()));
            return 0;
        }
    }

    public static final Map<String, String> r(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final WebResourceResponse s(HttpURLConnection httpURLConnection) throws IOException {
        wg.t.d();
        String contentType = httpURLConnection.getContentType();
        String str = "";
        String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
        wg.t.d();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i10 = 1;
                while (true) {
                    if (i10 >= split.length) {
                        break;
                    }
                    if (split[i10].trim().startsWith("charset")) {
                        String[] split2 = split[i10].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i10++;
                }
            }
        }
        String str2 = str;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && entry.getValue().size() > 0) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return wg.t.f().n(trim, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static final int[] t(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(16908290)) == null) ? g0() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final String u(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return d0();
        }
    }

    public static final int[] v(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] g02 = (window == null || (findViewById = window.findViewById(16908290)) == null) ? g0() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{dt.a().a(activity, g02[0]), dt.a().a(activity, g02[1])};
    }

    public static final boolean w(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z10 = wg.t.d().f61870c || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || a0(view);
        long a10 = a(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z10)) {
            if (!((Boolean) ft.c().c(ox.Q0)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) ft.c().c(ox.R6)).booleanValue()) {
                    return true;
                }
                if (a10 >= ((Integer) ft.c().c(ox.T6)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @TargetApi(18)
    public static final void x(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            b0(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb2.append("Opening ");
            sb2.append(uri2);
            sb2.append(" in a new browser.");
            uj0.a(sb2.toString());
        } catch (ActivityNotFoundException e10) {
            uj0.d("No browser is found.", e10);
        }
    }

    public static final int[] y(Activity activity) {
        int[] t10 = t(activity);
        return new int[]{dt.a().a(activity, t10[0]), dt.a().a(activity, t10[1])};
    }

    public static final boolean z(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return w(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, E(context));
    }

    public final JSONArray B(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            C(jSONArray, it.next());
        }
        return jSONArray;
    }

    public final void C(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(S((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(Q((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(B((Collection) obj));
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object obj2 : (Object[]) obj) {
                C(jSONArray2, obj2);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    public final void D(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, S((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, Q((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, B((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, B(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    public final void M(Context context, String str, boolean z10, HttpURLConnection httpURLConnection, boolean z11, int i10) {
        int L = L(i10);
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("HTTP timeout: ");
        sb2.append(L);
        sb2.append(" milliseconds.");
        uj0.e(sb2.toString());
        httpURLConnection.setConnectTimeout(L);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(L);
        httpURLConnection.setRequestProperty("User-Agent", P(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public final boolean N(Context context) {
        if (this.f61873f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new c2(this, null), intentFilter);
        this.f61873f = true;
        return true;
    }

    public final boolean O(Context context) {
        if (this.f61874g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new a2(this, null), intentFilter);
        this.f61874g = true;
        return true;
    }

    public final String P(Context context, String str) {
        synchronized (this.f61871d) {
            String str2 = this.f61872e;
            if (str2 != null) {
                return str2;
            }
            if (str == null) {
                return d0();
            }
            try {
                this.f61872e = wg.t.f().b(context);
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(this.f61872e)) {
                dt.a();
                if (!nj0.n()) {
                    this.f61872e = null;
                    f61866i.post(new x1(this, context));
                    while (this.f61872e == null) {
                        try {
                            this.f61871d.wait();
                        } catch (InterruptedException unused2) {
                            String d02 = d0();
                            this.f61872e = d02;
                            String valueOf = String.valueOf(d02);
                            uj0.f(valueOf.length() != 0 ? "Interrupted, use default user agent: ".concat(valueOf) : new String("Interrupted, use default user agent: "));
                        }
                    }
                } else {
                    this.f61872e = u(context);
                }
            }
            String valueOf2 = String.valueOf(this.f61872e);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 10 + str.length());
            sb2.append(valueOf2);
            sb2.append(" (Mobile; ");
            sb2.append(str);
            this.f61872e = sb2.toString();
            try {
                if (xh.c.a(context).g()) {
                    this.f61872e = String.valueOf(this.f61872e).concat(";aia");
                }
            } catch (Exception e10) {
                wg.t.h().k(e10, "AdUtil.getUserAgent");
            }
            String concat = String.valueOf(this.f61872e).concat(")");
            this.f61872e = concat;
            return concat;
        }
    }

    public final JSONObject Q(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                D(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e10) {
            String valueOf = String.valueOf(e10.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    public final JSONObject R(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return S(bundle);
            } catch (JSONException e10) {
                uj0.d("Error converting Bundle to JSON", e10);
                return null;
            }
        }
        return null;
    }

    public final JSONObject S(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            D(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final s43<Map<String, String>> T(Uri uri) {
        return j43.d(new Callable(uri) { // from class: yg.v1

            /* renamed from: a  reason: collision with root package name */
            public final Uri f61978a;

            {
                this.f61978a = uri;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri2 = this.f61978a;
                ow2 ow2Var = d2.f61866i;
                wg.t.d();
                return d2.r(uri2);
            }
        }, this.f61875h);
    }

    public final void U(Context context, String str, String str2, Bundle bundle, boolean z10) {
        wg.t.d();
        bundle.putString("device", e0());
        bundle.putString("eids", TextUtils.join(",", ox.c()));
        dt.a();
        nj0.p(context, str, "gmob-apps", bundle, true, new y1(this, context, str));
    }

    public final boolean W(String str) {
        return F(str, this.f61868a, (String) ft.c().c(ox.W));
    }

    public final boolean X(String str) {
        return F(str, this.f61869b, (String) ft.c().c(ox.X));
    }

    @TargetApi(26)
    public final void Y(Context context) {
        if (vh.n.k()) {
            if (((Boolean) ft.c().c(ox.f7953b6)).booleanValue()) {
                ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new z1(this));
            }
        }
    }

    @TargetApi(18)
    public final int Z(Context context, Uri uri) {
        int i10;
        if (context == null) {
            p1.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!vh.n.e()) {
            p1.k("Chrome Custom Tabs can only work with version Jellybean onwards.");
            i10 = 1;
        } else if (context instanceof Activity) {
            i10 = 0;
        } else {
            p1.k("Chrome Custom Tabs can only work with Activity context.");
            i10 = 2;
        }
        gx<Boolean> gxVar = ox.W2;
        gx<Boolean> gxVar2 = ox.X2;
        if (true == ((Boolean) ft.c().c(gxVar)).equals(ft.c().c(gxVar2))) {
            i10 = 9;
        }
        if (i10 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i10;
        }
        if (((Boolean) ft.c().c(gxVar)).booleanValue()) {
            ny nyVar = new ny();
            nyVar.d(new w1(this, nyVar, context, uri));
            nyVar.e((Activity) context);
        }
        if (((Boolean) ft.c().c(gxVar2)).booleanValue()) {
            p.d a10 = new d.a().a();
            a10.f45629a.setPackage(fo3.a(context));
            a10.a(context, uri);
            return 5;
        }
        return 5;
    }
}
