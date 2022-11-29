package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import qh.b;

@KeepName
/* loaded from: classes3.dex */
public final class DataHolder extends sh.a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new b();
    public static final a G = new com.google.android.gms.common.data.a(new String[0], null);
    public final int A;
    public final Bundle B;
    public int[] C;
    public int D;
    public boolean E = false;
    public boolean F = true;

    /* renamed from: w  reason: collision with root package name */
    public final int f27219w;

    /* renamed from: x  reason: collision with root package name */
    public final String[] f27220x;

    /* renamed from: y  reason: collision with root package name */
    public Bundle f27221y;

    /* renamed from: z  reason: collision with root package name */
    public final CursorWindow[] f27222z;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f27223a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<HashMap<String, Object>> f27224b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public final HashMap<Object, Integer> f27225c = new HashMap<>();
    }

    public DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f27219w = i10;
        this.f27220x = strArr;
        this.f27222z = cursorWindowArr;
        this.A = i11;
        this.B = bundle;
    }

    public int P() {
        return this.A;
    }

    public final void S() {
        this.f27221y = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f27220x;
            if (i11 >= strArr.length) {
                break;
            }
            this.f27221y.putInt(strArr[i11], i11);
            i11++;
        }
        this.C = new int[this.f27222z.length];
        int i12 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f27222z;
            if (i10 >= cursorWindowArr.length) {
                this.D = i12;
                return;
            }
            this.C[i10] = i12;
            i12 += this.f27222z[i10].getNumRows() - (i12 - cursorWindowArr[i10].getStartPosition());
            i10++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.E) {
                this.E = true;
                int i10 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f27222z;
                    if (i10 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i10].close();
                    i10++;
                }
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.F && this.f27222z.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 178);
                sb2.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb2.append(obj);
                sb2.append(")");
                Log.e("DataBuffer", sb2.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.E;
        }
        return z10;
    }

    public Bundle p() {
        return this.B;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.r(parcel, 1, this.f27220x, false);
        sh.b.t(parcel, 2, this.f27222z, i10, false);
        sh.b.k(parcel, 3, P());
        sh.b.e(parcel, 4, p(), false);
        sh.b.k(parcel, 1000, this.f27219w);
        sh.b.b(parcel, a10);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
