package ud;

import android.content.Context;
import ud.d4;

/* loaded from: classes2.dex */
public final class i4 implements d4 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f55022j = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f55023a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55024b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55025c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55026d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55027e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55028f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55029g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55030h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55031i;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i4 a(Context context, String str, String str2, String str3, String str4) {
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            jo.p.h(str2, "userId");
            jo.p.h(str3, "userName");
            jo.p.h(str4, "profileImageUrl");
            int i10 = nd.f1.text_matching_collab_end_comment;
            String string = context.getString(i10, str3);
            jo.p.g(string, "context.getString(R.stri…ab_end_comment, userName)");
            String string2 = context.getString(i10, str3);
            jo.p.g(string2, "context.getString(R.stri…ab_end_comment, userName)");
            return new i4(null, str, 0, str2, str3, string2, string, str4, null, 261, null);
        }
    }

    public i4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        this.f55023a = aVar;
        this.f55024b = str;
        this.f55025c = i10;
        this.f55026d = str2;
        this.f55027e = str3;
        this.f55028f = str4;
        this.f55029g = str5;
        this.f55030h = str6;
        this.f55031i = str7;
    }

    @Override // ud.d4
    public String a() {
        return this.f55028f;
    }

    @Override // ud.d4
    public String b() {
        return this.f55024b;
    }

    @Override // ud.d4
    public String c() {
        return this.f55027e;
    }

    @Override // ud.d4
    public int d() {
        return this.f55025c;
    }

    @Override // ud.d4
    public String e() {
        return this.f55026d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i4) {
            i4 i4Var = (i4) obj;
            return getType() == i4Var.getType() && jo.p.c(b(), i4Var.b()) && d() == i4Var.d() && jo.p.c(e(), i4Var.e()) && jo.p.c(c(), i4Var.c()) && jo.p.c(a(), i4Var.a()) && jo.p.c(h(), i4Var.h()) && jo.p.c(f(), i4Var.f()) && jo.p.c(g(), i4Var.g());
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f55030h;
    }

    @Override // ud.d4
    public String g() {
        return this.f55031i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f55023a;
    }

    @Override // ud.d4
    public String h() {
        return this.f55029g;
    }

    public int hashCode() {
        return (((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    public String toString() {
        return "StreamingLiveCommentCollabEndBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ')';
    }

    public /* synthetic */ i4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? d4.a.VIEW_TYPE_COLLAB_END : aVar, str, (i11 & 4) != 0 ? 88 : i10, str2, str3, str4, str5, str6, (i11 & 256) != 0 ? "" : str7);
    }
}
