package ki;

import com.google.android.gms.common.api.Status;
import ri.d;

/* loaded from: classes3.dex */
public abstract class o extends h<d.b> {

    /* renamed from: s  reason: collision with root package name */
    public final j f38826s;

    public o(com.google.android.gms.common.api.c cVar) {
        super(cVar);
        this.f38826s = new n(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ oh.e c(Status status) {
        return new m(status, null);
    }
}
