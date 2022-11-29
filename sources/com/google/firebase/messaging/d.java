package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.a;
import em.j0;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d extends sh.a {
    public static final Parcelable.Creator<d> CREATOR = new j0();

    /* renamed from: w  reason: collision with root package name */
    public Bundle f28001w;

    /* renamed from: x  reason: collision with root package name */
    public Map<String, String> f28002x;

    public d(Bundle bundle) {
        this.f28001w = bundle;
    }

    public String P() {
        return this.f28001w.getString("from");
    }

    public Map<String, String> p() {
        if (this.f28002x == null) {
            this.f28002x = a.C0253a.a(this.f28001w);
        }
        return this.f28002x;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        j0.c(this, parcel, i10);
    }
}
