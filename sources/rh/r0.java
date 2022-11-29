package rh;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes3.dex */
public abstract class r0 extends b1<Boolean> {

    /* renamed from: d  reason: collision with root package name */
    public final int f51507d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f51508e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f51509f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(c cVar, int i10, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f51509f = cVar;
        this.f51507d = i10;
        this.f51508e = bundle;
    }

    @Override // rh.b1
    public final /* bridge */ /* synthetic */ void a(Boolean bool) {
        if (this.f51507d != 0) {
            this.f51509f.g0(1, null);
            Bundle bundle = this.f51508e;
            f(new ConnectionResult(this.f51507d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else if (g()) {
        } else {
            this.f51509f.g0(1, null);
            f(new ConnectionResult(8, null));
        }
    }

    @Override // rh.b1
    public final void b() {
    }

    public abstract void f(ConnectionResult connectionResult);

    public abstract boolean g();
}
