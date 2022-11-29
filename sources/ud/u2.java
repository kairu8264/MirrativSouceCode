package ud;

import android.content.Context;
import ud.r2;

/* loaded from: classes2.dex */
public final class u2 implements r2 {

    /* renamed from: g  reason: collision with root package name */
    public static final a f55565g = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final r2.a f55566a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55567b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55568c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55569d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55570e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55571f;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u2 a(Context context, String str, String str2) {
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            jo.p.h(str2, "message");
            String string = context.getString(nd.f1.text_bot_name);
            jo.p.g(string, "context.getString(R.string.text_bot_name)");
            return new u2(null, str, 0, null, string, str2, 13, null);
        }
    }

    public u2(r2.a aVar, String str, int i10, String str2, String str3, String str4) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        this.f55566a = aVar;
        this.f55567b = str;
        this.f55568c = i10;
        this.f55569d = str2;
        this.f55570e = str3;
        this.f55571f = str4;
    }

    @Override // ud.r2
    public String a() {
        return this.f55571f;
    }

    public String b() {
        return this.f55567b;
    }

    @Override // ud.r2
    public String c() {
        return this.f55570e;
    }

    @Override // ud.r2
    public int d() {
        return this.f55568c;
    }

    @Override // ud.r2
    public String e() {
        return this.f55569d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u2) {
            u2 u2Var = (u2) obj;
            return getType() == u2Var.getType() && jo.p.c(b(), u2Var.b()) && d() == u2Var.d() && jo.p.c(e(), u2Var.e()) && jo.p.c(c(), u2Var.c()) && jo.p.c(a(), u2Var.a());
        }
        return false;
    }

    @Override // ud.r2
    public r2.a getType() {
        return this.f55566a;
    }

    public int hashCode() {
        return (((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode();
    }

    public String toString() {
        return "PlayerLiveCommentBotCommentBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ')';
    }

    public /* synthetic */ u2(r2.a aVar, String str, int i10, String str2, String str3, String str4, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? r2.a.VIEW_TYPE_BOT : aVar, str, (i11 & 4) != 0 ? -105 : i10, (i11 & 8) != 0 ? "" : str2, str3, str4);
    }
}
