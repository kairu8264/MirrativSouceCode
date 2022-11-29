package of;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f45417a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final ArrayList<String> a(Context context, String[] strArr) {
            jo.p.h(context, "context");
            jo.p.h(strArr, "permissionsToCheck");
            ArrayList<String> arrayList = new ArrayList<>();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!c(context, strArr[i10])) {
                    arrayList.add(strArr[i10]);
                }
            }
            return arrayList;
        }

        public final boolean b(int[] iArr) {
            for (int i10 : iArr) {
                if (i10 == -1) {
                    return true;
                }
            }
            return false;
        }

        public final boolean c(Context context, String str) {
            return c3.a.a(context, str) == 0;
        }

        public final boolean d(Context context) {
            jo.p.h(context, "context");
            return c(context, "android.permission.RECORD_AUDIO");
        }

        public final boolean e(Fragment fragment, String[] strArr, int[] iArr) {
            jo.p.h(fragment, "fragment");
            jo.p.h(strArr, "permissions");
            jo.p.h(iArr, "grantResults");
            if (b(iArr)) {
                int length = strArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String str = strArr[i10];
                    if (iArr[i10] == -1 && !fragment.e3(str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
    }
}
