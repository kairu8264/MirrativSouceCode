package com.dena.mirrorman.net.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class ConnectClient implements Parcelable {
    private final String appIcon;
    private final String name;
    public static final Parcelable.Creator<ConnectClient> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<ConnectClient> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConnectClient createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new ConnectClient(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConnectClient[] newArray(int i10) {
            return new ConnectClient[i10];
        }
    }

    public ConnectClient() {
        this(null, null, 3, null);
    }

    public ConnectClient(String str, String str2) {
        p.h(str, "name");
        p.h(str2, "appIcon");
        this.name = str;
        this.appIcon = str2;
    }

    public static /* synthetic */ ConnectClient copy$default(ConnectClient connectClient, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = connectClient.name;
        }
        if ((i10 & 2) != 0) {
            str2 = connectClient.appIcon;
        }
        return connectClient.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.appIcon;
    }

    public final ConnectClient copy(String str, String str2) {
        p.h(str, "name");
        p.h(str2, "appIcon");
        return new ConnectClient(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectClient) {
            ConnectClient connectClient = (ConnectClient) obj;
            return p.c(this.name, connectClient.name) && p.c(this.appIcon, connectClient.appIcon);
        }
        return false;
    }

    public final String getAppIcon() {
        return this.appIcon;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.appIcon.hashCode();
    }

    public String toString() {
        return "ConnectClient(name=" + this.name + ", appIcon=" + this.appIcon + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.appIcon);
    }

    public /* synthetic */ ConnectClient(String str, String str2, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
