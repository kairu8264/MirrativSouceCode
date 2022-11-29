package ud;

import android.content.Context;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.AppCampaign;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import ud.a;

/* loaded from: classes2.dex */
public final class f implements ud.a {
    public static final a I = new a(null);
    public static final int J = 8;
    public final androidx.lifecycle.e0<Boolean> A;
    public final androidx.lifecycle.e0<String> B;
    public final androidx.lifecycle.e0<Integer> C;
    public final androidx.lifecycle.e0<String> D;
    public final boolean E;
    public final a.EnumC0862a F;
    public final androidx.lifecycle.c0<Boolean> G;
    public final androidx.lifecycle.c0<Boolean> H;

    /* renamed from: w  reason: collision with root package name */
    public final String f54904w;

    /* renamed from: x  reason: collision with root package name */
    public final String f54905x;

    /* renamed from: y  reason: collision with root package name */
    public final String f54906y;

    /* renamed from: z  reason: collision with root package name */
    public final String f54907z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f c(Context context, App.AppParams appParams, String str, AppCampaign appCampaign) {
            jo.p.h(context, "context");
            jo.p.h(appParams, "app");
            String appId = appParams.getAppId();
            String iconUrl = appParams.getIconUrl();
            String title = appParams.getTitle();
            String appUserIdLabel = appParams.getAppUserIdLabel();
            androidx.lifecycle.e0 e0Var = new androidx.lifecycle.e0(Boolean.valueOf(jo.p.c(appParams.getAppId(), str)));
            androidx.lifecycle.e0 e0Var2 = new androidx.lifecycle.e0(d(context, appParams.getAppUserIdLabel(), appParams.getAppUserDetail()));
            AppUserDetailResponse appUserDetail = appParams.getAppUserDetail();
            return new f(appId, iconUrl, title, appUserIdLabel, e0Var, e0Var2, new androidx.lifecycle.e0(Integer.valueOf(e(context, appUserDetail != null && appUserDetail.isPublishedUserId()))), new androidx.lifecycle.e0(f(context, appParams.getAppUserDetail())), appCampaign != null, null, 512, null);
        }

        public final String d(Context context, String str, AppUserDetailResponse appUserDetailResponse) {
            if (appUserDetailResponse == null) {
                return "";
            }
            if (appUserDetailResponse.isPublishedUserId()) {
                if (appUserDetailResponse.getUserId().length() > 0) {
                    return context.getResources().getString(nd.f1.text_broadcast_game_id_v2, str) + appUserDetailResponse.getUserId();
                }
            }
            if (appUserDetailResponse.isPublishedUserId()) {
                return "";
            }
            if (appUserDetailResponse.getUserId().length() > 0) {
                return context.getResources().getString(nd.f1.text_broadcast_game_id_v2, str) + context.getResources().getString(nd.f1.text_archive_hidden);
            }
            return "";
        }

        public final int e(Context context, boolean z10) {
            if (z10) {
                return c3.a.d(context, nd.w0.f42242u0);
            }
            return c3.a.d(context, nd.w0.S0);
        }

        public final String f(Context context, AppUserDetailResponse appUserDetailResponse) {
            if (appUserDetailResponse != null && appUserDetailResponse.isPublishedUserId()) {
                if (!(appUserDetailResponse.getName().length() == 0)) {
                    return context.getResources().getString(nd.f1.text_user_name) + appUserDetailResponse.getName();
                }
            }
            return "";
        }
    }

    public f(String str, String str2, String str3, String str4, androidx.lifecycle.e0<Boolean> e0Var, androidx.lifecycle.e0<String> e0Var2, androidx.lifecycle.e0<Integer> e0Var3, androidx.lifecycle.e0<String> e0Var4, boolean z10, a.EnumC0862a enumC0862a) {
        jo.p.h(str, "appId");
        jo.p.h(str2, "imageUrl");
        jo.p.h(str3, "appTitle");
        jo.p.h(str4, "appUserIdLabel");
        jo.p.h(e0Var, "isSelected");
        jo.p.h(e0Var2, "gameIdText");
        jo.p.h(e0Var3, "gameIdTextColor");
        jo.p.h(e0Var4, "gameNameText");
        jo.p.h(enumC0862a, "type");
        this.f54904w = str;
        this.f54905x = str2;
        this.f54906y = str3;
        this.f54907z = str4;
        this.A = e0Var;
        this.B = e0Var2;
        this.C = e0Var3;
        this.D = e0Var4;
        this.E = z10;
        this.F = enumC0862a;
        final androidx.lifecycle.c0<Boolean> c0Var = new androidx.lifecycle.c0<>();
        c0Var.q(e0Var2, new androidx.lifecycle.f0() { // from class: ud.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                f.l(androidx.lifecycle.c0.this, (String) obj);
            }
        });
        this.G = c0Var;
        final androidx.lifecycle.c0<Boolean> c0Var2 = new androidx.lifecycle.c0<>();
        c0Var2.q(e0Var4, new androidx.lifecycle.f0() { // from class: ud.d
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                f.n(androidx.lifecycle.c0.this, (String) obj);
            }
        });
        this.H = c0Var2;
    }

    public static final void l(androidx.lifecycle.c0 c0Var, String str) {
        jo.p.h(c0Var, "$this_apply");
        jo.p.g(str, "it");
        c0Var.p(Boolean.valueOf(str.length() > 0));
    }

    public static final void n(androidx.lifecycle.c0 c0Var, String str) {
        jo.p.h(c0Var, "$this_apply");
        jo.p.g(str, "it");
        c0Var.p(Boolean.valueOf(str.length() > 0));
    }

    public final String c() {
        return this.f54904w;
    }

    public final String d() {
        return this.f54906y;
    }

    public final androidx.lifecycle.e0<String> e() {
        return this.B;
    }

    public final androidx.lifecycle.e0<Integer> f() {
        return this.C;
    }

    public final androidx.lifecycle.e0<String> g() {
        return this.D;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.F;
    }

    public final String h() {
        return this.f54905x;
    }

    public final androidx.lifecycle.e0<Boolean> i() {
        return this.A;
    }

    public final boolean j() {
        return this.E;
    }

    public final androidx.lifecycle.c0<Boolean> k() {
        return this.G;
    }

    public final androidx.lifecycle.c0<Boolean> m() {
        return this.H;
    }

    public final void o(Context context, AppUserDetailResponse appUserDetailResponse) {
        jo.p.h(context, "context");
        jo.p.h(appUserDetailResponse, "appUserDetail");
        androidx.lifecycle.e0<String> e0Var = this.B;
        a aVar = I;
        e0Var.p(aVar.d(context, this.f54907z, appUserDetailResponse));
        this.C.p(Integer.valueOf(aVar.e(context, appUserDetailResponse.isPublishedUserId())));
    }

    public /* synthetic */ f(String str, String str2, String str3, String str4, androidx.lifecycle.e0 e0Var, androidx.lifecycle.e0 e0Var2, androidx.lifecycle.e0 e0Var3, androidx.lifecycle.e0 e0Var4, boolean z10, a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this(str, str2, str3, str4, e0Var, e0Var2, e0Var3, e0Var4, z10, (i10 & 512) != 0 ? a.EnumC0862a.APP_SETTING : enumC0862a);
    }
}
