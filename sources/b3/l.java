package b3;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import b3.j;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes.dex */
public class l {

    /* renamed from: b  reason: collision with root package name */
    public static Field f16860b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f16861c;

    /* renamed from: a  reason: collision with root package name */
    public static final Object f16859a = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final Object f16862d = new Object();

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            Bundle bundle = list.get(i10);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i10, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle b(j.a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat f10 = aVar.f();
        bundle2.putInt("icon", f10 != null ? f10.h() : 0);
        bundle2.putCharSequence("title", aVar.j());
        bundle2.putParcelable("actionIntent", aVar.a());
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", e(aVar.g()));
        bundle2.putBoolean("showsUserInterface", aVar.i());
        bundle2.putInt("semanticAction", aVar.h());
        return bundle2;
    }

    public static Bundle c(Notification notification) {
        synchronized (f16859a) {
            if (f16861c) {
                return null;
            }
            try {
                if (f16860b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f16861c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f16860b = declaredField;
                }
                Bundle bundle = (Bundle) f16860b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f16860b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e10) {
                Log.e("NotificationCompat", "Unable to access notification extras", e10);
                f16861c = true;
                return null;
            } catch (NoSuchFieldException e11) {
                Log.e("NotificationCompat", "Unable to access notification extras", e11);
                f16861c = true;
                return null;
            }
        }
    }

    public static Bundle d(o oVar) {
        new Bundle();
        throw null;
    }

    public static Bundle[] e(o[] oVarArr) {
        if (oVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[oVarArr.length];
        for (int i10 = 0; i10 < oVarArr.length; i10++) {
            bundleArr[i10] = d(oVarArr[i10]);
        }
        return bundleArr;
    }

    public static Bundle f(Notification.Builder builder, j.a aVar) {
        IconCompat f10 = aVar.f();
        builder.addAction(f10 != null ? f10.h() : 0, aVar.j(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", e(aVar.g()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", e(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }
}
