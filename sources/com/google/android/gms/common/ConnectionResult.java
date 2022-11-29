package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import nh.l;
import rh.n;
import sh.a;
import sh.b;

/* loaded from: classes3.dex */
public final class ConnectionResult extends a {
    public static final ConnectionResult A = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new l();
    public static final int SUCCESS = 0;

    /* renamed from: w  reason: collision with root package name */
    public final int f27164w;

    /* renamed from: x  reason: collision with root package name */
    public final int f27165x;

    /* renamed from: y  reason: collision with root package name */
    public final PendingIntent f27166y;

    /* renamed from: z  reason: collision with root package name */
    public final String f27167z;

    public ConnectionResult(int i10) {
        this(i10, null, null);
    }

    public ConnectionResult(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f27164w = i10;
        this.f27165x = i11;
        this.f27166y = pendingIntent;
        this.f27167z = str;
    }

    public static String r0(int i10) {
        if (i10 != 99) {
            if (i10 != 1500) {
                switch (i10) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i10) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                StringBuilder sb2 = new StringBuilder(31);
                                sb2.append("UNKNOWN_ERROR_CODE(");
                                sb2.append(i10);
                                sb2.append(")");
                                return sb2.toString();
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public String P() {
        return this.f27167z;
    }

    public PendingIntent S() {
        return this.f27166y;
    }

    public boolean U() {
        return (this.f27165x == 0 || this.f27166y == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConnectionResult) {
            ConnectionResult connectionResult = (ConnectionResult) obj;
            return this.f27165x == connectionResult.f27165x && n.a(this.f27166y, connectionResult.f27166y) && n.a(this.f27167z, connectionResult.f27167z);
        }
        return false;
    }

    public int hashCode() {
        return n.b(Integer.valueOf(this.f27165x), this.f27166y, this.f27167z);
    }

    public boolean k0() {
        return this.f27165x == 0;
    }

    public int p() {
        return this.f27165x;
    }

    public String toString() {
        n.a c10 = n.c(this);
        c10.a("statusCode", r0(this.f27165x));
        c10.a("resolution", this.f27166y);
        c10.a("message", this.f27167z);
        return c10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.k(parcel, 1, this.f27164w);
        b.k(parcel, 2, p());
        b.p(parcel, 3, S(), i10, false);
        b.q(parcel, 4, P(), false);
        b.b(parcel, a10);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
