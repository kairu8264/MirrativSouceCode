package ud;

import android.content.Context;
import ud.r2;

/* loaded from: classes2.dex */
public final class b3 implements r2 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f54782j = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final r2.a f54783a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54784b;

    /* renamed from: c  reason: collision with root package name */
    public final int f54785c;

    /* renamed from: d  reason: collision with root package name */
    public final String f54786d;

    /* renamed from: e  reason: collision with root package name */
    public final String f54787e;

    /* renamed from: f  reason: collision with root package name */
    public final String f54788f;

    /* renamed from: g  reason: collision with root package name */
    public final String f54789g;

    /* renamed from: h  reason: collision with root package name */
    public final String f54790h;

    /* renamed from: i  reason: collision with root package name */
    public final String f54791i;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b3 a(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            jo.p.h(str2, "userId");
            jo.p.h(str3, "userName");
            jo.p.h(str4, "rewardTitle");
            jo.p.h(str6, "profileImageUrl");
            String string = context.getString(nd.f1.X0, str3, str4);
            jo.p.g(string, "context.getString(R.stri…t, userName, rewardTitle)");
            return new b3(null, str, 0, str2, str3, string, str4, str5, str6, 5, null);
        }
    }

    public b3(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "rewardTitle");
        this.f54783a = aVar;
        this.f54784b = str;
        this.f54785c = i10;
        this.f54786d = str2;
        this.f54787e = str3;
        this.f54788f = str4;
        this.f54789g = str5;
        this.f54790h = str6;
        this.f54791i = str7;
    }

    @Override // ud.r2
    public String a() {
        return this.f54788f;
    }

    public String b() {
        return this.f54784b;
    }

    @Override // ud.r2
    public String c() {
        return this.f54787e;
    }

    @Override // ud.r2
    public int d() {
        return this.f54785c;
    }

    @Override // ud.r2
    public String e() {
        return this.f54786d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b3) {
            b3 b3Var = (b3) obj;
            return getType() == b3Var.getType() && jo.p.c(b(), b3Var.b()) && d() == b3Var.d() && jo.p.c(e(), b3Var.e()) && jo.p.c(c(), b3Var.c()) && jo.p.c(a(), b3Var.a()) && jo.p.c(this.f54789g, b3Var.f54789g) && jo.p.c(this.f54790h, b3Var.f54790h) && jo.p.c(this.f54791i, b3Var.f54791i);
        }
        return false;
    }

    public final String f() {
        return this.f54791i;
    }

    public final String g() {
        return this.f54790h;
    }

    @Override // ud.r2
    public r2.a getType() {
        return this.f54783a;
    }

    public final String h() {
        return this.f54789g;
    }

    public int hashCode() {
        int hashCode = ((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + this.f54789g.hashCode()) * 31;
        String str = this.f54790h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f54791i;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PlayerLiveCommentLuckyPrizeBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", rewardTitle=" + this.f54789g + ", rewardImageUrl=" + this.f54790h + ", profileImageUrl=" + this.f54791i + ')';
    }

    public /* synthetic */ b3(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? r2.a.VIEW_TYPE_LUCKY_PRIZE : aVar, str, (i11 & 4) != 0 ? 113 : i10, str2, str3, str4, str5, str6, str7);
    }
}
