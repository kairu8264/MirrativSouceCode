package hi;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class q5 {

    /* renamed from: f  reason: collision with root package name */
    public static HashMap<String, String> f35935f;

    /* renamed from: k  reason: collision with root package name */
    public static Object f35940k;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f35941l;

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f35930a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f35931b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f35932c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f35933d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicBoolean f35934e = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    public static final HashMap<String, Boolean> f35936g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap<String, Integer> f35937h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap<String, Long> f35938i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap<String, Float> f35939j = new HashMap<>();

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f35942m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (q5.class) {
            if (f35935f == null) {
                f35934e.set(false);
                f35935f = new HashMap<>();
                f35940k = new Object();
                f35941l = false;
                contentResolver.registerContentObserver(f35930a, true, new p5(null));
            } else if (f35934e.getAndSet(false)) {
                f35935f.clear();
                f35936g.clear();
                f35937h.clear();
                f35938i.clear();
                f35939j.clear();
                f35940k = new Object();
                f35941l = false;
            }
            Object obj = f35940k;
            if (f35935f.containsKey(str)) {
                String str3 = f35935f.get(str);
                if (str3 != null) {
                    r3 = str3;
                }
                return r3;
            }
            int length = f35942m.length;
            Cursor query = contentResolver.query(f35930a, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    c(obj, str, null);
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                c(obj, str, string);
                return string != null ? string : null;
            } finally {
                query.close();
            }
        }
    }

    public static void c(Object obj, String str, String str2) {
        synchronized (q5.class) {
            if (obj == f35940k) {
                f35935f.put(str, str2);
            }
        }
    }
}
