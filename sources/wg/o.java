package wg;

import ai.u;
import ai.zj0;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class o implements Callable<u> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f58719a;

    public o(s sVar) {
        this.f58719a = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ u call() throws Exception {
        zj0 zj0Var;
        Context context;
        zj0Var = this.f58719a.f58727w;
        String str = zj0Var.f13013w;
        context = this.f58719a.f58730z;
        return new u(ai.t.v(str, context, false));
    }
}
