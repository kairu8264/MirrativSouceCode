package b3;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final ActivityOptions f16772a;

        public a(ActivityOptions activityOptions) {
            this.f16772a = activityOptions;
        }

        @Override // b3.b
        public Bundle b() {
            return this.f16772a.toBundle();
        }
    }

    public static b a(Activity activity, n3.d<View, String>... dVarArr) {
        if (Build.VERSION.SDK_INT >= 21) {
            Pair[] pairArr = null;
            if (dVarArr != null) {
                pairArr = new Pair[dVarArr.length];
                for (int i10 = 0; i10 < dVarArr.length; i10++) {
                    pairArr[i10] = Pair.create(dVarArr[i10].f41559a, dVarArr[i10].f41560b);
                }
            }
            return new a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
        }
        return new b();
    }

    public Bundle b() {
        return null;
    }
}
