package hi;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.extractor.mp3.IndexSeeker;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;

/* loaded from: classes3.dex */
public final class cc implements bc {
    public static final q6<Long> A;
    public static final q6<Long> B;
    public static final q6<Long> C;
    public static final q6<Long> D;
    public static final q6<Long> E;
    public static final q6<Long> F;
    public static final q6<Long> G;
    public static final q6<Long> H;
    public static final q6<Long> I;
    public static final q6<Long> J;
    public static final q6<String> K;
    public static final q6<Long> L;

    /* renamed from: a  reason: collision with root package name */
    public static final q6<Long> f35688a;

    /* renamed from: b  reason: collision with root package name */
    public static final q6<Long> f35689b;

    /* renamed from: c  reason: collision with root package name */
    public static final q6<Long> f35690c;

    /* renamed from: d  reason: collision with root package name */
    public static final q6<String> f35691d;

    /* renamed from: e  reason: collision with root package name */
    public static final q6<String> f35692e;

    /* renamed from: f  reason: collision with root package name */
    public static final q6<String> f35693f;

    /* renamed from: g  reason: collision with root package name */
    public static final q6<Long> f35694g;

    /* renamed from: h  reason: collision with root package name */
    public static final q6<Long> f35695h;

    /* renamed from: i  reason: collision with root package name */
    public static final q6<Long> f35696i;

    /* renamed from: j  reason: collision with root package name */
    public static final q6<Long> f35697j;

    /* renamed from: k  reason: collision with root package name */
    public static final q6<Long> f35698k;

    /* renamed from: l  reason: collision with root package name */
    public static final q6<Long> f35699l;

    /* renamed from: m  reason: collision with root package name */
    public static final q6<Long> f35700m;

    /* renamed from: n  reason: collision with root package name */
    public static final q6<Long> f35701n;

    /* renamed from: o  reason: collision with root package name */
    public static final q6<Long> f35702o;

    /* renamed from: p  reason: collision with root package name */
    public static final q6<Long> f35703p;

    /* renamed from: q  reason: collision with root package name */
    public static final q6<Long> f35704q;

    /* renamed from: r  reason: collision with root package name */
    public static final q6<Long> f35705r;

    /* renamed from: s  reason: collision with root package name */
    public static final q6<String> f35706s;

    /* renamed from: t  reason: collision with root package name */
    public static final q6<Long> f35707t;

    /* renamed from: u  reason: collision with root package name */
    public static final q6<Long> f35708u;

    /* renamed from: v  reason: collision with root package name */
    public static final q6<Long> f35709v;

    /* renamed from: w  reason: collision with root package name */
    public static final q6<Long> f35710w;

    /* renamed from: x  reason: collision with root package name */
    public static final q6<Long> f35711x;

    /* renamed from: y  reason: collision with root package name */
    public static final q6<Long> f35712y;

    /* renamed from: z  reason: collision with root package name */
    public static final q6<Long> f35713z;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        f35688a = n6Var.c("measurement.ad_id_cache_time", 10000L);
        f35689b = n6Var.c("measurement.max_bundles_per_iteration", 100L);
        f35690c = n6Var.c("measurement.config.cache_time", 86400000L);
        f35691d = n6Var.d("measurement.log_tag", "FA");
        f35692e = n6Var.d("measurement.config.url_authority", "app-measurement.com");
        f35693f = n6Var.d("measurement.config.url_scheme", "https");
        f35694g = n6Var.c("measurement.upload.debug_upload_interval", 1000L);
        f35695h = n6Var.c("measurement.lifetimevalue.max_currency_tracked", 4L);
        f35696i = n6Var.c("measurement.store.max_stored_events_per_app", IndexSeeker.MIN_TIME_BETWEEN_POINTS_US);
        f35697j = n6Var.c("measurement.experiment.max_ids", 50L);
        f35698k = n6Var.c("measurement.audience.filter_result_max_count", 200L);
        f35699l = n6Var.c("measurement.alarm_manager.minimum_interval", DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
        f35700m = n6Var.c("measurement.upload.minimum_delay", 500L);
        f35701n = n6Var.c("measurement.monitoring.sample_period_millis", 86400000L);
        f35702o = n6Var.c("measurement.upload.realtime_upload_interval", 10000L);
        f35703p = n6Var.c("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        f35704q = n6Var.c("measurement.config.cache_time.service", 3600000L);
        f35705r = n6Var.c("measurement.service_client.idle_disconnect_millis", DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        f35706s = n6Var.d("measurement.log_tag.service", "FA-SVC");
        f35707t = n6Var.c("measurement.upload.stale_data_deletion_interval", 86400000L);
        f35708u = n6Var.c("measurement.sdk.attribution.cache.ttl", 604800000L);
        f35709v = n6Var.c("measurement.upload.backoff_period", 43200000L);
        f35710w = n6Var.c("measurement.upload.initial_upload_delay_time", 15000L);
        f35711x = n6Var.c("measurement.upload.interval", 3600000L);
        f35712y = n6Var.c("measurement.upload.max_bundle_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        f35713z = n6Var.c("measurement.upload.max_bundles", 100L);
        A = n6Var.c("measurement.upload.max_conversions_per_day", 500L);
        B = n6Var.c("measurement.upload.max_error_events_per_day", 1000L);
        C = n6Var.c("measurement.upload.max_events_per_bundle", 1000L);
        D = n6Var.c("measurement.upload.max_events_per_day", IndexSeeker.MIN_TIME_BETWEEN_POINTS_US);
        E = n6Var.c("measurement.upload.max_public_events_per_day", 50000L);
        F = n6Var.c("measurement.upload.max_queue_time", 2419200000L);
        G = n6Var.c("measurement.upload.max_realtime_events_per_day", 10L);
        H = n6Var.c("measurement.upload.max_batch_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        I = n6Var.c("measurement.upload.retry_count", 6L);
        J = n6Var.c("measurement.upload.retry_time", 1800000L);
        K = n6Var.d("measurement.upload.url", "https://app-measurement.com/a");
        L = n6Var.c("measurement.upload.window_interval", 3600000L);
    }

    @Override // hi.bc
    public final long C() {
        return A.b().longValue();
    }

    @Override // hi.bc
    public final long D() {
        return L.b().longValue();
    }

    @Override // hi.bc
    public final String G() {
        return f35693f.b();
    }

    @Override // hi.bc
    public final String I() {
        return f35692e.b();
    }

    @Override // hi.bc
    public final long J() {
        return B.b().longValue();
    }

    @Override // hi.bc
    public final long K() {
        return I.b().longValue();
    }

    @Override // hi.bc
    public final long M() {
        return J.b().longValue();
    }

    @Override // hi.bc
    public final long N() {
        return C.b().longValue();
    }

    @Override // hi.bc
    public final long O() {
        return G.b().longValue();
    }

    @Override // hi.bc
    public final String Q() {
        return K.b();
    }

    @Override // hi.bc
    public final long a() {
        return f35696i.b().longValue();
    }

    @Override // hi.bc
    public final long b() {
        return f35690c.b().longValue();
    }

    @Override // hi.bc
    public final long c() {
        return f35695h.b().longValue();
    }

    @Override // hi.bc
    public final long d() {
        return f35694g.b().longValue();
    }

    @Override // hi.bc
    public final long e() {
        return f35698k.b().longValue();
    }

    @Override // hi.bc
    public final long f() {
        return f35697j.b().longValue();
    }

    @Override // hi.bc
    public final long g() {
        return f35700m.b().longValue();
    }

    @Override // hi.bc
    public final long h() {
        return f35699l.b().longValue();
    }

    @Override // hi.bc
    public final long i() {
        return f35701n.b().longValue();
    }

    @Override // hi.bc
    public final long j() {
        return f35702o.b().longValue();
    }

    @Override // hi.bc
    public final long k() {
        return f35703p.b().longValue();
    }

    @Override // hi.bc
    public final long l() {
        return f35709v.b().longValue();
    }

    @Override // hi.bc
    public final long m() {
        return f35712y.b().longValue();
    }

    @Override // hi.bc
    public final long n() {
        return f35705r.b().longValue();
    }

    @Override // hi.bc
    public final long o() {
        return f35707t.b().longValue();
    }

    @Override // hi.bc
    public final long p() {
        return f35708u.b().longValue();
    }

    @Override // hi.bc
    public final long q() {
        return f35711x.b().longValue();
    }

    @Override // hi.bc
    public final long r() {
        return f35713z.b().longValue();
    }

    @Override // hi.bc
    public final long u() {
        return E.b().longValue();
    }

    @Override // hi.bc
    public final long w() {
        return f35710w.b().longValue();
    }

    @Override // hi.bc
    public final long x() {
        return H.b().longValue();
    }

    @Override // hi.bc
    public final long y() {
        return F.b().longValue();
    }

    @Override // hi.bc
    public final long z() {
        return D.b().longValue();
    }

    @Override // hi.bc
    public final long zza() {
        return f35688a.b().longValue();
    }

    @Override // hi.bc
    public final long zzb() {
        return f35689b.b().longValue();
    }
}
