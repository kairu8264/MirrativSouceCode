package ud;

import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.bcsvr.response.CollabRequest;
import ud.d4;

/* loaded from: classes2.dex */
public final class m4 implements d4 {

    /* renamed from: k  reason: collision with root package name */
    public static final a f55225k = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f55226a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55227b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55228c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55229d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55230e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55231f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55232g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55233h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55234i;

    /* renamed from: j  reason: collision with root package name */
    public final CollabType f55235j;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m4 a(String str, String str2, CollabRequest collabRequest) {
            jo.p.h(str, "liveId");
            jo.p.h(str2, "message");
            jo.p.h(collabRequest, "collabRequest");
            String userId = collabRequest.getUserId();
            String userName = collabRequest.getUserName();
            String profileImageUrl = collabRequest.getProfileImageUrl();
            String badgeImageUrl = collabRequest.getBadgeImageUrl();
            CollabType.Companion companion = CollabType.Companion;
            Integer collabType = collabRequest.getCollabType();
            return new m4(null, str, 0, userId, userName, str2, null, profileImageUrl, badgeImageUrl, companion.fromInt(collabType != null ? collabType.intValue() : CollabType.CALL.getRawValue()), 69, null);
        }
    }

    public m4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, CollabType collabType) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        this.f55226a = aVar;
        this.f55227b = str;
        this.f55228c = i10;
        this.f55229d = str2;
        this.f55230e = str3;
        this.f55231f = str4;
        this.f55232g = str5;
        this.f55233h = str6;
        this.f55234i = str7;
        this.f55235j = collabType;
    }

    @Override // ud.d4
    public String a() {
        return this.f55231f;
    }

    @Override // ud.d4
    public String b() {
        return this.f55227b;
    }

    @Override // ud.d4
    public String c() {
        return this.f55230e;
    }

    @Override // ud.d4
    public int d() {
        return this.f55228c;
    }

    @Override // ud.d4
    public String e() {
        return this.f55229d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m4) {
            m4 m4Var = (m4) obj;
            return getType() == m4Var.getType() && jo.p.c(b(), m4Var.b()) && d() == m4Var.d() && jo.p.c(e(), m4Var.e()) && jo.p.c(c(), m4Var.c()) && jo.p.c(a(), m4Var.a()) && jo.p.c(h(), m4Var.h()) && jo.p.c(f(), m4Var.f()) && jo.p.c(g(), m4Var.g()) && this.f55235j == m4Var.f55235j;
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f55233h;
    }

    @Override // ud.d4
    public String g() {
        return this.f55234i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f55226a;
    }

    @Override // ud.d4
    public String h() {
        return this.f55232g;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode()) * 31;
        CollabType collabType = this.f55235j;
        return hashCode + (collabType == null ? 0 : collabType.hashCode());
    }

    public final CollabType i() {
        return this.f55235j;
    }

    public String toString() {
        return "StreamingLiveCommentCollabRequestBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ", collabType=" + this.f55235j + ')';
    }

    public /* synthetic */ m4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, CollabType collabType, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? d4.a.VIEW_TYPE_COLLAB_REQUEST : aVar, str, (i11 & 4) != 0 ? 10 : i10, (i11 & 8) != 0 ? "" : str2, (i11 & 16) != 0 ? "" : str3, str4, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? "" : str6, (i11 & 256) != 0 ? "" : str7, (i11 & 512) != 0 ? null : collabType);
    }
}
