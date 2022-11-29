package com.dena.mirrorman.webrtc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import jo.h;
import jo.i0;
import jo.p;

/* loaded from: classes3.dex */
public final class StunServer implements Parcelable {
    public static final int $stable = 0;
    public static final CREATOR CREATOR = new CREATOR(null);
    private final String host;
    private final int port;
    private final String transport;

    /* loaded from: classes3.dex */
    public static final class CREATOR implements Parcelable.Creator<StunServer> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(h hVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StunServer createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new StunServer(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StunServer[] newArray(int i10) {
            return new StunServer[i10];
        }
    }

    public StunServer(String str, int i10, String str2) {
        this.host = str;
        this.port = i10;
        this.transport = str2;
    }

    private final String component1() {
        return this.host;
    }

    private final int component2() {
        return this.port;
    }

    private final String component3() {
        return this.transport;
    }

    public static /* synthetic */ StunServer copy$default(StunServer stunServer, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = stunServer.host;
        }
        if ((i11 & 2) != 0) {
            i10 = stunServer.port;
        }
        if ((i11 & 4) != 0) {
            str2 = stunServer.transport;
        }
        return stunServer.copy(str, i10, str2);
    }

    public final StunServer copy(String str, int i10, String str2) {
        return new StunServer(str, i10, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StunServer) {
            StunServer stunServer = (StunServer) obj;
            return p.c(this.host, stunServer.host) && this.port == stunServer.port && p.c(this.transport, stunServer.transport);
        }
        return false;
    }

    public int hashCode() {
        String str = this.host;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.port)) * 31;
        String str2 = this.transport;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "StunServer(host=" + this.host + ", port=" + this.port + ", transport=" + this.transport + ')';
    }

    public final String uriString() {
        if (this.transport != null) {
            i0 i0Var = i0.f38149a;
            String format = String.format("stun:%s:%d?transport=%s", Arrays.copyOf(new Object[]{this.host, Integer.valueOf(this.port), this.transport}, 3));
            p.g(format, "format(format, *args)");
            return format;
        }
        i0 i0Var2 = i0.f38149a;
        String format2 = String.format("stun:%s:%d", Arrays.copyOf(new Object[]{this.host, Integer.valueOf(this.port)}, 2));
        p.g(format2, "format(format, *args)");
        return format2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "dest");
        parcel.writeString(this.host);
        parcel.writeInt(this.port);
        parcel.writeString(this.transport);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StunServer(Parcel parcel) {
        this(parcel.readString(), parcel.readInt(), parcel.readString());
        p.h(parcel, "parcel");
    }
}
