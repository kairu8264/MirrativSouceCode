package ph;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import oh.b;

/* loaded from: classes3.dex */
public final class p implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f47543a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f47544b;

    public p(r rVar, BasePendingResult basePendingResult) {
        this.f47544b = rVar;
        this.f47543a = basePendingResult;
    }

    @Override // oh.b.a
    public final void a(Status status) {
        Map map;
        map = this.f47544b.f47550a;
        map.remove(this.f47543a);
    }
}
