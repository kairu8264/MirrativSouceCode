package ud;

import android.content.Context;
import ud.r2;

/* loaded from: classes2.dex */
public final class d3 implements r2 {

    /* renamed from: g  reason: collision with root package name */
    public static final a f54864g = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final r2.a f54865a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54866b;

    /* renamed from: c  reason: collision with root package name */
    public final int f54867c;

    /* renamed from: d  reason: collision with root package name */
    public final String f54868d;

    /* renamed from: e  reason: collision with root package name */
    public final String f54869e;

    /* renamed from: f  reason: collision with root package name */
    public final String f54870f;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d3 a(Context context, String str, String str2, String str3) {
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            jo.p.h(str2, "userId");
            jo.p.h(str3, "userName");
            String string = context.getResources().getString(nd.f1.text_share_friend);
            jo.p.g(string, "context.resources.getStr…string.text_share_friend)");
            return new d3(null, str, 0, str2, str3, string, 5, null);
        }
    }

    public d3(r2.a aVar, String str, int i10, String str2, String str3, String str4) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        this.f54865a = aVar;
        this.f54866b = str;
        this.f54867c = i10;
        this.f54868d = str2;
        this.f54869e = str3;
        this.f54870f = str4;
    }

    @Override // ud.r2
    public String a() {
        return this.f54870f;
    }

    public String b() {
        return this.f54866b;
    }

    @Override // ud.r2
    public String c() {
        return this.f54869e;
    }

    @Override // ud.r2
    public int d() {
        return this.f54867c;
    }

    @Override // ud.r2
    public String e() {
        return this.f54868d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d3) {
            d3 d3Var = (d3) obj;
            return getType() == d3Var.getType() && jo.p.c(b(), d3Var.b()) && d() == d3Var.d() && jo.p.c(e(), d3Var.e()) && jo.p.c(c(), d3Var.c()) && jo.p.c(a(), d3Var.a());
        }
        return false;
    }

    @Override // ud.r2
    public r2.a getType() {
        return this.f54865a;
    }

    public int hashCode() {
        return (((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode();
    }

    public String toString() {
        return "PlayerLiveCommentShareUrlRequestBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ')';
    }

    public /* synthetic */ d3(r2.a aVar, String str, int i10, String str2, String str3, String str4, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? r2.a.VIEW_TYPE_SHARE_URL_REQUEST : aVar, str, (i11 & 4) != 0 ? -100 : i10, str2, str3, str4);
    }
}
