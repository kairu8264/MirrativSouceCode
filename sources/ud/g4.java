package ud;

import android.content.Context;
import ud.d4;

/* loaded from: classes2.dex */
public final class g4 implements d4 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f54968j = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f54969a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54970b;

    /* renamed from: c  reason: collision with root package name */
    public final int f54971c;

    /* renamed from: d  reason: collision with root package name */
    public final String f54972d;

    /* renamed from: e  reason: collision with root package name */
    public final String f54973e;

    /* renamed from: f  reason: collision with root package name */
    public final String f54974f;

    /* renamed from: g  reason: collision with root package name */
    public final String f54975g;

    /* renamed from: h  reason: collision with root package name */
    public final String f54976h;

    /* renamed from: i  reason: collision with root package name */
    public final String f54977i;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ g4 b(a aVar, Context context, String str, String str2, int i10, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                i10 = -105;
            }
            return aVar.a(context, str, str2, i10);
        }

        public final g4 a(Context context, String str, String str2, int i10) {
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            jo.p.h(str2, "message");
            String string = context.getString(nd.f1.text_bot_name);
            jo.p.g(string, "getString(R.string.text_bot_name)");
            return new g4(null, str, i10, null, string, str2, null, null, null, 457, null);
        }
    }

    public g4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        this.f54969a = aVar;
        this.f54970b = str;
        this.f54971c = i10;
        this.f54972d = str2;
        this.f54973e = str3;
        this.f54974f = str4;
        this.f54975g = str5;
        this.f54976h = str6;
        this.f54977i = str7;
    }

    @Override // ud.d4
    public String a() {
        return this.f54974f;
    }

    @Override // ud.d4
    public String b() {
        return this.f54970b;
    }

    @Override // ud.d4
    public String c() {
        return this.f54973e;
    }

    @Override // ud.d4
    public int d() {
        return this.f54971c;
    }

    @Override // ud.d4
    public String e() {
        return this.f54972d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g4) {
            g4 g4Var = (g4) obj;
            return getType() == g4Var.getType() && jo.p.c(b(), g4Var.b()) && d() == g4Var.d() && jo.p.c(e(), g4Var.e()) && jo.p.c(c(), g4Var.c()) && jo.p.c(a(), g4Var.a()) && jo.p.c(h(), g4Var.h()) && jo.p.c(f(), g4Var.f()) && jo.p.c(g(), g4Var.g());
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f54976h;
    }

    @Override // ud.d4
    public String g() {
        return this.f54977i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f54969a;
    }

    @Override // ud.d4
    public String h() {
        return this.f54975g;
    }

    public int hashCode() {
        return (((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    public String toString() {
        return "StreamingLiveCommentBotCommentBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ')';
    }

    public /* synthetic */ g4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? d4.a.VIEW_TYPE_BOT : aVar, str, i10, (i11 & 8) != 0 ? "" : str2, str3, str4, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? "" : str6, (i11 & 256) != 0 ? "" : str7);
    }
}
