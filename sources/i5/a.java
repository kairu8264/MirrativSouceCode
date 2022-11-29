package i5;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;

/* loaded from: classes.dex */
public class a {
    public static <T extends c> T a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static <T extends c> T b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(a.class.getClassLoader());
            return (T) a(bundle2.getParcelable(TopicConstant.EXTEND_LIPMETA_A));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void c(Bundle bundle, String str, c cVar) {
        if (cVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(TopicConstant.EXTEND_LIPMETA_A, d(cVar));
        bundle.putParcelable(str, bundle2);
    }

    public static Parcelable d(c cVar) {
        return new ParcelImpl(cVar);
    }
}
