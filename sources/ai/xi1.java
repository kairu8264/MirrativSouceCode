package ai;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class xi1 implements bx2<s34, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ double f11961a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f11962b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ yi1 f11963c;

    public xi1(yi1 yi1Var, double d10, boolean z10) {
        this.f11963c = yi1Var;
        this.f11961a = d10;
        this.f11962b = z10;
    }

    @Override // ai.bx2
    public final /* bridge */ /* synthetic */ Bitmap apply(s34 s34Var) {
        return yi1.b(this.f11963c, s34Var.f9705b, this.f11961a, this.f11962b);
    }
}
