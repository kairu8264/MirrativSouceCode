package ol;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class j extends sh.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: w  reason: collision with root package name */
    public final Uri f45461w;

    /* renamed from: x  reason: collision with root package name */
    public final Uri f45462x;

    /* renamed from: y  reason: collision with root package name */
    public final List<a> f45463y;

    /* loaded from: classes4.dex */
    public static class a extends sh.a {
        public static final Parcelable.Creator<a> CREATOR = new l();

        /* renamed from: w  reason: collision with root package name */
        public final String f45464w;

        public a(String str) {
            this.f45464w = str;
        }

        public String p() {
            return this.f45464w;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            l.c(this, parcel, i10);
        }
    }

    public j(Uri uri, Uri uri2, List<a> list) {
        this.f45461w = uri;
        this.f45462x = uri2;
        this.f45463y = list == null ? new ArrayList<>() : list;
    }

    public Uri P() {
        return this.f45461w;
    }

    public List<a> S() {
        return this.f45463y;
    }

    public Uri p() {
        return this.f45462x;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        k.c(this, parcel, i10);
    }
}
