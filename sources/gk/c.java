package gk;

import android.app.PendingIntent;
import com.google.android.play.core.review.ReviewInfo;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class c extends ReviewInfo {

    /* renamed from: w  reason: collision with root package name */
    public final PendingIntent f33637w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f33638x;

    public c(PendingIntent pendingIntent, boolean z10) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.f33637w = pendingIntent;
        this.f33638x = z10;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent a() {
        return this.f33637w;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean b() {
        return this.f33638x;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.f33637w.equals(reviewInfo.a()) && this.f33638x == reviewInfo.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f33637w.hashCode() ^ 1000003) * 1000003) ^ (true != this.f33638x ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f33637w);
        boolean z10 = this.f33638x;
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 40);
        sb2.append("ReviewInfo{pendingIntent=");
        sb2.append(valueOf);
        sb2.append(", isNoOp=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }
}
