package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import rh.p;

/* loaded from: classes3.dex */
public class AvailabilityException extends Exception {

    /* renamed from: w  reason: collision with root package name */
    public final s.a<ph.b<?>, ConnectionResult> f27171w;

    public AvailabilityException(s.a<ph.b<?>, ConnectionResult> aVar) {
        this.f27171w = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (ph.b<?> bVar : this.f27171w.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) p.i(this.f27171w.get(bVar));
            z10 &= !connectionResult.k0();
            String b10 = bVar.b();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 2 + valueOf.length());
            sb2.append(b10);
            sb2.append(": ");
            sb2.append(valueOf);
            arrayList.add(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        if (z10) {
            sb3.append("None of the queried APIs are available. ");
        } else {
            sb3.append("Some of the queried APIs are unavailable. ");
        }
        sb3.append(TextUtils.join("; ", arrayList));
        return sb3.toString();
    }
}
