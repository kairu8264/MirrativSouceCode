package pi;

import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class x8 extends r9 {

    /* renamed from: d  reason: collision with root package name */
    public String f48348d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f48349e;

    /* renamed from: f  reason: collision with root package name */
    public long f48350f;

    /* renamed from: g  reason: collision with root package name */
    public final b4 f48351g;

    /* renamed from: h  reason: collision with root package name */
    public final b4 f48352h;

    /* renamed from: i  reason: collision with root package name */
    public final b4 f48353i;

    /* renamed from: j  reason: collision with root package name */
    public final b4 f48354j;

    /* renamed from: k  reason: collision with root package name */
    public final b4 f48355k;

    public x8(ba baVar) {
        super(baVar);
        g4 E = this.f48285a.E();
        E.getClass();
        this.f48351g = new b4(E, "last_delete_stale", 0L);
        g4 E2 = this.f48285a.E();
        E2.getClass();
        this.f48352h = new b4(E2, "backoff", 0L);
        g4 E3 = this.f48285a.E();
        E3.getClass();
        this.f48353i = new b4(E3, "last_upload", 0L);
        g4 E4 = this.f48285a.E();
        E4.getClass();
        this.f48354j = new b4(E4, "last_upload_attempt", 0L);
        g4 E5 = this.f48285a.E();
        E5.getClass();
        this.f48355k = new b4(E5, "midnight_offset", 0L);
    }

    @Override // pi.r9
    public final boolean j() {
        return false;
    }

    @Deprecated
    public final Pair<String, Boolean> k(String str) {
        f();
        long elapsedRealtime = this.f48285a.c().elapsedRealtime();
        String str2 = this.f48348d;
        if (str2 != null && elapsedRealtime < this.f48350f) {
            return new Pair<>(str2, Boolean.valueOf(this.f48349e));
        }
        this.f48350f = elapsedRealtime + this.f48285a.y().p(str, c3.f47692c);
        AdvertisingIdClient.c(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f48285a.F());
            this.f48348d = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.f48348d = id2;
            }
            this.f48349e = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e10) {
            this.f48285a.r().o().b("Unable to get advertising id", e10);
            this.f48348d = "";
        }
        AdvertisingIdClient.c(false);
        return new Pair<>(this.f48348d, Boolean.valueOf(this.f48349e));
    }

    public final Pair<String, Boolean> l(String str, h hVar) {
        if (hVar.j()) {
            return k(str);
        }
        return new Pair<>("", Boolean.FALSE);
    }

    @Deprecated
    public final String m(String str) {
        f();
        String str2 = (String) k(str).first;
        MessageDigest q10 = ia.q();
        if (q10 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, q10.digest(str2.getBytes())));
    }
}
