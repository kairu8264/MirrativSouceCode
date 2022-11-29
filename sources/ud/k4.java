package ud;

import ud.d4;

/* loaded from: classes2.dex */
public final class k4 implements d4 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f55099j = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f55100a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55101b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55102c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55103d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55104e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55105f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55106g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55107h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55108i;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @Override // ud.d4
    public String a() {
        return this.f55105f;
    }

    @Override // ud.d4
    public String b() {
        return this.f55101b;
    }

    @Override // ud.d4
    public String c() {
        return this.f55104e;
    }

    @Override // ud.d4
    public int d() {
        return this.f55102c;
    }

    @Override // ud.d4
    public String e() {
        return this.f55103d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k4) {
            k4 k4Var = (k4) obj;
            return getType() == k4Var.getType() && jo.p.c(b(), k4Var.b()) && d() == k4Var.d() && jo.p.c(e(), k4Var.e()) && jo.p.c(c(), k4Var.c()) && jo.p.c(a(), k4Var.a()) && jo.p.c(h(), k4Var.h()) && jo.p.c(f(), k4Var.f()) && jo.p.c(g(), k4Var.g());
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f55107h;
    }

    @Override // ud.d4
    public String g() {
        return this.f55108i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f55100a;
    }

    @Override // ud.d4
    public String h() {
        return this.f55106g;
    }

    public int hashCode() {
        return (((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    public String toString() {
        return "StreamingLiveCommentCollabMatchingStartBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ')';
    }
}
