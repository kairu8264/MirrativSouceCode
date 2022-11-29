package sg;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import rg.g;
import rg.k;
import rg.u;
import rg.v;

/* loaded from: classes3.dex */
public final class a extends k {
    @RecentlyNullable
    public g[] getAdSizes() {
        return this.f51371w.g();
    }

    @RecentlyNullable
    public c getAppEventListener() {
        return this.f51371w.i();
    }

    @RecentlyNonNull
    public u getVideoController() {
        return this.f51371w.w();
    }

    @RecentlyNullable
    public v getVideoOptions() {
        return this.f51371w.z();
    }

    public void setAdSizes(@RecentlyNonNull g... gVarArr) {
        if (gVarArr != null && gVarArr.length > 0) {
            this.f51371w.p(gVarArr);
            return;
        }
        throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
    }

    public void setAppEventListener(c cVar) {
        this.f51371w.r(cVar);
    }

    public void setManualImpressionsEnabled(boolean z10) {
        this.f51371w.s(z10);
    }

    public void setVideoOptions(@RecentlyNonNull v vVar) {
        this.f51371w.y(vVar);
    }
}
