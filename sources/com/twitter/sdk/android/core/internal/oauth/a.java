package com.twitter.sdk.android.core.internal.oauth;

/* loaded from: classes4.dex */
public class a extends f {
    @ym.c("guest_token")

    /* renamed from: z  reason: collision with root package name */
    private final String f28279z;

    @Override // com.twitter.sdk.android.core.internal.oauth.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            String str = this.f28279z;
            String str2 = ((a) obj).f28279z;
            return str != null ? str.equals(str2) : str2 == null;
        }
        return false;
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.f
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f28279z;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
