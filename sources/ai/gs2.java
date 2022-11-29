package ai;

import android.view.View;

/* loaded from: classes3.dex */
public final class gs2 {

    /* renamed from: a  reason: collision with root package name */
    public final ot2 f4559a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4560b;

    /* renamed from: c  reason: collision with root package name */
    public final ur2 f4561c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4562d = "Ad overlay";

    public gs2(View view, ur2 ur2Var, String str) {
        this.f4559a = new ot2(view);
        this.f4560b = view.getClass().getCanonicalName();
        this.f4561c = ur2Var;
    }

    public final ot2 a() {
        return this.f4559a;
    }

    public final String b() {
        return this.f4560b;
    }

    public final ur2 c() {
        return this.f4561c;
    }

    public final String d() {
        return this.f4562d;
    }
}
