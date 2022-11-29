package pi;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class ea extends sh.a {
    public static final Parcelable.Creator<ea> CREATOR = new fa();
    public final String A;
    public final String B;
    public final Double C;

    /* renamed from: w  reason: collision with root package name */
    public final int f47792w;

    /* renamed from: x  reason: collision with root package name */
    public final String f47793x;

    /* renamed from: y  reason: collision with root package name */
    public final long f47794y;

    /* renamed from: z  reason: collision with root package name */
    public final Long f47795z;

    public ea(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f47792w = i10;
        this.f47793x = str;
        this.f47794y = j10;
        this.f47795z = l10;
        if (i10 == 1) {
            this.C = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.C = d10;
        }
        this.A = str2;
        this.B = str3;
    }

    public final Object p() {
        Long l10 = this.f47795z;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.C;
        if (d10 != null) {
            return d10;
        }
        String str = this.A;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        fa.a(this, parcel, i10);
    }

    public ea(ga gaVar) {
        this(gaVar.f47881c, gaVar.f47882d, gaVar.f47883e, gaVar.f47880b);
    }

    public ea(String str, long j10, Object obj, String str2) {
        rh.p.e(str);
        this.f47792w = 2;
        this.f47793x = str;
        this.f47794y = j10;
        this.B = str2;
        if (obj == null) {
            this.f47795z = null;
            this.C = null;
            this.A = null;
        } else if (obj instanceof Long) {
            this.f47795z = (Long) obj;
            this.C = null;
            this.A = null;
        } else if (obj instanceof String) {
            this.f47795z = null;
            this.C = null;
            this.A = (String) obj;
        } else if (obj instanceof Double) {
            this.f47795z = null;
            this.C = (Double) obj;
            this.A = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
