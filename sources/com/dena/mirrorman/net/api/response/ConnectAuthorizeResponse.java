package com.dena.mirrorman.net.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.core.Status;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class ConnectAuthorizeResponse implements Parcelable {
    private final String accessToken;
    private final String expiresIn;
    private final String idToken;
    private final Status status;
    private final String tokenType;
    private final String uri;
    public static final Parcelable.Creator<ConnectAuthorizeResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<ConnectAuthorizeResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConnectAuthorizeResponse createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new ConnectAuthorizeResponse((Status) parcel.readParcelable(ConnectAuthorizeResponse.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConnectAuthorizeResponse[] newArray(int i10) {
            return new ConnectAuthorizeResponse[i10];
        }
    }

    public ConnectAuthorizeResponse(Status status, String str, String str2, String str3, String str4, String str5) {
        p.h(status, "status");
        p.h(str, "expiresIn");
        p.h(str2, "idToken");
        p.h(str3, "accessToken");
        p.h(str4, "tokenType");
        p.h(str5, "uri");
        this.status = status;
        this.expiresIn = str;
        this.idToken = str2;
        this.accessToken = str3;
        this.tokenType = str4;
        this.uri = str5;
    }

    public static /* synthetic */ ConnectAuthorizeResponse copy$default(ConnectAuthorizeResponse connectAuthorizeResponse, Status status, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = connectAuthorizeResponse.status;
        }
        if ((i10 & 2) != 0) {
            str = connectAuthorizeResponse.expiresIn;
        }
        String str6 = str;
        if ((i10 & 4) != 0) {
            str2 = connectAuthorizeResponse.idToken;
        }
        String str7 = str2;
        if ((i10 & 8) != 0) {
            str3 = connectAuthorizeResponse.accessToken;
        }
        String str8 = str3;
        if ((i10 & 16) != 0) {
            str4 = connectAuthorizeResponse.tokenType;
        }
        String str9 = str4;
        if ((i10 & 32) != 0) {
            str5 = connectAuthorizeResponse.uri;
        }
        return connectAuthorizeResponse.copy(status, str6, str7, str8, str9, str5);
    }

    public final Status component1() {
        return this.status;
    }

    public final String component2() {
        return this.expiresIn;
    }

    public final String component3() {
        return this.idToken;
    }

    public final String component4() {
        return this.accessToken;
    }

    public final String component5() {
        return this.tokenType;
    }

    public final String component6() {
        return this.uri;
    }

    public final ConnectAuthorizeResponse copy(Status status, String str, String str2, String str3, String str4, String str5) {
        p.h(status, "status");
        p.h(str, "expiresIn");
        p.h(str2, "idToken");
        p.h(str3, "accessToken");
        p.h(str4, "tokenType");
        p.h(str5, "uri");
        return new ConnectAuthorizeResponse(status, str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectAuthorizeResponse) {
            ConnectAuthorizeResponse connectAuthorizeResponse = (ConnectAuthorizeResponse) obj;
            return p.c(this.status, connectAuthorizeResponse.status) && p.c(this.expiresIn, connectAuthorizeResponse.expiresIn) && p.c(this.idToken, connectAuthorizeResponse.idToken) && p.c(this.accessToken, connectAuthorizeResponse.accessToken) && p.c(this.tokenType, connectAuthorizeResponse.tokenType) && p.c(this.uri, connectAuthorizeResponse.uri);
        }
        return false;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getExpiresIn() {
        return this.expiresIn;
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((((((((this.status.hashCode() * 31) + this.expiresIn.hashCode()) * 31) + this.idToken.hashCode()) * 31) + this.accessToken.hashCode()) * 31) + this.tokenType.hashCode()) * 31) + this.uri.hashCode();
    }

    public String toString() {
        return "ConnectAuthorizeResponse(status=" + this.status + ", expiresIn=" + this.expiresIn + ", idToken=" + this.idToken + ", accessToken=" + this.accessToken + ", tokenType=" + this.tokenType + ", uri=" + this.uri + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeParcelable(this.status, i10);
        parcel.writeString(this.expiresIn);
        parcel.writeString(this.idToken);
        parcel.writeString(this.accessToken);
        parcel.writeString(this.tokenType);
        parcel.writeString(this.uri);
    }

    public /* synthetic */ ConnectAuthorizeResponse(Status status, String str, String str2, String str3, String str4, String str5, int i10, h hVar) {
        this(status, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? "" : str4, (i10 & 32) == 0 ? str5 : "");
    }
}
