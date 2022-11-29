package ph;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final Map<BasePendingResult<?>, Boolean> f47550a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final Map<vi.h<?>, Boolean> f47551b = Collections.synchronizedMap(new WeakHashMap());

    public final void c(BasePendingResult<? extends oh.e> basePendingResult, boolean z10) {
        this.f47550a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.a(new p(this, basePendingResult));
    }

    public final <TResult> void d(vi.h<TResult> hVar, boolean z10) {
        this.f47551b.put(hVar, Boolean.valueOf(z10));
        hVar.a().c(new q(this, hVar));
    }

    public final void e(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        h(true, new Status(20, sb2.toString()));
    }

    public final void f() {
        h(false, e.N);
    }

    public final boolean g() {
        return (this.f47550a.isEmpty() && this.f47551b.isEmpty()) ? false : true;
    }

    public final void h(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f47550a) {
            hashMap = new HashMap(this.f47550a);
        }
        synchronized (this.f47551b) {
            hashMap2 = new HashMap(this.f47551b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).d(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((vi.h) entry2.getKey()).d(new ApiException(status));
            }
        }
    }
}
