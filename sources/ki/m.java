package ki;

import com.google.android.gms.common.api.Status;
import ri.d;

/* loaded from: classes3.dex */
public final class m implements d.b {

    /* renamed from: w  reason: collision with root package name */
    public final Status f38823w;

    /* renamed from: x  reason: collision with root package name */
    public final ri.f f38824x;

    public m(Status status, ri.f fVar) {
        this.f38823w = status;
        this.f38824x = fVar;
    }

    @Override // oh.e
    public final Status d() {
        return this.f38823w;
    }

    @Override // ri.d.b
    public final String j() {
        ri.f fVar = this.f38824x;
        if (fVar == null) {
            return null;
        }
        return fVar.p();
    }
}
