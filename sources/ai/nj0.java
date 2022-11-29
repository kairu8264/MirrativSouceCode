package ai;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class nj0 {

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f7362b = new ow2(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public static final String f7363c = rg.i.class.getName();

    /* renamed from: d  reason: collision with root package name */
    public static final String f7364d = zg.a.class.getName();

    /* renamed from: e  reason: collision with root package name */
    public static final String f7365e = sg.a.class.getName();

    /* renamed from: f  reason: collision with root package name */
    public static final String f7366f = sg.b.class.getName();

    /* renamed from: g  reason: collision with root package name */
    public static final String f7367g = hh.b.class.getName();

    /* renamed from: h  reason: collision with root package name */
    public static final String f7368h = rg.e.class.getName();

    /* renamed from: a  reason: collision with root package name */
    public float f7369a = -1.0f;

    public static String d(String str) {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static String f() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static Throwable g(Throwable th2) {
        if (kz.f6413f.e().booleanValue()) {
            return th2;
        }
        LinkedList linkedList = new LinkedList();
        while (th2 != null) {
            linkedList.push(th2);
            th2 = th2.getCause();
        }
        Throwable th3 = null;
        while (!linkedList.isEmpty()) {
            Throwable th4 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th4.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z10 = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (h(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z10 = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    } else {
                        arrayList.add(stackTraceElement);
                    }
                }
            }
            if (z10) {
                if (th3 == null) {
                    th3 = new Throwable(th4.getMessage());
                } else {
                    th3 = new Throwable(th4.getMessage(), th3);
                }
                th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th3;
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(kz.f6411d.e());
    }

    public static final int i(DisplayMetrics displayMetrics, int i10) {
        return (int) TypedValue.applyDimension(1, i10, displayMetrics);
    }

    public static final String j(StackTraceElement[] stackTraceElementArr, String str) {
        int i10;
        int i11;
        String str2;
        while (true) {
            i11 = i10 + 1;
            if (i11 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            String className = stackTraceElement.getClassName();
            i10 = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f7363c.equalsIgnoreCase(className) || f7364d.equalsIgnoreCase(className) || f7365e.equalsIgnoreCase(className) || f7366f.equalsIgnoreCase(className) || f7367g.equalsIgnoreCase(className) || f7368h.equalsIgnoreCase(className))) ? 0 : i11;
        }
        str2 = stackTraceElementArr[i11].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, TopicConstant.SEPARATOR);
            StringBuilder sb2 = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb2.append(stringTokenizer.nextToken());
                int i12 = 2;
                while (true) {
                    int i13 = i12 - 1;
                    if (i12 <= 0 || !stringTokenizer.hasMoreElements()) {
                        break;
                    }
                    sb2.append(TopicConstant.SEPARATOR);
                    sb2.append(stringTokenizer.nextToken());
                    i12 = i13;
                }
                str = sb2.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean k() {
        return Build.DEVICE.startsWith("generic");
    }

    public static final boolean l(Context context, int i10) {
        return nh.e.f().h(context, i10) == 0;
    }

    public static final boolean m(Context context) {
        int h10 = nh.e.f().h(context, nh.g.f43544a);
        return h10 == 0 || h10 == 2;
    }

    public static final boolean n() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int o(DisplayMetrics displayMetrics, int i10) {
        return Math.round(i10 / displayMetrics.density);
    }

    public static final void p(Context context, String str, String str2, Bundle bundle, boolean z10, mj0 mj0Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString(LogBase.OS, Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int a10 = nh.e.f().a(context);
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append(a10);
            sb2.append(".213806000");
            str = sb2.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter(TtmlNode.ATTR_ID, "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        mj0Var.v(appendQueryParameter.toString());
    }

    public static final int q(Context context, int i10) {
        return i(context.getResources().getDisplayMetrics(), i10);
    }

    public static final String r(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return d(((contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id")) == null || k()) ? "emulator" : "emulator");
    }

    public static final void s(ViewGroup viewGroup, fs fsVar, String str, int i10, int i11) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i10);
        textView.setBackgroundColor(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i10);
        int q10 = q(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(fsVar.B - q10, fsVar.f4175y - q10, 17));
        viewGroup.addView(frameLayout, fsVar.B, fsVar.f4175y);
    }

    public final int a(Context context, int i10) {
        if (this.f7369a < 0.0f) {
            synchronized (this) {
                if (this.f7369a < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f7369a = displayMetrics.density;
                }
            }
        }
        return Math.round(i10 / this.f7369a);
    }

    public final void b(ViewGroup viewGroup, fs fsVar, String str, String str2) {
        if (str2 != null) {
            uj0.f(str2);
        }
        s(viewGroup, fsVar, str, -65536, -16777216);
    }

    public final void c(ViewGroup viewGroup, fs fsVar, String str) {
        s(viewGroup, fsVar, "Ads by Google", -16777216, -1);
    }

    public final void e(Context context, String str, String str2, Bundle bundle, boolean z10) {
        p(context, str, "gmob-apps", bundle, true, new lj0(this));
    }
}
