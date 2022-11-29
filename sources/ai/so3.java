package ai;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class so3 {

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicLong f9889d = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final bc f9890a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f9891b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, List<String>> f9892c;

    public so3(long j10, bc bcVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f9890a = bcVar;
        this.f9891b = uri;
        this.f9892c = map;
    }

    public static long a() {
        return f9889d.getAndIncrement();
    }
}
