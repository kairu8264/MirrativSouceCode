package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class id0 extends ji0 {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ fh.c f5188w;

    public id0(jd0 jd0Var, fh.c cVar) {
        this.f5188w = cVar;
    }

    @Override // ai.ki0
    public final void j1(String str, String str2, Bundle bundle) {
        this.f5188w.b(new fh.b(new cw(str, bundle, str2)));
    }

    @Override // ai.ki0
    public final void t(String str) {
        this.f5188w.a(str);
    }
}
