package com.dena.mirrorman.net.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class MirroringResponse implements Parcelable {
    @b(BooleanTypeAdapter.class)
    private final boolean enabled;
    private final String reason;
    public static final Parcelable.Creator<MirroringResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<MirroringResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MirroringResponse createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new MirroringResponse(parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MirroringResponse[] newArray(int i10) {
            return new MirroringResponse[i10];
        }
    }

    public MirroringResponse(boolean z10, String str) {
        this.enabled = z10;
        this.reason = str;
    }

    public static /* synthetic */ MirroringResponse copy$default(MirroringResponse mirroringResponse, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = mirroringResponse.enabled;
        }
        if ((i10 & 2) != 0) {
            str = mirroringResponse.reason;
        }
        return mirroringResponse.copy(z10, str);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final String component2() {
        return this.reason;
    }

    public final MirroringResponse copy(boolean z10, String str) {
        return new MirroringResponse(z10, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MirroringResponse) {
            MirroringResponse mirroringResponse = (MirroringResponse) obj;
            return this.enabled == mirroringResponse.enabled && p.c(this.reason, mirroringResponse.reason);
        }
        return false;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getReason() {
        return this.reason;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.enabled;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        String str = this.reason;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "MirroringResponse(enabled=" + this.enabled + ", reason=" + this.reason + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeString(this.reason);
    }
}
