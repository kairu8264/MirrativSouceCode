package com.dena.mirrorman.net.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import jo.p;

/* loaded from: classes2.dex */
public final class ConnectConfirmResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ConnectConfirmResponse> CREATOR = new Creator();
    private final ConnectClient client;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<ConnectConfirmResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConnectConfirmResponse createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new ConnectConfirmResponse(ConnectClient.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConnectConfirmResponse[] newArray(int i10) {
            return new ConnectConfirmResponse[i10];
        }
    }

    public ConnectConfirmResponse(ConnectClient connectClient) {
        p.h(connectClient, "client");
        this.client = connectClient;
    }

    public static /* synthetic */ ConnectConfirmResponse copy$default(ConnectConfirmResponse connectConfirmResponse, ConnectClient connectClient, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            connectClient = connectConfirmResponse.client;
        }
        return connectConfirmResponse.copy(connectClient);
    }

    public final ConnectClient component1() {
        return this.client;
    }

    public final ConnectConfirmResponse copy(ConnectClient connectClient) {
        p.h(connectClient, "client");
        return new ConnectConfirmResponse(connectClient);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConnectConfirmResponse) && p.c(this.client, ((ConnectConfirmResponse) obj).client);
    }

    public final ConnectClient getClient() {
        return this.client;
    }

    public int hashCode() {
        return this.client.hashCode();
    }

    public String toString() {
        return "ConnectConfirmResponse(client=" + this.client + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        this.client.writeToParcel(parcel, i10);
    }
}
