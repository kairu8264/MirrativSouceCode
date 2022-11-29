package gk;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.review.ReviewInfo;

/* loaded from: classes3.dex */
public final class d implements Parcelable.Creator<ReviewInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReviewInfo createFromParcel(Parcel parcel) {
        return new c((PendingIntent) parcel.readParcelable(ReviewInfo.class.getClassLoader()), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReviewInfo[] newArray(int i10) {
        return new ReviewInfo[i10];
    }
}
