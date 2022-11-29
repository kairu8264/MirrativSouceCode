package ai;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class zt2 extends wt2 {

    /* renamed from: a  reason: collision with root package name */
    public String f13167a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f13168b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f13169c;

    @Override // ai.wt2
    public final wt2 a(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.f13167a = str;
        return this;
    }

    @Override // ai.wt2
    public final wt2 b(boolean z10) {
        this.f13168b = Boolean.valueOf(z10);
        return this;
    }

    @Override // ai.wt2
    public final wt2 c(boolean z10) {
        this.f13169c = Boolean.TRUE;
        return this;
    }

    @Override // ai.wt2
    public final xt2 d() {
        Boolean bool;
        String str = this.f13167a;
        if (str != null && (bool = this.f13168b) != null && this.f13169c != null) {
            return new bu2(str, bool.booleanValue(), this.f13169c.booleanValue(), null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f13167a == null) {
            sb2.append(" clientVersion");
        }
        if (this.f13168b == null) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if (this.f13169c == null) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
