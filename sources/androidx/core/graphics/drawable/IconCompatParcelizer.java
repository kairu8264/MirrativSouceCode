package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f14964a = versionedParcel.p(iconCompat.f14964a, 1);
        iconCompat.f14966c = versionedParcel.j(iconCompat.f14966c, 2);
        iconCompat.f14967d = versionedParcel.r(iconCompat.f14967d, 3);
        iconCompat.f14968e = versionedParcel.p(iconCompat.f14968e, 4);
        iconCompat.f14969f = versionedParcel.p(iconCompat.f14969f, 5);
        iconCompat.f14970g = (ColorStateList) versionedParcel.r(iconCompat.f14970g, 6);
        iconCompat.f14972i = versionedParcel.t(iconCompat.f14972i, 7);
        iconCompat.f14973j = versionedParcel.t(iconCompat.f14973j, 8);
        iconCompat.t();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.u(versionedParcel.f());
        int i10 = iconCompat.f14964a;
        if (-1 != i10) {
            versionedParcel.F(i10, 1);
        }
        byte[] bArr = iconCompat.f14966c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f14967d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i11 = iconCompat.f14968e;
        if (i11 != 0) {
            versionedParcel.F(i11, 4);
        }
        int i12 = iconCompat.f14969f;
        if (i12 != 0) {
            versionedParcel.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f14970g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f14972i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
        String str2 = iconCompat.f14973j;
        if (str2 != null) {
            versionedParcel.J(str2, 8);
        }
    }
}
