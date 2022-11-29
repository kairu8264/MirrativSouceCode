package kg;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kg.d;

@AutoValue
/* loaded from: classes3.dex */
public abstract class g {

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ng.a f38758a;

        /* renamed from: b  reason: collision with root package name */
        public Map<zf.d, b> f38759b = new HashMap();

        public a a(zf.d dVar, b bVar) {
            this.f38759b.put(dVar, bVar);
            return this;
        }

        public g b() {
            Objects.requireNonNull(this.f38758a, "missing required property: clock");
            if (this.f38759b.keySet().size() >= zf.d.values().length) {
                Map<zf.d, b> map = this.f38759b;
                this.f38759b = new HashMap();
                return g.d(this.f38758a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        public a c(ng.a aVar) {
            this.f38758a = aVar;
            return this;
        }
    }

    @AutoValue
    /* loaded from: classes3.dex */
    public static abstract class b {

        @AutoValue.Builder
        /* loaded from: classes3.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new d.b().c(Collections.emptySet());
        }

        public abstract long b();

        public abstract Set<c> c();

        public abstract long d();
    }

    /* loaded from: classes3.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static g d(ng.a aVar, Map<zf.d, b> map) {
        return new kg.c(aVar, map);
    }

    public static g f(ng.a aVar) {
        return b().a(zf.d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(zf.d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(zf.d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.NETWORK_UNMETERED, c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    public static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    public final long a(int i10, long j10) {
        int i11;
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * i11)));
    }

    public JobInfo.Builder c(JobInfo.Builder builder, zf.d dVar, long j10, int i10) {
        builder.setMinimumLatency(g(dVar, j10, i10));
        j(builder, h().get(dVar).c());
        return builder;
    }

    public abstract ng.a e();

    public long g(zf.d dVar, long j10, int i10) {
        long a10 = j10 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i10, bVar.b()), a10), bVar.d());
    }

    public abstract Map<zf.d, b> h();

    public final void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
