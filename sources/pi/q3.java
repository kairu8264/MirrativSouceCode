package pi;

import android.text.TextUtils;
import android.util.Log;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public final class q3 extends w5 {

    /* renamed from: c  reason: collision with root package name */
    public char f48155c;

    /* renamed from: d  reason: collision with root package name */
    public long f48156d;

    /* renamed from: e  reason: collision with root package name */
    public String f48157e;

    /* renamed from: f  reason: collision with root package name */
    public final o3 f48158f;

    /* renamed from: g  reason: collision with root package name */
    public final o3 f48159g;

    /* renamed from: h  reason: collision with root package name */
    public final o3 f48160h;

    /* renamed from: i  reason: collision with root package name */
    public final o3 f48161i;

    /* renamed from: j  reason: collision with root package name */
    public final o3 f48162j;

    /* renamed from: k  reason: collision with root package name */
    public final o3 f48163k;

    /* renamed from: l  reason: collision with root package name */
    public final o3 f48164l;

    /* renamed from: m  reason: collision with root package name */
    public final o3 f48165m;

    /* renamed from: n  reason: collision with root package name */
    public final o3 f48166n;

    public q3(b5 b5Var) {
        super(b5Var);
        this.f48155c = (char) 0;
        this.f48156d = -1L;
        this.f48158f = new o3(this, 6, false, false);
        this.f48159g = new o3(this, 6, true, false);
        this.f48160h = new o3(this, 6, false, true);
        this.f48161i = new o3(this, 5, false, false);
        this.f48162j = new o3(this, 5, true, false);
        this.f48163k = new o3(this, 5, false, true);
        this.f48164l = new o3(this, 4, false, false);
        this.f48165m = new o3(this, 3, false, false);
        this.f48166n = new o3(this, 2, false, false);
    }

    public static String A(boolean z10, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            String str2 = obj.toString().charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb2 = new StringBuilder(str2.length() + 43 + str2.length());
            sb2.append(str2);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str2);
            sb2.append(round2);
            return sb2.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th2 = (Throwable) obj;
                StringBuilder sb3 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
                String G = G(b5.class.getCanonicalName());
                StackTraceElement[] stackTrace = th2.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i10];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && G(className).equals(G)) {
                        sb3.append(": ");
                        sb3.append(stackTraceElement);
                        break;
                    }
                    i10++;
                }
                return sb3.toString();
            } else if (!(obj instanceof p3)) {
                return z10 ? "-" : obj.toString();
            } else {
                str = ((p3) obj).f48119a;
                return str;
            }
        }
    }

    public static String G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public static Object y(String str) {
        if (str == null) {
            return null;
        }
        return new p3(str);
    }

    public static String z(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String A = A(z10, obj);
        String A2 = A(z10, obj2);
        String A3 = A(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(A)) {
            sb2.append(str2);
            sb2.append(A);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(A2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(A2);
        }
        if (!TextUtils.isEmpty(A3)) {
            sb2.append(str3);
            sb2.append(A3);
        }
        return sb2.toString();
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String B() {
        String str;
        synchronized (this) {
            if (this.f48157e == null) {
                if (this.f48285a.Q() != null) {
                    this.f48157e = this.f48285a.Q();
                } else {
                    this.f48157e = this.f48285a.y().v();
                }
            }
            rh.p.i(this.f48157e);
            str = this.f48157e;
        }
        return str;
    }

    public final void E(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(B(), i10)) {
            Log.println(i10, B(), z(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        rh.p.i(str);
        y4 G = this.f48285a.G();
        if (G == null) {
            Log.println(6, B(), "Scheduler not set. Not logging error/warn");
        } else if (!G.l()) {
            Log.println(6, B(), "Scheduler not initialized. Not logging error/warn");
        } else {
            if (i10 >= 9) {
                i10 = 8;
            }
            G.y(new n3(this, i10, str, obj, obj2, obj3));
        }
    }

    @Override // pi.w5
    public final boolean h() {
        return false;
    }

    public final o3 o() {
        return this.f48165m;
    }

    public final o3 p() {
        return this.f48158f;
    }

    public final o3 q() {
        return this.f48160h;
    }

    public final o3 s() {
        return this.f48159g;
    }

    public final o3 t() {
        return this.f48164l;
    }

    public final o3 u() {
        return this.f48166n;
    }

    public final o3 v() {
        return this.f48161i;
    }

    public final o3 w() {
        return this.f48163k;
    }

    public final o3 x() {
        return this.f48162j;
    }
}
