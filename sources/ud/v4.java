package ud;

import com.dena.mirrorman.net.api.response.ShareTwitter;

/* loaded from: classes2.dex */
public final class v4 extends androidx.lifecycle.q0 {

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55625y = new androidx.lifecycle.e0<>(null);

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55626z = new androidx.lifecycle.e0<>(null);
    public final androidx.lifecycle.e0<String> A = new androidx.lifecycle.e0<>(null);
    public final androidx.lifecycle.e0<String> B = new androidx.lifecycle.e0<>(null);
    public final androidx.lifecycle.e0<String> C = new androidx.lifecycle.e0<>(null);
    public final androidx.lifecycle.e0<String> D = new androidx.lifecycle.e0<>(null);
    public final androidx.lifecycle.e0<String> E = new androidx.lifecycle.e0<>(null);

    public final void f(ShareTwitter shareTwitter) {
        jo.p.h(shareTwitter, "twitterResponse");
        this.f55625y.m(String.valueOf(shareTwitter.getMaxlength() - shareTwitter.getText().codePointCount(0, shareTwitter.getText().length())));
        this.f55626z.m(shareTwitter.getText());
        this.A.m(shareTwitter.getPlaceholder());
        this.B.m(shareTwitter.getCard().getTitle());
        this.C.m(shareTwitter.getCard().getDescription());
        this.D.m(shareTwitter.getCard().getImageUrl());
        this.E.m(shareTwitter.getCard().getSite());
    }

    public final androidx.lifecycle.e0<String> g() {
        return this.C;
    }

    public final androidx.lifecycle.e0<String> h() {
        return this.D;
    }

    public final androidx.lifecycle.e0<String> i() {
        return this.B;
    }

    public final androidx.lifecycle.e0<String> j() {
        return this.E;
    }

    public final androidx.lifecycle.e0<String> k() {
        return this.A;
    }

    public final androidx.lifecycle.e0<String> l() {
        return this.f55625y;
    }

    public final androidx.lifecycle.e0<String> m() {
        return this.f55626z;
    }
}
