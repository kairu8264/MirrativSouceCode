package hi;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class q6<T> {

    /* renamed from: h  reason: collision with root package name */
    public static volatile o6 f35944h;

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f35948l = 0;

    /* renamed from: a  reason: collision with root package name */
    public final n6 f35949a;

    /* renamed from: b  reason: collision with root package name */
    public final String f35950b;

    /* renamed from: c  reason: collision with root package name */
    public final T f35951c;

    /* renamed from: d  reason: collision with root package name */
    public volatile int f35952d = -1;

    /* renamed from: e  reason: collision with root package name */
    public volatile T f35953e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f35954f;

    /* renamed from: g  reason: collision with root package name */
    public static final Object f35943g = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReference<Collection<q6<?>>> f35945i = new AtomicReference<>();

    /* renamed from: j  reason: collision with root package name */
    public static final s6 f35946j = new s6(h6.f35798a, null);

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicInteger f35947k = new AtomicInteger();

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ q6(n6 n6Var, String str, Object obj, boolean z10, p6 p6Var) {
        if (n6Var.f35864b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f35949a = n6Var;
        this.f35950b = str;
        this.f35951c = obj;
        this.f35954f = true;
    }

    @Deprecated
    public static void d(final Context context) {
        synchronized (f35943g) {
            o6 o6Var = f35944h;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (o6Var == null || o6Var.a() != context) {
                w5.d();
                r6.b();
                d6.d();
                f35944h = new s5(context, c7.a(new y6() { // from class: hi.i6
                    @Override // hi.y6
                    public final Object zza() {
                        v6 c10;
                        v6 c11;
                        Context context2 = context;
                        int i10 = q6.f35948l;
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                            return v6.c();
                        }
                        if (r5.a() && !context2.isDeviceProtectedStorage()) {
                            context2 = context2.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                                c10 = file.exists() ? v6.d(file) : v6.c();
                            } catch (RuntimeException e10) {
                                Log.e("HermeticFileOverrides", "no data dir", e10);
                                c10 = v6.c();
                            }
                            if (c10.b()) {
                                File file2 = (File) c10.a();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        HashMap hashMap = new HashMap();
                                        HashMap hashMap2 = new HashMap();
                                        while (true) {
                                            String readLine = bufferedReader.readLine();
                                            if (readLine == null) {
                                                break;
                                            }
                                            String[] split = readLine.split(" ", 3);
                                            if (split.length != 3) {
                                                Log.e("HermeticFileOverrides", readLine.length() != 0 ? "Invalid: ".concat(readLine) : new String("Invalid: "));
                                            } else {
                                                String str3 = new String(split[0]);
                                                String decode = Uri.decode(new String(split[1]));
                                                String str4 = (String) hashMap2.get(split[2]);
                                                if (str4 == null) {
                                                    String str5 = new String(split[2]);
                                                    str4 = Uri.decode(str5);
                                                    if (str4.length() < 1024 || str4 == str5) {
                                                        hashMap2.put(str5, str4);
                                                    }
                                                }
                                                if (!hashMap.containsKey(str3)) {
                                                    hashMap.put(str3, new HashMap());
                                                }
                                                ((Map) hashMap.get(str3)).put(decode, str4);
                                            }
                                        }
                                        String obj = file2.toString();
                                        StringBuilder sb2 = new StringBuilder(obj.length() + 7);
                                        sb2.append("Parsed ");
                                        sb2.append(obj);
                                        Log.i("HermeticFileOverrides", sb2.toString());
                                        e6 e6Var = new e6(hashMap);
                                        bufferedReader.close();
                                        c11 = v6.d(e6Var);
                                    } catch (Throwable th2) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable unused) {
                                        }
                                        throw th2;
                                    }
                                } catch (IOException e11) {
                                    throw new RuntimeException(e11);
                                }
                            } else {
                                c11 = v6.c();
                            }
                            return c11;
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    }
                }));
                f35947k.incrementAndGet();
            }
        }
    }

    public static void e() {
        f35947k.incrementAndGet();
    }

    public abstract T a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6 A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T b() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hi.q6.b():java.lang.Object");
    }

    public final String c() {
        String str = this.f35949a.f35866d;
        return this.f35950b;
    }
}
