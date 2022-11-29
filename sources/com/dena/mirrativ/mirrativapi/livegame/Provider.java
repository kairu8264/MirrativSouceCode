package com.dena.mirrativ.mirrativapi.livegame;

import android.os.Parcel;
import android.os.Parcelable;
import jo.p;

/* loaded from: classes2.dex */
public final class Provider implements Parcelable {
    public static final Parcelable.Creator<Provider> CREATOR = new Creator();
    private final String email;
    private final String name;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<Provider> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Provider createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new Provider(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Provider[] newArray(int i10) {
            return new Provider[i10];
        }
    }

    public Provider(String str, String str2) {
        p.h(str, "name");
        p.h(str2, "email");
        this.name = str;
        this.email = str2;
    }

    public static /* synthetic */ Provider copy$default(Provider provider, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = provider.name;
        }
        if ((i10 & 2) != 0) {
            str2 = provider.email;
        }
        return provider.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.email;
    }

    public final Provider copy(String str, String str2) {
        p.h(str, "name");
        p.h(str2, "email");
        return new Provider(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Provider) {
            Provider provider = (Provider) obj;
            return p.c(this.name, provider.name) && p.c(this.email, provider.email);
        }
        return false;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.email.hashCode();
    }

    public String toString() {
        return "Provider(name=" + this.name + ", email=" + this.email + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.email);
    }
}
