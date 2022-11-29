package vl;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: c  reason: collision with root package name */
    public static g f57488c;

    /* renamed from: d  reason: collision with root package name */
    public static final SimpleDateFormat f57489d = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f57490a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f57491b;

    public g(Context context) {
        this.f57490a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.f57491b = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    public static synchronized g a(Context context) {
        g gVar;
        synchronized (g.class) {
            if (f57488c == null) {
                f57488c = new g(context);
            }
            gVar = f57488c;
        }
        return gVar;
    }

    public static boolean b(long j10, long j11) {
        Date date = new Date(j10);
        Date date2 = new Date(j11);
        SimpleDateFormat simpleDateFormat = f57489d;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    public synchronized boolean c(long j10) {
        return d("fire-global", j10);
    }

    public synchronized boolean d(String str, long j10) {
        if (this.f57490a.contains(str)) {
            if (b(this.f57490a.getLong(str, -1L), j10)) {
                this.f57490a.edit().putLong(str, j10).apply();
                return true;
            }
            return false;
        }
        this.f57490a.edit().putLong(str, j10).apply();
        return true;
    }
}
