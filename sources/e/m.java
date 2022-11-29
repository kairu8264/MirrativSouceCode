package e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import java.util.Calendar;

/* loaded from: classes.dex */
public class m {

    /* renamed from: d  reason: collision with root package name */
    public static m f29981d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29982a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f29983b;

    /* renamed from: c  reason: collision with root package name */
    public final a f29984c = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f29985a;

        /* renamed from: b  reason: collision with root package name */
        public long f29986b;

        /* renamed from: c  reason: collision with root package name */
        public long f29987c;

        /* renamed from: d  reason: collision with root package name */
        public long f29988d;

        /* renamed from: e  reason: collision with root package name */
        public long f29989e;

        /* renamed from: f  reason: collision with root package name */
        public long f29990f;
    }

    public m(Context context, LocationManager locationManager) {
        this.f29982a = context;
        this.f29983b = locationManager;
    }

    public static m a(Context context) {
        if (f29981d == null) {
            Context applicationContext = context.getApplicationContext();
            f29981d = new m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f29981d;
    }

    @SuppressLint({"MissingPermission"})
    public final Location b() {
        Location c10 = c3.b.b(this.f29982a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c11 = c3.b.b(this.f29982a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c11 == null || c10 == null) ? c11 != null ? c11 : c10 : c11.getTime() > c10.getTime() ? c11 : c10;
    }

    public final Location c(String str) {
        try {
            if (this.f29983b.isProviderEnabled(str)) {
                return this.f29983b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f29984c;
        if (e()) {
            return aVar.f29985a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f29985a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }

    public final boolean e() {
        return this.f29984c.f29990f > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long j10;
        a aVar = this.f29984c;
        long currentTimeMillis = System.currentTimeMillis();
        l b10 = l.b();
        b10.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j11 = b10.f29978a;
        b10.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = b10.f29980c == 1;
        long j12 = b10.f29979b;
        long j13 = b10.f29978a;
        b10.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j14 = b10.f29979b;
        if (j12 == -1 || j13 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j13 ? 0 + j14 : currentTimeMillis > j12 ? 0 + j13 : 0 + j12) + DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS;
        }
        aVar.f29985a = z10;
        aVar.f29986b = j11;
        aVar.f29987c = j12;
        aVar.f29988d = j13;
        aVar.f29989e = j14;
        aVar.f29990f = j10;
    }
}
