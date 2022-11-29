package yh;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public interface a extends IInterface {

    /* renamed from: yh.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractBinderC1060a extends fi.b implements a {
        public AbstractBinderC1060a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a s0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new c(iBinder);
        }
    }
}
