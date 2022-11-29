package p6;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.google.android.exoplayer2.C;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class c1 {

    /* renamed from: a  reason: collision with root package name */
    public static final DecimalFormat f45890a = U();

    /* renamed from: b  reason: collision with root package name */
    public static final SimpleDateFormat f45891b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z", Locale.US);

    /* renamed from: c  reason: collision with root package name */
    public static volatile r6.e f45892c = null;

    /* loaded from: classes.dex */
    public static class a implements Callable<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f45893a;

        public a(Context context) {
            this.f45893a = context;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            try {
                return u0.e(this.f45893a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Callable<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f45894a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f45895b;

        public b(Context context, Object obj) {
            this.f45894a = context;
            this.f45895b = obj;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            return u0.h(this.f45894a, this.f45895b);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f45896a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f45897b;

        public c(Context context, Object obj) {
            this.f45896a = context;
            this.f45897b = obj;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            return u0.l(this.f45896a, this.f45897b);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends r6.a<Object, Void> {
        @Override // r6.a
        /* renamed from: e */
        public Void a(Object... objArr) {
            ((Runnable) objArr[0]).run();
            return null;
        }
    }

    public static String A(String str) {
        String[] split;
        if (str != null && str.contains("@") && (split = str.split("@")) != null && split.length == 2) {
            return split[0];
        }
        return null;
    }

    public static String B(String str) {
        String[] split;
        String A = A(str);
        if (A == null || (split = A.split("\\d+", 2)) == null || split.length == 0) {
            return null;
        }
        return split[0];
    }

    public static String[] C() {
        if (Build.VERSION.SDK_INT >= 21) {
            return Build.SUPPORTED_ABIS;
        }
        return null;
    }

    public static long D(int i10, t tVar) {
        int i11 = tVar.minRetries;
        if (i10 < i11) {
            return 0L;
        }
        return (long) (Math.min(((long) Math.pow(2.0d, i10 - i11)) * tVar.milliSecondMultiplier, tVar.maxWait) * V(tVar.minRange, tVar.maxRange));
    }

    public static boolean E(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString().contains("Caused by:");
    }

    public static String F(String str, String str2) {
        try {
            byte[] bytes = str.getBytes(C.UTF8_NAME);
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes, 0, bytes.length);
            return b(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    public static int G(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public static int H(Double d10) {
        if (d10 == null) {
            return 0;
        }
        return d10.hashCode();
    }

    public static int I(Enum r02) {
        if (r02 == null) {
            return 0;
        }
        return r02.hashCode();
    }

    public static int J(Long l10) {
        if (l10 == null) {
            return 0;
        }
        return l10.hashCode();
    }

    public static int K(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int L(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static boolean M(t0 t0Var, p6.d dVar) {
        return t0Var.f46089b == dVar.N && t0Var.f46090c == dVar.O && t0Var.f46091d == dVar.R && t0Var.f46092e == dVar.S && i(t0Var.f46088a, dVar.P) && i(t0Var.f46093f, dVar.T) && d(t0Var.f46094g, dVar.Q);
    }

    public static boolean N(t0 t0Var, p6.d dVar) {
        return t0Var.f46089b == dVar.U && t0Var.f46090c == dVar.V && i(t0Var.f46088a, dVar.W);
    }

    public static boolean O(t0 t0Var, p6.d dVar) {
        return t0Var.f46089b == dVar.U && t0Var.f46090c == dVar.V && i(t0Var.f46088a, dVar.X);
    }

    public static boolean P(t0 t0Var, String str, p6.d dVar) {
        if (str.equals("google")) {
            return M(t0Var, dVar);
        }
        if (str.equals("huawei_ads")) {
            return N(t0Var, dVar);
        }
        if (str.equals("huawei_app_gallery")) {
            return O(t0Var, dVar);
        }
        return false;
    }

    public static Boolean Q(Context context, Object obj, long j10) {
        return (Boolean) Z(context, new c(context, obj), j10);
    }

    public static boolean R(Uri uri) {
        String uri2;
        return uri == null || (uri2 = uri.toString()) == null || uri2.length() == 0 || uri2.matches("^(fb|vk)[0-9]{5,}[^:]*://authorize.*access_token=.*");
    }

    public static String S(String str) {
        return F(str, "MD5");
    }

    public static Map<String, String> T(Map<String, String> map, Map<String, String> map2, String str) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        HashMap hashMap = new HashMap(map);
        z s10 = s();
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String str2 = (String) hashMap.put(entry.getKey(), entry.getValue());
            if (str2 != null) {
                s10.b("Key %s with value %s from %s parameter was replaced by value %s", entry.getKey(), str2, str, entry.getValue());
            }
        }
        return hashMap;
    }

    public static DecimalFormat U() {
        return new DecimalFormat("0.0", new DecimalFormatSymbols(Locale.US));
    }

    public static double V(double d10, double d11) {
        return (new Random().nextDouble() * (d11 - d10)) + d10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T W(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.Class<T> r10) {
        /*
            r0 = 0
            r1 = 2
            r2 = 0
            r3 = 1
            java.io.FileInputStream r7 = r7.openFileInput(r8)     // Catch: java.lang.Exception -> L7d java.io.FileNotFoundException -> L8f
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r8.<init>(r7)     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L71
            r7.<init>(r8)     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L71
            java.lang.Object r8 = r7.readObject()     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            java.lang.Object r0 = r10.cast(r8)     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            p6.z r8 = s()     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            java.lang.String r10 = "Read %s: %s"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            r4[r2] = r9     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            r4[r3] = r0     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            r8.d(r10, r4)     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            goto La0
        L2b:
            r8 = move-exception
            p6.z r10 = s()     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            java.lang.String r4 = "Failed to read %s object (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r5[r2] = r9     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r5[r3] = r8     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r10.c(r4, r5)     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            goto La0
        L41:
            r8 = move-exception
            p6.z r10 = s()     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            java.lang.String r4 = "Failed to cast %s object (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r5[r2] = r9     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r5[r3] = r8     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r10.c(r4, r5)     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            goto La0
        L56:
            r8 = move-exception
            p6.z r10 = s()     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            java.lang.String r4 = "Failed to find %s class (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r5[r2] = r9     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r5[r3] = r8     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r10.c(r4, r5)     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            goto La0
        L6b:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r0
            r0 = r6
            goto L7f
        L71:
            r7 = r0
            r0 = r8
            goto L90
        L74:
            r8 = move-exception
            r6 = r0
            r0 = r7
            r7 = r6
            goto L7f
        L79:
            r6 = r0
            r0 = r7
            r7 = r6
            goto L90
        L7d:
            r8 = move-exception
            r7 = r0
        L7f:
            p6.z r10 = s()
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r2] = r9
            r4[r3] = r8
            java.lang.String r8 = "Failed to open %s file for reading (%s)"
            r10.c(r8, r4)
            goto L9d
        L8f:
            r7 = r0
        L90:
            p6.z r8 = s()
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r2] = r9
            java.lang.String r4 = "%s file not found"
            r8.d(r4, r10)
        L9d:
            r6 = r0
            r0 = r7
            r7 = r6
        La0:
            if (r7 == 0) goto Lb6
            r7.close()     // Catch: java.lang.Exception -> La6
            goto Lb6
        La6:
            r7 = move-exception
            p6.z r8 = s()
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r2] = r9
            r10[r3] = r7
            java.lang.String r7 = "Failed to close %s file for reading (%s)"
            r8.c(r7, r10)
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.c1.W(android.content.Context, java.lang.String, java.lang.String, java.lang.Class):java.lang.Object");
    }

    public static boolean X(Context context, String str) {
        try {
            return context.getPackageManager().resolveContentProvider(str, 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void Y(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            runnable.run();
        } else {
            new d().b(runnable);
        }
    }

    public static <R> R Z(Context context, Callable<R> callable, long j10) {
        if (f45892c == null) {
            synchronized (c1.class) {
                if (f45892c == null) {
                    f45892c = new r6.e("PlayAdIdLibrary", true);
                }
            }
        }
        try {
            return (R) f45892c.c(callable, 0L).get(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    public static boolean a(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e10) {
            s().d("Unable to check permission '%s' with message (%s)", str, e10.getMessage());
            return false;
        }
    }

    public static String a0(String str) {
        return F(str, "SHA-1");
    }

    public static String b(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return k("%0" + (bArr.length << 1) + "x", bigInteger);
    }

    public static String b0(String str) {
        return F(str, "SHA-256");
    }

    public static String c() {
        return UUID.randomUUID().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> void c0(T r5, android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r7, r2)     // Catch: java.lang.Exception -> L37
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> L35
            r7.<init>(r6)     // Catch: java.lang.Exception -> L35
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch: java.lang.Exception -> L32
            r6.<init>(r7)     // Catch: java.lang.Exception -> L32
            r6.writeObject(r5)     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L35
            p6.z r7 = s()     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L35
            java.lang.String r3 = "Wrote %s: %s"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L35
            r4[r2] = r8     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L35
            r4[r1] = r5     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L35
            r7.d(r3, r4)     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L35
            goto L48
        L24:
            p6.z r5 = s()     // Catch: java.lang.Exception -> L35
            java.lang.String r7 = "Failed to serialize %s"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L35
            r3[r2] = r8     // Catch: java.lang.Exception -> L35
            r5.c(r7, r3)     // Catch: java.lang.Exception -> L35
            goto L48
        L32:
            r5 = move-exception
            r6 = r7
            goto L39
        L35:
            r5 = move-exception
            goto L39
        L37:
            r5 = move-exception
            r6 = 0
        L39:
            p6.z r7 = s()
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r2] = r8
            r3[r1] = r5
            java.lang.String r5 = "Failed to open %s for writing (%s)"
            r7.c(r5, r3)
        L48:
            if (r6 == 0) goto L5e
            r6.close()     // Catch: java.lang.Exception -> L4e
            goto L5e
        L4e:
            r5 = move-exception
            p6.z r6 = s()
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r7[r2] = r8
            r7[r1] = r5
            java.lang.String r5 = "Failed to close %s file for writing (%s)"
            r6.c(r5, r7)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.c1.c0(java.lang.Object, android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static boolean d(Boolean bool, Boolean bool2) {
        return h(bool, bool2);
    }

    public static boolean e(Enum r02, Enum r12) {
        return h(r02, r12);
    }

    public static boolean f(Integer num, Integer num2) {
        return h(num, num2);
    }

    public static boolean g(Long l10, Long l11) {
        return h(l10, l11);
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean i(String str, String str2) {
        return h(str, str2);
    }

    public static boolean j(Double d10, Double d11) {
        return (d10 == null || d11 == null) ? d10 == null && d11 == null : Double.doubleToLongBits(d10.doubleValue()) == Double.doubleToLongBits(d11.doubleValue());
    }

    public static String k(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Object l(Context context, long j10) {
        return Z(context, new a(context), j10);
    }

    public static String m(Context context) {
        return q.a(context);
    }

    public static int n(Context context) {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e10) {
            s().b("Couldn't read connectivity type (%s)", e10.getMessage());
        }
        if (connectivityManager == null) {
            return -1;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            return connectivityManager.getActiveNetworkInfo().getType();
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return -1;
        }
        if (networkCapabilities.hasTransport(1)) {
            return 1;
        }
        if (networkCapabilities.hasTransport(0)) {
            return 0;
        }
        if (networkCapabilities.hasTransport(3)) {
            return 3;
        }
        if (networkCapabilities.hasTransport(4)) {
            return 4;
        }
        if (networkCapabilities.hasTransport(2)) {
            return 2;
        }
        if (i10 < 26) {
            return -1;
        }
        if (networkCapabilities.hasTransport(5)) {
            return 5;
        }
        return (i10 >= 27 && networkCapabilities.hasTransport(6)) ? 6 : -1;
    }

    public static String o() {
        if (Build.VERSION.SDK_INT < 21) {
            return Build.CPU_ABI;
        }
        return null;
    }

    public static String p(ContentResolver contentResolver) {
        if (contentResolver == null) {
            return null;
        }
        try {
            return Settings.Secure.getString(contentResolver, LogBase.ADVERTISING_ID);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Boolean q(ContentResolver contentResolver) {
        try {
            return Boolean.valueOf(Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Locale r(Configuration configuration) {
        LocaleList locales;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || (locales = configuration.getLocales()) == null || locales.isEmpty()) {
            if (i10 < 24) {
                return configuration.locale;
            }
            return null;
        }
        return locales.get(0);
    }

    public static z s() {
        return k.h();
    }

    public static String t(Context context) {
        return i0.a(context);
    }

    public static String u(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            if (TextUtils.isEmpty(networkOperator)) {
                k.h().b("Couldn't receive networkOperator string to read MCC", new Object[0]);
                return null;
            }
            return networkOperator.substring(0, 3);
        } catch (Exception unused) {
            k.h().b("Couldn't return mcc", new Object[0]);
            return null;
        }
    }

    public static String v(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            if (TextUtils.isEmpty(networkOperator)) {
                k.h().b("Couldn't receive networkOperator string to read MNC", new Object[0]);
                return null;
            }
            return networkOperator.substring(3);
        } catch (Exception unused) {
            k.h().b("Couldn't return mnc", new Object[0]);
            return null;
        }
    }

    public static int w(Context context) {
        int networkType;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (Build.VERSION.SDK_INT >= 30) {
                networkType = telephonyManager.getDataNetworkType();
            } else {
                networkType = telephonyManager.getNetworkType();
            }
            return networkType;
        } catch (Exception e10) {
            s().b("Couldn't read network type (%s)", e10.getMessage());
            return -1;
        }
    }

    public static String x(Context context, Object obj, long j10) {
        return (String) Z(context, new b(context, obj), j10);
    }

    public static String y(String str, Throwable th2) {
        if (th2 != null) {
            return k("%s: %s", str, th2);
        }
        return k("%s", str);
    }

    public static String z(Exception exc) {
        if (E(exc)) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            int indexOf = stringWriter2.indexOf("Caused by:");
            return stringWriter2.substring(indexOf, stringWriter2.indexOf("\n", indexOf));
        }
        return null;
    }
}
