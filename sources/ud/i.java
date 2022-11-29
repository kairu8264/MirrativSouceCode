package ud;

import android.content.res.Resources;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;

/* loaded from: classes2.dex */
public final class i extends androidx.lifecycle.q0 {
    public final androidx.lifecycle.e0<Boolean> D;
    public final androidx.lifecycle.e0<Boolean> E;
    public final androidx.lifecycle.e0<Boolean> F;
    public final androidx.lifecycle.e0<Boolean> G;
    public final androidx.lifecycle.e0<Boolean> H;
    public final androidx.lifecycle.e0<Boolean> I;

    /* renamed from: y  reason: collision with root package name */
    public String f55016y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55017z = new androidx.lifecycle.e0<>("");
    public final androidx.lifecycle.e0<String> A = new androidx.lifecycle.e0<>("");
    public final androidx.lifecycle.e0<String> B = new androidx.lifecycle.e0<>("");
    public final androidx.lifecycle.e0<Float> C = new androidx.lifecycle.e0<>(Float.valueOf(1.0f));

    public i() {
        Boolean bool = Boolean.FALSE;
        this.D = new androidx.lifecycle.e0<>(bool);
        this.E = new androidx.lifecycle.e0<>(bool);
        this.F = new androidx.lifecycle.e0<>(bool);
        this.G = new androidx.lifecycle.e0<>(bool);
        this.H = new androidx.lifecycle.e0<>(bool);
        this.I = new androidx.lifecycle.e0<>(bool);
    }

    public final void f(Resources resources, String str, String str2, boolean z10, boolean z11, AppUserDetailResponse appUserDetailResponse) {
        String string;
        jo.p.h(resources, "resources");
        jo.p.h(str, "appId");
        jo.p.h(str2, "appUserIdLabel");
        this.f55016y = appUserDetailResponse != null ? appUserDetailResponse.getUserId() : null;
        this.f55017z.p(resources.getString(nd.f1.text_broadcast_game_id_settings_is_public_id_v2, str2));
        this.A.p(resources.getString(nd.f1.text_app_user_id_is_not_allowed_sharing, str2));
        androidx.lifecycle.e0<String> e0Var = this.B;
        int i10 = nd.f1.text_broadcast_game_id_settings_is_public_url_generic;
        Object[] objArr = new Object[1];
        if (jo.p.c(str, "jp.colopl.tennis")) {
            string = resources.getString(nd.f1.text_friend_match);
        } else {
            string = resources.getString(nd.f1.text_multiplay);
        }
        objArr[0] = string;
        e0Var.p(resources.getString(i10, objArr));
        this.C.p(Float.valueOf(z11 ? 0.3f : 1.0f));
        this.D.p(Boolean.valueOf(z10));
        this.E.p(Boolean.valueOf(z11));
        this.F.p(appUserDetailResponse != null ? Boolean.valueOf(appUserDetailResponse.getPublishedUrlVisibility()) : null);
        this.G.p(appUserDetailResponse != null ? Boolean.valueOf(appUserDetailResponse.isPublishedUserId()) : null);
        this.H.p(appUserDetailResponse != null ? Boolean.valueOf(appUserDetailResponse.isPublishedUrl()) : null);
        this.I.p(Boolean.valueOf(!z11));
    }

    public final androidx.lifecycle.e0<String> g() {
        return this.B;
    }

    public final androidx.lifecycle.e0<Float> h() {
        return this.C;
    }

    public final androidx.lifecycle.e0<String> i() {
        return this.A;
    }

    public final androidx.lifecycle.e0<String> j() {
        return this.f55017z;
    }

    public final androidx.lifecycle.e0<Boolean> k() {
        return this.G;
    }

    public final androidx.lifecycle.e0<Boolean> l() {
        return this.H;
    }

    public final androidx.lifecycle.e0<Boolean> m() {
        return this.I;
    }

    public final androidx.lifecycle.e0<Boolean> n() {
        return this.D;
    }

    public final androidx.lifecycle.e0<Boolean> o() {
        return this.E;
    }

    public final androidx.lifecycle.e0<Boolean> p() {
        return this.F;
    }
}
