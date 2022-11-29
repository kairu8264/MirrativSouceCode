package com.dena.mirrorman.webrtc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import jo.h;
import jo.i0;
import jo.p;

/* loaded from: classes3.dex */
public final class TurnServer implements Parcelable {
    private final String host;
    private String pass;
    private final int port;
    private String transport;
    private String user;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    /* loaded from: classes3.dex */
    public static final class CREATOR implements Parcelable.Creator<TurnServer> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(h hVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TurnServer createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new TurnServer(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TurnServer[] newArray(int i10) {
            return new TurnServer[i10];
        }
    }

    public TurnServer(String str, int i10, String str2, String str3, String str4) {
        this.host = str;
        this.port = i10;
        this.transport = str2;
        this.user = str3;
        this.pass = str4;
    }

    private final String component1() {
        return this.host;
    }

    private final int component2() {
        return this.port;
    }

    public static /* synthetic */ TurnServer copy$default(TurnServer turnServer, String str, int i10, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = turnServer.host;
        }
        if ((i11 & 2) != 0) {
            i10 = turnServer.port;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str2 = turnServer.transport;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            str3 = turnServer.user;
        }
        String str6 = str3;
        if ((i11 & 16) != 0) {
            str4 = turnServer.pass;
        }
        return turnServer.copy(str, i12, str5, str6, str4);
    }

    public final String component3() {
        return this.transport;
    }

    public final String component4() {
        return this.user;
    }

    public final String component5() {
        return this.pass;
    }

    public final TurnServer copy(String str, int i10, String str2, String str3, String str4) {
        return new TurnServer(str, i10, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TurnServer) {
            TurnServer turnServer = (TurnServer) obj;
            return p.c(this.host, turnServer.host) && this.port == turnServer.port && p.c(this.transport, turnServer.transport) && p.c(this.user, turnServer.user) && p.c(this.pass, turnServer.pass);
        }
        return false;
    }

    public final String getPass() {
        return this.pass;
    }

    public final String getTransport() {
        return this.transport;
    }

    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        String str = this.host;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.port)) * 31;
        String str2 = this.transport;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.user;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pass;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setPass(String str) {
        this.pass = str;
    }

    public final void setTransport(String str) {
        this.transport = str;
    }

    public final void setUser(String str) {
        this.user = str;
    }

    public String toString() {
        return "TurnServer(host=" + this.host + ", port=" + this.port + ", transport=" + this.transport + ", user=" + this.user + ", pass=" + this.pass + ')';
    }

    public final String uriString() {
        String str = this.transport;
        if (str == null) {
            str = "";
        }
        i0 i0Var = i0.f38149a;
        String format = String.format("turn:%s:%d?transport=%s", Arrays.copyOf(new Object[]{this.host, Integer.valueOf(this.port), str}, 3));
        p.g(format, "format(format, *args)");
        return format;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "dest");
        parcel.writeString(this.host);
        parcel.writeInt(this.port);
        parcel.writeString(this.transport);
        parcel.writeString(this.user);
        parcel.writeString(this.pass);
    }

    public /* synthetic */ TurnServer(String str, int i10, String str2, String str3, String str4, int i11, h hVar) {
        this(str, i10, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TurnServer(Parcel parcel) {
        this(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        p.h(parcel, "parcel");
    }
}
