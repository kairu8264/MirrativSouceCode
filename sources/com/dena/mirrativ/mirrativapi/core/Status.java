package com.dena.mirrativ.mirrativapi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.Serializable;
import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class Status implements Parcelable, Serializable {
    private final String error;
    private final int errorCode;
    @b(BooleanTypeAdapter.class)

    /* renamed from: ok  reason: collision with root package name */
    private final boolean f21655ok;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Status> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final Status createEmptyStatus() {
            return new Status(true, "", 0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<Status> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Status createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new Status(parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Status[] newArray(int i10) {
            return new Status[i10];
        }
    }

    public Status(boolean z10, String str, int i10) {
        p.h(str, MRLog.PAYLOAD_KEY_ERROR);
        this.f21655ok = z10;
        this.error = str;
        this.errorCode = i10;
    }

    private final boolean component1() {
        return this.f21655ok;
    }

    private final String component2() {
        return this.error;
    }

    private final int component3() {
        return this.errorCode;
    }

    public static /* synthetic */ Status copy$default(Status status, boolean z10, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = status.f21655ok;
        }
        if ((i11 & 2) != 0) {
            str = status.error;
        }
        if ((i11 & 4) != 0) {
            i10 = status.errorCode;
        }
        return status.copy(z10, str, i10);
    }

    public final Status copy(boolean z10, String str, int i10) {
        p.h(str, MRLog.PAYLOAD_KEY_ERROR);
        return new Status(z10, str, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.f21655ok == status.f21655ok && p.c(this.error, status.error) && this.errorCode == status.errorCode;
        }
        return false;
    }

    public final MRError getMirrativError() {
        int i10 = this.errorCode;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 8) {
                    if (i10 != 16) {
                        return new MRError.Failure(this.error);
                    }
                    return new MRError.Blocked(this.error);
                }
                return new MRError.Banned(this.error);
            }
            return MRError.ForceUpdate.INSTANCE;
        }
        return MRError.Maintenance.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.f21655ok;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (((r02 * 31) + this.error.hashCode()) * 31) + Integer.hashCode(this.errorCode);
    }

    public final boolean isSuccess() {
        return this.f21655ok;
    }

    public String toString() {
        return "Status(ok=" + this.f21655ok + ", error=" + this.error + ", errorCode=" + this.errorCode + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.f21655ok ? 1 : 0);
        parcel.writeString(this.error);
        parcel.writeInt(this.errorCode);
    }
}
