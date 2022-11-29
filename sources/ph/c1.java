package ph;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    public final s.a<b<?>, ConnectionResult> f47469a;

    /* renamed from: b  reason: collision with root package name */
    public final s.a<b<?>, String> f47470b;

    /* renamed from: c  reason: collision with root package name */
    public final vi.h<Map<b<?>, String>> f47471c;

    /* renamed from: d  reason: collision with root package name */
    public int f47472d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f47473e;

    public final Set<b<?>> a() {
        return this.f47469a.keySet();
    }

    public final void b(b<?> bVar, ConnectionResult connectionResult, String str) {
        this.f47469a.put(bVar, connectionResult);
        this.f47470b.put(bVar, str);
        this.f47472d--;
        if (!connectionResult.k0()) {
            this.f47473e = true;
        }
        if (this.f47472d == 0) {
            if (this.f47473e) {
                this.f47471c.b(new AvailabilityException(this.f47469a));
                return;
            }
            this.f47471c.c(this.f47470b);
        }
    }
}
