package pd;

import com.dena.mirrorman.net.api.response.SeasonYellYelledUsersResponse;

/* loaded from: classes2.dex */
public final class c0 extends e0 {

    /* renamed from: a  reason: collision with root package name */
    public final jf.x f46679a;

    /* renamed from: b  reason: collision with root package name */
    public final SeasonYellYelledUsersResponse f46680b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(jf.x xVar, SeasonYellYelledUsersResponse seasonYellYelledUsersResponse) {
        super(null);
        jo.p.h(xVar, "rankingType");
        jo.p.h(seasonYellYelledUsersResponse, "response");
        this.f46679a = xVar;
        this.f46680b = seasonYellYelledUsersResponse;
    }

    public jf.x a() {
        return this.f46679a;
    }

    public final SeasonYellYelledUsersResponse b() {
        return this.f46680b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return a() == c0Var.a() && jo.p.c(this.f46680b, c0Var.f46680b);
        }
        return false;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + this.f46680b.hashCode();
    }

    public String toString() {
        return "LoadFinish(rankingType=" + a() + ", response=" + this.f46680b + ')';
    }
}
