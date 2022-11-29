package vf;

import androidx.annotation.RecentlyNonNull;

/* loaded from: classes3.dex */
public enum a {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");
    
    private final String zza;

    a(String str) {
        this.zza = str;
    }

    @Override // java.lang.Enum
    @RecentlyNonNull
    public String toString() {
        return this.zza;
    }
}
