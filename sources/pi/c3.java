package pi;

import android.content.Context;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class c3 {
    public static final b3<Long> A;
    public static final b3<Boolean> A0;
    public static final b3<Long> B;
    public static final b3<Boolean> B0;
    public static final b3<Long> C;
    public static final b3<Boolean> C0;
    public static final b3<Integer> D;
    public static final b3<Boolean> D0;
    public static final b3<Long> E;
    public static final b3<Boolean> E0;
    public static final b3<Integer> F;
    public static final b3<Integer> G;
    public static final b3<Integer> H;
    public static final b3<Integer> I;
    public static final b3<Integer> J;
    public static final b3<Long> K;
    public static final b3<Boolean> L;
    public static final b3<String> M;
    public static final b3<Long> N;
    public static final b3<Integer> O;
    public static final b3<Double> P;
    public static final b3<Integer> Q;
    public static final b3<Integer> R;
    public static final b3<Long> S;
    public static final b3<Boolean> T;
    public static final b3<Boolean> U;
    public static final b3<Boolean> V;
    public static final b3<Boolean> W;
    public static final b3<Boolean> X;
    public static final b3<Boolean> Y;
    public static final b3<Boolean> Z;

    /* renamed from: a0 */
    public static final b3<Boolean> f47689a0;

    /* renamed from: b0 */
    public static final b3<Boolean> f47691b0;

    /* renamed from: c0 */
    public static final b3<Boolean> f47693c0;

    /* renamed from: d0 */
    public static final b3<Boolean> f47695d0;

    /* renamed from: e0 */
    public static final b3<Boolean> f47697e0;

    /* renamed from: f0 */
    public static final b3<Boolean> f47699f0;

    /* renamed from: g0 */
    public static final b3<Boolean> f47701g0;

    /* renamed from: h0 */
    public static final b3<Boolean> f47703h0;

    /* renamed from: i */
    public static final b3<Integer> f47704i;

    /* renamed from: i0 */
    public static final b3<Boolean> f47705i0;

    /* renamed from: j */
    public static final b3<Integer> f47706j;

    /* renamed from: j0 */
    public static final b3<Boolean> f47707j0;

    /* renamed from: k */
    public static final b3<Integer> f47708k;

    /* renamed from: k0 */
    public static final b3<Boolean> f47709k0;

    /* renamed from: l */
    public static final b3<Integer> f47710l;

    /* renamed from: l0 */
    public static final b3<Boolean> f47711l0;

    /* renamed from: m */
    public static final b3<Integer> f47712m;

    /* renamed from: m0 */
    public static final b3<Boolean> f47713m0;

    /* renamed from: n */
    public static final b3<Integer> f47714n;

    /* renamed from: n0 */
    public static final b3<Boolean> f47715n0;

    /* renamed from: o */
    public static final b3<Integer> f47716o;

    /* renamed from: o0 */
    public static final b3<Boolean> f47717o0;

    /* renamed from: p */
    public static final b3<Integer> f47718p;

    /* renamed from: p0 */
    public static final b3<Integer> f47719p0;

    /* renamed from: q */
    public static final b3<Integer> f47720q;

    /* renamed from: q0 */
    public static final b3<Boolean> f47721q0;

    /* renamed from: r */
    public static final b3<String> f47722r;

    /* renamed from: r0 */
    public static final b3<Boolean> f47723r0;

    /* renamed from: s */
    public static final b3<Long> f47724s;

    /* renamed from: s0 */
    public static final b3<Boolean> f47725s0;

    /* renamed from: t */
    public static final b3<Long> f47726t;

    /* renamed from: t0 */
    public static final b3<Boolean> f47727t0;

    /* renamed from: u */
    public static final b3<Long> f47728u;

    /* renamed from: u0 */
    public static final b3<Boolean> f47729u0;

    /* renamed from: v */
    public static final b3<Long> f47730v;

    /* renamed from: v0 */
    public static final b3<Boolean> f47731v0;

    /* renamed from: w */
    public static final b3<Long> f47732w;

    /* renamed from: w0 */
    public static final b3<Boolean> f47733w0;

    /* renamed from: x */
    public static final b3<Long> f47734x;

    /* renamed from: x0 */
    public static final b3<Boolean> f47735x0;

    /* renamed from: y */
    public static final b3<Long> f47736y;

    /* renamed from: y0 */
    public static final b3<Boolean> f47737y0;

    /* renamed from: z */
    public static final b3<Long> f47738z;

    /* renamed from: z0 */
    public static final b3<Boolean> f47739z0;

    /* renamed from: a */
    public static final List<b3<?>> f47688a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public static final Set<b3<?>> f47690b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    public static final b3<Long> f47692c = a("measurement.ad_id_cache_time", 10000L, 10000L, w.f48298a);

    /* renamed from: d */
    public static final b3<Long> f47694d = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, i0.f47926a);

    /* renamed from: e */
    public static final b3<Long> f47696e = a("measurement.config.cache_time", 86400000L, 3600000L, z.f48393a);

    /* renamed from: f */
    public static final b3<String> f47698f = a("measurement.config.url_scheme", "https", "https", m0.f48036a);

    /* renamed from: g */
    public static final b3<String> f47700g = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", y0.f48366a);

    /* renamed from: h */
    public static final b3<Integer> f47702h = a("measurement.upload.max_bundles", 100, 100, l1.f48013a);

    static {
        Integer valueOf = Integer.valueOf((int) C.DEFAULT_BUFFER_SEGMENT_SIZE);
        f47704i = a("measurement.upload.max_batch_size", valueOf, valueOf, x1.f48334a);
        f47706j = a("measurement.upload.max_bundle_size", valueOf, valueOf, k2.f47995a);
        f47708k = a("measurement.upload.max_events_per_bundle", 1000, 1000, t2.f48224a);
        Integer valueOf2 = Integer.valueOf((int) AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND);
        f47710l = a("measurement.upload.max_events_per_day", valueOf2, valueOf2, u2.f48256a);
        f47712m = a("measurement.upload.max_error_events_per_day", 1000, 1000, t0.f48222a);
        f47714n = a("measurement.upload.max_public_events_per_day", 50000, 50000, f1.f47797a);
        f47716o = a("measurement.upload.max_conversions_per_day", 10000, 10000, q1.f48153a);
        f47718p = a("measurement.upload.max_realtime_events_per_day", 10, 10, b2.f47605a);
        f47720q = a("measurement.store.max_stored_events_per_app", valueOf2, valueOf2, n2.f48060a);
        f47722r = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", v2.f48278a);
        f47724s = a("measurement.upload.backoff_period", 43200000L, 43200000L, w2.f48301a);
        f47726t = a("measurement.upload.window_interval", 3600000L, 3600000L, x2.f48335a);
        f47728u = a("measurement.upload.interval", 3600000L, 3600000L, x.f48332a);
        f47730v = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, y.f48365a);
        f47732w = a("measurement.upload.debug_upload_interval", 1000L, 1000L, a0.f47576a);
        f47734x = a("measurement.upload.minimum_delay", 500L, 500L, c0.f47684a);
        Long valueOf3 = Long.valueOf((long) DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
        f47736y = a("measurement.alarm_manager.minimum_interval", valueOf3, valueOf3, d0.f47751a);
        f47738z = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, e0.f47773a);
        A = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, f0.f47796a);
        B = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, g0.f47819a);
        C = a("measurement.upload.retry_time", 1800000L, 1800000L, h0.f47887a);
        D = a("measurement.upload.retry_count", 6, 6, j0.f47963a);
        E = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, k0.f47993a);
        F = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, l0.f48012a);
        G = a("measurement.audience.filter_result_max_count", 200, 200, n0.f48058a);
        H = a("measurement.upload.max_public_user_properties", 25, 25, null);
        I = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        J = a("measurement.upload.max_public_event_params", 25, 25, null);
        Long valueOf4 = Long.valueOf((long) DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        K = a("measurement.service_client.idle_disconnect_millis", valueOf4, valueOf4, o0.f48089a);
        Boolean bool = Boolean.FALSE;
        L = a("measurement.test.boolean_flag", bool, bool, p0.f48116a);
        M = a("measurement.test.string_flag", "---", "---", q0.f48152a);
        N = a("measurement.test.long_flag", -1L, -1L, r0.f48182a);
        O = a("measurement.test.int_flag", -2, -2, s0.f48210a);
        Double valueOf5 = Double.valueOf(-3.0d);
        P = a("measurement.test.double_flag", valueOf5, valueOf5, u0.f48254a);
        Q = a("measurement.experiment.max_ids", 50, 50, v0.f48276a);
        R = a("measurement.max_bundles_per_iteration", 100, 100, w0.f48299a);
        S = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, x0.f48333a);
        T = a("measurement.validation.internal_limits_internal_event_params", bool, bool, z0.f48394a);
        Boolean bool2 = Boolean.TRUE;
        U = a("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, a1.f47577a);
        V = a("measurement.collection.redundant_engagement_removal_enabled", bool, bool, b1.f47604a);
        W = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, d1.f47752a);
        X = a("measurement.quality.checksum", bool, bool, null);
        Y = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, e1.f47774a);
        Z = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, g1.f47820a);
        f47689a0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, h1.f47888a);
        f47691b0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, i1.f47927a);
        f47693c0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, j1.f47964a);
        f47695d0 = a("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, k1.f47994a);
        f47697e0 = a("measurement.ga.ga_app_id", bool, bool, m1.f48037a);
        f47699f0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, n1.f48059a);
        f47701g0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, o1.f48090a);
        f47703h0 = a("measurement.lifecycle.app_backgrounded_engagement", bool, bool, p1.f48117a);
        f47705i0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, r1.f48183a);
        f47707j0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, s1.f48211a);
        f47709k0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, t1.f48223a);
        f47711l0 = a("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, u1.f48255a);
        f47713m0 = a("measurement.upload.file_truncate_fix", bool, bool, v1.f48277a);
        f47715n0 = a("measurement.collection.synthetic_data_mitigation", bool, bool, w1.f48300a);
        f47717o0 = a("measurement.androidId.delete_feature", bool2, bool2, y1.f48367a);
        f47719p0 = a("measurement.service.storage_consent_support_version", 203600, 203600, z1.f48395a);
        f47721q0 = a("measurement.client.click_identifier_control.dev", bool, bool, a2.f47578a);
        f47723r0 = a("measurement.service.click_identifier_control", bool, bool, c2.f47687a);
        f47725s0 = a("measurement.config.persist_last_modified", bool2, bool2, e2.f47775a);
        f47727t0 = a("measurement.client.consent.suppress_1p_in_ga4f_install", bool2, bool2, f2.f47798a);
        f47729u0 = a("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, g2.f47821a);
        f47731v0 = a("measurement.module.pixie.ees", bool2, bool2, h2.f47889a);
        f47733w0 = a("measurement.module.pixie.fix_array", bool2, bool2, i2.f47928a);
        f47735x0 = a("measurement.adid_zero.service", bool, bool, j2.f47965a);
        f47737y0 = a("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, l2.f48014a);
        f47739z0 = a("measurement.adid_zero.remove_lair_if_userid_cleared", bool2, bool2, m2.f48038a);
        A0 = a("measurement.adid_zero.adid_uid", bool, bool, o2.f48091a);
        B0 = a("measurement.adid_zero.app_instance_id_fix", bool2, bool2, p2.f48118a);
        C0 = a("measurement.service.refactor.package_side_screen", bool2, bool2, q2.f48154a);
        D0 = a("measurement.config.fix_feature_flags_from_config", bool2, bool2, r2.f48184a);
        E0 = a("measurement.service.event_config_fix", bool2, bool2, s2.f48212a);
    }

    public static <V> b3<V> a(String str, V v10, V v11, y2<V> y2Var) {
        b3<V> b3Var = new b3<>(str, v10, v11, y2Var, null);
        f47688a.add(b3Var);
        return b3Var;
    }

    public static Map<String, String> c(Context context) {
        hi.w5 a10 = hi.w5.a(context.getContentResolver(), hi.g6.a("com.google.android.gms.measurement"));
        return a10 == null ? Collections.emptyMap() : a10.b();
    }
}
