package ai;

import com.google.android.exoplayer2.SimpleExoPlayer;

/* loaded from: classes3.dex */
public final class pz {

    /* renamed from: a  reason: collision with root package name */
    public static final ry<Boolean> f8741a = ry.a("gads:always_collect_trustless_token_at_native_side", true);

    /* renamed from: b  reason: collision with root package name */
    public static final ry<Boolean> f8742b = ry.a("gms:expose_token_for_gma:enabled", false);

    /* renamed from: c  reason: collision with root package name */
    public static final ry<Long> f8743c = ry.b("gads:timeout_for_trustless_token:millis", SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);

    /* renamed from: d  reason: collision with root package name */
    public static final ry<Long> f8744d = ry.b("gads:cached_token:ttl_millis", 10800000);
}
