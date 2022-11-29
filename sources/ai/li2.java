package ai;

import com.google.android.gms.internal.ads.zzeap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class li2 implements bx2<zzeap, oi2> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ pi2 f6573a;

    public li2(pi2 pi2Var) {
        this.f6573a = pi2Var;
    }

    @Override // ai.bx2
    @NullableDecl
    public final /* bridge */ /* synthetic */ oi2 apply(@NullableDecl zzeap zzeapVar) {
        un2 e10;
        oi2 oi2Var;
        uj0.d("", zzeapVar);
        yg.p1.k("Failed to get a cache key, reverting to legacy flow.");
        pi2 pi2Var = this.f6573a;
        e10 = pi2Var.e();
        pi2Var.f8439d = new oi2(null, e10, null);
        oi2Var = this.f6573a.f8439d;
        return oi2Var;
    }
}
