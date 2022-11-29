package hc;

import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;

/* loaded from: classes2.dex */
public final class c1 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f35073e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f35074a;

    /* renamed from: b  reason: collision with root package name */
    public final String f35075b;

    /* renamed from: c  reason: collision with root package name */
    public final String f35076c;

    /* renamed from: d  reason: collision with root package name */
    public final int f35077d;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c1 a(UserBasicParams userBasicParams, int i10) {
            jo.p.h(userBasicParams, MRLog.TARGET_TYPE_USER);
            return new c1(userBasicParams.getUserId(), userBasicParams.getProfileImageUrl(), userBasicParams.getName(), i10);
        }
    }

    public c1(String str, String str2, String str3, int i10) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "profileImageUrl");
        jo.p.h(str3, "userName");
        this.f35074a = str;
        this.f35075b = str2;
        this.f35076c = str3;
        this.f35077d = i10;
    }

    public final int a() {
        return this.f35077d;
    }

    public final String b() {
        return this.f35075b;
    }

    public final String c() {
        return this.f35076c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c1) {
            c1 c1Var = (c1) obj;
            return jo.p.c(this.f35074a, c1Var.f35074a) && jo.p.c(this.f35075b, c1Var.f35075b) && jo.p.c(this.f35076c, c1Var.f35076c) && this.f35077d == c1Var.f35077d;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f35074a.hashCode() * 31) + this.f35075b.hashCode()) * 31) + this.f35076c.hashCode()) * 31) + Integer.hashCode(this.f35077d);
    }

    public String toString() {
        return "GroupShotViewerBindModel(userId=" + this.f35074a + ", profileImageUrl=" + this.f35075b + ", userName=" + this.f35076c + ", order=" + this.f35077d + ')';
    }
}
